package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC1462cl;
import com.google.android.gms.internal.ads.AbstractBinderC1568fh;
import com.google.android.gms.internal.ads.AbstractBinderC1637hc;
import com.google.android.gms.internal.ads.AbstractBinderC1818m9;
import com.google.android.gms.internal.ads.AbstractBinderC1826mh;
import com.google.android.gms.internal.ads.AbstractBinderC2013rj;
import com.google.android.gms.internal.ads.AbstractBinderC2077t9;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.C1531eh;
import com.google.android.gms.internal.ads.C1600gc;
import com.google.android.gms.internal.ads.InterfaceC1499dl;
import com.google.android.gms.internal.ads.InterfaceC1563fc;
import com.google.android.gms.internal.ads.InterfaceC1570fj;
import com.google.android.gms.internal.ads.InterfaceC1605gh;
import com.google.android.gms.internal.ads.InterfaceC1674ic;
import com.google.android.gms.internal.ads.InterfaceC1863nh;
import com.google.android.gms.internal.ads.InterfaceC1892o9;
import com.google.android.gms.internal.ads.InterfaceC2050sj;
import com.google.android.gms.internal.ads.InterfaceC2114u9;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
public final class zzcn extends AbstractC2144v2 implements zzcp {
    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(OooO0O0 oooO0O0, String str, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 3);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelOooOOO.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(OooO0O0 oooO0O0, zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzsVar);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 13);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(OooO0O0 oooO0O0, zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzsVar);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 1);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(OooO0O0 oooO0O0, zzs zzsVar, String str, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzsVar);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 2);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(OooO0O0 oooO0O0, zzs zzsVar, String str, int i) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzsVar);
        parcelOooO.writeString(str);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 10);
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

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        zzci zzcgVar;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 18);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            zzcgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcgVar = iInterfaceQueryLocalInterface instanceof zzci ? (zzci) iInterfaceQueryLocalInterface : new zzcg(strongBinder);
        }
        parcelOooOOO.recycle();
        return zzcgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(OooO0O0 oooO0O0, int i) throws RemoteException {
        zzcz zzcxVar;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 9);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            zzcxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcxVar = iInterfaceQueryLocalInterface instanceof zzcz ? (zzcz) iInterfaceQueryLocalInterface : new zzcx(strongBinder);
        }
        parcelOooOOO.recycle();
        return zzcxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        zzdu zzdsVar;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 17);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            zzdsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdsVar = iInterfaceQueryLocalInterface instanceof zzdu ? (zzdu) iInterfaceQueryLocalInterface : new zzds(strongBinder);
        }
        parcelOooOOO.recycle();
        return zzdsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1892o9 zzj(OooO0O0 oooO0O0, OooO0O0 oooO0O02) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O02);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 5);
        InterfaceC1892o9 interfaceC1892o9Zzdy = AbstractBinderC1818m9.zzdy(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return interfaceC1892o9Zzdy;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC2114u9 zzk(OooO0O0 oooO0O0, OooO0O0 oooO0O02, OooO0O0 oooO0O03) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O02);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O03);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 11);
        InterfaceC2114u9 interfaceC2114u9Zze = AbstractBinderC2077t9.zze(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return interfaceC2114u9Zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1674ic zzl(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i, InterfaceC1563fc interfaceC1563fc) throws RemoteException {
        InterfaceC1674ic c1600gc;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1563fc);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 16);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        int i2 = AbstractBinderC1637hc.f19694OooOo0O;
        if (strongBinder == null) {
            c1600gc = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            c1600gc = iInterfaceQueryLocalInterface instanceof InterfaceC1674ic ? (InterfaceC1674ic) iInterfaceQueryLocalInterface : new C1600gc(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1600gc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1605gh zzm(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        InterfaceC1605gh c1531eh;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 15);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        int i2 = AbstractBinderC1568fh.f18947OooOo0O;
        if (strongBinder == null) {
            c1531eh = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c1531eh = iInterfaceQueryLocalInterface instanceof InterfaceC1605gh ? (InterfaceC1605gh) iInterfaceQueryLocalInterface : new C1531eh(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1531eh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1863nh zzn(OooO0O0 oooO0O0) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 8);
        InterfaceC1863nh interfaceC1863nhZzI = AbstractBinderC1826mh.zzI(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return interfaceC1863nhZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1570fj zzo(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC2050sj zzp(OooO0O0 oooO0O0, String str, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 12);
        InterfaceC2050sj interfaceC2050sjZzq = AbstractBinderC2013rj.zzq(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return interfaceC2050sjZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final InterfaceC1499dl zzq(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 14);
        InterfaceC1499dl interfaceC1499dlZzb = AbstractBinderC1462cl.zzb(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return interfaceC1499dlZzb;
    }
}
