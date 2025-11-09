package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public abstract class zzbq extends AbstractBinderC2181w2 implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            zzm zzmVar = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zzg(zzmVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
            return true;
        }
        if (i == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
            parcel2.writeInt(zZzi ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzm zzmVar2 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
        int i2 = parcel.readInt();
        AbstractC2218x2.OooO0O0(parcel);
        zzh(zzmVar2, i2);
        parcel2.writeNoException();
        return true;
    }
}
