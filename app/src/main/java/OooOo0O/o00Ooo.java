package OoooO0O;

import Oooo.OooOo00;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.android.gms.internal.ads.C1514e0;
import com.google.android.gms.internal.ads.hi0;
import com.google.android.gms.internal.ads.oi0;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import o000000.OooO;
import o000O0Oo.OooO0o;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class o00Ooo {

    /* renamed from: OooO */
    public static o00Ooo f14023OooO;

    /* renamed from: OooO00o */
    public final Object f14024OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f14025OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f14026OooO0OO;

    /* renamed from: OooO0Oo */
    public final Object f14027OooO0Oo;

    /* renamed from: OooO0o */
    public final Object f14028OooO0o;

    /* renamed from: OooO0o0 */
    public final Object f14029OooO0o0;

    /* renamed from: OooO0oO */
    public final Object f14030OooO0oO;

    /* renamed from: OooO0oo */
    public final Object f14031OooO0oo;

    public o00Ooo(Application application) {
        this.f14024OooO00o = this;
        OooOOoo.o0000OO0 o0000oo02 = new OooOOoo.o0000OO0(application, 1);
        this.f14025OooO0O0 = o0000oo02;
        o0O0ooO o0o0oooOooO00o = o0O0ooO.OooO00o(new o0ooOOo(o0000oo02, 1));
        this.f14026OooO0OO = o0o0oooOooO00o;
        o0O0ooO o0o0oooOooO00o2 = o0O0ooO.OooO00o(o000OO.f13970OooO0O0);
        this.f14027OooO0Oo = o0o0oooOooO00o2;
        o0O0ooO o0o0oooOooO00o3 = o0O0ooO.OooO00o(new OooOO0(new OooOO0(this, 4), 7));
        this.f14029OooO0o0 = o0o0oooOooO00o3;
        o00O00o0 o00o00o0 = new o00O00o0(o0000oo02, o0o0oooOooO00o, 1);
        o0O0ooO o0o0oooOooO00o4 = o0O0ooO.OooO00o(new OooO(10));
        this.f14028OooO0o = o0o0oooOooO00o4;
        OooOo00 oooOo00 = new OooOo00(o0000oo02, o0o0oooOooO00o, o0O0ooO.OooO00o(new o00O00o0(o0000oo02, o0O0ooO.OooO00o(new o0ooOOo(o0000oo02, 0)), 0)), 6);
        this.f14031OooO0oo = oooOo00;
        this.f14030OooO0oO = o0O0ooO.OooO00o(new OooOo00(o0o0oooOooO00o, new OooO0o(o0000oo02, o0o0oooOooO00o2, o0o0oooOooO00o, o0o0oooOooO00o3, o00o00o0, new OooOo00(o0o0oooOooO00o4, oooOo00, o0o0oooOooO00o, 5), o0o0oooOooO00o4, 2), o0o0oooOooO00o3, 8));
    }

    public static String OooO00o(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static o00Ooo OooO0O0(Context context) {
        o00Ooo o00ooo2;
        synchronized (o00Ooo.class) {
            try {
                if (f14023OooO == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    f14023OooO = new o00Ooo(application);
                }
                o00ooo2 = f14023OooO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o00ooo2;
    }

    public HashMap OooO0OO() {
        HashMap mapOooO0Oo = OooO0Oo();
        Task task = (Task) ((OooOOo0.o0OOO0o) this.f14025OooO0O0).f13519OooOoO;
        C1514e0 c1514e0 = oi0.f22998OooO00o;
        if (task.isSuccessful()) {
            c1514e0 = (C1514e0) task.getResult();
        }
        mapOooO0Oo.put("gai", Boolean.valueOf(((hi0) this.f14024OooO00o).f19796OooO0O0));
        mapOooO0Oo.put("did", c1514e0.o00oO0O());
        mapOooO0Oo.put("dst", Integer.valueOf(c1514e0.OoooooO() - 1));
        mapOooO0Oo.put("doo", Boolean.valueOf(c1514e0.OooooOo()));
        return mapOooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x013a A[Catch: all -> 0x011a, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x011a, blocks: (B:54:0x0109, B:56:0x010f, B:58:0x0116, B:62:0x011c, B:64:0x0127, B:66:0x012b, B:68:0x0136, B:70:0x013a), top: B:83:0x0109 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.HashMap OooO0Oo() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooO0O.o00Ooo.OooO0Oo():java.util.HashMap");
    }

    public /* synthetic */ o00Ooo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f14024OooO00o = obj;
        this.f14025OooO0O0 = obj2;
        this.f14026OooO0OO = obj3;
        this.f14027OooO0Oo = obj4;
        this.f14029OooO0o0 = obj5;
        this.f14028OooO0o = obj6;
        this.f14030OooO0oO = obj7;
        this.f14031OooO0oo = obj8;
    }
}
