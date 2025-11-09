package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class aj0 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<aj0> CREATOR = new C1569fi(17);
    public final int zza;
    private C1514e0 zzb = null;
    private byte[] zzc;

    public aj0(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        OooO0o();
    }

    public final void OooO0o() {
        C1514e0 c1514e0 = this.zzb;
        if (c1514e0 != null || this.zzc == null) {
            if (c1514e0 == null || this.zzc != null) {
                if (c1514e0 != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (c1514e0 != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final C1514e0 OooO0o0() {
        if (this.zzb == null) {
            try {
                byte[] bArr = this.zzc;
                tz0 tz0Var = tz0.f24541OooO00o;
                a11 a11Var = a11.f16875OooO0OO;
                this.zzb = C1514e0.oo000o(bArr, tz0.f24542OooO0O0);
                this.zzc = null;
            } catch (k01 | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        OooO0o();
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        byte[] bArrOooO0Oo = this.zzc;
        if (bArrOooO0Oo == null) {
            bArrOooO0Oo = this.zzb.OooO0Oo();
        }
        o00Oo0oo.o00oO0o.OooOOo0(parcel, 2, bArrOooO0Oo);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
