package com.google.android.gms.internal.ads;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class ooOOO00O {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final h70 f23039OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final r40 f23040OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public boolean f23041OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f23042OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f23043OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f23044OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f23045OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long f23046OooO0oo;

    public ooOOO00O(int i) {
        switch (i) {
            case 1:
                this.f23039OooO00o = new h70();
                this.f23043OooO0o = -9223372036854775807L;
                this.f23045OooO0oO = -9223372036854775807L;
                this.f23046OooO0oo = -9223372036854775807L;
                this.f23040OooO0O0 = new r40();
                break;
            default:
                this.f23039OooO00o = new h70();
                this.f23043OooO0o = -9223372036854775807L;
                this.f23045OooO0oO = -9223372036854775807L;
                this.f23046OooO0oo = -9223372036854775807L;
                this.f23040OooO0O0 = new r40();
                break;
        }
    }

    public static long OooO00o(r40 r40Var) {
        int i = r40Var.f23746OooO0O0;
        if (r40Var.OooOOOO() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        r40Var.OooO0o(bArr, 0, 9);
        r40Var.OooOO0(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    public static final int OooO0OO(int i, byte[] bArr) {
        return (bArr[i + 3] & ForkServer.ERROR) | ((bArr[i] & ForkServer.ERROR) << 24) | ((bArr[i + 1] & ForkServer.ERROR) << 16) | ((bArr[i + 2] & ForkServer.ERROR) << 8);
    }

    public void OooO0O0(o000000 o000000Var) {
        byte[] bArr = i80.f19998OooO0o;
        int length = bArr.length;
        this.f23040OooO0O0.OooO0oo(0, bArr);
        this.f23041OooO0OO = true;
        o000000Var.f21651OooOoOO = 0;
    }
}
