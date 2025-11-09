package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ia */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1672ia extends AbstractBinderC2181w2 implements InterfaceC1708ja {
    public AbstractBinderC1672ia() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
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
        String string = parcel.readString();
        AbstractC2218x2.OooO0O0(parcel);
        o0000OOO(c1378aa, string);
        parcel2.writeNoException();
        return true;
    }
}
