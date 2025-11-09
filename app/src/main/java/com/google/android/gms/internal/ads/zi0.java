package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zi0 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<zi0> CREATOR = new C1569fi(16);
    public final int zza;
    public final String zzb;
    public final String zzc;

    public zi0(int i, String str, String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 2, this.zzb);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 3, this.zzc);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
