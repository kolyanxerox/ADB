package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o000O0 extends o0000Ooo {

    /* renamed from: OooOoOO, reason: collision with root package name */
    public static final o000O0 f26998OooOoOO;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final transient o000000 f26999OooOoO;

    static {
        oo0o0Oo oo0o0oo = o000000.f26972OooOo0o;
        f26998OooOoOO = new o000O0(o0000OO0.f26985OooOoO, o0000O0.f26981OooOo0o);
    }

    public o000O0(o000000 o000000Var, Comparator comparator) {
        super(comparator);
        this.f26999OooOoO = o000000Var;
    }

    @Override // com.google.android.gms.internal.play_billing.o00000OO, com.google.android.gms.internal.play_billing.o0Oo0oo
    public final o000000 OooO() {
        return this.f26999OooOoO;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o() {
        return this.f26999OooOoO.OooO0o();
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o0(Object[] objArr) {
        return this.f26999OooOoO.OooO0o0(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0oO() {
        return this.f26999OooOoO.OooO0oO();
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final Object[] OooOO0O() {
        return this.f26999OooOoO.OooOO0O();
    }

    public final int OooOOOO(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f26999OooOoO, obj, this.f26988OooOo);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int OooOOOo(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f26999OooOoO, obj, this.f26988OooOo);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    public final o000O0 OooOOo0(int i, int i2) {
        o000000 o000000Var = this.f26999OooOoO;
        if (i == 0) {
            if (i2 == o000000Var.size()) {
                return this;
            }
            i = 0;
        }
        Comparator comparator = this.f26988OooOo;
        if (i < i2) {
            return new o000O0(o000000Var.subList(i, i2), comparator);
        }
        if (o0000O0.f26981OooOo0o.equals(comparator)) {
            return f26998OooOoOO;
        }
        oo0o0Oo oo0o0oo = o000000.f26972OooOo0o;
        return new o000O0(o0000OO0.f26985OooOoO, comparator);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iOooOOOo = OooOOOo(obj, true);
        o000000 o000000Var = this.f26999OooOoO;
        if (iOooOOOo == o000000Var.size()) {
            return null;
        }
        return o000000Var.get(iOooOOOo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f26999OooOoO, obj, this.f26988OooOo) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.f26988OooOo;
        if (!o0O000Oo.OooOO0(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        oo0o0Oo oo0o0ooListIterator = this.f26999OooOoO.listIterator(0);
        Iterator it = collection.iterator();
        if (oo0o0ooListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = oo0o0ooListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!oo0o0ooListIterator.hasNext()) {
                            break;
                        }
                        next2 = oo0o0ooListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f26999OooOoO.OooOO0o().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.o00000OO, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            o000000 o000000Var = this.f26999OooOoO;
            if (o000000Var.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f26988OooOo;
                if (!o0O000Oo.OooOO0(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    oo0o0Oo oo0o0ooListIterator = o000000Var.listIterator(0);
                    while (oo0o0ooListIterator.hasNext()) {
                        Object next = oo0o0ooListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o0000Ooo, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f26999OooOoO.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iOooOOOO = OooOOOO(obj, true) - 1;
        if (iOooOOOO == -1) {
            return null;
        }
        return this.f26999OooOoO.get(iOooOOOO);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iOooOOOo = OooOOOo(obj, false);
        o000000 o000000Var = this.f26999OooOoO;
        if (iOooOOOo == o000000Var.size()) {
            return null;
        }
        return o000000Var.get(iOooOOOo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f26999OooOoO.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.o0000Ooo, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f26999OooOoO.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iOooOOOO = OooOOOO(obj, false) - 1;
        if (iOooOOOO == -1) {
            return null;
        }
        return this.f26999OooOoO.get(iOooOOOO);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26999OooOoO.size();
    }
}
