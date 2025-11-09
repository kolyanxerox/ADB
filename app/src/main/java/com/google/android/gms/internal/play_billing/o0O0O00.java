package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class o0O0O00 extends o000000 {

    /* renamed from: OooOo */
    public final transient o000000 f27095OooOo;

    public o0O0O00(o000000 o000000Var) {
        this.f27095OooOo = o000000Var;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final boolean OooOO0() {
        return this.f27095OooOo.OooOO0();
    }

    @Override // com.google.android.gms.internal.play_billing.o000000
    public final o000000 OooOO0o() {
        return this.f27095OooOo;
    }

    @Override // com.google.android.gms.internal.play_billing.o000000, java.util.List
    /* renamed from: OooOOO0 */
    public final o000000 subList(int i, int i2) {
        o000000 o000000Var = this.f27095OooOo;
        o0O000Oo.OooOo(i, i2, o000000Var.size());
        return o000000Var.subList(o000000Var.size() - i2, o000000Var.size() - i).OooOO0o();
    }

    @Override // com.google.android.gms.internal.play_billing.o000000, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f27095OooOo.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        o000000 o000000Var = this.f27095OooOo;
        o0O000Oo.OooO0oO(i, o000000Var.size());
        return o000000Var.get((o000000Var.size() - 1) - i);
    }

    @Override // com.google.android.gms.internal.play_billing.o000000, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f27095OooOo.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r0.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.o000000, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f27095OooOo.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r0.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27095OooOo.size();
    }
}
