package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzm;

/* renamed from: com.google.android.gms.internal.ads.jj */
/* loaded from: classes2.dex */
public final class C1717jj extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1717jj> CREATOR = new C1569fi(6);
    public final zzm zza;
    public final String zzb;

    public C1717jj(zzm zzmVar, String str) {
        this.zza = zzmVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzm zzmVar = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 2, zzmVar, i);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 3, this.zzb);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
