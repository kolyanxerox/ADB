package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class qm0 extends rm0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final transient int f23651OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ rm0 f23652OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient int f23653OooOoO0;

    public qm0(rm0 rm0Var, int i, int i2) {
        this.f23652OooOoO = rm0Var;
        this.f23651OooOo = i;
        this.f23653OooOoO0 = i2;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0o() {
        return this.f23652OooOoO.OooO0oO() + this.f23651OooOo + this.f23653OooOoO0;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0oO() {
        return this.f23652OooOoO.OooO0oO() + this.f23651OooOo;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final boolean OooOO0O() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final Object[] OooOO0o() {
        return this.f23652OooOoO.OooOO0o();
    }

    @Override // com.google.android.gms.internal.ads.rm0, java.util.List
    /* renamed from: OooOOO0 */
    public final rm0 subList(int i, int i2) {
        ii0.OoooooO(i, i2, this.f23653OooOoO0);
        int i3 = this.f23651OooOo;
        return this.f23652OooOoO.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        ii0.OooOO0O(i, this.f23653OooOoO0);
        return this.f23652OooOoO.get(i + this.f23651OooOo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23653OooOoO0;
    }
}
