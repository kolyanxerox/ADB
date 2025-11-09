package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000O0 extends o00O000o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f26482OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Bundle f26483OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f26484OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(o00O00OO o00o00oo, Bundle bundle, int i) {
        super(o00o00oo, true);
        this.f26482OooOoO = i;
        switch (i) {
            case 1:
                this.f26483OooOoOO = bundle;
                Objects.requireNonNull(o00o00oo);
                this.f26484OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            case 2:
                this.f26483OooOoOO = bundle;
                Objects.requireNonNull(o00o00oo);
                this.f26484OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            default:
                this.f26483OooOoOO = bundle;
                Objects.requireNonNull(o00o00oo);
                this.f26484OooOoo0 = o00o00oo;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        switch (this.f26482OooOoO) {
            case 0:
                o0000 o0000Var = this.f26484OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var);
                o0000Var.setConditionalUserProperty(this.f26483OooOoOO, this.f26518OooOo0O);
                break;
            case 1:
                o0000 o0000Var2 = this.f26484OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var2);
                o0000Var2.setConsentThirdParty(this.f26483OooOoOO, this.f26518OooOo0O);
                break;
            default:
                o0000 o0000Var3 = this.f26484OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var3);
                o0000Var3.setDefaultEventParameters(this.f26483OooOoOO);
                break;
        }
    }
}
