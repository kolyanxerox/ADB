package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class i41 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final long f19944OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final long f19945OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f19946OooO0OO = -9223372036854775807L;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f19947OooO0Oo = -9223372036854775807L;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f19948OooO0o = -9223372036854775807L;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f19950OooO0oO = -9223372036854775807L;

    /* renamed from: OooO, reason: collision with root package name */
    public float f19943OooO = 1.0f;

    /* renamed from: OooOO0, reason: collision with root package name */
    public long f19952OooOO0 = -9223372036854775807L;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f19949OooO0o0 = -9223372036854775807L;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long f19951OooO0oo = -9223372036854775807L;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public long f19953OooOO0O = -9223372036854775807L;
    public long OooOO0o = -9223372036854775807L;

    public /* synthetic */ i41(long j, long j2) {
        this.f19944OooO00o = j;
        this.f19945OooO0O0 = j2;
    }

    public final long OooO00o() {
        return this.f19951OooO0oo;
    }

    public final void OooO0O0() {
        long j = this.f19951OooO0oo;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f19945OooO0O0;
        this.f19951OooO0oo = j2;
        long j3 = this.f19950OooO0oO;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f19951OooO0oo = j3;
        }
        this.f19952OooOO0 = -9223372036854775807L;
    }

    public final void OooO0OO() {
        long j;
        long j2 = this.f19946OooO0OO;
        if (j2 != -9223372036854775807L) {
            j = this.f19947OooO0Oo;
            if (j == -9223372036854775807L) {
                long j3 = this.f19948OooO0o;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.f19950OooO0oO;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f19949OooO0o0 == j) {
            return;
        }
        this.f19949OooO0o0 = j;
        this.f19951OooO0oo = j;
        this.f19953OooOO0O = -9223372036854775807L;
        this.OooOO0o = -9223372036854775807L;
        this.f19952OooOO0 = -9223372036854775807L;
    }
}
