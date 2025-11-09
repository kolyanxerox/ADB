package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.xj */
/* loaded from: classes2.dex */
public final class C2235xj extends AbstractC2144v2 implements InterfaceC2309zj {
    public C2235xj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zze(int i) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeInt(i);
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zzf(zze zzeVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzeVar);
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2309zj
    public final void zzg() {
        o000OO0O(OooO(), 1);
    }
}
