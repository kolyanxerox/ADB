package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nk */
/* loaded from: classes2.dex */
public final class C1866nk implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f21499OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Object f21500OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final z31 f21501OooO0OO;

    public /* synthetic */ C1866nk(Object obj, z31 z31Var, int i) {
        this.f21499OooO00o = i;
        this.f21500OooO0O0 = obj;
        this.f21501OooO0OO = z31Var;
    }

    public C2051sk OooO00o() {
        C2163vl c2163vl = AbstractC2200wl.f25322OooO0O0;
        ii0.Oooo000(c2163vl);
        C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl2);
        Context context = (Context) ((o20) this.f21500OooO0O0).f22305OooO0O0.zzb();
        ii0.Oooo000(c2163vl2);
        return new C2051sk(c2163vl, c2163vl2, new l40(context, c2163vl2, 0), p31.OooO00o(new w31((C1984qr) this.f21501OooO0OO)), 10);
    }

    public C1548ey OooO0O0() {
        return new C1548ey(11, new i50(((C1797lp) this.f21500OooO0O0).f20919OooO0O0.OooO00o()), (cq0) ((p31) this.f21501OooO0OO).zzb());
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        View view;
        switch (this.f21499OooO00o) {
            case 0:
                return new SharedPreferencesOnSharedPreferenceChangeListenerC1829mk((Context) ((r31) this.f21500OooO0O0).f23738OooO00o, (zzg) ((r31) this.f21501OooO0OO).f23738OooO00o);
            case 1:
                Context context = (Context) ((r31) this.f21500OooO0O0).f23738OooO00o;
                C2014rk c2014rk = (C2014rk) this.f21501OooO0OO;
                return new C2273yk(context, new C2249xx(19, (Oooo0OO.o00Ooo) c2014rk.f23872OooO0OO.f23738OooO00o, (C1904ok) c2014rk.f23871OooO0O0.zzb()));
            case 2:
                return new C1872nq(((s31) this.f21500OooO0O0).zzb(), ((s31) this.f21501OooO0OO).zzb());
            case 3:
                return new C1541er(((C1764kt) this.f21500OooO0O0).OooO00o(), ((C2019rp) this.f21501OooO0OO).zzb());
            case 4:
                return ((C1386ai) this.f21500OooO0O0).OooOo0O(((x31) this.f21501OooO0OO).zzb());
            case 5:
                return new xa0(((C1940pk) this.f21500OooO0O0).OooO00o(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00oOo)).intValue(), (ScheduledExecutorService) ((p31) this.f21501OooO0OO).zzb());
            case 6:
                return new xa0(new k90(((C1874ns) this.f21500OooO0O0).f21577OooO0O0.OooO00o(), 2), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o0O000)).intValue(), (ScheduledExecutorService) ((p31) this.f21501OooO0OO).zzb());
            case 7:
                return new xa0(((C1940pk) this.f21500OooO0O0).OooO0OO(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00oo0)).intValue(), (ScheduledExecutorService) ((p31) this.f21501OooO0OO).zzb());
            case 8:
                return new C1985qs((InterfaceC1722jo) ((C1653hs) this.f21500OooO0O0).f19846OooO0O0.f17045OooOoO, (Executor) ((p31) this.f21501OooO0OO).zzb());
            case 9:
                String str = (String) ((p31) this.f21501OooO0OO).zzb();
                o60 o60Var = ((C1802lu) this.f21500OooO0O0).f20957OooO0o;
                return o60Var != null ? o60Var : new o60(str);
            case 10:
                ((C1834mp) this.f21501OooO0OO).OooO00o();
                Context context2 = ((C1802lu) this.f21500OooO0O0).f20953OooO00o;
                ii0.Oooo000(context2);
                return context2;
            case 11:
                return new C1951pv(((x31) this.f21500OooO0O0).zzb(), ((C1764kt) this.f21501OooO0OO).OooO00o());
            case 12:
                Set setZzb = ((x31) this.f21501OooO0OO).zzb();
                C1804lw c1804lw = (C1804lw) this.f21500OooO0O0;
                if (c1804lw.f20977OooOOOo == null) {
                    c1804lw.f20977OooOOOo = new C2098tu(setZzb);
                }
                C2098tu c2098tu = c1804lw.f20977OooOOOo;
                ii0.Oooo000(c2098tu);
                return c2098tu;
            case 13:
                kd0 kd0VarOooO00o = ((C1764kt) this.f21500OooO0O0).OooO00o();
                JSONObject jSONObject = (JSONObject) ((C1585fy) this.f21501OooO0OO).f19135OooO0O0.f18708OooOo0o;
                ii0.Oooo000(jSONObject);
                return new C2102ty(kd0VarOooO00o, jSONObject);
            case 14:
                zzbo zzboVar = (zzbo) ((v31) this.f21500OooO0O0).zzb();
                Oooo0OO.o00Ooo o00ooo2 = (Oooo0OO.o00Ooo) ((p31) this.f21501OooO0OO).zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                return new C2140uz(zzboVar, o00ooo2, c2163vl);
            case 15:
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                return new de0(c2163vl2, ((c00) this.f21500OooO0O0).zzb(), new C1548ey(5, c2163vl2, ((c00) ((C1651hq) this.f21501OooO0OO).f19838OooO0O0).zzb()), false, 18);
            case 16:
                C1917oy c1917oy = (C1917oy) ((w90) this.f21500OooO0O0).zzb();
                C2065sy c2065syOooO00o = ((C1651hq) this.f21501OooO0OO).OooO00o();
                l00 l00Var = new l00("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (c2065syOooO00o) {
                    view = c2065syOooO00o.f24191OooOOOO;
                }
                l00Var.f20752OooOo0O = view;
                l00Var.f20753OooOo0o = c2065syOooO00o.OooO();
                l00Var.f20751OooOo = c1917oy;
                l00Var.f20755OooOoO0 = false;
                l00Var.f20754OooOoO = false;
                if (c2065syOooO00o.OooOOO0() != null) {
                    c2065syOooO00o.OooOOO0().Oooooo(l00Var);
                }
                return l00Var;
            case 17:
                return new t10(de0.OooOOOo(((C1797lp) this.f21500OooO0O0).f20919OooO0O0.OooO00o()), (s10) ((p31) this.f21501OooO0OO).zzb());
            case 18:
                return new z10((C1998r4) ((p31) this.f21500OooO0O0).zzb(), ((s31) this.f21501OooO0OO).zzb());
            case 19:
                return new p20((n20) ((z31) this.f21500OooO0O0).zzb(), (C2130up) this.f21501OooO0OO.zzb());
            case 20:
                return new t20((C1394aq) ((r31) this.f21500OooO0O0).f23738OooO00o, new sj0((InterfaceC1563fc) ((C1945pp) this.f21501OooO0OO).f23397OooO0O0.f23738OooO00o, 19));
            case 21:
                return new q30(((C1834mp) this.f21500OooO0O0).OooO00o(), ((C1982qp) this.f21501OooO0OO).OooO00o());
            case 22:
                return OooO00o();
            case 23:
                Map map = ((t31) this.f21500OooO0O0).f22327OooO00o;
                C2163vl c2163vl3 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl3);
                return new t40(map, c2163vl3, new C2136uv(((C1987qu) this.f21501OooO0OO).f23701OooO0O0.zzb()));
            case 24:
                C2163vl c2163vl4 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl4);
                return new de0(c2163vl4, ((C1797lp) this.f21500OooO0O0).OooO00o(), p31.OooO00o(new w31((C1984qr) this.f21501OooO0OO)), false, 20);
            case 25:
                return OooO0O0();
            case 26:
                return new l50(((C1984qr) this.f21500OooO0O0).OooO0O0(), ((C1760kp) this.f21501OooO0OO).OooO00o());
            case 27:
                return new n50(((C1866nk) this.f21500OooO0O0).OooO0O0(), ((C1760kp) this.f21501OooO0OO).OooO00o());
            case 28:
                m50 m50Var = (m50) ((p31) this.f21500OooO0O0).zzb();
                C1866nk c1866nk = (C1866nk) this.f21501OooO0OO;
                return new z10(m50Var, new n50(((C1866nk) c1866nk.f21500OooO0O0).OooO0O0(), ((C1760kp) c1866nk.f21501OooO0OO).OooO00o()));
            default:
                C2163vl c2163vl5 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl5);
                return new t90(c2163vl5, ((C1876nu) this.f21500OooO0O0).OooO00o(), ((C2019rp) this.f21501OooO0OO).zzb(), 1);
        }
    }
}
