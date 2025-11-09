package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public final class oO0OO00 implements o00000O {

    /* renamed from: OooO, reason: collision with root package name */
    public o00O0 f22659OooO;

    /* renamed from: OooO0o, reason: collision with root package name */
    public boolean f22664OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public boolean f22665OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public boolean f22666OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long f22667OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public v91 f22668OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public boolean f22669OooOO0O;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final h70 f22660OooO00o = new h70();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final r40 f22662OooO0OO = new r40(4096);

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray f22661OooO0O0 = new SparseArray();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final ooOOO00O f22663OooO0Oo = new ooOOO00O(0);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    @Override // com.google.android.gms.internal.ads.o00000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.h70 r5 = r4.f22660OooO00o
            monitor-enter(r5)
            long r0 = r5.f19585OooO0O0     // Catch: java.lang.Throwable -> L46
            monitor-exit(r5)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.OooO0Oo()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.OooO0o0(r7)
        L24:
            com.google.android.gms.internal.ads.o00O0 r5 = r4.f22659OooO
            r6 = 0
            if (r5 == 0) goto L2c
            r5.OooO0O0(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.f22661OooO0O0
            int r8 = r7.size()
            if (r5 >= r8) goto L45
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.ooo0o r7 = (com.google.android.gms.internal.ads.ooo0o) r7
            r7.f23072OooO0o = r6
            com.google.android.gms.internal.ads.oOo0000O r7 = r7.f23068OooO00o
            r7.zze()
            int r5 = r5 + 1
            goto L2d
        L45:
            return
        L46:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oO0OO00.OooO0O0(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final boolean OooO0OO(o00000OO o00000oo2) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        o000000 o000000Var = (o000000) o00000oo2;
        o000000Var.OooO0o(bArr, 0, 14, false);
        if ((((bArr[0] & ForkServer.ERROR) << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            o000000Var.OooO0oO(bArr[13] & 7, false);
            o000000Var.OooO0o(bArr, 0, 3, false);
            if ((((bArr[0] & ForkServer.ERROR) << 16) | ((bArr[1] & ForkServer.ERROR) << 8) | (bArr[2] & ForkServer.ERROR)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final void OooO0o(o0000Ooo o0000ooo) {
        this.f22668OooOO0 = (v91) o0000ooo;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final int OooO0o0(o00000OO o00000oo2, o0000O00 o0000o00) throws EOFException, InterruptedIOException {
        int i;
        long jOooO0O0;
        long j;
        oOo0000O oo0;
        af0.OooOo0O(this.f22668OooOO0);
        long j2 = ((o000000) o00000oo2).f21646OooOo;
        int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        long j3 = -9223372036854775807L;
        ooOOO00O ooooo00o = this.f22663OooO0Oo;
        if (i2 != 0 && !ooooo00o.f23041OooO0OO) {
            boolean z = ooooo00o.f23044OooO0o0;
            r40 r40Var = ooooo00o.f23040OooO0O0;
            if (!z) {
                o000000 o000000Var = (o000000) o00000oo2;
                long j4 = o000000Var.f21646OooOo;
                int iMin = (int) Math.min(20000L, j4);
                long j5 = j4 - iMin;
                if (o000000Var.f21650OooOoO0 != j5) {
                    o0000o00.f21668OooO00o = j5;
                    return 1;
                }
                r40Var.OooO0oO(iMin);
                o000000Var.f21651OooOoOO = 0;
                o000000Var.OooO0o(r40Var.f23745OooO00o, 0, iMin, false);
                int i3 = r40Var.f23746OooO0O0;
                int i4 = r40Var.f23747OooO0OO - 4;
                while (true) {
                    if (i4 < i3) {
                        break;
                    }
                    if (ooOOO00O.OooO0OO(i4, r40Var.f23745OooO00o) == 442) {
                        r40Var.OooOO0(i4 + 4);
                        long jOooO00o = ooOOO00O.OooO00o(r40Var);
                        if (jOooO00o != -9223372036854775807L) {
                            j3 = jOooO00o;
                            break;
                        }
                    }
                    i4--;
                }
                ooooo00o.f23045OooO0oO = j3;
                ooooo00o.f23044OooO0o0 = true;
                return 0;
            }
            if (ooooo00o.f23045OooO0oO == -9223372036854775807L) {
                byte[] bArr = i80.f19998OooO0o;
                int length = bArr.length;
                r40Var.OooO0oo(0, bArr);
                ooooo00o.f23041OooO0OO = true;
                ((o000000) o00000oo2).f21651OooOoOO = 0;
                return 0;
            }
            if (ooooo00o.f23042OooO0Oo) {
                long j6 = ooooo00o.f23043OooO0o;
                if (j6 == -9223372036854775807L) {
                    byte[] bArr2 = i80.f19998OooO0o;
                    int length2 = bArr2.length;
                    r40Var.OooO0oo(0, bArr2);
                    ooooo00o.f23041OooO0OO = true;
                    ((o000000) o00000oo2).f21651OooOoOO = 0;
                    return 0;
                }
                h70 h70Var = ooooo00o.f23039OooO00o;
                ooooo00o.f23046OooO0oo = h70Var.OooO0OO(ooooo00o.f23045OooO0oO) - h70Var.OooO0O0(j6);
                byte[] bArr3 = i80.f19998OooO0o;
                int length3 = bArr3.length;
                r40Var.OooO0oo(0, bArr3);
                ooooo00o.f23041OooO0OO = true;
                ((o000000) o00000oo2).f21651OooOoOO = 0;
                return 0;
            }
            o000000 o000000Var2 = (o000000) o00000oo2;
            int iMin2 = (int) Math.min(20000L, o000000Var2.f21646OooOo);
            if (o000000Var2.f21650OooOoO0 != 0) {
                o0000o00.f21668OooO00o = 0L;
                return 1;
            }
            r40Var.OooO0oO(iMin2);
            o000000Var2.f21651OooOoOO = 0;
            o000000Var2.OooO0o(r40Var.f23745OooO00o, 0, iMin2, false);
            int i5 = r40Var.f23746OooO0O0;
            int i6 = r40Var.f23747OooO0OO;
            while (true) {
                if (i5 >= i6 - 3) {
                    break;
                }
                if (ooOOO00O.OooO0OO(i5, r40Var.f23745OooO00o) == 442) {
                    r40Var.OooOO0(i5 + 4);
                    long jOooO00o2 = ooOOO00O.OooO00o(r40Var);
                    if (jOooO00o2 != -9223372036854775807L) {
                        j3 = jOooO00o2;
                        break;
                    }
                }
                i5++;
            }
            ooooo00o.f23043OooO0o = j3;
            ooooo00o.f23042OooO0Oo = true;
            return 0;
        }
        if (this.f22669OooOO0O) {
            i = i2;
        } else {
            this.f22669OooOO0O = true;
            long j7 = ooooo00o.f23046OooO0oo;
            if (j7 != -9223372036854775807L) {
                i = i2;
                o00O0 o00o0 = new o00O0(new o0O(12), new C2249xx(ooooo00o.f23039OooO00o), j7, j7 + 1, 0L, j2, 188L, 1000);
                this.f22659OooO = o00o0;
                this.f22668OooOO0.OooO(o00o0.f21737OooO00o);
            } else {
                i = i2;
                this.f22668OooOO0.OooO(new o0000oo(j7, 0L));
            }
        }
        o00O0 o00o02 = this.f22659OooO;
        if (o00o02 != null && o00o02.f21739OooO0OO != null) {
            return o00o02.OooO00o((o000000) o00000oo2, o0000o00);
        }
        o000000 o000000Var3 = (o000000) o00000oo2;
        o000000Var3.f21651OooOoOO = 0;
        long jZze = i != 0 ? j2 - o000000Var3.zze() : -1L;
        if (jZze != -1 && jZze < 4) {
            return -1;
        }
        r40 r40Var2 = this.f22662OooO0OO;
        if (!o000000Var3.OooO0o(r40Var2.f23745OooO00o, 0, 4, true)) {
            return -1;
        }
        r40Var2.OooOO0(0);
        int iOooOOo0 = r40Var2.OooOOo0();
        if (iOooOOo0 == 441) {
            return -1;
        }
        if (iOooOOo0 == 442) {
            o000000Var3.OooO0o(r40Var2.f23745OooO00o, 0, 10, false);
            r40Var2.OooOO0(9);
            o000000Var3.OooO((r40Var2.OooOo0O() & 7) + 14);
            return 0;
        }
        if (iOooOOo0 == 443) {
            o000000Var3.OooO0o(r40Var2.f23745OooO00o, 0, 2, false);
            r40Var2.OooOO0(0);
            o000000Var3.OooO(r40Var2.OooOoO() + 6);
            return 0;
        }
        if ((iOooOOo0 >> 8) != 1) {
            o000000Var3.OooO(1);
            return 0;
        }
        int i7 = iOooOOo0 & 255;
        SparseArray sparseArray = this.f22661OooO0O0;
        ooo0o ooo0oVar = (ooo0o) sparseArray.get(i7);
        if (!this.f22665OooO0o0) {
            if (ooo0oVar == null) {
                oOo0000O ooo0000o = null;
                if (i7 == 189) {
                    oO00o0 oo00o0 = new oO00o0(null, 0, 0);
                    this.f22664OooO0o = true;
                    this.f22667OooO0oo = o000000Var3.f21650OooOoO0;
                    ooo0000o = oo00o0;
                } else {
                    if ((iOooOOo0 & 224) == 192) {
                        oo0 = new oO0O0O0o(null, 0);
                        this.f22664OooO0o = true;
                        this.f22667OooO0oo = o000000Var3.f21650OooOoO0;
                    } else if ((iOooOOo0 & 240) == 224) {
                        oo0 = new oO0(null);
                        this.f22666OooO0oO = true;
                        this.f22667OooO0oo = o000000Var3.f21650OooOoO0;
                    }
                    ooo0000o = oo0;
                }
                if (ooo0000o != null) {
                    ooo0000o.OooO0Oo(this.f22668OooOO0, new oOo00o00(Integer.MIN_VALUE, i7, 256));
                    ooo0oVar = new ooo0o(ooo0000o, this.f22660OooO00o);
                    sparseArray.put(i7, ooo0oVar);
                }
            }
            long j8 = 1048576;
            if (this.f22664OooO0o && this.f22666OooO0oO) {
                j8 = 8192 + this.f22667OooO0oo;
            }
            if (o000000Var3.f21650OooOoO0 > j8) {
                this.f22665OooO0o0 = true;
                this.f22668OooOO0.OooO0OO();
            }
        }
        o000000Var3.OooO0o(r40Var2.f23745OooO00o, 0, 2, false);
        r40Var2.OooOO0(0);
        int iOooOoO = r40Var2.OooOoO() + 6;
        if (ooo0oVar == null) {
            o000000Var3.OooO(iOooOoO);
            return 0;
        }
        r40Var2.OooO0oO(iOooOoO);
        o000000Var3.OooO0o0(r40Var2.f23745OooO00o, 0, iOooOoO, false);
        r40Var2.OooOO0(6);
        o000OOo0 o000ooo02 = ooo0oVar.f23070OooO0OO;
        r40Var2.OooO0o(o000ooo02.f21725OooO0O0, 0, 3);
        o000ooo02.OooOOoo(0);
        o000ooo02.OooOo0(8);
        ooo0oVar.f23071OooO0Oo = o000ooo02.OooOo0o();
        ooo0oVar.f23073OooO0o0 = o000ooo02.OooOo0o();
        o000ooo02.OooOo0(6);
        r40Var2.OooO0o(o000ooo02.f21725OooO0O0, 0, o000ooo02.OooO0o(8));
        o000ooo02.OooOOoo(0);
        if (ooo0oVar.f23071OooO0Oo) {
            o000ooo02.OooOo0(4);
            long jOooO0o = o000ooo02.OooO0o(3);
            o000ooo02.OooOo0(1);
            int iOooO0o = o000ooo02.OooO0o(15) << 15;
            o000ooo02.OooOo0(1);
            long jOooO0o2 = o000ooo02.OooO0o(15);
            o000ooo02.OooOo0(1);
            boolean z2 = ooo0oVar.f23072OooO0o;
            h70 h70Var2 = ooo0oVar.f23069OooO0O0;
            if (z2 || !ooo0oVar.f23073OooO0o0) {
                j = jOooO0o;
            } else {
                o000ooo02.OooOo0(4);
                j = jOooO0o;
                o000ooo02.OooOo0(1);
                int iOooO0o2 = o000ooo02.OooO0o(15) << 15;
                o000ooo02.OooOo0(1);
                long jOooO0o3 = o000ooo02.OooO0o(15);
                o000ooo02.OooOo0(1);
                h70Var2.OooO0O0((o000ooo02.OooO0o(3) << 30) | iOooO0o2 | jOooO0o3);
                ooo0oVar.f23072OooO0o = true;
            }
            jOooO0O0 = h70Var2.OooO0O0((j << 30) | iOooO0o | jOooO0o2);
        } else {
            jOooO0O0 = 0;
        }
        oOo0000O ooo0000o2 = ooo0oVar.f23068OooO00o;
        ooo0000o2.OooO0OO(4, jOooO0O0);
        ooo0000o2.OooO0O0(r40Var2);
        ooo0000o2.OooO00o(false);
        r40Var2.OooO(r40Var2.f23745OooO00o.length);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.o00000O
    public final List zzd() {
        pm0 pm0Var = rm0.f23913OooOo0o;
        return gn0.f19388OooOoO;
    }
}
