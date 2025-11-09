package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.kk */
/* loaded from: classes2.dex */
public final class C1755kk extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1755kk> CREATOR = new C1569fi(9);
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final List zze;
    public final boolean zzf;
    public final boolean zzg;
    public final List zzh;

    public C1755kk(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = z2;
        this.zze = list;
        this.zzf = z3;
        this.zzg = z4;
        this.zzh = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 2, str);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 3, this.zzb);
        boolean z = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzd;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOo0o(parcel, 6, this.zze);
        boolean z3 = this.zzf;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 7, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzg;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 8, 4);
        parcel.writeInt(z4 ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOo0o(parcel, 9, this.zzh);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
