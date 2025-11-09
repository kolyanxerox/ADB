package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000O00O extends o00O000o {

    /* renamed from: OooOoO */
    public final /* synthetic */ int f26485OooOoO = 2;

    /* renamed from: OooOoOO */
    public final /* synthetic */ String f26486OooOoOO;

    /* renamed from: OooOoo */
    public final /* synthetic */ boolean f26487OooOoo;

    /* renamed from: OooOoo0 */
    public final /* synthetic */ String f26488OooOoo0;

    /* renamed from: OooOooO */
    public final /* synthetic */ o00O00OO f26489OooOooO;

    /* renamed from: OooOooo */
    public final /* synthetic */ Object f26490OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o00O00OO o00o00oo, String str, String str2, Bundle bundle, boolean z) {
        super(o00o00oo, true);
        this.f26486OooOoOO = str;
        this.f26488OooOoo0 = str2;
        this.f26490OooOooo = bundle;
        this.f26487OooOoo = z;
        Objects.requireNonNull(o00o00oo);
        this.f26489OooOooO = o00o00oo;
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        switch (this.f26485OooOoO) {
            case 0:
                o0000 o0000Var = this.f26489OooOooO.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var);
                o0000Var.setUserProperty(this.f26486OooOoOO, this.f26488OooOoo0, new Oooo0o.OooO0OO(this.f26490OooOooo), this.f26487OooOoo, this.f26518OooOo0O);
                break;
            case 1:
                o0000 o0000Var2 = this.f26489OooOooO.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var2);
                o0000Var2.getUserProperties(this.f26486OooOoOO, this.f26488OooOoo0, this.f26487OooOoo, (o00000O) this.f26490OooOooo);
                break;
            default:
                long j = this.f26518OooOo0O;
                o0000 o0000Var3 = this.f26489OooOooO.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var3);
                o0000Var3.logEvent(this.f26486OooOoOO, this.f26488OooOoo0, (Bundle) this.f26490OooOooo, this.f26487OooOoo, true, j);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public void OooO0O0() {
        switch (this.f26485OooOoO) {
            case 1:
                ((o00000O) this.f26490OooOooo).o0000oO0(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o00O00OO o00o00oo, String str, String str2, Object obj, boolean z) {
        super(o00o00oo, true);
        this.f26486OooOoOO = str;
        this.f26488OooOoo0 = str2;
        this.f26490OooOooo = obj;
        this.f26487OooOoo = z;
        Objects.requireNonNull(o00o00oo);
        this.f26489OooOooO = o00o00oo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(o00O00OO o00o00oo, String str, String str2, boolean z, o00000O o00000o) {
        super(o00o00oo, true);
        this.f26486OooOoOO = str;
        this.f26488OooOoo0 = str2;
        this.f26487OooOoo = z;
        this.f26490OooOooo = o00000o;
        Objects.requireNonNull(o00o00oo);
        this.f26489OooOooO = o00o00oo;
    }
}
