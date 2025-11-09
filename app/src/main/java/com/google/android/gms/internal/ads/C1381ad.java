package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.ad */
/* loaded from: classes2.dex */
public final class C1381ad extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1381ad> CREATOR = new o00OO000(27);
    public final String zza;
    public final Bundle zzb;

    public C1381ad(Bundle bundle, String str) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 1, str);
        o00Oo0oo.o00oO0o.OooOOOo(2, this.zzb, parcel);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
