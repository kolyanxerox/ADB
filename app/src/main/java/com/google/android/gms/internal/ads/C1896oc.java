package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.oc */
/* loaded from: classes2.dex */
public final class C1896oc extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1896oc> CREATOR = new o00OO000(24);
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    public C1896oc(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 1, str);
        o00Oo0oo.o00oO0o.OooOo0O(parcel, 2, this.zzb);
        o00Oo0oo.o00oO0o.OooOo0O(parcel, 3, this.zzc);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
