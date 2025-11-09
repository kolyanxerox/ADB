package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class o0OOO00 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public int f22121OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public long f22122OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public int f22123OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public int f22124OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public int f22126OooO0o0;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int[] f22125OooO0o = new int[255];

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final r40 f22127OooO0oO = new r40(255);

    public final boolean OooO00o(o000000 o000000Var, boolean z) throws C2185w6, EOFException {
        boolean zOooO0o;
        boolean zOooO0o2;
        this.f22121OooO00o = 0;
        this.f22122OooO0O0 = 0L;
        this.f22123OooO0OO = 0;
        this.f22124OooO0Oo = 0;
        this.f22126OooO0o0 = 0;
        r40 r40Var = this.f22127OooO0oO;
        r40Var.OooO0oO(27);
        try {
            zOooO0o = o000000Var.OooO0o(r40Var.f23745OooO00o, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zOooO0o = false;
        }
        if (zOooO0o && r40Var.OooOooO() == 1332176723) {
            if (r40Var.OooOo0O() == 0) {
                this.f22121OooO00o = r40Var.OooOo0O();
                this.f22122OooO0O0 = r40Var.OooOoOO();
                r40Var.OooOoo0();
                r40Var.OooOoo0();
                r40Var.OooOoo0();
                int iOooOo0O = r40Var.OooOo0O();
                this.f22123OooO0OO = iOooOo0O;
                this.f22124OooO0Oo = iOooOo0O + 27;
                r40Var.OooO0oO(iOooOo0O);
                try {
                    zOooO0o2 = o000000Var.OooO0o(r40Var.f23745OooO00o, 0, this.f22123OooO0OO, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zOooO0o2 = false;
                }
                if (zOooO0o2) {
                    for (int i = 0; i < this.f22123OooO0OO; i++) {
                        int iOooOo0O2 = r40Var.OooOo0O();
                        this.f22125OooO0o[i] = iOooOo0O2;
                        this.f22126OooO0o0 += iOooOo0O2;
                    }
                    return true;
                }
            } else if (!z) {
                throw C2185w6.OooO0O0("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r13 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r12.f21650OooOoO0 >= r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        r0 = java.lang.Math.min(r12.f21652OooOoo0, 1);
        r12.OooOOOO(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r5 = r12;
        r0 = r5.OooOOO0(r12.f21647OooOo0O, 0, java.lang.Math.min(1, 4096), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        r5 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r0 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r5.f21650OooOoO0 += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r0 != (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r12 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0O0(com.google.android.gms.internal.ads.o000000 r12, long r13) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r11 = this;
            long r0 = r12.f21650OooOoO0
            long r2 = r12.zze()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            com.google.android.gms.internal.ads.af0.OoooO0(r0)
            com.google.android.gms.internal.ads.r40 r0 = r11.f22127OooO0oO
            r3 = 4
            r0.OooO0oO(r3)
        L18:
            r4 = -1
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 == 0) goto L28
            long r5 = r12.f21650OooOoO0
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 < 0) goto L28
            goto L47
        L28:
            byte[] r5 = r0.f23745OooO00o
            boolean r5 = r12.OooO0o(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2f
            goto L30
        L2f:
            r5 = r1
        L30:
            if (r5 == 0) goto L47
            r0.OooOO0(r1)
            long r4 = r0.OooOooO()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L43
            r12.f21651OooOoOO = r1
            return r2
        L43:
            r12.OooO(r2)
            goto L18
        L47:
            if (r4 == 0) goto L4f
            long r2 = r12.f21650OooOoO0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L79
        L4f:
            int r0 = r12.f21652OooOoo0
            r2 = 1
            int r0 = java.lang.Math.min(r0, r2)
            r12.OooOOOO(r0)
            if (r0 != 0) goto L6c
            r0 = 4096(0x1000, float:5.74E-42)
            int r8 = java.lang.Math.min(r2, r0)
            byte[] r6 = r12.f21647OooOo0O
            r7 = 0
            r9 = 0
            r10 = 1
            r5 = r12
            int r0 = r5.OooOOO0(r6, r7, r8, r9, r10)
            goto L6d
        L6c:
            r5 = r12
        L6d:
            r12 = -1
            if (r0 == r12) goto L76
            long r2 = r5.f21650OooOoO0
            long r6 = (long) r0
            long r2 = r2 + r6
            r5.f21650OooOoO0 = r2
        L76:
            r12 = -1
            if (r0 != r12) goto L7a
        L79:
            return r1
        L7a:
            r12 = r5
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o0OOO00.OooO0O0(com.google.android.gms.internal.ads.o000000, long):boolean");
    }
}
