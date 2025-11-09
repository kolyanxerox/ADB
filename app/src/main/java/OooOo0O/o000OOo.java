package OoooO0O;

import OooO0oO.OooOOO0;
import Oooo.OooOo00;
import android.util.Log;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicReference;
import o000OO.o0OoOo0;
import o000Ooo0.OooOO0;

/* loaded from: classes2.dex */
public final class o000OOo {

    /* renamed from: OooO00o */
    public final OooOO0 f13975OooO00o;

    /* renamed from: OooO0O0 */
    public final o000O000 f13976OooO0O0;

    /* renamed from: OooO0OO */
    public final AtomicReference f13977OooO0OO = new AtomicReference();

    /* renamed from: OooO0Oo */
    public final AtomicReference f13978OooO0Oo = new AtomicReference();

    public o000OOo(OooOO0 oooOO0, o000O000 o000o0002) {
        this.f13975OooO00o = oooOO0;
        this.f13976OooO0O0 = o000o0002;
    }

    public final void OooO00o(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        o000O0o.OooO00o();
        o000000 o000000Var = (o000000) this.f13977OooO0OO.get();
        if (o000000Var == null) {
            onConsentFormLoadFailureListener.onConsentFormLoadFailure(new o00O00(3, "No available form can be built.").OooO00o());
            return;
        }
        oo000o oo000oVar = (oo000o) this.f13975OooO00o.zza();
        oo000oVar.getClass();
        o00Ooo o00ooo2 = oo000oVar.f14062OooO00o;
        o0O0ooO o0o0oooOooO00o = o0O0ooO.OooO00o(new o0ooOOo((OooOOoo.o0000OO0) o00ooo2.f14025OooO0O0, 2));
        OooOOoo.o0000OO0 o0000oo02 = new OooOOoo.o0000OO0(o000000Var, 1);
        OooOO0 oooOO0 = new OooOO0(8, false);
        OooOOoo.o0000OO0 o0000oo03 = (OooOOoo.o0000OO0) o00ooo2.f14025OooO0O0;
        o0O0ooO o0o0ooo = (o0O0ooO) o00ooo2.f14028OooO0o;
        OooOo00 oooOo00 = (OooOo00) o00ooo2.f14031OooO0oo;
        o0O0ooO o0o0ooo2 = (o0O0ooO) o00ooo2.f14026OooO0OO;
        o0O0ooO o0o0oooOooO00o2 = o0O0ooO.OooO00o(new o0OoOo0(o0000oo03, (o0O0ooO) o00ooo2.f14027OooO0Oo, o0o0oooOooO00o, o0o0ooo2, o0000oo02, new OooOOO0(o0o0oooOooO00o, false, new o0OoOo0(o0000oo03, o0o0oooOooO00o, o0o0ooo, oooOo00, oooOO0, o0o0ooo2, 3), 13), 2));
        if (((o0O0ooO) oooOO0.f30538OooOo0o) != null) {
            throw new IllegalStateException();
        }
        oooOO0.f30538OooOo0o = o0o0oooOooO00o2;
        ((oo0o0Oo) oooOO0.zza()).OooO00o(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener);
    }

    public final void OooO0O0() {
        o000000 o000000Var = (o000000) this.f13977OooO0OO.get();
        if (o000000Var == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        oo000o oo000oVar = (oo000o) this.f13975OooO00o.zza();
        oo000oVar.getClass();
        o00Ooo o00ooo2 = oo000oVar.f14062OooO00o;
        o0O0ooO o0o0oooOooO00o = o0O0ooO.OooO00o(new o0ooOOo((OooOOoo.o0000OO0) o00ooo2.f14025OooO0O0, 2));
        OooOOoo.o0000OO0 o0000oo02 = new OooOOoo.o0000OO0(o000000Var, 1);
        OooOO0 oooOO0 = new OooOO0(8, false);
        OooOOoo.o0000OO0 o0000oo03 = (OooOOoo.o0000OO0) o00ooo2.f14025OooO0O0;
        o0O0ooO o0o0ooo = (o0O0ooO) o00ooo2.f14028OooO0o;
        OooOo00 oooOo00 = (OooOo00) o00ooo2.f14031OooO0oo;
        o0O0ooO o0o0ooo2 = (o0O0ooO) o00ooo2.f14026OooO0OO;
        o0O0ooO o0o0oooOooO00o2 = o0O0ooO.OooO00o(new o0OoOo0(o0000oo03, (o0O0ooO) o00ooo2.f14027OooO0Oo, o0o0oooOooO00o, o0o0ooo2, o0000oo02, new OooOOO0(o0o0oooOooO00o, false, new o0OoOo0(o0000oo03, o0o0oooOooO00o, o0o0ooo, oooOo00, oooOO0, o0o0ooo2, 3), 13), 2));
        if (((o0O0ooO) oooOO0.f30538OooOo0o) != null) {
            throw new IllegalStateException();
        }
        oooOO0.f30538OooOo0o = o0o0oooOooO00o2;
        oo0o0Oo oo0o0oo = (oo0o0Oo) oooOO0.zza();
        oo0o0oo.OooOO0o = true;
        o000O0o.f13967OooO00o.post(new o00000oO.OooOOO0(2, this, oo0o0oo));
    }
}
