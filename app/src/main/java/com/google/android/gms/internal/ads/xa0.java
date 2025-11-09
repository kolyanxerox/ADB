package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class xa0 implements kb0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final kb0 f25581OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f25582OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final ScheduledExecutorService f25583OooO0OO;

    public xa0(kb0 kb0Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f25581OooO00o = kb0Var;
        this.f25582OooO0O0 = j;
        this.f25583OooO0OO = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final int zza() {
        return this.f25581OooO00o.zza();
    }

    @Override // com.google.android.gms.internal.ads.kb0
    public final o00000oO.OooOOO zzb() {
        o00000oO.OooOOO oooOOOZzb = this.f25581OooO00o.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17851o000ooo)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.f25582OooO0O0;
        if (j > 0) {
            oooOOOZzb = ii0.o00Oo0(oooOOOZzb, j, timeUnit, this.f25583OooO0OO);
        }
        return ii0.OoooOoO(oooOOOZzb, Throwable.class, new C2043sc(this, 11), AbstractC2200wl.f25327OooO0oO);
    }
}
