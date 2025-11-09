package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzef extends o000O000 {
    public static final Parcelable.Creator<zzef> CREATOR = new zzeg();
    public final int zza;

    public zzef(int i) {
        this.zza = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i2);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
