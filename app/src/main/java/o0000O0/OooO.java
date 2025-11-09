package o0000O0;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import o0000.OooOOO;
import o00000oo.OooOo;
import o00000oo.o0OOO0o;
import o0000OOo.o000O000;
import o0000OOo.oo0O;
import o0000oO.o0OO00O;
import o000OO.OooOo00;

/* loaded from: classes2.dex */
public abstract class OooO {
    static {
        o0000.OooOO0O[] oooOO0OArr = {new o0000.OooOO0O(OooOo.class, 11)};
        HashMap map = new HashMap();
        for (o0000.OooOO0O oooOO0O : oooOO0OArr) {
            boolean zContainsKey = map.containsKey(oooOO0O.f28898OooO00o);
            Class cls = oooOO0O.f28898OooO00o;
            if (zContainsKey) {
                throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooOO0(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map.put(cls, oooOO0O);
        }
        if (oooOO0OArr.length > 0) {
            Class cls2 = oooOO0OArr[0].f28898OooO00o;
        }
        Collections.unmodifiableMap(map);
        int i = oo0O.CONFIG_NAME_FIELD_NUMBER;
        try {
            OooO00o();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void OooO00o() {
        o0OOO0o.OooO0oO(OooOO0O.f29369OooO0O0);
        if (o0OO00O.OooO00o()) {
            return;
        }
        o0OOO0o.OooO0o0(new OooOOO(o000O000.class, new o0000.OooOO0O[]{new o0000.OooOO0O(OooOo.class, 11)}, 8), true);
        OooOo00 oooOo00 = OooO0o.f29360OooO00o;
        o000OO.OooOOO oooOOO = o000OO.OooOOO.f30166OooO0O0;
        oooOOO.OooO0o0(OooO0o.f29360OooO00o);
        oooOOO.OooO0Oo(OooO0o.f29361OooO0O0);
        oooOOO.OooO0OO(OooO0o.f29362OooO0OO);
        oooOOO.OooO0O0(OooO0o.f29363OooO0Oo);
    }
}
