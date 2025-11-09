package com.google.android.gms.ads.internal.util;

import Oooo0o.OooO0O0;
import Oooo0o.OooO0OO;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2181w2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public abstract class zzbq extends AbstractBinderC2181w2 implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            OooO0O0 oooO0O0O000O0o0 = OooO0OO.o000O0o0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            boolean zZzf = zzf(oooO0O0O000O0o0, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
            return true;
        }
        if (i == 2) {
            OooO0O0 oooO0O0O000O0o02 = OooO0OO.o000O0o0(parcel.readStrongBinder());
            AbstractC2218x2.OooO0O0(parcel);
            zze(oooO0O0O000O0o02);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        OooO0O0 oooO0O0O000O0o03 = OooO0OO.o000O0o0(parcel.readStrongBinder());
        com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) AbstractC2218x2.OooO00o(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
        AbstractC2218x2.OooO0O0(parcel);
        boolean zZzg = zzg(oooO0O0O000O0o03, zzaVar);
        parcel2.writeNoException();
        parcel2.writeInt(zZzg ? 1 : 0);
        return true;
    }
}
