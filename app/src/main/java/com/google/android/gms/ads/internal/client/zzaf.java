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
final class zzaf extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15955OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2156ve f15956OooO0OO;

    public zzaf(Context context, InterfaceC2156ve interfaceC2156ve) {
        this.f15955OooO0O0 = context;
        this.f15956OooO0OO = interfaceC2156ve;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15955OooO0O0, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        Context context = this.f15955OooO0O0;
        OooO0OO oooO0OO = new OooO0OO(context);
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoOo)).booleanValue()) {
            return zzcpVar.zzi(oooO0OO, this.f15956OooO0OO, 244410000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        Context context = this.f15955OooO0O0;
        OooO0OO oooO0OO = new OooO0OO(context);
        AbstractC1448c7.OooO00o(context);
        if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OOOoOo)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdv) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzae
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return iInterfaceQueryLocalInterface instanceof zzdv ? (zzdv) iInterfaceQueryLocalInterface : new zzdv(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                }
            })).zze(oooO0OO, this.f15956OooO0OO, 244410000);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            C1643hi.OooO0OO(context).OooO00o("ClientApiBroker.getOutOfContextTester", e);
            return null;
        }
    }
}
