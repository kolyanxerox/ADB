package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.uc */
/* loaded from: classes2.dex */
public final class C2117uc extends AbstractC2144v2 implements InterfaceC2154vc {
    @Override // com.google.android.gms.internal.ads.InterfaceC2154vc
    public final void zze(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2154vc
    public final void zzf() {
        o000OO0O(OooO(), 2);
    }
}
