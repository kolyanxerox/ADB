package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO;
import Oooo0o.OooO0OO;
import Oooo0o.OooO0o;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
public final class zzk extends OooO {
    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // Oooo0o.OooO
    public final /* synthetic */ Object OooO0OO(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbz ? (zzbz) iInterfaceQueryLocalInterface : new zzbz(iBinder);
    }

    @Nullable
    public final zzby zza(Context context, zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve, int i) {
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0ooO)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzbz) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzj
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        return iInterfaceQueryLocalInterface instanceof zzbz ? (zzbz) iInterfaceQueryLocalInterface : new zzbz(iBinder);
                    }
                })).zze(new OooO0OO(context), zzsVar, str, interfaceC2156ve, 244410000, i);
                if (iBinderZze != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(iBinderZze);
                }
            } catch (RemoteException e) {
                e = e;
                Throwable th = e;
                C1643hi.OooO0OO(context).OooO00o("AdManagerCreator.newAdManagerByDynamiteLoader", th);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th);
                return null;
            } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
                e = e2;
                Throwable th2 = e;
                C1643hi.OooO0OO(context).OooO00o("AdManagerCreator.newAdManagerByDynamiteLoader", th2);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th2);
                return null;
            } catch (NullPointerException e3) {
                e = e3;
                Throwable th22 = e;
                C1643hi.OooO0OO(context).OooO00o("AdManagerCreator.newAdManagerByDynamiteLoader", th22);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th22);
                return null;
            }
        } else {
            try {
                IBinder iBinderZze2 = ((zzbz) OooO0Oo(context)).zze(new OooO0OO(context), zzsVar, str, interfaceC2156ve, 244410000, i);
                if (iBinderZze2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface2 instanceof zzby ? (zzby) iInterfaceQueryLocalInterface2 : new zzbw(iBinderZze2);
                }
            } catch (OooO0o e4) {
                e = e4;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteException e5) {
                e = e5;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }
}
