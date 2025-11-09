package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class fa1 implements ba1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ba1 f18909OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f18910OooO0O0;

    public fa1(ba1 ba1Var, long j) {
        this.f18909OooO00o = ba1Var;
        this.f18910OooO0O0 = j;
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final int OooO00o(long j) {
        return this.f18909OooO00o.OooO00o(j - this.f18910OooO0O0);
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final int OooO0O0(dx0 dx0Var, c41 c41Var, int i) {
        int iOooO0O0 = this.f18909OooO00o.OooO0O0(dx0Var, c41Var, i);
        if (iOooO0O0 != -4) {
            return iOooO0O0;
        }
        c41Var.f17683OooO0oO += this.f18910OooO0O0;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final void zzd() {
        this.f18909OooO00o.zzd();
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final boolean zze() {
        return this.f18909OooO00o.zze();
    }
}
