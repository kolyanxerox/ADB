package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o000O0o extends o00000OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final transient o000O00 f27018OooOo;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final transient o000Oo0 f27019OooOoO0;

    public o000O0o(o000O00 o000o002, o000Oo0 o000oo02) {
        this.f27018OooOo = o000o002;
        this.f27019OooOoO0 = o000oo02;
    }

    @Override // com.google.android.gms.internal.play_billing.o00000OO, com.google.android.gms.internal.play_billing.o0Oo0oo
    public final o000000 OooO() {
        return this.f27019OooOoO0;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o0(Object[] objArr) {
        return this.f27019OooOoO0.OooO0o0(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f27018OooOo.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f27019OooOoO0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27018OooOo.f27006OooOoOO;
    }
}
