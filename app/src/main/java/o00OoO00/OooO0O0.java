package o00OoO00;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class OooO0O0 extends InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final Object childValue(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
