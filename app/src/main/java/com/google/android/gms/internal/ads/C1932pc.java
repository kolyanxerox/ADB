package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.pc */
/* loaded from: classes2.dex */
public final class C1932pc extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1932pc> CREATOR = new o00OO000(25);
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    public C1932pc(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.zza = z;
        this.zzb = str;
        this.zzc = i;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z2;
        this.zzh = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 2, this.zzb);
        int i2 = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOOo0(parcel, 4, this.zzd);
        o00Oo0oo.o00oO0o.OooOo0O(parcel, 5, this.zze);
        o00Oo0oo.o00oO0o.OooOo0O(parcel, 6, this.zzf);
        boolean z2 = this.zzg;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 7, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j = this.zzh;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 8, 8);
        parcel.writeLong(j);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
