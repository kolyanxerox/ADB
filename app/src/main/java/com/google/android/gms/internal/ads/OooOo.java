package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class OooOo {

    /* renamed from: OooO */
    public long f16828OooO;

    /* renamed from: OooO00o */
    public final OooOOO0 f16829OooO00o;

    /* renamed from: OooO0O0 */
    public final OooOO0O f16830OooO0O0 = new OooOO0O(0);

    /* renamed from: OooO0OO */
    public final o0O0OOO0 f16831OooO0OO = new o0O0OOO0();

    /* renamed from: OooO0Oo */
    public final o0O0OOO0 f16832OooO0Oo = new o0O0OOO0();

    /* renamed from: OooO0o */
    public C1721jn f16833OooO0o;

    /* renamed from: OooO0o0 */
    public final w10 f16834OooO0o0;

    /* renamed from: OooO0oO */
    public C1721jn f16835OooO0oO;

    /* renamed from: OooO0oo */
    public long f16836OooO0oo;

    /* renamed from: OooOO0 */
    public final dx0 f16837OooOO0;

    public OooOo(dx0 dx0Var, OooOOO0 oooOOO0) {
        this.f16837OooOO0 = dx0Var;
        this.f16829OooO00o = oooOOO0;
        w10 w10Var = new w10();
        int i = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i = iHighestOneBit + iHighestOneBit;
        }
        w10Var.f25171OooO00o = 0;
        w10Var.f25172OooO0O0 = 0;
        w10Var.f25174OooO0Oo = new long[i];
        w10Var.f25173OooO0OO = i - 1;
        this.f16834OooO0o0 = w10Var;
        this.f16835OooO0oO = C1721jn.f20337OooO0Oo;
        this.f16828OooO = -9223372036854775807L;
    }

    public final void OooO00o(long j, long j2) {
        w10 w10Var = this.f16834OooO0o0;
        int i = w10Var.f25172OooO0O0;
        if (i == 0) {
            return;
        }
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long j3 = ((long[]) w10Var.f25174OooO0Oo)[w10Var.f25171OooO00o];
        Long l = (Long) this.f16832OooO0Oo.OooO0OO(j3);
        OooOOO0 oooOOO0 = this.f16829OooO00o;
        if (l != null && l.longValue() != this.f16836OooO0oo) {
            this.f16836OooO0oo = l.longValue();
            oooOOO0.OooO0o(2);
        }
        int iOooO00o = this.f16829OooO00o.OooO00o(j3, j, j2, this.f16836OooO0oo, false, this.f16830OooO0O0);
        dx0 dx0Var = this.f16837OooOO0;
        OooOO0 oooOO0 = (OooOO0) dx0Var.f18417OooOo;
        if (iOooO00o != 0 && iOooO00o != 1) {
            if (iOooO00o == 2 || iOooO00o == 3 || iOooO00o == 4) {
                this.f16828OooO = j3;
                w10Var.OoooO0();
                Iterator it = oooOO0.f16804OooO0oo.iterator();
                while (it.hasNext()) {
                    OooO0OO oooO0OO = (OooO0OO) it.next();
                    oooO0OO.OooOO0o.execute(new OooO0O0(oooO0OO, oooO0OO.f16792OooOO0O, 0));
                }
                af0.OooOo0O(null);
                throw null;
            }
            return;
        }
        this.f16828OooO = j3;
        C1721jn c1721jn = (C1721jn) this.f16831OooO0OO.OooO0OO(w10Var.OoooO0());
        if (c1721jn != null && !c1721jn.equals(C1721jn.f20337OooO0Oo) && !c1721jn.equals(this.f16835OooO0oO)) {
            this.f16835OooO0oO = c1721jn;
            jb1 jb1Var = new jb1();
            jb1Var.f20257OooOOoo = c1721jn.f20338OooO00o;
            jb1Var.f20259OooOo00 = c1721jn.f20339OooO0O0;
            jb1Var.OooO0OO("video/raw");
            dx0Var.f18419OooOo0o = new o0OoOo0(jb1Var);
            Iterator it2 = oooOO0.f16804OooO0oo.iterator();
            while (it2.hasNext()) {
                OooO0OO oooO0OO2 = (OooO0OO) it2.next();
                oooO0OO2.OooOO0o.execute(new OooO0O0(oooO0OO2, oooO0OO2.f16792OooOO0O, c1721jn));
            }
        }
        int i2 = oooOOO0.f16816OooO0Oo;
        oooOOO0.f16816OooO0Oo = 3;
        oooOOO0.f16822OooOO0O.getClass();
        oooOOO0.f16817OooO0o = i80.OooOOoo(SystemClock.elapsedRealtime());
        if ((i2 != 3) && oooOO0.f16806OooOO0O != null) {
            Iterator it3 = oooOO0.f16804OooO0oo.iterator();
            while (it3.hasNext()) {
                OooO0OO oooO0OO3 = (OooO0OO) it3.next();
                oooO0OO3.OooOO0o.execute(new OooO0O0(oooO0OO3, oooO0OO3.f16792OooOO0O, 2));
            }
        }
        if (oooOO0.f16796OooO != null) {
            if (((o0OoOo0) dx0Var.f18419OooOo0o) == null) {
                new o0OoOo0(new jb1());
            }
            u41 u41Var = oooOO0.f16796OooO;
            oooOO0.f16803OooO0oO.getClass();
            System.nanoTime();
            u41Var.getClass();
        }
        af0.OooOo0O(null);
        throw null;
    }
}
