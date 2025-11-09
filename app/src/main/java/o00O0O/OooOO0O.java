package o00O0o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o00O0OoO.OooO0OO;

/* loaded from: classes3.dex */
public final class OooOO0O implements Iterator, OooO0OO {

    /* renamed from: OooOo */
    public final Iterator f31405OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f31406OooOo0O = 0;

    /* renamed from: OooOo0o */
    public int f31407OooOo0o;

    public OooOO0O(OooOOO0 oooOOO0, byte b) {
        this.f31407OooOo0o = oooOOO0.f31410OooO0OO;
        this.f31405OooOo = oooOOO0.f31409OooO0O0.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f31406OooOo0O) {
            case 0:
                break;
            default:
                return this.f31407OooOo0o > 0 && this.f31405OooOo.hasNext();
        }
        while (true) {
            int i = this.f31407OooOo0o;
            it = this.f31405OooOo;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f31407OooOo0o--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f31406OooOo0O) {
            case 0:
                break;
            default:
                int i = this.f31407OooOo0o;
                if (i == 0) {
                    throw new NoSuchElementException();
                }
                this.f31407OooOo0o = i - 1;
                return this.f31405OooOo.next();
        }
        while (true) {
            int i2 = this.f31407OooOo0o;
            it = this.f31405OooOo;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.f31407OooOo0o--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31406OooOo0O) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public OooOO0O(OooOOO0 oooOOO0) {
        this.f31405OooOo = oooOOO0.f31409OooO0O0.iterator();
        this.f31407OooOo0o = oooOOO0.f31410OooO0OO;
    }
}
