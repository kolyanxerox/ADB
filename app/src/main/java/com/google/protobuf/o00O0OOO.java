package com.google.protobuf;

import java.util.Map;

/* loaded from: classes2.dex */
public final class o00O0OOO implements Map.Entry {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public Map.Entry f28268OooOo0O;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28268OooOo0O.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.f28268OooOo0O.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return ((LazyField) this.f28268OooOo0O.getValue()).setValue((MessageLite) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
