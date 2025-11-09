package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class o0O0000O implements Parcelable {
    public static final Parcelable.Creator<o0O0000O> CREATOR = new o00OO000(17);
    public final long zza;
    public final long zzb;
    public final int zzc;

    public o0O0000O(long j, long j2, int i) {
        af0.OoooO0(j < j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0O0000O.class == obj.getClass()) {
            o0O0000O o0o0000o = (o0O0000O) obj;
            if (this.zza == o0o0000o.zza && this.zzb == o0o0000o.zzb && this.zzc == o0o0000o.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)});
    }

    public final String toString() {
        long j = this.zza;
        long j2 = this.zzb;
        int i = this.zzc;
        Locale locale = Locale.US;
        StringBuilder sbOooOOo = OooO0oO.OooOo.OooOOo(j, "Segment: startTimeMs=", ", endTimeMs=");
        sbOooOOo.append(j2);
        sbOooOOo.append(", speedDivisor=");
        sbOooOOo.append(i);
        return sbOooOOo.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeInt(this.zzc);
    }
}
