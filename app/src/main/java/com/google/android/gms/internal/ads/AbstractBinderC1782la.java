package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.la */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1782la extends AbstractBinderC2181w2 implements InterfaceC1819ma {
    public AbstractBinderC1782la() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1415ba c1378aa;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c1378aa = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c1378aa = iInterfaceQueryLocalInterface instanceof InterfaceC1415ba ? (InterfaceC1415ba) iInterfaceQueryLocalInterface : new C1378aa(strongBinder);
        }
        AbstractC2218x2.OooO0O0(parcel);
        o000oOoO(c1378aa);
        parcel2.writeNoException();
        return true;
    }
}
