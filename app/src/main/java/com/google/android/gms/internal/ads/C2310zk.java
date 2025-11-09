package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zk */
/* loaded from: classes2.dex */
public final class C2310zk extends AbstractC2144v2 implements InterfaceC1389al {
    @Override // com.google.android.gms.internal.ads.InterfaceC1389al
    public final void o000000o(String str, Bundle bundle, String str2) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        parcelOooO.writeString(str2);
        AbstractC2218x2.OooO0OO(parcelOooO, bundle);
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1389al
    public final void zzb(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 2);
    }
}
