package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class w20 extends AbstractBinderC2272yj {

    /* renamed from: OooOo0O */
    public final /* synthetic */ y20 f25175OooOo0O;

    public w20(y20 y20Var) {
        this.f25175OooOo0O = y20Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zze(int i) throws JSONException {
        y20 y20Var = this.f25175OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = "onRewardedAdFailedToLoad";
        s20Var.f23978OooOoO = Integer.valueOf(i);
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zzf(zze zzeVar) throws JSONException {
        y20 y20Var = this.f25175OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        int i = zzeVar.zza;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = "onRewardedAdFailedToLoad";
        s20Var.f23978OooOoO = Integer.valueOf(i);
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zzg() throws JSONException {
        y20 y20Var = this.f25175OooOo0O;
        sj0 sj0Var = y20Var.f25839OooO0O0;
        s20 s20Var = new s20("rewarded");
        s20Var.f23976OooOo0O = Long.valueOf(y20Var.f25838OooO00o);
        s20Var.f23975OooOo = "onRewardedAdLoaded";
        sj0Var.OooOOo(s20Var);
    }
}
