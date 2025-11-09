package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractBinderC1572fl;
import com.google.android.gms.internal.ads.C1535el;
import com.google.android.gms.internal.ads.InterfaceC1609gl;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
final class zzah extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15957OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2156ve f15958OooO0OO;

    public zzah(Context context, InterfaceC2156ve interfaceC2156ve) {
        this.f15957OooO0O0 = context;
        this.f15958OooO0OO = interfaceC2156ve;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzq(new OooO0OO(this.f15957OooO0O0), this.f15958OooO0OO, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        Context context = this.f15957OooO0O0;
        OooO0OO oooO0OO = new OooO0OO(context);
        try {
            return ((C1535el) ((InterfaceC1609gl) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzag
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    int i = AbstractBinderC1572fl.f18961OooOo0O;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    return iInterfaceQueryLocalInterface instanceof InterfaceC1609gl ? (InterfaceC1609gl) iInterfaceQueryLocalInterface : new C1535el(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                }
            }))).o000O0o0(oooO0OO, this.f15958OooO0OO);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
