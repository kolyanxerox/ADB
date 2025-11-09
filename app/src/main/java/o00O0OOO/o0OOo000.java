package o00O0ooo;

import Oooo0o0.OooO;
import java.util.Arrays;
import o00O.OooO0O0;
import o00O.OooO0o;
import o00O.o00Oo0;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import o00O0oOo.o0ooOOo;
import o00O0oOo.oo0o0Oo;
import o00O0oo.o0000oo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public class o0OOo000 extends OooO0O0 implements o0OO0oO0, o0OoOoOo, o00Oo0 {

    /* renamed from: OooOoO */
    public final int f31789OooOoO;

    /* renamed from: OooOoO0 */
    public final int f31790OooOoO0;

    /* renamed from: OooOoOO */
    public final o0000oo f31791OooOoOO;

    /* renamed from: OooOoo */
    public long f31792OooOoo;

    /* renamed from: OooOoo0 */
    public Object[] f31793OooOoo0;

    /* renamed from: OooOooO */
    public long f31794OooOooO;

    /* renamed from: OooOooo */
    public int f31795OooOooo;

    /* renamed from: Oooo000 */
    public int f31796Oooo000;

    public o0OOo000(int i, int i2, o0000oo o0000ooVar) {
        this.f31790OooOoO0 = i;
        this.f31789OooOoO = i2;
        this.f31791OooOoOO = o0000ooVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x00bc, code lost:
    
        throw r2.OooO0o0();
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO(o00O0ooo.o0OOo000 r8, o00O0ooo.o0O000Oo r9, o00O0O0O.OooO0OO r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0ooo.o0OOo000.OooO(o00O0ooo.o0OOo000, o00O0ooo.o0O000Oo, o00O0O0O.OooO0OO):void");
    }

    @Override // o00O0ooo.o0OO0oO0
    public final boolean OooO00o(Object obj) {
        int i;
        boolean z;
        OooO0OO[] oooO0OOArrOooOO0o = o00O.OooO0OO.f31170OooO00o;
        synchronized (this) {
            if (OooOOOO(obj)) {
                oooO0OOArrOooOO0o = OooOO0o(oooO0OOArrOooOO0o);
                z = true;
            } else {
                z = false;
            }
        }
        for (OooO0OO oooO0OO : oooO0OOArrOooOO0o) {
            if (oooO0OO != null) {
                oooO0OO.resumeWith(OooOo.f33195OooO00o);
            }
        }
        return z;
    }

    @Override // o00O.o00Oo0
    public final o0OoOoOo OooO0O0(OooOOO0 oooOOO0, int i, o0000oo o0000ooVar) {
        return o0o0000.OooOOOo(this, oooOOO0, i, o0000ooVar);
    }

    @Override // o00O.OooO0O0
    public final OooO0o OooO0Oo() {
        oO0Oo oo0oo = new oO0Oo();
        oo0oo.f31842OooO00o = -1L;
        return oo0oo;
    }

    @Override // o00O.OooO0O0
    public final OooO0o[] OooO0o0() {
        return new oO0Oo[2];
    }

    public final Object OooO0oO(oO0Oo oo0oo, o0OOOO0o o0oooo0o) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, OooO.OooOOOO(o0oooo0o));
        oo0o0oo.OooOOo0();
        synchronized (this) {
            if (OooOOOo(oo0oo) < 0) {
                oo0oo.f31843OooO0O0 = oo0o0oo;
            } else {
                oo0o0oo.resumeWith(OooOo.f33195OooO00o);
            }
        }
        Object objOooOOOo = oo0o0oo.OooOOOo();
        return objOooOOOo == OooOo00.f31365OooOo0O ? objOooOOOo : OooOo.f33195OooO00o;
    }

    public final void OooO0oo() {
        if (this.f31789OooOoO != 0 || this.f31796Oooo000 > 1) {
            Object[] objArr = this.f31793OooOoo0;
            kotlin.jvm.internal.OooOo.OooO0O0(objArr);
            while (this.f31796Oooo000 > 0) {
                long jOooOOO0 = OooOOO0();
                int i = this.f31795OooOooo;
                int i2 = this.f31796Oooo000;
                if (objArr[((int) ((jOooOOO0 + (i + i2)) - 1)) & (objArr.length - 1)] != o0o0000.f31803OooO00o) {
                    return;
                }
                this.f31796Oooo000 = i2 - 1;
                o0o0000.OooO0o(objArr, OooOOO0() + this.f31795OooOooo + this.f31796Oooo000, null);
            }
        }
    }

    public final void OooOO0() {
        OooO0o[] oooO0oArr;
        Object[] objArr = this.f31793OooOoo0;
        kotlin.jvm.internal.OooOo.OooO0O0(objArr);
        o0o0000.OooO0o(objArr, OooOOO0(), null);
        this.f31795OooOooo--;
        long jOooOOO0 = OooOOO0() + 1;
        if (this.f31792OooOoo < jOooOOO0) {
            this.f31792OooOoo = jOooOOO0;
        }
        if (this.f31794OooOooO < jOooOOO0) {
            if (this.f31169OooOo0o != 0 && (oooO0oArr = this.f31168OooOo0O) != null) {
                for (OooO0o oooO0o : oooO0oArr) {
                    if (oooO0o != null) {
                        oO0Oo oo0oo = (oO0Oo) oooO0o;
                        long j = oo0oo.f31842OooO00o;
                        if (j >= 0 && j < jOooOOO0) {
                            oo0oo.f31842OooO00o = jOooOOO0;
                        }
                    }
                }
            }
            this.f31794OooOooO = jOooOOO0;
        }
    }

    public final void OooOO0O(Object obj) {
        int i = this.f31795OooOooo + this.f31796Oooo000;
        Object[] objArrOooOOO = this.f31793OooOoo0;
        if (objArrOooOOO == null) {
            objArrOooOOO = OooOOO(null, 0, 2);
        } else if (i >= objArrOooOOO.length) {
            objArrOooOOO = OooOOO(objArrOooOOO, i, objArrOooOOO.length * 2);
        }
        o0o0000.OooO0o(objArrOooOOO, OooOOO0() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final OooO0OO[] OooOO0o(OooO0OO[] oooO0OOArr) {
        OooO0o[] oooO0oArr;
        oO0Oo oo0oo;
        oo0o0Oo oo0o0oo;
        int length = oooO0OOArr.length;
        if (this.f31169OooOo0o != 0 && (oooO0oArr = this.f31168OooOo0O) != null) {
            int length2 = oooO0oArr.length;
            int i = 0;
            oooO0OOArr = oooO0OOArr;
            while (i < length2) {
                OooO0o oooO0o = oooO0oArr[i];
                if (oooO0o != null && (oo0o0oo = (oo0oo = (oO0Oo) oooO0o).f31843OooO0O0) != null && OooOOOo(oo0oo) >= 0) {
                    int length3 = oooO0OOArr.length;
                    oooO0OOArr = oooO0OOArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(oooO0OOArr, Math.max(2, oooO0OOArr.length * 2));
                        kotlin.jvm.internal.OooOo.OooO0Oo(CopyOf, "copyOf(...)");
                        oooO0OOArr = CopyOf;
                    }
                    oooO0OOArr[length] = oo0o0oo;
                    oo0oo.f31843OooO0O0 = null;
                    length++;
                }
                i++;
                oooO0OOArr = oooO0OOArr;
            }
        }
        return oooO0OOArr;
    }

    public final Object[] OooOOO(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f31793OooOoo0 = objArr2;
        if (objArr != null) {
            long jOooOOO0 = OooOOO0();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + jOooOOO0;
                o0o0000.OooO0o(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final long OooOOO0() {
        return Math.min(this.f31794OooOooO, this.f31792OooOoo);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOOO(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f31169OooOo0o
            int r2 = r12.f31790OooOoO0
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7f
        Lb:
            r12.OooOO0O(r13)
            int r1 = r12.f31795OooOooo
            int r1 = r1 + r9
            r12.f31795OooOooo = r1
            if (r1 <= r2) goto L18
            r12.OooOO0()
        L18:
            long r1 = r12.OooOOO0()
            int r3 = r12.f31795OooOooo
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f31794OooOooO = r1
            return r9
        L23:
            int r1 = r12.f31795OooOooo
            int r3 = r12.f31789OooOoO
            if (r1 < r3) goto L47
            long r4 = r12.f31794OooOooO
            long r6 = r12.f31792OooOoo
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L47
            o00O0oo.o0000oo r1 = r12.f31791OooOoOO
            int r1 = r1.ordinal()
            if (r1 == 0) goto L45
            if (r1 == r9) goto L47
            r2 = 2
            if (r1 != r2) goto L3f
            goto L7f
        L3f:
            OooOOO0.OooO00o r1 = new OooOOO0.OooO00o
            r1.<init>()
            throw r1
        L45:
            r1 = 0
            return r1
        L47:
            r12.OooOO0O(r13)
            int r1 = r12.f31795OooOooo
            int r1 = r1 + r9
            r12.f31795OooOooo = r1
            if (r1 <= r3) goto L54
            r12.OooOO0()
        L54:
            long r3 = r12.OooOOO0()
            int r1 = r12.f31795OooOooo
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f31792OooOoo
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7f
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f31794OooOooO
            long r5 = r12.OooOOO0()
            int r7 = r12.f31795OooOooo
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.OooOOO0()
            int r10 = r12.f31795OooOooo
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f31796Oooo000
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.OooOOo(r1, r3, r5, r7)
        L7f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0ooo.o0OOo000.OooOOOO(java.lang.Object):boolean");
    }

    public final long OooOOOo(oO0Oo oo0oo) {
        long j = oo0oo.f31842OooO00o;
        if (j < OooOOO0() + this.f31795OooOooo) {
            return j;
        }
        if (this.f31789OooOoO <= 0 && j <= OooOOO0() && this.f31796Oooo000 != 0) {
            return j;
        }
        return -1L;
    }

    public final void OooOOo(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jOooOOO0 = OooOOO0(); jOooOOO0 < jMin; jOooOOO0++) {
            Object[] objArr = this.f31793OooOoo0;
            kotlin.jvm.internal.OooOo.OooO0O0(objArr);
            o0o0000.OooO0o(objArr, jOooOOO0, null);
        }
        this.f31792OooOoo = j;
        this.f31794OooOooO = j2;
        this.f31795OooOooo = (int) (j3 - jMin);
        this.f31796Oooo000 = (int) (j4 - j3);
    }

    public final Object OooOOo0(oO0Oo oo0oo) {
        Object obj;
        OooO0OO[] oooO0OOArrOooOOoo = o00O.OooO0OO.f31170OooO00o;
        synchronized (this) {
            try {
                long jOooOOOo = OooOOOo(oo0oo);
                if (jOooOOOo < 0) {
                    obj = o0o0000.f31803OooO00o;
                } else {
                    long j = oo0oo.f31842OooO00o;
                    Object[] objArr = this.f31793OooOoo0;
                    kotlin.jvm.internal.OooOo.OooO0O0(objArr);
                    Object obj2 = objArr[((int) jOooOOOo) & (objArr.length - 1)];
                    if (obj2 instanceof o0OOOO00) {
                        obj2 = ((o0OOOO00) obj2).f31778OooOo;
                    }
                    oo0oo.f31842OooO00o = jOooOOOo + 1;
                    Object obj3 = obj2;
                    oooO0OOArrOooOOoo = OooOOoo(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (OooO0OO oooO0OO : oooO0OOArrOooOOoo) {
            if (oooO0OO != null) {
                oooO0OO.resumeWith(OooOo.f33195OooO00o);
            }
        }
        return obj;
    }

    public final OooO0OO[] OooOOoo(long j) {
        long j2;
        long j3;
        long j4;
        int i;
        OooO0OO[] oooO0OOArr;
        OooO0o[] oooO0oArr;
        long j5 = this.f31794OooOooO;
        OooO0OO[] oooO0OOArr2 = o00O.OooO0OO.f31170OooO00o;
        if (j <= j5) {
            long jOooOOO0 = OooOOO0();
            long j6 = this.f31795OooOooo + jOooOOO0;
            int i2 = this.f31789OooOoO;
            if (i2 == 0 && this.f31796Oooo000 > 0) {
                j6++;
            }
            int i3 = 0;
            if (this.f31169OooOo0o != 0 && (oooO0oArr = this.f31168OooOo0O) != null) {
                for (OooO0o oooO0o : oooO0oArr) {
                    if (oooO0o != null) {
                        long j7 = ((oO0Oo) oooO0o).f31842OooO00o;
                        if (j7 >= 0 && j7 < j6) {
                            j6 = j7;
                        }
                    }
                }
            }
            if (j6 > this.f31794OooOooO) {
                long jOooOOO02 = OooOOO0() + this.f31795OooOooo;
                int iMin = this.f31169OooOo0o > 0 ? Math.min(this.f31796Oooo000, i2 - ((int) (jOooOOO02 - j6))) : this.f31796Oooo000;
                long j8 = this.f31796Oooo000 + jOooOOO02;
                o000O0O0.OooO0O0 oooO0O0 = o0o0000.f31803OooO00o;
                if (iMin > 0) {
                    OooO0OO[] oooO0OOArr3 = new OooO0OO[iMin];
                    j4 = 1;
                    Object[] objArr = this.f31793OooOoo0;
                    kotlin.jvm.internal.OooOo.OooO0O0(objArr);
                    i = i2;
                    long j9 = jOooOOO02;
                    while (true) {
                        if (jOooOOO02 >= j8) {
                            j2 = jOooOOO0;
                            j3 = j6;
                            break;
                        }
                        j2 = jOooOOO0;
                        Object obj = objArr[((int) jOooOOO02) & (objArr.length - 1)];
                        if (obj != oooO0O0) {
                            kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            o0OOOO00 o0oooo00 = (o0OOOO00) obj;
                            int i4 = i3 + 1;
                            j3 = j6;
                            oooO0OOArr3[i3] = o0oooo00.f31781OooOoO0;
                            o0o0000.OooO0o(objArr, jOooOOO02, oooO0O0);
                            o0o0000.OooO0o(objArr, j9, o0oooo00.f31778OooOo);
                            j9++;
                            if (i4 >= iMin) {
                                break;
                            }
                            i3 = i4;
                        } else {
                            j3 = j6;
                        }
                        jOooOOO02++;
                        jOooOOO0 = j2;
                        j6 = j3;
                    }
                    jOooOOO02 = j9;
                    oooO0OOArr = oooO0OOArr3;
                } else {
                    j2 = jOooOOO0;
                    j3 = j6;
                    j4 = 1;
                    i = i2;
                    oooO0OOArr = oooO0OOArr2;
                }
                int i5 = (int) (jOooOOO02 - j2);
                long j10 = this.f31169OooOo0o == 0 ? jOooOOO02 : j3;
                long jMax = Math.max(this.f31792OooOoo, jOooOOO02 - Math.min(this.f31790OooOoO0, i5));
                if (i == 0 && jMax < j8) {
                    Object[] objArr2 = this.f31793OooOoo0;
                    kotlin.jvm.internal.OooOo.OooO0O0(objArr2);
                    if (kotlin.jvm.internal.OooOo.OooO00o(objArr2[((int) jMax) & (objArr2.length - 1)], oooO0O0)) {
                        jOooOOO02 += j4;
                        jMax += j4;
                    }
                }
                OooOOo(jMax, j10, jOooOOO02, j8);
                OooO0oo();
                return oooO0OOArr.length == 0 ? oooO0OOArr : OooOO0o(oooO0OOArr);
            }
        }
        return oooO0OOArr2;
    }

    @Override // o00O0ooo.o0OoOoOo
    public final Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) throws Throwable {
        OooO(this, o0o000oo, oooO0OO);
        return OooOo00.f31365OooOo0O;
    }

    @Override // o00O0ooo.o0OO0oO0, o00O0ooo.o0O000Oo
    public final Object emit(Object obj, OooO0OO oooO0OO) throws Throwable {
        Throwable th;
        OooO0OO[] oooO0OOArrOooOO0o;
        o0OOOO00 o0oooo00;
        if (OooO00o(obj)) {
            return OooOo.f33195OooO00o;
        }
        oo0o0Oo oo0o0oo = new oo0o0Oo(1, OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        OooO0OO[] oooO0OOArrOooOO0o2 = o00O.OooO0OO.f31170OooO00o;
        synchronized (this) {
            try {
                if (OooOOOO(obj)) {
                    try {
                        oo0o0oo.resumeWith(OooOo.f33195OooO00o);
                        oooO0OOArrOooOO0o = OooOO0o(oooO0OOArrOooOO0o2);
                        o0oooo00 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        o0OOOO00 o0oooo002 = new o0OOOO00(this, OooOOO0() + this.f31795OooOooo + this.f31796Oooo000, obj, oo0o0oo);
                        OooOO0O(o0oooo002);
                        this.f31796Oooo000++;
                        if (this.f31789OooOoO == 0) {
                            oooO0OOArrOooOO0o2 = OooOO0o(oooO0OOArrOooOO0o2);
                        }
                        oooO0OOArrOooOO0o = oooO0OOArrOooOO0o2;
                        o0oooo00 = o0oooo002;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (o0oooo00 != null) {
                    oo0o0oo.OooOo0(new o0ooOOo(o0oooo00, 2));
                }
                for (OooO0OO oooO0OO2 : oooO0OOArrOooOO0o) {
                    if (oooO0OO2 != null) {
                        oooO0OO2.resumeWith(OooOo.f33195OooO00o);
                    }
                }
                Object objOooOOOo = oo0o0oo.OooOOOo();
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                if (objOooOOOo != oooOo00) {
                    objOooOOOo = OooOo.f33195OooO00o;
                }
                return objOooOOOo == oooOo00 ? objOooOOOo : OooOo.f33195OooO00o;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }
}
