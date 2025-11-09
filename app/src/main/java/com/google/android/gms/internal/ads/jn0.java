package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jn0 extends um0 {

    /* renamed from: OooOoO */
    public final transient Object[] f20341OooOoO;

    /* renamed from: OooOoO0 */
    public final transient mn0 f20342OooOoO0;

    /* renamed from: OooOoOO */
    public final transient int f20343OooOoOO;

    public jn0(mn0 mn0Var, Object[] objArr, int i) {
        this.f20342OooOoO0 = mn0Var;
        this.f20341OooOoO = objArr;
        this.f20343OooOoOO = i;
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final int OooO0o0(int i, Object[] objArr) {
        return OooO().OooO0o0(i, objArr);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final vn0 OooOO0() {
        return OooO().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.mm0
    public final boolean OooOO0O() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.um0
    public final rm0 OooOOO() {
        return new in0(this);
    }

    @Override // com.google.android.gms.internal.ads.mm0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f20342OooOoO0.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return OooO().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f20343OooOoOO;
    }
}
