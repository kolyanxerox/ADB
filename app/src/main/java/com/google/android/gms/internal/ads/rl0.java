package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class rl0 extends vl0 implements NavigableMap {

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ dn0 f23885OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl0(dn0 dn0Var, NavigableMap navigableMap) {
        super(dn0Var, navigableMap);
        this.f23885OooOoo0 = dn0Var;
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final /* synthetic */ SortedMap OooO0O0() {
        return (NavigableMap) ((SortedMap) this.f23368OooOo);
    }

    @Override // com.google.android.gms.internal.ads.vl0
    public final SortedSet OooO0OO() {
        return new sl0(this.f23885OooOoo0, (NavigableMap) ((SortedMap) this.f23368OooOo));
    }

    @Override // com.google.android.gms.internal.ads.vl0
    /* renamed from: OooO0Oo */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    public final nm0 OooO0o(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.f23885OooOoo0.f18276OooOoOO.mo13704zza();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new nm0(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f23368OooOo)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return OooO00o(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23368OooOo)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new rl0(this.f23885OooOoo0, ((NavigableMap) ((SortedMap) this.f23368OooOo)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f23368OooOo)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return OooO00o(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f23368OooOo)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return OooO00o(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23368OooOo)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.vl0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f23368OooOo)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return OooO00o(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23368OooOo)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.vl0, com.google.android.gms.internal.ads.pl0, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f23368OooOo)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return OooO00o(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f23368OooOo)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return OooO00o(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23368OooOo)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return OooO0o(((nl0) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return OooO0o(((nl0) ((pl0) descendingMap()).entrySet()).iterator());
    }

    @Override // com.google.android.gms.internal.ads.vl0, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.vl0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new rl0(this.f23885OooOoo0, ((NavigableMap) ((SortedMap) this.f23368OooOo)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new rl0(this.f23885OooOoo0, ((NavigableMap) ((SortedMap) this.f23368OooOo)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new rl0(this.f23885OooOoo0, ((NavigableMap) ((SortedMap) this.f23368OooOo)).tailMap(obj, z));
    }
}
