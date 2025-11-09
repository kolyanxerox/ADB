package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00O000 extends o00O000o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f26512OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f26513OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(o00O00OO o00o00oo, boolean z) {
        super(o00o00oo, true);
        this.f26512OooOoO = z;
        Objects.requireNonNull(o00o00oo);
        this.f26513OooOoOO = o00o00oo;
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        o0000 o0000Var = this.f26513OooOoOO.f26531OooO0oO;
        Oooo00O.o000000O.OooO0oo(o0000Var);
        o0000Var.setDataCollectionEnabled(this.f26512OooOoO);
    }
}
