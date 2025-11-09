package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public abstract class zzdq extends AbstractBinderC2181w2 implements zzdr {
    public zzdq() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdr zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof zzdr ? (zzdr) iInterfaceQueryLocalInterface : new zzdp(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            zzu zzuVar = (zzu) AbstractC2218x2.OooO00o(parcel, zzu.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zze(zzuVar);
            parcel2.writeNoException();
            return true;
        }
        if (i != 2) {
            return false;
        }
        boolean zZzf = zzf();
        parcel2.writeNoException();
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        parcel2.writeInt(zZzf ? 1 : 0);
        return true;
    }
}
