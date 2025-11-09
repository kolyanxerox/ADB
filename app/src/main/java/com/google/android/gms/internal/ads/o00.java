package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class o00 implements o00000O {

    /* renamed from: OooOOO, reason: collision with root package name */
    public static final byte[] f21626OooOOO;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public static final byte[] f21628OooOOOO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public boolean f21631OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public long f21632OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f21633OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f21635OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public v91 f21636OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public o000O f21637OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public o0000oo f21638OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f21639OooOO0O;
    public static final int[] OooOO0o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f21627OooOOO0 = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f21630OooO00o = new byte[1];

    /* renamed from: OooO0o, reason: collision with root package name */
    public int f21634OooO0o = -1;

    /* renamed from: OooO, reason: collision with root package name */
    public o000O f21629OooO = new o00000O0();

    static {
        int i = i80.f19994OooO00o;
        Charset charset = StandardCharsets.UTF_8;
        f21626OooOOO = "#!AMR\n".getBytes(charset);
        f21628OooOOOO = "#!AMR-WB\n".getBytes(charset);
    }

    public final boolean OooO00o(o000000 o000000Var) {
        o000000Var.f21651OooOoOO = 0;
        byte[] bArr = f21626OooOOO;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        o000000Var.OooO0o(bArr2, 0, length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f21631OooO0O0 = false;
            o000000Var.OooO(bArr.length);
            return true;
        }
        o000000Var.f21651OooOoOO = 0;
        byte[] bArr3 = f21628OooOOOO;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        o000000Var.OooO0o(bArr4, 0, length2, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f21631OooO0O0 = true;
        o000000Var.OooO(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0O0(long j, long j2) {
        this.f21632OooO0OO = 0L;
        this.f21633OooO0Oo = 0;
        this.f21635OooO0o0 = 0;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) {
        return OooO00o((o000000) o00000oo2);
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        v91 v91Var = (v91) o0000ooo;
        this.f21636OooO0oO = v91Var;
        o000O o000oOooO0oO = v91Var.OooO0oO(0, 1);
        this.f21637OooO0oo = o000oOooO0oO;
        this.f21629OooO = o000oOooO0oO;
        v91Var.OooO0OO();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0 A[Catch: EOFException -> 0x00e3, TryCatch #0 {EOFException -> 0x00e3, blocks: (B:24:0x0071, B:26:0x0082, B:40:0x00a0, B:43:0x00a7, B:42:0x00a4, B:50:0x00b9, B:51:0x00d1, B:52:0x00d2, B:53:0x00e2), top: B:70:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4 A[Catch: EOFException -> 0x00e3, TryCatch #0 {EOFException -> 0x00e3, blocks: (B:24:0x0071, B:26:0x0082, B:40:0x00a0, B:43:0x00a7, B:42:0x00a4, B:50:0x00b9, B:51:0x00d1, B:52:0x00d2, B:53:0x00e2), top: B:70:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ee  */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0o0(com.google.android.gms.internal.ads.o00000OO r22, com.google.android.gms.internal.ads.o0000O00 r23) throws com.google.android.gms.internal.ads.C2185w6 {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o00.OooO0o0(com.google.android.gms.internal.ads.o00000OO, com.google.android.gms.internal.ads.o0000O00):int");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}
