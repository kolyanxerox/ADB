package OooOOo0;

import java.util.Collections;
import java.util.HashMap;
import o000OOO.OooO00o;

/* loaded from: classes2.dex */
public final class OooO0OO implements o000OO00.OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO f13459OooO00o = new OooO0OO();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13460OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13461OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13462OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13463OooO0o0;

    static {
        OooO00o oooO00o = new OooO00o(1);
        HashMap map = new HashMap();
        map.put(o000OOO.OooO0o.class, oooO00o);
        f13460OooO0O0 = new o000OO00.OooO0OO("window", Collections.unmodifiableMap(new HashMap(map)));
        OooO00o oooO00o2 = new OooO00o(2);
        HashMap map2 = new HashMap();
        map2.put(o000OOO.OooO0o.class, oooO00o2);
        f13461OooO0OO = new o000OO00.OooO0OO("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        OooO00o oooO00o3 = new OooO00o(3);
        HashMap map3 = new HashMap();
        map3.put(o000OOO.OooO0o.class, oooO00o3);
        f13462OooO0Oo = new o000OO00.OooO0OO("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        OooO00o oooO00o4 = new OooO00o(4);
        HashMap map4 = new HashMap();
        map4.put(o000OOO.OooO0o.class, oooO00o4);
        f13463OooO0o0 = new o000OO00.OooO0OO("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // o000OO00.OooO00o
    public final void OooO00o(Object obj, Object obj2) {
        OooOo00.OooO00o oooO00o = (OooOo00.OooO00o) obj;
        o000OO00.OooO oooO = (o000OO00.OooO) obj2;
        oooO.OooO0O0(f13460OooO0O0, oooO00o.f13575OooO00o);
        oooO.OooO0O0(f13461OooO0OO, oooO00o.f13576OooO0O0);
        oooO.OooO0O0(f13462OooO0Oo, oooO00o.f13577OooO0OO);
        oooO.OooO0O0(f13463OooO0o0, oooO00o.f13578OooO0Oo);
    }
}
