package o00O0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class OooOO0O implements Collection, o00O0OoO.OooO0OO {

    /* renamed from: OooOo0O */
    public final Object[] f31238OooOo0O;

    /* renamed from: OooOo0o */
    public final boolean f31239OooOo0o;

    public OooOO0O(Object[] values, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(values, "values");
        this.f31238OooOo0O = values;
        this.f31239OooOo0o = z;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return OooOOO.Oooo00O(this.f31238OooOo0O, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.OooOo.OooO0o0(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!OooOOO.Oooo00O(this.f31238OooOo0O, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f31238OooOo0O.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return kotlin.jvm.internal.o0O0O00.OooO0Oo(this.f31238OooOo0O);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f31238OooOo0O.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f31238OooOo0O;
        kotlin.jvm.internal.OooOo.OooO0o0(objArr, "<this>");
        if (this.f31239OooOo0o && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.OooOo.OooO0Oo(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.OooOo.OooO0o0(array, "array");
        return kotlin.jvm.internal.OooOo.OooOOO(this, array);
    }
}
