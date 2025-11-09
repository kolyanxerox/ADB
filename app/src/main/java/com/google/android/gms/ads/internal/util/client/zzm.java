package com.google.android.gms.ads.internal.util.client;

/* loaded from: classes2.dex */
final class zzm extends zzw {

    /* renamed from: OooO00o */
    public final int f16183OooO00o;

    /* renamed from: OooO0O0 */
    public final int f16184OooO0O0;

    /* renamed from: OooO0OO */
    public final boolean f16185OooO0OO;

    public zzm(int i, int i2, boolean z) {
        this.f16183OooO00o = i;
        this.f16184OooO0O0 = i2;
        this.f16185OooO0OO = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.f16183OooO00o == zzwVar.zzb() && this.f16184OooO0O0 == zzwVar.zza() && this.f16185OooO0OO == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f16185OooO0OO ? 1237 : 1231) ^ ((((this.f16183OooO00o ^ 1000003) * 1000003) ^ this.f16184OooO0O0) * 1000003);
    }

    public final String toString() {
        return "OfflineAdConfig{impressionPrerequisite=" + this.f16183OooO00o + ", clickPrerequisite=" + this.f16184OooO0O0 + ", notificationFlowEnabled=" + this.f16185OooO0OO + "}";
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.f16184OooO0O0;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.f16183OooO00o;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.f16185OooO0OO;
    }
}
