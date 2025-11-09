package com.google.android.gms.ads.internal.client;

import Oooo0o.OooO0O0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2144v2;
import com.google.android.gms.internal.ads.AbstractC2218x2;

/* loaded from: classes2.dex */
public final class zzds extends AbstractC2144v2 implements zzdu {
    public zzds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String str, OooO0O0 oooO0O0, OooO0O0 oooO0O02) throws RemoteException {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O02);
        o000OO0O(parcelOooO, 1);
    }
}
