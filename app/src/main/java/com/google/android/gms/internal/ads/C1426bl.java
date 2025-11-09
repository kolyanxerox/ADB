package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bl */
/* loaded from: classes2.dex */
public final class C1426bl extends AbstractC2144v2 implements InterfaceC1499dl {
    public C1426bl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final Oooo0o.OooO0O0 zze(Oooo0o.OooO0O0 oooO0O0, Oooo0o.OooO0O0 oooO0O02, String str, Oooo0o.OooO0O0 oooO0O03) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O02);
        parcelOooO.writeString(str);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O03);
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(parcelOooO, 11));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzf(Oooo0o.OooO0O0 oooO0O0, C1646hl c1646hl, InterfaceC1389al interfaceC1389al) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0OO(parcelOooO, c1646hl);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC1389al);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzg(C1532ei c1532ei) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, c1532ei);
        o000OO0O(parcelOooO, 7);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzh(List list, Oooo0o.OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeTypedList(list);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2270yh);
        o000OO0O(parcelOooO, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzi(List list, Oooo0o.OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeTypedList(list);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2270yh);
        o000OO0O(parcelOooO, 9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzj(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzk(Oooo0o.OooO0O0 oooO0O0) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzl(List list, Oooo0o.OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeTypedList(list);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2270yh);
        o000OO0O(parcelOooO, 6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1499dl
    public final void zzm(List list, Oooo0o.OooO0O0 oooO0O0, InterfaceC2270yh interfaceC2270yh) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeTypedList(list);
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0O0);
        AbstractC2218x2.OooO0o0(parcelOooO, interfaceC2270yh);
        o000OO0O(parcelOooO, 5);
    }
}
