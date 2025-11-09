package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.BinderC2082te;
import com.google.android.gms.internal.ads.C1526ec;
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
public abstract class zzco extends AbstractBinderC2181w2 implements zzcp {
    public zzco() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        InterfaceC1563fc c1526ec = null;
        switch (i) {
            case 1:
                OooO0O0 oooO0O0O000O0o0 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzs zzsVar = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                String string = parcel.readString();
                InterfaceC2156ve interfaceC2156veO000O0O0 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                zzby zzbyVarZzd = zzd(oooO0O0O000O0o0, zzsVar, string, interfaceC2156veO000O0O0, i2);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzbyVarZzd);
                return true;
            case 2:
                OooO0O0 oooO0O0O000O0o02 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzs zzsVar2 = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                String string2 = parcel.readString();
                InterfaceC2156ve interfaceC2156veO000O0O02 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                zzby zzbyVarZze = zze(oooO0O0O000O0o02, zzsVar2, string2, interfaceC2156veO000O0O02, i3);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzbyVarZze);
                return true;
            case 3:
                OooO0O0 oooO0O0O000O0o03 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                String string3 = parcel.readString();
                InterfaceC2156ve interfaceC2156veO000O0O03 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                zzbu zzbuVarZzb = zzb(oooO0O0O000O0o03, string3, interfaceC2156veO000O0O03, i4);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzbuVarZzb);
                return true;
            case 4:
                OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                OooO0O0 oooO0O0O000O0o04 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                OooO0O0 oooO0O0O000O0o05 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC1892o9 interfaceC1892o9Zzj = zzj(oooO0O0O000O0o04, oooO0O0O000O0o05);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1892o9Zzj);
                return true;
            case 6:
                OooO0O0 oooO0O0O000O0o06 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2156ve interfaceC2156veO000O0O04 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC1570fj interfaceC1570fjZzo = zzo(oooO0O0O000O0o06, interfaceC2156veO000O0O04, i5);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1570fjZzo);
                return true;
            case 7:
                OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                OooO0O0 oooO0O0O000O0o07 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC1863nh interfaceC1863nhZzn = zzn(oooO0O0O000O0o07);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1863nhZzn);
                return true;
            case 9:
                OooO0O0 oooO0O0O000O0o08 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                zzcz zzczVarZzh = zzh(oooO0O0O000O0o08, i6);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzczVarZzh);
                return true;
            case 10:
                OooO0O0 oooO0O0O000O0o09 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzs zzsVar3 = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                String string4 = parcel.readString();
                int i7 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                zzby zzbyVarZzf = zzf(oooO0O0O000O0o09, zzsVar3, string4, i7);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzbyVarZzf);
                return true;
            case 11:
                OooO0O0 oooO0O0O000O0o010 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                OooO0O0 oooO0O0O000O0o011 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                OooO0O0 oooO0O0O000O0o012 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC2114u9 interfaceC2114u9Zzk = zzk(oooO0O0O000O0o010, oooO0O0O000O0o011, oooO0O0O000O0o012);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC2114u9Zzk);
                return true;
            case 12:
                OooO0O0 oooO0O0O000O0o013 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                String string5 = parcel.readString();
                InterfaceC2156ve interfaceC2156veO000O0O05 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC2050sj interfaceC2050sjZzp = zzp(oooO0O0O000O0o013, string5, interfaceC2156veO000O0O05, i8);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC2050sjZzp);
                return true;
            case 13:
                OooO0O0 oooO0O0O000O0o014 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                zzs zzsVar4 = (zzs) AbstractC2218x2.OooO00o(parcel, zzs.CREATOR);
                String string6 = parcel.readString();
                InterfaceC2156ve interfaceC2156veO000O0O06 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                zzby zzbyVarZzc = zzc(oooO0O0O000O0o014, zzsVar4, string6, interfaceC2156veO000O0O06, i9);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzbyVarZzc);
                return true;
            case 14:
                OooO0O0 oooO0O0O000O0o015 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2156ve interfaceC2156veO000O0O07 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC1499dl interfaceC1499dlZzq = zzq(oooO0O0O000O0o015, interfaceC2156veO000O0O07, i10);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1499dlZzq);
                return true;
            case 15:
                OooO0O0 oooO0O0O000O0o016 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2156ve interfaceC2156veO000O0O08 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC1605gh interfaceC1605ghZzm = zzm(oooO0O0O000O0o016, interfaceC2156veO000O0O08, i11);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1605ghZzm);
                return true;
            case 16:
                OooO0O0 oooO0O0O000O0o017 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2156ve interfaceC2156veO000O0O09 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    c1526ec = iInterfaceQueryLocalInterface instanceof InterfaceC1563fc ? (InterfaceC1563fc) iInterfaceQueryLocalInterface : new C1526ec(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC1674ic interfaceC1674icZzl = zzl(oooO0O0O000O0o017, interfaceC2156veO000O0O09, i12, c1526ec);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC1674icZzl);
                return true;
            case 17:
                OooO0O0 oooO0O0O000O0o018 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2156ve interfaceC2156veO000O0O010 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                zzdu zzduVarZzi = zzi(oooO0O0O000O0o018, interfaceC2156veO000O0O010, i13);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzduVarZzi);
                return true;
            case 18:
                OooO0O0 oooO0O0O000O0o019 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2156ve interfaceC2156veO000O0O011 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                zzci zzciVarZzg = zzg(oooO0O0O000O0o019, interfaceC2156veO000O0O011, i14);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzciVarZzg);
                return true;
            default:
                return false;
        }
    }
}
