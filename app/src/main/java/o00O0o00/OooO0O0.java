package o00O0O00;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOOO;

/* loaded from: classes3.dex */
public final class OooO0O0 extends o00O0.OooOO0 implements RandomAccess, Serializable {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f31324OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Object[] f31325OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f31326OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final OooO0OO f31327OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0O0 f31328OooOoO0;

    public OooO0O0(Object[] backing, int i, int i2, OooO0O0 oooO0O0, OooO0OO root) {
        OooOo.OooO0o0(backing, "backing");
        OooOo.OooO0o0(root, "root");
        this.f31325OooOo0O = backing;
        this.f31326OooOo0o = i;
        this.f31324OooOo = i2;
        this.f31328OooOoO0 = oooO0O0;
        this.f31327OooOoO = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // o00O0.OooOO0
    public final int OooO0o() {
        OooOO0o();
        return this.f31324OooOo;
    }

    @Override // o00O0.OooOO0
    public final Object OooO0oO(int i) {
        OooOOO0();
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31324OooOo;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO00o(i, i2);
        return OooOOO(this.f31326OooOo0o + i);
    }

    public final void OooOO0(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        OooO0OO oooO0OO = this.f31327OooOoO;
        OooO0O0 oooO0O0 = this.f31328OooOoO0;
        if (oooO0O0 != null) {
            oooO0O0.OooOO0(i, collection, i2);
        } else {
            OooO0OO oooO0OO2 = OooO0OO.f31329OooOoO0;
            oooO0OO.OooOO0(i, collection, i2);
        }
        this.f31325OooOo0O = oooO0OO.f31331OooOo0O;
        this.f31324OooOo += i2;
    }

    public final void OooOO0O(int i, Object obj) {
        ((AbstractList) this).modCount++;
        OooO0OO oooO0OO = this.f31327OooOoO;
        OooO0O0 oooO0O0 = this.f31328OooOoO0;
        if (oooO0O0 != null) {
            oooO0O0.OooOO0O(i, obj);
        } else {
            OooO0OO oooO0OO2 = OooO0OO.f31329OooOoO0;
            oooO0OO.OooOO0O(i, obj);
        }
        this.f31325OooOo0O = oooO0OO.f31331OooOo0O;
        this.f31324OooOo++;
    }

    public final void OooOO0o() {
        if (((AbstractList) this.f31327OooOoO).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object OooOOO(int i) {
        Object objOooOOO;
        ((AbstractList) this).modCount++;
        OooO0O0 oooO0O0 = this.f31328OooOoO0;
        if (oooO0O0 != null) {
            objOooOOO = oooO0O0.OooOOO(i);
        } else {
            OooO0OO oooO0OO = OooO0OO.f31329OooOoO0;
            objOooOOO = this.f31327OooOoO.OooOOO(i);
        }
        this.f31324OooOo--;
        return objOooOOO;
    }

    public final void OooOOO0() {
        if (this.f31327OooOoO.f31330OooOo) {
            throw new UnsupportedOperationException();
        }
    }

    public final void OooOOOO(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        OooO0O0 oooO0O0 = this.f31328OooOoO0;
        if (oooO0O0 != null) {
            oooO0O0.OooOOOO(i, i2);
        } else {
            OooO0OO oooO0OO = OooO0OO.f31329OooOoO0;
            this.f31327OooOoO.OooOOOO(i, i2);
        }
        this.f31324OooOo -= i2;
    }

    public final int OooOOOo(int i, int i2, Collection collection, boolean z) {
        int iOooOOOo;
        OooO0O0 oooO0O0 = this.f31328OooOoO0;
        if (oooO0O0 != null) {
            iOooOOOo = oooO0O0.OooOOOo(i, i2, collection, z);
        } else {
            OooO0OO oooO0OO = OooO0OO.f31329OooOoO0;
            iOooOOOo = this.f31327OooOoO.OooOOOo(i, i2, collection, z);
        }
        if (iOooOOOo > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f31324OooOo -= iOooOOOo;
        return iOooOOOo;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooOOO0();
        OooOO0o();
        OooOO0O(this.f31326OooOo0o + this.f31324OooOo, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        OooOOO0();
        OooOO0o();
        int size = elements.size();
        OooOO0(this.f31326OooOo0o + this.f31324OooOo, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooOOO0();
        OooOO0o();
        OooOOOO(this.f31326OooOo0o, this.f31324OooOo);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        OooOO0o();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return o00OoO00.OooOOO0.OooO00o(this.f31325OooOo0O, this.f31326OooOo0o, this.f31324OooOo, (List) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31324OooOo;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO00o(i, i2);
        return this.f31325OooOo0O[this.f31326OooOo0o + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        OooOO0o();
        Object[] objArr = this.f31325OooOo0O;
        int i = this.f31324OooOo;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f31326OooOo0o + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        OooOO0o();
        for (int i = 0; i < this.f31324OooOo; i++) {
            if (OooOo.OooO00o(this.f31325OooOo0O[this.f31326OooOo0o + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        OooOO0o();
        return this.f31324OooOo == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        OooOO0o();
        for (int i = this.f31324OooOo - 1; i >= 0; i--) {
            if (OooOo.OooO00o(this.f31325OooOo0O[this.f31326OooOo0o + i], obj)) {
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
        OooOOO0();
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
        OooOOO0();
        OooOO0o();
        return OooOOOo(this.f31326OooOo0o, this.f31324OooOo, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        OooOOO0();
        OooOO0o();
        return OooOOOo(this.f31326OooOo0o, this.f31324OooOo, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooOOO0();
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31324OooOo;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO00o(i, i2);
        Object[] objArr = this.f31325OooOo0O;
        int i3 = this.f31326OooOo0o + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i3 = this.f31324OooOo;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO0OO(i, i2, i3);
        return new OooO0O0(this.f31325OooOo0O, this.f31326OooOo0o + i, i2 - i, this, this.f31327OooOoO);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        OooOo.OooO0o0(array, "array");
        OooOO0o();
        int length = array.length;
        int i = this.f31324OooOo;
        int i2 = this.f31326OooOo0o;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f31325OooOo0O, i2, i + i2, array.getClass());
            OooOo.OooO0Oo(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        OooOOO.Oooo00o(0, i2, i + i2, this.f31325OooOo0O, array);
        int i3 = this.f31324OooOo;
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        OooOO0o();
        return o00OoO00.OooOOO0.OooO0O0(this.f31325OooOo0O, this.f31326OooOo0o, this.f31324OooOo, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31324OooOo;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO0O0(i, i2);
        return new OooO00o(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        OooOOO0();
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31324OooOo;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO0O0(i, i2);
        OooOO0O(this.f31326OooOo0o + i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        OooOOO0();
        OooOO0o();
        o00O0.OooO0O0 oooO0O0 = o00O0.OooO.Companion;
        int i2 = this.f31324OooOo;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO0O0(i, i2);
        int size = elements.size();
        OooOO0(this.f31326OooOo0o + i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        OooOO0o();
        Object[] objArr = this.f31325OooOo0O;
        int i = this.f31324OooOo;
        int i2 = this.f31326OooOo0o;
        return OooOOO.Oooo(objArr, i2, i + i2);
    }
}
