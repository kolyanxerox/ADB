package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.tc */
/* loaded from: classes2.dex */
public final class C2080tc extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C2080tc> CREATOR = new o00OO000(26);
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public C2080tc(String str, int i, String str2, boolean z) {
        this.zza = str;
        this.zzb = z;
        this.zzc = i;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 1, str);
        boolean z = this.zzb;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 4, this.zzd);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
