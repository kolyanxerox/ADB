package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;

/* renamed from: com.google.android.gms.internal.ads.rj */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2013rj extends AbstractBinderC2181w2 implements InterfaceC2050sj {
    public AbstractBinderC2013rj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static InterfaceC2050sj zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2050sj ? (InterfaceC2050sj) iInterfaceQueryLocalInterface : new C1976qj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2309zj c2235xj = null;
        InterfaceC2309zj c2235xj2 = null;
        C1388ak c1388ak = null;
        InterfaceC2161vj c2087tj = null;
        switch (i) {
            case 1:
                zzm zzmVar = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c2235xj = iInterfaceQueryLocalInterface instanceof InterfaceC2309zj ? (InterfaceC2309zj) iInterfaceQueryLocalInterface : new C2235xj(strongBinder);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzf(zzmVar, c2235xj);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    c2087tj = iInterfaceQueryLocalInterface2 instanceof InterfaceC2161vj ? (InterfaceC2161vj) iInterfaceQueryLocalInterface2 : new C2087tj(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzk(c2087tj);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzm(oooO0O0O000O0o0);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c1388ak = iInterfaceQueryLocalInterface3 instanceof C1388ak ? (C1388ak) iInterfaceQueryLocalInterface3 : new C1388ak(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzp(c1388ak);
                parcel2.writeNoException();
                return true;
            case 7:
                C1571fk c1571fk = (C1571fk) AbstractC2218x2.OooO00o(parcel, C1571fk.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzl(c1571fk);
                parcel2.writeNoException();
                return true;
            case 8:
                zzdo zzdoVarZzb = zzdn.zzb(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzi(zzdoVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, bundleZzb);
                return true;
            case 10:
                Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                ClassLoader classLoader2 = AbstractC2218x2.f25497OooO00o;
                boolean z = parcel.readInt() != 0;
                AbstractC2218x2.OooO0O0(parcel);
                zzn(oooO0O0O000O0o02, z);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC1939pj interfaceC1939pjZzd = zzd();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1939pjZzd);
                return true;
            case 12:
                zzdy zzdyVarZzc = zzc();
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzdyVarZzc);
                return true;
            case 13:
                zzdr zzdrVarZzb = zzdq.zzb(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzj(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                zzm zzmVar2 = (zzm) AbstractC2218x2.OooO00o(parcel, zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c2235xj2 = iInterfaceQueryLocalInterface4 instanceof InterfaceC2309zj ? (InterfaceC2309zj) iInterfaceQueryLocalInterface4 : new C2235xj(strongBinder4);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzg(zzmVar2, c2235xj2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zOooO0o = AbstractC2218x2.OooO0o(parcel);
                AbstractC2218x2.OooO0O0(parcel);
                zzh(zOooO0o);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
