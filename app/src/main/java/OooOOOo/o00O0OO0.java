package OoooOOO;

import OooOoo0.o000OOo;
import Oooo00O.o000000O;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class o00O0OO0 extends o000O000 {
    public static final Parcelable.Creator<o00O0OO0> CREATOR = new o000OOo(18);

    @Nullable
    public String zza;
    public String zzb;
    public oOO000o zzc;
    public long zzd;
    public boolean zze;

    @Nullable
    public String zzf;

    @Nullable
    public final o00OOOOo zzg;
    public long zzh;

    @Nullable
    public o00OOOOo zzi;
    public final long zzj;

    @Nullable
    public final o00OOOOo zzk;

    public o00O0OO0(o00O0OO0 o00o0oo0) {
        o000000O.OooO0oo(o00o0oo0);
        this.zza = o00o0oo0.zza;
        this.zzb = o00o0oo0.zzb;
        this.zzc = o00o0oo0.zzc;
        this.zzd = o00o0oo0.zzd;
        this.zze = o00o0oo0.zze;
        this.zzf = o00o0oo0.zzf;
        this.zzg = o00o0oo0.zzg;
        this.zzh = o00o0oo0.zzh;
        this.zzi = o00o0oo0.zzi;
        this.zzj = o00o0oo0.zzj;
        this.zzk = o00o0oo0.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 2, this.zza);
        o00oO0o.OooOo0(parcel, 3, this.zzb);
        o00oO0o.OooOo00(parcel, 4, this.zzc, i);
        long j = this.zzd;
        o00oO0o.OooOooo(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.zze;
        o00oO0o.OooOooo(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        o00oO0o.OooOo0(parcel, 7, this.zzf);
        o00oO0o.OooOo00(parcel, 8, this.zzg, i);
        long j2 = this.zzh;
        o00oO0o.OooOooo(parcel, 9, 8);
        parcel.writeLong(j2);
        o00oO0o.OooOo00(parcel, 10, this.zzi, i);
        long j3 = this.zzj;
        o00oO0o.OooOooo(parcel, 11, 8);
        parcel.writeLong(j3);
        o00oO0o.OooOo00(parcel, 12, this.zzk, i);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public o00O0OO0(String str, String str2, oOO000o ooo000o, long j, boolean z, String str3, o00OOOOo o00ooooo, long j2, o00OOOOo o00ooooo2, long j3, o00OOOOo o00ooooo3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = ooo000o;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = o00ooooo;
        this.zzh = j2;
        this.zzi = o00ooooo2;
        this.zzj = j3;
        this.zzk = o00ooooo3;
    }
}
