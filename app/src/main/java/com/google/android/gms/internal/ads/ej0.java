package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ej0 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<ej0> CREATOR = new C1569fi(19);
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    public ej0(byte[] bArr, int i, int i2) {
        this.zza = i;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOOo0(parcel, 2, this.zzb);
        int i3 = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i3);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public ej0() {
        this(null, 1, 1);
    }
}
