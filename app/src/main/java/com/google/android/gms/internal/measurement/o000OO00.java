package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000OO00 extends o00O000o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ long f26499OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f26500OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(o00O00OO o00o00oo, long j) {
        super(o00o00oo, true);
        this.f26499OooOoO = j;
        Objects.requireNonNull(o00o00oo);
        this.f26500OooOoOO = o00o00oo;
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        o0000 o0000Var = this.f26500OooOoOO.f26531OooO0oO;
        Oooo00O.o000000O.OooO0oo(o0000Var);
        o0000Var.setSessionTimeoutDuration(this.f26499OooOoO);
    }
}
