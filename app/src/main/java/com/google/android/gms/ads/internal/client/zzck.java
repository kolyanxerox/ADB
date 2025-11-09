package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;

/* loaded from: classes2.dex */
public final class zzck extends AbstractC2144v2 implements zzcm {
    public zzck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(String str, String str2) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        parcelOooO.writeString(str2);
        o000OO0O(parcelOooO, 1);
    }
}
