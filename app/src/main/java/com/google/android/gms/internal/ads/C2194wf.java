package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.wf */
/* loaded from: classes2.dex */
public final class C2194wf extends AbstractC2144v2 implements InterfaceC2231xf {
    @Override // com.google.android.gms.internal.ads.InterfaceC2231xf
    public final void zze(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString("Adapter returned null.");
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2231xf
    public final void zzf(zze zzeVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzeVar);
        o000OO0O(parcelOooO, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2231xf
    public final void zzg() {
        o000OO0O(OooO(), 2);
    }
}
