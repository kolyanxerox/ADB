package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.p008h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.AbstractBinderC1747kc;
import com.google.android.gms.internal.ads.BinderC1490dc;
import com.google.android.gms.internal.ads.BinderC1858nc;
import com.google.android.gms.internal.ads.C1710jc;
import com.google.android.gms.internal.ads.InterfaceC1784lc;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
final class zzal extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Context f15961OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2156ve f15962OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OnH5AdsEventListener f15963OooO0Oo;

    public zzal(Context context, InterfaceC2156ve interfaceC2156ve, OnH5AdsEventListener onH5AdsEventListener) {
        this.f15961OooO0O0 = context;
        this.f15962OooO0OO = interfaceC2156ve;
        this.f15963OooO0Oo = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zza() {
        return new BinderC1858nc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzl(new OooO0OO(this.f15961OooO0O0), this.f15962OooO0OO, 244410000, new BinderC1490dc(this.f15963OooO0Oo));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        Context context = this.f15961OooO0O0;
        OooO0OO oooO0OO = new OooO0OO(context);
        try {
            return ((C1710jc) ((InterfaceC1784lc) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzak
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    int i = AbstractBinderC1747kc.f20475OooOo0O;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof InterfaceC1784lc ? (InterfaceC1784lc) iInterfaceQueryLocalInterface : new C1710jc(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
                }
            }))).o000O0o0(oooO0OO, this.f15962OooO0OO, new BinderC1490dc(this.f15963OooO0Oo));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
