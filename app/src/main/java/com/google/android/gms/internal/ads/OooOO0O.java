package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class OooOO0O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public long f16808OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f16809OooO0O0;

    public OooOO0O(int i) {
        switch (i) {
            case 1:
                this.f16808OooO00o = 60L;
                this.f16809OooO0O0 = o000Oooo.o00000O0.f30610OooO;
                break;
            default:
                this.f16808OooO00o = -9223372036854775807L;
                this.f16809OooO0O0 = -9223372036854775807L;
                break;
        }
    }

    public void OooO00o(long j) {
        if (j >= 0) {
            this.f16809OooO0O0 = j;
            return;
        }
        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
    }

    public OooOO0O(OooOO0O oooOO0O) {
        this.f16808OooO00o = oooOO0O.f16808OooO00o;
        this.f16809OooO0O0 = oooOO0O.f16809OooO0O0;
    }

    public OooOO0O(long j, long j2, int i) {
        this.f16808OooO00o = j;
        this.f16809OooO0O0 = j2;
    }
}
