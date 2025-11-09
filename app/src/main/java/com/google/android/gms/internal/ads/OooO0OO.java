package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class OooO0OO {

    /* renamed from: OooO, reason: collision with root package name */
    public boolean f16782OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f16783OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f16784OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public o0OoOo0 f16785OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public long f16786OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public long f16787OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public long f16788OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public long f16789OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public boolean f16790OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public long f16791OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public o00Oo0 f16792OooOO0O;
    public Executor OooOO0o;

    /* renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f16793OooOOO0;

    public OooO0OO(OooOO0 oooOO0, Context context) {
        this.f16793OooOOO0 = oooOO0;
        i80.OooO0Oo(context);
        this.f16783OooO00o = new ArrayList();
        this.f16784OooO0O0 = new OooOO0O(0);
        this.f16789OooO0oO = -9223372036854775807L;
        this.f16792OooOO0O = o00Oo0.f21823OooO;
        this.OooOO0o = OooOO0.f16795OooOOO;
    }

    public final void OooO(List list) {
        ArrayList arrayList = this.f16783OooO00o;
        if (arrayList.equals(list)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.addAll(this.f16793OooOOO0.f16802OooO0o0);
        OooO00o();
    }

    public final void OooO00o() {
        if (this.f16785OooO0OO == null) {
            return;
        }
        new ArrayList(this.f16783OooO00o);
        o0OoOo0 o0oooo0 = this.f16785OooO0OO;
        o0oooo0.getClass();
        jb1 jb1Var = new jb1(o0oooo0);
        z41 z41Var = o0oooo0.f22234OooOoOO;
        if (z41Var == null || !z41Var.OooO0Oo()) {
            z41Var = z41.f26082OooO0oo;
        }
        jb1Var.f20262OooOoO = z41Var;
        new o0OoOo0(jb1Var);
        af0.OooOo0O(null);
        throw null;
    }

    public final void OooO0O0(boolean z) {
        this.f16790OooO0oo = false;
        this.f16789OooO0oO = -9223372036854775807L;
        OooOO0 oooOO0 = this.f16793OooOOO0;
        if (oooOO0.f16807OooOOO0 == 1) {
            oooOO0.OooOO0o++;
            bi0 bi0Var = oooOO0.f16801OooO0o;
            if (z) {
                OooOOO0 oooOOO0 = (OooOOO0) bi0Var.f17509OooOo0o;
                OooOo00 oooOo00 = oooOOO0.f16814OooO0O0;
                oooOo00.f16850OooOOO0 = 0L;
                oooOo00.f16852OooOOOo = -1L;
                oooOo00.f16849OooOOO = -1L;
                oooOOO0.f16819OooO0oO = -9223372036854775807L;
                oooOOO0.f16818OooO0o0 = -9223372036854775807L;
                oooOOO0.OooO0o(1);
                oooOOO0.f16820OooO0oo = -9223372036854775807L;
            }
            OooOo oooOo = (OooOo) bi0Var.f17507OooOo;
            w10 w10Var = oooOo.f16834OooO0o0;
            w10Var.f25171OooO00o = 0;
            w10Var.f25172OooO0O0 = 0;
            oooOo.f16828OooO = -9223372036854775807L;
            o0O0OOO0 o0o0ooo0 = oooOo.f16832OooO0Oo;
            if (o0o0ooo0.OooO00o() > 0) {
                af0.OoooO0(o0o0ooo0.OooO00o() > 0);
                while (o0o0ooo0.OooO00o() > 1) {
                    o0o0ooo0.OooO0O0();
                }
                Object objOooO0O0 = o0o0ooo0.OooO0O0();
                objOooO0O0.getClass();
                o0o0ooo0.OooO0o0(0L, (Long) objOooO0O0);
            }
            C1721jn c1721jn = oooOo.f16833OooO0o;
            o0O0OOO0 o0o0ooo02 = oooOo.f16831OooO0OO;
            if (c1721jn != null) {
                o0o0ooo02.OooO0o();
            } else if (o0o0ooo02.OooO00o() > 0) {
                af0.OoooO0(o0o0ooo02.OooO00o() > 0);
                while (o0o0ooo02.OooO00o() > 1) {
                    o0o0ooo02.OooO0O0();
                }
                Object objOooO0O02 = o0o0ooo02.OooO0O0();
                objOooO0O02.getClass();
                oooOo.f16833OooO0o = (C1721jn) objOooO0O02;
            }
            m60 m60Var = oooOO0.f16805OooOO0;
            af0.OooOo0O(m60Var);
            m60Var.OooO0O0(new b30(oooOO0, 23));
        }
        this.f16791OooOO0 = -9223372036854775807L;
    }

    public final void OooO0OO(o0OoOo0 o0oooo0) {
        OooOO0 oooOO0 = this.f16793OooOOO0;
        af0.OooooO0(oooOO0.f16807OooOOO0 == 0);
        z41 z41Var = o0oooo0.f22234OooOoOO;
        if (z41Var == null || !z41Var.OooO0Oo()) {
            z41Var = z41.f26082OooO0oo;
        }
        if (z41Var.f26085OooO0OO != 7 || i80.f19994OooO00o < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        af0.OooOo0O(looperMyLooper);
        oooOO0.f16805OooOO0 = oooOO0.f16803OooO0oO.OooO00o(looperMyLooper, null);
        try {
            OooO oooO = oooOO0.f16800OooO0Oo;
            gn0 gn0Var = gn0.f19388OooOoO;
            oooO.OooO00o();
            Pair pair = oooOO0.f16806OooOO0O;
            if (pair == null) {
                throw null;
            }
            ((y40) pair.second).getClass();
            throw null;
        } catch (C1683il e) {
            throw new o00Ooo(e, o0oooo0);
        }
    }

    public final void OooO0Oo(boolean z) {
        OooOOO0 oooOOO0 = (OooOOO0) this.f16793OooOOO0.f16801OooO0o.f17509OooOo0o;
        oooOOO0.f16812OooO = z;
        oooOOO0.f16820OooO0oo = -9223372036854775807L;
    }

    public final void OooO0o(Surface surface, y40 y40Var) {
        OooOO0 oooOO0 = this.f16793OooOOO0;
        Pair pair = oooOO0.f16806OooOO0O;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((y40) oooOO0.f16806OooOO0O.second).equals(y40Var)) {
            return;
        }
        oooOO0.f16806OooOO0O = Pair.create(surface, y40Var);
        y40Var.getClass();
    }

    public final void OooO0o0(int i) {
        OooOo00 oooOo00 = ((OooOOO0) this.f16793OooOOO0.f16801OooO0o.f17509OooOo0o).f16814OooO0O0;
        if (oooOo00.f16847OooOO0 == i) {
            return;
        }
        oooOo00.f16847OooOO0 = i;
        oooOo00.OooO0Oo(true);
    }

    public final void OooO0oO(float f) {
        ((OooOOO0) this.f16793OooOOO0.f16801OooO0o.f17509OooOo0o).OooO0Oo(f);
    }

    public final void OooO0oo(long j, long j2, long j3, long j4) {
        this.f16786OooO0Oo = j;
        this.f16788OooO0o0 = j3;
        this.f16787OooO0o = j4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r8 >= r4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOO0(long r18, boolean r20, long r21, long r23, com.google.android.gms.internal.ads.oOo0o00 r25) throws com.google.android.gms.internal.ads.o00Ooo {
        /*
            r17 = this;
            r1 = r17
            r0 = r25
            com.google.android.gms.internal.ads.OooOO0 r2 = r1.f16793OooOOO0
            r3 = 0
            com.google.android.gms.internal.ads.af0.OooooO0(r3)
            long r4 = r1.f16788OooO0o0
            long r7 = r18 - r4
            com.google.android.gms.internal.ads.OooOOO0 r6 = r2.f16798OooO0O0     // Catch: com.google.android.gms.internal.ads.l41 -> L6f
            long r13 = r1.f16786OooO0Oo     // Catch: com.google.android.gms.internal.ads.l41 -> L6f
            com.google.android.gms.internal.ads.OooOO0O r4 = r1.f16784OooO0O0     // Catch: com.google.android.gms.internal.ads.l41 -> L6f
            r15 = r20
            r9 = r21
            r11 = r23
            r16 = r4
            int r4 = r6.OooO00o(r7, r9, r11, r13, r15, r16)     // Catch: com.google.android.gms.internal.ads.l41 -> L6f
            r5 = 4
            if (r4 != r5) goto L24
            goto L62
        L24:
            long r4 = r1.f16787OooO0o
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 >= 0) goto L2c
            if (r20 == 0) goto L31
        L2c:
            r9 = r21
            r11 = r23
            goto L40
        L31:
            java.lang.Object r2 = r0.f22919OooOo
            com.google.android.gms.internal.ads.z71 r2 = (com.google.android.gms.internal.ads.z71) r2
            int r3 = r0.f22921OooOo0o
            java.lang.Object r0 = r0.f22922OooOoO0
            com.google.android.gms.internal.ads.pb1 r0 = (com.google.android.gms.internal.ads.pb1) r0
            r0.Ooooooo(r2, r3)
            r0 = 1
            return r0
        L40:
            com.google.android.gms.internal.ads.OooOO0.OooO00o(r2, r9, r11)
            boolean r0 = r1.f16782OooO
            if (r0 == 0) goto L6a
            long r4 = r1.f16791OooOO0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L63
            int r0 = r2.OooOO0o
            if (r0 != 0) goto L62
            com.google.android.gms.internal.ads.OooOo r0 = r2.f16799OooO0OO
            long r8 = r0.f16828OooO
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L62
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L63
        L62:
            return r3
        L63:
            r1.OooO00o()
            r1.f16782OooO = r3
            r1.f16791OooOO0 = r6
        L6a:
            r0 = 0
            com.google.android.gms.internal.ads.af0.OooOo0O(r0)
            throw r0
        L6f:
            r0 = move-exception
            com.google.android.gms.internal.ads.o00Ooo r2 = new com.google.android.gms.internal.ads.o00Ooo
            com.google.android.gms.internal.ads.o0OoOo0 r3 = r1.f16785OooO0OO
            com.google.android.gms.internal.ads.af0.OooOo0O(r3)
            r2.<init>(r0, r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.OooO0OO.OooOO0(long, boolean, long, long, com.google.android.gms.internal.ads.oOo0o00):boolean");
    }
}
