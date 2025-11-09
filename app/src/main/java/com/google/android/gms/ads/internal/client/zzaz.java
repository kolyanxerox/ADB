package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import Oooo0o.OooO0o;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractBinderC2077t9;
import com.google.android.gms.internal.ads.AbstractBinderC2188w9;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.C1489db;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.C2040s9;
import com.google.android.gms.internal.ads.C2151v9;
import com.google.android.gms.internal.ads.InterfaceC2114u9;
import com.google.android.gms.internal.ads.InterfaceC2225x9;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class zzaz extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ View f15996OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ HashMap f15997OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ HashMap f15998OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzba f15999OooO0o0;

    public zzaz(zzba zzbaVar, View view, HashMap map, HashMap map2) {
        this.f15996OooO0O0 = view;
        this.f15997OooO0OO = map;
        this.f15998OooO0Oo = map2;
        this.f15999OooO0o0 = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15996OooO0O0.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzk(new OooO0OO(this.f15996OooO0O0), new OooO0OO(this.f15997OooO0OO), new OooO0OO(this.f15998OooO0Oo));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        View view = this.f15996OooO0O0;
        AbstractC1448c7.OooO00o(view.getContext());
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0ooO)).booleanValue();
        zzba zzbaVar = this.f15999OooO0o0;
        HashMap map = this.f15998OooO0Oo;
        HashMap map2 = this.f15997OooO0OO;
        if (zBooleanValue) {
            try {
                OooO0OO oooO0OO = new OooO0OO(view);
                OooO0OO oooO0OO2 = new OooO0OO(map2);
                OooO0OO oooO0OO3 = new OooO0OO(map);
                C2151v9 c2151v9 = (C2151v9) ((InterfaceC2225x9) com.google.android.gms.ads.internal.util.client.zzs.zzb(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzay
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        int i = AbstractBinderC2188w9.f25267OooOo0O;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
                        return iInterfaceQueryLocalInterface instanceof InterfaceC2225x9 ? (InterfaceC2225x9) iInterfaceQueryLocalInterface : new C2151v9(iBinder);
                    }
                }));
                Parcel parcelOooO = c2151v9.OooO();
                AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
                AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO2);
                AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO3);
                Parcel parcelOooOOO = c2151v9.OooOOO(parcelOooO, 1);
                IBinder strongBinder = parcelOooOOO.readStrongBinder();
                parcelOooOOO.recycle();
                return AbstractBinderC2077t9.zze(strongBinder);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                C1643hi.OooO0OO(view.getContext()).OooO00o("ClientApiBroker.createNativeAdViewHolderDelegate", e);
                return null;
            }
        }
        C1489db c1489db = zzbaVar.f16005OooO0o;
        c1489db.getClass();
        try {
            OooO0OO oooO0OO4 = new OooO0OO(view);
            OooO0OO oooO0OO5 = new OooO0OO(map2);
            OooO0OO oooO0OO6 = new OooO0OO(map);
            C2151v9 c2151v92 = (C2151v9) ((InterfaceC2225x9) c1489db.OooO0Oo(view.getContext()));
            Parcel parcelOooO2 = c2151v92.OooO();
            AbstractC2218x2.OooO0o0(parcelOooO2, oooO0OO4);
            AbstractC2218x2.OooO0o0(parcelOooO2, oooO0OO5);
            AbstractC2218x2.OooO0o0(parcelOooO2, oooO0OO6);
            Parcel parcelOooOOO2 = c2151v92.OooOOO(parcelOooO2, 1);
            IBinder strongBinder2 = parcelOooOOO2.readStrongBinder();
            parcelOooOOO2.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2114u9 ? (InterfaceC2114u9) iInterfaceQueryLocalInterface : new C2040s9(strongBinder2);
        } catch (OooO0o e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (RemoteException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
