package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.s9 */
/* loaded from: classes2.dex */
public final class C2040s9 extends AbstractC2144v2 implements InterfaceC2114u9 {
    public C2040s9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2114u9
    public final void zzb(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2114u9
    public final void zzc(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2114u9
    public final void zzd() {
        o000OO0O(OooO(), 2);
    }
}
