package androidx.work.impl.utils;

import android.database.SQLException;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class CancelWorkRunnable implements Runnable {
    private final OperationImpl mOperation = new OperationImpl();

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$1 */
    public class C09241 extends CancelWorkRunnable {
        final /* synthetic */ UUID val$id;

        public C09241(UUID uuid) {
            uuid = uuid;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        public void runInternal() throws SQLException {
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                cancel(workManagerImpl, uuid.toString());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                reschedulePendingWorkers(workManagerImpl);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$2 */
    public class C09252 extends CancelWorkRunnable {
        final /* synthetic */ String val$tag;

        public C09252(String str) {
            str = str;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        public void runInternal() throws SQLException {
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(str).iterator();
                while (it.hasNext()) {
                    cancel(workManagerImpl, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                reschedulePendingWorkers(workManagerImpl);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$3 */
    public class C09263 extends CancelWorkRunnable {
        final /* synthetic */ boolean val$allowReschedule;
        final /* synthetic */ String val$name;

        public C09263(String str, boolean z) {
            str = str;
            z = z;
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        public void runInternal() throws SQLException {
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str).iterator();
                while (it.hasNext()) {
                    cancel(workManagerImpl, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (z) {
                    reschedulePendingWorkers(workManagerImpl);
                }
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.CancelWorkRunnable$4 */
    public class C09274 extends CancelWorkRunnable {
        public C09274() {
        }

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        public void runInternal() throws SQLException {
            WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                while (it.hasNext()) {
                    cancel(workManagerImpl, it.next());
                }
                new PreferenceUtils(workManagerImpl.getWorkDatabase()).setLastCancelAllTimeMillis(System.currentTimeMillis());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public static CancelWorkRunnable forAll(WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.4
            public C09274() {
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            public void runInternal() throws SQLException {
                WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                    while (it.hasNext()) {
                        cancel(workManagerImpl, it.next());
                    }
                    new PreferenceUtils(workManagerImpl.getWorkDatabase()).setLastCancelAllTimeMillis(System.currentTimeMillis());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    public static CancelWorkRunnable forId(UUID uuid, WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.1
            final /* synthetic */ UUID val$id;

            public C09241(UUID uuid2) {
                uuid = uuid2;
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            public void runInternal() throws SQLException {
                WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    cancel(workManagerImpl, uuid.toString());
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(workManagerImpl);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    public static CancelWorkRunnable forName(String str, WorkManagerImpl workManagerImpl, boolean z) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.3
            final /* synthetic */ boolean val$allowReschedule;
            final /* synthetic */ String val$name;

            public C09263(String str2, boolean z2) {
                str = str2;
                z = z2;
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            public void runInternal() throws SQLException {
                WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(str).iterator();
                    while (it.hasNext()) {
                        cancel(workManagerImpl, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    if (z) {
                        reschedulePendingWorkers(workManagerImpl);
                    }
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    public static CancelWorkRunnable forTag(String str, WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.2
            final /* synthetic */ String val$tag;

            public C09252(String str2) {
                str = str2;
            }

            @Override // androidx.work.impl.utils.CancelWorkRunnable
            public void runInternal() throws SQLException {
                WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
                workDatabase.beginTransaction();
                try {
                    Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(str).iterator();
                    while (it.hasNext()) {
                        cancel(workManagerImpl, it.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    reschedulePendingWorkers(workManagerImpl);
                } catch (Throwable th) {
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
    }

    private void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        DependencyDao dependencyDao = workDatabase.dependencyDao();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                workSpecDao.setState(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(dependencyDao.getDependentWorkIds(str2));
        }
    }

    public void cancel(WorkManagerImpl workManagerImpl, String str) {
        iterativelyCancelWorkAndDependents(workManagerImpl.getWorkDatabase(), str);
        workManagerImpl.getProcessor().stopAndCancelWork(str);
        Iterator<Scheduler> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(str);
        }
    }

    public Operation getOperation() {
        return this.mOperation;
    }

    public void reschedulePendingWorkers(WorkManagerImpl workManagerImpl) {
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            runInternal();
            this.mOperation.setState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.setState(new Operation.State.FAILURE(th));
        }
    }

    public abstract void runInternal();
}
