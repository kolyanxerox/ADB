package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.oj */
/* loaded from: classes2.dex */
public final class C1903oj extends AbstractC2144v2 implements InterfaceC1939pj {
    public C1903oj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939pj
    public final int zze() {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        int i = parcelOooOOO.readInt();
        parcelOooOOO.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939pj
    public final String zzf() {
        Parcel parcelOooOOO = OooOOO(OooO(), 1);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }
}
