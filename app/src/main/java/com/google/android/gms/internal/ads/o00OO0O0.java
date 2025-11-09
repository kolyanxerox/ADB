package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o00OO0O0 implements InterfaceC1774l2 {
    public static final Parcelable.Creator<o00OO0O0> CREATOR = new o00OO000(1);
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public o00OO0O0(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public static o00OO0O0 OooO00o(r40 r40Var) {
        int iOooOOo0 = r40Var.OooOOo0();
        String strOooO0o0 = AbstractC1813m4.OooO0o0(r40Var.OooO0O0(r40Var.OooOOo0(), StandardCharsets.US_ASCII));
        String strOooO0O0 = r40Var.OooO0O0(r40Var.OooOOo0(), StandardCharsets.UTF_8);
        int iOooOOo02 = r40Var.OooOOo0();
        int iOooOOo03 = r40Var.OooOOo0();
        int iOooOOo04 = r40Var.OooOOo0();
        int iOooOOo05 = r40Var.OooOOo0();
        int iOooOOo06 = r40Var.OooOOo0();
        byte[] bArr = new byte[iOooOOo06];
        r40Var.OooO0o(bArr, 0, iOooOOo06);
        return new o00OO0O0(iOooOOo0, strOooO0o0, strOooO0O0, iOooOOo02, iOooOOo03, iOooOOo04, iOooOOo05, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1774l2
    public final void OooO0Oo(C1551f0 c1551f0) {
        c1551f0.OooO00o(this.zza, this.zzh);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o00OO0O0.class == obj.getClass()) {
            o00OO0O0 o00oo0o0 = (o00OO0O0) obj;
            if (this.zza == o00oo0o0.zza && this.zzb.equals(o00oo0o0.zzb) && this.zzc.equals(o00oo0o0.zzc) && this.zzd == o00oo0o0.zzd && this.zze == o00oo0o0.zze && this.zzf == o00oo0o0.zzf && this.zzg == o00oo0o0.zzg && Arrays.equals(this.zzh, o00oo0o0.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int iHashCode = this.zzb.hashCode() + (i * 31);
        int iHashCode2 = this.zzc.hashCode() + (iHashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((iHashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    public o00OO0O0(Parcel parcel) {
        this.zza = parcel.readInt();
        String string = parcel.readString();
        int i = i80.f19994OooO00o;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }
}
