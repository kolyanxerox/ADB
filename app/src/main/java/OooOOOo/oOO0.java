package OoooOOO;

import OooOoo0.o000OOo;
import Oooo00O.o000000O;
import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class oOO0 extends o000O000 {
    public static final Parcelable.Creator<oOO0> CREATOR = new o000OOo(27);
    public final long zzA;

    @Nullable
    public final String zzB;
    public final String zzC;
    public final long zzD;
    public final int zzE;

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;
    public final long zze;
    public final long zzf;

    @Nullable
    public final String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;

    @Nullable
    public final String zzk;
    public final long zzl;
    public final int zzm;
    public final boolean zzn;
    public final boolean zzo;

    @Nullable
    public final Boolean zzp;
    public final long zzq;

    @Nullable
    public final List zzr;
    public final String zzs;
    public final String zzt;

    @Nullable
    public final String zzu;
    public final boolean zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    public oOO0(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        o000000O.OooO0o0(str);
        this.zza = str;
        this.zzb = true == TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 2, str);
        o00oO0o.OooOo0(parcel, 3, this.zzb);
        o00oO0o.OooOo0(parcel, 4, this.zzc);
        o00oO0o.OooOo0(parcel, 5, this.zzd);
        long j = this.zze;
        o00oO0o.OooOooo(parcel, 6, 8);
        parcel.writeLong(j);
        long j2 = this.zzf;
        o00oO0o.OooOooo(parcel, 7, 8);
        parcel.writeLong(j2);
        o00oO0o.OooOo0(parcel, 8, this.zzg);
        boolean z = this.zzh;
        o00oO0o.OooOooo(parcel, 9, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzi;
        o00oO0o.OooOooo(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j3 = this.zzj;
        o00oO0o.OooOooo(parcel, 11, 8);
        parcel.writeLong(j3);
        o00oO0o.OooOo0(parcel, 12, this.zzk);
        long j4 = this.zzl;
        o00oO0o.OooOooo(parcel, 14, 8);
        parcel.writeLong(j4);
        int i2 = this.zzm;
        o00oO0o.OooOooo(parcel, 15, 4);
        parcel.writeInt(i2);
        boolean z3 = this.zzn;
        o00oO0o.OooOooo(parcel, 16, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzo;
        o00oO0o.OooOooo(parcel, 18, 4);
        parcel.writeInt(z4 ? 1 : 0);
        Boolean bool = this.zzp;
        if (bool != null) {
            o00oO0o.OooOooo(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        long j5 = this.zzq;
        o00oO0o.OooOooo(parcel, 22, 8);
        parcel.writeLong(j5);
        o00oO0o.OooOo0o(parcel, 23, this.zzr);
        o00oO0o.OooOo0(parcel, 25, this.zzs);
        o00oO0o.OooOo0(parcel, 26, this.zzt);
        o00oO0o.OooOo0(parcel, 27, this.zzu);
        boolean z5 = this.zzv;
        o00oO0o.OooOooo(parcel, 28, 4);
        parcel.writeInt(z5 ? 1 : 0);
        long j6 = this.zzw;
        o00oO0o.OooOooo(parcel, 29, 8);
        parcel.writeLong(j6);
        int i3 = this.zzx;
        o00oO0o.OooOooo(parcel, 30, 4);
        parcel.writeInt(i3);
        o00oO0o.OooOo0(parcel, 31, this.zzy);
        int i4 = this.zzz;
        o00oO0o.OooOooo(parcel, 32, 4);
        parcel.writeInt(i4);
        long j7 = this.zzA;
        o00oO0o.OooOooo(parcel, 34, 8);
        parcel.writeLong(j7);
        o00oO0o.OooOo0(parcel, 35, this.zzB);
        o00oO0o.OooOo0(parcel, 36, this.zzC);
        long j8 = this.zzD;
        o00oO0o.OooOooo(parcel, 37, 8);
        parcel.writeLong(j8);
        int i5 = this.zzE;
        o00oO0o.OooOooo(parcel, 38, 4);
        parcel.writeInt(i5);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public oOO0(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = arrayList;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
    }
}
