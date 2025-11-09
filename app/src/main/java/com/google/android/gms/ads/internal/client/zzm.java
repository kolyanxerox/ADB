package com.google.android.gms.ads.internal.client;

import Oooo00O.o000000O;
import Oooo00o.o000O000;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzm extends o000O000 {
    public static final Parcelable.Creator<zzm> CREATOR = new zzo();
    public final int zza;

    @Deprecated
    public final long zzb;
    public final Bundle zzc;

    @Deprecated
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfx zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;

    @Deprecated
    public final boolean zzr;

    @Nullable
    public final zzc zzs;
    public final int zzt;

    @Nullable
    public final String zzu;
    public final List zzv;
    public final int zzw;

    @Nullable
    public final String zzx;
    public final int zzy;
    public final long zzz;

    public zzm(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, zzfx zzfxVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, @Nullable zzc zzcVar, int i4, @Nullable String str5, List list3, int i5, @Nullable String str6, int i6, long j2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i2;
        this.zze = list;
        this.zzf = z;
        this.zzg = i3;
        this.zzh = z2;
        this.zzi = str;
        this.zzj = zzfxVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z3;
        this.zzs = zzcVar;
        this.zzt = i4;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i5;
        this.zzx = str6;
        this.zzy = i6;
        this.zzz = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return zza(obj) && this.zzz == ((zzm) obj).zzz;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx, Integer.valueOf(this.zzy), Long.valueOf(this.zzz)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 8);
        parcel.writeLong(j);
        o00oO0o.OooOOOo(3, this.zzc, parcel);
        int i3 = this.zzd;
        o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(i3);
        o00oO0o.OooOo0o(parcel, 5, this.zze);
        boolean z = this.zzf;
        o00oO0o.OooOooo(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        int i4 = this.zzg;
        o00oO0o.OooOooo(parcel, 7, 4);
        parcel.writeInt(i4);
        boolean z2 = this.zzh;
        o00oO0o.OooOooo(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        o00oO0o.OooOo0(parcel, 9, this.zzi);
        o00oO0o.OooOo00(parcel, 10, this.zzj, i);
        o00oO0o.OooOo00(parcel, 11, this.zzk, i);
        o00oO0o.OooOo0(parcel, 12, this.zzl);
        o00oO0o.OooOOOo(13, this.zzm, parcel);
        o00oO0o.OooOOOo(14, this.zzn, parcel);
        o00oO0o.OooOo0o(parcel, 15, this.zzo);
        o00oO0o.OooOo0(parcel, 16, this.zzp);
        o00oO0o.OooOo0(parcel, 17, this.zzq);
        boolean z3 = this.zzr;
        o00oO0o.OooOooo(parcel, 18, 4);
        parcel.writeInt(z3 ? 1 : 0);
        o00oO0o.OooOo00(parcel, 19, this.zzs, i);
        int i5 = this.zzt;
        o00oO0o.OooOooo(parcel, 20, 4);
        parcel.writeInt(i5);
        o00oO0o.OooOo0(parcel, 21, this.zzu);
        o00oO0o.OooOo0o(parcel, 22, this.zzv);
        int i6 = this.zzw;
        o00oO0o.OooOooo(parcel, 23, 4);
        parcel.writeInt(i6);
        o00oO0o.OooOo0(parcel, 24, this.zzx);
        int i7 = this.zzy;
        o00oO0o.OooOooo(parcel, 25, 4);
        parcel.writeInt(i7);
        long j2 = this.zzz;
        o00oO0o.OooOooo(parcel, 26, 8);
        parcel.writeLong(j2);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public final boolean zza(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.zza == zzmVar.zza && this.zzb == zzmVar.zzb && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzc, zzmVar.zzc) && this.zzd == zzmVar.zzd && o000000O.OooOO0o(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg && this.zzh == zzmVar.zzh && o000000O.OooOO0o(this.zzi, zzmVar.zzi) && o000000O.OooOO0o(this.zzj, zzmVar.zzj) && o000000O.OooOO0o(this.zzk, zzmVar.zzk) && o000000O.OooOO0o(this.zzl, zzmVar.zzl) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzm, zzmVar.zzm) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzn, zzmVar.zzn) && o000000O.OooOO0o(this.zzo, zzmVar.zzo) && o000000O.OooOO0o(this.zzp, zzmVar.zzp) && o000000O.OooOO0o(this.zzq, zzmVar.zzq) && this.zzr == zzmVar.zzr && this.zzt == zzmVar.zzt && o000000O.OooOO0o(this.zzu, zzmVar.zzu) && o000000O.OooOO0o(this.zzv, zzmVar.zzv) && this.zzw == zzmVar.zzw && o000000O.OooOO0o(this.zzx, zzmVar.zzx) && this.zzy == zzmVar.zzy;
    }

    public final boolean zzb() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }
}
