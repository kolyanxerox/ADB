package o0000oo0;

import java.util.Set;
import o000Oo00.OooOOO;

/* loaded from: classes2.dex */
public interface o00Ooo {
    default Set OooO00o(o00000OO o00000oo2) {
        return (Set) OooO0OO(o00000oo2).get();
    }

    OooOOO OooO0O0(o00000OO o00000oo2);

    OooOOO OooO0OO(o00000OO o00000oo2);

    o00000O0 OooO0Oo(o00000OO o00000oo2);

    default Object OooO0o(o00000OO o00000oo2) {
        OooOOO oooOOOOooO0O0 = OooO0O0(o00000oo2);
        if (oooOOOOooO0O0 == null) {
            return null;
        }
        return oooOOOOooO0O0.get();
    }

    default OooOOO OooO0o0(Class cls) {
        return OooO0O0(o00000OO.OooO00o(cls));
    }

    default Object get(Class cls) {
        return OooO0o(o00000OO.OooO00o(cls));
    }
}
