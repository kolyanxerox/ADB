package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

/* renamed from: com.google.android.gms.internal.ads.fk */
/* loaded from: classes2.dex */
public final class C1571fk extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1571fk> CREATOR = new C1569fi(8);
    public final String zza;
    public final String zzb;

    public C1571fk(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 1, str);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 2, this.zzb);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public C1571fk(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }
}
