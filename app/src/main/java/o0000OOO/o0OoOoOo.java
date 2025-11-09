package o0000Ooo;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o0OoOoOo extends o0O00o0 {

    /* renamed from: OooOoO0 */
    public final transient Object f29555OooOoO0;

    public o0OoOoOo(Object obj) {
        this.f29555OooOoO0 = obj;
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO0o0(Object[] objArr) {
        objArr[0] = this.f29555OooOoO0;
        return 1;
    }

    @Override // o0000Ooo.o0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29555OooOoO0.equals(obj);
    }

    @Override // o0000Ooo.o0O00o0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f29555OooOoO0.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new oo00oO(this.f29555OooOoO0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f29555OooOoO0.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
