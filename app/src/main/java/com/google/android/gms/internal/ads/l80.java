package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class l80 implements i60 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f20824OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final cq0 f20825OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final gf0 f20826OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f20827OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final Object f20828OooO0o0;

    public /* synthetic */ l80(gf0 gf0Var, cq0 cq0Var, Object obj, Object obj2, int i) {
        this.f20824OooO00o = i;
        this.f20826OooO0OO = gf0Var;
        this.f20825OooO0O0 = cq0Var;
        this.f20828OooO0o0 = obj2;
        this.f20827OooO0Oo = obj;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final boolean OooO00o(rd0 rd0Var, kd0 kd0Var) {
        od0 od0Var;
        switch (this.f20824OooO00o) {
            case 0:
                return !kd0Var.f20505OooOo00.isEmpty();
            default:
                return (((InterfaceC1779l7) this.f20827OooO0Oo) == null || (od0Var = kd0Var.f20503OooOOoo) == null || od0Var.f22973OooO00o == null) ? false : true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.ads.ev, com.google.android.gms.internal.ads.w2] */
    @Override // com.google.android.gms.internal.ads.i60
    public final o00000oO.OooOOO OooO0O0(rd0 rd0Var, kd0 kd0Var) {
        l60 l60VarOooO00o;
        switch (this.f20824OooO00o) {
            case 0:
                Iterator it = kd0Var.f20505OooOo00.iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            l60VarOooO00o = ((k60) this.f20827OooO0Oo).OooO00o((String) it.next(), kd0Var.f20506OooOo0O);
                        } catch (yd0 unused) {
                        }
                    } else {
                        l60VarOooO00o = null;
                    }
                }
                l60 l60Var = l60VarOooO00o;
                if (l60Var == null) {
                    return ii0.Ooooo00(new o70(3, "Unable to instantiate mediation adapter class."));
                }
                C2274yl c2274yl = new C2274yl();
                l60Var.f20810OooO0OO.OooO(new com.google.android.gms.internal.measurement.o0OOO00(l60Var, c2274yl));
                if (kd0Var.f20522Oooo0o) {
                    Bundle bundle = ((vd0) rd0Var.f23848OooO00o.f23325OooOo0o).f24954OooO0Oo.zzm;
                    Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                    }
                    bundle2.putBoolean("render_test_ad_label", true);
                }
                ef0 ef0Var = ef0.ADAPTER_LOAD_AD_SYN;
                xb0 xb0Var = new xb0(new C1386ai(this, rd0Var, kd0Var, l60Var, 12), 2);
                yp0 yp0Var = gf0.f19331OooO0Oo;
                List list = Collections.EMPTY_LIST;
                o00000oO.OooOOO oooOOOOooO0O0 = ((C2163vl) this.f20825OooO0O0).OooO0O0(xb0Var);
                gf0 gf0Var = this.f20826OooO0OO;
                s20 s20VarOooO00o = gf0Var.OooO00o(ef0.ADAPTER_LOAD_AD_ACK, new s20(gf0Var, ef0Var, null, yp0Var, list, oooOOOOooO0O0).OooO00o());
                dp0 dp0VarOoOO = ii0.ooOO((o00000oO.OooOOO) s20VarOooO00o.f23978OooOoO, new C1860ne(1, c2274yl), AbstractC2200wl.f25327OooO0oO);
                o00000oO.OooOOO oooOOO = (o00000oO.OooOOO) s20VarOooO00o.f23975OooOo;
                List list2 = (List) s20VarOooO00o.f23979OooOoO0;
                gf0 gf0Var2 = (gf0) s20VarOooO00o.f23980OooOoOO;
                return gf0Var2.OooO00o(ef0.ADAPTER_WRAP_ADAPTER, new s20(gf0Var2, s20VarOooO00o.f23976OooOo0O, (String) s20VarOooO00o.f23977OooOo0o, oooOOO, list2, dp0VarOoOO).OooO00o()).OooO0oO(new C2051sk(this, rd0Var, kd0Var, l60Var, 12)).OooO00o();
            default:
                C2274yl c2274yl2 = new C2274yl();
                r80 r80Var = new r80();
                OooOOo0.o0OOO0o o0ooo0o = new OooOOo0.o0OOO0o(this, c2274yl2, rd0Var, kd0Var, r80Var, 4, false);
                synchronized (r80Var) {
                    r80Var.f23803OooOo0O = o0ooo0o;
                }
                od0 od0Var = kd0Var.f20503OooOOoo;
                BinderC1705j7 binderC1705j7 = new BinderC1705j7(r80Var, od0Var.f22974OooO0O0, od0Var.f22973OooO00o);
                ef0 ef0Var2 = ef0.CUSTOM_RENDER_SYN;
                C1548ey c1548ey = new C1548ey(17, this, binderC1705j7);
                gf0 gf0Var3 = this.f20826OooO0OO;
                cq0 cq0Var = this.f20825OooO0O0;
                s20 s20VarOooO00o2 = gf0Var3.OooO00o(ef0.CUSTOM_RENDER_ACK, new s20(gf0Var3, ef0Var2, null, gf0.f19331OooO0Oo, Collections.EMPTY_LIST, ((C2163vl) cq0Var).OooO0O0(new xb0(c1548ey, 2))).OooO00o());
                dp0 dp0VarOoOO2 = ii0.ooOO((o00000oO.OooOOO) s20VarOooO00o2.f23978OooOoO, new C1860ne(1, c2274yl2), AbstractC2200wl.f25327OooO0oO);
                return new s20((gf0) s20VarOooO00o2.f23980OooOoOO, s20VarOooO00o2.f23976OooOo0O, (String) s20VarOooO00o2.f23977OooOo0o, (o00000oO.OooOOO) s20VarOooO00o2.f23975OooOo, (List) s20VarOooO00o2.f23979OooOoO0, dp0VarOoOO2).OooO00o();
        }
    }
}
