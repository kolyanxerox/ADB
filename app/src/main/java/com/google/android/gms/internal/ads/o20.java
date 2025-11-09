package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class o20 implements q31 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f22304OooO00o;

    /* renamed from: OooO0O0 */
    public final p31 f22305OooO0O0;

    public /* synthetic */ o20(p31 p31Var, int i) {
        this.f22304OooO00o = i;
        this.f22305OooO0O0 = p31Var;
    }

    public o90 OooO00o() {
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new o90(1, c2163vl, (C1978ql) this.f22305OooO0O0.zzb());
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        Object tn0Var;
        p31 p31Var = this.f22305OooO0O0;
        switch (this.f22304OooO00o) {
            case 0:
                p20 p20Var = (p20) p31Var.zzb();
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                Set setOooO = C1658hx.OooO(p20Var, c2163vl);
                ii0.Oooo000(setOooO);
                return setOooO;
            case 1:
                p20 p20Var2 = (p20) p31Var.zzb();
                C2163vl c2163vl2 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl2);
                Set setOooO2 = C1658hx.OooO(p20Var2, c2163vl2);
                ii0.Oooo000(setOooO2);
                return setOooO2;
            case 2:
                i30 i30Var = (i30) p31Var.zzb();
                C2163vl c2163vl3 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl3);
                return new C2248xw(i30Var, c2163vl3);
            case 3:
                i30 i30Var2 = (i30) p31Var.zzb();
                C2163vl c2163vl4 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl4);
                return new C2248xw(i30Var2, c2163vl4);
            case 4:
                i30 i30Var3 = (i30) p31Var.zzb();
                C2163vl c2163vl5 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl5);
                return new C2248xw(i30Var3, c2163vl5);
            case 5:
                return new C2248xw((c40) p31Var.zzb(), AbstractC2200wl.f25327OooO0oO);
            case 6:
                return new C2248xw((c40) p31Var.zzb(), AbstractC2200wl.f25327OooO0oO);
            case 7:
                Context context = (Context) p31Var.zzb();
                C2163vl c2163vl6 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl6);
                return new l40(context, c2163vl6, 0);
            case 8:
                l50 l50Var = (l50) p31Var.zzb();
                C2163vl c2163vl7 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl7);
                return new C2248xw(l50Var, c2163vl7);
            case 9:
                l50 l50Var2 = (l50) p31Var.zzb();
                C2163vl c2163vl8 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl8);
                return new C2248xw(l50Var2, c2163vl8);
            case 10:
                return new s80((t10) p31Var.zzb());
            case 11:
                return new c90((h20) p31Var.zzb());
            case 12:
                return OooO00o();
            case 13:
                C2163vl c2163vl9 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl9);
                na0 na0Var = new na0(c2163vl9, 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) p31Var.zzb();
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoOOO)).booleanValue()) {
                    xa0 xa0Var = new xa0(na0Var, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoOOo)).intValue(), scheduledExecutorService);
                    int i = um0.f24660OooOo;
                    tn0Var = new tn0(xa0Var);
                } else {
                    int i2 = um0.f24660OooOo;
                    tn0Var = nn0.f21519OooOooo;
                }
                ii0.Oooo000(tn0Var);
                return tn0Var;
            case 14:
                C2163vl c2163vl10 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl10);
                return new xa0(new na0(c2163vl10, 1), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00Oo)).intValue(), (ScheduledExecutorService) p31Var.zzb());
            case 15:
                C2163vl c2163vl11 = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl11);
                return new o90(4, c2163vl11, (p30) p31Var.zzb());
            case 16:
                return new k90((jd0) p31Var.zzb(), 4);
            case 17:
                return new ec0((he0) p31Var.zzb());
            case 18:
                return new bd0((he0) p31Var.zzb());
            case 19:
                return new xd0((C1663i1) p31Var.zzb());
            case 20:
                return new C2248xw((ge0) p31Var.zzb(), AbstractC2200wl.f25327OooO0oO);
            case 21:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) p31Var.zzb()));
                ii0.Oooo000(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            case 22:
                return new mf0((nf0) p31Var.zzb());
            case 23:
                return new mf0((nf0) p31Var.zzb());
            case 24:
                return new eg0((s50) p31Var.zzb());
            case 25:
                return new ng0((rg0) p31Var.zzb());
            default:
                return new sj0((h20) p31Var.zzb(), 29);
        }
    }
}
