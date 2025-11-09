package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00OOOO0 extends o00Oo00 {
    public static final Parcelable.Creator<o00OOOO0> CREATOR = new o00OO000(9);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public o00OOOO0(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o00OOOO0.class == obj.getClass()) {
            o00OOOO0 o00oooo0 = (o00OOOO0) obj;
            if (Objects.equals(this.zza, o00oooo0.zza) && Objects.equals(this.zzb, o00oooo0.zzb) && Objects.equals(this.zzc, o00oooo0.zzc) && Arrays.equals(this.zzd, o00oooo0.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = iHashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str3 = this.zzc;
        return Arrays.hashCode(this.zzd) + (((((i * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.o00Oo00
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", filename=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public o00OOOO0(byte[] bArr, String str, String str2, String str3) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }
}
