package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00OOO0 extends o00Oo00 {
    public static final Parcelable.Creator<o00OOO0> CREATOR = new o00OO000(6);
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final o00Oo00[] zzg;

    public o00OOO0(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i2 = parcel.readInt();
        this.zzg = new o00Oo00[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzg[i3] = (o00Oo00) parcel.readParcelable(o00Oo00.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.o00Oo00, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o00OOO0.class == obj.getClass()) {
            o00OOO0 o00ooo0 = (o00OOO0) obj;
            if (this.zzb == o00ooo0.zzb && this.zzc == o00ooo0.zzc && this.zzd == o00ooo0.zzd && this.zze == o00ooo0.zze && Objects.equals(this.zza, o00ooo0.zza) && Arrays.equals(this.zzg, o00ooo0.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return ((((((((this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (o00Oo00 o00oo00 : this.zzg) {
            parcel.writeParcelable(o00oo00, 0);
        }
    }

    public o00OOO0(String str, int i, int i2, long j, long j2, o00Oo00[] o00oo00Arr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = o00oo00Arr;
    }
}
