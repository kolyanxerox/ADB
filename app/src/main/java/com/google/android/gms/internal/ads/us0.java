package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class us0 extends xh0 implements Map {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Map f24782OooOo;

    public us0(Map map) {
        super(8);
        this.f24782OooOo = map;
    }

    @Override // com.google.android.gms.internal.ads.xh0
    public final /* synthetic */ Object OooOO0o() {
        return this.f24782OooOo;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f24782OooOo.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f24782OooOo.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((qn0) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return xh0.Oooo0oo(this.f24782OooOo.entrySet(), new fs0(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && xh0.Oooo0oO(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f24782OooOo.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return xh0.OooO0o(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f24782OooOo;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return xh0.Oooo0oo(this.f24782OooOo.keySet(), new fs0(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f24782OooOo.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f24782OooOo.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f24782OooOo.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f24782OooOo;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f24782OooOo.values();
    }
}
