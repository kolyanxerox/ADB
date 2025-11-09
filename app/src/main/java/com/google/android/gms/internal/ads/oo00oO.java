package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class oo00oO extends o00Oo00 {
    public static final Parcelable.Creator<oo00oO> CREATOR = new o00OO000(11);
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public oo00oO(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.o00Oo00, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oo00oO.class == obj.getClass()) {
            oo00oO oo00oo = (oo00oO) obj;
            if (this.zza == oo00oo.zza && this.zzb == oo00oo.zzb && this.zzc == oo00oo.zzc && Arrays.equals(this.zzd, oo00oo.zzd) && Arrays.equals(this.zze, oo00oo.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzd;
        int iHashCode = Arrays.hashCode(iArr) + (((((i * 31) + this.zzb) * 31) + this.zzc) * 31);
        return Arrays.hashCode(this.zze) + (iHashCode * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeIntArray(this.zzd);
        parcel.writeIntArray(this.zze);
    }

    public oo00oO(Parcel parcel) {
        super("MLLT");
        this.zza = parcel.readInt();
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = i80.f19994OooO00o;
        this.zzd = iArrCreateIntArray;
        this.zze = parcel.createIntArray();
    }
}
