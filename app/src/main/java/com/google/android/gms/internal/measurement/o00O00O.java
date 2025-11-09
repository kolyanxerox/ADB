package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes2.dex */
public final class o00O00O extends o00O000o {

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f26521OooOoO;

    /* renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ Activity f26522OooOoOO;

    /* renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ oOO00O f26523OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(oOO00O ooo00o, Activity activity, int i) {
        super(ooo00o.f26848OooOo0O, true);
        this.f26521OooOoO = i;
        switch (i) {
            case 1:
                this.f26522OooOoOO = activity;
                this.f26523OooOoo0 = ooo00o;
                super(ooo00o.f26848OooOo0O, true);
                break;
            case 2:
                this.f26522OooOoOO = activity;
                this.f26523OooOoo0 = ooo00o;
                super(ooo00o.f26848OooOo0O, true);
                break;
            case 3:
                this.f26522OooOoOO = activity;
                this.f26523OooOoo0 = ooo00o;
                super(ooo00o.f26848OooOo0O, true);
                break;
            case 4:
                this.f26522OooOoOO = activity;
                this.f26523OooOoo0 = ooo00o;
                super(ooo00o.f26848OooOo0O, true);
                break;
            default:
                this.f26522OooOoOO = activity;
                this.f26523OooOoo0 = ooo00o;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00O000o
    public final void OooO00o() {
        switch (this.f26521OooOoO) {
            case 0:
                o0000 o0000Var = this.f26523OooOoo0.f26848OooOo0O.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var);
                o0000Var.onActivityStartedByScionActivityInfo(o000O00.OooO0o0(this.f26522OooOoOO), this.f26519OooOo0o);
                break;
            case 1:
                o0000 o0000Var2 = this.f26523OooOoo0.f26848OooOo0O.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var2);
                o0000Var2.onActivityResumedByScionActivityInfo(o000O00.OooO0o0(this.f26522OooOoOO), this.f26519OooOo0o);
                break;
            case 2:
                o0000 o0000Var3 = this.f26523OooOoo0.f26848OooOo0O.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var3);
                o0000Var3.onActivityPausedByScionActivityInfo(o000O00.OooO0o0(this.f26522OooOoOO), this.f26519OooOo0o);
                break;
            case 3:
                o0000 o0000Var4 = this.f26523OooOoo0.f26848OooOo0O.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var4);
                o0000Var4.onActivityStoppedByScionActivityInfo(o000O00.OooO0o0(this.f26522OooOoOO), this.f26519OooOo0o);
                break;
            default:
                o0000 o0000Var5 = this.f26523OooOoo0.f26848OooOo0O.f26531OooO0oO;
                Oooo00O.o000000O.OooO0oo(o0000Var5);
                o0000Var5.onActivityDestroyedByScionActivityInfo(o000O00.OooO0o0(this.f26522OooOoOO), this.f26519OooOo0o);
                break;
        }
    }
}
