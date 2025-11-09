package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class rn0 extends qn0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f23666OooOo0O).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f23666OooOo0O.iterator();
        it.getClass();
        zk0 zk0Var = this.f23667OooOo0o;
        zk0Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (zk0Var.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new rn0(((SortedSet) this.f23666OooOo0O).headSet(obj), this.f23667OooOo0o);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f23666OooOo0O;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f23667OooOo0o.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new rn0(((SortedSet) this.f23666OooOo0O).subSet(obj, obj2), this.f23667OooOo0o);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new rn0(((SortedSet) this.f23666OooOo0O).tailSet(obj), this.f23667OooOo0o);
    }
}
