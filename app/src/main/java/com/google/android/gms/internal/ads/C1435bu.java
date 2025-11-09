package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.bu */
/* loaded from: classes2.dex */
public final class C1435bu implements InterfaceC2024ru, InterfaceC1989qw, InterfaceC1437bw, InterfaceC2283yu, InterfaceC1481d3 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final ScheduledExecutorService f17599OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final C2320zu f17600OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final kd0 f17601OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final cq0 f17603OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public ScheduledFuture f17604OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public final String f17605OooOoo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final jq0 f17602OooOoO = new jq0();

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final AtomicBoolean f17606OooOoo0 = new AtomicBoolean();

    public C1435bu(C2320zu c2320zu, kd0 kd0Var, ScheduledExecutorService scheduledExecutorService, cq0 cq0Var, String str) {
        this.f17600OooOo0O = c2320zu;
        this.f17601OooOo0o = kd0Var;
        this.f17599OooOo = scheduledExecutorService;
        this.f17603OooOoO0 = cq0Var;
        this.f17605OooOoo = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2283yu
    public final synchronized void OooO0o0(zze zzeVar) {
        try {
            if (this.f17602OooOoO.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f17604OooOoOO;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f17602OooOoO.OooO0oO(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1481d3
    public final void Ooooo00(C1444c3 c1444c3) {
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo0O)).booleanValue() && this.f17605OooOoo.equals("com.google.ads.mediation.admob.AdMobAdapter") && c1444c3.f17668OooOO0 && this.f17606OooOoo0.compareAndSet(false, true) && this.f17601OooOo0o.f20492OooO0o0 != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.f17600OooOo0O.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzc() {
        kd0 kd0Var = this.f17601OooOo0o;
        if (kd0Var.f20492OooO0o0 == 3) {
            return;
        }
        int i = kd0Var.f20533OoooOo0;
        if (i == 0 || i == 1) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo0O)).booleanValue() && this.f17605OooOoo.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f17600OooOo0O.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1437bw
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1437bw
    public final synchronized void zzj() {
        try {
            if (this.f17602OooOoO.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f17604OooOoOO;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f17602OooOoO.OooO0o(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989qw
    public final void zzk() {
        kd0 kd0Var = this.f17601OooOo0o;
        if (kd0Var.f20492OooO0o0 == 3) {
            return;
        }
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17805o000O)).booleanValue() && kd0Var.f20533OoooOo0 == 2) {
            int i = kd0Var.f20502OooOOo0;
            if (i == 0) {
                this.f17600OooOo0O.zza();
                return;
            }
            wj0 wj0Var = new wj0(this, 14);
            jq0 jq0Var = this.f17602OooOoO;
            jq0Var.addListener(new wp0(0, jq0Var, wj0Var), this.f17603OooOoO0);
            this.f17604OooOoOO = this.f17599OooOo.schedule(new RunnableC1442c1(this, 25), i, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989qw
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2024ru
    public final void OooO0oo(BinderC1460cj binderC1460cj, String str, String str2) {
    }
}
