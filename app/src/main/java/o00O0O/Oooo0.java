package o00O0o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0OO0.OooO00o;

/* loaded from: classes3.dex */
public final class Oooo0 extends o000oOoO implements Iterator, OooO0OO, o00O0OoO.OooO0OO {

    /* renamed from: OooOo */
    public Iterator f31419OooOo;

    /* renamed from: OooOo0O */
    public int f31420OooOo0O;

    /* renamed from: OooOo0o */
    public Object f31421OooOo0o;

    /* renamed from: OooOoO0 */
    public OooO0OO f31422OooOoO0;

    @Override // o00O0o.o000oOoO
    public final void OooO00o(Object obj, OooO00o oooO00o) {
        this.f31421OooOo0o = obj;
        this.f31420OooOo0O = 3;
        this.f31422OooOoO0 = oooO00o;
        o00O0O0o.OooOo00 oooOo00 = o00O0O0o.OooOo00.f31365OooOo0O;
    }

    public final RuntimeException OooO0O0() {
        int i = this.f31420OooOo0O;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f31420OooOo0O);
    }

    @Override // o00O0O0O.OooO0OO
    public final o00O0O0O.OooOOO0 getContext() {
        return o00O0O0O.OooOOO.f31358OooOo0O;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f31420OooOo0O;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw OooO0O0();
                }
                Iterator it = this.f31419OooOo;
                kotlin.jvm.internal.OooOo.OooO0O0(it);
                if (it.hasNext()) {
                    this.f31420OooOo0O = 2;
                    return true;
                }
                this.f31419OooOo = null;
            }
            this.f31420OooOo0O = 5;
            OooO0OO oooO0OO = this.f31422OooOoO0;
            kotlin.jvm.internal.OooOo.OooO0O0(oooO0OO);
            this.f31422OooOoO0 = null;
            oooO0OO.resumeWith(oo00o.OooOo.f33195OooO00o);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f31420OooOo0O;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f31420OooOo0O = 1;
            Iterator it = this.f31419OooOo;
            kotlin.jvm.internal.OooOo.OooO0O0(it);
            return it.next();
        }
        if (i != 3) {
            throw OooO0O0();
        }
        this.f31420OooOo0O = 0;
        Object obj = this.f31421OooOo0o;
        this.f31421OooOo0o = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // o00O0O0O.OooO0OO
    public final void resumeWith(Object obj) {
        o000OOo.OooOO0O(obj);
        this.f31420OooOo0O = 4;
    }
}
