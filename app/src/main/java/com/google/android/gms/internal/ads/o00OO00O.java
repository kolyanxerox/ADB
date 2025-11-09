package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o00OO00O implements InterfaceC1774l2 {
    public static final Parcelable.Creator<o00OO00O> CREATOR;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzf;

    static {
        jb1 jb1Var = new jb1();
        jb1Var.OooO0OO("application/id3");
        new o0OoOo0(jb1Var);
        jb1 jb1Var2 = new jb1();
        jb1Var2.OooO0OO("application/x-scte35");
        new o0OoOo0(jb1Var2);
        CREATOR = new o00OO000(0);
    }

    public o00OO00O(String str, String str2, long j, long j2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = bArr;
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
        if (obj != null && o00OO00O.class == obj.getClass()) {
            o00OO00O o00oo00o = (o00OO00O) obj;
            if (this.zzc == o00oo00o.zzc && this.zzd == o00oo00o.zzd && Objects.equals(this.zza, o00oo00o.zza) && Objects.equals(this.zzb, o00oo00o.zzb) && Arrays.equals(this.zze, o00oo00o.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i2 = iHashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j = this.zzc;
        long j2 = this.zzd;
        int iHashCode3 = Arrays.hashCode(this.zze) + (((((((i2 * 31) + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        this.zzf = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.zza + ", id=" + this.zzd + ", durationMs=" + this.zzc + ", value=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    public o00OO00O(Parcel parcel) {
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }
}
