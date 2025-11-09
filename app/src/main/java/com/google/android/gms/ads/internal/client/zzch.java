package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.BinderC2082te;
import com.google.android.gms.internal.ads.InterfaceC2050sj;
import com.google.android.gms.internal.ads.InterfaceC2156ve;
import com.google.android.gms.internal.ads.InterfaceC2256y3;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzch extends AbstractBinderC2181w2 implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        zzcf zzcdVar;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzft.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzcdVar = iInterfaceQueryLocalInterface instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface : new zzcd(strongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzi(arrayListCreateTypedArrayList, zzcdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                boolean zZzl = zzl(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC2050sj interfaceC2050sjZzg = zzg(string2);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC2050sjZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                boolean zZzj = zzj(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                InterfaceC2256y3 interfaceC2256y3Zze = zze(string4);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, interfaceC2256y3Zze);
                return true;
            case 6:
                String string5 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                boolean zZzk = zzk(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                zzby zzbyVarZzf = zzf(string6);
                parcel2.writeNoException();
                AbstractC2218x2.OooO0o0(parcel2, zzbyVarZzf);
                return true;
            case 8:
                InterfaceC2156ve interfaceC2156veO000O0O0 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzh(interfaceC2156veO000O0O0);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
