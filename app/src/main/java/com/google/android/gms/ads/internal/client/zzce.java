package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public abstract class zzce extends AbstractBinderC2181w2 implements zzcf {
    public zzce() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            zzft zzftVar = (zzft) AbstractC2218x2.OooO00o(parcel, zzft.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zze(zzftVar);
        } else {
            if (i != 2) {
                return false;
            }
            zzft zzftVar2 = (zzft) AbstractC2218x2.OooO00o(parcel, zzft.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zzf(zzftVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
