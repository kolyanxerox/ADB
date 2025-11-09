package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000Oo0 extends o000000 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final transient Object[] f27032OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final transient int f27033OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient int f27034OooOoO0;

    public o000Oo0(Object[] objArr, int i, int i2) {
        this.f27032OooOo = objArr;
        this.f27034OooOoO0 = i;
        this.f27033OooOoO = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final boolean OooOO0() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        o0O000Oo.OooO0oO(i, this.f27033OooOoO);
        Object obj = this.f27032OooOo[i + i + this.f27034OooOoO0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27033OooOoO;
    }
}
