package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class aa1 implements o000O {

    /* renamed from: OooO, reason: collision with root package name */
    public long[] f16991OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final y91 f16992OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOOO.OooO0O0 f16993OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final oOo0o00 f16994OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O f16995OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public o0OoOo0 f16996OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public v91 f16997OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public int f16998OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public long[] f16999OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public int[] f17000OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public int[] f17001OooOO0O;
    public long[] OooOO0o;

    /* renamed from: OooOOO, reason: collision with root package name */
    public int f17002OooOOO;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public o000O0O0[] f17003OooOOO0;

    /* renamed from: OooOOOO, reason: collision with root package name */
    public int f17004OooOOOO;

    /* renamed from: OooOOOo, reason: collision with root package name */
    public int f17005OooOOOo;

    /* renamed from: OooOOo, reason: collision with root package name */
    public long f17006OooOOo;

    /* renamed from: OooOOo0, reason: collision with root package name */
    public int f17007OooOOo0;

    /* renamed from: OooOOoo, reason: collision with root package name */
    public long f17008OooOOoo;

    /* renamed from: OooOo, reason: collision with root package name */
    public o0OoOo0 f17009OooOo;
    public boolean OooOo0;

    /* renamed from: OooOo00, reason: collision with root package name */
    public long f17010OooOo00;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public boolean f17011OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public boolean f17012OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public boolean f17013OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public boolean f17014OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public pd0 f17015OooOoOO;

    public aa1(eb1 eb1Var, o0O o0o, o71 o71Var) {
        this.f16995OooO0Oo = o0o;
        y91 y91Var = new y91();
        y91Var.f25878OooO0o = eb1Var;
        y91Var.f25875OooO0O0 = new r40(32);
        OoooOOO.oO0O0 oo0o0 = new OoooOOO.oO0O0(0L);
        y91Var.f25876OooO0OO = oo0o0;
        y91Var.f25877OooO0Oo = oo0o0;
        y91Var.f25879OooO0o0 = oo0o0;
        this.f16992OooO00o = y91Var;
        this.f16993OooO0O0 = new OooOOOO.OooO0O0(3);
        this.f16998OooO0oO = 1000;
        this.f16999OooO0oo = new long[1000];
        this.f16991OooO = new long[1000];
        this.OooOO0o = new long[1000];
        this.f17001OooOO0O = new int[1000];
        this.f17000OooOO0 = new int[1000];
        this.f17003OooOOO0 = new o000O0O0[1000];
        this.f16994OooO0OO = new oOo0o00(new g61(6));
        this.f17006OooOOo = Long.MIN_VALUE;
        this.f17008OooOOoo = Long.MIN_VALUE;
        this.f17010OooOo00 = Long.MIN_VALUE;
        this.f17012OooOo0o = true;
        this.f17011OooOo0O = true;
        this.f17014OooOoO0 = true;
    }

    public final int OooO(int i) {
        int i2 = this.f17005OooOOOo + i;
        int i3 = this.f16998OooO0oO;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:21:0x003f, B:23:0x0044, B:27:0x005a, B:30:0x0061, B:34:0x0069, B:39:0x00a4, B:60:0x0116, B:62:0x011f, B:41:0x00bf, B:43:0x00c3, B:45:0x00dc, B:49:0x00e5, B:50:0x00ea, B:52:0x00f0, B:56:0x00fe, B:58:0x0103, B:59:0x0113, B:68:0x018d), top: B:71:0x003f }] */
    @Override // com.google.android.gms.internal.ads.o000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(long r10, int r12, int r13, int r14, com.google.android.gms.internal.ads.o000O0O0 r15) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa1.OooO00o(long, int, int, int, com.google.android.gms.internal.ads.o000O0O0):void");
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final int OooO0O0(q51 q51Var, int i, boolean z) throws EOFException {
        y91 y91Var = this.f16992OooO00o;
        int iOooO0OO = y91Var.OooO0OO(i);
        OoooOOO.oO0O0 oo0o0 = (OoooOOO.oO0O0) y91Var.f25879OooO0o0;
        bb1 bb1Var = (bb1) oo0o0.f14695OooOo;
        byte[] bArr = bb1Var.f17472OooO00o;
        long j = y91Var.f25874OooO00o - oo0o0.f14696OooOo0O;
        bb1Var.getClass();
        int iOooOO0 = q51Var.OooOO0(bArr, (int) j, iOooO0OO);
        if (iOooOO0 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j2 = y91Var.f25874OooO00o + iOooOO0;
        y91Var.f25874OooO00o = j2;
        OoooOOO.oO0O0 oo0o02 = (OoooOOO.oO0O0) y91Var.f25879OooO0o0;
        if (j2 == oo0o02.f14697OooOo0o) {
            y91Var.f25879OooO0o0 = (OoooOOO.oO0O0) oo0o02.f14698OooOoO0;
        }
        return iOooOO0;
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final int OooO0OO(q51 q51Var, int i, boolean z) {
        return OooO0O0(q51Var, i, z);
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final void OooO0Oo(int i, r40 r40Var) {
        OooO0o(r40Var, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.o000O
    public final void OooO0o(r40 r40Var, int i, int i2) {
        while (true) {
            y91 y91Var = this.f16992OooO00o;
            if (i <= 0) {
                y91Var.getClass();
                return;
            }
            int iOooO0OO = y91Var.OooO0OO(i);
            OoooOOO.oO0O0 oo0o0 = (OoooOOO.oO0O0) y91Var.f25879OooO0o0;
            bb1 bb1Var = (bb1) oo0o0.f14695OooOo;
            byte[] bArr = bb1Var.f17472OooO00o;
            long j = y91Var.f25874OooO00o - oo0o0.f14696OooOo0O;
            bb1Var.getClass();
            r40Var.OooO0o(bArr, (int) j, iOooO0OO);
            i -= iOooO0OO;
            long j2 = y91Var.f25874OooO00o + iOooO0OO;
            y91Var.f25874OooO00o = j2;
            OoooOOO.oO0O0 oo0o02 = (OoooOOO.oO0O0) y91Var.f25879OooO0o0;
            if (j2 == oo0o02.f14697OooOo0o) {
                y91Var.f25879OooO0o0 = (OoooOOO.oO0O0) oo0o02.f14698OooOoO0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x003a, B:19:0x0055, B:18:0x0053), top: B:29:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.o000O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o0(com.google.android.gms.internal.ads.o0OoOo0 r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r4.f17012OooOo0o = r0     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.o0OoOo0 r1 = r4.f17009OooOo     // Catch: java.lang.Throwable -> L51
            boolean r1 = java.util.Objects.equals(r5, r1)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto Le
            monitor-exit(r4)
            goto L68
        Le:
            com.google.android.gms.internal.ads.oOo0o00 r1 = r4.f16994OooO0OO     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = r1.f22919OooOo     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L51
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L51
            r2 = 1
            if (r1 != 0) goto L1d
            r1 = r2
            goto L1e
        L1d:
            r1 = r0
        L1e:
            if (r1 != 0) goto L53
            com.google.android.gms.internal.ads.oOo0o00 r1 = r4.f16994OooO0OO     // Catch: java.lang.Throwable -> L51
            java.lang.Object r1 = r1.f22919OooOo     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L51
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L51
            int r3 = r3 + (-1)
            java.lang.Object r1 = r1.valueAt(r3)     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.z91 r1 = (com.google.android.gms.internal.ads.z91) r1     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.o0OoOo0 r1 = r1.f26133OooO00o     // Catch: java.lang.Throwable -> L51
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L53
            com.google.android.gms.internal.ads.oOo0o00 r5 = r4.f16994OooO0OO     // Catch: java.lang.Throwable -> L51
            java.lang.Object r5 = r5.f22919OooOo     // Catch: java.lang.Throwable -> L51
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L51
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L51
            int r1 = r1 + (-1)
            java.lang.Object r5 = r5.valueAt(r1)     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.z91 r5 = (com.google.android.gms.internal.ads.z91) r5     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.o0OoOo0 r5 = r5.f26133OooO00o     // Catch: java.lang.Throwable -> L51
            r4.f17009OooOo = r5     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r5 = move-exception
            goto L76
        L53:
            r4.f17009OooOo = r5     // Catch: java.lang.Throwable -> L51
        L55:
            boolean r5 = r4.f17014OooOoO0     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.o0OoOo0 r1 = r4.f17009OooOo     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r1.f22222OooOOO0     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = r1.f22219OooOO0     // Catch: java.lang.Throwable -> L51
            boolean r1 = com.google.android.gms.internal.ads.AbstractC1813m4.OooO0o(r3, r1)     // Catch: java.lang.Throwable -> L51
            r5 = r5 & r1
            r4.f17014OooOoO0 = r5     // Catch: java.lang.Throwable -> L51
            r4.f17013OooOoO = r0     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)
            r0 = r2
        L68:
            com.google.android.gms.internal.ads.v91 r5 = r4.f16997OooO0o0
            if (r5 == 0) goto L75
            if (r0 == 0) goto L75
            android.os.Handler r0 = r5.f24906Oooo0
            com.google.android.gms.internal.ads.q91 r5 = r5.f24908Oooo00O
            r0.post(r5)
        L75:
            return
        L76:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aa1.OooO0o0(com.google.android.gms.internal.ads.o0OoOo0):void");
    }

    public final synchronized boolean OooO0oO(long j, boolean z) {
        aa1 aa1Var;
        long j2;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f17007OooOOo0 = 0;
                        y91 y91Var = this.f16992OooO00o;
                        y91Var.f25877OooO0Oo = (OoooOOO.oO0O0) y91Var.f25876OooO0OO;
                        int iOooO = OooO(0);
                        int i = this.f17007OooOOo0;
                        int iOooO0oo = this.f17002OooOOO;
                        if ((i != iOooO0oo) && j >= this.OooOO0o[iOooO]) {
                            if (j > this.f17010OooOo00) {
                                if (z) {
                                    z = true;
                                }
                            }
                            if (this.f17014OooOoO0) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 < iOooO0oo) {
                                        try {
                                            if (this.OooOO0o[iOooO] >= j) {
                                                aa1Var = this;
                                                j2 = j;
                                                iOooO0oo = i2;
                                                break;
                                            }
                                            iOooO++;
                                            if (iOooO == this.f16998OooO0oO) {
                                                iOooO = 0;
                                            }
                                            i2++;
                                        } catch (Throwable th) {
                                            Throwable th2 = th;
                                            throw th2;
                                        }
                                    } else {
                                        aa1Var = this;
                                        j2 = j;
                                        if (!z) {
                                            iOooO0oo = -1;
                                        }
                                    }
                                }
                            } else {
                                aa1Var = this;
                                j2 = j;
                                iOooO0oo = aa1Var.OooO0oo(iOooO, iOooO0oo, j2, true);
                            }
                            if (iOooO0oo != -1) {
                                aa1Var.f17006OooOOo = j2;
                                aa1Var.f17007OooOOo0 += iOooO0oo;
                                return true;
                            }
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        throw th2;
                    }
                } finally {
                    th = th;
                    while (true) {
                        Throwable th4 = th;
                        try {
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final int OooO0oo(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.OooOO0o[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f17001OooOO0O[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f16998OooO0oO) {
                i = 0;
            }
        }
        return i3;
    }

    public final long OooOO0(int i) {
        long j = this.f17008OooOOoo;
        long jMax = Long.MIN_VALUE;
        int i2 = 0;
        if (i != 0) {
            int iOooO = OooO(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.OooOO0o[iOooO]);
                if ((this.f17001OooOO0O[iOooO] & 1) != 0) {
                    break;
                }
                iOooO--;
                if (iOooO == -1) {
                    iOooO = this.f16998OooO0oO - 1;
                }
            }
        }
        this.f17008OooOOoo = Math.max(j, jMax);
        this.f17002OooOOO -= i;
        int i4 = this.f17004OooOOOO + i;
        this.f17004OooOOOO = i4;
        int i5 = this.f17005OooOOOo + i;
        this.f17005OooOOOo = i5;
        int i6 = this.f16998OooO0oO;
        if (i5 >= i6) {
            this.f17005OooOOOo = i5 - i6;
        }
        int i7 = this.f17007OooOOo0 - i;
        this.f17007OooOOo0 = i7;
        if (i7 < 0) {
            this.f17007OooOOo0 = 0;
        }
        while (true) {
            oOo0o00 ooo0o00 = this.f16994OooO0OO;
            SparseArray sparseArray = (SparseArray) ooo0o00.f22919OooOo;
            if (i2 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            ((g61) ooo0o00.f22922OooOoO0).mo13701zza(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i9 = ooo0o00.f22921OooOo0o;
            if (i9 > 0) {
                ooo0o00.f22921OooOo0o = i9 - 1;
            }
            i2 = i8;
        }
        if (this.f17002OooOOO != 0) {
            return this.f16991OooO[this.f17005OooOOOo];
        }
        int i10 = this.f17005OooOOOo;
        if (i10 == 0) {
            i10 = this.f16998OooO0oO;
        }
        return this.f16991OooO[i10 - 1] + this.f17000OooOO0[r12];
    }

    public final void OooOO0O(o0OoOo0 o0oooo0, dx0 dx0Var) {
        o0OoOo0 o0oooo02 = this.f16996OooO0o;
        b91 b91Var = o0oooo02 == null ? null : o0oooo02.f22226OooOOo0;
        this.f16996OooO0o = o0oooo0;
        b91 b91Var2 = o0oooo0.f22226OooOOo0;
        o0O o0o = this.f16995OooO0Oo;
        o0o.getClass();
        b91 b91Var3 = o0oooo0.f22226OooOOo0;
        int i = b91Var3 != null ? 1 : 0;
        jb1 jb1Var = new jb1(o0oooo0);
        jb1Var.f20271Oooo00o = i;
        dx0Var.f18419OooOo0o = new o0OoOo0(jb1Var);
        dx0Var.f18417OooOo = this.f17015OooOoOO;
        if (o0oooo02 == null || !Objects.equals(b91Var, b91Var2)) {
            o0o.getClass();
            pd0 pd0Var = b91Var3 != null ? new pd0(new m71(new r71()), 11) : null;
            this.f17015OooOoOO = pd0Var;
            dx0Var.f18417OooOo = pd0Var;
        }
    }

    public final void OooOO0o() {
        long jOooOO0;
        y91 y91Var = this.f16992OooO00o;
        synchronized (this) {
            int i = this.f17002OooOOO;
            jOooOO0 = i == 0 ? -1L : OooOO0(i);
        }
        y91Var.OooO0O0(jOooOO0);
    }

    public final synchronized boolean OooOOO(boolean z) {
        int i = this.f17007OooOOo0;
        boolean z2 = false;
        if (i != this.f17002OooOOO) {
            if (((z91) this.f16994OooO0OO.OooO0O0(this.f17004OooOOOO + i)).f26133OooO00o != this.f16996OooO0o) {
                return true;
            }
            int iOooO = OooO(this.f17007OooOOo0);
            if (this.f17015OooOoOO != null) {
                int i2 = this.f17001OooOO0O[iOooO];
            } else {
                z2 = true;
            }
            return z2;
        }
        if (z || this.OooOo0) {
            z2 = true;
        } else {
            o0OoOo0 o0oooo0 = this.f17009OooOo;
            if (o0oooo0 != null) {
                if (o0oooo0 == this.f16996OooO0o) {
                    return false;
                }
                z2 = true;
            }
        }
        return z2;
    }

    public final void OooOOO0(boolean z) {
        SparseArray sparseArray;
        y91 y91Var = this.f16992OooO00o;
        OoooOOO.oO0O0 oo0o0 = (OoooOOO.oO0O0) y91Var.f25876OooO0OO;
        if (((bb1) oo0o0.f14695OooOo) != null) {
            eb1 eb1Var = (eb1) y91Var.f25878OooO0o;
            synchronized (eb1Var) {
                OoooOOO.oO0O0 oo0o02 = oo0o0;
                while (oo0o02 != null) {
                    try {
                        bb1[] bb1VarArr = eb1Var.f18560OooO0Oo;
                        int i = eb1Var.f18559OooO0OO;
                        eb1Var.f18559OooO0OO = i + 1;
                        bb1 bb1Var = (bb1) oo0o02.f14695OooOo;
                        bb1Var.getClass();
                        bb1VarArr[i] = bb1Var;
                        eb1Var.f18558OooO0O0--;
                        oo0o02 = (OoooOOO.oO0O0) oo0o02.f14698OooOoO0;
                        if (oo0o02 == null || ((bb1) oo0o02.f14695OooOo) == null) {
                            oo0o02 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                eb1Var.notifyAll();
            }
            oo0o0.f14695OooOo = null;
            oo0o0.f14698OooOoO0 = null;
        }
        OoooOOO.oO0O0 oo0o03 = (OoooOOO.oO0O0) y91Var.f25876OooO0OO;
        int i2 = 0;
        af0.OooooO0(((bb1) oo0o03.f14695OooOo) == null);
        oo0o03.f14696OooOo0O = 0L;
        oo0o03.f14697OooOo0o = 65536L;
        OoooOOO.oO0O0 oo0o04 = (OoooOOO.oO0O0) y91Var.f25876OooO0OO;
        y91Var.f25877OooO0Oo = oo0o04;
        y91Var.f25879OooO0o0 = oo0o04;
        y91Var.f25874OooO00o = 0L;
        ((eb1) y91Var.f25878OooO0o).OooO0O0();
        this.f17002OooOOO = 0;
        this.f17004OooOOOO = 0;
        this.f17005OooOOOo = 0;
        this.f17007OooOOo0 = 0;
        this.f17011OooOo0O = true;
        this.f17006OooOOo = Long.MIN_VALUE;
        this.f17008OooOOoo = Long.MIN_VALUE;
        this.f17010OooOo00 = Long.MIN_VALUE;
        this.OooOo0 = false;
        oOo0o00 ooo0o00 = this.f16994OooO0OO;
        while (true) {
            sparseArray = (SparseArray) ooo0o00.f22919OooOo;
            if (i2 >= sparseArray.size()) {
                break;
            }
            ((g61) ooo0o00.f22922OooOoO0).mo13701zza(sparseArray.valueAt(i2));
            i2++;
        }
        ooo0o00.f22921OooOo0o = -1;
        sparseArray.clear();
        if (z) {
            this.f17009OooOo = null;
            this.f17012OooOo0o = true;
            this.f17014OooOoO0 = true;
        }
    }
}
