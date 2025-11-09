package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public final class zzec extends AbstractC2144v2 implements zzee {
    public zzec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() throws RemoteException {
        o000OO0O(OooO(), 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z) throws RemoteException {
        Parcel parcelOooO = OooO();
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        parcelOooO.writeInt(z ? 1 : 0);
        o000OO0O(parcelOooO, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() throws RemoteException {
        o000OO0O(OooO(), 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() throws RemoteException {
        o000OO0O(OooO(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() throws RemoteException {
        o000OO0O(OooO(), 1);
    }
}
