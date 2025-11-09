package com.google.protobuf;

import com.ironsource.C3034d9;
import java.util.Map;

/* loaded from: classes2.dex */
public final class oo0OOoo implements Map.Entry, Comparable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0O0O0Oo f28438OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Comparable f28439OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Object f28440OooOo0o;

    public oo0OOoo(o0O0O0Oo o0o0o0oo, Comparable comparable, Object obj) {
        this.f28438OooOo = o0o0o0oo;
        this.f28439OooOo0O = comparable;
        this.f28440OooOo0o = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f28439OooOo0O.compareTo(((oo0OOoo) obj).f28439OooOo0O);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f28439OooOo0O;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f28440OooOo0o;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28439OooOo0O;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f28440OooOo0o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f28439OooOo0O;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f28440OooOo0o;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f28438OooOo.OooO0O0();
        Object obj2 = this.f28440OooOo0o;
        this.f28440OooOo0o = obj;
        return obj2;
    }

    public final String toString() {
        return this.f28439OooOo0O + C3034d9.i.f8173b + this.f28440OooOo0o;
    }
}
