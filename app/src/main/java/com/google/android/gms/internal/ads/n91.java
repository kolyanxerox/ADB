package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes2.dex */
public final class n91 implements g91, f91 {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final g91[] f21449OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final IdentityHashMap f21450OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public f91 f21451OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public ha1 f21453OooOoOO;

    /* renamed from: OooOoo, reason: collision with root package name */
    public v81 f21454OooOoo;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public g91[] f21455OooOoo0;

    /* renamed from: OooOo, reason: collision with root package name */
    public final ArrayList f21448OooOo = new ArrayList();

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final HashMap f21452OooOoO0 = new HashMap();

    public n91(long[] jArr, g91... g91VarArr) {
        this.f21449OooOo0O = g91VarArr;
        pm0 pm0Var = rm0.f23913OooOo0o;
        gn0 gn0Var = gn0.f19388OooOoO;
        this.f21454OooOoo = new v81(gn0Var, gn0Var);
        this.f21450OooOo0o = new IdentityHashMap();
        this.f21455OooOoo0 = new g91[0];
        for (int i = 0; i < g91VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f21449OooOo0O[i] = new ga1(g91VarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO00o(long j) {
        long jOooO00o = this.f21455OooOoo0[0].OooO00o(j);
        int i = 1;
        while (true) {
            g91[] g91VarArr = this.f21455OooOoo0;
            if (i >= g91VarArr.length) {
                return jOooO00o;
            }
            if (g91VarArr[i].OooO00o(jOooO00o) != jOooO00o) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO0O0(long j, a61 a61Var) {
        g91[] g91VarArr = this.f21455OooOoo0;
        return (g91VarArr.length > 0 ? g91VarArr[0] : this.f21449OooOo0O[0]).OooO0O0(j, a61Var);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final void OooO0OO(g91 g91Var) {
        g91[] g91VarArr;
        ArrayList arrayList = this.f21448OooOo;
        arrayList.remove(g91Var);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                g91VarArr = this.f21449OooOo0O;
                if (i >= g91VarArr.length) {
                    break;
                }
                i2 += g91VarArr[i].zzh().f19674OooO00o;
                i++;
            }
            C1421bg[] c1421bgArr = new C1421bg[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < g91VarArr.length; i4++) {
                ha1 ha1VarZzh = g91VarArr[i4].zzh();
                int i5 = ha1VarZzh.f19674OooO00o;
                int i6 = 0;
                while (i6 < i5) {
                    C1421bg c1421bgOooO00o = ha1VarZzh.OooO00o(i6);
                    int i7 = c1421bgOooO00o.f17492OooO00o;
                    o0OoOo0[] o0oooo0Arr = new o0OoOo0[i7];
                    for (int i8 = 0; i8 < i7; i8++) {
                        o0OoOo0 o0oooo0 = c1421bgOooO00o.f17495OooO0Oo[i8];
                        o0oooo0.getClass();
                        jb1 jb1Var = new jb1(o0oooo0);
                        String str = o0oooo0.f22211OooO00o;
                        if (str == null) {
                            str = "";
                        }
                        jb1Var.f20241OooO00o = i4 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str;
                        o0oooo0Arr[i8] = new o0OoOo0(jb1Var);
                    }
                    C1421bg c1421bg = new C1421bg(i4 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + c1421bgOooO00o.f17493OooO0O0, o0oooo0Arr);
                    this.f21452OooOoO0.put(c1421bg, c1421bgOooO00o);
                    c1421bgArr[i3] = c1421bg;
                    i6++;
                    i3++;
                }
            }
            this.f21453OooOoOO = new ha1(c1421bgArr);
            f91 f91Var = this.f21451OooOoO;
            f91Var.getClass();
            f91Var.OooO0OO(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void OooO0Oo(long j) {
        for (g91 g91Var : this.f21455OooOoo0) {
            g91Var.OooO0Oo(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long OooO0o(za1[] za1VarArr, boolean[] zArr, ba1[] ba1VarArr, boolean[] zArr2, long j) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = za1VarArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = za1VarArr.length;
            identityHashMap = this.f21450OooOo0o;
            if (i2 >= length) {
                break;
            }
            ba1 ba1Var = ba1VarArr[i2];
            Integer num = ba1Var == null ? null : (Integer) identityHashMap.get(ba1Var);
            iArr3[i2] = num == null ? -1 : num.intValue();
            za1 za1Var = za1VarArr[i2];
            if (za1Var != null) {
                String str = za1Var.zzg().f17493OooO0O0;
                iArr4[i2] = Integer.parseInt(str.substring(0, str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)));
            } else {
                iArr4[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        ba1[] ba1VarArr2 = new ba1[length];
        ba1[] ba1VarArr3 = new ba1[length];
        za1[] za1VarArr2 = new za1[length];
        g91[] g91VarArr = this.f21449OooOo0O;
        ArrayList arrayList = new ArrayList(g91VarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < g91VarArr.length) {
            int i4 = i;
            while (i4 < za1VarArr.length) {
                ba1VarArr3[i4] = iArr3[i4] == i3 ? ba1VarArr[i4] : null;
                if (iArr4[i4] == i3) {
                    za1 za1Var2 = za1VarArr[i4];
                    za1Var2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    C1421bg c1421bg = (C1421bg) this.f21452OooOoO0.get(za1Var2.zzg());
                    c1421bg.getClass();
                    za1VarArr2[i4] = new m91(za1Var2, c1421bg);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    za1VarArr2[i4] = null;
                }
                i4++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            g91[] g91VarArr2 = g91VarArr;
            int i5 = i3;
            long jOooO0o = g91VarArr[i3].OooO0o(za1VarArr2, zArr, ba1VarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jOooO0o;
            } else if (jOooO0o != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < za1VarArr.length; i6++) {
                if (iArr5[i6] == i5) {
                    ba1 ba1Var2 = ba1VarArr3[i6];
                    ba1Var2.getClass();
                    ba1VarArr2[i6] = ba1Var2;
                    identityHashMap.put(ba1Var2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr6[i6] == i5) {
                    af0.OooooO0(ba1VarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(g91VarArr2[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            g91VarArr = g91VarArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(ba1VarArr2, i7, ba1VarArr, i7, length);
        this.f21455OooOoo0 = (g91[]) arrayList3.toArray(new g91[i7]);
        this.f21454OooOoo = new v81(arrayList3, ii0.OooOoo0(arrayList3, new o0O0o00O(21)));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final void OooO0o0(long j) {
        this.f21454OooOoo.OooO0o0(j);
    }

    @Override // com.google.android.gms.internal.ads.f91
    public final /* bridge */ /* synthetic */ void OooO0oO(ca1 ca1Var) {
        f91 f91Var = this.f21451OooOoO;
        f91Var.getClass();
        f91Var.OooO0oO(this);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void OooO0oo(f91 f91Var, long j) {
        this.f21451OooOoO = f91Var;
        ArrayList arrayList = this.f21448OooOo;
        g91[] g91VarArr = this.f21449OooOo0O;
        Collections.addAll(arrayList, g91VarArr);
        for (g91 g91Var : g91VarArr) {
            g91Var.OooO0oo(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean OooOO0(f51 f51Var) {
        ArrayList arrayList = this.f21448OooOo;
        if (arrayList.isEmpty()) {
            return this.f21454OooOoo.OooOO0(f51Var);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((g91) arrayList.get(i)).OooOO0(f51Var);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzb() {
        return this.f21454OooOoo.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final long zzc() {
        return this.f21454OooOoo.zzc();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long zzd() {
        long j = -9223372036854775807L;
        for (g91 g91Var : this.f21455OooOoo0) {
            long jZzd = g91Var.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && g91Var.OooO00o(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (g91 g91Var2 : this.f21455OooOoo0) {
                    if (g91Var2 == g91Var) {
                        break;
                    }
                    if (g91Var2.OooO00o(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final ha1 zzh() {
        ha1 ha1Var = this.f21453OooOoOO;
        ha1Var.getClass();
        return ha1Var;
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void zzk() {
        int i = 0;
        while (true) {
            g91[] g91VarArr = this.f21449OooOo0O;
            if (i >= g91VarArr.length) {
                return;
            }
            g91VarArr[i].zzk();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final boolean zzp() {
        return this.f21454OooOoo.zzp();
    }
}
