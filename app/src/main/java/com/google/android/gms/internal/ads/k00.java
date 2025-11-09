package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class k00 extends AbstractBinderC2181w2 implements InterfaceC1527ed {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            AbstractC2218x2.OooO0O0(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1527ed
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1527ed
    public final void zzf() {
    }
}
