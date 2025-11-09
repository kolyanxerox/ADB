package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class lj0 extends AbstractBinderC2181w2 implements kj0 {
    public lj0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void OooO00o(int i) {
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void Ooooo00(int i) {
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void o0000O0O(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC2218x2.OooO0O0(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC2218x2.OooO0O0(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                break;
            case 8:
                Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC2218x2.OooO0O0(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void o0000oo0() {
    }

    @Override // com.google.android.gms.internal.ads.kj0
    public final void Oooooo0(Oooo0o.OooO0OO oooO0OO, String str) {
    }
}
