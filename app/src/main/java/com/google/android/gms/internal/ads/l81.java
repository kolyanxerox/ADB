package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class l81 implements Parcelable {
    public static final Parcelable.Creator<l81> CREATOR = new C1569fi(21);
    public final UUID zza;

    @Nullable
    public final String zzb;
    public final String zzc;

    @Nullable
    public final byte[] zzd;
    private int zze;

    public l81(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zzc = string;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l81)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l81 l81Var = (l81) obj;
        return Objects.equals(this.zzb, l81Var.zzb) && Objects.equals(this.zzc, l81Var.zzc) && Objects.equals(this.zza, l81Var.zza) && Arrays.equals(this.zzd, l81Var.zzd);
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iHashCode2 = Arrays.hashCode(this.zzd) + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.zzc);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public l81(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = AbstractC1813m4.OooO0o0(str);
        this.zzd = bArr;
    }
}
