package com.google.android.gms.internal.ads;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class o00O0 {

    /* renamed from: OooO00o */
    public final o0ooOOo f21737OooO00o;

    /* renamed from: OooO0O0 */
    public final oo0o0Oo f21738OooO0O0;

    /* renamed from: OooO0OO */
    public o0OOO0o f21739OooO0OO;

    /* renamed from: OooO0Oo */
    public final int f21740OooO0Oo;

    public o00O0(o0Oo0oo o0oo0oo, oo0o0Oo oo0o0oo, long j, long j2, long j3, long j4, long j5, int i) {
        this.f21738OooO0O0 = oo0o0oo;
        this.f21740OooO0Oo = i;
        this.f21737OooO00o = new o0ooOOo(o0oo0oo, j, j2, j3, j4, j5);
    }

    public static final int OooO0OO(o000000 o000000Var, long j, o0000O00 o0000o00) {
        if (j == o000000Var.f21650OooOoO0) {
            return 0;
        }
        o0000o00.f21668OooO00o = j;
        return 1;
    }

    public static /* bridge */ /* synthetic */ int OooO0Oo(int i, byte[] bArr) {
        return (bArr[i + 3] & ForkServer.ERROR) | ((bArr[i] & ForkServer.ERROR) << 24) | ((bArr[i + 1] & ForkServer.ERROR) << 16) | ((bArr[i + 2] & ForkServer.ERROR) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bc, code lost:
    
        return OooO0OO(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO00o(com.google.android.gms.internal.ads.o000000 r28, com.google.android.gms.internal.ads.o0000O00 r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            com.google.android.gms.internal.ads.o0OOO0o r3 = r0.f21739OooO0OO
            com.google.android.gms.internal.ads.af0.OooOo0O(r3)
            long r4 = r3.f22135OooO0o
            long r6 = r3.f22137OooO0oO
            long r8 = r3.f22138OooO0oo
            long r6 = r6 - r4
            int r10 = r0.f21740OooO0Oo
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            com.google.android.gms.internal.ads.oo0o0Oo r10 = r0.f21738OooO0O0
            if (r6 > 0) goto L26
            r0.f21739OooO0OO = r7
            r10.zzb()
            int r1 = OooO0OO(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.f21650OooOoO0
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lb8
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lb8
            int r4 = (int) r4
            r1.OooO(r4)
            r4 = 0
            r1.f21651OooOoOO = r4
            long r4 = r3.f22132OooO0O0
            com.google.android.gms.internal.ads.o0OO00O r4 = r10.OooO0Oo(r1, r4)
            r5 = -3
            int r6 = r4.f22076OooO00o
            if (r6 == r5) goto Lae
            r5 = -2
            long r8 = r4.f22077OooO0O0
            r15 = r11
            long r11 = r4.f22078OooO0OO
            if (r6 == r5) goto L8d
            r4 = -1
            if (r6 == r4) goto L6e
            long r3 = r1.f21650OooOoO0
            long r3 = r11 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L64
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 > 0) goto L64
            int r3 = (int) r3
            r1.OooO(r3)
        L64:
            r0.f21739OooO0OO = r7
            r10.zzb()
            int r1 = OooO0OO(r1, r11, r2)
            return r1
        L6e:
            r3.f22136OooO0o0 = r8
            r3.f22137OooO0oO = r11
            long r4 = r3.f22134OooO0Oo
            long r6 = r3.f22135OooO0o
            long r13 = r3.f22133OooO0OO
            r17 = r4
            long r4 = r3.f22132OooO0O0
            r15 = r4
            r21 = r6
            r19 = r8
            r23 = r11
            r25 = r13
            long r4 = com.google.android.gms.internal.ads.o0OOO0o.OooO00o(r15, r17, r19, r21, r23, r25)
            r3.f22138OooO0oo = r4
            goto L6
        L8d:
            r4 = r8
            r6 = r11
            r3.f22134OooO0Oo = r4
            r3.f22135OooO0o = r6
            long r8 = r3.f22136OooO0o0
            long r10 = r3.f22137OooO0oO
            long r12 = r3.f22133OooO0OO
            long r14 = r3.f22132OooO0O0
            r17 = r4
            r21 = r6
            r19 = r8
            r23 = r10
            r25 = r12
            r15 = r14
            long r4 = com.google.android.gms.internal.ads.o0OOO0o.OooO00o(r15, r17, r19, r21, r23, r25)
            r3.f22138OooO0oo = r4
            goto L6
        Lae:
            r0.f21739OooO0OO = r7
            r10.zzb()
            int r1 = OooO0OO(r1, r8, r2)
            return r1
        Lb8:
            int r1 = OooO0OO(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o00O0.OooO00o(com.google.android.gms.internal.ads.o000000, com.google.android.gms.internal.ads.o0000O00):int");
    }

    public final void OooO0O0(long j) {
        o0OOO0o o0ooo0o = this.f21739OooO0OO;
        if (o0ooo0o == null || o0ooo0o.f22131OooO00o != j) {
            o0ooOOo o0ooooo = this.f21737OooO00o;
            long jOooOO0 = o0ooooo.f22279OooO00o.OooOO0(j);
            long j2 = o0ooooo.f22284OooO0o0;
            long j3 = o0ooooo.f22283OooO0o;
            long j4 = o0ooooo.f22281OooO0OO;
            long j5 = o0ooooo.f22282OooO0Oo;
            o0OOO0o o0ooo0o2 = new o0OOO0o();
            o0ooo0o2.f22131OooO00o = j;
            o0ooo0o2.f22132OooO0O0 = jOooOO0;
            o0ooo0o2.f22134OooO0Oo = 0L;
            o0ooo0o2.f22136OooO0o0 = j4;
            o0ooo0o2.f22135OooO0o = j5;
            o0ooo0o2.f22137OooO0oO = j2;
            o0ooo0o2.f22133OooO0OO = j3;
            o0ooo0o2.f22138OooO0oo = o0OOO0o.OooO00o(jOooOO0, 0L, j4, j5, j2, j3);
            this.f21739OooO0OO = o0ooo0o2;
        }
    }
}
