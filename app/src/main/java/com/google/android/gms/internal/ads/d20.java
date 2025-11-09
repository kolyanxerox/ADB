package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class d20 implements q31 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f18135OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final p31 f18136OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final p31 f18137OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final p31 f18138OooO0Oo;

    public /* synthetic */ d20(p31 p31Var, p31 p31Var2, p31 p31Var3, int i) {
        this.f18135OooO00o = i;
        this.f18136OooO0O0 = p31Var;
        this.f18137OooO0OO = p31Var2;
        this.f18138OooO0Oo = p31Var3;
    }

    public m90 OooO00o() {
        C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
        ii0.Oooo000(c2163vl);
        return new m90(c2163vl, this.f18136OooO0O0.zzb(), this.f18137OooO0OO.zzb(), this.f18138OooO0Oo.zzb(), 2);
    }

    @Override // com.google.android.gms.internal.ads.z31
    public final Object zzb() {
        switch (this.f18135OooO00o) {
            case 0:
                return new c20((f20) this.f18136OooO0O0.zzb(), (k20) this.f18137OooO0OO.zzb(), ((Integer) this.f18138OooO0Oo.zzb()).intValue());
            case 1:
                return new de0((ce0) this.f18136OooO0O0.zzb(), (s10) this.f18137OooO0OO.zzb(), (h20) this.f18138OooO0Oo.zzb(), false, 23);
            case 2:
                return OooO00o();
            case 3:
                C2163vl c2163vl = AbstractC2200wl.f25321OooO00o;
                ii0.Oooo000(c2163vl);
                na0 na0Var = new na0(c2163vl, 2);
                ma0 ma0Var = (ma0) this.f18136OooO0O0.zzb();
                List list = (List) this.f18137OooO0OO.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f18138OooO0Oo.zzb();
                if (list.contains("24")) {
                    return new xa0(ma0Var, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00OOo)).intValue(), scheduledExecutorService);
                }
                return new xa0(na0Var, ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0o00OOo)).intValue(), scheduledExecutorService);
            default:
                return new id0((fd0) this.f18136OooO0O0.zzb(), (bd0) this.f18137OooO0OO.zzb(), (sd0) this.f18138OooO0Oo.zzb());
        }
    }
}
