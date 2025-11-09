package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.C1414b9;
import com.google.android.gms.internal.ads.C1418bd;
import com.google.android.gms.internal.ads.InterfaceC1524ea;
import com.google.android.gms.internal.ads.InterfaceC1598ga;
import com.google.android.gms.internal.ads.InterfaceC1601gd;
import com.google.android.gms.internal.ads.InterfaceC1708ja;
import com.google.android.gms.internal.ads.InterfaceC1819ma;
import com.google.android.gms.internal.ads.InterfaceC1930pa;
import com.google.android.gms.internal.ads.InterfaceC2041sa;

/* loaded from: classes2.dex */
public final class zzbs extends AbstractC2144v2 implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbr zze() throws RemoteException {
        zzbr zzbpVar;
        Parcel parcelOooOOO = OooOOO(OooO(), 1);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            zzbpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbpVar = iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        parcelOooOOO.recycle();
        return zzbpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(InterfaceC1524ea interfaceC1524ea) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(InterfaceC1598ga interfaceC1598ga) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, InterfaceC1819ma interfaceC1819ma, InterfaceC1708ja interfaceC1708ja) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1819ma);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1708ja);
        o000OO0O(parcelOooO, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(InterfaceC1601gd interfaceC1601gd) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(InterfaceC1930pa interfaceC1930pa, zzs zzsVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1930pa);
        AbstractC2218x2.OooO0OO(parcelOooO, zzsVar);
        o000OO0O(parcelOooO, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(InterfaceC2041sa interfaceC2041sa) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2041sa);
        o000OO0O(parcelOooO, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(zzbl zzblVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, zzblVar);
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, adManagerAdViewOptions);
        o000OO0O(parcelOooO, 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(C1418bd c1418bd) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(C1414b9 c1414b9) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, c1414b9);
        o000OO0O(parcelOooO, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzcq zzcqVar) throws RemoteException {
        throw null;
    }
}
