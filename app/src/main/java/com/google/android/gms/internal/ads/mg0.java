package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class mg0 extends zzbn {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ kg0 f21250OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ jq0 f21251OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ zzby f21252OooOo0o;

    public mg0(kg0 kg0Var, jq0 jq0Var, zzby zzbyVar) {
        this.f21251OooOo0O = jq0Var;
        this.f21252OooOo0o = zzbyVar;
        this.f21250OooOo = kg0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(zze zzeVar) {
        String string = zzeVar.zzb().toString();
        kg0 kg0Var = this.f21250OooOo;
        zzo.zzj("Failed to load interstitial ad with error: " + string + " for ad unit: " + kg0Var.f20597OooO0o0.zza);
        kg0.OooO0oO(kg0Var, zzeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
        this.f21251OooOo0O.OooO0o(this.f21252OooOo0o);
    }
}
