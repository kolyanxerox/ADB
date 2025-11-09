package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.BinderC2082te;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
public final class zzcu extends AbstractC2144v2 implements zzcw {
    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final InterfaceC2156ve getAdapterCreator() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        InterfaceC2156ve interfaceC2156veO000O0O0 = BinderC2082te.o000O0O0(parcelOooOOO.readStrongBinder());
        parcelOooOOO.recycle();
        return interfaceC2156veO000O0O0;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final zzfb getLiteSdkVersion() throws RemoteException {
        Parcel parcelOooOOO = OooOOO(OooO(), 1);
        zzfb zzfbVar = (zzfb) AbstractC2218x2.OooO00o(parcelOooOOO, zzfb.CREATOR);
        parcelOooOOO.recycle();
        return zzfbVar;
    }
}
