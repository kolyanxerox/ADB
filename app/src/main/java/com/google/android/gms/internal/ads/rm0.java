package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class rm0 extends mm0 implements List, RandomAccess {

    /* renamed from: OooOo0o */
    public static final pm0 f23913OooOo0o = new pm0(gn0.f19388OooOoO, 0);

    public static gn0 OooOOO(int i, Object[] objArr) {
        return i == 0 ? gn0.f19388OooOoO : new gn0(i, objArr);
    }

    public static rm0 OooOOOO(Collection collection) {
        if (!(collection instanceof mm0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            ii0.OooOooo(length, array);
            return OooOOO(length, array);
        }
        rm0 rm0VarOooO = ((mm0) collection).OooO();
        if (!rm0VarOooO.OooOO0O()) {
            return rm0VarOooO;
        }
        Object[] array2 = rm0VarOooO.toArray(mm0.f21301OooOo0O);
        return OooOOO(array2.length, array2);
    }

    public static gn0 OooOOOo(Object[] objArr) {
        if (objArr.length == 0) {
            return gn0.f19388OooOoO;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        ii0.OooOooo(length, objArr2);
        return OooOOO(length, objArr2);
    }

    public static gn0 OooOOo(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ii0.OooOooo(2, objArr);
        return OooOOO(2, objArr);
    }

    public static gn0 OooOOo0(Object obj) {
        Object[] objArr = {obj};
        ii0.OooOooo(1, objArr);
        return OooOOO(1, objArr);
    }

    public static gn0 OooOOoo(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        ii0.OooOooo(5, objArr);
        return OooOOO(5, objArr);
    }

    public static gn0 OooOo00(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        ii0.OooOooo(i, objArr2);
        return OooOOO(i, objArr2);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final rm0 OooO() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public int OooO0o0(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final vn0 OooOO0() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: OooOOO0 */
    public rm0 subList(int i, int i2) {
        ii0.OoooooO(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? gn0.f19388OooOoO : new qm0(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: OooOo0 */
    public final pm0 listIterator(int i) {
        ii0.OooOooO(i, size());
        return isEmpty() ? f23913OooOo0o : new pm0(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.mm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (ii0.OooOOoo(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                pm0 pm0VarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (pm0VarListIterator.hasNext()) {
                        if (!it.hasNext() || !ii0.OooOOoo(pm0VarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
