package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public final class zzbm extends AbstractC2144v2 implements zzbo {
    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(zze zzeVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzeVar);
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() throws RemoteException {
        o000OO0O(OooO(), 1);
    }
}
