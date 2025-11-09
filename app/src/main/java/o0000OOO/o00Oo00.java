package o0000Ooo;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class o00Oo00 extends o0o0Oo implements List, RandomAccess {

    /* renamed from: OooOo0o */
    public static final o00OOOO0 f29532OooOo0o = new o00OOOO0(o0oOOo.f29560OooOoO, 0);

    public static o0oOOo OooOO0(int i, Object[] objArr) {
        return i == 0 ? o0oOOo.f29560OooOoO : new o0oOOo(i, objArr);
    }

    @Override // o0000Ooo.o0o0Oo
    public int OooO0o0(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    /* renamed from: OooOO0O */
    public final o00OOOO0 listIterator(int i) {
        o0OO0O0.OooO0oO(i, size());
        return isEmpty() ? f29532OooOo0o : new o00OOOO0(this, i);
    }

    @Override // java.util.List
    /* renamed from: OooOO0o */
    public o00Oo00 subList(int i, int i2) {
        o0OO0O0.OooO0oo(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? o0oOOo.f29560OooOoO : new o00OOOOo(this, i, i3);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o0000Ooo.o0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = list.iterator();
                        for (Object obj2 : this) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (obj2 != next && (obj2 == null || !obj2.equals(next))) {
                                    return false;
                                }
                            }
                        }
                        return !it.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        Object obj3 = get(i);
                        Object obj4 = list.get(i);
                        if (obj3 != obj4 && (obj3 == null || !obj3.equals(obj4))) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
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
    public Iterator iterator() {
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
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
