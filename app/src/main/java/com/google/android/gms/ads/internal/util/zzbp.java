package com.google.android.gms.ads.internal.util;

import Oooo0o.OooO0O0;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public final class zzbp extends AbstractC2144v2 implements zzbr {
    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(OooO0O0 oooO0O0) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(OooO0O0 oooO0O0, String str, String str2) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        parcelOooO.writeString(str);
        parcelOooO.writeString(str2);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 1);
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(OooO0O0 oooO0O0, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, zzaVar);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 3);
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }
}
