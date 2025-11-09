package androidx.datastore.preferences.core;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;
import o00O0oOo.o0000O00;
import o00O0oOo.o000O0O0;
import o00OO00o.OooO;
import o00OO00o.OooO0o;

/* loaded from: classes.dex */
public final class Actual_jvmKt {
    public static final <T> Set<T> immutableCopyOfSet(Set<? extends T> set) {
        OooOo.OooO0o0(set, "set");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(OooOo00.Oooo0oo(set));
        OooOo.OooO0Oo(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> immutableMap(Map<K, ? extends V> map) {
        OooOo.OooO0o0(map, "map");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        OooOo.OooO0Oo(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public static final o0000O00 ioDispatcher() {
        OooO oooO = o000O0O0.f31514OooO00o;
        return OooO0o.f31999OooOo0O;
    }
}
