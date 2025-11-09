package OooOOo0;

import java.util.Collections;
import java.util.HashMap;
import o000OOO.OooO00o;

/* loaded from: classes2.dex */
public final class OooOOO0 implements o000OO00.OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO0 f13473OooO00o = new OooOOO0();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13474OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13475OooO0OO;

    static {
        OooO00o oooO00o = new OooO00o(1);
        HashMap map = new HashMap();
        map.put(o000OOO.OooO0o.class, oooO00o);
        f13474OooO0O0 = new o000OO00.OooO0OO("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map)));
        OooO00o oooO00o2 = new OooO00o(2);
        HashMap map2 = new HashMap();
        map2.put(o000OOO.OooO0o.class, oooO00o2);
        f13475OooO0OO = new o000OO00.OooO0OO("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // o000OO00.OooO00o
    public final void OooO00o(Object obj, Object obj2) {
        OooOo00.OooOO0 oooOO0 = (OooOo00.OooOO0) obj;
        o000OO00.OooO oooO = (o000OO00.OooO) obj2;
        oooO.OooO0OO(f13474OooO0O0, oooOO0.f13591OooO00o);
        oooO.OooO0OO(f13475OooO0OO, oooOO0.f13592OooO0O0);
    }
}
