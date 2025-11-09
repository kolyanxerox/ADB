package OoooOOO;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.C2177vz;
import com.google.android.gms.internal.ads.d61;
import com.google.android.gms.internal.ads.h61;
import com.google.android.gms.internal.ads.i80;
import com.google.android.gms.internal.ads.kg0;
import com.google.android.gms.internal.ads.ni0;
import com.google.android.gms.internal.ads.o00O0O;
import com.google.android.gms.internal.ads.oOOO00o0;
import com.google.android.gms.internal.ads.qv0;
import com.google.android.gms.internal.ads.sj0;
import com.google.android.gms.internal.ads.t00;
import com.google.android.gms.internal.ads.ug0;
import com.google.android.gms.internal.ads.w41;
import java.util.Objects;
import java.util.Optional;
import o00000oO.OooOOO0;

/* loaded from: classes2.dex */
public final class oOOoOOO0 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f14846OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f14847OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final /* synthetic */ long f14848OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f14849OooOoO0;

    public /* synthetic */ oOOoOOO0(o00O0O o00o0o, Object obj, long j) {
        this.f14846OooOo = o00o0o;
        this.f14849OooOoO0 = obj;
        this.f14848OooOo0o = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f14848OooOo0o;
        Object obj = this.f14849OooOoO0;
        Object obj2 = this.f14846OooOo;
        switch (this.f14847OooOo0O) {
            case 0:
                oO00o000 oo00o000 = (oO00o000) obj;
                oo00o000.OooOOOO((oO00OOo0) obj2, false, j);
                oo00o000.f14684OooOoO = null;
                oOo000o0 ooo000o0OooOOOo = ((o0OO0oO0) oo00o000.f14574OooOo0O).OooOOOo();
                ooo000o0OooOOOo.OooOO0O();
                ooo000o0OooOOOo.OooOO0o();
                ooo000o0OooOOOo.OooOoO0(new OooOOO0(ooo000o0OooOOOo, (oO00OOo0) null));
                break;
            case 1:
                o00O0O o00o0o = (o00O0O) obj2;
                o00o0o.getClass();
                int i = i80.f19994OooO00o;
                w41 w41Var = o00o0o.f21768OooO0O0.f24239OooOo0O;
                h61 h61Var = w41Var.f25200Oooo0o0;
                d61 d61VarOooOO0o = h61Var.OooOO0o();
                h61Var.OooO(d61VarOooOO0o, 26, new ni0(d61VarOooOO0o, obj, j));
                if (w41Var.f25212OoooOoo == obj) {
                    qv0 qv0Var = new qv0(23);
                    t00 t00Var = w41Var.f25195Oooo00O;
                    t00Var.OooO0OO(26, qv0Var);
                    t00Var.OooO0O0();
                    break;
                }
                break;
            case 2:
                oOOO00o0 oooo00o0 = (oOOO00o0) obj;
                oooo00o0.f22827OooOo0O.OooO00o(j, (String) obj2);
                oooo00o0.f22827OooOo0O.OooO0O0(oooo00o0.toString());
                break;
            default:
                kg0 kg0Var = (kg0) obj2;
                sj0 sj0Var = kg0Var.f20602OooOOO;
                if (sj0Var != null) {
                    sj0Var.OooOOOo(AdFormat.getAdFormat(kg0Var.f20597OooO0o0.zzb), Optional.empty(), "pano_ts", this.f14848OooOo0o, ((Optional) obj).filter(new ug0(0)).map(new C2177vz(3)).map(new C2177vz(4)));
                    break;
                }
                break;
        }
    }

    public oOOoOOO0(oOOO00o0 oooo00o0, String str, long j) {
        this.f14846OooOo = str;
        this.f14848OooOo0o = j;
        this.f14849OooOoO0 = oooo00o0;
    }

    public /* synthetic */ oOOoOOO0(kg0 kg0Var, long j, Optional optional) {
        this.f14846OooOo = kg0Var;
        this.f14848OooOo0o = j;
        this.f14849OooOoO0 = optional;
    }

    public oOOoOOO0(oO00o000 oo00o000, oO00OOo0 oo00ooo0, long j) {
        this.f14846OooOo = oo00ooo0;
        this.f14848OooOo0o = j;
        Objects.requireNonNull(oo00o000);
        this.f14849OooOoO0 = oo00o000;
    }
}
