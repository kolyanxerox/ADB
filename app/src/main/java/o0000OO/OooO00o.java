package o0000OO;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class OooO00o {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f29381OooO0O0 = new OooO00o(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: OooO00o, reason: collision with root package name */
    public final Map f29382OooO00o;

    public OooO00o(Map map) {
        this.f29382OooO00o = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooO00o) {
            return this.f29382OooO00o.equals(((OooO00o) obj).f29382OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29382OooO00o.hashCode();
    }

    public final String toString() {
        return this.f29382OooO00o.toString();
    }
}
