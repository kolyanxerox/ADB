package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.bd */
/* loaded from: classes2.dex */
public final class C1418bd extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1418bd> CREATOR = new o00OO000(28);
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public C1418bd(int i, int i2, int i3, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzb;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 2, this.zzc);
        int i3 = this.zzd;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.zza;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1000, 4);
        parcel.writeInt(i4);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
