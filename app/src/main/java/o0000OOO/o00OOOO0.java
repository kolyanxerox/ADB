package o0000Ooo;

import com.google.android.gms.internal.measurement.o0OO0O0;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class o00OOOO0 extends o0O000Oo implements ListIterator {

    /* renamed from: OooOo */
    public final o00Oo00 f29526OooOo;

    /* renamed from: OooOo0O */
    public final int f29527OooOo0O;

    /* renamed from: OooOo0o */
    public int f29528OooOo0o;

    public o00OOOO0(o00Oo00 o00oo00, int i) {
        int size = o00oo00.size();
        o0OO0O0.OooO0oO(i, size);
        this.f29527OooOo0O = size;
        this.f29528OooOo0o = i;
        this.f29526OooOo = o00oo00;
    }

    public final Object OooO00o(int i) {
        return this.f29526OooOo.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f29528OooOo0o < this.f29527OooOo0O;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29528OooOo0o > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f29528OooOo0o;
        this.f29528OooOo0o = i + 1;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29528OooOo0o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f29528OooOo0o - 1;
        this.f29528OooOo0o = i;
        return OooO00o(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29528OooOo0o - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
