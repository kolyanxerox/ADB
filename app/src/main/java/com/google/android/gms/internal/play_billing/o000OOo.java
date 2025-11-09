package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o000OOo extends o000000 {

    /* renamed from: OooOo */
    public final transient int f27025OooOo;

    /* renamed from: OooOoO */
    public final /* synthetic */ o000000 f27026OooOoO;

    /* renamed from: OooOoO0 */
    public final transient int f27027OooOoO0;

    public o000OOo(o000000 o000000Var, int i, int i2) {
        this.f27026OooOoO = o000000Var;
        this.f27025OooOo = i;
        this.f27027OooOoO0 = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o() {
        return this.f27026OooOoO.OooO0oO() + this.f27025OooOo + this.f27027OooOoO0;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0oO() {
        return this.f27026OooOoO.OooO0oO() + this.f27025OooOo;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final boolean OooOO0() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final Object[] OooOO0O() {
        return this.f27026OooOoO.OooOO0O();
    }

    @Override // com.google.android.gms.internal.play_billing.o000000, java.util.List
    /* renamed from: OooOOO0 */
    public final o000000 subList(int i, int i2) {
        o0O000Oo.OooOo(i, i2, this.f27027OooOoO0);
        int i3 = this.f27025OooOo;
        return this.f27026OooOoO.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        o0O000Oo.OooO0oO(i, this.f27027OooOoO0);
        return this.f27026OooOoO.get(i + this.f27025OooOo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27027OooOoO0;
    }
}
