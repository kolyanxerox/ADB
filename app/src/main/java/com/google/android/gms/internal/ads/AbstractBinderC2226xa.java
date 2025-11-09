package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xa */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2226xa extends AbstractBinderC2181w2 implements InterfaceC2263ya {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            AbstractC2218x2.OooO0O0(parcel);
            ((BinderC1495dh) this).zzf(string);
        } else {
            if (i != 2) {
                return false;
            }
            ((BinderC1495dh) this).zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
