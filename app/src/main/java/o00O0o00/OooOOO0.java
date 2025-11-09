package o00O0O00;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooOOO0 extends AbstractCollection implements Collection, o00O0OoO.OooO0OO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooOO0 f31354OooOo0O;

    public OooOOO0(OooOO0 oooOO0) {
        this.f31354OooOo0O = oooOO0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f31354OooOo0O.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f31354OooOo0O.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f31354OooOo0O.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        OooOO0 oooOO0 = this.f31354OooOo0O;
        oooOO0.getClass();
        return new OooO0o(oooOO0, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        OooOO0 oooOO0 = this.f31354OooOo0O;
        oooOO0.OooO0O0();
        int iOooOO0 = oooOO0.OooOO0(obj);
        if (iOooOO0 < 0) {
            return false;
        }
        oooOO0.OooOOO0(iOooOO0);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        this.f31354OooOo0O.OooO0O0();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection elements) {
        OooOo.OooO0o0(elements, "elements");
        this.f31354OooOo0O.OooO0O0();
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f31354OooOo0O.f31347OooOooO;
    }
}
