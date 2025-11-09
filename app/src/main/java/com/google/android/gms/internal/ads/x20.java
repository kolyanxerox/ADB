package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.ironsource.C3678sv;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class x20 extends AbstractBinderC2124uj {

    /* renamed from: OooOo0O */
    public final /* synthetic */ y20 f25498OooOo0O;

    public x20(y20 y20Var) {
        this.f25498OooOo0O = y20Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void OooOO0O(int i) throws JSONException {
        y20 y20Var = this.f25498OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = "onRewardedAdFailedToShow";
        s20Var.f23978OooOoO = Integer.valueOf(i);
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void Oooo00o(InterfaceC1939pj interfaceC1939pj) throws JSONException {
        y20 y20Var = this.f25498OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = "onUserEarnedReward";
        s20Var.f23979OooOoO0 = interfaceC1939pj.zzf();
        s20Var.f23980OooOoOO = Integer.valueOf(interfaceC1939pj.zze());
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void o00ooo(zze zzeVar) throws JSONException {
        y20 y20Var = this.f25498OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        int i = zzeVar.zza;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = "onRewardedAdFailedToShow";
        s20Var.f23978OooOoO = Integer.valueOf(i);
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void zze() throws JSONException {
        y20 y20Var = this.f25498OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = C3678sv.f11949f;
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void zzf() throws JSONException {
        y20 y20Var = this.f25498OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = "onAdImpression";
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void zzg() throws JSONException {
        y20 y20Var = this.f25498OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = "onRewardedAdClosed";
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2161vj
    public final void zzj() throws JSONException {
        y20 y20Var = this.f25498OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = "onRewardedAdOpened";
        sj0Var.OooOOo(s20Var);
    }
}
