package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.cl */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1462cl extends AbstractBinderC2181w2 implements InterfaceC1499dl {
    public static InterfaceC1499dl zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1499dl ? (InterfaceC1499dl) iInterfaceQueryLocalInterface : new C1426bl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1389al c2310zk = null;
        switch (i) {
            case 1:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                C1646hl c1646hl = (C1646hl) AbstractC2218x2.OooO00o(parcel, C1646hl.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    c2310zk = iInterfaceQueryLocalInterface instanceof InterfaceC1389al ? (InterfaceC1389al) iInterfaceQueryLocalInterface : new C2310zk(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzf(oooO0O0O000O0o0, c1646hl, c2310zk);
                parcel2.writeNoException();
                return true;
            case 2:
                Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzk(oooO0O0O000O0o02);
                parcel2.writeNoException();
                return true;
            case 3:
                Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o03 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2270yh interfaceC2270yhO000O0O0 = AbstractBinderC2233xh.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzm(arrayListCreateTypedArrayList, oooO0O0O000O0o03, interfaceC2270yhO000O0O0);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o04 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2270yh interfaceC2270yhO000O0O02 = AbstractBinderC2233xh.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzl(arrayListCreateTypedArrayList2, oooO0O0O000O0o04, interfaceC2270yhO000O0O02);
                parcel2.writeNoException();
                return true;
            case 7:
                C1532ei c1532ei = (C1532ei) AbstractC2218x2.OooO00o(parcel, C1532ei.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzg(c1532ei);
                parcel2.writeNoException();
                return true;
            case 8:
                Oooo0o.OooO0O0 oooO0O0O000O0o05 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzj(oooO0O0O000O0o05);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o06 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2270yh interfaceC2270yhO000O0O03 = AbstractBinderC2233xh.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzi(arrayListCreateTypedArrayList3, oooO0O0O000O0o06, interfaceC2270yhO000O0O03);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                Oooo0o.OooO0O0 oooO0O0O000O0o07 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                InterfaceC2270yh interfaceC2270yhO000O0O04 = AbstractBinderC2233xh.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzh(arrayListCreateTypedArrayList4, oooO0O0O000O0o07, interfaceC2270yhO000O0O04);
                parcel2.writeNoException();
                return true;
            case 11:
                Oooo0o.OooO0O0 oooO0O0O000O0o08 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                Oooo0o.OooO0O0 oooO0O0O000O0o09 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                String string = parcel.readString();
                Oooo0o.OooO0O0 oooO0O0O000O0o010 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                Oooo0o.OooO0O0 oooO0O0Zze = zze(oooO0O0O000O0o08, oooO0O0O000O0o09, string, oooO0O0O000O0o010);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0Zze);
                return true;
            default:
                return false;
        }
    }
}
