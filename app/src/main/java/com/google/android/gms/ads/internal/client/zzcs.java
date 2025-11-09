package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public abstract class zzcs extends AbstractBinderC2181w2 implements zzct {
    public zzcs() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zzd(zzeVar);
        } else if (i == 2) {
            zzf();
        } else if (i == 3) {
            zzc();
        } else if (i == 4) {
            zze();
        } else {
            if (i != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
