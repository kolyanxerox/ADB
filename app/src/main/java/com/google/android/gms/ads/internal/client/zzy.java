package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.appopen.AppOpenAd;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzy extends o000O000 {
    public static final Parcelable.Creator<zzy> CREATOR = new zzz();

    @AppOpenAd.AppOpenAdOrientation
    public final int zza;

    public zzy(@AppOpenAd.AppOpenAdOrientation int i) {
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
