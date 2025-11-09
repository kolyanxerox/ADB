package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;
import com.google.android.gms.internal.ads.InterfaceC2156ve;

/* loaded from: classes2.dex */
public final class zzdv extends AbstractC2144v2 implements IInterface {
    public final zzdu zze(OooO0O0 oooO0O0, InterfaceC2156ve interfaceC2156ve, int i) throws RemoteException {
        zzdu zzdsVar;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 1);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            zzdsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdsVar = iInterfaceQueryLocalInterface instanceof zzdu ? (zzdu) iInterfaceQueryLocalInterface : new zzds(strongBinder);
        }
        parcelOooOOO.recycle();
        return zzdsVar;
    }
}
