package com.google.android.gms.ads.internal.offline.buffering;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zza extends o000O000 {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zza(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, str);
        o00oO0o.OooOo0(parcel, 2, this.zzb);
        o00oO0o.OooOo0(parcel, 3, this.zzc);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
