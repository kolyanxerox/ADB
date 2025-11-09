package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.lf */
/* loaded from: classes2.dex */
public abstract class AbstractC1787lf {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final C1970qd f20867OooO00o = new C1970qd();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final int OooO(int i, C1528ee c1528ee, C2045se c2045se, int i2, boolean z) {
        int i3 = OooO0Oo(i, c1528ee, false).f18576OooO0OO;
        if (OooO0o0(i3, c2045se, 0L).OooOO0o != i) {
            return i + 1;
        }
        int iOooOO0 = OooOO0(i3, i2, z);
        if (iOooOO0 == -1) {
            return -1;
        }
        return OooO0o0(iOooOO0, c2045se, 0L).f24079OooOO0O;
    }

    public abstract int OooO00o(Object obj);

    public abstract int OooO0O0();

    public abstract int OooO0OO();

    public abstract C1528ee OooO0Oo(int i, C1528ee c1528ee, boolean z);

    public abstract Object OooO0o(int i);

    public abstract C2045se OooO0o0(int i, C2045se c2045se, long j);

    public int OooO0oO(boolean z) {
        return OooOOOO() ? -1 : 0;
    }

    public int OooO0oo(boolean z) {
        if (OooOOOO()) {
            return -1;
        }
        return OooO0OO() - 1;
    }

    public int OooOO0(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == OooO0oo(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == OooO0oo(z) ? OooO0oO(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int OooOO0O(int i) {
        if (i == OooO0oO(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair OooOO0o(C2045se c2045se, C1528ee c1528ee, int i, long j) {
        Pair pairOooOOO0 = OooOOO0(c2045se, c1528ee, i, j, 0L);
        pairOooOOO0.getClass();
        return pairOooOOO0;
    }

    public C1528ee OooOOO(Object obj, C1528ee c1528ee) {
        return OooO0Oo(OooO00o(obj), c1528ee, true);
    }

    public final Pair OooOOO0(C2045se c2045se, C1528ee c1528ee, int i, long j, long j2) {
        af0.OooOOO0(i, OooO0OO());
        OooO0o0(i, c2045se, j2);
        if (j == -9223372036854775807L) {
            c2045se.getClass();
            j = 0;
        }
        int i2 = c2045se.f24079OooOO0O;
        OooO0Oo(i2, c1528ee, false);
        while (i2 < c2045se.OooOO0o) {
            c1528ee.getClass();
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            OooO0Oo(i3, c1528ee, false).getClass();
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        OooO0Oo(i2, c1528ee, true);
        c1528ee.getClass();
        long j3 = c1528ee.f18577OooO0Oo;
        if (j3 != -9223372036854775807L) {
            j = Math.min(j, j3 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = c1528ee.f18575OooO0O0;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public final boolean OooOOOO() {
        return OooO0OO() == 0;
    }

    public final boolean equals(Object obj) {
        int iOooO0oo;
        if (this != obj) {
            if (obj instanceof AbstractC1787lf) {
                AbstractC1787lf abstractC1787lf = (AbstractC1787lf) obj;
                if (abstractC1787lf.OooO0OO() == OooO0OO() && abstractC1787lf.OooO0O0() == OooO0O0()) {
                    C2045se c2045se = new C2045se();
                    C1528ee c1528ee = new C1528ee();
                    C2045se c2045se2 = new C2045se();
                    C1528ee c1528ee2 = new C1528ee();
                    int i = 0;
                    while (true) {
                        if (i >= OooO0OO()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= OooO0O0()) {
                                    int iOooO0oO = OooO0oO(true);
                                    if (iOooO0oO == abstractC1787lf.OooO0oO(true) && (iOooO0oo = OooO0oo(true)) == abstractC1787lf.OooO0oo(true)) {
                                        while (iOooO0oO != iOooO0oo) {
                                            int iOooOO0 = OooOO0(iOooO0oO, 0, true);
                                            if (iOooOO0 == abstractC1787lf.OooOO0(iOooO0oO, 0, true)) {
                                                iOooO0oO = iOooOO0;
                                            }
                                        }
                                    }
                                } else {
                                    if (!OooO0Oo(i2, c1528ee, true).equals(abstractC1787lf.OooO0Oo(i2, c1528ee2, true))) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } else {
                            if (!OooO0o0(i, c2045se, 0L).equals(abstractC1787lf.OooO0o0(i, c2045se2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        C2045se c2045se = new C2045se();
        C1528ee c1528ee = new C1528ee();
        int iOooO0OO = OooO0OO() + 217;
        int i2 = 0;
        while (true) {
            i = iOooO0OO * 31;
            if (i2 >= OooO0OO()) {
                break;
            }
            iOooO0OO = i + OooO0o0(i2, c2045se, 0L).hashCode();
            i2++;
        }
        int iOooO0O0 = OooO0O0() + i;
        for (int i3 = 0; i3 < OooO0O0(); i3++) {
            iOooO0O0 = (iOooO0O0 * 31) + OooO0Oo(i3, c1528ee, true).hashCode();
        }
        int iOooO0oO = OooO0oO(true);
        while (iOooO0oO != -1) {
            iOooO0O0 = (iOooO0O0 * 31) + iOooO0oO;
            iOooO0oO = OooOO0(iOooO0oO, 0, true);
        }
        return iOooO0O0;
    }
}
