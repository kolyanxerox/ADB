package o00O0o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class OooOO0 implements Oooo000 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference f31404OooO00o;

    public OooOO0(Oooo000 oooo000) {
        this.f31404OooO00o = new AtomicReference(oooo000);
    }

    @Override // o00O0o.Oooo000
    public final Iterator iterator() {
        Oooo000 oooo000 = (Oooo000) this.f31404OooO00o.getAndSet(null);
        if (oooo000 != null) {
            return oooo000.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
