package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o00OOO00 extends o00Oo00 {
    public static final Parcelable.Creator<o00OOO00> CREATOR = new o00OO000(5);
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public o00OOO00(Parcel parcel) {
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        super(string);
        this.zza = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o00OOO00.class == obj.getClass()) {
            o00OOO00 o00ooo00 = (o00OOO00) obj;
            if (this.zzf.equals(o00ooo00.zzf) && Arrays.equals(this.zza, o00ooo00.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return Arrays.hashCode(this.zza) + (iHashCode * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public o00OOO00(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}
