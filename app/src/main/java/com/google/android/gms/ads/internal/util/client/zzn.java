package com.google.android.gms.ads.internal.util.client;

/* loaded from: classes2.dex */
final class zzn extends zzx {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f16186OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f16187OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final double f16188OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f16189OooO0Oo;

    public zzn(int i, int i2, double d, boolean z) {
        this.f16186OooO00o = i;
        this.f16187OooO0O0 = i2;
        this.f16188OooO0OO = d;
        this.f16189OooO0Oo = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzx) {
            zzx zzxVar = (zzx) obj;
            if (this.f16186OooO00o == zzxVar.zzc() && this.f16187OooO0O0 == zzxVar.zzb() && Double.doubleToLongBits(this.f16188OooO0OO) == Double.doubleToLongBits(zzxVar.zza()) && this.f16189OooO0Oo == zzxVar.zzd()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.f16188OooO0OO;
        return ((((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ ((((this.f16186OooO00o ^ 1000003) * 1000003) ^ this.f16187OooO0O0) * 1000003)) * 1000003) ^ (true != this.f16189OooO0Oo ? 1237 : 1231);
    }

    public final String toString() {
        return "PingStrategy{maxAttempts=" + this.f16186OooO00o + ", initialBackoffMs=" + this.f16187OooO0O0 + ", backoffMultiplier=" + this.f16188OooO0OO + ", bufferAfterMaxAttempts=" + this.f16189OooO0Oo + "}";
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final double zza() {
        return this.f16188OooO0OO;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzb() {
        return this.f16187OooO0O0;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final int zzc() {
        return this.f16186OooO00o;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzx
    public final boolean zzd() {
        return this.f16189OooO0Oo;
    }
}
