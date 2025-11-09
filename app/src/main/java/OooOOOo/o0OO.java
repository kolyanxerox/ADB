package OoooOOO;

import Oooo00O.o000000O;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class o0OO implements Callable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f14476OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14477OooOo0O = 1;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f14478OooOo0o;

    public o0OO(o0OOo000 o0ooo000, oOO0 ooo0) {
        this.f14476OooOo = ooo0;
        Objects.requireNonNull(o0ooo000);
        this.f14478OooOo0o = o0ooo000;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14477OooOo0O) {
            case 0:
                o0OOo000 o0ooo000 = (o0OOo000) this.f14478OooOo0o;
                o0ooo000.f14568OooOo0O.OooOoo0();
                o00OO0OO o00oo0oo = o0ooo000.f14568OooOo0O.f14792OooOo;
                oOO0000.OoooOO0(o00oo0oo);
                return o00oo0oo.OooooOo((String) this.f14476OooOo);
            case 1:
                o0OOo000 o0ooo0002 = (o0OOo000) this.f14478OooOo0o;
                o0ooo0002.f14568OooOo0O.OooOoo0();
                return new oo0oOO0(o0ooo0002.f14568OooOo0O.o00o0O(((oOO0) this.f14476OooOo).zza));
            default:
                oOO0 ooo0 = (oOO0) this.f14476OooOo;
                String str = ooo0.zza;
                o000000O.OooO0oo(str);
                oOO0000 ooo0000 = (oOO0000) this.f14478OooOo0o;
                oO00000o oo00000oOooO0o = ooo0000.OooO0o(str);
                oO00000 oo00000 = oO00000.ANALYTICS_STORAGE;
                if (oo00000oOooO0o.OooO(oo00000) && oO00000o.OooO0OO(100, ooo0.zzs).OooO(oo00000)) {
                    return ooo0000.Ooooo0o(ooo0).OooOooo();
                }
                ooo0000.OooO00o().f14398Oooo0.OooO0O0("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public o0OO(o0OOo000 o0ooo000, String str) {
        this.f14476OooOo = str;
        Objects.requireNonNull(o0ooo000);
        this.f14478OooOo0o = o0ooo000;
    }

    public o0OO(oOO0000 ooo0000, oOO0 ooo0) {
        this.f14476OooOo = ooo0;
        Objects.requireNonNull(ooo0000);
        this.f14478OooOo0o = ooo0000;
    }
}
