package com.google.android.gms.internal.play_billing;

import com.ironsource.C3034d9;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o000O0Oo extends o00000OO {

    /* renamed from: OooOo */
    public final transient Object f27017OooOo;

    public o000O0Oo(Object obj) {
        this.f27017OooOo = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.o00000OO, com.google.android.gms.internal.play_billing.o0Oo0oo
    public final o000000 OooO() {
        Object[] objArr = {this.f27017OooOo};
        for (int i = 0; i < 1; i++) {
            oo0o0Oo oo0o0oo = o000000.f26972OooOo0o;
            if (objArr[i] == null) {
                throw new NullPointerException(OooO0oO.OooOo.OooO0o(i, "at index "));
            }
        }
        return o000000.OooOOO(1, objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final int OooO0o0(Object[] objArr) {
        objArr[0] = this.f27017OooOo;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f27017OooOo.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.o00000OO, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27017OooOo.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new o0000O00(this.f27017OooOo);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return OooO0oO.OooOo.OooOO0O(C3034d9.i.f8177d, this.f27017OooOo.toString(), C3034d9.i.f8179e);
    }
}
