package com.google.protobuf;

import com.google.android.gms.internal.measurement.oO0O00o0;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o0O0OO0 extends oO0O00o0 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0O0O0Oo f28328OooOo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(o0O0O0Oo o0o0o0oo) {
        super(o0o0o0oo, 1);
        this.f28328OooOo = o0o0o0oo;
    }

    @Override // com.google.android.gms.internal.measurement.oO0O00o0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new o0O0O0o0(this.f28328OooOo);
    }
}
