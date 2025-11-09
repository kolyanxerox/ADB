package OooOOo0;

import java.util.Collections;
import java.util.HashMap;
import o000OOO.OooO00o;

/* loaded from: classes2.dex */
public final class OooOOO implements o000OO00.OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO f13470OooO00o = new OooOOO();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13471OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13472OooO0OO;

    static {
        OooO00o oooO00o = new OooO00o(1);
        HashMap map = new HashMap();
        map.put(o000OOO.OooO0o.class, oooO00o);
        f13471OooO0O0 = new o000OO00.OooO0OO("startMs", Collections.unmodifiableMap(new HashMap(map)));
        OooO00o oooO00o2 = new OooO00o(2);
        HashMap map2 = new HashMap();
        map2.put(o000OOO.OooO0o.class, oooO00o2);
        f13472OooO0OO = new o000OO00.OooO0OO("endMs", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // o000OO00.OooO00o
    public final void OooO00o(Object obj, Object obj2) {
        OooOo00.OooOO0O oooOO0O = (OooOo00.OooOO0O) obj;
        o000OO00.OooO oooO = (o000OO00.OooO) obj2;
        oooO.OooO0OO(f13471OooO0O0, oooOO0O.f13593OooO00o);
        oooO.OooO0OO(f13472OooO0OO, oooOO0O.f13594OooO0O0);
    }
}
