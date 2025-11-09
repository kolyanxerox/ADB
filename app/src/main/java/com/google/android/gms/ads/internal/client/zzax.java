package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import Oooo0o.OooO0o;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractBinderC1818m9;
import com.google.android.gms.internal.ads.AbstractBinderC1966q9;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.C1452cb;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.C1781l9;
import com.google.android.gms.internal.ads.C1929p9;
import com.google.android.gms.internal.ads.InterfaceC1892o9;
import com.google.android.gms.internal.ads.InterfaceC2003r9;

/* loaded from: classes2.dex */
final class zzax extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f15992OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f15993OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f15994OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzba f15995OooO0o0;

    public zzax(zzba zzbaVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f15992OooO0O0 = frameLayout;
        this.f15993OooO0OO = frameLayout2;
        this.f15994OooO0Oo = context;
        this.f15995OooO0o0 = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15994OooO0Oo, "native_ad_view_delegate");
        return new zzfn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzj(new OooO0OO(this.f15992OooO0O0), new OooO0OO(this.f15993OooO0OO));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        Context context = this.f15994OooO0Oo;
        AbstractC1448c7.OooO00o(context);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0ooO)).booleanValue();
        zzba zzbaVar = this.f15995OooO0o0;
        FrameLayout frameLayout = this.f15993OooO0OO;
        FrameLayout frameLayout2 = this.f15992OooO0O0;
        if (zBooleanValue) {
            try {
                OooO0OO oooO0OO = new OooO0OO(context);
                OooO0OO oooO0OO2 = new OooO0OO(frameLayout2);
                OooO0OO oooO0OO3 = new OooO0OO(frameLayout);
                C1929p9 c1929p9 = (C1929p9) ((InterfaceC2003r9) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaw
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        int i = AbstractBinderC1966q9.f23547OooOo0O;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
                        return iInterfaceQueryLocalInterface instanceof InterfaceC2003r9 ? (InterfaceC2003r9) iInterfaceQueryLocalInterface : new C1929p9(iBinder);
                    }
                }));
                Parcel parcelOooO = c1929p9.OooO();
                AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
                AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO2);
                AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO3);
                parcelOooO.writeInt(244410000);
                Parcel parcelOooOOO = c1929p9.OooOOO(parcelOooO, 1);
                IBinder strongBinder = parcelOooOOO.readStrongBinder();
                parcelOooOOO.recycle();
                return AbstractBinderC1818m9.zzdy(strongBinder);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                C1643hi.OooO0OO(context).OooO00o("ClientApiBroker.createNativeAdViewDelegate", e);
                return null;
            }
        }
        C1452cb c1452cb = zzbaVar.f16004OooO0Oo;
        c1452cb.getClass();
        try {
            OooO0OO oooO0OO4 = new OooO0OO(context);
            OooO0OO oooO0OO5 = new OooO0OO(frameLayout2);
            OooO0OO oooO0OO6 = new OooO0OO(frameLayout);
            C1929p9 c1929p92 = (C1929p9) ((InterfaceC2003r9) c1452cb.OooO0Oo(context));
            Parcel parcelOooO2 = c1929p92.OooO();
            AbstractC2218x2.OooO0o0(parcelOooO2, oooO0OO4);
            AbstractC2218x2.OooO0o0(parcelOooO2, oooO0OO5);
            AbstractC2218x2.OooO0o0(parcelOooO2, oooO0OO6);
            parcelOooO2.writeInt(244410000);
            Parcel parcelOooOOO2 = c1929p92.OooOOO(parcelOooO2, 1);
            IBinder strongBinder2 = parcelOooOOO2.readStrongBinder();
            parcelOooOOO2.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1892o9 ? (InterfaceC1892o9) iInterfaceQueryLocalInterface : new C1781l9(strongBinder2);
        } catch (OooO0o e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
