package com.google.android.gms.appset;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzc extends o000O000 {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    private final String zza;
    private final int zzb;

    public zzc(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, this.zza);
        int i2 = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i2);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
