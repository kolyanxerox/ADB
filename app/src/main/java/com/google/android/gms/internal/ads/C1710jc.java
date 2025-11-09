package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.jc */
/* loaded from: classes2.dex */
public final class C1710jc extends AbstractC2144v2 implements InterfaceC1784lc {
    public final InterfaceC1674ic o000O0o0(Oooo0o.OooO0OO oooO0OO, InterfaceC2156ve interfaceC2156ve, BinderC1490dc binderC1490dc) {
        InterfaceC1674ic c1600gc;
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2156ve);
        parcelOooO.writeInt(244410000);
        AbstractC2218x2.OooO0o0(parcelOooO, binderC1490dc);
        Parcel parcelOooOOO = OooOOO(parcelOooO, 1);
        IBinder strongBinder = parcelOooOOO.readStrongBinder();
        if (strongBinder == null) {
            c1600gc = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            c1600gc = iInterfaceQueryLocalInterface instanceof InterfaceC1674ic ? (InterfaceC1674ic) iInterfaceQueryLocalInterface : new C1600gc(strongBinder);
        }
        parcelOooOOO.recycle();
        return c1600gc;
    }
}
