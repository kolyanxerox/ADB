package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
final class zzar extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15983OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ String f15984OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2156ve f15985OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzba f15986OooO0o0;

    public zzar(zzba zzbaVar, Context context, String str, InterfaceC2156ve interfaceC2156ve) {
        this.f15983OooO0O0 = context;
        this.f15984OooO0OO = str;
        this.f15985OooO0Oo = interfaceC2156ve;
        this.f15986OooO0o0 = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15983OooO0O0, "native_ad");
        return new zzfi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzb(new OooO0OO(this.f15983OooO0O0), this.f15984OooO0OO, this.f15985OooO0Oo, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        Context context = this.f15983OooO0O0;
        AbstractC1448c7.OooO00o(context);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0ooO)).booleanValue();
        zzba zzbaVar = this.f15986OooO0o0;
        InterfaceC2156ve interfaceC2156ve = this.f15985OooO0Oo;
        String str = this.f15984OooO0OO;
        if (!zBooleanValue) {
            return zzbaVar.f16002OooO0O0.zza(context, str, interfaceC2156ve);
        }
        try {
            IBinder iBinderZze = ((zzbv) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaq
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder);
                }
            })).zze(new OooO0OO(context), str, interfaceC2156ve, 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            C1643hi.OooO0OO(context).OooO00o("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            C1643hi.OooO0OO(context).OooO00o("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            C1643hi.OooO0OO(context).OooO00o("ClientApiBroker.createAdLoaderBuilder", e);
            return null;
        }
    }
}
