package o0000O;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import o00000oo.o00Ooo;
import o00000oo.o0OOO0o;
import o0000OOo.oo0O;
import o0000oO.o0OO00O;

/* loaded from: classes2.dex */
public abstract class Oooo0 {
    static {
        o0000.OooOO0O[] oooOO0OArr = {new o0000.OooOO0O(o00Ooo.class, 10)};
        HashMap map = new HashMap();
        o0000.OooOO0O oooOO0O = oooOO0OArr[0];
        boolean zContainsKey = map.containsKey(oooOO0O.f28898OooO00o);
        Class cls = oooOO0O.f28898OooO00o;
        if (zContainsKey) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooOO0(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, oooOO0O);
        Class cls2 = oooOO0OArr[0].f28898OooO00o;
        Collections.unmodifiableMap(map);
        int i = oo0O.CONFIG_NAME_FIELD_NUMBER;
        try {
            OooO00o();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void OooO00o() {
        o0OOO0o.OooO0oO(o00O0O.f29350OooO0OO);
        o0OOO0o.OooO0oO(OooOOO.f29336OooO00o);
        o0OOO0o.OooO0o0(new OooO0OO(), true);
        o000OO.OooOo00 oooOo00 = Oooo000.f29344OooO00o;
        o000OO.OooOOO oooOOO = o000OO.OooOOO.f30166OooO0O0;
        oooOOO.OooO0o0(Oooo000.f29344OooO00o);
        oooOOO.OooO0Oo(Oooo000.f29345OooO0O0);
        oooOOO.OooO0OO(Oooo000.f29346OooO0OO);
        oooOOO.OooO0O0(Oooo000.f29347OooO0Oo);
        o000OO.OooOOO0 oooOOO0 = o000OO.OooOOO0.f30168OooO0O0;
        oooOOO0.OooO0O0(OooO0OO.f29315OooO0o);
        if (o0OO00O.OooO00o()) {
            return;
        }
        o0OOO0o.OooO0o0(new OooO0OO(o0000OOo.OooO0OO.class, new o0000.OooOO0O[]{new o0000.OooOO0O(o00Ooo.class, 9)}), true);
        oooOOO.OooO0o0(OooOO0.f29332OooO00o);
        oooOOO.OooO0Oo(OooOO0.f29333OooO0O0);
        oooOOO.OooO0OO(OooOO0.f29334OooO0OO);
        oooOOO.OooO0O0(OooOO0.f29335OooO0Oo);
        oooOOO0.OooO0O0(OooO0OO.f29316OooO0o0);
    }
}
