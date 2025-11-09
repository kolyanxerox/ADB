package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000 extends o000000 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o000O000 f26967OooOo;

    public o000(o000O000 o000o0002) {
        this.f26967OooOo = o000o0002;
    }

    @Override // com.google.android.gms.internal.play_billing.o0Oo0oo
    public final boolean OooOO0() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        o000O000 o000o0002 = this.f26967OooOo;
        o0O000Oo.OooO0oO(i, o000o0002.f27008OooOoO);
        int i2 = i + i;
        Object[] objArr = o000o0002.f27009OooOoO0;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26967OooOo.f27008OooOoO;
    }
}
