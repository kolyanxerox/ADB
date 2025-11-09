package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class gn0 extends rm0 {

    /* renamed from: OooOoO */
    public static final gn0 f19388OooOoO = new gn0(0, new Object[0]);

    /* renamed from: OooOo */
    public final transient Object[] f19389OooOo;

    /* renamed from: OooOoO0 */
    public final transient int f19390OooOoO0;

    public gn0(int i, Object[] objArr) {
        this.f19389OooOo = objArr;
        this.f19390OooOoO0 = i;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0o() {
        return this.f19390OooOoO0;
    }

    @Override // com.google.android.gms.internal.ads.rm0, com.google.android.gms.internal.ads.mm0
    public final int OooO0o0(int i, Object[] objArr) {
        Object[] objArr2 = this.f19389OooOo;
        int i2 = this.f19390OooOoO0;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0oO() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final boolean OooOO0O() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final Object[] OooOO0o() {
        return this.f19389OooOo;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ii0.OooOO0O(i, this.f19390OooOoO0);
        Object obj = this.f19389OooOo[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19390OooOoO0;
    }
}
