package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public final class zzbp extends AbstractC2144v2 implements zzbr {
    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzmVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(zzm zzmVar, int i) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzmVar);
        parcelOooO.writeInt(i);
        o000OO0O(parcelOooO, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 3);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }
}
