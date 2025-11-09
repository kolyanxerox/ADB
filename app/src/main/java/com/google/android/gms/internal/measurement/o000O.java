package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000O extends o00O000o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f26481OooOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o00O00OO o00o00oo) {
        super(o00o00oo, true);
        Objects.requireNonNull(o00o00oo);
        this.f26481OooOoO = o00o00oo;
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        o0000 o0000Var = this.f26481OooOoO.f26531OooO0oO;
        Oooo00O.o000000O.OooO0oo(o0000Var);
        o0000Var.resetAnalyticsData(this.f26518OooOo0O);
    }
}
