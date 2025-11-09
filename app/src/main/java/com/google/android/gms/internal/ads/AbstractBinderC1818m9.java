package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.m9 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1818m9 extends AbstractBinderC2181w2 implements InterfaceC1892o9 {
    public AbstractBinderC1818m9() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static InterfaceC1892o9 zzdy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1892o9 ? (InterfaceC1892o9) iInterfaceQueryLocalInterface : new C1781l9(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1634h9 c1597g9;
        switch (i) {
            case 1:
                String string = parcel.readString();
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzdt(string, oooO0O0O000O0o0);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                Oooo0o.OooO0O0 oooO0O0Zzb = zzb(string2);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, oooO0O0Zzb);
                return true;
            case 3:
                Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzdx(oooO0O0O000O0o02);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                Oooo0o.OooO0O0 oooO0O0O000O0o03 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzdu(oooO0O0O000O0o03);
                parcel2.writeNoException();
                return true;
            case 7:
                Oooo0o.OooO0O0 oooO0O0O000O0o04 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzd(oooO0O0O000O0o04);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1597g9 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c1597g9 = iInterfaceQueryLocalInterface instanceof InterfaceC1634h9 ? (InterfaceC1634h9) iInterfaceQueryLocalInterface : new C1597g9(strongBinder);
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzdv(c1597g9);
                parcel2.writeNoException();
                return true;
            case 9:
                Oooo0o.OooO0O0 oooO0O0O000O0o05 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzdw(oooO0O0O000O0o05);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
