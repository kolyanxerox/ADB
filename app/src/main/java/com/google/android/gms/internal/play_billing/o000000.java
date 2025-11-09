package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class o000000 extends o0Oo0oo implements List, RandomAccess {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final oo0o0Oo f26972OooOo0o = new oo0o0Oo(o0000OO0.f26985OooOoO, 0);

    public static o0000OO0 OooOOO(int i, Object[] objArr) {
        return i == 0 ? o0000OO0.f26985OooOoO : new o0000OO0(i, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o000000 OooOOOO(List list) {
        if (list instanceof o0Oo0oo) {
            o000000 o000000VarOooO = ((o0Oo0oo) list).OooO();
            if (!o000000VarOooO.OooOO0()) {
                return o000000VarOooO;
            }
            Object[] array = o000000VarOooO.toArray(o0Oo0oo.f27153OooOo0O);
            return OooOOO(array.length, array);
        }
        Object[] array2 = list.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i, "at index "));
            }
        }
        return OooOOO(length, array2);
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final o000000 OooO() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public int OooO0o0(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    public o000000 OooOO0o() {
        return size() <= 1 ? this : new o0O0O00(this);
    }

    @Override // java.util.List
    /* renamed from: OooOOO0 */
    public o000000 subList(int i, int i2) {
        o0O000Oo.OooOo(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? o0000OO0.f26985OooOoO : new o000OOo(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: OooOOOo, reason: merged with bridge method [inline-methods] */
    public final oo0o0Oo listIterator(int i) {
        o0O000Oo.OooOOo0(i, size());
        return isEmpty() ? f26972OooOo0o : new oo0o0Oo(this, i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                oo0o0Oo oo0o0ooListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (oo0o0ooListIterator.hasNext()) {
                        if (!it.hasNext() || ((next = oo0o0ooListIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
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
    public int indexOf(Object obj) {
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
    public int lastIndexOf(Object obj) {
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
