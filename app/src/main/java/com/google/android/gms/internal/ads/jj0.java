package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class jj0 extends AbstractC2144v2 implements kj0 {
    @Override // com.google.android.gms.internal.ads.kj0
    public final void OooO00o(int i) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeInt(i);
        o000OO0O(parcelOooO, 7);
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void Ooooo00(int i) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeInt(i);
        o000OO0O(parcelOooO, 6);
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void Oooooo0(Oooo0o.OooO0OO oooO0OO, String str) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0o0(parcelOooO, oooO0OO);
        parcelOooO.writeString(str);
        parcelOooO.writeString(null);
        o000OO0O(parcelOooO, 8);
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void o0000O0O(byte[] bArr) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeByteArray(bArr);
        o000OO0O(parcelOooO, 5);
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void o0000oo0() {
        Parcel parcelOooO = OooO();
        parcelOooO.writeIntArray(null);
        o000OO0O(parcelOooO, 4);
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void zzf() {
        o000OO0O(OooO(), 3);
    }
}
