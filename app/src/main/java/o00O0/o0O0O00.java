package o00O0;

import com.google.android.gms.internal.measurement.o0OOO0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class o0O0O00 extends o0OOO0 {
    public static o00O0O00.OooOO0 OooOO0o(Map builder) {
        kotlin.jvm.internal.OooOo.OooO0o0(builder, "builder");
        o00O0O00.OooOO0 oooOO0 = (o00O0O00.OooOO0) builder;
        oooOO0.OooO0O0();
        oooOO0.f31351Oooo00o = true;
        if (oooOO0.f31347OooOooO > 0) {
            return oooOO0;
        }
        o00O0O00.OooOO0 oooOO02 = o00O0O00.OooOO0.f31338Oooo0;
        kotlin.jvm.internal.OooOo.OooO0OO(oooOO02, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return oooOO02;
    }

    public static Object OooOOO(Object obj, Map map) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<this>");
        if (map instanceof oo0o0Oo) {
            return ((oo0o0Oo) map).OooO0o0();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static o00O0O00.OooOO0 OooOOO0() {
        return new o00O0O00.OooOO0(8);
    }

    public static int OooOOOO(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map OooOOOo(oo00o.OooOO0 pair) {
        kotlin.jvm.internal.OooOo.OooO0o0(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f33185OooOo0O, pair.f33186OooOo0o);
        kotlin.jvm.internal.OooOo.OooO0Oo(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap OooOOo(oo00o.OooOO0... oooOO0Arr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(OooOOOO(oooOO0Arr.length));
        OooOo0O(linkedHashMap, oooOO0Arr);
        return linkedHashMap;
    }

    public static Map OooOOo0(oo00o.OooOO0... oooOO0Arr) {
        if (oooOO0Arr.length <= 0) {
            return o00oO0o.f31247OooOo0O;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(OooOOOO(oooOO0Arr.length));
        OooOo0O(linkedHashMap, oooOO0Arr);
        return linkedHashMap;
    }

    public static final Map OooOOoo(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? linkedHashMap : OooOoO(linkedHashMap) : o00oO0o.f31247OooOo0O;
    }

    public static Map OooOo(Map map) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? OooOoO0(map) : OooOoO(map) : o00oO0o.f31247OooOo0O;
    }

    public static Map OooOo0(Map map, oo00o.OooOO0 oooOO0) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<this>");
        if (map.isEmpty()) {
            return OooOOOo(oooOO0);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(oooOO0.f33185OooOo0O, oooOO0.f33186OooOo0o);
        return linkedHashMap;
    }

    public static LinkedHashMap OooOo00(Map map, Map map2) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void OooOo0O(HashMap map, oo00o.OooOO0[] oooOO0Arr) {
        for (oo00o.OooOO0 oooOO0 : oooOO0Arr) {
            map.put(oooOO0.f33185OooOo0O, oooOO0.f33186OooOo0o);
        }
    }

    public static Map OooOo0o(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return o00oO0o.f31247OooOo0O;
        }
        if (size == 1) {
            return OooOOOo((oo00o.OooOO0) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(OooOOOO(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            oo00o.OooOO0 oooOO0 = (oo00o.OooOO0) obj;
            linkedHashMap.put(oooOO0.f33185OooOo0O, oooOO0.f33186OooOo0o);
        }
        return linkedHashMap;
    }

    public static final Map OooOoO(Map map) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.OooOo.OooO0Oo(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap OooOoO0(Map map) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<this>");
        return new LinkedHashMap(map);
    }
}
