package com.google.android.gms.internal.measurement;

import android.content.Intent;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000O0O0 extends o00O000o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f26491OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f26492OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ Object f26493OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o000O0O0(o00O00OO o00o00oo, Object obj, int i) {
        super(o00o00oo, true);
        this.f26491OooOoO = i;
        this.f26493OooOoo0 = obj;
        this.f26492OooOoOO = o00o00oo;
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        switch (this.f26491OooOoO) {
            case 0:
                o0000 o0000Var = this.f26492OooOoOO.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var);
                o0000Var.setMeasurementEnabled(((Boolean) this.f26493OooOoo0).booleanValue(), this.f26518OooOo0O);
                break;
            case 1:
                o0000 o0000Var2 = this.f26492OooOoOO.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var2);
                o0000Var2.retrieveAndUploadBatches(new o00(this, (o00000oO.OooOOO0) this.f26493OooOoo0));
                break;
            case 2:
                o0000 o0000Var3 = this.f26492OooOoOO.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var3);
                o0000Var3.setSgtmDebugInfo((Intent) this.f26493OooOoo0);
                break;
            default:
                o0000 o0000Var4 = this.f26492OooOoOO.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var4);
                o0000Var4.registerOnMeasurementEventListener((o00O00) this.f26493OooOoo0);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(o00O00OO o00o00oo, o00O00 o00o00) {
        super(o00o00oo, true);
        this.f26491OooOoO = 3;
        this.f26493OooOoo0 = o00o00;
        Objects.requireNonNull(o00o00oo);
        this.f26492OooOoOO = o00o00oo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(o00O00OO o00o00oo, Boolean bool) {
        super(o00o00oo, true);
        this.f26491OooOoO = 0;
        this.f26493OooOoo0 = bool;
        Objects.requireNonNull(o00o00oo);
        this.f26492OooOoOO = o00o00oo;
    }
}
