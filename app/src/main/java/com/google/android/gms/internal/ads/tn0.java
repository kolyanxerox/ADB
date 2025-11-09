package com.google.android.gms.internal.ads;

import com.ironsource.C3034d9;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class tn0 extends um0 {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient Object f24366OooOoO0;

    public tn0(Object obj) {
        obj.getClass();
        this.f24366OooOoO0 = obj;
    }

    @Override // com.google.android.gms.internal.ads.um0, com.google.android.gms.internal.ads.mm0
    public final rm0 OooO() {
        return rm0.OooOOo0(this.f24366OooOoO0);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0o0(int i, Object[] objArr) {
        objArr[i] = this.f24366OooOoO0;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final vn0 OooOO0() {
        return new xm0(this.f24366OooOoO0);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final boolean OooOO0O() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.mm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f24366OooOoO0.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.um0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f24366OooOoO0.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new xm0(this.f24366OooOoO0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return OooO0oO.OooOo.OooOO0O(C3034d9.i.f8177d, this.f24366OooOoO0.toString(), C3034d9.i.f8179e);
    }
}
