package com.google.protobuf.kotlin;

import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0OoO.OooO0OO;

/* loaded from: classes2.dex */
public final class UnmodifiableMapEntry<K, V> implements Map.Entry<K, V>, OooO0OO {
    private final /* synthetic */ Map.Entry<K, V> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntry(Map.Entry<? extends K, ? extends V> delegate) {
        OooOo.OooO0o0(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.$$delegate_0.getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
