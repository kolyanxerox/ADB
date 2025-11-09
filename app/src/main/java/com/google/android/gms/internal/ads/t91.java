package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class t91 implements ba1 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f24278OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ v91 f24279OooO0O0;

    public t91(v91 v91Var, int i) {
        this.f24279OooO0O0 = v91Var;
        this.f24278OooO00o = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    @Override // com.google.android.gms.internal.ads.ba1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO00o(long r14) {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.v91 r0 = r13.f24279OooO0O0
            int r1 = r13.f24278OooO00o
            boolean r2 = r0.OooOo0O()
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            r0.OooOOo(r1)
            com.google.android.gms.internal.ads.aa1[] r2 = r0.f24913Oooo0o0
            r4 = r2[r1]
            boolean r2 = r0.f24930OooooOo
            monitor-enter(r4)
            int r5 = r4.f17007OooOOo0     // Catch: java.lang.Throwable -> L4c
            r6 = r5
            int r5 = r4.OooO(r6)     // Catch: java.lang.Throwable -> L4c
            int r7 = r4.f17007OooOOo0     // Catch: java.lang.Throwable -> L4c
            int r8 = r4.f17002OooOOO     // Catch: java.lang.Throwable -> L4c
            r10 = 1
            if (r7 == r8) goto L26
            r7 = r10
            goto L27
        L26:
            r7 = r3
        L27:
            if (r7 == 0) goto L4f
            long[] r7 = r4.OooOO0o     // Catch: java.lang.Throwable -> L4c
            r11 = r7[r5]     // Catch: java.lang.Throwable -> L4c
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 >= 0) goto L32
            goto L4f
        L32:
            long r11 = r4.f17010OooOo00     // Catch: java.lang.Throwable -> L4c
            int r7 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r7 <= 0) goto L3e
            if (r2 != 0) goto L3b
            goto L3e
        L3b:
            int r8 = r8 - r6
            monitor-exit(r4)
            goto L51
        L3e:
            int r6 = r8 - r6
            r9 = 1
            r7 = r14
            int r8 = r4.OooO0oo(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L4c
            r14 = -1
            monitor-exit(r4)
            if (r8 != r14) goto L51
        L4a:
            r8 = r3
            goto L51
        L4c:
            r0 = move-exception
            r14 = r0
            goto L73
        L4f:
            monitor-exit(r4)
            goto L4a
        L51:
            monitor-enter(r4)
            if (r8 < 0) goto L5c
            int r14 = r4.f17007OooOOo0     // Catch: java.lang.Throwable -> L5e
            int r14 = r14 + r8
            int r15 = r4.f17002OooOOO     // Catch: java.lang.Throwable -> L5e
            if (r14 > r15) goto L5c
            goto L61
        L5c:
            r10 = r3
            goto L61
        L5e:
            r0 = move-exception
            r14 = r0
            goto L71
        L61:
            com.google.android.gms.internal.ads.af0.OoooO0(r10)     // Catch: java.lang.Throwable -> L5e
            int r14 = r4.f17007OooOOo0     // Catch: java.lang.Throwable -> L5e
            int r14 = r14 + r8
            r4.f17007OooOOo0 = r14     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            if (r8 != 0) goto L70
            r0.OooOOoo(r1)
            return r3
        L70:
            return r8
        L71:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            throw r14
        L73:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4c
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t91.OooO00o(long):int");
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final int OooO0O0(dx0 dx0Var, c41 c41Var, int i) {
        int i2;
        boolean z;
        int i3;
        v91 v91Var = this.f24279OooO0O0;
        int i4 = this.f24278OooO00o;
        if (v91Var.OooOo0O()) {
            return -3;
        }
        v91Var.OooOOo(i4);
        aa1 aa1Var = v91Var.f24913Oooo0o0[i4];
        boolean z2 = v91Var.f24930OooooOo;
        aa1Var.getClass();
        boolean z3 = (i & 2) != 0;
        OooOOOO.OooO0O0 oooO0O0 = aa1Var.f16993OooO0O0;
        synchronized (aa1Var) {
            try {
                c41Var.f17681OooO0o = false;
                int i5 = aa1Var.f17007OooOOo0;
                i2 = -4;
                if (i5 != aa1Var.f17002OooOOO) {
                    o0OoOo0 o0oooo0 = ((z91) aa1Var.f16994OooO0OO.OooO0O0(aa1Var.f17004OooOOOO + i5)).f26133OooO00o;
                    if (!z3 && o0oooo0 == aa1Var.f16996OooO0o) {
                        int iOooO = aa1Var.OooO(aa1Var.f17007OooOOo0);
                        if (aa1Var.f17015OooOoOO != null) {
                            int i6 = aa1Var.f17001OooOO0O[iOooO];
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            int i7 = aa1Var.f17001OooOO0O[iOooO];
                            c41Var.f24281OooO0O0 = i7;
                            if (aa1Var.f17007OooOOo0 == aa1Var.f17002OooOOO - 1 && (z2 || aa1Var.OooOo0)) {
                                c41Var.f24281OooO0O0 = 536870912 | i7;
                            }
                            c41Var.f17683OooO0oO = aa1Var.OooOO0o[iOooO];
                            oooO0O0.f13327OooOo = aa1Var.f17000OooOO0[iOooO];
                            oooO0O0.f13329OooOo0o = aa1Var.f16991OooO[iOooO];
                            oooO0O0.f13330OooOoO0 = aa1Var.f17003OooOOO0[iOooO];
                            i3 = -4;
                        } else {
                            c41Var.f17681OooO0o = true;
                            i3 = -3;
                        }
                    }
                    aa1Var.OooOO0O(o0oooo0, dx0Var);
                    i3 = -5;
                } else {
                    if (!z2 && !aa1Var.OooOo0) {
                        o0OoOo0 o0oooo02 = aa1Var.f17009OooOo;
                        if (o0oooo02 == null || (!z3 && o0oooo02 == aa1Var.f16996OooO0o)) {
                            i3 = -3;
                        }
                        aa1Var.OooOO0O(o0oooo02, dx0Var);
                        i3 = -5;
                    }
                    c41Var.f24281OooO0O0 = 4;
                    c41Var.f17683OooO0oO = Long.MIN_VALUE;
                    i3 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i3 != -4) {
            i2 = i3;
        } else if (!c41Var.OooO00o(4)) {
            int i8 = i & 1;
            if ((i & 4) == 0) {
                if (i8 != 0) {
                    y91 y91Var = aa1Var.f16992OooO00o;
                    y91.OooO0o((OoooOOO.oO0O0) y91Var.f25877OooO0Oo, c41Var, aa1Var.f16993OooO0O0, (r40) y91Var.f25875OooO0O0);
                } else {
                    y91 y91Var2 = aa1Var.f16992OooO00o;
                    y91Var2.f25877OooO0Oo = y91.OooO0o((OoooOOO.oO0O0) y91Var2.f25877OooO0Oo, c41Var, aa1Var.f16993OooO0O0, (r40) y91Var2.f25875OooO0O0);
                    aa1Var.f17007OooOOo0++;
                }
            } else if (i8 == 0) {
                aa1Var.f17007OooOOo0++;
            }
        }
        if (i2 == -3) {
            v91Var.OooOOoo(i4);
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final void zzd() throws IOException {
        IOException iOException;
        v91 v91Var = this.f24279OooO0O0;
        pd0 pd0Var = v91Var.f24913Oooo0o0[this.f24278OooO00o].f17015OooOoOO;
        if (pd0Var != null) {
            throw ((m71) pd0Var.f23325OooOo0o);
        }
        int i = v91Var.o000oOoO == 7 ? 6 : 3;
        de0 de0Var = v91Var.f24903OooOooO;
        IOException iOException2 = (IOException) de0Var.f18243OooOoO0;
        if (iOException2 != null) {
            throw iOException2;
        }
        hb1 hb1Var = (hb1) de0Var.f18240OooOo;
        if (hb1Var != null && (iOException = hb1Var.f19686OooOo) != null && hb1Var.f19690OooOoO0 > i) {
            throw iOException;
        }
    }

    @Override // com.google.android.gms.internal.ads.ba1
    public final boolean zze() {
        v91 v91Var = this.f24279OooO0O0;
        return !v91Var.OooOo0O() && v91Var.f24913Oooo0o0[this.f24278OooO00o].OooOOO(v91Var.f24930OooooOo);
    }
}
