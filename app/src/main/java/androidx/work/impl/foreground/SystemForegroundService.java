package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;

/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    private static final String TAG = Logger.tagWithPrefix("SystemFgService");
    private static SystemForegroundService sForegroundService = null;
    SystemForegroundDispatcher mDispatcher;
    private Handler mHandler;
    private boolean mIsShutdown;
    NotificationManager mNotificationManager;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$1 */
    public class RunnableC08941 implements Runnable {
        final /* synthetic */ Notification val$notification;
        final /* synthetic */ int val$notificationId;
        final /* synthetic */ int val$notificationType;

        public RunnableC08941(int i, Notification notification, int i2) {
            i = i;
            notification = notification;
            i = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(i, notification, i);
            } else {
                SystemForegroundService.this.startForeground(i, notification);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$2 */
    public class RunnableC08952 implements Runnable {
        final /* synthetic */ Notification val$notification;
        final /* synthetic */ int val$notificationId;

        public RunnableC08952(int i, Notification notification) {
            i = i;
            notification = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.mNotificationManager.notify(i, notification);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$3 */
    public class RunnableC08963 implements Runnable {
        final /* synthetic */ int val$notificationId;

        public RunnableC08963(int i) {
            i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.mNotificationManager.cancel(i);
        }
    }

    public static SystemForegroundService getInstance() {
        return sForegroundService;
    }

    private void initializeDispatcher() {
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mNotificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.mDispatcher = systemForegroundDispatcher;
        systemForegroundDispatcher.setCallback(this);
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void cancelNotification(int i) {
        this.mHandler.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.3
            final /* synthetic */ int val$notificationId;

            public RunnableC08963(int i2) {
                i = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.mNotificationManager.cancel(i);
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void notify(int i, Notification notification) {
        this.mHandler.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.2
            final /* synthetic */ Notification val$notification;
            final /* synthetic */ int val$notificationId;

            public RunnableC08952(int i2, Notification notification2) {
                i = i2;
                notification = notification2;
            }

            @Override // java.lang.Runnable
            public void run() {
                SystemForegroundService.this.mNotificationManager.notify(i, notification);
            }
        });
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        sForegroundService = this;
        initializeDispatcher();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mDispatcher.onDestroy();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.mIsShutdown) {
            Logger.get().info(TAG, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.mDispatcher.onDestroy();
            initializeDispatcher();
            this.mIsShutdown = false;
        }
        if (intent == null) {
            return 3;
        }
        this.mDispatcher.onStartCommand(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void startForeground(int i, int i2, Notification notification) {
        this.mHandler.post(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundService.1
            final /* synthetic */ Notification val$notification;
            final /* synthetic */ int val$notificationId;
            final /* synthetic */ int val$notificationType;

            public RunnableC08941(int i3, Notification notification2, int i22) {
                i = i3;
                notification = notification2;
                i = i22;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (Build.VERSION.SDK_INT >= 29) {
                    SystemForegroundService.this.startForeground(i, notification, i);
                } else {
                    SystemForegroundService.this.startForeground(i, notification);
                }
            }
        });
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.Callback
    public void stop() {
        this.mIsShutdown = true;
        Logger.get().debug(TAG, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        sForegroundService = null;
        stopSelf();
    }
}
