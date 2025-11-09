package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class o0000Ooo extends o00000OO implements NavigableSet, o000OO0O {

    /* renamed from: OooOo */
    public final transient Comparator f26988OooOo;

    /* renamed from: OooOoO0 */
    public transient o0000Ooo f26989OooOoO0;

    public o0000Ooo(Comparator comparator) {
        this.f26988OooOo = comparator;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f26988OooOo;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        o0000Ooo o000o0 = this.f26989OooOoO0;
        if (o000o0 == null) {
            o000O0 o000o02 = (o000O0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(o000o02.f26988OooOo);
            if (!o000o02.isEmpty()) {
                o000o0 = new o000O0(o000o02.f26999OooOoO.OooOO0o(), comparatorReverseOrder);
            } else if (o0000O0.f26981OooOo0o.equals(comparatorReverseOrder)) {
                o000o0 = o000O0.f26998OooOoOO;
            } else {
                oo0o0Oo oo0o0oo = o000000.f26972OooOo0o;
                o000o0 = new o000O0(o0000OO0.f26985OooOoO, comparatorReverseOrder);
            }
            this.f26989OooOoO0 = o000o0;
            o000o0.f26989OooOoO0 = this;
        }
        return o000o0;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        o000O0 o000o0 = (o000O0) this;
        return o000o0.OooOOo0(0, o000o0.OooOOOO(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.f26988OooOo.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        o000O0 o000o0 = (o000O0) this;
        o000O0 o000o0OooOOo0 = o000o0.OooOOo0(o000o0.OooOOOo(obj, z), o000o0.f26999OooOoO.size());
        return o000o0OooOOo0.OooOOo0(0, o000o0OooOOo0.OooOOOO(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        o000O0 o000o0 = (o000O0) this;
        return o000o0.OooOOo0(o000o0.OooOOOo(obj, true), o000o0.f26999OooOoO.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        o000O0 o000o0 = (o000O0) this;
        return o000o0.OooOOo0(0, o000o0.OooOOOO(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        o000O0 o000o0 = (o000O0) this;
        return o000o0.OooOOo0(o000o0.OooOOOo(obj, z), o000o0.f26999OooOoO.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f26988OooOo.compare(obj, obj2) <= 0) {
            o000O0 o000o0 = (o000O0) this;
            o000O0 o000o0OooOOo0 = o000o0.OooOOo0(o000o0.OooOOOo(obj, true), o000o0.f26999OooOoO.size());
            return o000o0OooOOo0.OooOOo0(0, o000o0OooOOo0.OooOOOO(obj2, false));
        }
        throw new IllegalArgumentException();
    }
}
