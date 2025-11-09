package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.l9 */
/* loaded from: classes2.dex */
public final class C1781l9 extends AbstractC2144v2 implements InterfaceC1892o9 {
    public C1781l9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final Oooo0o.OooO0O0 zzb(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(parcelOooO, 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final void zzc() {
        o000OO0O(OooO(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final void zzd(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final void zzdt(String str, Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final void zzdu(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final void zzdv(InterfaceC1634h9 interfaceC1634h9) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1634h9);
        o000OO0O(parcelOooO, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final void zzdw(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final void zzdx(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1892o9
    public final void zze(Oooo0o.OooO0O0 oooO0O0, int i) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        parcelOooO.writeInt(i);
        o000OO0O(parcelOooO, 5);
    }
}
