package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class fb0 implements InterfaceC1774l2 {
    public static final Parcelable.Creator<fb0> CREATOR = new C1569fi(12);
    public final float zza;
    public final float zzb;

    public fb0(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        af0.OoooOOo("Invalid latitude or longitude", z);
        this.zza = f;
        this.zzb = f2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1774l2
    public final /* synthetic */ void OooO0Oo(C1551f0 c1551f0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fb0.class == obj.getClass()) {
            fb0 fb0Var = (fb0) obj;
            if (this.zza == fb0Var.zza && this.zzb == fb0Var.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    public /* synthetic */ fb0(Parcel parcel) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
