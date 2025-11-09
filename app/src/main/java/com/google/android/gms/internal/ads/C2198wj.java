package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.wj */
/* loaded from: classes2.dex */
public final class C2198wj extends AbstractC2144v2 {
    public final IBinder zze(Oooo0o.OooO0O0 oooO0O0, String str, InterfaceC2156ve interfaceC2156ve, int i) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 1);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        parcelOooOOO.recycle();
        return strongBinder;
    }
}
