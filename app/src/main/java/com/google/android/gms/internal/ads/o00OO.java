package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00OO extends o00Oo00 {
    public static final Parcelable.Creator<o00OO> CREATOR = new o00OO000(4);
    public final String zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public o00OO(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.o00Oo00, com.google.android.gms.internal.ads.InterfaceC1774l2
    public final void OooO0Oo(C1551f0 c1551f0) {
        c1551f0.OooO00o(this.zzc, this.zzd);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o00OO.class == obj.getClass()) {
            o00OO o00oo = (o00OO) obj;
            if (this.zzc == o00oo.zzc && Objects.equals(this.zza, o00oo.zza) && Objects.equals(this.zzb, o00oo.zzb) && Arrays.equals(this.zzd, o00oo.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zzc;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((((((i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.o00Oo00
    public final String toString() {
        return this.zzf + ": mimeType=" + this.zza + ", description=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public o00OO(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = bArr;
    }
}
