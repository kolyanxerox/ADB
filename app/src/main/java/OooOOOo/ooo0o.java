package OoooOOO;

import OooOoo0.o000OOo;
import Oooo00o.o000O000;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class ooo0o extends o000O000 {
    public static final Parcelable.Creator<ooo0o> CREATOR = new o000OOo(23);
    public final long zza;
    public byte[] zzb;
    public final String zzc;
    public final Bundle zzd;
    public final int zze;
    public final long zzf;
    public String zzg;

    public ooo0o(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.zza = j;
        this.zzb = bArr;
        this.zzc = str;
        this.zzd = bundle;
        this.zze = i;
        this.zzf = j2;
        this.zzg = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 8);
        parcel.writeLong(j);
        o00oO0o.OooOOo0(parcel, 2, this.zzb);
        o00oO0o.OooOo0(parcel, 3, this.zzc);
        o00oO0o.OooOOOo(4, this.zzd, parcel);
        int i2 = this.zze;
        o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(i2);
        long j2 = this.zzf;
        o00oO0o.OooOooo(parcel, 6, 8);
        parcel.writeLong(j2);
        o00oO0o.OooOo0(parcel, 7, this.zzg);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
