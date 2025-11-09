package o000o00o;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class o00000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final oo0o0Oo f30737OooO00o = new oo0o0Oo(1);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0o0Oo f30738OooO0O0 = new oo0o0Oo(2);

    public static ArrayList OooO00o(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = o00O0.oo000o.f31251OooOo0O;
        }
        ArrayList arrayListOooOoO = o00O0.OooOo00.OooOoO(runningAppProcesses);
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
        ArrayList arrayList2 = new ArrayList(o00O0.Oooo000.OooOo0(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String processName = runningAppProcessInfo.processName;
            kotlin.jvm.internal.OooOo.OooO0Oo(processName, "processName");
            arrayList2.add(new o0000OO0(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.OooOo.OooO00o(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static o0000OO0 OooO0O0(Context context) {
        Object obj;
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        int iMyPid = Process.myPid();
        ArrayList arrayListOooO00o = OooO00o(context);
        int size = arrayListOooO00o.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayListOooO00o.get(i);
            i++;
            if (((o0000OO0) obj).f30763OooO0O0 == iMyPid) {
                break;
            }
        }
        o0000OO0 o0000oo02 = (o0000OO0) obj;
        return o0000oo02 == null ? new o0000OO0(OooO0OO(), iMyPid, 0, false) : o0000oo02;
    }

    public static String OooO0OO() throws Throwable {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            String strMyProcessName = Process.myProcessName();
            kotlin.jvm.internal.OooOo.OooO0Oo(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String strOooO0o = Oooo0OO.o00oO0o.OooO0o();
        return strOooO0o != null ? strOooO0o : "";
    }
}
