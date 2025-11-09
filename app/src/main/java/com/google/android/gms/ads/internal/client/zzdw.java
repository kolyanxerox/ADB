package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzdw extends AbstractC2144v2 implements zzdy {
    public zzdw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 5);
        Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcelOooOOO, Bundle.CREATOR);
        parcelOooOOO.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final zzw zzf() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 4);
        zzw zzwVar = (zzw) AbstractC2218x2.OooO00o(parcelOooOOO, zzw.CREATOR);
        parcelOooOOO.recycle();
        return zzwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 1);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 6);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzi() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 3);
        ArrayList arrayListCreateTypedArrayList = parcelOooOOO.createTypedArrayList(zzw.CREATOR);
        parcelOooOOO.recycle();
        return arrayListCreateTypedArrayList;
    }
}
