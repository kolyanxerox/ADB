package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class in0 extends rm0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ jn0 f20074OooOo;

    public in0(jn0 jn0Var) {
        this.f20074OooOo = jn0Var;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final boolean OooOO0O() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        jn0 jn0Var = this.f20074OooOo;
        ii0.OooOO0O(i, jn0Var.f20343OooOoOO);
        int i2 = i + i;
        Object[] objArr = jn0Var.f20341OooOoO;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20074OooOo.f20343OooOoOO;
    }
}
