package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public class wl0 extends ql0 implements SortedSet {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ dn0 f25328OooOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl0(dn0 dn0Var, SortedMap sortedMap) {
        super(dn0Var, sortedMap);
        this.f25328OooOo = dn0Var;
    }

    public SortedMap OooO0Oo() {
        return (SortedMap) this.f23641OooOo0O;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return OooO0Oo().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return OooO0Oo().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new wl0(this.f25328OooOo, OooO0Oo().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return OooO0Oo().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new wl0(this.f25328OooOo, OooO0Oo().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new wl0(this.f25328OooOo, OooO0Oo().tailMap(obj));
    }
}
