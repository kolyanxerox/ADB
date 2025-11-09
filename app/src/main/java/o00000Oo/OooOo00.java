package o00000oo;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class OooOo00 {

    /* renamed from: OooO00o */
    public static final byte[] f29284OooO00o = new byte[0];

    public static o0OoOo0 OooO00o(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = o0OOO0o.f29297OooO00o;
        synchronized (o0OOO0o.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(o0OOO0o.f29300OooO0Oo);
        }
        o0OoOo0 o0oooo0 = (o0OoOo0) mapUnmodifiableMap.get(str);
        if (o0oooo0 != null) {
            return o0oooo0;
        }
        throw new GeneralSecurityException(OooO0oO.OooOo.OooOO0("cannot find key template: ", str));
    }
}
