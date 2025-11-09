package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zze;
import com.ironsource.C3678sv;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class u20 extends zzbk {

    /* renamed from: OooOo0O */
    public final /* synthetic */ sj0 f24552OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ v20 f24553OooOo0o;

    public u20(v20 v20Var, sj0 sj0Var) {
        this.f24552OooOo0O = sj0Var;
        this.f24553OooOo0o = v20Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws JSONException {
        long j = this.f24553OooOo0o.f24838OooO00o;
        sj0 sj0Var = this.f24552OooOo0O;
        s20 s20Var = new s20("interstitial");
        s20Var.f23976OooOo0O = Long.valueOf(j);
        s20Var.f23975OooOo = C3678sv.f11949f;
        ((InterfaceC1563fc) sj0Var.f24094OooOo0o).zzb(s20.OooO0O0(s20Var));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws JSONException {
        long j = this.f24553OooOo0o.f24838OooO00o;
        sj0 sj0Var = this.f24552OooOo0O;
        s20 s20Var = new s20("interstitial");
        s20Var.f23976OooOo0O = Long.valueOf(j);
        s20Var.f23975OooOo = C3678sv.f11950g;
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i) throws JSONException {
        long j = this.f24553OooOo0o.f24838OooO00o;
        sj0 sj0Var = this.f24552OooOo0O;
        s20 s20Var = new s20("interstitial");
        s20Var.f23976OooOo0O = Long.valueOf(j);
        s20Var.f23975OooOo = "onAdFailedToLoad";
        s20Var.f23978OooOoO = Integer.valueOf(i);
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zzeVar) throws JSONException {
        long j = this.f24553OooOo0o.f24838OooO00o;
        int i = zzeVar.zza;
        sj0 sj0Var = this.f24552OooOo0O;
        s20 s20Var = new s20("interstitial");
        s20Var.f23976OooOo0O = Long.valueOf(j);
        s20Var.f23975OooOo = "onAdFailedToLoad";
        s20Var.f23978OooOoO = Integer.valueOf(i);
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws JSONException {
        long j = this.f24553OooOo0o.f24838OooO00o;
        sj0 sj0Var = this.f24552OooOo0O;
        s20 s20Var = new s20("interstitial");
        s20Var.f23976OooOo0O = Long.valueOf(j);
        s20Var.f23975OooOo = C3678sv.f11953j;
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws JSONException {
        long j = this.f24553OooOo0o.f24838OooO00o;
        sj0 sj0Var = this.f24552OooOo0O;
        s20 s20Var = new s20("interstitial");
        s20Var.f23976OooOo0O = Long.valueOf(j);
        s20Var.f23975OooOo = C3678sv.f11946c;
        sj0Var.OooOOo(s20Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
    }
}
