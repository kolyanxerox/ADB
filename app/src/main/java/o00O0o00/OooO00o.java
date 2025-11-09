package o00O0O00;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class OooO00o implements ListIterator, o00O0OoO.OooO0OO {

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f31321OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final o00O0.OooOO0 f31322OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f31323OooOoO0;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31320OooOo0O = 0;

    /* renamed from: OooOo, reason: collision with root package name */
    public int f31319OooOo = -1;

    public OooO00o(OooO0OO oooO0OO, int i) {
        this.f31322OooOoO = oooO0OO;
        this.f31321OooOo0o = i;
        this.f31323OooOoO0 = ((AbstractList) oooO0OO).modCount;
    }

    public void OooO00o() {
        if (((AbstractList) ((OooO0O0) this.f31322OooOoO).f31327OooOoO).modCount != this.f31323OooOoO0) {
            throw new ConcurrentModificationException();
        }
    }

    public void OooO0O0() {
        if (((AbstractList) ((OooO0OO) this.f31322OooOoO)).modCount != this.f31323OooOoO0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f31320OooOo0O) {
            case 0:
                OooO00o();
                int i = this.f31321OooOo0o;
                this.f31321OooOo0o = i + 1;
                OooO0O0 oooO0O0 = (OooO0O0) this.f31322OooOoO;
                oooO0O0.add(i, obj);
                this.f31319OooOo = -1;
                this.f31323OooOoO0 = ((AbstractList) oooO0O0).modCount;
                break;
            default:
                OooO0O0();
                int i2 = this.f31321OooOo0o;
                this.f31321OooOo0o = i2 + 1;
                OooO0OO oooO0OO = (OooO0OO) this.f31322OooOoO;
                oooO0OO.add(i2, obj);
                this.f31319OooOo = -1;
                this.f31323OooOoO0 = ((AbstractList) oooO0OO).modCount;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31320OooOo0O) {
            case 0:
                if (this.f31321OooOo0o < ((OooO0O0) this.f31322OooOoO).f31324OooOo) {
                }
                break;
            default:
                if (this.f31321OooOo0o < ((OooO0OO) this.f31322OooOoO).f31332OooOo0o) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f31320OooOo0O) {
            case 0:
                if (this.f31321OooOo0o > 0) {
                }
                break;
            default:
                if (this.f31321OooOo0o > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f31320OooOo0O) {
            case 0:
                OooO00o();
                int i = this.f31321OooOo0o;
                OooO0O0 oooO0O0 = (OooO0O0) this.f31322OooOoO;
                if (i >= oooO0O0.f31324OooOo) {
                    throw new NoSuchElementException();
                }
                this.f31321OooOo0o = i + 1;
                this.f31319OooOo = i;
                return oooO0O0.f31325OooOo0O[oooO0O0.f31326OooOo0o + i];
            default:
                OooO0O0();
                int i2 = this.f31321OooOo0o;
                OooO0OO oooO0OO = (OooO0OO) this.f31322OooOoO;
                if (i2 >= oooO0OO.f31332OooOo0o) {
                    throw new NoSuchElementException();
                }
                this.f31321OooOo0o = i2 + 1;
                this.f31319OooOo = i2;
                return oooO0OO.f31331OooOo0O[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f31320OooOo0O) {
        }
        return this.f31321OooOo0o;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f31320OooOo0O) {
            case 0:
                OooO00o();
                int i = this.f31321OooOo0o;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f31321OooOo0o = i2;
                this.f31319OooOo = i2;
                OooO0O0 oooO0O0 = (OooO0O0) this.f31322OooOoO;
                return oooO0O0.f31325OooOo0O[oooO0O0.f31326OooOo0o + i2];
            default:
                OooO0O0();
                int i3 = this.f31321OooOo0o;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f31321OooOo0o = i4;
                this.f31319OooOo = i4;
                return ((OooO0OO) this.f31322OooOoO).f31331OooOo0O[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f31320OooOo0O) {
        }
        return this.f31321OooOo0o - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f31320OooOo0O) {
            case 0:
                OooO00o();
                int i = this.f31319OooOo;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                OooO0O0 oooO0O0 = (OooO0O0) this.f31322OooOoO;
                oooO0O0.OooO0oO(i);
                this.f31321OooOo0o = this.f31319OooOo;
                this.f31319OooOo = -1;
                this.f31323OooOoO0 = ((AbstractList) oooO0O0).modCount;
                return;
            default:
                OooO0O0();
                int i2 = this.f31319OooOo;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                OooO0OO oooO0OO = (OooO0OO) this.f31322OooOoO;
                oooO0OO.OooO0oO(i2);
                this.f31321OooOo0o = this.f31319OooOo;
                this.f31319OooOo = -1;
                this.f31323OooOoO0 = ((AbstractList) oooO0OO).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f31320OooOo0O) {
            case 0:
                OooO00o();
                int i = this.f31319OooOo;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((OooO0O0) this.f31322OooOoO).set(i, obj);
                return;
            default:
                OooO0O0();
                int i2 = this.f31319OooOo;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((OooO0OO) this.f31322OooOoO).set(i2, obj);
                return;
        }
    }

    public OooO00o(OooO0O0 oooO0O0, int i) {
        this.f31322OooOoO = oooO0O0;
        this.f31321OooOo0o = i;
        this.f31323OooOoO0 = ((AbstractList) oooO0O0).modCount;
    }
}
