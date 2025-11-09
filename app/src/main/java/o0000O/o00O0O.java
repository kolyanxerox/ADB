package o0000O;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import o00000oo.o00Ooo;
import o00000oo.o0ooOOo;
import o00000oo.oo000o;
import o0000OoO.o00OOO0O;

/* loaded from: classes2.dex */
public final class o00O0O implements o0ooOOo {

    /* renamed from: OooO00o */
    public static final Logger f29348OooO00o = Logger.getLogger(o00O0O.class.getName());

    /* renamed from: OooO0O0 */
    public static final byte[] f29349OooO0O0 = {0};

    /* renamed from: OooO0OO */
    public static final o00O0O f29350OooO0OO = new o00O0O();

    @Override // o00000oo.o0ooOOo
    public final Class OooO00o() {
        return o00Ooo.class;
    }

    @Override // o00000oo.o0ooOOo
    public final Object OooO0O0(Oooo.OooOo00 oooOo00) throws GeneralSecurityException {
        Iterator it = ((ConcurrentHashMap) oooOo00.f13712OooOo0o).values().iterator();
        while (it.hasNext()) {
            for (oo000o oo000oVar : (List) it.next()) {
                o00000oo.OooOo00 oooOo002 = oo000oVar.f29309OooO0oo;
                if (oooOo002 instanceof o000oOoO) {
                    o000oOoO o000oooo2 = (o000oOoO) oooOo002;
                    byte[] bArr = oo000oVar.f29304OooO0OO;
                    o00OOO0O o00ooo0oOooO00o = o00OOO0O.OooO00o(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!o00ooo0oOooO00o.equals(o000oooo2.OooO0O0())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + o000oooo2.OooO0OO() + " has wrong output prefix (" + o000oooo2.OooO0O0() + ") instead of (" + o00ooo0oOooO00o + ")");
                    }
                }
            }
        }
        return new o0OoOo0(oooOo00);
    }

    @Override // o00000oo.o0ooOOo
    public final Class OooO0OO() {
        return o00Ooo.class;
    }
}
