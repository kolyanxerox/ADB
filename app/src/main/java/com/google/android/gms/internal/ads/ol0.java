package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ol0 implements Iterator {

    /* renamed from: OooOo */
    public Object f23004OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f23005OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final Iterator f23006OooOo0o;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f23007OooOoO0;

    public ol0(ql0 ql0Var, Iterator it) {
        this.f23006OooOo0o = it;
        this.f23007OooOoO0 = ql0Var;
    }

    public void OooO00o() {
        yl0 yl0Var = (yl0) this.f23007OooOoO0;
        yl0Var.OooO0o0();
        if (yl0Var.f25937OooOo0o != ((Collection) this.f23004OooOo)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f23005OooOo0O) {
            case 0:
                break;
            case 1:
                break;
            default:
                OooO00o();
                break;
        }
        return this.f23006OooOo0o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f23005OooOo0O) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f23006OooOo0o.next();
                this.f23004OooOo = (Collection) entry.getValue();
                return ((pl0) this.f23007OooOoO0).OooO00o(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f23006OooOo0o.next();
                this.f23004OooOo = entry2;
                return entry2.getKey();
            default:
                OooO00o();
                return this.f23006OooOo0o.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f23005OooOo0O) {
            case 0:
                ii0.o0OoOo0("no calls to next() since the last call to remove()", ((Collection) this.f23004OooOo) != null);
                this.f23006OooOo0o.remove();
                ((pl0) this.f23007OooOoO0).f23371OooOoO0.f18274OooOoO -= ((Collection) this.f23004OooOo).size();
                ((Collection) this.f23004OooOo).clear();
                this.f23004OooOo = null;
                break;
            case 1:
                ii0.o0OoOo0("no calls to next() since the last call to remove()", ((Map.Entry) this.f23004OooOo) != null);
                Collection collection = (Collection) ((Map.Entry) this.f23004OooOo).getValue();
                this.f23006OooOo0o.remove();
                ((ql0) this.f23007OooOoO0).f23642OooOo0o.f18274OooOoO -= collection.size();
                collection.clear();
                this.f23004OooOo = null;
                break;
            default:
                this.f23006OooOo0o.remove();
                yl0 yl0Var = (yl0) this.f23007OooOoO0;
                dn0 dn0Var = yl0Var.f25938OooOoO;
                dn0Var.f18274OooOoO--;
                yl0Var.OooO0o();
                break;
        }
    }

    public ol0(yl0 yl0Var, ListIterator listIterator) {
        this.f23007OooOoO0 = yl0Var;
        this.f23004OooOo = yl0Var.f25937OooOo0o;
        this.f23006OooOo0o = listIterator;
    }

    public ol0(pl0 pl0Var) {
        this.f23007OooOoO0 = pl0Var;
        this.f23006OooOo0o = pl0Var.f23368OooOo.entrySet().iterator();
    }

    public ol0(yl0 yl0Var) {
        Iterator it;
        this.f23007OooOoO0 = yl0Var;
        Collection collection = yl0Var.f25937OooOo0o;
        this.f23004OooOo = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f23006OooOo0o = it;
    }
}
