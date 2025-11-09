package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class am0 extends AbstractCollection {

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f17053OooOo0O;

    /* renamed from: OooOo0o */
    public final Object f17054OooOo0o;

    public /* synthetic */ am0(Serializable serializable, int i) {
        this.f17053OooOo0O = i;
        this.f17054OooOo0o = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f17053OooOo0O) {
            case 0:
                ((dn0) this.f17054OooOo0o).OooO0O0();
                break;
            case 1:
                ((fm0) this.f17054OooOo0o).clear();
                break;
            default:
                ((pl0) this.f17054OooOo0o).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f17053OooOo0O) {
            case 0:
                Iterator it = ((pl0) ((dn0) this.f17054OooOo0o).OooO00o()).values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((pl0) this.f17054OooOo0o).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f17053OooOo0O) {
            case 2:
                return ((pl0) this.f17054OooOo0o).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f17053OooOo0O) {
            case 0:
                return new ml0((dn0) this.f17054OooOo0o);
            case 1:
                fm0 fm0Var = (fm0) this.f17054OooOo0o;
                Map mapOooO0o = fm0Var.OooO0o();
                return mapOooO0o != null ? mapOooO0o.values().iterator() : new cm0(fm0Var, 2);
            default:
                return new cn0(((pl0) this.f17054OooOo0o).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f17053OooOo0O) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    pl0 pl0Var = (pl0) this.f17054OooOo0o;
                    for (Map.Entry entry : pl0Var.entrySet()) {
                        if (ii0.OooOOoo(obj, entry.getValue())) {
                            pl0Var.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f17053OooOo0O) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    pl0 pl0Var = (pl0) this.f17054OooOo0o;
                    for (Map.Entry entry : pl0Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return pl0Var.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f17053OooOo0O) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    pl0 pl0Var = (pl0) this.f17054OooOo0o;
                    for (Map.Entry entry : pl0Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return pl0Var.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f17053OooOo0O) {
            case 0:
                return ((dn0) this.f17054OooOo0o).f18274OooOoO;
            case 1:
                return ((fm0) this.f17054OooOo0o).size();
            default:
                return ((pl0) this.f17054OooOo0o).f23368OooOo.size();
        }
    }

    public am0(pl0 pl0Var) {
        this.f17053OooOo0O = 2;
        this.f17054OooOo0o = pl0Var;
    }
}
