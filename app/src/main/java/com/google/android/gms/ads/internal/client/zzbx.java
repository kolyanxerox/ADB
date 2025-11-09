package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.C1644hj;
import com.google.android.gms.internal.ads.C1742k7;
import com.google.android.gms.internal.ads.C2048sh;
import com.google.android.gms.internal.ads.C2122uh;
import com.google.android.gms.internal.ads.C2293z3;
import com.google.android.gms.internal.ads.InterfaceC1409b4;
import com.google.android.gms.internal.ads.InterfaceC1681ij;
import com.google.android.gms.internal.ads.InterfaceC1779l7;
import com.google.android.gms.internal.ads.InterfaceC2085th;
import com.google.android.gms.internal.ads.InterfaceC2159vh;

/* loaded from: classes2.dex */
public abstract class zzbx extends AbstractBinderC2181w2 implements zzby {
    public zzbx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzby zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        zzbl zzbjVar = null;
        zzct zzcrVar = null;
        zzbo zzbmVar = null;
        zzdr zzdpVar = null;
        InterfaceC1409b4 c2293z3 = null;
        zzcc zzcaVar = null;
        InterfaceC1681ij c1644hj = null;
        zzcq zzcqVar = null;
        zzbi zzbgVar = null;
        InterfaceC1779l7 c1742k7 = null;
        InterfaceC2159vh c2122uh = null;
        InterfaceC2085th c2048sh = null;
        zzcm zzckVar = null;
        switch (i) {
            case 1:
                OooO0O0 oooO0O0Zzn = zzn();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0Zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzaa = zzaa();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                boolean zZzab = zzab(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbjVar = iInterfaceQueryLocalInterface instanceof zzbl ? (zzbl) iInterfaceQueryLocalInterface : new zzbj(strongBinder);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzD(zzbjVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzckVar = iInterfaceQueryLocalInterface2 instanceof zzcm ? (zzcm) iInterfaceQueryLocalInterface2 : new zzck(strongBinder2);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzG(zzckVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzs zzsVarZzg = zzg();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, zzsVarZzg);
                return true;
            case 13:
                zzs zzsVar = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzF(zzsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    c2048sh = iInterfaceQueryLocalInterface3 instanceof InterfaceC2085th ? (InterfaceC2085th) iInterfaceQueryLocalInterface3 : new C2048sh(strongBinder3, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzM(c2048sh);
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    c2122uh = iInterfaceQueryLocalInterface4 instanceof InterfaceC2159vh ? (InterfaceC2159vh) iInterfaceQueryLocalInterface4 : new C2122uh(strongBinder4, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                }
                String string = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                zzQ(c2122uh, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    c1742k7 = iInterfaceQueryLocalInterface5 instanceof InterfaceC1779l7 ? (InterfaceC1779l7) iInterfaceQueryLocalInterface5 : new C1742k7(strongBinder5, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzO(c1742k7);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbgVar = iInterfaceQueryLocalInterface6 instanceof zzbi ? (zzbi) iInterfaceQueryLocalInterface6 : new zzbg(strongBinder6, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzC(zzbgVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = iInterfaceQueryLocalInterface7 instanceof zzcq ? (zzcq) iInterfaceQueryLocalInterface7 : new zzcq(strongBinder7);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzac(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zOooO0o = AbstractC2218x2.OooO0o(parcel);
                AbstractC2218x2.OooO0O0(parcel);
                zzN(zOooO0o);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                ClassLoader classLoader2 = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c1644hj = iInterfaceQueryLocalInterface8 instanceof InterfaceC1681ij ? (InterfaceC1681ij) iInterfaceQueryLocalInterface8 : new C1644hj(strongBinder8);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzS(c1644hj);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzeb zzebVarZzl = zzl();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzebVarZzl);
                return true;
            case 29:
                zzga zzgaVar = (zzga) AbstractC2218x2.OooO00o(parcel, zzga.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzU(zzgaVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzef zzefVar = (zzef) AbstractC2218x2.OooO00o(parcel, zzef.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzK(zzefVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                zzcm zzcmVarZzj = zzj();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzcmVarZzj);
                return true;
            case 33:
                zzbl zzblVarZzi = zzi();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzblVarZzi);
                return true;
            case 34:
                boolean zOooO0o2 = AbstractC2218x2.OooO0o(parcel);
                AbstractC2218x2.OooO0O0(parcel);
                zzL(zOooO0o2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzcaVar = iInterfaceQueryLocalInterface9 instanceof zzcc ? (zzcc) iInterfaceQueryLocalInterface9 : new zzca(strongBinder9);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzE(zzcaVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzy zzyVar = (zzy) AbstractC2218x2.OooO00o(parcel, zzy.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzI(zzyVar);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    c2293z3 = iInterfaceQueryLocalInterface10 instanceof InterfaceC1409b4 ? (InterfaceC1409b4) iInterfaceQueryLocalInterface10 : new C2293z3(strongBinder10, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzH(c2293z3);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdy zzdyVarZzk = zzk();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzdyVarZzk);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdpVar = iInterfaceQueryLocalInterface11 instanceof zzdr ? (zzdr) iInterfaceQueryLocalInterface11 : new zzdp(strongBinder11);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzP(zzdpVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbmVar = iInterfaceQueryLocalInterface12 instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface12 : new zzbm(strongBinder12, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzy(zzmVar2, zzbmVar);
                parcel2.writeNoException();
                return true;
            case 44:
                OooO0O0 oooO0O0O000O0o0 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzW(oooO0O0O000O0o0);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcrVar = iInterfaceQueryLocalInterface13 instanceof zzct ? (zzct) iInterfaceQueryLocalInterface13 : new zzcr(strongBinder13, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzJ(zzcrVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                ClassLoader classLoader3 = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
        }
    }
}
