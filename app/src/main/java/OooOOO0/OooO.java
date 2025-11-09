package OooOOo0;

import java.util.Collections;
import java.util.HashMap;
import o000OOO.OooO00o;

/* loaded from: classes2.dex */
public final class OooO implements o000OO00.OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f13456OooO00o = new OooO();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13457OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13458OooO0OO;

    static {
        OooO00o oooO00o = new OooO00o(1);
        HashMap map = new HashMap();
        map.put(o000OOO.OooO0o.class, oooO00o);
        f13457OooO0O0 = new o000OO00.OooO0OO("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(map)));
        OooO00o oooO00o2 = new OooO00o(3);
        HashMap map2 = new HashMap();
        map2.put(o000OOO.OooO0o.class, oooO00o2);
        f13458OooO0OO = new o000OO00.OooO0OO("reason", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // o000OO00.OooO00o
    public final void OooO00o(Object obj, Object obj2) {
        OooOo00.OooO0o oooO0o = (OooOo00.OooO0o) obj;
        o000OO00.OooO oooO = (o000OO00.OooO) obj2;
        oooO.OooO0OO(f13457OooO0O0, oooO0o.f13589OooO00o);
        oooO.OooO0O0(f13458OooO0OO, oooO0o.f13590OooO0O0);
    }
}
