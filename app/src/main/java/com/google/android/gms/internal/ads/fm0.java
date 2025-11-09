package com.google.android.gms.internal.ads;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class fm0 extends AbstractMap implements Serializable {

    /* renamed from: OooOooo */
    public static final Object f18971OooOooo = new Object();

    /* renamed from: OooOo */
    public transient Object[] f18972OooOo;

    /* renamed from: OooOo0O */
    public transient Object f18973OooOo0O;

    /* renamed from: OooOo0o */
    public transient int[] f18974OooOo0o;

    /* renamed from: OooOoO */
    public transient int f18975OooOoO = ii0.Oooo0(8, 1);

    /* renamed from: OooOoO0 */
    public transient Object[] f18976OooOoO0;

    /* renamed from: OooOoOO */
    public transient int f18977OooOoOO;

    /* renamed from: OooOoo */
    public transient dm0 f18978OooOoo;

    /* renamed from: OooOoo0 */
    public transient dm0 f18979OooOoo0;

    /* renamed from: OooOooO */
    public transient am0 f18980OooOooO;

    public final int OooO() {
        return (1 << (this.f18975OooOoO & 31)) - 1;
    }

    public final int[] OooO00o() {
        int[] iArr = this.f18974OooOo0o;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] OooO0O0() {
        Object[] objArr = this.f18972OooOo;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] OooO0OO() {
        Object[] objArr = this.f18976OooOoO0;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Map OooO0o() {
        Object obj = this.f18973OooOo0O;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void OooO0oO(int i, int i2) {
        Object obj = this.f18973OooOo0O;
        Objects.requireNonNull(obj);
        int[] iArrOooO00o = OooO00o();
        Object[] objArrOooO0O0 = OooO0O0();
        Object[] objArrOooO0OO = OooO0OO();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrOooO0O0[i] = null;
            objArrOooO0OO[i] = null;
            iArrOooO00o[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrOooO0O0[i3];
        objArrOooO0O0[i] = obj2;
        objArrOooO0OO[i] = objArrOooO0OO[i3];
        objArrOooO0O0[i3] = null;
        objArrOooO0OO[i3] = null;
        iArrOooO00o[i] = iArrOooO00o[i3];
        iArrOooO00o[i3] = 0;
        int iOooOo = ii0.OooOo(obj2) & i2;
        int iOooo0O0 = ii0.Oooo0O0(iOooOo, obj);
        if (iOooo0O0 == size) {
            ii0.OoooOOo(iOooOo, i4, obj);
            return;
        }
        while (true) {
            int i5 = iOooo0O0 - 1;
            int i6 = iArrOooO00o[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrOooO00o[i5] = (i6 & (~i2)) | (i2 & i4);
                return;
            }
            iOooo0O0 = i7;
        }
    }

    public final boolean OooO0oo() {
        return this.f18973OooOo0O == null;
    }

    public final int OooOO0(Object obj) {
        if (OooO0oo()) {
            return -1;
        }
        int iOooOo = ii0.OooOo(obj);
        int iOooO = OooO();
        Object obj2 = this.f18973OooOo0O;
        Objects.requireNonNull(obj2);
        int iOooo0O0 = ii0.Oooo0O0(iOooOo & iOooO, obj2);
        if (iOooo0O0 != 0) {
            int i = ~iOooO;
            int i2 = iOooOo & i;
            do {
                int i3 = iOooo0O0 - 1;
                int i4 = OooO00o()[i3];
                if ((i4 & i) == i2 && ii0.OooOOoo(obj, OooO0O0()[i3])) {
                    return i3;
                }
                iOooo0O0 = i4 & iOooO;
            } while (iOooo0O0 != 0);
        }
        return -1;
    }

    public final int OooOO0O(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objOoooO0O = ii0.OoooO0O(i2);
        if (i4 != 0) {
            ii0.OoooOOo(i3 & i5, i4 + 1, objOoooO0O);
        }
        Object obj = this.f18973OooOo0O;
        Objects.requireNonNull(obj);
        int[] iArrOooO00o = OooO00o();
        for (int i6 = 0; i6 <= i; i6++) {
            int iOooo0O0 = ii0.Oooo0O0(i6, obj);
            while (iOooo0O0 != 0) {
                int i7 = iOooo0O0 - 1;
                int i8 = iArrOooO00o[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iOooo0O02 = ii0.Oooo0O0(i10, objOoooO0O);
                ii0.OoooOOo(i10, iOooo0O0, objOoooO0O);
                iArrOooO00o[i7] = ((~i5) & i9) | (iOooo0O02 & i5);
                iOooo0O0 = i8 & i;
            }
        }
        this.f18973OooOo0O = objOoooO0O;
        this.f18975OooOoO = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.f18975OooOoO & (-32));
        return i5;
    }

    public final Object OooOO0o(Object obj) {
        if (!OooO0oo()) {
            int iOooO = OooO();
            Object obj2 = this.f18973OooOo0O;
            Objects.requireNonNull(obj2);
            int iOooOoO0 = ii0.OooOoO0(obj, null, iOooO, obj2, OooO00o(), OooO0O0(), null);
            if (iOooOoO0 != -1) {
                Object obj3 = OooO0OO()[iOooOoO0];
                OooO0oO(iOooOoO0, iOooO);
                this.f18977OooOoOO--;
                this.f18975OooOoO += 32;
                return obj3;
            }
        }
        return f18971OooOooo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (OooO0oo()) {
            return;
        }
        this.f18975OooOoO += 32;
        Map mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            this.f18975OooOoO = ii0.Oooo0(size(), 3);
            mapOooO0o.clear();
            this.f18973OooOo0O = null;
            this.f18977OooOoOO = 0;
            return;
        }
        Arrays.fill(OooO0O0(), 0, this.f18977OooOoOO, (Object) null);
        Arrays.fill(OooO0OO(), 0, this.f18977OooOoOO, (Object) null);
        Object obj = this.f18973OooOo0O;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(OooO00o(), 0, this.f18977OooOoOO, 0);
        this.f18977OooOoOO = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapOooO0o = OooO0o();
        return mapOooO0o != null ? mapOooO0o.containsKey(obj) : OooOO0(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.containsValue(obj);
        }
        for (int i = 0; i < this.f18977OooOoOO; i++) {
            if (ii0.OooOOoo(obj, OooO0OO()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        dm0 dm0Var = this.f18978OooOoo;
        if (dm0Var != null) {
            return dm0Var;
        }
        dm0 dm0Var2 = new dm0(this, 0);
        this.f18978OooOoo = dm0Var2;
        return dm0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.get(obj);
        }
        int iOooOO0 = OooOO0(obj);
        if (iOooOO0 == -1) {
            return null;
        }
        return OooO0OO()[iOooOO0];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        dm0 dm0Var = this.f18979OooOoo0;
        if (dm0Var != null) {
            return dm0Var;
        }
        dm0 dm0Var2 = new dm0(this, 1);
        this.f18979OooOoo0 = dm0Var2;
        return dm0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (OooO0oo()) {
            ii0.o0OoOo0("Arrays already allocated", OooO0oo());
            int i3 = this.f18975OooOoO;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = BasicMeasure.EXACTLY;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f18973OooOo0O = ii0.OoooO0O(iMax2);
            this.f18975OooOoO = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f18975OooOoO & (-32));
            this.f18974OooOo0o = new int[i3];
            this.f18972OooOo = new Object[i3];
            this.f18976OooOoO0 = new Object[i3];
        }
        Map mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.put(obj, obj2);
        }
        int[] iArrOooO00o = OooO00o();
        Object[] objArrOooO0O0 = OooO0O0();
        Object[] objArrOooO0OO = OooO0OO();
        int i4 = this.f18977OooOoOO;
        int i5 = i4 + 1;
        int iOooOo = ii0.OooOo(obj);
        int iOooO = OooO();
        int i6 = iOooOo & iOooO;
        Object obj3 = this.f18973OooOo0O;
        Objects.requireNonNull(obj3);
        int iOooo0O0 = ii0.Oooo0O0(i6, obj3);
        if (iOooo0O0 == 0) {
            if (i5 > iOooO) {
                iOooO = OooOO0O(iOooO, (iOooO + 1) * (iOooO < 32 ? 4 : 2), iOooOo, i4);
            } else {
                Object obj4 = this.f18973OooOo0O;
                Objects.requireNonNull(obj4);
                ii0.OoooOOo(i6, i5, obj4);
            }
            i = 1;
        } else {
            int i7 = ~iOooO;
            int i8 = iOooOo & i7;
            int i9 = 0;
            while (true) {
                int i10 = iOooo0O0 - 1;
                int i11 = iArrOooO00o[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && ii0.OooOOoo(obj, objArrOooO0O0[i10])) {
                    Object obj5 = objArrOooO0OO[i10];
                    objArrOooO0OO[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & iOooO;
                int i15 = i9 + 1;
                if (i14 != 0) {
                    i9 = i15;
                    iOooo0O0 = i14;
                    i2 = i13;
                } else {
                    if (i15 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(OooO() + 1, 1.0f);
                        int i16 = isEmpty() ? -1 : 0;
                        while (i16 >= 0) {
                            linkedHashMap.put(OooO0O0()[i16], OooO0OO()[i16]);
                            int i17 = i16 + 1;
                            i16 = i17 < this.f18977OooOoOO ? i17 : -1;
                        }
                        this.f18973OooOo0O = linkedHashMap;
                        this.f18974OooOo0o = null;
                        this.f18972OooOo = null;
                        this.f18976OooOoO0 = null;
                        this.f18975OooOoO += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i5 > iOooO) {
                        iOooO = OooOO0O(iOooO, (iOooO + 1) * (iOooO < i13 ? 4 : 2), iOooOo, i4);
                    } else {
                        iArrOooO00o[i10] = i12 | (i5 & iOooO);
                    }
                }
            }
        }
        int length = OooO00o().length;
        if (i5 > length) {
            int i18 = i;
            int iMin = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (iMin != length) {
                this.f18974OooOo0o = Arrays.copyOf(OooO00o(), iMin);
                this.f18972OooOo = Arrays.copyOf(OooO0O0(), iMin);
                this.f18976OooOoO0 = Arrays.copyOf(OooO0OO(), iMin);
            }
        }
        OooO00o()[i4] = (~iOooO) & iOooOo;
        OooO0O0()[i4] = obj;
        OooO0OO()[i4] = obj2;
        this.f18977OooOoOO = i5;
        this.f18975OooOoO += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapOooO0o = OooO0o();
        if (mapOooO0o != null) {
            return mapOooO0o.remove(obj);
        }
        Object objOooOO0o = OooOO0o(obj);
        if (objOooOO0o == f18971OooOooo) {
            return null;
        }
        return objOooOO0o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapOooO0o = OooO0o();
        return mapOooO0o != null ? mapOooO0o.size() : this.f18977OooOoOO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        am0 am0Var = this.f18980OooOooO;
        if (am0Var != null) {
            return am0Var;
        }
        am0 am0Var2 = new am0(this, 1);
        this.f18980OooOooO = am0Var2;
        return am0Var2;
    }
}
