package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o0oOOo extends o00Oo00 {
    public static final Parcelable.Creator<o0oOOo> CREATOR = new o00OO000(12);
    public final String zza;
    public final byte[] zzb;

    public o0oOOo(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zza = string;
        this.zzb = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0oOOo.class == obj.getClass()) {
            o0oOOo o0oooo = (o0oOOo) obj;
            if (Objects.equals(this.zza, o0oooo.zza) && Arrays.equals(this.zzb, o0oooo.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        return Arrays.hashCode(this.zzb) + ((iHashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.google.android.gms.internal.ads.o00Oo00
    public final String toString() {
        return this.zzf + ": owner=" + this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public o0oOOo(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}
