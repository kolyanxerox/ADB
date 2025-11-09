package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
final class zzan extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15969OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zzs f15970OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f15971OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzba f15972OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2156ve f15973OooO0o0;

    public zzan(zzba zzbaVar, Context context, zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve) {
        this.f15969OooO0O0 = context;
        this.f15970OooO0OO = zzsVar;
        this.f15971OooO0Oo = str;
        this.f15973OooO0o0 = interfaceC2156ve;
        this.f15972OooO0o = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15969OooO0O0, "app_open");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzc(new OooO0OO(this.f15969OooO0O0), this.f15970OooO0OO, this.f15971OooO0Oo, this.f15973OooO0o0, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.f15972OooO0o.f16001OooO00o.zza(this.f15969OooO0O0, this.f15970OooO0OO, this.f15971OooO0Oo, this.f15973OooO0o0, 4);
    }
}
