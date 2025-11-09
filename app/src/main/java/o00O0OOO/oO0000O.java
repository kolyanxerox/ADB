package o00O0ooo;

import java.util.concurrent.atomic.AtomicReference;
import o00O.OooO0O0;
import o00O.OooO0o;
import o00O0O0O.OooO0OO;

/* loaded from: classes3.dex */
public final class oO0000O extends OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference f31831OooO00o = new AtomicReference(null);

    @Override // o00O.OooO0o
    public final boolean OooO00o(OooO0O0 oooO0O0) {
        AtomicReference atomicReference = this.f31831OooO00o;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(o0o0000.f31804OooO0O0);
        return true;
    }

    @Override // o00O.OooO0o
    public final OooO0OO[] OooO0O0(OooO0O0 oooO0O0) {
        this.f31831OooO00o.set(null);
        return o00O.OooO0OO.f31170OooO00o;
    }
}
