package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class o80 implements i60 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Context f22358OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC1837ms f22359OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC1779l7 f22360OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final cq0 f22361OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final gf0 f22362OooO0o0;

    public o80(Context context, AbstractC1837ms abstractC1837ms, gf0 gf0Var, cq0 cq0Var, InterfaceC1779l7 interfaceC1779l7) {
        this.f22358OooO00o = context;
        this.f22359OooO0O0 = abstractC1837ms;
        this.f22362OooO0o0 = gf0Var;
        this.f22361OooO0Oo = cq0Var;
        this.f22360OooO0OO = interfaceC1779l7;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final boolean OooO00o(rd0 rd0Var, kd0 kd0Var) {
        od0 od0Var;
        return (this.f22360OooO0OO == null || (od0Var = kd0Var.f20503OooOOoo) == null || od0Var.f22973OooO00o == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final o00000oO.OooOOO OooO0O0(rd0 rd0Var, kd0 kd0Var) {
        n80 n80Var = new n80(new View(this.f22358OooO00o), null, new C1658hx(11, (byte) 0), (ld0) kd0Var.OooOo0.get(0));
        de0 de0Var = new de0(rd0Var, kd0Var, (String) null);
        C2315zp c2315zp = (C2315zp) this.f22359OooO0O0;
        C2278yp c2278yp = new C2278yp(c2315zp.f26241OooO0Oo, c2315zp.f26243OooO0o0, de0Var, n80Var);
        C1950pu c1950pu = (C1950pu) c2278yp.f25974OooOooO.zzb();
        C2320zu c2320zu = (C2320zu) c2278yp.f25979Oooo00O.zzb();
        C1438bx c1438bx = (C1438bx) c2278yp.f25977Oooo0.zzb();
        C2285yw c2285yw = (C2285yw) c2278yp.f25987OoooO0.zzb();
        C1947pr c1947pr = (C1947pr) c2278yp.f25963OooOOo0.zzb();
        s20 s20Var = new s20();
        s20Var.f23980OooOoOO = new AtomicBoolean(false);
        s20Var.f23976OooOo0O = c1950pu;
        s20Var.f23977OooOo0o = c2320zu;
        s20Var.f23975OooOo = c1438bx;
        s20Var.f23979OooOoO0 = c2285yw;
        s20Var.f23978OooOoO = c1947pr;
        od0 od0Var = kd0Var.f20503OooOOoo;
        BinderC1705j7 binderC1705j7 = new BinderC1705j7(s20Var, od0Var.f22974OooO0O0, od0Var.f22973OooO00o);
        ef0 ef0Var = ef0.CUSTOM_RENDER_SYN;
        xb0 xb0Var = new xb0(new C1548ey(16, this, binderC1705j7), 2);
        yp0 yp0Var = gf0.f19331OooO0Oo;
        List list = Collections.EMPTY_LIST;
        o00000oO.OooOOO oooOOOOooO0O0 = ((C2163vl) this.f22361OooO0Oo).OooO0O0(xb0Var);
        gf0 gf0Var = this.f22362OooO0o0;
        s20 s20VarOooO00o = gf0Var.OooO00o(ef0.CUSTOM_RENDER_ACK, new s20(gf0Var, ef0Var, null, yp0Var, list, oooOOOOooO0O0).OooO00o());
        dp0 dp0VarOoOO = ii0.ooOO((o00000oO.OooOOO) s20VarOooO00o.f23978OooOoO, new C1860ne(1, ii0.OooooOO(c2278yp.o00Ooo())), AbstractC2200wl.f25327OooO0oO);
        return new s20((gf0) s20VarOooO00o.f23980OooOoOO, s20VarOooO00o.f23976OooOo0O, (String) s20VarOooO00o.f23977OooOo0o, (o00000oO.OooOOO) s20VarOooO00o.f23975OooOo, (List) s20VarOooO00o.f23979OooOoO0, dp0VarOoOO).OooO00o();
    }
}
