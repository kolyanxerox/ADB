package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public final class zzda extends AbstractC2144v2 implements IInterface {
    public zzda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder zze(OooO0O0 oooO0O0, int i) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 1);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        parcelOooOOO.recycle();
        return strongBinder;
    }
}
