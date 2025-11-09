package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.z3 */
/* loaded from: classes2.dex */
public final class C2293z3 extends AbstractC2144v2 implements InterfaceC1409b4 {
    @Override // com.google.android.gms.internal.ads.InterfaceC1409b4
    public final void OooOo00(InterfaceC2256y3 interfaceC2256y3) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2256y3);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409b4
    public final void o0000oOO(zze zzeVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzeVar);
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409b4
    public final void zzb(int i) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeInt(i);
        o000OO0O(parcelOooO, 2);
    }
}
