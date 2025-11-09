package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class kn0 extends um0 {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final transient ln0 f20634OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient mn0 f20635OooOoO0;

    public kn0(mn0 mn0Var, ln0 ln0Var) {
        this.f20635OooOoO0 = mn0Var;
        this.f20634OooOoO = ln0Var;
    }

    @Override // com.google.android.gms.internal.ads.um0, com.google.android.gms.internal.ads.mm0
    public final rm0 OooO() {
        return this.f20634OooOoO;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0o0(int i, Object[] objArr) {
        return this.f20634OooOoO.OooO0o0(i, objArr);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final vn0 OooOO0() {
        return this.f20634OooOoO.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final boolean OooOO0O() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20635OooOoO0.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f20634OooOoO.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20635OooOoO0.f21313OooOoOO;
    }
}
