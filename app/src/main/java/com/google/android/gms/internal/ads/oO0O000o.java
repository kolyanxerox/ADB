package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class oO0O000o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final o000O f22569OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f22570OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f22571OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f22572OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f22573OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f22574OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f22575OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long f22576OooO0oo;

    public oO0O000o(o000O o000o) {
        this.f22569OooO00o = o000o;
    }

    public final void OooO00o(byte[] bArr, int i, int i2) {
        if (this.f22571OooO0OO) {
            int i3 = this.f22573OooO0o;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f22573OooO0o = (i2 - i) + i3;
            } else {
                this.f22572OooO0Oo = ((bArr[i4] & 192) >> 6) == 0;
                this.f22571OooO0OO = false;
            }
        }
    }

    public final void OooO0O0(int i, boolean z, long j) {
        af0.OooooO0(this.f22576OooO0oo != -9223372036854775807L);
        if (this.f22574OooO0o0 == 182 && z && this.f22570OooO0O0) {
            long j2 = j - this.f22575OooO0oO;
            this.f22569OooO00o.OooO00o(this.f22576OooO0oo, this.f22572OooO0Oo ? 1 : 0, (int) j2, i, null);
        }
        if (this.f22574OooO0o0 != 179) {
            this.f22575OooO0oO = j;
        }
    }
}
