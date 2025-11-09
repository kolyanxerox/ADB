package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.InterfaceC1680ii;

/* loaded from: classes2.dex */
final class zzav extends zzbb {

    /* renamed from: OooO0O0 */
    public final /* synthetic */ Context f15990OooO0O0;

    /* renamed from: OooO0OO */
    public final /* synthetic */ zzba f15991OooO0OO;

    public zzav(zzba zzbaVar, Context context) {
        this.f15990OooO0O0 = context;
        this.f15991OooO0OO = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15990OooO0O0, "mobile_ads_settings");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzh(new OooO0OO(this.f15990OooO0O0), 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        Context context = this.f15990OooO0O0;
        AbstractC1448c7.OooO00o(context);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0ooO)).booleanValue();
        zzba zzbaVar = this.f15991OooO0OO;
        if (!zBooleanValue) {
            return zzbaVar.f16003OooO0OO.zza(context);
        }
        try {
            IBinder iBinderZze = ((zzda) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzau
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof zzda ? (zzda) iInterfaceQueryLocalInterface : new zzda(iBinder);
                }
            })).zze(new OooO0OO(context), 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzcz ? (zzcz) iInterfaceQueryLocalInterface : new zzcx(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            InterfaceC1680ii interfaceC1680iiOooO0OO = C1643hi.OooO0OO(context);
            zzbaVar.getClass();
            interfaceC1680iiOooO0OO.OooO00o("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            InterfaceC1680ii interfaceC1680iiOooO0OO2 = C1643hi.OooO0OO(context);
            zzbaVar.getClass();
            interfaceC1680iiOooO0OO2.OooO00o("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            InterfaceC1680ii interfaceC1680iiOooO0OO22 = C1643hi.OooO0OO(context);
            zzbaVar.getClass();
            interfaceC1680iiOooO0OO22.OooO00o("ClientApiBroker.getMobileAdsSettingsManager", e);
            return null;
        }
    }
}
