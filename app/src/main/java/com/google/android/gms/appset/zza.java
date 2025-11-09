package com.google.android.gms.appset;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zza extends o000O000 {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public zza(@Nullable String str, @Nullable String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, this.zza);
        o00oO0o.OooOo0(parcel, 2, this.zzb);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
