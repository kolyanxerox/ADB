package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class ac0 implements InterfaceC1774l2 {
    public static final Parcelable.Creator<ac0> CREATOR = new C1569fi(13);
    public final long zza;
    public final long zzb;
    public final long zzc;

    public ac0(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
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
        if (!(obj instanceof ac0)) {
            return false;
        }
        ac0 ac0Var = (ac0) obj;
        return this.zza == ac0Var.zza && this.zzb == ac0Var.zzb && this.zzc == ac0Var.zzc;
    }

    public final int hashCode() {
        long j = this.zza;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.zzc;
        long j3 = this.zzb;
        return ((((i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    public /* synthetic */ ac0(Parcel parcel) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }
}
