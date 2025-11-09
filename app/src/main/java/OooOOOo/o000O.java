package OooOooo;

import Oooo0o0.OooOO0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class o000O {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f13661OooO0O0 = false;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f13662OooO0OO = false;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f13664OooO0o0 = 0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicBoolean f13660OooO00o = new AtomicBoolean();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final AtomicBoolean f13663OooO0Oo = new AtomicBoolean();

    public static Context OooO00o(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean OooO0O0(Context context) {
        try {
            if (!f13662OooO0OO) {
                try {
                    PackageInfo packageInfoOooO0OO = OooOO0.OooO00o(context).OooO0OO(64, "com.google.android.gms");
                    o000OO00.OooO00o(context);
                    if (packageInfoOooO0OO == null || o000OO00.OooO0Oo(packageInfoOooO0OO, false) || !o000OO00.OooO0Oo(packageInfoOooO0OO, true)) {
                        f13661OooO0O0 = false;
                    } else {
                        f13661OooO0O0 = true;
                    }
                    f13662OooO0OO = true;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                    f13662OooO0OO = true;
                }
            }
            return f13661OooO0O0 || !"user".equals(Build.TYPE);
        } catch (Throwable th) {
            f13662OooO0OO = true;
            throw th;
        }
    }
}
