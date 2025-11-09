package OoooOoo;

import Oooo000.OooO0OO;
import Oooo000.OooOO0O;
import Oooo000.OooOOO0;
import Oooo00O.OooOOOO;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import o000OO.o0OoOo0;

/* loaded from: classes2.dex */
public final class oOO0O0O extends OooOOOO implements OooO0OO {

    /* renamed from: OoooOoo */
    public final boolean f14943OoooOoo;

    /* renamed from: Ooooo00 */
    public final o0OoOo0 f14944Ooooo00;

    /* renamed from: Ooooo0o */
    public final Bundle f14945Ooooo0o;

    /* renamed from: OooooO0 */
    public final Integer f14946OooooO0;

    public oOO0O0O(Context context, Looper looper, o0OoOo0 o0oooo0, Bundle bundle, OooOO0O oooOO0O, OooOOO0 oooOOO0) {
        super(context, looper, 44, o0oooo0, oooOO0O, oooOOO0);
        this.f14943OoooOoo = true;
        this.f14944Ooooo00 = o0oooo0;
        this.f14945Ooooo0o = bundle;
        this.f14946OooooO0 = (Integer) o0oooo0.f30184OooOo;
    }

    @Override // Oooo00O.OooOO0O
    public final IInterface OooO0O0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof oOO0OO ? (oOO0OO) iInterfaceQueryLocalInterface : new oOO0OO(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // Oooo00O.OooOO0O
    public final Bundle OooO0OO() {
        o0OoOo0 o0oooo0 = this.f14944Ooooo00;
        boolean zEquals = getContext().getPackageName().equals((String) o0oooo0.f30186OooOo0o);
        Bundle bundle = this.f14945Ooooo0o;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) o0oooo0.f30186OooOo0o);
        }
        return bundle;
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // Oooo00O.OooOO0O
    public final String OooO0o0() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // Oooo00O.OooOO0O, Oooo000.OooO0OO
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // Oooo00O.OooOO0O, Oooo000.OooO0OO
    public final boolean requiresSignIn() {
        return this.f14943OoooOoo;
    }
}
