package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.dr */
/* loaded from: classes2.dex */
public final class C1504dr implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f18388OooO00o;

    /* renamed from: OooO0O0 */
    public final q31 f18389OooO0O0;

    /* renamed from: OooO0OO */
    public final q31 f18390OooO0OO;

    /* renamed from: OooO0Oo */
    public final p31 f18391OooO0Oo;

    /* renamed from: OooO0o */
    public final v31 f18392OooO0o;

    /* renamed from: OooO0o0 */
    public final v31 f18393OooO0o0;

    /* renamed from: OooO0oO */
    public final v31 f18394OooO0oO;

    public C1504dr(C1760kp c1760kp, C1834mp c1834mp, p31 p31Var, C1797lp c1797lp, C1876nu c1876nu, C1982qp c1982qp) {
        this.f18388OooO00o = 8;
        this.f18390OooO0OO = c1760kp;
        this.f18389OooO0O0 = c1834mp;
        this.f18391OooO0Oo = p31Var;
        this.f18393OooO0o0 = c1797lp;
        this.f18392OooO0o = c1876nu;
        this.f18394OooO0oO = c1982qp;
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f18388OooO00o) {
            case 0:
                Context contextOooO00o = ((C1834mp) this.f18389OooO0O0).OooO00o();
                zzj zzjVarOooO00o = ((C1760kp) this.f18390OooO0OO).OooO00o();
                g60 g60Var = (g60) this.f18391OooO0Oo.zzb();
                q10 q10Var = (q10) ((p31) this.f18393OooO0o0).zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new C1468cr(contextOooO00o, zzjVarOooO00o, g60Var, q10Var, c2163vl, (cq0) ((p31) this.f18392OooO0o).zzb(), (ScheduledExecutorService) ((p31) this.f18394OooO0oO).zzb());
            case 1:
                return new C2319zt(((C1834mp) this.f18389OooO0O0).OooO00o(), ((C1876nu) this.f18392OooO0o).OooO00o(), ((C1982qp) this.f18394OooO0oO).OooO00o(), ((C1760kp) this.f18390OooO0OO).OooO00o(), (d30) this.f18391OooO0Oo.zzb(), (nf0) ((p31) this.f18393OooO0o0).zzb());
            case 2:
                Context contextOooO00o2 = ((C1834mp) this.f18389OooO0O0).OooO00o();
                C2249xx c2249xx = ((C1842mx) this.f18390OooO0OO).f21360OooO0O0;
                return new C2101tx(contextOooO00o2, (InterfaceC1722jo) c2249xx.f25813OooOo, ((C1764kt) this.f18393OooO0o0).OooO00o(), ((C1982qp) this.f18392OooO0o).OooO00o(), (EnumC2035s4) ((q31) this.f18394OooO0oO).zzb(), (e60) this.f18391OooO0Oo.zzb());
            case 3:
                C2130up c2130up = (C2130up) ((r31) this.f18389OooO0O0).f23738OooO00o;
                C1765ku c1765kuOooO00o = ((C1839mu) this.f18390OooO0OO).f21355OooO0O0.OooO00o();
                C1841mw c1841mw = (C1841mw) this.f18393OooO0o0;
                C2286yx c2286yx = (C2286yx) this.f18392OooO0o;
                C2099tv c2099tvOooO00o = ((C2021rr) this.f18394OooO0oO).OooO00o();
                x70 x70Var = (x70) this.f18391OooO0Oo.zzb();
                C2130up c2130up2 = c2130up.f24676OooO0O0;
                C1802lu c1802lu = new C1802lu(c1765kuOooO00o);
                sj0 sj0Var = null;
                p80 p80Var = new p80(null, 0);
                C2249xx c2249xx2 = new C2249xx(28, c2099tvOooO00o, (Object) null);
                wj0 wj0Var = new wj0(null, 13);
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17907o00OOoo)).booleanValue()) {
                    sj0Var = new sj0(23, false);
                    sj0Var.f24094OooOo0o = x70Var;
                }
                C1804lw c1804lw = c1841mw.f21358OooO0O0;
                ii0.Oooo0oO(C1804lw.class, c1804lw);
                if (sj0Var == null) {
                    sj0Var = new sj0(23, false);
                }
                C2249xx c2249xx3 = c2286yx.f26035OooO0O0;
                ii0.Oooo0oO(C2249xx.class, c2249xx3);
                InterfaceC1506dt interfaceC1506dt = (InterfaceC1506dt) new C2315zp(c2130up2, wj0Var, c2249xx3, new C1658hx(4, (byte) 0), c1804lw, c1802lu, sj0Var, p80Var, c2249xx2, null, null).f26299o000000.zzb();
                ii0.Oooo000(interfaceC1506dt);
                return interfaceC1506dt;
            case 4:
                Context contextOooO00o3 = ((C1834mp) this.f18389OooO0O0).OooO00o();
                vd0 vd0VarOooO00o = ((C1876nu) this.f18390OooO0OO).OooO00o();
                C2051sk c2051skOooO00o = ((C1866nk) this.f18394OooO0oO).OooO00o();
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                return new j40(contextOooO00o3, vd0VarOooO00o, c2051skOooO00o, c2163vl2, (ScheduledExecutorService) this.f18391OooO0Oo.zzb(), (m50) ((p31) this.f18393OooO0o0).zzb(), (mf0) ((p31) this.f18392OooO0o).zzb());
            case 5:
                C2130up c2130up3 = (C2130up) ((r31) this.f18389OooO0O0).f23738OooO00o;
                C2286yx c2286yx2 = (C2286yx) this.f18390OooO0OO;
                C1765ku c1765kuOooO00o2 = ((C1839mu) this.f18392OooO0o).f21355OooO0O0.OooO00o();
                C1841mw c1841mw2 = (C1841mw) this.f18394OooO0oO;
                return new r70(c2130up3, c2286yx2.f26035OooO0O0, c1765kuOooO00o2, c1841mw2.f21358OooO0O0, (x70) this.f18391OooO0Oo.zzb(), (o60) ((p31) this.f18393OooO0o0).zzb());
            case 6:
                C2130up c2130up4 = (C2130up) ((r31) this.f18389OooO0O0).f23738OooO00o;
                C1765ku c1765kuOooO00o3 = ((C1839mu) this.f18390OooO0OO).f21355OooO0O0.OooO00o();
                q80 q80Var = (q80) this.f18392OooO0o;
                C1841mw c1841mw3 = (C1841mw) this.f18394OooO0oO;
                return new r70(c2130up4, c1765kuOooO00o3, q80Var.f23544OooO0O0, c1841mw3.f21358OooO0O0, (x70) this.f18391OooO0Oo.zzb(), (o60) ((p31) this.f18393OooO0o0).zzb());
            case 7:
                C2130up c2130up5 = (C2130up) ((r31) this.f18389OooO0O0).f23738OooO00o;
                C1765ku c1765kuOooO00o4 = ((C1839mu) this.f18390OooO0OO).f21355OooO0O0.OooO00o();
                C1841mw c1841mw4 = (C1841mw) this.f18392OooO0o;
                return new r70(c2130up5, c1765kuOooO00o4, c1841mw4.f21358OooO0O0, ((C1839mu) this.f18394OooO0oO).f21355OooO0O0.f20956OooO0Oo, (x70) this.f18391OooO0Oo.zzb(), (o60) ((p31) this.f18393OooO0o0).zzb());
            case 8:
                zzj zzjVarOooO00o2 = ((C1760kp) this.f18390OooO0OO).OooO00o();
                Context contextOooO00o4 = ((C1834mp) this.f18389OooO0O0).OooO00o();
                C2163vl c2163vl3 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl3);
                return new qb0(zzjVarOooO00o2, contextOooO00o4, c2163vl3, (ScheduledExecutorService) this.f18391OooO0Oo.zzb(), new h60(((C1797lp) this.f18393OooO0o0).f20919OooO0O0.OooO00o()), ((C1876nu) this.f18392OooO0o).OooO00o(), ((C1982qp) this.f18394OooO0oO).OooO00o());
            case 9:
                return new fc0((Context) ((r31) this.f18389OooO0O0).f23738OooO00o, (Executor) this.f18391OooO0Oo.zzb(), (C2130up) ((r31) this.f18390OooO0OO).f23738OooO00o, ((y60) this.f18392OooO0o).OooO00o(), (ec0) ((p31) this.f18393OooO0o0).zzb(), new ud0(), ((C1982qp) this.f18394OooO0oO).OooO00o());
            case 10:
                return new fd0((Context) ((r31) this.f18389OooO0O0).f23738OooO00o, (Executor) this.f18391OooO0Oo.zzb(), (C2130up) ((r31) this.f18390OooO0OO).f23738OooO00o, ((y60) this.f18394OooO0oO).OooO00o(), (bd0) ((p31) this.f18393OooO0o0).zzb(), new ud0(), (sd0) ((p31) this.f18392OooO0o).zzb());
            default:
                return new zd0((hg0) this.f18391OooO0Oo.zzb(), (eg0) ((p31) this.f18393OooO0o0).zzb(), ((C1764kt) this.f18389OooO0O0).OooO00o(), ((C1764kt) this.f18390OooO0OO).f20673OooO0O0.OooO0o(), (C1468cr) ((p31) this.f18392OooO0o).zzb(), (mf0) ((p31) this.f18394OooO0oO).zzb());
        }
    }

    public C1504dr(C1834mp c1834mp, C1760kp c1760kp, p31 p31Var, p31 p31Var2, p31 p31Var3, p31 p31Var4) {
        this.f18388OooO00o = 0;
        this.f18389OooO0O0 = c1834mp;
        this.f18390OooO0OO = c1760kp;
        this.f18391OooO0Oo = p31Var;
        this.f18393OooO0o0 = p31Var2;
        this.f18392OooO0o = p31Var3;
        this.f18394OooO0oO = p31Var4;
    }

    public C1504dr(C1834mp c1834mp, C1876nu c1876nu, C1866nk c1866nk, p31 p31Var, p31 p31Var2, p31 p31Var3) {
        this.f18388OooO00o = 4;
        this.f18389OooO0O0 = c1834mp;
        this.f18390OooO0OO = c1876nu;
        this.f18394OooO0oO = c1866nk;
        this.f18391OooO0Oo = p31Var;
        this.f18393OooO0o0 = p31Var2;
        this.f18392OooO0o = p31Var3;
    }

    public C1504dr(C1834mp c1834mp, C1876nu c1876nu, C1982qp c1982qp, C1760kp c1760kp, p31 p31Var, p31 p31Var2) {
        this.f18388OooO00o = 1;
        this.f18389OooO0O0 = c1834mp;
        this.f18392OooO0o = c1876nu;
        this.f18394OooO0oO = c1982qp;
        this.f18390OooO0OO = c1760kp;
        this.f18391OooO0Oo = p31Var;
        this.f18393OooO0o0 = p31Var2;
    }

    public C1504dr(p31 p31Var, p31 p31Var2, C1764kt c1764kt, C1764kt c1764kt2, p31 p31Var3, p31 p31Var4) {
        this.f18388OooO00o = 11;
        this.f18391OooO0Oo = p31Var;
        this.f18393OooO0o0 = p31Var2;
        this.f18389OooO0O0 = c1764kt;
        this.f18390OooO0OO = c1764kt2;
        this.f18392OooO0o = p31Var3;
        this.f18394OooO0oO = p31Var4;
    }

    public /* synthetic */ C1504dr(q31 q31Var, q31 q31Var2, q31 q31Var3, q31 q31Var4, q31 q31Var5, p31 p31Var, int i) {
        this.f18388OooO00o = i;
        this.f18389OooO0O0 = q31Var;
        this.f18390OooO0OO = q31Var2;
        this.f18393OooO0o0 = q31Var3;
        this.f18392OooO0o = q31Var4;
        this.f18394OooO0oO = q31Var5;
        this.f18391OooO0Oo = p31Var;
    }

    public C1504dr(r31 r31Var, p31 p31Var, r31 r31Var2, y60 y60Var, p31 p31Var2, C1982qp c1982qp) {
        this.f18388OooO00o = 9;
        this.f18389OooO0O0 = r31Var;
        this.f18391OooO0Oo = p31Var;
        this.f18390OooO0OO = r31Var2;
        this.f18392OooO0o = y60Var;
        this.f18393OooO0o0 = p31Var2;
        this.f18394OooO0oO = c1982qp;
    }

    public C1504dr(r31 r31Var, p31 p31Var, r31 r31Var2, y60 y60Var, p31 p31Var2, p31 p31Var3) {
        this.f18388OooO00o = 10;
        this.f18389OooO0O0 = r31Var;
        this.f18391OooO0Oo = p31Var;
        this.f18390OooO0OO = r31Var2;
        this.f18394OooO0oO = y60Var;
        this.f18393OooO0o0 = p31Var2;
        this.f18392OooO0o = p31Var3;
    }

    public /* synthetic */ C1504dr(r31 r31Var, q31 q31Var, q31 q31Var2, q31 q31Var3, p31 p31Var, p31 p31Var2, int i) {
        this.f18388OooO00o = i;
        this.f18389OooO0O0 = r31Var;
        this.f18390OooO0OO = q31Var;
        this.f18392OooO0o = q31Var2;
        this.f18394OooO0oO = q31Var3;
        this.f18391OooO0Oo = p31Var;
        this.f18393OooO0o0 = p31Var2;
    }
}
