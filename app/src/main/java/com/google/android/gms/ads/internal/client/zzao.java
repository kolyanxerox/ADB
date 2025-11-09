package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.RemoteException;
import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes2.dex */
final class zzao extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15974OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zzs f15975OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f15976OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzba f15977OooO0o0;

    public zzao(zzba zzbaVar, Context context, zzs zzsVar, String str) {
        this.f15974OooO0O0 = context;
        this.f15975OooO0OO = zzsVar;
        this.f15976OooO0Oo = str;
        this.f15977OooO0o0 = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15974OooO0O0, AppLovinEventTypes.USER_EXECUTED_SEARCH);
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzf(new OooO0OO(this.f15974OooO0O0), this.f15975OooO0OO, this.f15976OooO0Oo, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.f15977OooO0o0.f16001OooO00o.zza(this.f15974OooO0O0, this.f15975OooO0OO, this.f15976OooO0Oo, null, 3);
    }
}
