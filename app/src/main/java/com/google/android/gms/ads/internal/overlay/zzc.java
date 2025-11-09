package com.google.android.gms.ads.internal.overlay;

import Oooo00o.o000O000;
import Oooo0o.OooO0OO;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzc extends o000O000 {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final Intent zzh;
    public final zzaa zzi;
    public final boolean zzj;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (zzaa) OooO0OO.o000O0oO(OooO0OO.o000O0o0(iBinder));
        this.zzj = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 2, str);
        o00oO0o.OooOo0(parcel, 3, this.zzb);
        o00oO0o.OooOo0(parcel, 4, this.zzc);
        o00oO0o.OooOo0(parcel, 5, this.zzd);
        o00oO0o.OooOo0(parcel, 6, this.zze);
        o00oO0o.OooOo0(parcel, 7, this.zzf);
        o00oO0o.OooOo0(parcel, 8, this.zzg);
        o00oO0o.OooOo00(parcel, 9, this.zzh, i);
        o00oO0o.OooOOo(parcel, 10, new OooO0OO(this.zzi));
        boolean z = this.zzj;
        o00oO0o.OooOooo(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public zzc(Intent intent, zzaa zzaaVar) {
        this(null, null, null, null, null, null, null, intent, new OooO0OO(zzaaVar), false);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzaa zzaaVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new OooO0OO(zzaaVar), false);
    }
}
