package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00O0000 extends o00O000o {

    /* renamed from: OooOoO */
    public final /* synthetic */ int f26514OooOoO;

    /* renamed from: OooOoOO */
    public final /* synthetic */ o00000O f26515OooOoOO;

    /* renamed from: OooOoo0 */
    public final /* synthetic */ o00O00OO f26516OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(o00O00OO o00o00oo, o00000O o00000o, int i) {
        super(o00o00oo, true);
        this.f26514OooOoO = i;
        switch (i) {
            case 1:
                this.f26515OooOoOO = o00000o;
                Objects.requireNonNull(o00o00oo);
                this.f26516OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            case 2:
                this.f26515OooOoOO = o00000o;
                Objects.requireNonNull(o00o00oo);
                this.f26516OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            case 3:
                this.f26515OooOoOO = o00000o;
                Objects.requireNonNull(o00o00oo);
                this.f26516OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            case 4:
                this.f26515OooOoOO = o00000o;
                Objects.requireNonNull(o00o00oo);
                this.f26516OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            case 5:
                this.f26515OooOoOO = o00000o;
                Objects.requireNonNull(o00o00oo);
                this.f26516OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            case 6:
                this.f26515OooOoOO = o00000o;
                Objects.requireNonNull(o00o00oo);
                this.f26516OooOoo0 = o00o00oo;
                super(o00o00oo, true);
                break;
            default:
                this.f26515OooOoOO = o00000o;
                Objects.requireNonNull(o00o00oo);
                this.f26516OooOoo0 = o00o00oo;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        switch (this.f26514OooOoO) {
            case 0:
                o0000 o0000Var = this.f26516OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var);
                o0000Var.getGmpAppId(this.f26515OooOoOO);
                break;
            case 1:
                o0000 o0000Var2 = this.f26516OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var2);
                o0000Var2.getCachedAppInstanceId(this.f26515OooOoOO);
                break;
            case 2:
                o0000 o0000Var3 = this.f26516OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var3);
                o0000Var3.generateEventId(this.f26515OooOoOO);
                break;
            case 3:
                o0000 o0000Var4 = this.f26516OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var4);
                o0000Var4.getCurrentScreenName(this.f26515OooOoOO);
                break;
            case 4:
                o0000 o0000Var5 = this.f26516OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var5);
                o0000Var5.getCurrentScreenClass(this.f26515OooOoOO);
                break;
            case 5:
                o0000 o0000Var6 = this.f26516OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var6);
                o0000Var6.getAppInstanceId(this.f26515OooOoOO);
                break;
            default:
                o0000 o0000Var7 = this.f26516OooOoo0.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var7);
                o0000Var7.getSessionId(this.f26515OooOoOO);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO0O0() {
        switch (this.f26514OooOoO) {
            case 0:
                this.f26515OooOoOO.o0000oO0(null);
                break;
            case 1:
                this.f26515OooOoOO.o0000oO0(null);
                break;
            case 2:
                this.f26515OooOoOO.o0000oO0(null);
                break;
            case 3:
                this.f26515OooOoOO.o0000oO0(null);
                break;
            case 4:
                this.f26515OooOoOO.o0000oO0(null);
                break;
            case 5:
                this.f26515OooOoOO.o0000oO0(null);
                break;
            default:
                this.f26515OooOoOO.o0000oO0(null);
                break;
        }
    }
}
