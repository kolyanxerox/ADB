package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zl0 implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (ii0.OooOOoo(getKey(), entry.getKey()) && ii0.OooOOoo(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return OooO0oO.OooOo.OooOoo(String.valueOf(getKey()), C3034d9.i.f8173b, String.valueOf(getValue()));
    }
}
