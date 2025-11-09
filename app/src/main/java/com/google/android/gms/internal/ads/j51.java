package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class j51 {

    /* renamed from: OooO */
    public h51 f20186OooO;

    /* renamed from: OooO0OO */
    public final h61 f20189OooO0OO;

    /* renamed from: OooO0Oo */
    public final m60 f20190OooO0Oo;

    /* renamed from: OooO0o */
    public int f20191OooO0o;

    /* renamed from: OooO0o0 */
    public long f20192OooO0o0;

    /* renamed from: OooO0oO */
    public boolean f20193OooO0oO;

    /* renamed from: OooO0oo */
    public h51 f20194OooO0oo;

    /* renamed from: OooOO0 */
    public h51 f20195OooOO0;

    /* renamed from: OooOO0O */
    public h51 f20196OooOO0O;
    public int OooOO0o;

    /* renamed from: OooOOO */
    public long f20197OooOOO;

    /* renamed from: OooOOO0 */
    public Object f20198OooOOO0;

    /* renamed from: OooOOOo */
    public final ni0 f20200OooOOOo;

    /* renamed from: OooO00o */
    public final C1528ee f20187OooO00o = new C1528ee();

    /* renamed from: OooO0O0 */
    public final C2045se f20188OooO0O0 = new C2045se();

    /* renamed from: OooOOOO */
    public ArrayList f20199OooOOOO = new ArrayList();

    public j51(h61 h61Var, m60 m60Var, ni0 ni0Var, n41 n41Var) {
        this.f20189OooO0OO = h61Var;
        this.f20190OooO0Oo = m60Var;
        this.f20200OooOOOo = ni0Var;
    }

    public static h91 OooO0o(AbstractC1787lf abstractC1787lf, Object obj, long j, C2045se c2045se, C1528ee c1528ee) {
        abstractC1787lf.OooOOO(obj, c1528ee);
        abstractC1787lf.OooO0o0(c1528ee.f18576OooO0OO, c2045se, 0L);
        abstractC1787lf.OooO00o(obj);
        c1528ee.f18578OooO0o.getClass();
        abstractC1787lf.OooOOO(obj, c1528ee);
        c1528ee.f18578OooO0o.OooO00o(-1);
        int i = OooO00o.f16774OooO0o;
        return new h91(obj, -1, j);
    }

    public final boolean OooO(AbstractC1787lf abstractC1787lf, h91 h91Var) {
        if (!h91Var.OooO0O0() && h91Var.f19661OooO0o0 == -1) {
            Object obj = h91Var.f19657OooO00o;
            if (abstractC1787lf.OooO0o0(abstractC1787lf.OooOOO(obj, this.f20187OooO00o).f18576OooO0OO, this.f20188OooO0O0, 0L).OooOO0o == abstractC1787lf.OooO00o(obj)) {
                return true;
            }
        }
        return false;
    }

    public final long OooO00o(Object obj) {
        for (int i = 0; i < this.f20199OooOOOO.size(); i++) {
            h51 h51Var = (h51) this.f20199OooOOOO.get(i);
            if (h51Var.f19559OooO0O0.equals(obj)) {
                return h51Var.f19564OooO0oO.f19954OooO00o.f19660OooO0Oo;
            }
        }
        return -1L;
    }

    public final i51 OooO0O0(AbstractC1787lf abstractC1787lf, h51 h51Var, long j) {
        int i;
        AbstractC1787lf abstractC1787lf2;
        long j2;
        C1528ee c1528ee;
        long jLongValue;
        int i2;
        Object obj;
        long j3;
        long j4;
        long j5;
        long jOooO00o;
        i51 i51Var = h51Var.f19564OooO0oO;
        long j6 = (h51Var.f19571OooOOOo + i51Var.f19959OooO0o0) - j;
        boolean z = i51Var.f19958OooO0o;
        C1528ee c1528ee2 = this.f20187OooO00o;
        long j7 = i51Var.f19956OooO0OO;
        h91 h91Var = i51Var.f19954OooO00o;
        if (z) {
            int iOooO = abstractC1787lf.OooO(abstractC1787lf.OooO00o(h91Var.f19657OooO00o), this.f20187OooO00o, this.f20188OooO0O0, this.f20191OooO0o, this.f20193OooO0oO);
            if (iOooO != -1) {
                int i3 = abstractC1787lf.OooO0Oo(iOooO, c1528ee2, true).f18576OooO0OO;
                Object obj2 = c1528ee2.f18575OooO0O0;
                obj2.getClass();
                if (abstractC1787lf.OooO0o0(i3, this.f20188OooO0O0, 0L).f24079OooOO0O == iOooO) {
                    Pair pairOooOOO0 = abstractC1787lf.OooOOO0(this.f20188OooO0O0, this.f20187OooO00o, i3, -9223372036854775807L, Math.max(0L, j6));
                    if (pairOooOOO0 != null) {
                        Object obj3 = pairOooOOO0.first;
                        long jLongValue2 = ((Long) pairOooOOO0.second).longValue();
                        h51 h51Var2 = h51Var.f19569OooOOO0;
                        if (h51Var2 == null || !h51Var2.f19559OooO0O0.equals(obj3)) {
                            jOooO00o = OooO00o(obj3);
                            if (jOooO00o == -1) {
                                jOooO00o = this.f20192OooO0o0;
                                this.f20192OooO0o0 = 1 + jOooO00o;
                            }
                        } else {
                            jOooO00o = h51Var2.f19564OooO0oO.f19954OooO00o.f19660OooO0Oo;
                        }
                        j4 = -9223372036854775807L;
                        j5 = jLongValue2;
                        obj = obj3;
                        j3 = jOooO00o;
                    }
                } else {
                    obj = obj2;
                    j3 = h91Var.f19660OooO0Oo;
                    j4 = 0;
                    j5 = 0;
                }
                h91 h91VarOooO0o = OooO0o(abstractC1787lf, obj, j3, this.f20188OooO0O0, this.f20187OooO00o);
                if (j4 != -9223372036854775807L && j7 != -9223372036854775807L) {
                    abstractC1787lf.OooOOO(h91Var.f19657OooO00o, c1528ee2).f18578OooO0o.getClass();
                    c1528ee2.f18578OooO0o.getClass();
                }
                return OooO0OO(abstractC1787lf, h91VarOooO0o, j4, j5);
            }
            return null;
        }
        abstractC1787lf.OooOOO(h91Var.f19657OooO00o, c1528ee2);
        boolean zOooO0O0 = h91Var.OooO0O0();
        Object obj4 = h91Var.f19657OooO00o;
        if (!zOooO0O0) {
            int i4 = h91Var.f19661OooO0o0;
            if (i4 != -1) {
                c1528ee2.f18578OooO0o.getClass();
                if (i4 == -1) {
                    c1528ee2.f18578OooO0o.OooO00o(-1);
                    int i5 = OooO00o.f16774OooO0o;
                }
            }
            OooO00o OooO00o2 = c1528ee2.f18578OooO0o.OooO00o(i4);
            int i6 = 0;
            while (true) {
                int[] iArr = OooO00o2.f16778OooO0Oo;
                if (i6 >= iArr.length || (i = iArr[i6]) == 0 || i == 1) {
                    break;
                }
                i6++;
            }
            c1528ee2.OooO0OO(i4);
            if (i6 != c1528ee2.f18578OooO0o.OooO00o(i4).f16775OooO00o) {
                return OooO0Oo(abstractC1787lf, h91Var.f19657OooO00o, h91Var.f19661OooO0o0, i6, i51Var.f19959OooO0o0, h91Var.f19660OooO0Oo);
            }
            abstractC1787lf.OooOOO(obj4, c1528ee2);
            c1528ee2.f18578OooO0o.OooO00o(i4).getClass();
            c1528ee2.f18578OooO0o.OooO00o(i4).getClass();
            return OooO0o0(abstractC1787lf, h91Var.f19657OooO00o, 0L, i51Var.f19959OooO0o0, h91Var.f19660OooO0Oo);
        }
        C2145v3 c2145v3 = c1528ee2.f18578OooO0o;
        int i7 = h91Var.f19658OooO0O0;
        if (c2145v3.OooO00o(i7).f16775OooO00o == -1) {
            return null;
        }
        OooO00o OooO00o3 = c1528ee2.f18578OooO0o.OooO00o(i7);
        int i8 = h91Var.f19659OooO0OO;
        do {
            i8++;
            int[] iArr2 = OooO00o3.f16778OooO0Oo;
            if (i8 >= iArr2.length || (i2 = iArr2[i8]) == 0) {
                break;
            }
        } while (i2 != 1);
        if (i8 < 0) {
            return OooO0Oo(abstractC1787lf, h91Var.f19657OooO00o, i7, i8, i51Var.f19956OooO0OO, h91Var.f19660OooO0Oo);
        }
        if (j7 == -9223372036854775807L) {
            int i9 = c1528ee2.f18576OooO0OO;
            long jMax = Math.max(0L, j6);
            abstractC1787lf2 = abstractC1787lf;
            c1528ee = c1528ee2;
            j2 = 0;
            Pair pairOooOOO02 = abstractC1787lf2.OooOOO0(this.f20188OooO0O0, c1528ee, i9, -9223372036854775807L, jMax);
            if (pairOooOOO02 == null) {
                return null;
            }
            jLongValue = ((Long) pairOooOOO02.second).longValue();
        } else {
            abstractC1787lf2 = abstractC1787lf;
            j2 = 0;
            c1528ee = c1528ee2;
            jLongValue = j7;
        }
        abstractC1787lf2.OooOOO(obj4, c1528ee);
        C2145v3 c2145v32 = c1528ee.f18578OooO0o;
        int i10 = h91Var.f19658OooO0O0;
        c2145v32.OooO00o(i10).getClass();
        c1528ee.f18578OooO0o.OooO00o(i10).getClass();
        return OooO0o0(abstractC1787lf2, h91Var.f19657OooO00o, Math.max(j2, jLongValue), i51Var.f19956OooO0OO, h91Var.f19660OooO0Oo);
    }

    public final i51 OooO0OO(AbstractC1787lf abstractC1787lf, h91 h91Var, long j, long j2) {
        abstractC1787lf.OooOOO(h91Var.f19657OooO00o, this.f20187OooO00o);
        return h91Var.OooO0O0() ? OooO0Oo(abstractC1787lf, h91Var.f19657OooO00o, h91Var.f19658OooO0O0, h91Var.f19659OooO0OO, j, h91Var.f19660OooO0Oo) : OooO0o0(abstractC1787lf, h91Var.f19657OooO00o, j2, j, h91Var.f19660OooO0Oo);
    }

    public final i51 OooO0Oo(AbstractC1787lf abstractC1787lf, Object obj, int i, int i2, long j, long j2) {
        int i3;
        h91 h91Var = new h91(obj, i, i2, j2, -1);
        C1528ee c1528ee = this.f20187OooO00o;
        long jOooO00o = abstractC1787lf.OooOOO(obj, c1528ee).OooO00o(i, i2);
        OooO00o OooO00o2 = c1528ee.f18578OooO0o.OooO00o(i);
        int i4 = 0;
        while (true) {
            int[] iArr = OooO00o2.f16778OooO0Oo;
            if (i4 >= iArr.length || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        if (i2 == i4) {
            c1528ee.f18578OooO0o.getClass();
        }
        c1528ee.OooO0OO(i);
        long jMax = 0;
        if (jOooO00o != -9223372036854775807L && jOooO00o <= 0) {
            jMax = Math.max(0L, (-1) + jOooO00o);
        }
        return new i51(h91Var, jMax, j, -9223372036854775807L, jOooO00o, false, false, false);
    }

    public final i51 OooO0o0(AbstractC1787lf abstractC1787lf, Object obj, long j, long j2, long j3) {
        C1528ee c1528ee = this.f20187OooO00o;
        abstractC1787lf.OooOOO(obj, c1528ee);
        c1528ee.getClass();
        c1528ee.f18578OooO0o.getClass();
        h91 h91Var = new h91(obj, -1, j3);
        boolean z = !h91Var.OooO0O0();
        boolean zOooO = OooO(abstractC1787lf, h91Var);
        boolean zOooO0oo = OooO0oo(abstractC1787lf, h91Var, z);
        long j4 = c1528ee.f18577OooO0Oo;
        return new i51(h91Var, (j4 == -9223372036854775807L || j < j4) ? j : Math.max(0L, (-1) + j4), j2, -9223372036854775807L, j4, z, zOooO, zOooO0oo);
    }

    public final void OooO0oO() {
        om0 om0Var = new om0(4);
        for (h51 h51Var = this.f20194OooO0oo; h51Var != null; h51Var = h51Var.f19569OooOOO0) {
            om0Var.OooO00o(h51Var.f19564OooO0oO.f19954OooO00o);
        }
        h51 h51Var2 = this.f20186OooO;
        this.f20190OooO0Oo.OooO0O0(new o000oOoO(this, om0Var, h51Var2 == null ? null : h51Var2.f19564OooO0oO.f19954OooO00o, 10));
    }

    public final boolean OooO0oo(AbstractC1787lf abstractC1787lf, h91 h91Var, boolean z) {
        int iOooO00o = abstractC1787lf.OooO00o(h91Var.f19657OooO00o);
        if (!abstractC1787lf.OooO0o0(abstractC1787lf.OooO0Oo(iOooO00o, this.f20187OooO00o, false).f18576OooO0OO, this.f20188OooO0O0, 0L).f24076OooO0oO) {
            if (abstractC1787lf.OooO(iOooO00o, this.f20187OooO00o, this.f20188OooO0O0, this.f20191OooO0o, this.f20193OooO0oO) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooOO0(AbstractC1787lf abstractC1787lf) {
        AbstractC1787lf abstractC1787lf2;
        h51 h51Var;
        h51 h51Var2 = this.f20194OooO0oo;
        if (h51Var2 == null) {
            return true;
        }
        int iOooO00o = abstractC1787lf.OooO00o(h51Var2.f19559OooO0O0);
        while (true) {
            abstractC1787lf2 = abstractC1787lf;
            iOooO00o = abstractC1787lf2.OooO(iOooO00o, this.f20187OooO00o, this.f20188OooO0O0, this.f20191OooO0o, this.f20193OooO0oO);
            while (true) {
                h51Var = h51Var2.f19569OooOOO0;
                if (h51Var == null || h51Var2.f19564OooO0oO.f19958OooO0o) {
                    break;
                }
                h51Var2 = h51Var;
            }
            if (iOooO00o == -1 || h51Var == null || abstractC1787lf2.OooO00o(h51Var.f19559OooO0O0) != iOooO00o) {
                break;
            }
            h51Var2 = h51Var;
            abstractC1787lf = abstractC1787lf2;
        }
        boolean zOooOo = OooOo(h51Var2);
        h51Var2.f19564OooO0oO = OooOOo(abstractC1787lf2, h51Var2.f19564OooO0oO);
        return !zOooOo;
    }

    public final h51 OooOO0O() {
        h51 h51Var = this.f20194OooO0oo;
        if (h51Var == null) {
            return null;
        }
        if (h51Var == this.f20186OooO) {
            this.f20186OooO = h51Var.f19569OooOOO0;
        }
        h51Var.OooO0oo();
        int i = this.OooOO0o - 1;
        this.OooOO0o = i;
        if (i == 0) {
            this.f20195OooOO0 = null;
            h51 h51Var2 = this.f20194OooO0oo;
            this.f20198OooOOO0 = h51Var2.f19559OooO0O0;
            this.f20197OooOOO = h51Var2.f19564OooO0oO.f19954OooO00o.f19660OooO0Oo;
        }
        this.f20194OooO0oo = this.f20194OooO0oo.f19569OooOOO0;
        OooO0oO();
        return this.f20194OooO0oo;
    }

    public final h51 OooOO0o() {
        h51 h51Var = this.f20186OooO;
        af0.OooOo0O(h51Var);
        this.f20186OooO = h51Var.f19569OooOOO0;
        OooO0oO();
        h51 h51Var2 = this.f20186OooO;
        af0.OooOo0O(h51Var2);
        return h51Var2;
    }

    public final h51 OooOOO() {
        return this.f20194OooO0oo;
    }

    public final h51 OooOOO0(i51 i51Var) {
        h51 h51Var;
        h51 h51Var2 = this.f20195OooOO0;
        long j = i51Var.f19955OooO0O0;
        long j2 = h51Var2 == null ? 1000000000000L : (h51Var2.f19571OooOOOo + h51Var2.f19564OooO0oO.f19959OooO0o0) - j;
        int i = 0;
        while (true) {
            if (i >= this.f20199OooOOOO.size()) {
                h51Var = null;
                break;
            }
            i51 i51Var2 = ((h51) this.f20199OooOOOO.get(i)).f19564OooO0oO;
            long j3 = i51Var2.f19959OooO0o0;
            if ((j3 == -9223372036854775807L || j3 == i51Var.f19959OooO0o0) && i51Var2.f19955OooO0O0 == j && i51Var2.f19954OooO00o.equals(i51Var.f19954OooO00o)) {
                h51Var = (h51) this.f20199OooOOOO.remove(i);
                break;
            }
            i++;
        }
        if (h51Var == null) {
            b51 b51Var = (b51) this.f20200OooOOOo.f21493OooOo0o;
            eb1 eb1VarZzk = b51Var.f17379OooOoOO.zzk();
            b51Var.f17417ooOO.getClass();
            h51Var = new h51(b51Var.f17376OooOo0o, j2, b51Var.f17378OooOoO0, eb1VarZzk, b51Var.f17391Oooo0o, i51Var, b51Var.f17377OooOoO);
        } else {
            h51Var.f19564OooO0oO = i51Var;
            h51Var.f19571OooOOOo = j2;
        }
        h51 h51Var3 = this.f20195OooOO0;
        if (h51Var3 == null) {
            this.f20194OooO0oo = h51Var;
            this.f20186OooO = h51Var;
        } else if (h51Var != h51Var3.f19569OooOOO0) {
            h51Var3.OooOO0O();
            h51Var3.f19569OooOOO0 = h51Var;
        }
        this.f20198OooOOO0 = null;
        this.f20195OooOO0 = h51Var;
        this.OooOO0o++;
        OooO0oO();
        return h51Var;
    }

    public final h51 OooOOOO(g91 g91Var) {
        for (int i = 0; i < this.f20199OooOOOO.size(); i++) {
            h51 h51Var = (h51) this.f20199OooOOOO.get(i);
            if (h51Var.f19558OooO00o == g91Var) {
                return h51Var;
            }
        }
        return null;
    }

    public final h51 OooOOOo() {
        return this.f20186OooO;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.i51 OooOOo(com.google.android.gms.internal.ads.AbstractC1787lf r19, com.google.android.gms.internal.ads.i51 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.h91 r3 = r2.f19954OooO00o
            boolean r4 = r3.OooO0O0()
            r5 = -1
            int r6 = r3.f19661OooO0o0
            if (r4 != 0) goto L16
            if (r6 != r5) goto L16
            r4 = 1
        L14:
            r11 = r4
            goto L18
        L16:
            r4 = 0
            goto L14
        L18:
            boolean r12 = r0.OooO(r1, r3)
            boolean r13 = r0.OooO0oo(r1, r3, r11)
            java.lang.Object r4 = r3.f19657OooO00o
            com.google.android.gms.internal.ads.ee r7 = r0.f20187OooO00o
            r1.OooOOO(r4, r7)
            boolean r1 = r3.OooO0O0()
            r8 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L36
            if (r6 != r5) goto L39
        L36:
            r16 = r14
            goto L44
        L39:
            com.google.android.gms.internal.ads.v3 r1 = r7.f18578OooO0o
            com.google.android.gms.internal.ads.OooO00o r1 = r1.OooO00o(r6)
            r1.getClass()
            r16 = r8
        L44:
            boolean r1 = r3.OooO0O0()
            int r4 = r3.f19658OooO0O0
            if (r1 == 0) goto L56
            int r1 = r3.f19659OooO0OO
            long r8 = r7.OooO00o(r4, r1)
        L52:
            r14 = r8
            r8 = r16
            goto L5f
        L56:
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 == 0) goto L5c
            r14 = r8
            goto L5f
        L5c:
            long r8 = r7.f18577OooO0Oo
            goto L52
        L5f:
            boolean r1 = r3.OooO0O0()
            if (r1 == 0) goto L69
            r7.OooO0OO(r4)
            goto L6e
        L69:
            if (r6 == r5) goto L6e
            r7.OooO0OO(r6)
        L6e:
            com.google.android.gms.internal.ads.i51 r1 = new com.google.android.gms.internal.ads.i51
            long r5 = r2.f19956OooO0OO
            r19 = r1
            long r0 = r2.f19955OooO0O0
            r2 = r3
            r7 = r8
            r9 = r14
            r3 = r0
            r1 = r19
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j51.OooOOo(com.google.android.gms.internal.ads.lf, com.google.android.gms.internal.ads.i51):com.google.android.gms.internal.ads.i51");
    }

    public final i51 OooOOo0(long j, r51 r51Var) {
        h51 h51Var = this.f20195OooOO0;
        return h51Var == null ? OooO0OO(r51Var.f23756OooO00o, r51Var.f23757OooO0O0, r51Var.f23758OooO0OO, r51Var.f23770OooOOo) : OooO0O0(r51Var.f23756OooO00o, h51Var, j);
    }

    public final h91 OooOOoo(AbstractC1787lf abstractC1787lf, Object obj) {
        long jOooO00o;
        int iOooO00o;
        C1528ee c1528ee = this.f20187OooO00o;
        int i = abstractC1787lf.OooOOO(obj, c1528ee).f18576OooO0OO;
        Object obj2 = this.f20198OooOOO0;
        if (obj2 == null || (iOooO00o = abstractC1787lf.OooO00o(obj2)) == -1 || abstractC1787lf.OooO0Oo(iOooO00o, c1528ee, false).f18576OooO0OO != i) {
            h51 h51Var = this.f20194OooO0oo;
            while (true) {
                if (h51Var == null) {
                    h51 h51Var2 = this.f20194OooO0oo;
                    while (true) {
                        if (h51Var2 != null) {
                            int iOooO00o2 = abstractC1787lf.OooO00o(h51Var2.f19559OooO0O0);
                            if (iOooO00o2 != -1 && abstractC1787lf.OooO0Oo(iOooO00o2, c1528ee, false).f18576OooO0OO == i) {
                                jOooO00o = h51Var2.f19564OooO0oO.f19954OooO00o.f19660OooO0Oo;
                                break;
                            }
                            h51Var2 = h51Var2.f19569OooOOO0;
                        } else {
                            jOooO00o = OooO00o(obj);
                            if (jOooO00o == -1) {
                                jOooO00o = this.f20192OooO0o0;
                                this.f20192OooO0o0 = 1 + jOooO00o;
                                if (this.f20194OooO0oo == null) {
                                    this.f20198OooOOO0 = obj;
                                    this.f20197OooOOO = jOooO00o;
                                }
                            }
                        }
                    }
                } else {
                    if (h51Var.f19559OooO0O0.equals(obj)) {
                        jOooO00o = h51Var.f19564OooO0oO.f19954OooO00o.f19660OooO0Oo;
                        break;
                    }
                    h51Var = h51Var.f19569OooOOO0;
                }
            }
        } else {
            jOooO00o = this.f20197OooOOO;
        }
        long j = jOooO00o;
        abstractC1787lf.OooOOO(obj, c1528ee);
        int i2 = c1528ee.f18576OooO0OO;
        C2045se c2045se = this.f20188OooO0O0;
        abstractC1787lf.OooO0o0(i2, c2045se, 0L);
        for (int iOooO00o3 = abstractC1787lf.OooO00o(obj); iOooO00o3 >= c2045se.f24079OooOO0O; iOooO00o3--) {
            abstractC1787lf.OooO0Oo(iOooO00o3, c1528ee, true);
            c1528ee.f18578OooO0o.getClass();
            c1528ee.f18578OooO0o.OooO00o(-1);
            int i3 = OooO00o.f16774OooO0o;
        }
        return OooO0o(abstractC1787lf, obj, j, c2045se, this.f20187OooO00o);
    }

    public final boolean OooOo(h51 h51Var) {
        af0.OooOo0O(h51Var);
        int i = 0;
        if (h51Var.equals(this.f20195OooOO0)) {
            return false;
        }
        this.f20195OooOO0 = h51Var;
        boolean z = false;
        while (true) {
            h51Var = h51Var.f19569OooOOO0;
            if (h51Var == null) {
                break;
            }
            if (h51Var == this.f20186OooO) {
                this.f20186OooO = this.f20194OooO0oo;
                z = true;
            }
            h51Var.OooO0oo();
            this.OooOO0o--;
        }
        h51 h51Var2 = this.f20195OooOO0;
        h51Var2.getClass();
        if (h51Var2.f19569OooOOO0 != null) {
            h51Var2.OooOO0O();
            h51Var2.f19569OooOOO0 = null;
            while (true) {
                ab1 ab1Var = h51Var2.f19570OooOOOO;
                if (i >= ab1Var.f17021OooOo0O) {
                    break;
                }
                ab1Var.OooO0Oo(i);
                za1 za1Var = ((za1[]) h51Var2.f19570OooOOOO.f17020OooOo)[i];
                i++;
            }
        }
        OooO0oO();
        return z;
    }

    public final void OooOo0() {
        h51 h51Var = this.f20196OooOO0O;
        if (h51Var == null || h51Var.OooOO0()) {
            this.f20196OooOO0O = null;
            for (int i = 0; i < this.f20199OooOOOO.size(); i++) {
                h51 h51Var2 = (h51) this.f20199OooOOOO.get(i);
                if (!h51Var2.OooOO0()) {
                    this.f20196OooOO0O = h51Var2;
                    return;
                }
            }
        }
    }

    public final void OooOo00() {
        if (this.OooOO0o == 0) {
            return;
        }
        h51 h51Var = this.f20194OooO0oo;
        af0.OooOo0O(h51Var);
        this.f20198OooOOO0 = h51Var.f19559OooO0O0;
        this.f20197OooOOO = h51Var.f19564OooO0oO.f19954OooO00o.f19660OooO0Oo;
        while (h51Var != null) {
            h51Var.OooO0oo();
            h51Var = h51Var.f19569OooOOO0;
        }
        this.f20194OooO0oo = null;
        this.f20195OooOO0 = null;
        this.f20186OooO = null;
        this.OooOO0o = 0;
        OooO0oO();
    }

    public final void OooOo0O() {
        if (this.f20199OooOOOO.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f20199OooOOOO.size(); i++) {
            ((h51) this.f20199OooOOOO.get(i)).OooO0oo();
        }
        this.f20199OooOOOO = arrayList;
        this.f20196OooOO0O = null;
        OooOo0();
    }

    public final void OooOo0o(n41 n41Var) {
        n41Var.getClass();
        OooOo0O();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00cc, code lost:
    
        if (OooOo(r3) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0022, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOoO(com.google.android.gms.internal.ads.AbstractC1787lf r28, long r29, long r31) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j51.OooOoO(com.google.android.gms.internal.ads.lf, long, long):boolean");
    }

    public final boolean OooOoO0() {
        h51 h51Var = this.f20195OooOO0;
        if (h51Var != null) {
            return !h51Var.f19564OooO0oO.f19961OooO0oo && h51Var.OooO() && this.f20195OooOO0.f19564OooO0oO.f19959OooO0o0 != -9223372036854775807L && this.OooOO0o < 100;
        }
        return true;
    }

    public final boolean OooOoOO(AbstractC1787lf abstractC1787lf, int i) {
        this.f20191OooO0o = i;
        return OooOO0(abstractC1787lf);
    }

    public final boolean OooOoo0(AbstractC1787lf abstractC1787lf, boolean z) {
        this.f20193OooO0oO = z;
        return OooOO0(abstractC1787lf);
    }
}
