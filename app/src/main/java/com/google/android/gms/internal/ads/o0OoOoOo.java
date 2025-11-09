package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class o0OoOoOo implements InterfaceC1774l2 {
    public static final Parcelable.Creator<o0OoOoOo> CREATOR = new o00OO000(18);
    public final float zza;
    public final int zzb;

    public o0OoOoOo(float f, int i) {
        this.zza = f;
        this.zzb = i;
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
        if (obj != null && o0OoOoOo.class == obj.getClass()) {
            o0OoOoOo o0oooooo = (o0OoOoOo) obj;
            if (this.zza == o0oooooo.zza && this.zzb == o0oooooo.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    public /* synthetic */ o0OoOoOo(Parcel parcel) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }
}
