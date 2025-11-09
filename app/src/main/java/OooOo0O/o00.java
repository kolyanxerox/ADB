package OoooO0O;

import OooO0oO.OooOo;
import com.ironsource.C3034d9;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o00 extends o000O0O0 {

    /* renamed from: OooOo */
    public final transient Object f13900OooOo;

    public o00(Object obj) {
        this.f13900OooOo = obj;
    }

    @Override // OoooO0O.o000O00O
    public final int OooO0o0(Object[] objArr) {
        objArr[0] = this.f13900OooOo;
        return 1;
    }

    @Override // OoooO0O.o000O00O, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f13900OooOo.equals(obj);
    }

    @Override // OoooO0O.o000O0O0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13900OooOo.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new o000O(this.f13900OooOo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return OooOo.OooOO0O(C3034d9.i.f8177d, this.f13900OooOo.toString(), C3034d9.i.f8179e);
    }
}
