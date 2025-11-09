package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ra */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2004ra extends AbstractBinderC2181w2 implements InterfaceC2041sa {
    public AbstractBinderC2004ra() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1379ab c2300za;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c2300za = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c2300za = iInterfaceQueryLocalInterface instanceof InterfaceC1379ab ? (InterfaceC1379ab) iInterfaceQueryLocalInterface : new C2300za(strongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        }
        AbstractC2218x2.OooO0O0(parcel);
        OoooOOO(c2300za);
        parcel2.writeNoException();
        return true;
    }
}
