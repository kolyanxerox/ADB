package o0000Ooo;

import java.util.Map;

/* renamed from: o0000Ooo.o0 */
/* loaded from: classes2.dex */
public final class C4521o0 extends o0O00o0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final transient Object[] f29523OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient o0O000 f29524OooOoO0;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final transient int f29525OooOoOO;

    public C4521o0(o0O000 o0o000, Object[] objArr, int i) {
        this.f29524OooOoO0 = o0o000;
        this.f29523OooOoO = objArr;
        this.f29525OooOoOO = i;
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO0o0(Object[] objArr) {
        return OooOO0().OooO0o0(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: OooOOO, reason: merged with bridge method [inline-methods] */
    public final o0O000Oo iterator() {
        return OooOO0().listIterator(0);
    }

    @Override // o0000Ooo.o0O00o0
    public final o00Oo00 OooOOO0() {
        return new o0O0o(this);
    }

    @Override // o0000Ooo.o0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f29524OooOoO0.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29525OooOoOO;
    }
}
