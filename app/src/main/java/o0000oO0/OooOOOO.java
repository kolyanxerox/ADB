package o0000Oo0;

import androidx.datastore.preferences.protobuf.OooO00o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import o00000oo.o0OOO0o;
import o00000oo.o0Oo0oo;
import o0000OOo.Oooo000;
import o0000OOo.o00000;
import o0000OOo.oo0O;
import o0000oO.o0OO00O;

/* loaded from: classes2.dex */
public abstract class OooOOOO {
    static {
        o0000.OooOO0O[] oooOO0OArr = {new o0000.OooOO0O(o0Oo0oo.class, 12)};
        HashMap map = new HashMap();
        for (o0000.OooOO0O oooOO0O : oooOO0OArr) {
            boolean zContainsKey = map.containsKey(oooOO0O.f28898OooO00o);
            Class cls = oooOO0O.f28898OooO00o;
            if (zContainsKey) {
                throw new IllegalArgumentException(OooO00o.OooOO0(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map.put(cls, oooOO0O);
        }
        if (oooOO0OArr.length > 0) {
            Class cls2 = oooOO0OArr[0].f28898OooO00o;
        }
        Collections.unmodifiableMap(map);
        o0000.OooOO0O[] oooOO0OArr2 = {new o0000.OooOO0O(o0Oo0oo.class, 13)};
        HashMap map2 = new HashMap();
        for (o0000.OooOO0O oooOO0O2 : oooOO0OArr2) {
            boolean zContainsKey2 = map2.containsKey(oooOO0O2.f28898OooO00o);
            Class cls3 = oooOO0O2.f28898OooO00o;
            if (zContainsKey2) {
                throw new IllegalArgumentException(OooO00o.OooOO0(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map2.put(cls3, oooOO0O2);
        }
        if (oooOO0OArr2.length > 0) {
            Class cls4 = oooOO0OArr2[0].f28898OooO00o;
        }
        Collections.unmodifiableMap(map2);
        int i = oo0O.CONFIG_NAME_FIELD_NUMBER;
        try {
            OooO00o();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void OooO00o() {
        o0OOO0o.OooO0oO(OooOo.f29519OooO00o);
        if (o0OO00O.OooO00o()) {
            return;
        }
        o0OOO0o.OooO0o0(new o0000.OooOOO(Oooo000.class, new o0000.OooOO0O[]{new o0000.OooOO0O(o0Oo0oo.class, 12)}, 9), true);
        o000OO.OooOo00 oooOo00 = OooO.f29488OooO00o;
        o000OO.OooOOO oooOOO = o000OO.OooOOO.f30166OooO0O0;
        oooOOO.OooO0o0(OooO.f29488OooO00o);
        oooOOO.OooO0Oo(OooO.f29489OooO0O0);
        oooOOO.OooO0OO(OooO.f29490OooO0OO);
        oooOOO.OooO0O0(OooO.f29491OooO0Oo);
        o0OOO0o.OooO0o0(new o0000.OooOOO(o00000.class, new o0000.OooOO0O[]{new o0000.OooOO0O(o0Oo0oo.class, 13)}, 10), true);
        oooOOO.OooO0o0(OooOOO0.f29515OooO00o);
        oooOOO.OooO0Oo(OooOOO0.f29516OooO0O0);
        oooOOO.OooO0OO(OooOOO0.f29517OooO0OO);
        oooOOO.OooO0O0(OooOOO0.f29518OooO0Oo);
    }
}
