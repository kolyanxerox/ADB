package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.mh */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1826mh extends AbstractBinderC2181w2 implements InterfaceC1863nh {
    public AbstractBinderC1826mh() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static InterfaceC1863nh zzI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1863nh ? (InterfaceC1863nh) iInterfaceQueryLocalInterface : new C1789lh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzl(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzt();
                parcel2.writeNoException();
                return true;
            case 4:
                zzr();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) AbstractC2218x2.OooO00o(parcel, Bundle.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzs(bundle2);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0Oo(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                zzx();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzH = zzH();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzH ? 1 : 0);
                return true;
            case 12:
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                Intent intent = (Intent) AbstractC2218x2.OooO00o(parcel, Intent.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzh(i2, i3, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzk(oooO0O0O000O0o0);
                parcel2.writeNoException();
                return true;
            case 14:
                zzv();
                parcel2.writeNoException();
                return true;
            case 15:
                int i4 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                AbstractC2218x2.OooO0O0(parcel);
                zzp(i4, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
