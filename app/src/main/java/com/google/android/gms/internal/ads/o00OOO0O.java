package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00OOO0O extends o00Oo00 {
    public static final Parcelable.Creator<o00OOO0O> CREATOR = new o00OO000(7);
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final o00Oo00[] zze;

    public o00OOO0O(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.zze = new o00Oo00[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zze[i3] = (o00Oo00) parcel.readParcelable(o00Oo00.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o00OOO0O.class == obj.getClass()) {
            o00OOO0O o00ooo0o = (o00OOO0O) obj;
            if (this.zzb == o00ooo0o.zzb && this.zzc == o00ooo0o.zzc && Objects.equals(this.zza, o00ooo0o.zza) && Arrays.equals(this.zzd, o00ooo0o.zzd) && Arrays.equals(this.zze, o00ooo0o.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return (((((this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (o00Oo00 o00oo00 : this.zze) {
            parcel.writeParcelable(o00oo00, 0);
        }
    }

    public o00OOO0O(String str, boolean z, boolean z2, String[] strArr, o00Oo00[] o00oo00Arr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = o00oo00Arr;
    }
}
