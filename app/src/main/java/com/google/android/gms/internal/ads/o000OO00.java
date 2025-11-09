package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class o000OO00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f21711OooO00o = new byte[10];

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f21712OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f21713OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f21714OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f21715OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21716OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f21717OooO0oO;

    public final void OooO00o(o000O o000o, o000O0O0 o000o0o02) {
        if (this.f21713OooO0OO > 0) {
            o000o.OooO00o(this.f21714OooO0Oo, this.f21716OooO0o0, this.f21715OooO0o, this.f21717OooO0oO, o000o0o02);
            this.f21713OooO0OO = 0;
        }
    }

    public final void OooO0O0(o000O o000o, long j, int i, int i2, int i3, o000O0O0 o000o0o02) {
        if (!(this.f21717OooO0oO <= i2 + i3)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f21712OooO0O0) {
            int i4 = this.f21713OooO0OO;
            int i5 = i4 + 1;
            this.f21713OooO0OO = i5;
            if (i4 == 0) {
                this.f21714OooO0Oo = j;
                this.f21716OooO0o0 = i;
                this.f21715OooO0o = 0;
            }
            this.f21715OooO0o += i2;
            this.f21717OooO0oO = i3;
            if (i5 >= 16) {
                OooO00o(o000o, o000o0o02);
            }
        }
    }

    public final void OooO0OO(o00000OO o00000oo2) {
        if (this.f21712OooO0O0) {
            return;
        }
        byte[] bArr = this.f21711OooO00o;
        o00000oo2.OooOO0o(bArr, 0, 10);
        o00000oo2.zzj();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f21712OooO0O0 = true;
        }
    }
}
