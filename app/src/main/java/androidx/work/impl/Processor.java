package androidx.work.impl;

import OooO0oO.OooOo;
import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import o00000oO.OooOOO;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public class Processor implements ExecutionListener, ForegroundProcessor {
    private static final String FOREGROUND_WAKELOCK_TAG = "ProcessorForegroundLck";
    private static final String TAG = Logger.tagWithPrefix("Processor");
    private Context mAppContext;
    private Configuration mConfiguration;
    private List<Scheduler> mSchedulers;
    private WorkDatabase mWorkDatabase;
    private TaskExecutor mWorkTaskExecutor;
    private Map<String, WorkerWrapper> mEnqueuedWorkMap = new HashMap();
    private Map<String, WorkerWrapper> mForegroundWorkMap = new HashMap();
    private Set<String> mCancelledIds = new HashSet();
    private final List<ExecutionListener> mOuterListeners = new ArrayList();
    private PowerManager.WakeLock mForegroundLock = null;
    private final Object mLock = new Object();

    public static class FutureListener implements Runnable {
        private ExecutionListener mExecutionListener;
        private OooOOO mFuture;
        private String mWorkSpecId;

        public FutureListener(ExecutionListener executionListener, String str, OooOOO oooOOO) {
            this.mExecutionListener = executionListener;
            this.mWorkSpecId = str;
            this.mFuture = oooOOO;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.mFuture.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.mExecutionListener.onExecuted(this.mWorkSpecId, zBooleanValue);
        }
    }

    public Processor(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List<Scheduler> list) {
        this.mAppContext = context;
        this.mConfiguration = configuration;
        this.mWorkTaskExecutor = taskExecutor;
        this.mWorkDatabase = workDatabase;
        this.mSchedulers = list;
    }

    private static boolean interrupt(String str, WorkerWrapper workerWrapper) {
        if (workerWrapper == null) {
            Logger.get().debug(TAG, OooOo.OooOO0("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        workerWrapper.interrupt();
        Logger.get().debug(TAG, OooOo.OooOO0("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    private void stopForegroundService() {
        synchronized (this.mLock) {
            try {
                if (this.mForegroundWorkMap.isEmpty()) {
                    try {
                        this.mAppContext.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.mAppContext));
                    } catch (Throwable th) {
                        Logger.get().error(TAG, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.mForegroundLock;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.mForegroundLock = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.add(executionListener);
        }
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.mLock) {
            try {
                z = (this.mEnqueuedWorkMap.isEmpty() && this.mForegroundWorkMap.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z;
    }

    public boolean isCancelled(String str) {
        boolean zContains;
        synchronized (this.mLock) {
            zContains = this.mCancelledIds.contains(str);
        }
        return zContains;
    }

    public boolean isEnqueued(String str) {
        boolean z;
        synchronized (this.mLock) {
            try {
                z = this.mEnqueuedWorkMap.containsKey(str) || this.mForegroundWorkMap.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public boolean isEnqueuedInForeground(String str) {
        boolean zContainsKey;
        synchronized (this.mLock) {
            zContainsKey = this.mForegroundWorkMap.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void onExecuted(String str, boolean z) {
        synchronized (this.mLock) {
            try {
                this.mEnqueuedWorkMap.remove(str);
                Logger.get().debug(TAG, getClass().getSimpleName() + StringUtils.SPACE + str + " executed; reschedule = " + z, new Throwable[0]);
                Iterator<ExecutionListener> it = this.mOuterListeners.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeExecutionListener(ExecutionListener executionListener) {
        synchronized (this.mLock) {
            this.mOuterListeners.remove(executionListener);
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void startForeground(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.mLock) {
            try {
                Logger.get().info(TAG, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                WorkerWrapper workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
                if (workerWrapperRemove != null) {
                    if (this.mForegroundLock == null) {
                        PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.mAppContext, FOREGROUND_WAKELOCK_TAG);
                        this.mForegroundLock = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                    }
                    this.mForegroundWorkMap.put(str, workerWrapperRemove);
                    ContextCompat.startForegroundService(this.mAppContext, SystemForegroundDispatcher.createStartForegroundIntent(this.mAppContext, str, foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean startWork(String str) {
        return startWork(str, null);
    }

    public boolean stopAndCancelWork(String str) {
        boolean zInterrupt;
        synchronized (this.mLock) {
            try {
                Logger.get().debug(TAG, "Processor cancelling " + str, new Throwable[0]);
                this.mCancelledIds.add(str);
                WorkerWrapper workerWrapperRemove = this.mForegroundWorkMap.remove(str);
                boolean z = workerWrapperRemove != null;
                if (workerWrapperRemove == null) {
                    workerWrapperRemove = this.mEnqueuedWorkMap.remove(str);
                }
                zInterrupt = interrupt(str, workerWrapperRemove);
                if (z) {
                    stopForegroundService();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zInterrupt;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void stopForeground(String str) {
        synchronized (this.mLock) {
            this.mForegroundWorkMap.remove(str);
            stopForegroundService();
        }
    }

    public boolean stopForegroundWork(String str) {
        boolean zInterrupt;
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Processor stopping foreground work " + str, new Throwable[0]);
            zInterrupt = interrupt(str, this.mForegroundWorkMap.remove(str));
        }
        return zInterrupt;
    }

    public boolean stopWork(String str) {
        boolean zInterrupt;
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Processor stopping background work " + str, new Throwable[0]);
            zInterrupt = interrupt(str, this.mEnqueuedWorkMap.remove(str));
        }
        return zInterrupt;
    }

    public boolean startWork(String str, WorkerParameters.RuntimeExtras runtimeExtras) throws Throwable {
        Throwable th;
        synchronized (this.mLock) {
            try {
                try {
                    if (!isEnqueued(str)) {
                        WorkerWrapper workerWrapperBuild = new WorkerWrapper.Builder(this.mAppContext, this.mConfiguration, this.mWorkTaskExecutor, this, this.mWorkDatabase, str).withSchedulers(this.mSchedulers).withRuntimeExtras(runtimeExtras).build();
                        OooOOO future = workerWrapperBuild.getFuture();
                        future.addListener(new FutureListener(this, str, future), this.mWorkTaskExecutor.getMainThreadExecutor());
                        this.mEnqueuedWorkMap.put(str, workerWrapperBuild);
                        this.mWorkTaskExecutor.getBackgroundExecutor().execute(workerWrapperBuild);
                        Logger.get().debug(TAG, OooOo.OooOoo(getClass().getSimpleName(), ": processing ", str), new Throwable[0]);
                        return true;
                    }
                    try {
                        Logger.get().debug(TAG, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }
}
