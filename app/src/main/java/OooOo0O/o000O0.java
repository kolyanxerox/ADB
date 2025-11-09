package OoooO0O;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o000O0 extends o00O0000 implements ListIterator {

    /* renamed from: OooOo, reason: collision with root package name */
    public final o000OO0O f13956OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final int f13957OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f13958OooOo0o;

    public o000O0(o000OO0O o000oo0o, int i) {
        int size = o000oo0o.size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(o000Oo0.OooO0o(i, size, "index"));
        }
        this.f13957OooOo0O = size;
        this.f13958OooOo0o = i;
        this.f13956OooOo = o000oo0o;
    }

    public final Object OooO00o(int i) {
        return this.f13956OooOo.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f13958OooOo0o < this.f13957OooOo0O;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f13958OooOo0o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f13958OooOo0o;
        this.f13958OooOo0o = i + 1;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13958OooOo0o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f13958OooOo0o - 1;
        this.f13958OooOo0o = i;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13958OooOo0o - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
