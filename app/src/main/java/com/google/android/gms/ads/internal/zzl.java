package com.google.android.gms.ads.internal;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzl extends o000O000 {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzl(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = f;
        this.zzf = i;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzb;
        o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        o00oO0o.OooOo0(parcel, 4, this.zzc);
        boolean z3 = this.zzd;
        o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f = this.zze;
        o00oO0o.OooOooo(parcel, 6, 4);
        parcel.writeFloat(f);
        int i2 = this.zzf;
        o00oO0o.OooOooo(parcel, 7, 4);
        parcel.writeInt(i2);
        boolean z4 = this.zzg;
        o00oO0o.OooOooo(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = this.zzh;
        o00oO0o.OooOooo(parcel, 9, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.zzi;
        o00oO0o.OooOooo(parcel, 10, 4);
        parcel.writeInt(z6 ? 1 : 0);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public zzl(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }
}
