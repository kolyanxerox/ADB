package o0000;

import com.google.android.gms.internal.measurement.o0OO00OO;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import o0000OOo.o00000;
import o0000OOo.o0000O00;
import o0000OOo.o000O;
import o0000OOo.o000O000;
import o0000OOo.o000O00O;
import o0000OOo.o000OO;
import o0000OOo.o000OOo0;
import o0000OOo.o00OO00O;
import o0000OOo.o00OOO00;
import o0000OOo.oo0oOO0;

/* loaded from: classes2.dex */
public final class OooOO0O {

    /* renamed from: OooO00o */
    public final Class f28898OooO00o;

    /* renamed from: OooO0O0 */
    public final /* synthetic */ int f28899OooO0O0;

    public OooOO0O(Class cls, int i) {
        this.f28899OooO0O0 = i;
        this.f28898OooO00o = cls;
    }

    public final Object OooO00o(com.google.crypto.tink.shaded.protobuf.OooO00o oooO00o) throws GeneralSecurityException {
        switch (this.f28899OooO0O0) {
            case 0:
                o0000OOo.OooOOO oooOOO = (o0000OOo.OooOOO) oooO00o;
                OooOO0O[] oooOO0OArr = {new OooOO0O(o0000Oo.o0OoOo0.class, 1)};
                HashMap map = new HashMap();
                for (OooOO0O oooOO0O : oooOO0OArr) {
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
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                o0000OOo.o00Ooo o00oooOooOoO0 = oooOOO.OooOoO0();
                OooOO0O oooOO0O2 = (OooOO0O) mapUnmodifiableMap.get(o0000Oo.o0OoOo0.class);
                if (oooOO0O2 == null) {
                    throw new IllegalArgumentException("Requested primitive class " + o0000Oo.o0OoOo0.class.getCanonicalName() + " not supported.");
                }
                o0000Oo.o0OoOo0 o0oooo0 = (o0000Oo.o0OoOo0) oooOO0O2.OooO00o(o00oooOooOoO0);
                OooOO0O[] oooOO0OArr2 = {new OooOO0O(o00000oo.o00Ooo.class, 10)};
                HashMap map2 = new HashMap();
                for (OooOO0O oooOO0O3 : oooOO0OArr2) {
                    boolean zContainsKey2 = map2.containsKey(oooOO0O3.f28898OooO00o);
                    Class cls3 = oooOO0O3.f28898OooO00o;
                    if (zContainsKey2) {
                        throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.OooO00o.OooOO0(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, oooOO0O3);
                }
                if (oooOO0OArr2.length > 0) {
                    Class cls4 = oooOO0OArr2[0].f28898OooO00o;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                o000OOo0 o000ooo0OooOoO = oooOOO.OooOoO();
                OooOO0O oooOO0O4 = (OooOO0O) mapUnmodifiableMap2.get(o00000oo.o00Ooo.class);
                if (oooOO0O4 != null) {
                    return new o0000Oo.OooOo(o0oooo0, (o00000oo.o00Ooo) oooOO0O4.OooO00o(o000ooo0OooOoO), oooOOO.OooOoO().OooOoOO().OooOoO());
                }
                throw new IllegalArgumentException("Requested primitive class " + o00000oo.o00Ooo.class.getCanonicalName() + " not supported.");
            case 1:
                o0000OOo.o00Ooo o00ooo2 = (o0000OOo.o00Ooo) oooO00o;
                return new o0000Oo.OooO(o00ooo2.OooOoO().OooOO0(), o00ooo2.OooOoOO().OooOo());
            case 2:
                o0000OOo.o0OO00O o0oo00o = (o0000OOo.o0OO00O) oooO00o;
                return new o0000Oo.OooOO0(o0oo00o.OooOoO0().OooOO0(), o0oo00o.OooOoO().OooOo());
            case 3:
                return new o0000Oo.OooOOO0(((o0000O00) oooO00o).OooOo().OooOO0(), 0);
            case 4:
                return new o0000oo.oo0o0Oo(((o000OO) oooO00o).OooOo().OooOO0());
            case 5:
                return new o0000Oo.OooOOO0(((o000O00O) oooO00o).OooOo().OooOO0(), 1);
            case 6:
                String strOooOo0o = ((oo0oOO0) oooO00o).OooOo().OooOo0o();
                return o00000oo.o00Oo0.OooO00o(strOooOo0o).OooO0OO(strOooOo0o);
            case 7:
                o00OO00O o00oo00o = (o00OO00O) oooO00o;
                String strOooOo = o00oo00o.OooOo().OooOo();
                return new o0OO00O(o00oo00o.OooOo().OooOo0o(), o00000oo.o00Oo0.OooO00o(strOooOo).OooO0OO(strOooOo));
            case 8:
                return new o0000Oo.OooOOO0(((o00OOO00) oooO00o).OooOo().OooOO0(), 2);
            case 9:
                o0000OOo.OooO0OO oooO0OO = (o0000OOo.OooO0OO) oooO00o;
                return new o0000Oo.o00Oo0(new Oooo.OooOo00(oooO0OO.OooOoO0().OooOO0()), oooO0OO.OooOoO().OooOo());
            case 10:
                o000OOo0 o000ooo02 = (o000OOo0) oooO00o;
                o000O o000oOooOoO0 = o000ooo02.OooOoOO().OooOoO0();
                SecretKeySpec secretKeySpec = new SecretKeySpec(o000ooo02.OooOoO().OooOO0(), "HMAC");
                int iOooOoO = o000ooo02.OooOoOO().OooOoO();
                int iOrdinal = o000oOooOoO0.ordinal();
                if (iOrdinal == 1) {
                    return new o0000Oo.o00Oo0(new OooO0oO.OooOOO("HMACSHA1", secretKeySpec), iOooOoO);
                }
                if (iOrdinal == 2) {
                    return new o0000Oo.o00Oo0(new OooO0oO.OooOOO("HMACSHA384", secretKeySpec), iOooOoO);
                }
                if (iOrdinal == 3) {
                    return new o0000Oo.o00Oo0(new OooO0oO.OooOOO("HMACSHA256", secretKeySpec), iOooOoO);
                }
                if (iOrdinal == 4) {
                    return new o0000Oo.o00Oo0(new OooO0oO.OooOOO("HMACSHA512", secretKeySpec), iOooOoO);
                }
                if (iOrdinal == 5) {
                    return new o0000Oo.o00Oo0(new OooO0oO.OooOOO("HMACSHA224", secretKeySpec), iOooOoO);
                }
                throw new GeneralSecurityException("unknown hash");
            case 11:
                return new o0000Oo.OooOOO(((o000O000) oooO00o).OooOo().OooOO0());
            case 12:
                o0000OOo.Oooo000 oooo000 = (o0000OOo.Oooo000) oooO00o;
                return new o0000Oo.OooO0o(oooo000.OooOoO0().OooOO0(), o0OO00OO.OooOooo(oooo000.OooOoO().OooOoo()), oooo000.OooOoO().OooOoo0(), o0OO00OO.OooOooo(oooo000.OooOoO().OooOooO().OooOoO0()), oooo000.OooOoO().OooOooO().OooOoO(), oooo000.OooOoO().OooOoO());
            default:
                o00000 o00000Var = (o00000) oooO00o;
                return new o0000Oo.OooOO0O(o0OO00OO.OooOooo(o00000Var.OooOoO().OooOoo0()), o00000Var.OooOoO0().OooOO0(), o00000Var.OooOoO().OooOoOO(), o00000Var.OooOoO().OooOoO0());
        }
    }
}
