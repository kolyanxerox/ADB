package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2013rj;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.BinderC1396as;
import com.google.android.gms.internal.ads.C2219x3;
import com.google.android.gms.internal.ads.InterfaceC2050sj;
import com.google.android.gms.internal.ads.InterfaceC2156ve;
import com.google.android.gms.internal.ads.InterfaceC2256y3;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcg extends AbstractC2144v2 implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final InterfaceC2256y3 zze(String str) throws RemoteException {
        InterfaceC2256y3 c2219x3;
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 5);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        int i = BinderC1396as.f17090OooOoOO;
        if (strongBinder == null) {
            c2219x3 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            c2219x3 = iInterfaceQueryLocalInterface instanceof InterfaceC2256y3 ? (InterfaceC2256y3) iInterfaceQueryLocalInterface : new C2219x3(strongBinder);
        }
        parcelOooOOO.recycle();
        return c2219x3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzby zzf(String str) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 7);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(strongBinder);
        }
        parcelOooOOO.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final InterfaceC2050sj zzg(String str) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 3);
        InterfaceC2050sj interfaceC2050sjZzq = AbstractBinderC2013rj.zzq(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return interfaceC2050sjZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(InterfaceC2156ve interfaceC2156ve) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        o000OO0O(parcelOooO, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list, zzcf zzcfVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeTypedList(list);
        AbstractC2218x2.OooO0o0(parcelOooO, zzcfVar);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String str) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 4);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String str) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 6);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String str) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 2);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }
}
