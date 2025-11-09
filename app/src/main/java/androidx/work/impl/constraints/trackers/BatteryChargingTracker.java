package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* loaded from: classes.dex */
public class BatteryChargingTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    private static final String TAG = Logger.tagWithPrefix("BatteryChrgTracker");

    public BatteryChargingTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
    }

    private boolean isBatteryChangedIntentCharging(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBroadcastReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            r5 = 0
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L8
            goto L50
        L8:
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.constraints.trackers.BatteryChargingTracker.TAG
            java.lang.String r2 = "Received "
            java.lang.String r2 = r2.concat(r6)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.debug(r1, r2, r3)
            r0 = -1
            int r1 = r6.hashCode()
            switch(r1) {
                case -1886648615: goto L44;
                case -54942926: goto L39;
                case 948344062: goto L2e;
                case 1019184907: goto L23;
                default: goto L21;
            }
        L21:
            r5 = r0
            goto L4d
        L23:
            java.lang.String r5 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L2c
            goto L21
        L2c:
            r5 = 3
            goto L4d
        L2e:
            java.lang.String r5 = "android.os.action.CHARGING"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L37
            goto L21
        L37:
            r5 = 2
            goto L4d
        L39:
            java.lang.String r5 = "android.os.action.DISCHARGING"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L42
            goto L21
        L42:
            r5 = 1
            goto L4d
        L44:
            java.lang.String r1 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L4d
            goto L21
        L4d:
            switch(r5) {
                case 0: goto L63;
                case 1: goto L5d;
                case 2: goto L57;
                case 3: goto L51;
                default: goto L50;
            }
        L50:
            return
        L51:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setState(r5)
            return
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r4.setState(r5)
            return
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.setState(r5)
            return
        L63:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.setState(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.BatteryChargingTracker.onBroadcastReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Boolean getInitialState() {
        Intent intentRegisterReceiver = this.mAppContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(isBatteryChangedIntentCharging(intentRegisterReceiver));
        }
        Logger.get().error(TAG, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
