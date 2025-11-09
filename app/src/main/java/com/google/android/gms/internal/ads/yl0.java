package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class yl0 extends AbstractCollection implements List {

    /* renamed from: OooOo, reason: collision with root package name */
    public final yl0 f25935OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f25936OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public Collection f25937OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ dn0 f25938OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final Collection f25939OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ dn0 f25940OooOoOO;

    public yl0(dn0 dn0Var, Object obj, List list, yl0 yl0Var) {
        this.f25940OooOoOO = dn0Var;
        this.f25938OooOoO = dn0Var;
        this.f25936OooOo0O = obj;
        this.f25937OooOo0o = list;
        this.f25935OooOo = yl0Var;
        this.f25939OooOoO0 = yl0Var == null ? null : yl0Var.f25937OooOo0o;
    }

    public final void OooO0Oo() {
        yl0 yl0Var = this.f25935OooOo;
        if (yl0Var != null) {
            yl0Var.OooO0Oo();
            return;
        }
        this.f25938OooOoO.f18275OooOoO0.put(this.f25936OooOo0O, this.f25937OooOo0o);
    }

    public final void OooO0o() {
        yl0 yl0Var = this.f25935OooOo;
        if (yl0Var != null) {
            yl0Var.OooO0o();
        } else if (this.f25937OooOo0o.isEmpty()) {
            this.f25938OooOoO.f18275OooOoO0.remove(this.f25936OooOo0O);
        }
    }

    public final void OooO0o0() {
        Collection collection;
        yl0 yl0Var = this.f25935OooOo;
        if (yl0Var != null) {
            yl0Var.OooO0o0();
            if (yl0Var.f25937OooOo0o != this.f25939OooOoO0) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f25937OooOo0o.isEmpty() || (collection = (Collection) this.f25938OooOoO.f18275OooOoO0.get(this.f25936OooOo0O)) == null) {
                return;
            }
            this.f25937OooOo0o = collection;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        OooO0o0();
        boolean zIsEmpty = this.f25937OooOo0o.isEmpty();
        ((List) this.f25937OooOo0o).add(i, obj);
        this.f25940OooOoOO.f18274OooOoO++;
        if (zIsEmpty) {
            OooO0Oo();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f25937OooOo0o).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f25940OooOoOO.f18274OooOoO += this.f25937OooOo0o.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        OooO0Oo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f25937OooOo0o.clear();
        this.f25938OooOoO.f18274OooOoO -= size;
        OooO0o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        OooO0o0();
        return this.f25937OooOo0o.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        OooO0o0();
        return this.f25937OooOo0o.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        OooO0o0();
        return this.f25937OooOo0o.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        OooO0o0();
        return ((List) this.f25937OooOo0o).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        OooO0o0();
        return this.f25937OooOo0o.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        OooO0o0();
        return ((List) this.f25937OooOo0o).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        OooO0o0();
        return new ol0(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        OooO0o0();
        return ((List) this.f25937OooOo0o).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        OooO0o0();
        return new xl0(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        OooO0o0();
        Object objRemove = ((List) this.f25937OooOo0o).remove(i);
        dn0 dn0Var = this.f25940OooOoOO;
        dn0Var.f18274OooOoO--;
        OooO0o();
        return objRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f25937OooOo0o.removeAll(collection);
        if (zRemoveAll) {
            this.f25938OooOoO.f18274OooOoO += this.f25937OooOo0o.size() - size;
            OooO0o();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f25937OooOo0o.retainAll(collection);
        if (zRetainAll) {
            this.f25938OooOoO.f18274OooOoO += this.f25937OooOo0o.size() - size;
            OooO0o();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        OooO0o0();
        return ((List) this.f25937OooOo0o).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        OooO0o0();
        return this.f25937OooOo0o.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        OooO0o0();
        List listSubList = ((List) this.f25937OooOo0o).subList(i, i2);
        yl0 yl0Var = this.f25935OooOo;
        if (yl0Var == null) {
            yl0Var = this;
        }
        dn0 dn0Var = this.f25940OooOoOO;
        dn0Var.getClass();
        boolean z = listSubList instanceof RandomAccess;
        Object obj = this.f25936OooOo0O;
        return z ? new tl0(dn0Var, obj, listSubList, yl0Var) : new yl0(dn0Var, obj, listSubList, yl0Var);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        OooO0o0();
        return this.f25937OooOo0o.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        OooO0o0();
        return new xl0(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooO0o0();
        boolean zRemove = this.f25937OooOo0o.remove(obj);
        if (zRemove) {
            dn0 dn0Var = this.f25938OooOoO;
            dn0Var.f18274OooOoO--;
            OooO0o();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO0o0();
        boolean zIsEmpty = this.f25937OooOo0o.isEmpty();
        boolean zAdd = this.f25937OooOo0o.add(obj);
        if (zAdd) {
            this.f25938OooOoO.f18274OooOoO++;
            if (zIsEmpty) {
                OooO0Oo();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f25937OooOo0o.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f25938OooOoO.f18274OooOoO += this.f25937OooOo0o.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        OooO0Oo();
        return true;
    }
}
