package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractBinderC2228xc;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.BinderC2082te;
import com.google.android.gms.internal.ads.InterfaceC2156ve;
import com.google.android.gms.internal.ads.InterfaceC2265yc;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzcy extends AbstractBinderC2181w2 implements zzcz {
    public zzcy() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        zzdl zzdjVar;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                AbstractC2218x2.OooO0O0(parcel);
                zzq(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zOooO0o = AbstractC2218x2.OooO0o(parcel);
                AbstractC2218x2.OooO0O0(parcel);
                zzp(zOooO0o);
                parcel2.writeNoException();
                return true;
            case 5:
                OooO0O0 oooO0O0O000O0o0 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                zzn(oooO0O0O000O0o0, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                OooO0O0 oooO0O0O000O0o02 = OooO0OO.o000O0o0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzl(string3, oooO0O0O000O0o02);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC2156ve interfaceC2156veO000O0O0 = BinderC2082te.o000O0O0(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzo(interfaceC2156veO000O0O0);
                parcel2.writeNoException();
                return true;
            case 12:
                InterfaceC2265yc interfaceC2265ycZzc = AbstractBinderC2228xc.zzc(parcel.readStrongBinder());
                AbstractC2218x2.OooO0O0(parcel);
                zzs(interfaceC2265ycZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzfv zzfvVar = (zzfv) AbstractC2218x2.OooO00o(parcel, zzfv.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                zzu(zzfvVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdjVar = iInterfaceQueryLocalInterface instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface : new zzdj(strongBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                AbstractC2218x2.OooO0O0(parcel);
                zzm(zzdjVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zOooO0o2 = AbstractC2218x2.OooO0o(parcel);
                AbstractC2218x2.OooO0O0(parcel);
                zzj(zOooO0o2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
