package o00O0O00;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooOO0O extends AbstractSet implements Set, o00O0OoO.OooO0OO {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31352OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final OooOO0 f31353OooOo0o;

    public /* synthetic */ OooOO0O(OooOO0 oooOO0, int i) {
        this.f31352OooOo0O = i;
        this.f31353OooOo0o = oooOO0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f31352OooOo0O) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                OooOo.OooO0o0(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f31352OooOo0O) {
            case 0:
                OooOo.OooO0o0(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                OooOo.OooO0o0(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f31352OooOo0O) {
            case 0:
                this.f31353OooOo0o.clear();
                break;
            default:
                this.f31353OooOo0o.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f31352OooOo0O) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                OooOo.OooO0o0(element, "element");
                return this.f31353OooOo0o.OooO0oO(element);
            default:
                return this.f31353OooOo0o.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f31352OooOo0O) {
            case 0:
                OooOo.OooO0o0(elements, "elements");
                return this.f31353OooOo0o.OooO0o(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f31352OooOo0O) {
        }
        return this.f31353OooOo0o.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f31352OooOo0O) {
            case 0:
                OooOO0 oooOO0 = this.f31353OooOo0o;
                oooOO0.getClass();
                return new OooO0o(oooOO0, 0);
            default:
                OooOO0 oooOO02 = this.f31353OooOo0o;
                oooOO02.getClass();
                return new OooO0o(oooOO02, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f31352OooOo0O) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    OooOo.OooO0o0(element, "element");
                    OooOO0 oooOO0 = this.f31353OooOo0o;
                    oooOO0.getClass();
                    oooOO0.OooO0O0();
                    int iOooO = oooOO0.OooO(element.getKey());
                    if (iOooO >= 0) {
                        Object[] objArr = oooOO0.f31341OooOo0o;
                        OooOo.OooO0O0(objArr);
                        if (OooOo.OooO00o(objArr[iOooO], element.getValue())) {
                            oooOO0.OooOOO0(iOooO);
                            break;
                        }
                    }
                }
                break;
            default:
                OooOO0 oooOO02 = this.f31353OooOo0o;
                oooOO02.OooO0O0();
                int iOooO2 = oooOO02.OooO(obj);
                if (iOooO2 >= 0) {
                    oooOO02.OooOOO0(iOooO2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f31352OooOo0O) {
            case 0:
                OooOo.OooO0o0(elements, "elements");
                this.f31353OooOo0o.OooO0O0();
                break;
            default:
                OooOo.OooO0o0(elements, "elements");
                this.f31353OooOo0o.OooO0O0();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f31352OooOo0O) {
            case 0:
                OooOo.OooO0o0(elements, "elements");
                this.f31353OooOo0o.OooO0O0();
                break;
            default:
                OooOo.OooO0o0(elements, "elements");
                this.f31353OooOo0o.OooO0O0();
                break;
        }
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f31352OooOo0O) {
        }
        return this.f31353OooOo0o.f31347OooOooO;
    }
}
