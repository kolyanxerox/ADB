package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public class pl0 extends AbstractMap {

    /* renamed from: OooOo, reason: collision with root package name */
    public final transient Map f23368OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public transient nl0 f23369OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public transient am0 f23370OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ dn0 f23371OooOoO0;

    public pl0(dn0 dn0Var, Map map) {
        this.f23371OooOoO0 = dn0Var;
        this.f23368OooOo = map;
    }

    public final nm0 OooO00o(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        dn0 dn0Var = this.f23371OooOoO0;
        List list = (List) collection;
        return new nm0(key, list instanceof RandomAccess ? new tl0(dn0Var, key, list, null) : new yl0(dn0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        dn0 dn0Var = this.f23371OooOoO0;
        if (this.f23368OooOo == dn0Var.f18275OooOoO0) {
            dn0Var.OooO0O0();
            return;
        }
        ol0 ol0Var = new ol0(this);
        while (ol0Var.hasNext()) {
            ol0Var.next();
            ol0Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f23368OooOo;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        nl0 nl0Var = this.f23369OooOo0O;
        if (nl0Var != null) {
            return nl0Var;
        }
        nl0 nl0Var2 = new nl0(this);
        this.f23369OooOo0O = nl0Var2;
        return nl0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f23368OooOo.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f23368OooOo;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        dn0 dn0Var = this.f23371OooOoO0;
        List list = (List) collection;
        return list instanceof RandomAccess ? new tl0(dn0Var, obj, list, null) : new yl0(dn0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f23368OooOo.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        dn0 dn0Var = this.f23371OooOoO0;
        ql0 ql0Var = dn0Var.f17522OooOo0O;
        if (ql0Var != null) {
            return ql0Var;
        }
        Map map = dn0Var.f18275OooOoO0;
        ql0 sl0Var = map instanceof NavigableMap ? new sl0(dn0Var, (NavigableMap) map) : map instanceof SortedMap ? new wl0(dn0Var, (SortedMap) map) : new ql0(dn0Var, map);
        dn0Var.f17522OooOo0O = sl0Var;
        return sl0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f23368OooOo.remove(obj);
        if (collection == null) {
            return null;
        }
        dn0 dn0Var = this.f23371OooOoO0;
        List list = (List) dn0Var.f18276OooOoOO.mo13704zza();
        list.addAll(collection);
        dn0Var.f18274OooOoO -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23368OooOo.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f23368OooOo.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        am0 am0Var = this.f23370OooOo0o;
        if (am0Var != null) {
            return am0Var;
        }
        am0 am0Var2 = new am0(this);
        this.f23370OooOo0o = am0Var2;
        return am0Var2;
    }
}
