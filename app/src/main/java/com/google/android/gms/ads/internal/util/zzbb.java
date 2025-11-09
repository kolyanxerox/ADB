package com.google.android.gms.ads.internal.util;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.xh0;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzbb extends o000O000 {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    public final String zza;
    public final int zzb;

    public zzbb(String str, int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static zzbb zzb(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarOooO0oo = af0.OooO0oo(th);
        return new zzbb(xh0.OooOo(th.getMessage()) ? zzeVarOooO0oo.zzb : th.getMessage(), zzeVarOooO0oo.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, str);
        int i2 = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i2);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public final zzba zza() {
        return new zzba(this.zza, this.zzb);
    }
}
