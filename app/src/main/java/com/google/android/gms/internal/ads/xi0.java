package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class xi0 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<xi0> CREATOR = new C1569fi(15);
    public final int zza;
    public final byte[] zzb;

    public xi0(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOOo0(parcel, 2, this.zzb);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
