package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class c61 implements g51 {

    /* renamed from: OooOo, reason: collision with root package name */
    public long f17705OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f17706OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public long f17707OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public C2260y7 f17708OooOoO0;

    @Override // com.google.android.gms.internal.ads.g51
    public final void OooO00o(C2260y7 c2260y7) {
        if (this.f17706OooOo0O) {
            OooO0O0(zza());
        }
        this.f17708OooOoO0 = c2260y7;
    }

    public final void OooO0O0(long j) {
        this.f17707OooOo0o = j;
        if (this.f17706OooOo0O) {
            this.f17705OooOo = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.g51
    public final long zza() {
        long j = this.f17707OooOo0o;
        if (!this.f17706OooOo0O) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f17705OooOo;
        return this.f17708OooOoO0.f25860OooO00o == 1.0f ? i80.OooOOoo(jElapsedRealtime) + j : (jElapsedRealtime * r4.f25862OooO0OO) + j;
    }

    @Override // com.google.android.gms.internal.ads.g51
    public final C2260y7 zzc() {
        return this.f17708OooOoO0;
    }

    @Override // com.google.android.gms.internal.ads.g51
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}
