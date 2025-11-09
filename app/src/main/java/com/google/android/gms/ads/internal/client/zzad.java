package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0OO;
import Oooo0o.OooO0o;
import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractBinderC1826mh;
import com.google.android.gms.internal.ads.AbstractBinderC1937ph;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.C1752kh;
import com.google.android.gms.internal.ads.C1789lh;
import com.google.android.gms.internal.ads.C1901oh;
import com.google.android.gms.internal.ads.InterfaceC1863nh;
import com.google.android.gms.internal.ads.InterfaceC1974qh;

/* loaded from: classes2.dex */
final class zzad extends zzbb {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Activity f15953OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ zzba f15954OooO0OO;

    public zzad(zzba zzbaVar, Activity activity) {
        this.f15953OooO0O0 = activity;
        this.f15954OooO0OO = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.OooO00o(this.f15953OooO0O0, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzn(new OooO0OO(this.f15953OooO0O0));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        Activity activity = this.f15953OooO0O0;
        AbstractC1448c7.OooO00o(activity);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oo0ooO)).booleanValue();
        zzba zzbaVar = this.f15954OooO0OO;
        if (zBooleanValue) {
            try {
                OooO0OO oooO0OO = new OooO0OO(activity);
                C1901oh c1901oh = (C1901oh) ((InterfaceC1974qh) com.google.android.gms.ads.internal.util.client.zzs.zzb(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzac
                    @Override // com.google.android.gms.ads.internal.util.client.zzq
                    public final Object zza(Object obj) {
                        IBinder iBinder = (IBinder) obj;
                        int i = AbstractBinderC1937ph.f23346OooOo0O;
                        if (iBinder == null) {
                            return null;
                        }
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
                        return iInterfaceQueryLocalInterface instanceof InterfaceC1974qh ? (InterfaceC1974qh) iInterfaceQueryLocalInterface : new C1901oh(iBinder);
                    }
                }));
                Parcel parcelOooO = c1901oh.OooO();
                AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
                Parcel parcelOooOOO = c1901oh.OooOOO(parcelOooO, 1);
                IBinder strongBinder = parcelOooOOO.readStrongBinder();
                parcelOooOOO.recycle();
                return AbstractBinderC1826mh.zzI(strongBinder);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                C1643hi.OooO0OO(activity.getApplicationContext()).OooO00o("ClientApiBroker.createAdOverlay", e);
                return null;
            }
        }
        C1752kh c1752kh = zzbaVar.f16006OooO0o0;
        c1752kh.getClass();
        try {
            OooO0OO oooO0OO2 = new OooO0OO(activity);
            C1901oh c1901oh2 = (C1901oh) ((InterfaceC1974qh) c1752kh.OooO0Oo(activity));
            Parcel parcelOooO2 = c1901oh2.OooO();
            AbstractC2218x2.OooO0o0(parcelOooO2, oooO0OO2);
            Parcel parcelOooOOO2 = c1901oh2.OooOOO(parcelOooO2, 1);
            IBinder strongBinder2 = parcelOooOOO2.readStrongBinder();
            parcelOooOOO2.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1863nh ? (InterfaceC1863nh) iInterfaceQueryLocalInterface : new C1789lh(strongBinder2);
        } catch (OooO0o e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote AdOverlay.", e2);
            return null;
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote AdOverlay.", e3);
            return null;
        }
    }
}
