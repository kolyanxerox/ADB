package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ln0 extends rm0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final transient Object[] f20913OooOo;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final transient int f20914OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient int f20915OooOoO0;

    public ln0(Object[] objArr, int i, int i2) {
        this.f20913OooOo = objArr;
        this.f20915OooOoO0 = i;
        this.f20914OooOoO = i2;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final boolean OooOO0O() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ii0.OooOO0O(i, this.f20914OooOoO);
        Object obj = this.f20913OooOo[i + i + this.f20915OooOoO0];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20914OooOoO;
    }
}
