package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public class qn0 extends AbstractCollection implements Set {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Set f23666OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final zk0 f23667OooOo0o;

    public qn0(Set set, zk0 zk0Var) {
        this.f23666OooOo0O = set;
        this.f23667OooOo0o = zk0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ii0.OoooOo0(this.f23667OooOo0o.zza(obj));
        return this.f23666OooOo0O.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ii0.OoooOo0(this.f23667OooOo0o.zza(it.next()));
        }
        return this.f23666OooOo0O.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f23666OooOo0O;
        boolean z = set instanceof RandomAccess;
        zk0 zk0Var = this.f23667OooOo0o;
        if (!z || !(set instanceof List)) {
            Iterator it = set.iterator();
            zk0Var.getClass();
            while (it.hasNext()) {
                if (zk0Var.zza(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        zk0Var.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!zk0Var.zza(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        xh0.OoooO0O(list, zk0Var, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        xh0.OoooO0O(list, zk0Var, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f23666OooOo0O;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f23667OooOo0o.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return xh0.OoooOOo(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return xh0.OooO0o(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f23666OooOo0O.iterator();
        zk0 zk0Var = this.f23667OooOo0o;
        ii0.Oooo0oo(zk0Var, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (zk0Var.zza(it.next())) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f23666OooOo0O.iterator();
        it.getClass();
        zk0 zk0Var = this.f23667OooOo0o;
        zk0Var.getClass();
        return new vm0(it, zk0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f23666OooOo0O.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f23666OooOo0O.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f23667OooOo0o.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f23666OooOo0O.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f23667OooOo0o.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f23666OooOo0O.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f23667OooOo0o.zza(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        vm0 vm0Var = (vm0) it;
        while (vm0Var.hasNext()) {
            arrayList.add(vm0Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        vm0 vm0Var = (vm0) it;
        while (vm0Var.hasNext()) {
            arrayList.add(vm0Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
