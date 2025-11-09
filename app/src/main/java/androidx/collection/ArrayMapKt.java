package androidx.collection;

import kotlin.jvm.internal.OooOo;
import oo00o.OooOO0;

/* loaded from: classes.dex */
public final class ArrayMapKt {
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> ArrayMap<K, V> arrayMapOf(OooOO0... pairs) {
        OooOo.OooO0o0(pairs, "pairs");
        ArrayMap<K, V> arrayMap = (ArrayMap<K, V>) new ArrayMap(pairs.length);
        for (OooOO0 oooOO0 : pairs) {
            arrayMap.put(oooOO0.f33185OooOo0O, oooOO0.f33186OooOo0o);
        }
        return arrayMap;
    }
}
