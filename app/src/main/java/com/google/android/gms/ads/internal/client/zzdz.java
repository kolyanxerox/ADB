package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public final class zzdz extends AbstractC2144v2 implements zzeb {
    public zzdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 5);
        int i = parcelOooOOO.readInt();
        parcelOooOOO.recycle();
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final zzee zzi() throws RemoteException {
        zzee zzecVar;
        Parcel parcelOooOOO = OooOOO(OooO(), 11);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            zzecVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzecVar = iInterfaceQueryLocalInterface instanceof zzee ? (zzee) iInterfaceQueryLocalInterface : new zzec(strongBinder);
        }
        parcelOooOOO.recycle();
        return zzecVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) throws RemoteException {
        Parcel parcelOooO = OooO();
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        parcelOooO.writeInt(z ? 1 : 0);
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws RemoteException {
        o000OO0O(OooO(), 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws RemoteException {
        o000OO0O(OooO(), 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(zzee zzeeVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, zzeeVar);
        o000OO0O(parcelOooO, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws RemoteException {
        o000OO0O(OooO(), 13);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 12);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 10);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 4);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }
}
