package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class oo0O implements InterfaceC1774l2 {
    public static final Parcelable.Creator<oo0O> CREATOR = new o00OO000(3);
    public final int zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public oo0O(String str, String str2, boolean z, int i, String str3, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        af0.OoooO0(z2);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1774l2
    public final void OooO0Oo(C1551f0 c1551f0) {
        String str = this.zzc;
        if (str != null) {
            c1551f0.f18740OooOo0O = str;
        }
        String str2 = this.zzb;
        if (str2 != null) {
            c1551f0.OooOo0 = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oo0O.class == obj.getClass()) {
            oo0O oo0o = (oo0O) obj;
            if (this.zza == oo0o.zza && Objects.equals(this.zzb, oo0o.zzb) && Objects.equals(this.zzc, oo0o.zzc) && Objects.equals(this.zzd, oo0o.zzd) && this.zze == oo0o.zze && this.zzf == oo0o.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = ((i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i2 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        int i2 = i80.f19994OooO00o;
        parcel.writeInt(this.zze ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    public oo0O(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }
}
