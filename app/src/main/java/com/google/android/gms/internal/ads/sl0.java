package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class sl0 extends wl0 implements NavigableSet {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ dn0 f24109OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl0(dn0 dn0Var, NavigableMap navigableMap) {
        super(dn0Var, navigableMap);
        this.f24109OooOoO0 = dn0Var;
    }

    @Override // com.google.android.gms.internal.ads.wl0
    public final /* synthetic */ SortedMap OooO0Oo() {
        return (NavigableMap) ((SortedMap) this.f23641OooOo0O);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23641OooOo0O)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((ql0) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new sl0(this.f24109OooOoO0, ((NavigableMap) ((SortedMap) this.f23641OooOo0O)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23641OooOo0O)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.wl0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23641OooOo0O)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f23641OooOo0O)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        ol0 ol0Var = (ol0) iterator();
        if (!ol0Var.hasNext()) {
            return null;
        }
        Object next = ol0Var.next();
        ol0Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // com.google.android.gms.internal.ads.wl0, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.wl0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new sl0(this.f24109OooOoO0, ((NavigableMap) ((SortedMap) this.f23641OooOo0O)).headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new sl0(this.f24109OooOoO0, ((NavigableMap) ((SortedMap) this.f23641OooOo0O)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new sl0(this.f24109OooOoO0, ((NavigableMap) ((SortedMap) this.f23641OooOo0O)).tailMap(obj, z));
    }
}
