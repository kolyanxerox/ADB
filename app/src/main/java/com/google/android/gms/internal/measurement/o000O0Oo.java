package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000O0Oo extends o00O000o {

    /* renamed from: OooOoO */
    public final /* synthetic */ int f26494OooOoO = 2;

    /* renamed from: OooOoOO */
    public final /* synthetic */ String f26495OooOoOO;

    /* renamed from: OooOoo */
    public final /* synthetic */ o00O00OO f26496OooOoo;

    /* renamed from: OooOoo0 */
    public final /* synthetic */ String f26497OooOoo0;

    /* renamed from: OooOooO */
    public final /* synthetic */ Object f26498OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o00O00OO o00o00oo, o000O00 o000o002, String str, String str2) {
        super(o00o00oo, true);
        this.f26498OooOooO = o000o002;
        this.f26495OooOoOO = str;
        this.f26497OooOoo0 = str2;
        Objects.requireNonNull(o00o00oo);
        this.f26496OooOoo = o00o00oo;
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        switch (this.f26494OooOoO) {
            case 0:
                o0000 o0000Var = this.f26496OooOoo.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var);
                o0000Var.clearConditionalUserProperty(this.f26495OooOoOO, this.f26497OooOoo0, (Bundle) this.f26498OooOooO);
                break;
            case 1:
                o0000 o0000Var2 = this.f26496OooOoo.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var2);
                o0000Var2.getConditionalUserProperties(this.f26495OooOoOO, this.f26497OooOoo0, (o00000O) this.f26498OooOooO);
                break;
            default:
                o0000 o0000Var3 = this.f26496OooOoo.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var3);
                o0000Var3.setCurrentScreenByScionActivityInfo((o000O00) this.f26498OooOooO, this.f26495OooOoOO, this.f26497OooOoo0, this.f26518OooOo0O);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public void OooO0O0() {
        switch (this.f26494OooOoO) {
            case 1:
                ((o00000O) this.f26498OooOooO).o0000oO0(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o00O00OO o00o00oo, String str, String str2, Bundle bundle) {
        super(o00o00oo, true);
        this.f26495OooOoOO = str;
        this.f26497OooOoo0 = str2;
        this.f26498OooOooO = bundle;
        Objects.requireNonNull(o00o00oo);
        this.f26496OooOoo = o00o00oo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o00O00OO o00o00oo, String str, String str2, o00000O o00000o) {
        super(o00o00oo, true);
        this.f26495OooOoOO = str;
        this.f26497OooOoo0 = str2;
        this.f26498OooOooO = o00000o;
        Objects.requireNonNull(o00o00oo);
        this.f26496OooOoo = o00o00oo;
    }
}
