package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.xu */
/* loaded from: classes2.dex */
public final class C2246xu extends p11 implements InterfaceC2172vu {

    /* renamed from: OooOo, reason: collision with root package name */
    public final ScheduledExecutorService f25801OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f25802OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public ScheduledFuture f25803OooOoO0;

    public C2246xu(C2209wu c2209wu, Set set, cq0 cq0Var, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f25802OooOoO = false;
        this.f25801OooOo = scheduledExecutorService;
        o00000o0(c2209wu, cq0Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2172vu
    public final void OooO0oo(zze zzeVar) {
        o0000Ooo(new p80(zzeVar, 12));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2172vu
    public final void OoooOOo(C2027rx c2027rx) {
        if (this.f25802OooOoO) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f25803OooOoO0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        o0000Ooo(new sj0(c2027rx, 13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2172vu
    public final void zzb() {
        o0000Ooo(new C2007rd(22));
    }

    public final void zzf() {
        this.f25803OooOoO0 = this.f25801OooOo.schedule(new RunnableC1442c1(this, 26), ((Integer) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0ooo)).intValue(), TimeUnit.MILLISECONDS);
    }
}
