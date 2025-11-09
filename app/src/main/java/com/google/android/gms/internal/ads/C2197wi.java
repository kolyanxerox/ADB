package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wi */
/* loaded from: classes2.dex */
public final class C2197wi extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C2197wi> CREATOR = new C1569fi(5);
    public final Bundle zza;
    public final VersionInfoParcel zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;

    @Nullable
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;

    @Nullable
    public ne0 zzi;

    @Nullable
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final Bundle zzm;
    public final Bundle zzn;

    public C2197wi(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, ne0 ne0Var, String str4, boolean z, boolean z2, Bundle bundle2, Bundle bundle3) {
        this.zza = bundle;
        this.zzb = versionInfoParcel;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = arrayList;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = ne0Var;
        this.zzj = str4;
        this.zzk = z;
        this.zzl = z2;
        this.zzm = bundle2;
        this.zzn = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOOOo(1, bundle, parcel);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 2, this.zzb, i);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 3, this.zzc, i);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 4, this.zzd);
        o00Oo0oo.o00oO0o.OooOo0o(parcel, 5, this.zze);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 6, this.zzf, i);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 7, this.zzg);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 9, this.zzh);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 10, this.zzi, i);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 11, this.zzj);
        boolean z = this.zzk;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzl;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 13, 4);
        parcel.writeInt(z2 ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOOOo(14, this.zzm, parcel);
        o00Oo0oo.o00oO0o.OooOOOo(15, this.zzn, parcel);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
