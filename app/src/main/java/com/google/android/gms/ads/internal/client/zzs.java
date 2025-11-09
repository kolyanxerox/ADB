package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzs extends o000O000 {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final zzs[] zzg;
    public final boolean zzh;
    public final boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public boolean zzl;
    public boolean zzm;
    public boolean zzn;
    public boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:111:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzs(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzs.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    public static int zza(DisplayMetrics displayMetrics) {
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        int i = (int) (f / f2);
        return (int) ((i <= 400 ? 32 : i <= 720 ? 50 : 90) * f2);
    }

    public static zzs zzb() {
        return new zzs("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzs zzc() {
        return new zzs("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzs zzd() {
        return new zzs("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 2, str);
        int i2 = this.zzb;
        o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.zzc;
        o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(i3);
        boolean z = this.zzd;
        o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        int i4 = this.zze;
        o00oO0o.OooOooo(parcel, 6, 4);
        parcel.writeInt(i4);
        int i5 = this.zzf;
        o00oO0o.OooOooo(parcel, 7, 4);
        parcel.writeInt(i5);
        o00oO0o.OooOo(parcel, 8, this.zzg, i);
        boolean z2 = this.zzh;
        o00oO0o.OooOooo(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.zzi;
        o00oO0o.OooOooo(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzj;
        o00oO0o.OooOooo(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzk;
        o00oO0o.OooOooo(parcel, 12, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.zzl;
        o00oO0o.OooOooo(parcel, 13, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.zzm;
        o00oO0o.OooOooo(parcel, 14, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.zzn;
        o00oO0o.OooOooo(parcel, 15, 4);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = this.zzo;
        o00oO0o.OooOooo(parcel, 16, 4);
        parcel.writeInt(z9 ? 1 : 0);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public zzs(String str, int i, int i2, boolean z, int i3, int i4, zzs[] zzsVarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzsVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }

    public zzs() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public zzs(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }
}
