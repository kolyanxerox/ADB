package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class o000O0o extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<o000O0o> CREATOR = new o000Oo0(0);
    public final long zza;
    public final long zzb;
    public final boolean zzc;

    @Nullable
    public final Bundle zzd;

    @Nullable
    public final String zze;

    public o000O0o(long j, long j2, boolean z, Bundle bundle, String str) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = bundle;
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 8);
        parcel.writeLong(j);
        long j2 = this.zzb;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 8);
        parcel.writeLong(j2);
        boolean z = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOOOo(7, this.zzd, parcel);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 8, this.zze);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
