package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000OO0O extends o00O000o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f26501OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f26502OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f26503OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(o00O00OO o00o00oo, String str, int i) {
        super(o00o00oo, true);
        this.f26501OooOoO = i;
        switch (i) {
            case 1:
                this.f26502OooOoOO = str;
                Objects.requireNonNull(o00o00oo);
                this.f26503OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            case 2:
                this.f26502OooOoOO = str;
                Objects.requireNonNull(o00o00oo);
                this.f26503OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            default:
                this.f26502OooOoOO = str;
                Objects.requireNonNull(o00o00oo);
                this.f26503OooOoo0 = o00o00oo;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        switch (this.f26501OooOoO) {
            case 0:
                o0000 o0000Var = this.f26503OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var);
                o0000Var.setUserId(this.f26502OooOoOO, this.f26518OooOo0O);
                break;
            case 1:
                o0000 o0000Var2 = this.f26503OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var2);
                o0000Var2.beginAdUnitExposure(this.f26502OooOoOO, this.f26519OooOo0o);
                break;
            default:
                o0000 o0000Var3 = this.f26503OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var3);
                o0000Var3.endAdUnitExposure(this.f26502OooOoOO, this.f26519OooOo0o);
                break;
        }
    }
}
