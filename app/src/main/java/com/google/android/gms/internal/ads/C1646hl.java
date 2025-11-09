package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;

/* renamed from: com.google.android.gms.internal.ads.hl */
/* loaded from: classes2.dex */
public final class C1646hl extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1646hl> CREATOR = new C1569fi(10);
    public final String zza;
    public final String zzb;

    @Deprecated
    public final zzs zzc;
    public final zzm zzd;
    public final int zze;

    @Nullable
    public final String zzf;

    public C1646hl(String str, String str2, zzs zzsVar, zzm zzmVar, int i, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzsVar;
        this.zzd = zzmVar;
        this.zze = i;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 1, str);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 2, this.zzb);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 3, this.zzc, i);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 4, this.zzd, i);
        int i2 = this.zze;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 5, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 6, this.zzf);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
