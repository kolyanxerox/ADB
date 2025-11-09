package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class o00000OO extends o0Oo0oo implements Set {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public transient o000000 f26979OooOo0o;

    public static int OooOO0o(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return BasicMeasure.EXACTLY;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static o00000OO OooOOO(int i, Object... objArr) {
        if (i == 0) {
            return o000O00O.f27011OooOooO;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new o000O0Oo(obj);
        }
        int iOooOO0o = OooOO0o(i);
        Object[] objArr2 = new Object[iOooOO0o];
        int i2 = iOooOO0o - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iOooO0O0 = o0O000Oo.OooO0O0(iHashCode);
            while (true) {
                int i6 = iOooO0O0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iOooO0O0++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o000O0Oo(obj4);
        }
        if (OooOO0o(i4) < iOooOO0o / 2) {
            return OooOOO(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new o000O00O(i3, i2, i4, objArr, objArr2);
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public o000000 OooO() {
        o000000 o000000Var = this.f26979OooOo0o;
        if (o000000Var != null) {
            return o000000Var;
        }
        o000000 o000000VarOooOOO0 = OooOOO0();
        this.f26979OooOo0o = o000000VarOooOOO0;
        return o000000VarOooOOO0;
    }

    public o000000 OooOOO0() {
        Object[] array = toArray(o0Oo0oo.f27153OooOo0O);
        oo0o0Oo oo0o0oo = o000000.f26972OooOo0o;
        return o000000.OooOOO(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof o00000OO) && (this instanceof o000O00O)) {
            o00000OO o00000oo2 = (o00000OO) obj;
            o00000oo2.getClass();
            if ((o00000oo2 instanceof o000O00O) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
