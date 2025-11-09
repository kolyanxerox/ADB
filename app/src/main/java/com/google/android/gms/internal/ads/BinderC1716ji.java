package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.zzv;

/* renamed from: com.google.android.gms.internal.ads.ji */
/* loaded from: classes2.dex */
public final class BinderC1716ji extends AbstractBinderC2181w2 {
    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        zzv.zzp().OooO0oo("FlagsAccessedBeforeInitialized", new C1382ae("Flags were accessed before initialized."));
        parcel2.writeNoException();
        return true;
    }
}
