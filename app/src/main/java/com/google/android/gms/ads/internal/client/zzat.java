package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
final class zzat extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15987OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2156ve f15988OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzba f15989OooO0Oo;

    public zzat(zzba zzbaVar, Context context, InterfaceC2156ve interfaceC2156ve) {
        this.f15987OooO0O0 = context;
        this.f15988OooO0OO = interfaceC2156ve;
        this.f15989OooO0Oo = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15987OooO0O0, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        OooO0OO oooO0OO = new OooO0OO(this.f15987OooO0O0);
        InterfaceC2156ve interfaceC2156ve = this.f15988OooO0OO;
        zzci zzciVarZzg = zzcpVar.zzg(oooO0OO, interfaceC2156ve, 244410000);
        zzciVarZzg.zzh(interfaceC2156ve);
        return zzciVarZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzc() {
        zzci zzcgVar;
        Context context = this.f15987OooO0O0;
        OooO0OO oooO0OO = new OooO0OO(context);
        AbstractC1448c7.OooO00o(context);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0ooO)).booleanValue();
        zzba zzbaVar = this.f15989OooO0Oo;
        InterfaceC2156ve interfaceC2156ve = this.f15988OooO0OO;
        if (!zBooleanValue) {
            return zzbaVar.f16007OooO0oO.zza(context, interfaceC2156ve);
        }
        try {
            IBinder iBinderZze = ((zzcj) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzas
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzcj ? (zzcj) iInterfaceQueryLocalInterface : new zzcj(iBinder);
                }
            })).zze(oooO0OO, interfaceC2156ve, 244410000);
            if (iBinderZze == null) {
                zzcgVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcgVar = iInterfaceQueryLocalInterface instanceof zzci ? (zzci) iInterfaceQueryLocalInterface : new zzcg(iBinderZze);
            }
            zzcgVar.zzh(interfaceC2156ve);
            return zzcgVar;
        } catch (RemoteException e) {
            e = e;
            C1643hi.OooO0OO(context).OooO00o("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            C1643hi.OooO0OO(context).OooO00o("ClientApiBroker.getAdPreloader", e);
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            C1643hi.OooO0OO(context).OooO00o("ClientApiBroker.getAdPreloader", e);
            return null;
        }
    }
}
