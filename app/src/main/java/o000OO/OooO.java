package o000OO;

import OoooOOO.o0o0000;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o0000OOo.o00O000o;

/* loaded from: classes2.dex */
public abstract class OooO {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Class f30155OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final Map f30156OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final Class f30157OooO0OO;

    public OooO(Class cls, o0000.OooOO0O... oooOO0OArr) {
        this.f30155OooO00o = cls;
        HashMap map = new HashMap();
        for (o0000.OooOO0O oooOO0O : oooOO0OArr) {
            boolean zContainsKey = map.containsKey(oooOO0O.f28898OooO00o);
            Class cls2 = oooOO0O.f28898OooO00o;
            if (zContainsKey) {
                throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooOO0(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map.put(cls2, oooOO0O);
        }
        if (oooOO0OArr.length > 0) {
            this.f30157OooO0OO = oooOO0OArr[0].f28898OooO00o;
        } else {
            this.f30157OooO0OO = Void.class;
        }
        this.f30156OooO0O0 = Collections.unmodifiableMap(map);
    }

    public int OooO00o() {
        return 1;
    }

    public abstract String OooO0O0();

    public final Object OooO0OO(com.google.crypto.tink.shaded.protobuf.OooO00o oooO00o, Class cls) {
        o0000.OooOO0O oooOO0O = (o0000.OooOO0O) this.f30156OooO0O0.get(cls);
        if (oooOO0O != null) {
            return oooOO0O.OooO00o(oooO00o);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract o0o0000 OooO0Oo();

    public abstract com.google.crypto.tink.shaded.protobuf.OooO00o OooO0o(com.google.crypto.tink.shaded.protobuf.OooOOO0 oooOOO0);

    public abstract o00O000o OooO0o0();

    public abstract void OooO0oO(com.google.crypto.tink.shaded.protobuf.OooO00o oooO00o);
}
