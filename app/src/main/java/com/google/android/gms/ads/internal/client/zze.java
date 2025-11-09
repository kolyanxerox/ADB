package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zze extends o000O000 {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    public final int zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public zze zzd;

    @Nullable
    public IBinder zze;

    public zze(int i, String str, String str2, @Nullable zze zzeVar, @Nullable IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        o00oO0o.OooOo0(parcel, 2, this.zzb);
        o00oO0o.OooOo0(parcel, 3, this.zzc);
        o00oO0o.OooOo00(parcel, 4, this.zzd, i);
        o00oO0o.OooOOo(parcel, 5, this.zze);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public final AdError zza() {
        AdError adError;
        zze zzeVar = this.zzd;
        if (zzeVar == null) {
            adError = null;
        } else {
            String str = zzeVar.zzc;
            adError = new AdError(zzeVar.zza, zzeVar.zzb, str);
        }
        return new AdError(this.zza, this.zzb, this.zzc, adError);
    }

    public final LoadAdError zzb() {
        AdError adError;
        zze zzeVar = this.zzd;
        zzdy zzdwVar = null;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdwVar = iInterfaceQueryLocalInterface instanceof zzdy ? (zzdy) iInterfaceQueryLocalInterface : new zzdw(iBinder);
        }
        return new LoadAdError(i, str, str2, adError, ResponseInfo.zza(zzdwVar));
    }
}
