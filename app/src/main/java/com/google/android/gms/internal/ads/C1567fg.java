package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.fg */
/* loaded from: classes2.dex */
public final class C1567fg extends AbstractC2144v2 implements InterfaceC1604gg {
    @Override // com.google.android.gms.internal.ads.InterfaceC1604gg
    public final void OooOo(zze zzeVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzeVar);
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1604gg
    public final void zze(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1604gg
    public final void zzf(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 2);
    }
}
