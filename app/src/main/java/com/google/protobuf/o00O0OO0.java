package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o00O0OO0 implements Map.Entry {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Map.Entry f28266OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f28267OooOo0o;

    public o00O0OO0(Internal.MapAdapter mapAdapter, Map.Entry entry) {
        this.f28267OooOo0o = mapAdapter;
        this.f28266OooOo0O = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && this.f28266OooOo0O.getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28266OooOo0O.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f28267OooOo0o.valueConverter.doForward(this.f28266OooOo0O.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f28266OooOo0O.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Internal.MapAdapter mapAdapter = this.f28267OooOo0o;
        Object value = this.f28266OooOo0O.setValue(mapAdapter.valueConverter.doBackward(obj));
        if (value == null) {
            return null;
        }
        return mapAdapter.valueConverter.doForward(value);
    }
}
