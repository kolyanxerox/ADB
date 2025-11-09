package o000OO;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import o00000oo.o0ooOOo;

/* loaded from: classes2.dex */
public final class OooOOO0 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOOO0 f30168OooO0O0 = new OooOOO0();

    /* renamed from: OooO00o, reason: collision with root package name */
    public final AtomicReference f30169OooO00o = new AtomicReference(new o000oOoO(new OooO0oO.OooOOO0(29)));

    public final Class OooO00o(Class cls) {
        HashMap map = ((o000oOoO) this.f30169OooO00o.get()).f30177OooO0O0;
        if (map.containsKey(cls)) {
            return ((o0ooOOo) map.get(cls)).OooO00o();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void OooO0O0(OooOo oooOo) {
        OooO0oO.OooOOO0 oooOOO0 = new OooO0oO.OooOOO0((o000oOoO) this.f30169OooO00o.get());
        oooOOO0.OooO0oO(oooOo);
        this.f30169OooO00o.set(new o000oOoO(oooOOO0));
    }
}
