package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzfv extends o000O000 {
    public static final Parcelable.Creator<zzfv> CREATOR = new zzfw();
    public final int zza;
    public final int zzb;

    public zzfv(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i3);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public zzfv(RequestConfiguration requestConfiguration) {
        this.zza = requestConfiguration.getTagForChildDirectedTreatment();
        this.zzb = requestConfiguration.getTagForUnderAgeOfConsent();
    }
}
