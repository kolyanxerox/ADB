package o00O0O00;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;

/* loaded from: classes3.dex */
public final class OooO0OO extends o00O0.OooOO0 implements RandomAccess, Serializable {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO0OO f31329OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public boolean f31330OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Object[] f31331OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f31332OooOo0o;

    static {
        OooO0OO oooO0OO = new OooO0OO(0);
        oooO0OO.f31330OooOo = true;
        f31329OooOoO0 = oooO0OO;
    }

    public OooO0OO(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f31331OooOo0O = new Object[i];
    }

    @Override // o00O0.OooOO0
    public final int OooO0o() {
        return this.f31332OooOo0o;
    }

    @Override // o00O0.OooOO0
    public final Object OooO0oO(int i) {
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31332OooOo0o;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO00o(i, i2);
        return OooOOO(i);
    }

    public final void OooOO0(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        OooOOO0(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f31331OooOo0O[i + i3] = it.next();
        }
    }

    public final void OooOO0O(int i, Object obj) {
        ((AbstractList) this).modCount++;
        OooOOO0(i, 1);
        this.f31331OooOo0O[i] = obj;
    }

    public final void OooOO0o() {
        if (this.f31330OooOo) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object OooOOO(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f31331OooOo0O;
        Object obj = objArr[i];
        OooOOO.Oooo00o(i, i + 1, this.f31332OooOo0o, objArr, objArr);
        Object[] objArr2 = this.f31331OooOo0O;
        int i2 = this.f31332OooOo0o - 1;
        OooOo.OooO0o0(objArr2, "<this>");
        objArr2[i2] = null;
        this.f31332OooOo0o--;
        return obj;
    }

    public final void OooOOO0(int i, int i2) {
        int i3 = this.f31332OooOo0o + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f31331OooOo0O;
        if (i3 > objArr.length) {
            o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
            int length = objArr.length;
            oooO0O0.getClass();
            int iOooO0Oo = o00O0.OooO0O0.OooO0Oo(length, i3);
            Object[] objArr2 = this.f31331OooOo0O;
            OooOo.OooO0o0(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iOooO0Oo);
            OooOo.OooO0Oo(objArrCopyOf, "copyOf(...)");
            this.f31331OooOo0O = objArrCopyOf;
        }
        Object[] objArr3 = this.f31331OooOo0O;
        OooOOO.Oooo00o(i + i2, i, this.f31332OooOo0o, objArr3, objArr3);
        this.f31332OooOo0o += i2;
    }

    public final void OooOOOO(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f31331OooOo0O;
        OooOOO.Oooo00o(i, i + i2, this.f31332OooOo0o, objArr, objArr);
        Object[] objArr2 = this.f31331OooOo0O;
        int i3 = this.f31332OooOo0o;
        o00OoO00.OooOOO0.OooO0oo(objArr2, i3 - i2, i3);
        this.f31332OooOo0o -= i2;
    }

    public final int OooOOOo(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f31331OooOo0O[i5]) == z) {
                Object[] objArr = this.f31331OooOo0O;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f31331OooOo0O;
        OooOOO.Oooo00o(i + i4, i2 + i, this.f31332OooOo0o, objArr2, objArr2);
        Object[] objArr3 = this.f31331OooOo0O;
        int i7 = this.f31332OooOo0o;
        o00OoO00.OooOOO0.OooO0oo(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f31332OooOo0o -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooOO0o();
        int i = this.f31332OooOo0o;
        ((AbstractList) this).modCount++;
        OooOOO0(i, 1);
        this.f31331OooOo0O[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        OooOO0o();
        int size = elements.size();
        OooOO0(this.f31332OooOo0o, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooOO0o();
        OooOOOO(0, this.f31332OooOo0o);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (o00OoO00.OooOOO0.OooO00o(this.f31331OooOo0O, 0, this.f31332OooOo0o, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31332OooOo0o;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO00o(i, i2);
        return this.f31331OooOo0O[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f31331OooOo0O;
        int i = this.f31332OooOo0o;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f31332OooOo0o; i++) {
            if (OooOo.OooO00o(this.f31331OooOo0O[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f31332OooOo0o == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f31332OooOo0o - 1; i >= 0; i--) {
            if (OooOo.OooO00o(this.f31331OooOo0O[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooOO0o();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            OooO0oO(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        OooOO0o();
        return OooOOOo(0, this.f31332OooOo0o, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        OooOO0o();
        return OooOOOo(0, this.f31332OooOo0o, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31332OooOo0o;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO00o(i, i2);
        Object[] objArr = this.f31331OooOo0O;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i3 = this.f31332OooOo0o;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO0OO(i, i2, i3);
        return new OooO0O0(this.f31331OooOo0O, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        OooOo.OooO0o0(array, "array");
        int length = array.length;
        int i = this.f31332OooOo0o;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f31331OooOo0O, 0, i, array.getClass());
            OooOo.OooO0Oo(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        OooOOO.Oooo00o(0, 0, i, this.f31331OooOo0O, array);
        int i2 = this.f31332OooOo0o;
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return o00OoO00.OooOOO0.OooO0O0(this.f31331OooOo0O, 0, this.f31332OooOo0o, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31332OooOo0o;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO0O0(i, i2);
        return new OooO00o(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31332OooOo0o;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO0O0(i, i2);
        int size = elements.size();
        OooOO0(i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31332OooOo0o;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO0O0(i, i2);
        ((AbstractList) this).modCount++;
        OooOOO0(i, 1);
        this.f31331OooOo0O[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return OooOOO.Oooo(this.f31331OooOo0O, 0, this.f31332OooOo0o);
    }
}
