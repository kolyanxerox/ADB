package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class gi0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public String f19355OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f19356OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f19357OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f19358OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public byte f19359OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f19360OooO0o0;

    public final hi0 OooO00o() {
        String str;
        if (this.f19359OooO0o == 63 && (str = this.f19355OooO00o) != null) {
            return new hi0(str, this.f19356OooO0O0, this.f19357OooO0OO, this.f19358OooO0Oo, this.f19360OooO0o0);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f19355OooO00o == null) {
            sb.append(" clientVersion");
        }
        if ((this.f19359OooO0o & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f19359OooO0o & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f19359OooO0o & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f19359OooO0o & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f19359OooO0o & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f19359OooO0o & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
