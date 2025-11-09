package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzw extends o000O000 {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    public final String zza;
    public long zzb;

    @Nullable
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public zzw(String str, long j, @Nullable zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, str);
        long j = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 8);
        parcel.writeLong(j);
        o00oO0o.OooOo00(parcel, 3, this.zzc, i);
        o00oO0o.OooOOOo(4, this.zzd, parcel);
        o00oO0o.OooOo0(parcel, 5, this.zze);
        o00oO0o.OooOo0(parcel, 6, this.zzf);
        o00oO0o.OooOo0(parcel, 7, this.zzg);
        o00oO0o.OooOo0(parcel, 8, this.zzh);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
