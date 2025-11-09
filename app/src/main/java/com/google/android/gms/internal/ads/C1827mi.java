package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.mi */
/* loaded from: classes2.dex */
public final class C1827mi extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1827mi> CREATOR = new C1569fi(3);
    public final String zza;

    public C1827mi(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 1, str);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
