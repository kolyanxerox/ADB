package o0000O;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o00000oo.o0ooOOo;
import o00000oo.oo000o;

/* loaded from: classes2.dex */
public final class OooOOO implements o0ooOOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO f29336OooO00o = new OooOOO();

    @Override // o00000oo.o0ooOOo
    public final Class OooO00o() {
        return OooOO0O.class;
    }

    @Override // o00000oo.o0ooOOo
    public final Object OooO0O0(Oooo.OooOo00 oooOo00) throws GeneralSecurityException {
        if (((oo000o) oooOo00.f13710OooOo) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((ConcurrentHashMap) oooOo00.f13712OooOo0o).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new OooOOO0();
    }

    @Override // o00000oo.o0ooOOo
    public final Class OooO0OO() {
        return OooOO0O.class;
    }
}
