package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class wg0 extends AbstractBinderC2272yj {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ kg0 f25310OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ jq0 f25311OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2050sj f25312OooOo0o;

    public wg0(kg0 kg0Var, jq0 jq0Var, InterfaceC2050sj interfaceC2050sj) {
        this.f25311OooOo0O = jq0Var;
        this.f25312OooOo0o = interfaceC2050sj;
        this.f25310OooOo = kg0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zzf(zze zzeVar) {
        String string = zzeVar.zzb().toString();
        kg0 kg0Var = this.f25310OooOo;
        zzo.zzj("Failed to load rewarded ad with error: " + string + ", adUnitId: " + kg0Var.f20597OooO0o0.zza);
        kg0.OooO0oO(kg0Var, zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zzg() {
        this.f25311OooOo0O.OooO0o(this.f25312OooOo0o);
    }
}
