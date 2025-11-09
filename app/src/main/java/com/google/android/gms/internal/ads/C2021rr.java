package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rr */
/* loaded from: classes2.dex */
public final class C2021rr implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f23928OooO00o;

    /* renamed from: OooO0O0 */
    public final p31 f23929OooO0O0;

    /* renamed from: OooO0OO */
    public final p31 f23930OooO0OO;

    public /* synthetic */ C2021rr(p31 p31Var, p31 p31Var2, int i) {
        this.f23928OooO00o = i;
        this.f23929OooO0O0 = p31Var;
        this.f23930OooO0OO = p31Var2;
    }

    public C2099tv OooO00o() {
        return new C2099tv((ScheduledExecutorService) this.f23929OooO0O0.zzb(), (Oooo0OO.o00Ooo) this.f23930OooO0OO.zzb());
    }

    public f80 OooO0O0() {
        return new f80((s80) this.f23929OooO0O0.zzb(), (t10) this.f23930OooO0OO.zzb());
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        C2163vl c2163vl;
        switch (this.f23928OooO00o) {
            case 0:
                C1408b3 c1408b3 = (C1408b3) this.f23929OooO0O0.zzb();
                C1823me c1823me = (C1823me) this.f23930OooO0OO.zzb();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo00O)).booleanValue()) {
                    c2163vl = AbstractC2200wl.f25323OooO0OO;
                } else {
                    c2163vl = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00oOooo)).booleanValue() ? AbstractC2200wl.f25321OooO00o : AbstractC2200wl.f25325OooO0o;
                }
                ii0.Oooo000(c2163vl);
                return new C1799lr(c1408b3.f17359OooO0OO, c1823me, c2163vl);
            case 1:
                C1947pr c1947pr = (C1947pr) this.f23929OooO0O0.zzb();
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                Set setSingleton = ((JSONObject) this.f23930OooO0OO.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2248xw(c1947pr, c2163vl2));
                ii0.Oooo000(setSingleton);
                return setSingleton;
            case 2:
                C1947pr c1947pr2 = (C1947pr) this.f23929OooO0O0.zzb();
                C2163vl c2163vl3 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl3);
                Set setSingleton2 = ((JSONObject) this.f23930OooO0OO.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2248xw(c1947pr2, c2163vl3));
                ii0.Oooo000(setSingleton2);
                return setSingleton2;
            case 3:
                C1947pr c1947pr3 = (C1947pr) this.f23929OooO0O0.zzb();
                C2163vl c2163vl4 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl4);
                Set setSingleton3 = ((JSONObject) this.f23930OooO0OO.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2248xw(c1947pr3, c2163vl4));
                ii0.Oooo000(setSingleton3);
                return setSingleton3;
            case 4:
                C1947pr c1947pr4 = (C1947pr) this.f23929OooO0O0.zzb();
                C2163vl c2163vl5 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl5);
                Set setSingleton4 = ((JSONObject) this.f23930OooO0OO.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2248xw(c1947pr4, c2163vl5));
                ii0.Oooo000(setSingleton4);
                return setSingleton4;
            case 5:
                return OooO00o();
            case 6:
                return new C1949pt((Oooo0OO.o00Ooo) this.f23929OooO0O0.zzb(), (C1830ml) this.f23930OooO0OO.zzb());
            case 7:
                return new zzb((Context) this.f23929OooO0O0.zzb(), (InterfaceC1792lk) this.f23930OooO0OO.zzb(), null);
            case 8:
                return new C2248xw((C2247xv) this.f23929OooO0O0.zzb(), (Executor) this.f23930OooO0OO.zzb());
            case 9:
                return new C2248xw((C2247xv) this.f23929OooO0O0.zzb(), (Executor) this.f23930OooO0OO.zzb());
            case 10:
                return new C2248xw((C2247xv) this.f23929OooO0O0.zzb(), (Executor) this.f23930OooO0OO.zzb());
            case 11:
                return new C2248xw((C2247xv) this.f23929OooO0O0.zzb(), (Executor) this.f23930OooO0OO.zzb());
            case 12:
                return new C2248xw((C2247xv) this.f23929OooO0O0.zzb(), (Executor) this.f23930OooO0OO.zzb());
            case 13:
                return new C2248xw((C2247xv) this.f23929OooO0O0.zzb(), (Executor) this.f23930OooO0OO.zzb());
            case 14:
                return new C2248xw((C2247xv) this.f23929OooO0O0.zzb(), (Executor) this.f23930OooO0OO.zzb());
            case 15:
                return new C2248xw((C2247xv) this.f23929OooO0O0.zzb(), (Executor) this.f23930OooO0OO.zzb());
            case 16:
                return new C1953px((C1877nv) this.f23929OooO0O0.zzb(), (C2137uw) this.f23930OooO0OO.zzb());
            case 17:
                return new m20((String) this.f23929OooO0O0.zzb(), (k20) this.f23930OooO0OO.zzb());
            case 18:
                return new l30((d30) this.f23929OooO0O0.zzb(), (s10) this.f23930OooO0OO.zzb());
            case 19:
                gf0 gf0Var = (gf0) this.f23929OooO0O0.zzb();
                CookieManager cookieManagerZza = zzv.zzr().zza((Context) this.f23930OooO0OO.zzb());
                ef0 ef0Var = ef0.WEBVIEW_COOKIE;
                CallableC1736k1 callableC1736k1 = new CallableC1736k1(cookieManagerZza, 4);
                C2163vl c2163vl6 = gf0Var.f19332OooO00o;
                yp0 yp0Var = gf0.f19331OooO0Oo;
                List list = Collections.EMPTY_LIST;
                o00000oO.OooOOO oooOOOOooO0O0 = c2163vl6.OooO0O0(callableC1736k1);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                s20 s20Var = new s20(gf0Var, ef0Var, null, yp0Var, list, ii0.o00Oo0(oooOOOOooO0O0, 1L, TimeUnit.SECONDS, gf0Var.f19333OooO0O0));
                return new s20((gf0) s20Var.f23980OooOoOO, s20Var.f23976OooOo0O, (String) s20Var.f23977OooOo0o, (o00000oO.OooOOO) s20Var.f23975OooOo, (List) s20Var.f23979OooOoO0, ii0.OoooOoO((o00000oO.OooOOO) s20Var.f23978OooOoO, Exception.class, new C2094tq(15), ((gf0) s20Var.f23980OooOoOO).f19332OooO00o)).OooO00o();
            case 20:
                return OooO0O0();
            case 21:
                o00000oO.OooOOO oooOOO = (o00000oO.OooOOO) this.f23929OooO0O0.zzb();
                C2163vl c2163vl7 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl7);
                return new t90(oooOOO, c2163vl7, (ScheduledExecutorService) this.f23930OooO0OO.zzb(), 0);
            case 22:
                C2163vl c2163vl8 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl8);
                na0 na0Var = new na0(c2163vl8, 2);
                Oooo0OO.o00Ooo o00ooo2 = (Oooo0OO.o00Ooo) this.f23929OooO0O0.zzb();
                ii0.Oooo000(c2163vl8);
                return new ma0(na0Var, ((Long) AbstractC2297z7.f26109OooO0o.OooOOO()).longValue(), o00ooo2, c2163vl8, (h20) this.f23930OooO0OO.zzb());
            case 23:
                return new jd0((Oooo0OO.o00Ooo) this.f23929OooO0O0.zzb(), (h20) this.f23930OooO0OO.zzb());
            case 24:
                return new xa0((ma0) this.f23929OooO0O0.zzb(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00o00)).intValue(), (ScheduledExecutorService) this.f23930OooO0OO.zzb());
            case 25:
                return new xa0((ma0) this.f23929OooO0O0.zzb(), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00O00)).intValue(), (ScheduledExecutorService) this.f23930OooO0OO.zzb());
            default:
                return new bb0((String) this.f23929OooO0O0.zzb(), ((Integer) this.f23930OooO0OO.zzb()).intValue());
        }
    }
}
