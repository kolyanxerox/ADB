package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;

/* loaded from: classes2.dex */
public final class jg0 extends AbstractBinderC1372a4 {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ kg0 f20306OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ jq0 f20307OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ zzft f20308OooOo0o;

    public jg0(kg0 kg0Var, jq0 jq0Var, zzft zzftVar) {
        this.f20307OooOo0O = jq0Var;
        this.f20308OooOo0o = zzftVar;
        this.f20306OooOo = kg0Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409b4
    public final void OooOo00(InterfaceC2256y3 interfaceC2256y3) {
        this.f20307OooOo0O.OooO0o(interfaceC2256y3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409b4
    public final void o0000oOO(zze zzeVar) {
        zzo.zzj("Failed to load app open ad with error parcel: " + zzeVar.zzb().toString() + " for ad unit: " + this.f20308OooOo0o.zza);
        kg0.OooO0oO(this.f20306OooOo, zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409b4
    public final void zzb(int i) {
    }
}
