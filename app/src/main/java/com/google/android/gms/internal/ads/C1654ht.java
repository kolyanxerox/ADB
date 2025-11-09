package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ht */
/* loaded from: classes2.dex */
public final class C1654ht implements vp0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C1727jt f19849OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f19850OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOo0.o0OOO0o f19851OooOo0o;

    public /* synthetic */ C1654ht(C1727jt c1727jt, OooOOo0.o0OOO0o o0ooo0o, int i) {
        this.f19850OooOo0O = i;
        this.f19851OooOo0o = o0ooo0o;
        this.f19849OooOo = c1727jt;
    }

    @Override // com.google.android.gms.internal.ads.vp0
    public final void zza(Throwable th) {
        switch (this.f19850OooOo0O) {
            case 0:
                this.f19851OooOo0o.zza(th);
                AbstractC2200wl.f25325OooO0o.execute(new RunnableC1442c1(this.f19849OooOo, 23));
                break;
            default:
                AbstractC2200wl.f25325OooO0o.execute(new RunnableC1442c1(this.f19849OooOo, 23));
                this.f19851OooOo0o.zza(th);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.vp0
    /* renamed from: zzb */
    public final void mo13705zzb(Object obj) {
        switch (this.f19850OooOo0O) {
            case 0:
                List list = ((C1543et) obj).f18696OooO00o;
                OooOOo0.o0OOO0o o0ooo0o = this.f19851OooOo0o;
                C1727jt c1727jt = this.f19849OooOo;
                cq0 cq0Var = (cq0) c1727jt.f20386OooOo0o;
                if (list != null && !list.isEmpty()) {
                    o00000oO.OooOOO oooOOOOoOO = yp0.f25991OooOo0o;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        oooOOOOoOO = ii0.ooOO(ii0.OoooOoO(oooOOOOoOO, Throwable.class, new C2043sc(o0ooo0o, 3), cq0Var), new C1617gt(c1727jt, o0ooo0o, (o00000oO.OooOOO) it.next(), 0), cq0Var);
                    }
                    oooOOOOoOO.addListener(new wp0(0, oooOOOOoOO, new C1654ht(c1727jt, o0ooo0o, 1)), cq0Var);
                    break;
                } else {
                    cq0Var.execute(new RunnableC1580ft(o0ooo0o, 0));
                    break;
                }
                break;
            default:
                AbstractC2200wl.f25325OooO0o.execute(new RunnableC1442c1(this.f19849OooOo, 23));
                this.f19851OooOo0o.mo13705zzb((AbstractC1397at) obj);
                break;
        }
    }
}
