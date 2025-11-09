package OoooO0O;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000OO00 extends o000OO0O {

    /* renamed from: OooOoO, reason: collision with root package name */
    public static final o000OO00 f13971OooOoO = new o000OO00(0, new Object[0]);

    /* renamed from: OooOo, reason: collision with root package name */
    public final transient Object[] f13972OooOo;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient int f13973OooOoO0;

    public o000OO00(int i, Object[] objArr) {
        this.f13972OooOo = objArr;
        this.f13973OooOoO0 = i;
    }

    @Override // OoooO0O.o000O00O
    public final Object[] OooO() {
        return this.f13972OooOo;
    }

    @Override // OoooO0O.o000O00O
    public final int OooO0o() {
        return this.f13973OooOoO0;
    }

    @Override // OoooO0O.o000OO0O, OoooO0O.o000O00O
    public final int OooO0o0(Object[] objArr) {
        Object[] objArr2 = this.f13972OooOo;
        int i = this.f13973OooOoO0;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // OoooO0O.o000O00O
    public final int OooO0oO() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        o000Oo0.OooO0O0(i, this.f13973OooOoO0);
        Object obj = this.f13972OooOo[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13973OooOoO0;
    }
}
