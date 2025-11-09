package OooOOo0;

import java.util.Collections;
import java.util.HashMap;
import o000OOO.OooO00o;

/* loaded from: classes2.dex */
public final class OooOO0 implements o000OO00.OooO0o {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0 f13466OooO00o = new OooOO0();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13467OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public static final o000OO00.OooO0OO f13468OooO0OO;

    static {
        OooO00o oooO00o = new OooO00o(1);
        HashMap map = new HashMap();
        map.put(o000OOO.OooO0o.class, oooO00o);
        f13467OooO0O0 = new o000OO00.OooO0OO("logSource", Collections.unmodifiableMap(new HashMap(map)));
        OooO00o oooO00o2 = new OooO00o(2);
        HashMap map2 = new HashMap();
        map2.put(o000OOO.OooO0o.class, oooO00o2);
        f13468OooO0OO = new o000OO00.OooO0OO("logEventDropped", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // o000OO00.OooO00o
    public final void OooO00o(Object obj, Object obj2) {
        OooOo00.OooO oooO = (OooOo00.OooO) obj;
        o000OO00.OooO oooO2 = (o000OO00.OooO) obj2;
        oooO2.OooO0O0(f13467OooO0O0, oooO.f13572OooO00o);
        oooO2.OooO0O0(f13468OooO0OO, oooO.f13573OooO0O0);
    }
}
