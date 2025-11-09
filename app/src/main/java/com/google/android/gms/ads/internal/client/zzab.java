package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1976qj;
import com.google.android.gms.internal.ads.C2007rd;
import com.google.android.gms.internal.ads.C2198wj;
import com.google.android.gms.internal.ads.InterfaceC2050sj;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
final class zzab extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15950OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ String f15951OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2156ve f15952OooO0Oo;

    public zzab(Context context, String str, InterfaceC2156ve interfaceC2156ve) {
        this.f15950OooO0O0 = context;
        this.f15951OooO0OO = str;
        this.f15952OooO0Oo = interfaceC2156ve;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15950OooO0O0, "rewarded");
        return new zzfq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzp(new OooO0OO(this.f15950OooO0O0), this.f15951OooO0OO, this.f15952OooO0Oo, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzc() throws RemoteException {
        String str = this.f15951OooO0OO;
        InterfaceC2156ve interfaceC2156ve = this.f15952OooO0Oo;
        Context context = this.f15950OooO0O0;
        try {
            IBinder iBinderZze = ((C2198wj) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new C2007rd(11))).zze(new OooO0OO(context), str, interfaceC2156ve, 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2050sj ? (InterfaceC2050sj) iInterfaceQueryLocalInterface : new C1976qj(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
