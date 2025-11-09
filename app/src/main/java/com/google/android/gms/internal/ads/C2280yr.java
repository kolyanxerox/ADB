package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.yr */
/* loaded from: classes2.dex */
public final class C2280yr implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f26007OooO00o;

    /* renamed from: OooO0O0 */
    public final v31 f26008OooO0O0;

    /* renamed from: OooO0OO */
    public final v31 f26009OooO0OO;

    /* renamed from: OooO0Oo */
    public final v31 f26010OooO0Oo;

    /* renamed from: OooO0o0 */
    public final v31 f26011OooO0o0;

    public C2280yr(C1834mp c1834mp, p31 p31Var, v31 v31Var, p31 p31Var2) {
        this.f26007OooO00o = 11;
        this.f26011OooO0o0 = c1834mp;
        this.f26008OooO0O0 = p31Var;
        this.f26010OooO0Oo = v31Var;
        this.f26009OooO0OO = p31Var2;
    }

    public l80 OooO00o() {
        return new l80((gf0) ((p31) this.f26008OooO0O0).zzb(), (cq0) ((p31) this.f26009OooO0OO).zzb(), (k60) this.f26011OooO0o0.zzb(), (p60) ((q31) this.f26010OooO0Oo).zzb(), 0);
    }

    public mb0 OooO0O0() {
        Context contextOooO00o = ((C1834mp) this.f26011OooO0o0).OooO00o();
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new mb0(contextOooO00o, c2163vl, ((x31) this.f26010OooO0Oo).zzb(), (mf0) ((p31) this.f26008OooO0O0).zzb(), (h20) ((p31) this.f26009OooO0OO).zzb());
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f26007OooO00o) {
            case 0:
                gf0 gf0Var = (gf0) ((p31) this.f26008OooO0O0).zzb();
                cq0 cq0Var = (cq0) ((p31) this.f26009OooO0OO).zzb();
                C2014rk c2014rk = (C2014rk) this.f26011OooO0o0;
                return new l80(gf0Var, cq0Var, ((C2021rr) this.f26010OooO0Oo).OooO0O0(), new w60((Context) c2014rk.f23871OooO0O0.zzb(), 0, (AbstractC2243xr) c2014rk.f23872OooO0OO.f23738OooO00o), 0);
            case 1:
                gf0 gf0Var2 = (gf0) ((p31) this.f26008OooO0O0).zzb();
                cq0 cq0Var2 = (cq0) ((p31) this.f26009OooO0OO).zzb();
                C2014rk c2014rk2 = (C2014rk) this.f26011OooO0o0;
                return new l80(gf0Var2, cq0Var2, ((C2021rr) this.f26010OooO0Oo).OooO0O0(), new a70((Context) c2014rk2.f23871OooO0O0.zzb(), (AbstractC1837ms) c2014rk2.f23872OooO0OO.f23738OooO00o), 0);
            case 2:
                OooOOOo.o0ooOOo o0oooooOooO00o = ((C2171vt) this.f26009OooO0OO).OooO00o();
                InterfaceC2152va interfaceC2152va = (InterfaceC2152va) ((C2059ss) this.f26011OooO0o0).f24153OooO0O0.f25815OooOo0o;
                ii0.Oooo000(interfaceC2152va);
                return new C2022rs(o0oooooOooO00o, interfaceC2152va, (o000oOoO) ((C2059ss) this.f26010OooO0Oo).f24153OooO0O0.f25813OooOo, (Executor) ((p31) this.f26008OooO0O0).zzb());
            case 3:
                return new C2097tt((Oooo0OO.o00Ooo) ((p31) this.f26008OooO0O0).zzb(), (C2134ut) ((p31) this.f26009OooO0OO).zzb(), ((C1876nu) this.f26011OooO0o0).OooO00o(), (String) ((p31) this.f26010OooO0Oo).zzb());
            case 4:
                C2320zu c2320zu = (C2320zu) ((p31) this.f26008OooO0O0).zzb();
                kd0 kd0VarOooO00o = ((C1764kt) this.f26011OooO0o0).OooO00o();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((p31) this.f26009OooO0OO).zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new C1435bu(c2320zu, kd0VarOooO00o, scheduledExecutorService, c2163vl, (String) ((C1764kt) this.f26010OooO0Oo).f20673OooO0O0.f18243OooOoO0);
            case 5:
                gf0 gf0Var3 = (gf0) ((p31) this.f26008OooO0O0).zzb();
                cq0 cq0Var3 = (cq0) ((p31) this.f26009OooO0OO).zzb();
                C2014rk c2014rk3 = (C2014rk) this.f26011OooO0o0;
                return new l80(gf0Var3, cq0Var3, ((C2021rr) this.f26010OooO0Oo).OooO0O0(), new w60((Context) c2014rk3.f23871OooO0O0.zzb(), 1, (AbstractC1990qx) c2014rk3.f23872OooO0OO.f23738OooO00o), 0);
            case 6:
                n10 n10Var = (n10) ((p31) this.f26008OooO0O0).zzb();
                z00 z00Var = (z00) ((C1585fy) this.f26011OooO0o0).f19135OooO0O0.f18706OooOo;
                ii0.Oooo000(z00Var);
                C2058sr c2058sr = (C2058sr) ((p31) this.f26009OooO0OO).zzb();
                C1475cy c1475cy = (C1475cy) ((C1916ox) this.f26010OooO0Oo).f23137OooO0O0.zzb();
                ii0.Oooo000(c1475cy);
                return new C1696iz(n10Var, z00Var, c2058sr, c1475cy);
            case 7:
                return new q00(((C1834mp) this.f26008OooO0O0).OooO00o(), ((C1651hq) this.f26009OooO0OO).OooO00o(), ((C1476cz) this.f26011OooO0o0).OooO00o(), (C1917oy) ((w90) this.f26010OooO0Oo).zzb());
            case 8:
                return new r00((String) ((C1764kt) this.f26009OooO0OO).f20673OooO0O0.f18243OooOoO0, (C1917oy) ((w90) this.f26011OooO0o0).zzb(), ((C1651hq) this.f26010OooO0Oo).OooO00o(), (h20) ((p31) this.f26008OooO0O0).zzb());
            case 9:
                gf0 gf0Var4 = (gf0) ((p31) this.f26008OooO0O0).zzb();
                cq0 cq0Var4 = (cq0) ((p31) this.f26009OooO0OO).zzb();
                C2014rk c2014rk4 = (C2014rk) this.f26011OooO0o0;
                return new l80(gf0Var4, cq0Var4, ((C2021rr) this.f26010OooO0Oo).OooO0O0(), new w60((Context) c2014rk4.f23871OooO0O0.zzb(), 2, (i10) c2014rk4.f23872OooO0OO.f23738OooO00o), 0);
            case 10:
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                return new k20(c2163vl2, (zzu) this.f26008OooO0O0.zzb(), ((CsiParamDefaults_Factory) this.f26009OooO0OO).zzb(), ((CsiUrlBuilder_Factory) this.f26011OooO0o0).zzb(), ((C1834mp) this.f26010OooO0Oo).OooO00o());
            case 11:
                return new x50(((C1834mp) this.f26011OooO0o0).OooO00o(), (s50) ((p31) this.f26008OooO0O0).zzb(), (zzu) this.f26010OooO0Oo.zzb(), (h20) ((p31) this.f26009OooO0OO).zzb());
            case 12:
                return OooO00o();
            case 13:
                return new l80((gf0) ((p31) this.f26008OooO0O0).zzb(), (cq0) ((p31) this.f26009OooO0OO).zzb(), (InterfaceC1779l7) ((q80) this.f26011OooO0o0).f23544OooO0O0.f23242OooOo0o, new p80((AbstractC1990qx) ((C1945pp) this.f26010OooO0Oo).f23397OooO0O0.f23738OooO00o, 23), 1);
            case 14:
                o90 o90VarOooO00o = ((o20) this.f26011OooO0o0).OooO00o();
                ma0 ma0Var = (ma0) ((p31) this.f26008OooO0O0).zzb();
                List list = (List) ((p31) this.f26009OooO0OO).zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) ((p31) this.f26010OooO0Oo).zzb();
                if (list.contains("10")) {
                    return new xa0(ma0Var, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00OO0)).intValue(), scheduledExecutorService2);
                }
                return new xa0(o90VarOooO00o, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00OO0)).intValue(), scheduledExecutorService2);
            case 15:
                o90 o90VarOooO00o2 = ((C1622gy) this.f26011OooO0o0).OooO00o();
                ma0 ma0Var2 = (ma0) ((p31) this.f26008OooO0O0).zzb();
                List list2 = (List) ((p31) this.f26009OooO0OO).zzb();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) ((p31) this.f26010OooO0Oo).zzb();
                if (list2.contains("54")) {
                    return new xa0(ma0Var2, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00o0O)).intValue(), scheduledExecutorService3);
                }
                return new xa0(o90VarOooO00o2, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00o0O)).intValue(), scheduledExecutorService3);
            case 16:
                z90 z90VarOooO0O0 = ((C1797lp) this.f26011OooO0o0).OooO0O0();
                ma0 ma0Var3 = (ma0) ((p31) this.f26008OooO0O0).zzb();
                List list3 = (List) ((p31) this.f26009OooO0OO).zzb();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) ((p31) this.f26010OooO0Oo).zzb();
                if (list3.contains("13")) {
                    return new xa0(ma0Var3, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00o0)).intValue(), scheduledExecutorService4);
                }
                return new xa0(z90VarOooO0O0, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00o0)).intValue(), scheduledExecutorService4);
            case 17:
                o90 o90VarOooO0O0 = ((C1908op) this.f26011OooO0o0).OooO0O0();
                ma0 ma0Var4 = (ma0) ((p31) this.f26008OooO0O0).zzb();
                List list4 = (List) ((p31) this.f26009OooO0OO).zzb();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) ((p31) this.f26010OooO0Oo).zzb();
                if (list4.contains("60")) {
                    return new xa0(ma0Var4, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooo)).intValue(), scheduledExecutorService5);
                }
                return new xa0(o90VarOooO0O0, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooo)).intValue(), scheduledExecutorService5);
            case 18:
                m90 m90VarOooO0O0 = ((ab0) this.f26011OooO0o0).OooO0O0();
                ma0 ma0Var5 = (ma0) ((p31) this.f26008OooO0O0).zzb();
                List list5 = (List) ((p31) this.f26009OooO0OO).zzb();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) ((p31) this.f26010OooO0Oo).zzb();
                if (list5.contains("35")) {
                    return new xa0(ma0Var5, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00O0O)).intValue(), scheduledExecutorService6);
                }
                return new xa0(m90VarOooO0O0, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00O0O)).intValue(), scheduledExecutorService6);
            case 19:
                z90 z90VarOooO0Oo = ((C1797lp) this.f26011OooO0o0).OooO0Oo();
                ma0 ma0Var6 = (ma0) ((p31) this.f26008OooO0O0).zzb();
                List list6 = (List) ((p31) this.f26009OooO0OO).zzb();
                ScheduledExecutorService scheduledExecutorService7 = (ScheduledExecutorService) ((p31) this.f26010OooO0Oo).zzb();
                if (list6.contains("39")) {
                    return new xa0(ma0Var6, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00)).intValue(), scheduledExecutorService7);
                }
                return new xa0(z90VarOooO0Oo, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00)).intValue(), scheduledExecutorService7);
            case 20:
                return OooO0O0();
            case 21:
                return new rg0((vg0) ((p31) this.f26008OooO0O0).zzb(), new sj0((h20) ((o20) this.f26011OooO0o0).f22305OooO0O0.zzb(), 29), ((C1834mp) this.f26010OooO0Oo).OooO00o(), (Oooo0OO.o00Ooo) ((p31) this.f26009OooO0OO).zzb());
            default:
                return new vg0(((C1834mp) this.f26011OooO0o0).OooO00o(), ((C1982qp) this.f26010OooO0Oo).OooO00o(), (ScheduledExecutorService) ((p31) this.f26008OooO0O0).zzb(), (Oooo0OO.o00Ooo) ((p31) this.f26009OooO0OO).zzb());
        }
    }

    public /* synthetic */ C2280yr(C1834mp c1834mp, q31 q31Var, p31 p31Var, p31 p31Var2, int i) {
        this.f26007OooO00o = i;
        this.f26011OooO0o0 = c1834mp;
        this.f26010OooO0Oo = q31Var;
        this.f26008OooO0O0 = p31Var;
        this.f26009OooO0OO = p31Var2;
    }

    public C2280yr(p31 p31Var, o20 o20Var, C1834mp c1834mp, p31 p31Var2) {
        this.f26007OooO00o = 21;
        this.f26008OooO0O0 = p31Var;
        this.f26011OooO0o0 = o20Var;
        this.f26010OooO0Oo = c1834mp;
        this.f26009OooO0OO = p31Var2;
    }

    public /* synthetic */ C2280yr(p31 p31Var, q31 q31Var, p31 p31Var2, q31 q31Var2, int i) {
        this.f26007OooO00o = i;
        this.f26008OooO0O0 = p31Var;
        this.f26011OooO0o0 = q31Var;
        this.f26009OooO0OO = p31Var2;
        this.f26010OooO0Oo = q31Var2;
    }

    public /* synthetic */ C2280yr(q31 q31Var, p31 p31Var, p31 p31Var2, p31 p31Var3, int i) {
        this.f26007OooO00o = i;
        this.f26011OooO0o0 = q31Var;
        this.f26008OooO0O0 = p31Var;
        this.f26009OooO0OO = p31Var2;
        this.f26010OooO0Oo = p31Var3;
    }

    public /* synthetic */ C2280yr(q31 q31Var, q31 q31Var2, q31 q31Var3, p31 p31Var, int i) {
        this.f26007OooO00o = i;
        this.f26009OooO0OO = q31Var;
        this.f26011OooO0o0 = q31Var2;
        this.f26010OooO0Oo = q31Var3;
        this.f26008OooO0O0 = p31Var;
    }

    public /* synthetic */ C2280yr(v31 v31Var, v31 v31Var2, v31 v31Var3, v31 v31Var4, int i) {
        this.f26007OooO00o = i;
        this.f26008OooO0O0 = v31Var;
        this.f26009OooO0OO = v31Var2;
        this.f26011OooO0o0 = v31Var3;
        this.f26010OooO0Oo = v31Var4;
    }
}
