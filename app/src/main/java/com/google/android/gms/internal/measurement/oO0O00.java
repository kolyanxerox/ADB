package com.google.android.gms.internal.measurement;

import com.ironsource.C3034d9;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oO0O00 implements Map.Entry, Comparable {

    /* renamed from: OooOo */
    public final /* synthetic */ oO0O000o f26720OooOo;

    /* renamed from: OooOo0O */
    public final Comparable f26721OooOo0O;

    /* renamed from: OooOo0o */
    public Object f26722OooOo0o;

    public oO0O00(oO0O000o oo0o000o, Comparable comparable, Object obj) {
        Objects.requireNonNull(oo0o000o);
        this.f26720OooOo = oo0o000o;
        this.f26721OooOo0O = comparable;
        this.f26722OooOo0o = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f26721OooOo0O.compareTo(((oO0O00) obj).f26721OooOo0O);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f26721OooOo0O;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f26722OooOo0o;
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
    public final /* synthetic */ Object getKey() {
        return this.f26721OooOo0O;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f26722OooOo0o;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f26721OooOo0O;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f26722OooOo0o;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f26720OooOo.OooO0oO();
        Object obj2 = this.f26722OooOo0o;
        this.f26722OooOo0o = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f26721OooOo0O);
        String strValueOf2 = String.valueOf(this.f26722OooOo0o);
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, C3034d9.i.f8173b, strValueOf2);
    }
}
