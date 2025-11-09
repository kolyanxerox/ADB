package OoooO0O;

/* loaded from: classes2.dex */
public final class o000O0Oo extends o000OO0O {

    /* renamed from: OooOo, reason: collision with root package name */
    public final transient int f13964OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o000OO0O f13965OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient int f13966OooOoO0;

    public o000O0Oo(o000OO0O o000oo0o, int i, int i2) {
        this.f13965OooOoO = o000oo0o;
        this.f13964OooOo = i;
        this.f13966OooOoO0 = i2;
    }

    @Override // OoooO0O.o000O00O
    public final Object[] OooO() {
        return this.f13965OooOoO.OooO();
    }

    @Override // OoooO0O.o000O00O
    public final int OooO0o() {
        return this.f13965OooOoO.OooO0oO() + this.f13964OooOo + this.f13966OooOoO0;
    }

    @Override // OoooO0O.o000O00O
    public final int OooO0oO() {
        return this.f13965OooOoO.OooO0oO() + this.f13964OooOo;
    }

    @Override // OoooO0O.o000OO0O, java.util.List
    /* renamed from: OooOO0 */
    public final o000OO0O subList(int i, int i2) {
        o000Oo0.OooO0o0(i, i2, this.f13966OooOoO0);
        int i3 = this.f13964OooOo;
        return this.f13965OooOoO.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        o000Oo0.OooO0O0(i, this.f13966OooOoO0);
        return this.f13965OooOoO.get(i + this.f13964OooOo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13966OooOoO0;
    }
}
