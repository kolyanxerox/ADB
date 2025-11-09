package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C3678sv;

/* loaded from: classes2.dex */
public final class ne0 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<ne0> CREATOR = new C1569fi(14);
    public final Context zza;
    public final me0 zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final me0[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public ne0(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        me0[] me0VarArrValues = me0.values();
        this.zzh = me0VarArrValues;
        int[] iArr = {1, 2, 3};
        this.zzl = iArr;
        int[] iArr2 = {1};
        this.zzm = iArr2;
        this.zza = null;
        this.zzi = i;
        this.zzb = me0VarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArr[i5];
        this.zzk = i6;
        int i7 = iArr2[i6];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.zzd;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i4);
        int i5 = this.zze;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(i5);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 5, this.zzf);
        int i6 = this.zzj;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.zzk;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 7, 4);
        parcel.writeInt(i7);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public ne0(Context context, me0 me0Var, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = me0.values();
        this.zzl = new int[]{1, 2, 3};
        this.zzm = new int[]{1};
        this.zza = context;
        this.zzi = me0Var.ordinal();
        this.zzb = me0Var;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        C3678sv.f11950g.equals(str3);
        this.zzk = 0;
    }
}
