package OooO;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class OooO0o implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: OooOo, reason: collision with root package name */
    public Activity f13252OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Context f13253OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f13254OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public HashMap f13255OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f13256OooOoO0;

    public OooO0o(Context context) {
        this.f13253OooOo0O = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (androidx.core.app.NotificationManagerCompat.from(r6).areNotificationsEnabled() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO00o(int r18) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO.OooO0o.OooO00o(int):int");
    }

    public final boolean OooO0O0() {
        ArrayList arrayListOooOOO = OooO00o.OooO00o.OooOOO(this.f13253OooOo0O, 37);
        boolean z = arrayListOooOOO != null && arrayListOooOOO.contains("android.permission.WRITE_CALENDAR");
        boolean z2 = arrayListOooOOO != null && arrayListOooOOO.contains("android.permission.READ_CALENDAR");
        if (z && z2) {
            return true;
        }
        if (!z) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z2) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void OooO0OO(int i, String str) {
        if (this.f13252OooOo == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f13252OooOo.getPackageName()));
        }
        this.f13252OooOo.startActivityForResult(intent, i);
        this.f13256OooOoO0++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        int i3;
        int iCanScheduleExactAlarms;
        Activity activity = this.f13252OooOo;
        boolean z = false;
        z = false;
        if (activity != null) {
            if (this.f13255OooOoO == null) {
                this.f13256OooOoO0 = 0;
                return false;
            }
            if (i == 209) {
                Context context = this.f13253OooOo0O;
                String packageName = context.getPackageName();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    z = true;
                }
                i3 = 16;
                iCanScheduleExactAlarms = z;
            } else if (i == 210) {
                if (Build.VERSION.SDK_INT >= 30) {
                    i3 = 22;
                    iCanScheduleExactAlarms = Environment.isExternalStorageManager();
                }
            } else if (i == 211) {
                i3 = 23;
                iCanScheduleExactAlarms = Settings.canDrawOverlays(activity);
            } else if (i == 212) {
                if (Build.VERSION.SDK_INT >= 26) {
                    i3 = 24;
                    iCanScheduleExactAlarms = activity.getPackageManager().canRequestPackageInstalls();
                }
            } else if (i == 213) {
                i3 = 27;
                iCanScheduleExactAlarms = ((NotificationManager) activity.getSystemService("notification")).isNotificationPolicyAccessGranted();
            } else if (i == 214) {
                i3 = 34;
                iCanScheduleExactAlarms = Build.VERSION.SDK_INT >= 31 ? ((AlarmManager) activity.getSystemService(NotificationCompat.CATEGORY_ALARM)).canScheduleExactAlarms() : true;
            }
            this.f13255OooOoO.put(Integer.valueOf(i3), Integer.valueOf(iCanScheduleExactAlarms));
            int i4 = this.f13256OooOoO0 - 1;
            this.f13256OooOoO0 = i4;
            OooO00o oooO00o = this.f13254OooOo0o;
            if (oooO00o != null && i4 == 0) {
                oooO00o.f13246OooOo0O.success(this.f13255OooOoO);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onRequestPermissionsResult(int r24, java.lang.String[] r25, int[] r26) {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooO.OooO0o.onRequestPermissionsResult(int, java.lang.String[], int[]):boolean");
    }
}
