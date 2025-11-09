package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.SearchAdRequest;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzfx extends o000O000 {
    public static final Parcelable.Creator<zzfx> CREATOR = new zzfy();
    public final String zza;

    public zzfx(SearchAdRequest searchAdRequest) {
        this.zza = searchAdRequest.getQuery();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 15, str);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public zzfx(String str) {
        this.zza = str;
    }
}
