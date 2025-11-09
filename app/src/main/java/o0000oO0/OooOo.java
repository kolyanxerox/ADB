package o0000Oo0;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o00000oo.o0Oo0oo;
import o00000oo.o0ooOOo;
import o00000oo.oo000o;

/* loaded from: classes2.dex */
public final class OooOo implements o0ooOOo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOo f29519OooO00o = new OooOo();

    @Override // o00000oo.o0ooOOo
    public final Class OooO00o() {
        return o0Oo0oo.class;
    }

    @Override // o00000oo.o0ooOOo
    public final Object OooO0O0(Oooo.OooOo00 oooOo00) throws GeneralSecurityException {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ConcurrentHashMap) oooOo00.f13712OooOo0o).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                arrayList.add((o0Oo0oo) ((oo000o) it2.next()).f29303OooO0O0);
            }
        }
        oo000o oo000oVar = (oo000o) oooOo00.f13710OooOo;
        if (oo000oVar == null || (obj = oo000oVar.f29303OooO0O0) == null) {
            throw new GeneralSecurityException("No primary set");
        }
        return new OooOo00(arrayList, (o0Oo0oo) obj);
    }

    @Override // o00000oo.o0ooOOo
    public final Class OooO0OO() {
        return o0Oo0oo.class;
    }
}
