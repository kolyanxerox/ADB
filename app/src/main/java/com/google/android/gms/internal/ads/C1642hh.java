package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.hh */
/* loaded from: classes2.dex */
public final class C1642hh extends AbstractC2144v2 implements InterfaceC1715jh {
    public final InterfaceC1605gh o000O0o0(Oooo0o.OooO0OO oooO0OO, InterfaceC2156ve interfaceC2156ve) {
        InterfaceC1605gh c1531eh;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 1);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1531eh = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c1531eh = iInterfaceQueryLocalInterface instanceof InterfaceC1605gh ? (InterfaceC1605gh) iInterfaceQueryLocalInterface : new C1531eh(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1531eh;
    }
}
