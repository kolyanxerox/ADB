package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ta1 extends va1 implements Comparable {

    /* renamed from: OooOoO */
    public final int f24282OooOoO;

    /* renamed from: OooOoOO */
    public final boolean f24283OooOoOO;

    /* renamed from: OooOoo */
    public final boolean f24284OooOoo;

    /* renamed from: OooOoo0 */
    public final boolean f24285OooOoo0;

    /* renamed from: OooOooO */
    public final int f24286OooOooO;

    /* renamed from: OooOooo */
    public final int f24287OooOooo;

    /* renamed from: Oooo000 */
    public final int f24288Oooo000;

    /* renamed from: Oooo00O */
    public final int f24289Oooo00O;

    /* renamed from: Oooo00o */
    public final boolean f24290Oooo00o;

    public ta1(int i, C1421bg c1421bg, int i2, qa1 qa1Var, int i3, String str) {
        int iOooO00o;
        super(i, c1421bg, i2);
        int i4 = 0;
        this.f24283OooOoOO = ii0.OooOOo(i3, false);
        int i5 = this.f24941OooOoO0.f22216OooO0o0;
        qa1Var.getClass();
        this.f24285OooOoo0 = 1 == (i5 & 1);
        this.f24284OooOoo = (i5 & 2) != 0;
        gn0 gn0Var = qa1Var.f19369OooO0oo;
        gn0 gn0VarOooOOo0 = gn0Var.isEmpty() ? rm0.OooOOo0("") : gn0Var;
        int i6 = 0;
        while (true) {
            if (i6 >= gn0VarOooOOo0.f19390OooOoO0) {
                iOooO00o = 0;
                i6 = Integer.MAX_VALUE;
                break;
            } else {
                iOooO00o = xa1.OooO00o(this.f24941OooOoO0, (String) gn0VarOooOOo0.get(i6), false);
                if (iOooO00o > 0) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        this.f24286OooOooO = i6;
        this.f24287OooOooo = iOooO00o;
        int i7 = this.f24941OooOoO0.f22215OooO0o;
        int i8 = qa1Var.f19361OooO;
        int iBitCount = (i7 == 0 || i7 != i8) ? Integer.bitCount(i7 & i8) : Integer.MAX_VALUE;
        this.f24288Oooo000 = iBitCount;
        this.f24290Oooo00o = (this.f24941OooOoO0.f22215OooO0o & 1088) != 0;
        int iOooO00o2 = xa1.OooO00o(this.f24941OooOoO0, str, xa1.OooO0O0(str) == null);
        this.f24289Oooo00O = iOooO00o2;
        boolean z = iOooO00o > 0 || (gn0Var.isEmpty() && iBitCount > 0) || this.f24285OooOoo0 || (this.f24284OooOoo && iOooO00o2 > 0);
        if (ii0.OooOOo(i3, qa1Var.f23562OooOOo0) && z) {
            i4 = 1;
        }
        this.f24282OooOoO = i4;
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final int OooO00o() {
        return this.f24282OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.va1
    public final /* bridge */ /* synthetic */ boolean OooO0O0(va1 va1Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: OooO0OO */
    public final int compareTo(ta1 ta1Var) {
        km0 km0VarOooO0Oo = km0.f20621OooO00o.OooO0Oo(this.f24283OooOoOO, ta1Var.f24283OooOoOO);
        Integer numValueOf = Integer.valueOf(this.f24286OooOooO);
        Integer numValueOf2 = Integer.valueOf(ta1Var.f24286OooOooO);
        en0 en0Var = en0.f18630OooOo;
        km0 km0VarOooO0OO = km0VarOooO0Oo.OooO0OO(numValueOf, numValueOf2, en0Var);
        int i = this.f24287OooOooo;
        km0 km0VarOooO0O0 = km0VarOooO0OO.OooO0O0(i, ta1Var.f24287OooOooo);
        int i2 = this.f24288Oooo000;
        km0 km0VarOooO0Oo2 = km0VarOooO0O0.OooO0O0(i2, ta1Var.f24288Oooo000).OooO0Oo(this.f24285OooOoo0, ta1Var.f24285OooOoo0);
        Boolean boolValueOf = Boolean.valueOf(this.f24284OooOoo);
        Boolean boolValueOf2 = Boolean.valueOf(ta1Var.f24284OooOoo);
        if (i == 0) {
            en0Var = en0.f18631OooOo0o;
        }
        km0 km0VarOooO0O02 = km0VarOooO0Oo2.OooO0OO(boolValueOf, boolValueOf2, en0Var).OooO0O0(this.f24289Oooo00O, ta1Var.f24289Oooo00O);
        if (i2 == 0) {
            km0VarOooO0O02 = km0VarOooO0O02.OooO0o0(this.f24290Oooo00o, ta1Var.f24290Oooo00o);
        }
        return km0VarOooO0O02.OooO00o();
    }
}
