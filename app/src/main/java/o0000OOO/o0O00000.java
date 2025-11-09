package o0000Ooo;

/* loaded from: classes2.dex */
public final class o0O00000 extends o0O00o0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final transient o0O0000O f29540OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient o0O000 f29541OooOoO0;

    public o0O00000(o0O000 o0o000, o0O0000O o0o0000o) {
        this.f29541OooOoO0 = o0o000;
        this.f29540OooOoO = o0o0000o;
    }

    @Override // o0000Ooo.o0o0Oo
    public final int OooO0o0(Object[] objArr) {
        return this.f29540OooOoO.OooO0o0(objArr);
    }

    @Override // o0000Ooo.o0O00o0
    public final o00Oo00 OooOO0() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: OooOOO, reason: merged with bridge method [inline-methods] */
    public final o0O000Oo iterator() {
        return this.f29540OooOoO.listIterator(0);
    }

    @Override // o0000Ooo.o0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f29541OooOoO0.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f29541OooOoO0.f29539OooOoOO;
    }
}
