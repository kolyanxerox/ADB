package OoooOOO;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o0o0Oo implements Iterator {

    /* renamed from: OooOo0O */
    public final Iterator f14575OooOo0O;

    public o0o0Oo(o00OOOO0 o00oooo0) {
        this.f14575OooOo0O = o00oooo0.OooOO0o().keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14575OooOo0O.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f14575OooOo0O.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
