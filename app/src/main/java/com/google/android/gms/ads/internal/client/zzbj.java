package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public final class zzbj extends AbstractC2144v2 implements zzbl {
    public zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws RemoteException {
        o000OO0O(OooO(), 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws RemoteException {
        o000OO0O(OooO(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeInt(i);
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zzeVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzeVar);
        o000OO0O(parcelOooO, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() throws RemoteException {
        o000OO0O(OooO(), 7);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() throws RemoteException {
        o000OO0O(OooO(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws RemoteException {
        o000OO0O(OooO(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws RemoteException {
        o000OO0O(OooO(), 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() throws RemoteException {
        o000OO0O(OooO(), 9);
    }
}
