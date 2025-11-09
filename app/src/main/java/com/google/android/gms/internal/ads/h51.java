package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class h51 {

    /* renamed from: OooO */
    public final boolean[] f19557OooO;

    /* renamed from: OooO00o */
    public final Object f19558OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f19559OooO0O0;

    /* renamed from: OooO0OO */
    public final ba1[] f19560OooO0OO;

    /* renamed from: OooO0Oo */
    public boolean f19561OooO0Oo;

    /* renamed from: OooO0o */
    public boolean f19562OooO0o;

    /* renamed from: OooO0o0 */
    public boolean f19563OooO0o0;

    /* renamed from: OooO0oO */
    public i51 f19564OooO0oO;

    /* renamed from: OooO0oo */
    public boolean f19565OooO0oo;

    /* renamed from: OooOO0 */
    public final f81[] f19566OooOO0;

    /* renamed from: OooOO0O */
    public final xa1 f19567OooOO0O;
    public final g80 OooOO0o;

    /* renamed from: OooOOO */
    public ha1 f19568OooOOO;

    /* renamed from: OooOOO0 */
    public h51 f19569OooOOO0;

    /* renamed from: OooOOOO */
    public ab1 f19570OooOOOO;

    /* renamed from: OooOOOo */
    public long f19571OooOOOo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.p81] */
    public h51(f81[] f81VarArr, long j, xa1 xa1Var, eb1 eb1Var, g80 g80Var, i51 i51Var, ab1 ab1Var) {
        this.f19566OooOO0 = f81VarArr;
        this.f19571OooOOOo = j;
        this.f19567OooOO0O = xa1Var;
        this.OooOO0o = g80Var;
        h91 h91Var = i51Var.f19954OooO00o;
        this.f19559OooO0O0 = h91Var.f19657OooO00o;
        this.f19564OooO0oO = i51Var;
        this.f19568OooOOO = ha1.f19673OooO0Oo;
        this.f19570OooOOOO = ab1Var;
        this.f19560OooO0OO = new ba1[2];
        this.f19557OooO = new boolean[2];
        g80Var.getClass();
        int i = x51.f25516OooOO0O;
        Pair pair = (Pair) h91Var.f19657OooO00o;
        Object obj = pair.first;
        h91 h91VarOooO00o = h91Var.OooO00o(pair.second);
        p51 p51Var = (p51) ((HashMap) g80Var.f19271OooOoO).get(obj);
        p51Var.getClass();
        ((HashSet) g80Var.f19274OooOoo).add(p51Var);
        o51 o51Var = (o51) ((HashMap) g80Var.f19275OooOoo0).get(p51Var);
        if (o51Var != null) {
            o51Var.f22342OooO00o.OooO0oO(o51Var.f22343OooO0O0);
        }
        p51Var.f23228OooO0OO.add(h91VarOooO00o);
        z81 z81VarOooO0O0 = p51Var.f23226OooO00o.OooO0O0(h91VarOooO00o, eb1Var, i51Var.f19955OooO0O0);
        ((IdentityHashMap) g80Var.f19272OooOoO0).put(z81VarOooO0O0, p51Var);
        g80Var.OooOO0O();
        long j2 = i51Var.f19957OooO0Oo;
        this.f19558OooO00o = j2 != -9223372036854775807L ? new p81(z81VarOooO0O0, j2) : z81VarOooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.ca1, java.lang.Object] */
    public final boolean OooO() {
        if (this.f19563OooO0o0) {
            return !this.f19562OooO0o || this.f19558OooO00o.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    public final long OooO00o(ab1 ab1Var, long j, boolean z, boolean[] zArr) {
        f81[] f81VarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= ab1Var.f17021OooOo0O) {
                break;
            }
            if (z || !ab1Var.OooO0OO(this.f19570OooOOOO, i)) {
                z2 = false;
            }
            this.f19557OooO[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            f81VarArr = this.f19566OooOO0;
            if (i2 >= 2) {
                break;
            }
            f81VarArr[i2].getClass();
            i2++;
        }
        OooOO0O();
        this.f19570OooOOOO = ab1Var;
        if (this.f19569OooOOO0 == null) {
            int i3 = 0;
            while (true) {
                ab1 ab1Var2 = this.f19570OooOOOO;
                if (i3 >= ab1Var2.f17021OooOo0O) {
                    break;
                }
                ab1Var2.OooO0Oo(i3);
                za1 za1Var = ((za1[]) this.f19570OooOOOO.f17020OooOo)[i3];
                i3++;
            }
        }
        long jOooO0o = this.f19558OooO00o.OooO0o((za1[]) ab1Var.f17020OooOo, this.f19557OooO, this.f19560OooO0OO, zArr, j);
        for (int i4 = 0; i4 < 2; i4++) {
            f81VarArr[i4].getClass();
        }
        this.f19562OooO0o = false;
        for (int i5 = 0; i5 < 2; i5++) {
            if (this.f19560OooO0OO[i5] != null) {
                af0.OooooO0(ab1Var.OooO0Oo(i5));
                f81VarArr[i5].getClass();
                this.f19562OooO0o = true;
            } else {
                af0.OooooO0(((za1[]) ab1Var.f17020OooOo)[i5] == null);
            }
        }
        return jOooO0o;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.ca1, java.lang.Object] */
    public final long OooO0O0() {
        if (!this.f19563OooO0o0) {
            return this.f19564OooO0oO.f19955OooO0O0;
        }
        long jZzb = this.f19562OooO0o ? this.f19558OooO00o.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f19564OooO0oO.f19959OooO0o0 : jZzb;
    }

    public final long OooO0OO() {
        return this.f19564OooO0oO.f19955OooO0O0 + this.f19571OooOOOo;
    }

    public final ha1 OooO0Oo() {
        return this.f19568OooOOO;
    }

    public final ab1 OooO0o(AbstractC1787lf abstractC1787lf) {
        f81[] f81VarArr;
        qa1 qa1Var;
        int i;
        boolean z;
        String str;
        int i2;
        int i3;
        za1[] za1VarArr;
        boolean z2;
        int[][][] iArr;
        boolean z3;
        int[] iArr2;
        int length;
        ja1 ja1Var;
        int i4;
        int i5;
        ya1[] ya1VarArr;
        int i6;
        ya1[] ya1VarArr2;
        C1421bg c1421bg;
        OoooOOO.o0O0oo00 o0o0oo00;
        o0OoOo0[] o0oooo0Arr;
        int i7;
        int[] iArr3;
        ha1 ha1Var = this.f19568OooOOO;
        xa1 xa1Var = this.f19567OooOO0O;
        xa1Var.getClass();
        int[] iArr4 = new int[3];
        C1421bg[][] c1421bgArr = new C1421bg[3][];
        int[][][] iArr5 = new int[3][][];
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = ha1Var.f19674OooO00o;
            c1421bgArr[i8] = new C1421bg[i9];
            iArr5[i8] = new int[i9][];
        }
        int i10 = 2;
        int[] iArr6 = new int[2];
        int i11 = 0;
        while (true) {
            f81VarArr = this.f19566OooOO0;
            if (i11 >= 2) {
                break;
            }
            f81VarArr[i11].getClass();
            iArr6[i11] = 8;
            i11++;
        }
        int i12 = 0;
        while (i12 < ha1Var.f19674OooO00o) {
            C1421bg c1421bgOooO00o = ha1Var.OooO00o(i12);
            int i13 = i10;
            int i14 = 0;
            int i15 = 0;
            boolean z4 = true;
            while (true) {
                o0oooo0Arr = c1421bgOooO00o.f17495OooO0Oo;
                i7 = c1421bgOooO00o.f17492OooO00o;
                if (i14 >= i10) {
                    break;
                }
                f81 f81Var = f81VarArr[i14];
                ha1 ha1Var2 = ha1Var;
                int i16 = 0;
                int iMax = 0;
                while (i16 < i7) {
                    int i17 = i16;
                    iMax = Math.max(iMax, f81Var.OooOOOO(o0oooo0Arr[i17]) & 7);
                    i16 = i17 + 1;
                }
                boolean z5 = iArr4[i14] == 0;
                if (iMax > i15) {
                    z4 = z5;
                } else if (iMax == i15 && c1421bgOooO00o.f17494OooO0OO == 5 && !z4 && z5) {
                    z4 = true;
                } else {
                    i14++;
                    ha1Var = ha1Var2;
                    i10 = 2;
                }
                i15 = iMax;
                i13 = i14;
                i14++;
                ha1Var = ha1Var2;
                i10 = 2;
            }
            ha1 ha1Var3 = ha1Var;
            if (i13 == i10) {
                iArr3 = new int[i7];
            } else {
                f81 f81Var2 = f81VarArr[i13];
                int[] iArr7 = new int[i7];
                for (int i18 = 0; i18 < i7; i18++) {
                    iArr7[i18] = f81Var2.OooOOOO(o0oooo0Arr[i18]);
                }
                iArr3 = iArr7;
            }
            int i19 = iArr4[i13];
            c1421bgArr[i13][i19] = c1421bgOooO00o;
            iArr5[i13][i19] = iArr3;
            iArr4[i13] = i19 + 1;
            i12++;
            ha1Var = ha1Var3;
            i10 = 2;
        }
        int i20 = i10;
        ha1[] ha1VarArr = new ha1[i20];
        String[] strArr = new String[i20];
        int[] iArr8 = new int[i20];
        int i21 = 0;
        while (i21 < i20) {
            int i22 = iArr4[i21];
            ha1VarArr[i21] = new ha1((C1421bg[]) i80.OooO0o(i22, c1421bgArr[i21]));
            iArr5[i21] = (int[][]) i80.OooO0o(i22, iArr5[i21]);
            strArr[i21] = f81VarArr[i21].OooOO0O();
            iArr8[i21] = f81VarArr[i21].f18818OooOo0o;
            i21++;
            i20 = 2;
        }
        int i23 = i20;
        OooOOo0.o0OOO0o o0ooo0o = new OooOOo0.o0OOO0o(iArr8, ha1VarArr, iArr6, iArr5, new ha1((C1421bg[]) i80.OooO0o(iArr4[i23], c1421bgArr[i23])), 14);
        synchronized (xa1Var.f25588OooO0OO) {
            try {
                qa1Var = xa1Var.f25590OooO0o;
                if (qa1Var.f23560OooOOOo && i80.f19994OooO00o >= 32 && (o0o0oo00 = xa1Var.f25592OooO0oO) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    af0.OooOo0O(looperMyLooper);
                    if (((ra1) o0o0oo00.f14471OooOoO0) == null && ((Handler) o0o0oo00.f14468OooOo) == null) {
                        o0o0oo00.f14471OooOoO0 = new ra1(xa1Var);
                        Handler handler = new Handler(looperMyLooper);
                        o0o0oo00.f14468OooOo = handler;
                        ((Spatializer) o0o0oo00.f14470OooOo0o).addOnSpatializerStateChangedListener(new oOO0Oo00(2, handler), (ra1) o0o0oo00.f14471OooOoO0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i24 = 2;
        ya1[] ya1VarArr3 = new ya1[2];
        int i25 = 0;
        int i26 = 0;
        while (true) {
            i = 1;
            if (i26 >= 2) {
                z = false;
                break;
            }
            if (((int[]) o0ooo0o.f13518OooOo0o)[i26] == 2 && ((ha1[]) o0ooo0o.f13516OooOo)[i26].f19674OooO00o > 0) {
                z = true;
                break;
            }
            i26++;
        }
        Pair pairOooO0Oo = xa1.OooO0Oo(1, o0ooo0o, iArr5, new OoooOOO.o0O0oo00(xa1Var, qa1Var, z, iArr6), new oO00Oo00(9));
        if (pairOooO0Oo != null) {
            ya1VarArr3[((Integer) pairOooO0Oo.second).intValue()] = (ya1) pairOooO0Oo.first;
        }
        if (pairOooO0Oo == null) {
            str = null;
        } else {
            ya1 ya1Var = (ya1) pairOooO0Oo.first;
            str = ya1Var.f25886OooO00o.f17495OooO0Oo[ya1Var.f25887OooO0O0[0]].f22214OooO0Oo;
        }
        Pair pairOooO0Oo2 = xa1.OooO0Oo(2, o0ooo0o, iArr5, new bi0(qa1Var, str, iArr6, 14), new oO00Oo00(8));
        int i27 = 4;
        Pair pairOooO0Oo3 = pairOooO0Oo2 == null ? xa1.OooO0Oo(4, o0ooo0o, iArr5, new hk0(qa1Var, 11), new oO00Oo00(7)) : null;
        if (pairOooO0Oo3 != null) {
            ya1VarArr3[((Integer) pairOooO0Oo3.second).intValue()] = (ya1) pairOooO0Oo3.first;
        } else if (pairOooO0Oo2 != null) {
            ya1VarArr3[((Integer) pairOooO0Oo2.second).intValue()] = (ya1) pairOooO0Oo2.first;
        }
        int i28 = 3;
        Pair pairOooO0Oo4 = xa1.OooO0Oo(3, o0ooo0o, iArr5, new dx0(12, qa1Var, str), new oO00Oo00(10));
        if (pairOooO0Oo4 != null) {
            ya1VarArr3[((Integer) pairOooO0Oo4.second).intValue()] = (ya1) pairOooO0Oo4.first;
        }
        int i29 = 0;
        while (i29 < i24) {
            int i30 = ((int[]) o0ooo0o.f13518OooOo0o)[i29];
            if (i30 == i24 || i30 == i || i30 == i28 || i30 == i27) {
                ya1VarArr = ya1VarArr3;
                i6 = i25;
            } else {
                ha1 ha1Var4 = ((ha1[]) o0ooo0o.f13516OooOo)[i29];
                int[][] iArr9 = iArr5[i29];
                int i31 = i25;
                i6 = i31;
                int i32 = i6;
                C1421bg c1421bg2 = null;
                oa1 oa1Var = null;
                while (i31 < ha1Var4.f19674OooO00o) {
                    C1421bg c1421bgOooO00o2 = ha1Var4.OooO00o(i31);
                    int[] iArr10 = iArr9[i31];
                    int i33 = i6;
                    oa1 oa1Var2 = oa1Var;
                    while (i33 < c1421bgOooO00o2.f17492OooO00o) {
                        if (ii0.OooOOo(iArr10[i33], qa1Var.f23562OooOOo0)) {
                            ya1VarArr2 = ya1VarArr3;
                            oa1 oa1Var3 = new oa1(c1421bgOooO00o2.f17495OooO0Oo[i33], iArr10[i33]);
                            if (oa1Var2 != null) {
                                c1421bg = c1421bg2;
                                if (km0.f20621OooO00o.OooO0Oo(oa1Var3.f22949OooOo0o, oa1Var2.f22949OooOo0o).OooO0Oo(oa1Var3.f22948OooOo0O, oa1Var2.f22948OooOo0O).OooO00o() > 0) {
                                }
                                i33++;
                                ya1VarArr3 = ya1VarArr2;
                            }
                            oa1Var2 = oa1Var3;
                            c1421bg2 = c1421bgOooO00o2;
                            i32 = i33;
                            i33++;
                            ya1VarArr3 = ya1VarArr2;
                        } else {
                            ya1VarArr2 = ya1VarArr3;
                            c1421bg = c1421bg2;
                        }
                        c1421bg2 = c1421bg;
                        i33++;
                        ya1VarArr3 = ya1VarArr2;
                    }
                    i31++;
                    oa1Var = oa1Var2;
                }
                ya1VarArr = ya1VarArr3;
                ya1VarArr[i29] = c1421bg2 == null ? null : new ya1(c1421bg2, new int[]{i32});
            }
            i29++;
            i25 = i6;
            ya1VarArr3 = ya1VarArr;
            i24 = 2;
            i = 1;
            i27 = 4;
            i28 = 3;
        }
        ya1[] ya1VarArr4 = ya1VarArr3;
        int i34 = i25;
        HashMap map = new HashMap();
        while (i25 < 2) {
            ha1 ha1Var5 = ((ha1[]) o0ooo0o.f13516OooOo)[i25];
            for (int i35 = i34; i35 < ha1Var5.f19674OooO00o; i35++) {
                if (qa1Var.f19370OooOO0.get(ha1Var5.OooO00o(i35)) != null) {
                    throw new ClassCastException();
                }
            }
            i25++;
        }
        ha1 ha1Var6 = (ha1) o0ooo0o.f13521OooOoOO;
        for (int i36 = i34; i36 < ha1Var6.f19674OooO00o; i36++) {
            if (qa1Var.f19370OooOO0.get(ha1Var6.OooO00o(i36)) != null) {
                throw new ClassCastException();
            }
        }
        int i37 = i34;
        while (true) {
            int i38 = 2;
            if (i37 >= 2) {
                int i39 = i34;
                while (i39 < i38) {
                    ha1 ha1Var7 = ((ha1[]) o0ooo0o.f13516OooOo)[i39];
                    Map map2 = (Map) qa1Var.f23563OooOOoo.get(i39);
                    if (map2 != null && map2.containsKey(ha1Var7)) {
                        Map map3 = (Map) qa1Var.f23563OooOOoo.get(i39);
                        if (map3 != null && map3.get(ha1Var7) != null) {
                            throw new ClassCastException();
                        }
                        ya1VarArr4[i39] = null;
                    }
                    i39++;
                    i38 = 2;
                }
                int i40 = i34;
                while (i40 < i38) {
                    int i41 = ((int[]) o0ooo0o.f13518OooOo0o)[i40];
                    if (qa1Var.f23564OooOo00.get(i40) || qa1Var.f19371OooOO0O.contains(Integer.valueOf(i41))) {
                        ya1VarArr4[i40] = null;
                    }
                    i40++;
                    i38 = 2;
                }
                g61 g61Var = xa1Var.f25585OooO;
                af0.OooOo0O(xa1Var.f25587OooO0O0);
                ArrayList arrayList = new ArrayList();
                int i42 = 0;
                int i43 = 0;
                while (true) {
                    i2 = 1;
                    if (i43 >= 2) {
                        break;
                    }
                    ya1 ya1Var2 = ya1VarArr4[i43];
                    if (ya1Var2 == null || ya1Var2.f25887OooO0O0.length <= 1) {
                        arrayList.add(null);
                    } else {
                        om0 om0Var = new om0(4);
                        om0Var.OooO00o(new ia1(0L, 0L));
                        arrayList.add(om0Var);
                    }
                    i43++;
                }
                long[][] jArr = new long[2][];
                int i44 = 0;
                while (i44 < 2) {
                    ya1 ya1Var3 = ya1VarArr4[i44];
                    if (ya1Var3 == null) {
                        jArr[i44] = new long[i42];
                        i5 = i42;
                    } else {
                        i5 = i42;
                        int[] iArr11 = ya1Var3.f25887OooO0O0;
                        jArr[i44] = new long[iArr11.length];
                        for (int i45 = i5; i45 < iArr11.length; i45++) {
                            long j = ya1Var3.f25886OooO00o.f17495OooO0Oo[iArr11[i45]].f22210OooO;
                            long[] jArr2 = jArr[i44];
                            if (j == -1) {
                                j = 0;
                            }
                            jArr2[i45] = j;
                        }
                        Arrays.sort(jArr[i44]);
                    }
                    i44++;
                    i42 = i5;
                }
                int i46 = i42;
                int[] iArr12 = new int[2];
                long[] jArr3 = new long[2];
                for (int i47 = i46; i47 < 2; i47++) {
                    long[] jArr4 = jArr[i47];
                    jArr3[i47] = jArr4.length == 0 ? 0L : jArr4[i46];
                }
                ja1.OooO0OO(arrayList, jArr3);
                dn0 dn0Var = new dn0(new TreeMap(en0.f18631OooOo0o), new ll0());
                int i48 = i46;
                for (i3 = 2; i48 < i3; i3 = 2) {
                    int length2 = jArr[i48].length;
                    if (length2 <= i2) {
                        i4 = i2;
                    } else {
                        double[] dArr = new double[length2];
                        i4 = i2;
                        int i49 = i46;
                        while (true) {
                            long[] jArr5 = jArr[i48];
                            double dLog = 0.0d;
                            if (i49 >= jArr5.length) {
                                break;
                            }
                            int i50 = length2;
                            long j2 = jArr5[i49];
                            if (j2 != -1) {
                                dLog = Math.log(j2);
                            }
                            dArr[i49] = dLog;
                            i49++;
                            length2 = i50;
                        }
                        int i51 = length2 - 1;
                        double d = dArr[i51] - dArr[i46];
                        int i52 = i46;
                        while (i52 < i51) {
                            double d2 = dArr[i52];
                            i52++;
                            Double dValueOf = Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i52]) * 0.5d) - dArr[i46]) / d);
                            Integer numValueOf = Integer.valueOf(i48);
                            Map map4 = dn0Var.f18275OooOoO0;
                            g61 g61Var2 = g61Var;
                            Collection collection = (Collection) map4.get(dValueOf);
                            if (collection == null) {
                                List list = (List) dn0Var.f18276OooOoOO.mo13704zza();
                                if (!list.add(numValueOf)) {
                                    throw new AssertionError("New Collection violated the Collection spec");
                                }
                                dn0Var.f18274OooOoO++;
                                map4.put(dValueOf, list);
                            } else if (collection.add(numValueOf)) {
                                dn0Var.f18274OooOoO++;
                            }
                            g61Var = g61Var2;
                        }
                    }
                    i48++;
                    i2 = i4;
                    g61Var = g61Var;
                }
                g61 g61Var3 = g61Var;
                am0 am0Var = dn0Var.f17523OooOo0o;
                if (am0Var == null) {
                    am0Var = new am0(dn0Var, 0);
                    dn0Var.f17523OooOo0o = am0Var;
                }
                rm0 rm0VarOooOOOO = rm0.OooOOOO(am0Var);
                for (int i53 = i46; i53 < rm0VarOooOOOO.size(); i53++) {
                    int iIntValue = ((Integer) rm0VarOooOOOO.get(i53)).intValue();
                    int i54 = iArr12[iIntValue] + 1;
                    iArr12[iIntValue] = i54;
                    jArr3[iIntValue] = jArr[iIntValue][i54];
                    ja1.OooO0OO(arrayList, jArr3);
                }
                for (int i55 = i46; i55 < 2; i55++) {
                    if (arrayList.get(i55) != null) {
                        long j3 = jArr3[i55];
                        jArr3[i55] = j3 + j3;
                    }
                }
                ja1.OooO0OO(arrayList, jArr3);
                xh0.OooOOoo(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i56 = i46;
                int i57 = i56;
                while (i56 < arrayList.size()) {
                    om0 om0Var2 = (om0) arrayList.get(i56);
                    gn0 gn0VarOooO0oo = om0Var2 == null ? gn0.f19388OooOoO : om0Var2.OooO0oo();
                    gn0VarOooO0oo.getClass();
                    int length3 = objArrCopyOf.length;
                    int i58 = i57 + 1;
                    int iOooO0o = lm0.OooO0o(length3, i58);
                    if (iOooO0o > length3) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iOooO0o);
                    }
                    objArrCopyOf[i57] = gn0VarOooO0oo;
                    i56++;
                    i57 = i58;
                }
                gn0 gn0VarOooOOO = rm0.OooOOO(i57, objArrCopyOf);
                int i59 = 2;
                za1[] za1VarArr2 = new za1[2];
                int i60 = i34;
                while (i60 < i59) {
                    ya1 ya1Var4 = ya1VarArr4[i60];
                    if (ya1Var4 != null && (length = (iArr2 = ya1Var4.f25887OooO0O0).length) != 0) {
                        if (length == 1) {
                            ja1Var = new ja1(ya1Var4.f25886OooO00o, new int[]{iArr2[i34]});
                        } else {
                            C1421bg c1421bg3 = ya1Var4.f25886OooO00o;
                            rm0 rm0Var = (rm0) gn0VarOooOOO.get(i60);
                            g61Var3.getClass();
                            ja1 ja1Var2 = new ja1(c1421bg3, iArr2);
                            rm0.OooOOOO(rm0Var);
                            ja1Var = ja1Var2;
                        }
                        za1VarArr2[i60] = ja1Var;
                    }
                    i60++;
                    i59 = 2;
                }
                y51[] y51VarArr = new y51[i59];
                for (int i61 = i34; i61 < i59; i61++) {
                    y51VarArr[i61] = (qa1Var.f23564OooOo00.get(i61) || qa1Var.f19371OooOO0O.contains(Integer.valueOf(((int[]) o0ooo0o.f13518OooOo0o)[i61])) || (((int[]) o0ooo0o.f13518OooOo0o)[i61] != -2 && za1VarArr2[i61] == null)) ? null : y51.f25851OooO00o;
                }
                Pair pairCreate = Pair.create(y51VarArr, za1VarArr2);
                za1[] za1VarArr3 = (za1[]) pairCreate.second;
                List[] listArr = new List[za1VarArr3.length];
                for (int i62 = 0; i62 < za1VarArr3.length; i62++) {
                    za1 za1Var = za1VarArr3[i62];
                    listArr[i62] = za1Var != null ? rm0.OooOOo0(za1Var) : gn0.f19388OooOoO;
                }
                om0 om0Var3 = new om0(4);
                for (int i63 = 0; i63 < 2; i63++) {
                    ha1[] ha1VarArr2 = (ha1[]) o0ooo0o.f13516OooOo;
                    ha1 ha1Var8 = ha1VarArr2[i63];
                    List list2 = listArr[i63];
                    int i64 = 0;
                    while (i64 < ha1Var8.f19674OooO00o) {
                        C1421bg c1421bgOooO00o3 = ha1Var8.OooO00o(i64);
                        int i65 = ha1VarArr2[i63].OooO00o(i64).f17492OooO00o;
                        int[] iArr13 = new int[i65];
                        int i66 = 0;
                        int i67 = 0;
                        while (true) {
                            iArr = (int[][][]) o0ooo0o.f13519OooOoO;
                            if (i67 >= i65) {
                                break;
                            }
                            List[] listArr2 = listArr;
                            if ((iArr[i63][i64][i67] & 7) == 4) {
                                iArr13[i66] = i67;
                                i66++;
                            }
                            i67++;
                            listArr = listArr2;
                        }
                        List[] listArr3 = listArr;
                        int[] iArrCopyOf = Arrays.copyOf(iArr13, i66);
                        String str2 = null;
                        int iMin = 16;
                        int i68 = 0;
                        boolean z6 = false;
                        int i69 = 0;
                        while (i68 < iArrCopyOf.length) {
                            String str3 = ha1VarArr2[i63].OooO00o(i64).f17495OooO0Oo[iArrCopyOf[i68]].f22222OooOOO0;
                            int i70 = i69 + 1;
                            if (i69 == 0) {
                                str2 = str3;
                            } else {
                                z6 |= !Objects.equals(str2, str3);
                            }
                            iMin = Math.min(iMin, iArr[i63][i64][i68] & 24);
                            i68++;
                            i69 = i70;
                        }
                        if (z6) {
                            iMin = Math.min(iMin, ((int[]) o0ooo0o.f13520OooOoO0)[i63]);
                        }
                        boolean z7 = iMin != 0;
                        int i71 = c1421bgOooO00o3.f17492OooO00o;
                        int[] iArr14 = new int[i71];
                        boolean[] zArr = new boolean[i71];
                        int i72 = 0;
                        while (i72 < i71) {
                            iArr14[i72] = iArr[i63][i64][i72] & 7;
                            int[][][] iArr15 = iArr;
                            int i73 = i71;
                            int i74 = 0;
                            while (true) {
                                if (i74 >= list2.size()) {
                                    z3 = false;
                                    break;
                                }
                                za1 za1Var2 = (za1) list2.get(i74);
                                int i75 = i74;
                                if (za1Var2.zzg().equals(c1421bgOooO00o3) && za1Var2.OooO0O0(i72) != -1) {
                                    z3 = true;
                                    break;
                                }
                                i74 = i75 + 1;
                            }
                            zArr[i72] = z3;
                            i72++;
                            iArr = iArr15;
                            i71 = i73;
                        }
                        om0Var3.OooO00o(new C1461ck(c1421bgOooO00o3, z7, iArr14, zArr));
                        i64++;
                        listArr = listArr3;
                    }
                }
                int i76 = 0;
                while (true) {
                    ha1 ha1Var9 = (ha1) o0ooo0o.f13521OooOoOO;
                    if (i76 >= ha1Var9.f19674OooO00o) {
                        break;
                    }
                    C1421bg c1421bgOooO00o4 = ha1Var9.OooO00o(i76);
                    int i77 = c1421bgOooO00o4.f17492OooO00o;
                    int[] iArr16 = new int[i77];
                    Arrays.fill(iArr16, 0);
                    om0Var3.OooO00o(new C1461ck(c1421bgOooO00o4, false, iArr16, new boolean[i77]));
                    i76++;
                }
                ab1 ab1Var = new ab1((y51[]) pairCreate.first, (za1[]) pairCreate.second, new C1977qk(om0Var3.OooO0oo()), o0ooo0o);
                int i78 = 0;
                while (true) {
                    int i79 = ab1Var.f17021OooOo0O;
                    za1VarArr = (za1[]) ab1Var.f17020OooOo;
                    if (i78 >= i79) {
                        break;
                    }
                    if (ab1Var.OooO0Oo(i78)) {
                        if (za1VarArr[i78] == null) {
                            f81VarArr[i78].getClass();
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        af0.OooooO0(z2);
                    } else {
                        af0.OooooO0(za1VarArr[i78] == null);
                    }
                    i78++;
                }
                for (za1 za1Var3 : za1VarArr) {
                }
                return ab1Var;
            }
            if (map.get(Integer.valueOf(((int[]) o0ooo0o.f13518OooOo0o)[i37])) != null) {
                throw new ClassCastException();
            }
            i37++;
        }
    }

    public final ab1 OooO0o0() {
        return this.f19570OooOOOO;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    public final void OooO0oO(AbstractC1787lf abstractC1787lf) {
        this.f19563OooO0o0 = true;
        this.f19568OooOOO = this.f19558OooO00o.zzh();
        ab1 ab1VarOooO0o = OooO0o(abstractC1787lf);
        i51 i51Var = this.f19564OooO0oO;
        long j = i51Var.f19959OooO0o0;
        long jMax = i51Var.f19955OooO0O0;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jOooO00o = OooO00o(ab1VarOooO0o, jMax, false, new boolean[2]);
        long j2 = this.f19571OooOOOo;
        i51 i51Var2 = this.f19564OooO0oO;
        long j3 = i51Var2.f19955OooO0O0;
        this.f19571OooOOOo = (j3 - jOooO00o) + j2;
        if (jOooO00o != j3) {
            i51Var2 = new i51(i51Var2.f19954OooO00o, jOooO00o, i51Var2.f19956OooO0OO, i51Var2.f19957OooO0Oo, i51Var2.f19959OooO0o0, i51Var2.f19958OooO0o, i51Var2.f19960OooO0oO, i51Var2.f19961OooO0oo);
        }
        this.f19564OooO0oO = i51Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.g91, java.lang.Object] */
    public final void OooO0oo() {
        OooOO0O();
        ?? r0 = this.f19558OooO00o;
        try {
            boolean z = r0 instanceof p81;
            g80 g80Var = this.OooOO0o;
            if (z) {
                g80Var.OooO0Oo(((p81) r0).f23244OooOo0O);
            } else {
                g80Var.OooO0Oo(r0);
            }
        } catch (RuntimeException e) {
            AbstractC1641hg.OooOOO0("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final boolean OooOO0() {
        if (this.f19563OooO0o0) {
            return OooO() || OooO0O0() - this.f19564OooO0oO.f19955OooO0O0 >= -9223372036854775807L;
        }
        return false;
    }

    public final void OooOO0O() {
        if (this.f19569OooOOO0 != null) {
            return;
        }
        int i = 0;
        while (true) {
            ab1 ab1Var = this.f19570OooOOOO;
            if (i >= ab1Var.f17021OooOo0O) {
                return;
            }
            ab1Var.OooO0Oo(i);
            za1 za1Var = ((za1[]) this.f19570OooOOOO.f17020OooOo)[i];
            i++;
        }
    }
}
