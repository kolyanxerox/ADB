package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;

/* loaded from: classes2.dex */
public final class zzdf extends AbstractC2144v2 implements zzdh {
    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zze() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 1);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzf() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }
}
