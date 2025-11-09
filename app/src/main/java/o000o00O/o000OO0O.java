package o000o00o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class o000OO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o000OO0O f30795OooO00o = new o000OO0O();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOO0 f30796OooO0O0;

    static {
        o000OO0o.OooOO0O oooOO0O = new o000OO0o.OooOO0O();
        oooOO0O.OooO00o(o000O0Oo.class, Oooo000.f30723OooO00o);
        oooOO0O.OooO00o(o0O0ooO.class, Oooo0.f30715OooO00o);
        oooOO0O.OooO00o(o00O0O.class, OooOo00.f30711OooO00o);
        oooOO0O.OooO00o(OooOOO0.class, OooOOOO.f30699OooO00o);
        oooOO0O.OooO00o(OooOO0O.class, OooOOO.f30688OooO00o);
        oooOO0O.OooO00o(o0000OO0.class, OooOo.f30706OooO00o);
        oooOO0O.f30227OooO0Oo = true;
        f30796OooO0O0 = new OooOO0(oooOO0O, 26);
    }

    public static OooOOO0 OooO00o(o0000o0.Oooo0 oooo0) throws PackageManager.NameNotFoundException {
        oooo0.OooO00o();
        Context context = oooo0.f29588OooO00o;
        kotlin.jvm.internal.OooOo.OooO0Oo(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        oooo0.OooO00o();
        String str = oooo0.f29590OooO0OO.f29605OooO0O0;
        kotlin.jvm.internal.OooOo.OooO0Oo(str, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.OooOo.OooO0Oo(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.OooOo.OooO0Oo(RELEASE, "RELEASE");
        o0000 o0000Var = o0000.f30735OooOo0o;
        kotlin.jvm.internal.OooOo.OooO0O0(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.OooOo.OooO0Oo(MANUFACTURER, "MANUFACTURER");
        oooo0.OooO00o();
        o0000OO0 o0000oo0OooO0O0 = o00000.OooO0O0(context);
        oooo0.OooO00o();
        return new OooOOO0(str, MODEL, RELEASE, new OooOO0O(packageName, str3, strValueOf, MANUFACTURER, o0000oo0OooO0O0, o00000.OooO00o(context)));
    }
}
