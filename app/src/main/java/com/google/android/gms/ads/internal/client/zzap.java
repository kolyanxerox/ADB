package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
final class zzap extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15978OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zzs f15979OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f15980OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzba f15981OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2156ve f15982OooO0o0;

    public zzap(zzba zzbaVar, Context context, zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve) {
        this.f15978OooO0O0 = context;
        this.f15979OooO0OO = zzsVar;
        this.f15980OooO0Oo = str;
        this.f15982OooO0o0 = interfaceC2156ve;
        this.f15981OooO0o = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15978OooO0O0, "interstitial");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zze(new OooO0OO(this.f15978OooO0O0), this.f15979OooO0OO, this.f15980OooO0Oo, this.f15982OooO0o0, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.f15981OooO0o.f16001OooO00o.zza(this.f15978OooO0O0, this.f15979OooO0OO, this.f15980OooO0Oo, this.f15982OooO0o0, 2);
    }
}
