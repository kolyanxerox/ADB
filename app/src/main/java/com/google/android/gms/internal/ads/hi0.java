package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class hi0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final String f19795OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f19796OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f19797OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final long f19798OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final long f19799OooO0o0;

    public hi0(String str, boolean z, boolean z2, long j, long j2) {
        this.f19795OooO00o = str;
        this.f19796OooO0O0 = z;
        this.f19797OooO0OO = z2;
        this.f19798OooO0Oo = j;
        this.f19799OooO0o0 = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return this.f19795OooO00o.equals(hi0Var.f19795OooO00o) && this.f19796OooO0O0 == hi0Var.f19796OooO0O0 && this.f19797OooO0OO == hi0Var.f19797OooO0OO && this.f19798OooO0Oo == hi0Var.f19798OooO0Oo && this.f19799OooO0o0 == hi0Var.f19799OooO0o0;
    }

    public final int hashCode() {
        return ((((((((((((this.f19795OooO00o.hashCode() ^ 1000003) * 1000003) ^ (true != this.f19796OooO0O0 ? 1237 : 1231)) * 1000003) ^ (true != this.f19797OooO0OO ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f19798OooO0Oo)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f19799OooO0o0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdShield2Options{clientVersion=");
        sb.append(this.f19795OooO00o);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(this.f19796OooO0O0);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(this.f19797OooO0OO);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(this.f19798OooO0Oo);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        return OooO0oO.OooOo.OooOOOO(sb, this.f19799OooO0o0, "}");
    }
}
