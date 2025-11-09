package OooOooo;

import Oooo00O.o000000;
import Oooo00O.o000000O;
import Oooo00O.o000OOo;
import Oooo00O.o0O0O00;
import Oooo0o.OooO0OO;
import Oooo0oO.o0OO00O;
import OoooO0.OooOO0;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes2.dex */
public abstract class o00O00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final o0O0ooO f13681OooO00o = new o0O0ooO(o00oOoo.o000O0o0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o0O0ooO f13682OooO0O0 = new o0O0ooO(o00oOoo.o000O0o0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O0ooO f13683OooO0OO = new o0O0ooO(o00oOoo.o000O0o0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0ooO f13684OooO0Oo = new o0O0ooO(o00oOoo.o000O0o0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);

    /* renamed from: OooO0o, reason: collision with root package name */
    public static final Object f13685OooO0o = new Object();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static volatile o000000 f13686OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public static Context f13687OooO0oO;

    public static oo00o OooO00o(String str, o00O000 o00o000, boolean z, boolean z2) {
        try {
            OooO0O0();
            o000000O.OooO0oo(f13687OooO0oO);
            o00O00OO o00o00oo = new o00O00OO(str, o00o000, z, z2);
            try {
                o000000 o000000Var = f13686OooO0o0;
                OooO0OO oooO0OO = new OooO0OO(f13687OooO0oO.getPackageManager());
                o0O0O00 o0o0o00 = (o0O0O00) o000000Var;
                Parcel parcelO000OO0O = o0o0o00.o000OO0O();
                int i = OooOO0.f13895OooO00o;
                boolean z3 = true;
                parcelO000OO0O.writeInt(1);
                o00o00oo.writeToParcel(parcelO000OO0O, 0);
                OooOO0.OooO0OO(parcelO000OO0O, oooO0OO);
                Parcel parcelOooO = o0o0o00.OooO(parcelO000OO0O, 5);
                if (parcelOooO.readInt() == 0) {
                    z3 = false;
                }
                parcelOooO.recycle();
                return z3 ? oo00o.f13699OooO0Oo : new o00O00o0(new o00O0000(z, str, o00o000));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return new oo00o("module call", false, e);
            }
        } catch (o0OO00O e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            return new oo00o("module init: ".concat(String.valueOf(e2.getMessage())), false, e2);
        }
    }

    public static void OooO0O0() {
        o000000 o0o0o00;
        if (f13686OooO0o0 != null) {
            return;
        }
        o000000O.OooO0oo(f13687OooO0oO);
        synchronized (f13685OooO0o) {
            try {
                if (f13686OooO0o0 == null) {
                    IBinder iBinderOooO0O0 = Oooo0oO.o000000.OooO0OO(f13687OooO0oO, Oooo0oO.o000000.f13871OooO0o0, "com.google.android.gms.googlecertificates").OooO0O0("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = o000OOo.f13820OooOo0o;
                    if (iBinderOooO0O0 == null) {
                        o0o0o00 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderOooO0O0.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        o0o0o00 = iInterfaceQueryLocalInterface instanceof o000000 ? (o000000) iInterfaceQueryLocalInterface : new o0O0O00(iBinderOooO0O0, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 0);
                    }
                    f13686OooO0o0 = o0o0o00;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
