package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class cj0 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<cj0> CREATOR = new C1569fi(18);
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public cj0(int i, int i2, int i3, String str, String str2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i3);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 3, this.zzc);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 4, this.zzd);
        int i4 = this.zze;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(i4);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
