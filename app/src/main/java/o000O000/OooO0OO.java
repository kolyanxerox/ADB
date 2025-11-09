package o000O000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOo;
import o000O00.o000O0Oo;
import o000O00.o000OO0O;
import o000O00.o00OO0O0;
import o00O0.OooOo00;
import o00O0.Oooo000;
import o00O0.oo000o;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO00o */
    public static final OooO0OO f30095OooO00o = new OooO0OO();

    /* renamed from: OooO0O0 */
    public static final OooO0OO f30096OooO0O0 = new OooO0OO();

    public static o000OO0O OooO00o(OooO0OO oooO0OO, String processName, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        oooO0OO.getClass();
        OooOo.OooO0o0(processName, "processName");
        o000O0Oo o000o0oo2 = new o000O0Oo();
        o000o0oo2.f29951OooO00o = processName;
        o000o0oo2.f29952OooO0O0 = i;
        byte b = (byte) (o000o0oo2.f29955OooO0o0 | 1);
        o000o0oo2.f29953OooO0OO = i2;
        o000o0oo2.f29954OooO0Oo = false;
        o000o0oo2.f29955OooO0o0 = (byte) (((byte) (b | 2)) | 4);
        return o000o0oo2.OooO00o();
    }

    public static ArrayList OooO0Oo(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        OooOo.OooO0o0(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = oo000o.f31251OooOo0O;
        }
        ArrayList arrayListOooOoO = OooOo00.OooOoO(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        int size = arrayListOooOoO.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListOooOoO.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(Oooo000.OooOo0(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            o000O0Oo o000o0oo2 = new o000O0Oo();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            o000o0oo2.f29951OooO00o = str2;
            o000o0oo2.f29952OooO0O0 = runningAppProcessInfo.pid;
            byte b = (byte) (o000o0oo2.f29955OooO0o0 | 1);
            o000o0oo2.f29953OooO0OO = runningAppProcessInfo.importance;
            o000o0oo2.f29955OooO0o0 = (byte) (b | 2);
            o000o0oo2.f29954OooO0Oo = OooOo.OooO00o(str2, str);
            o000o0oo2.f29955OooO0o0 = (byte) (o000o0oo2.f29955OooO0o0 | 4);
            arrayList2.add(o000o0oo2.OooO00o());
        }
        return arrayList2;
    }

    public static String OooO0o() {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i <= 33) {
            return (i < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        OooOo.OooO0O0(strMyProcessName);
        return strMyProcessName;
    }

    public boolean OooO0O0(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public void OooO0OO(String str) {
        if (OooO0O0(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public o00OO0O0 OooO0o0(Context context) {
        Object obj;
        OooOo.OooO0o0(context, "context");
        int iMyPid = Process.myPid();
        ArrayList arrayListOooO0Oo = OooO0Oo(context);
        int size = arrayListOooO0Oo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListOooO0Oo.get(i);
            i++;
            if (((o000OO0O) ((o00OO0O0) obj)).f29970OooO0O0 == iMyPid) {
                break;
            }
        }
        o00OO0O0 o00oo0o0 = (o00OO0O0) obj;
        return o00oo0o0 == null ? OooO00o(this, OooO0o(), iMyPid, 0, 12) : o00oo0o0;
    }

    public void OooO0oO(String str) {
        if (OooO0O0(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void OooO0oo(Exception exc, String str) {
        if (OooO0O0(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
