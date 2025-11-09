package o00O0o;

import java.util.Iterator;
import o00O0OoO.OooO0OO;

/* loaded from: classes3.dex */
public final class o00oO0o implements Iterator, OooO0OO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Iterator f31431OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0Oo0.o00Oo0 f31432OooOo0o;

    public o00oO0o(o00O0Oo0.o00Oo0 o00oo0) {
        this.f31432OooOo0o = o00oo0;
        this.f31431OooOo0O = ((Oooo000) o00oo0.f31392OooO0O0).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31431OooOo0O.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.Oooo000, o00O0Oo.Oooo000] */
    @Override // java.util.Iterator
    public final Object next() {
        return ((kotlin.jvm.internal.Oooo000) this.f31432OooOo0o.f31393OooO0OO).invoke(this.f31431OooOo0O.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
