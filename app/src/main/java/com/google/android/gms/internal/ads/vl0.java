package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class vl0 extends pl0 implements SortedMap {

    /* renamed from: OooOoO, reason: collision with root package name */
    public SortedSet f24994OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ dn0 f24995OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl0(dn0 dn0Var, SortedMap sortedMap) {
        super(dn0Var, sortedMap);
        this.f24995OooOoOO = dn0Var;
    }

    public SortedMap OooO0O0() {
        return (SortedMap) this.f23368OooOo;
    }

    public SortedSet OooO0OO() {
        return new wl0(this.f24995OooOoOO, OooO0O0());
    }

    @Override // com.google.android.gms.internal.ads.pl0, java.util.AbstractMap, java.util.Map
    /* renamed from: OooO0Oo, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f24994OooOoO;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetOooO0OO = OooO0OO();
        this.f24994OooOoO = sortedSetOooO0OO;
        return sortedSetOooO0OO;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return OooO0O0().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return OooO0O0().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new vl0(this.f24995OooOoOO, OooO0O0().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return OooO0O0().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new vl0(this.f24995OooOoOO, OooO0O0().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new vl0(this.f24995OooOoOO, OooO0O0().tailMap(obj));
    }
}
