package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class x51 extends AbstractC1787lf {

    /* renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f25516OooOO0O = 0;

    /* renamed from: OooO, reason: collision with root package name */
    public final Object[] f25517OooO;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f25518OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final da1 f25519OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final int f25520OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final int[] f25521OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final int f25522OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f25523OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final AbstractC1787lf[] f25524OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final HashMap f25525OooOO0;

    public x51(AbstractC1787lf[] abstractC1787lfArr, Object[] objArr, da1 da1Var) {
        this.f25519OooO0OO = da1Var;
        this.f25518OooO0O0 = da1Var.f18222OooO0O0.length;
        this.f25524OooO0oo = abstractC1787lfArr;
        int length = abstractC1787lfArr.length;
        this.f25521OooO0o = new int[length];
        this.f25523OooO0oO = new int[length];
        this.f25517OooO = objArr;
        this.f25525OooOO0 = new HashMap();
        int i = 0;
        int iOooO0OO = 0;
        int iOooO0O0 = 0;
        int i2 = 0;
        while (i < abstractC1787lfArr.length) {
            AbstractC1787lf abstractC1787lf = abstractC1787lfArr[i];
            this.f25524OooO0oo[i2] = abstractC1787lf;
            this.f25523OooO0oO[i2] = iOooO0OO;
            this.f25521OooO0o[i2] = iOooO0O0;
            iOooO0OO += abstractC1787lf.OooO0OO();
            iOooO0O0 += this.f25524OooO0oo[i2].OooO0O0();
            this.f25525OooOO0.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f25520OooO0Oo = iOooO0OO;
        this.f25522OooO0o0 = iOooO0O0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooO00o(Object obj) {
        int iOooO00o;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f25525OooOO0.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iOooO00o = this.f25524OooO0oo[iIntValue].OooO00o(obj3)) != -1) {
                return this.f25521OooO0o[iIntValue] + iOooO00o;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooO0O0() {
        return this.f25522OooO0o0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooO0OO() {
        return this.f25520OooO0Oo;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final C1528ee OooO0Oo(int i, C1528ee c1528ee, boolean z) {
        int[] iArr = this.f25521OooO0o;
        int iOooO = i80.OooO(iArr, i + 1, false, false);
        int i2 = this.f25523OooO0oO[iOooO];
        this.f25524OooO0oo[iOooO].OooO0Oo(i - iArr[iOooO], c1528ee, z);
        c1528ee.f18576OooO0OO += i2;
        if (z) {
            Object obj = this.f25517OooO[iOooO];
            Object obj2 = c1528ee.f18575OooO0O0;
            obj2.getClass();
            c1528ee.f18575OooO0O0 = Pair.create(obj, obj2);
        }
        return c1528ee;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final Object OooO0o(int i) {
        int[] iArr = this.f25521OooO0o;
        int iOooO = i80.OooO(iArr, i + 1, false, false);
        return Pair.create(this.f25517OooO[iOooO], this.f25524OooO0oo[iOooO].OooO0o(i - iArr[iOooO]));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final C2045se OooO0o0(int i, C2045se c2045se, long j) {
        int[] iArr = this.f25523OooO0oO;
        int iOooO = i80.OooO(iArr, i + 1, false, false);
        int i2 = iArr[iOooO];
        int i3 = this.f25521OooO0o[iOooO];
        this.f25524OooO0oo[iOooO].OooO0o0(i - i2, c2045se, j);
        Object objCreate = this.f25517OooO[iOooO];
        if (!C2045se.f24068OooOOO0.equals(c2045se.f24070OooO00o)) {
            objCreate = Pair.create(objCreate, c2045se.f24070OooO00o);
        }
        c2045se.f24070OooO00o = objCreate;
        c2045se.f24079OooOO0O += i3;
        c2045se.OooOO0o += i3;
        return c2045se;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooO0oO(boolean z) {
        if (this.f25518OooO0O0 != 0) {
            int iOooOOOo = 0;
            if (z) {
                int[] iArr = this.f25519OooO0OO.f18222OooO0O0;
                iOooOOOo = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC1787lf[] abstractC1787lfArr = this.f25524OooO0oo;
                if (!abstractC1787lfArr[iOooOOOo].OooOOOO()) {
                    return abstractC1787lfArr[iOooOOOo].OooO0oO(z) + this.f25523OooO0oO[iOooOOOo];
                }
                iOooOOOo = OooOOOo(iOooOOOo, z);
            } while (iOooOOOo != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooO0oo(boolean z) {
        int iOooOOo0;
        int i = this.f25518OooO0O0;
        if (i != 0) {
            if (z) {
                int[] iArr = this.f25519OooO0OO.f18222OooO0O0;
                int length = iArr.length;
                iOooOOo0 = length > 0 ? iArr[length - 1] : -1;
            } else {
                iOooOOo0 = i - 1;
            }
            do {
                AbstractC1787lf[] abstractC1787lfArr = this.f25524OooO0oo;
                if (!abstractC1787lfArr[iOooOOo0].OooOOOO()) {
                    return abstractC1787lfArr[iOooOOo0].OooO0oo(z) + this.f25523OooO0oO[iOooOOo0];
                }
                iOooOOo0 = OooOOo0(iOooOOo0, z);
            } while (iOooOOo0 != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooOO0(int i, int i2, boolean z) {
        int[] iArr = this.f25523OooO0oO;
        int iOooO = i80.OooO(iArr, i + 1, false, false);
        int i3 = iArr[iOooO];
        AbstractC1787lf[] abstractC1787lfArr = this.f25524OooO0oo;
        int iOooOO0 = abstractC1787lfArr[iOooO].OooOO0(i - i3, i2 != 2 ? i2 : 0, z);
        if (iOooOO0 != -1) {
            return i3 + iOooOO0;
        }
        int iOooOOOo = OooOOOo(iOooO, z);
        while (iOooOOOo != -1 && abstractC1787lfArr[iOooOOOo].OooOOOO()) {
            iOooOOOo = OooOOOo(iOooOOOo, z);
        }
        if (iOooOOOo != -1) {
            return abstractC1787lfArr[iOooOOOo].OooO0oO(z) + iArr[iOooOOOo];
        }
        if (i2 == 2) {
            return OooO0oO(z);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final int OooOO0O(int i) {
        int[] iArr = this.f25523OooO0oO;
        int iOooO = i80.OooO(iArr, i + 1, false, false);
        int i2 = iArr[iOooO];
        AbstractC1787lf[] abstractC1787lfArr = this.f25524OooO0oo;
        int iOooOO0O = abstractC1787lfArr[iOooO].OooOO0O(i - i2);
        if (iOooOO0O != -1) {
            return i2 + iOooOO0O;
        }
        int iOooOOo0 = OooOOo0(iOooO, false);
        while (iOooOOo0 != -1 && abstractC1787lfArr[iOooOOo0].OooOOOO()) {
            iOooOOo0 = OooOOo0(iOooOOo0, false);
        }
        if (iOooOOo0 == -1) {
            return -1;
        }
        return abstractC1787lfArr[iOooOOo0].OooO0oo(false) + iArr[iOooOOo0];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1787lf
    public final C1528ee OooOOO(Object obj, C1528ee c1528ee) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f25525OooOO0.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.f25523OooO0oO[iIntValue];
        this.f25524OooO0oo[iIntValue].OooOOO(obj3, c1528ee);
        c1528ee.f18576OooO0OO += i;
        c1528ee.f18575OooO0O0 = obj;
        return c1528ee;
    }

    public final int OooOOOo(int i, boolean z) {
        if (!z) {
            if (i >= this.f25518OooO0O0 - 1) {
                return -1;
            }
            return i + 1;
        }
        da1 da1Var = this.f25519OooO0OO;
        int i2 = da1Var.f18223OooO0OO[i] + 1;
        int[] iArr = da1Var.f18222OooO0O0;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int OooOOo0(int i, boolean z) {
        if (!z) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        da1 da1Var = this.f25519OooO0OO;
        int i2 = da1Var.f18223OooO0OO[i] - 1;
        if (i2 >= 0) {
            return da1Var.f18222OooO0O0[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x51(List list, da1 da1Var) {
        AbstractC1787lf[] abstractC1787lfArr = new AbstractC1787lf[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            abstractC1787lfArr[i2] = ((k51) it.next()).zza();
            i2++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((k51) it2.next()).zzb();
            i++;
        }
        this(abstractC1787lfArr, objArr, da1Var);
    }
}
