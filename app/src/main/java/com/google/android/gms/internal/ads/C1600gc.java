package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.gc */
/* loaded from: classes2.dex */
public final class C1600gc extends AbstractC2144v2 implements InterfaceC1674ic {
    public C1600gc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1674ic
    public final void zze() {
        o000OO0O(OooO(), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1674ic
    public final void zzf(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 1);
    }
}
