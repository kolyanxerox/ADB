package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO;
import Oooo0o.OooO0OO;
import Oooo0o.OooO0o;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
public final class zzl extends OooO {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // Oooo0o.OooO
    public final /* synthetic */ Object OooO0OO(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterfaceQueryLocalInterface instanceof zzcj ? (zzcj) iInterfaceQueryLocalInterface : new zzcj(iBinder);
    }

    public final zzci zza(Context context, InterfaceC2156ve interfaceC2156ve) {
        zzci zzcgVar;
        try {
            IBinder iBinderZze = ((zzcj) OooO0Oo(context)).zze(new OooO0OO(context), interfaceC2156ve, 244410000);
            if (iBinderZze == null) {
                zzcgVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcgVar = iInterfaceQueryLocalInterface instanceof zzci ? (zzci) iInterfaceQueryLocalInterface : new zzcg(iBinderZze);
            }
            zzcgVar.zzh(interfaceC2156ve);
            return zzcgVar;
        } catch (OooO0o e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (RemoteException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
