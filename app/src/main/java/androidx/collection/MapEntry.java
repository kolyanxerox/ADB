package androidx.collection;

import java.util.Map;
import o00O0OoO.OooO0OO;

/* loaded from: classes.dex */
final class MapEntry<K, V> implements Map.Entry<K, V>, OooO0OO {
    private final K key;
    private final V value;

    public MapEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
