package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0000OO0 extends o000000 {

    /* renamed from: OooOoO */
    public static final o0000OO0 f26985OooOoO = new o0000OO0(0, new Object[0]);

    /* renamed from: OooOo */
    public final transient Object[] f26986OooOo;

    /* renamed from: OooOoO0 */
    public final transient int f26987OooOoO0;

    public o0000OO0(int i, Object[] objArr) {
        this.f26986OooOo = objArr;
        this.f26987OooOoO0 = i;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o() {
        return this.f26987OooOoO0;
    }

    @Override // com.google.android.gms.internal.play_billing.o000000, com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o0(Object[] objArr) {
        Object[] objArr2 = this.f26986OooOo;
        int i = this.f26987OooOoO0;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0oO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final boolean OooOO0() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final Object[] OooOO0O() {
        return this.f26986OooOo;
    }

    @Override // java.util.List
    public final Object get(int i) {
        o0O000Oo.OooO0oO(i, this.f26987OooOoO0);
        Object obj = this.f26986OooOo[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26987OooOoO0;
    }
}
