package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class um0 extends mm0 implements Set {

    /* renamed from: OooOo */
    public static final /* synthetic */ int f24660OooOo = 0;

    /* renamed from: OooOo0o */
    public transient rm0 f24661OooOo0o;

    public static int OooOOO0(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            ii0.OoooOoo("collection too large", iMax < 1073741824);
            return BasicMeasure.EXACTLY;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static tm0 OooOOOO(int i) {
        tm0 tm0Var = new tm0(i);
        tm0Var.f24348OooO0o0 = new Object[OooOOO0(i)];
        return tm0Var;
    }

    public static um0 OooOOOo(int i, Object... objArr) {
        if (i == 0) {
            return nn0.f21519OooOooo;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new tn0(obj);
        }
        int iOooOOO0 = OooOOO0(i);
        Object[] objArr2 = new Object[iOooOOO0];
        int i2 = iOooOOO0 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iOooO00o = ii0.OooO00o(iHashCode);
            while (true) {
                int i6 = iOooO00o & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iOooO00o++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new tn0(obj4);
        }
        if (OooOOO0(i4) < iOooOOO0 / 2) {
            return OooOOOo(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new nn0(i3, i2, i4, objArr, objArr2);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public rm0 OooO() {
        rm0 rm0Var = this.f24661OooOo0o;
        if (rm0Var != null) {
            return rm0Var;
        }
        rm0 rm0VarOooOOO = OooOOO();
        this.f24661OooOo0o = rm0VarOooOOO;
        return rm0VarOooOOO;
    }

    public rm0 OooOOO() {
        Object[] array = toArray(mm0.f21301OooOo0O);
        pm0 pm0Var = rm0.f23913OooOo0o;
        return rm0.OooOOO(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof um0) && (this instanceof nn0)) {
            um0 um0Var = (um0) obj;
            um0Var.getClass();
            if ((um0Var instanceof nn0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return xh0.OoooOOo(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return xh0.OooO0o(this);
    }
}
