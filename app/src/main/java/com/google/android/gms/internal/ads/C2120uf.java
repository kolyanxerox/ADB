package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.uf */
/* loaded from: classes2.dex */
public final class C2120uf extends AbstractC2144v2 implements InterfaceC2157vf {
    public C2120uf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2157vf
    public final void OooOOo0(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2157vf
    public final void o000O000(InterfaceC1456cf interfaceC1456cf) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1456cf);
        o000OO0O(parcelOooO, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2157vf
    public final void zze(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString("Adapter returned null.");
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2157vf
    public final void zzf(zze zzeVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzeVar);
        o000OO0O(parcelOooO, 3);
    }
}
