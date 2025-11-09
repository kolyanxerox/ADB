package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.el */
/* loaded from: classes2.dex */
public final class C1535el extends AbstractC2144v2 implements InterfaceC1609gl {
    public final InterfaceC1499dl o000O0o0(Oooo0o.OooO0OO oooO0OO, InterfaceC2156ve interfaceC2156ve) {
        InterfaceC1499dl c1426bl;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 2);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1426bl = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c1426bl = iInterfaceQueryLocalInterface instanceof InterfaceC1499dl ? (InterfaceC1499dl) iInterfaceQueryLocalInterface : new C1426bl(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1426bl;
    }
}
