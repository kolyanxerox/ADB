package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.ads.h4 */
/* loaded from: classes2.dex */
public final class C1629h4 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1629h4> CREATOR = new o00OO000(21);

    @Nullable
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    public C1629h4(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.zza = parcelFileDescriptor;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = z3;
    }

    public final synchronized boolean OooO() {
        return this.zza != null;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream OooO0o() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized long OooO0o0() {
        return this.zzd;
    }

    public final synchronized boolean OooO0oO() {
        return this.zzb;
    }

    public final synchronized boolean OooOO0() {
        return this.zzc;
    }

    public final synchronized boolean OooOO0O() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.zza;
        }
        o00Oo0oo.o00oO0o.OooOo00(parcel, 2, parcelFileDescriptor, i);
        boolean zOooO0oO = OooO0oO();
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(zOooO0oO ? 1 : 0);
        boolean zOooOO0 = OooOO0();
        o00Oo0oo.o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(zOooOO0 ? 1 : 0);
        long jOooO0o0 = OooO0o0();
        o00Oo0oo.o00oO0o.OooOooo(parcel, 5, 8);
        parcel.writeLong(jOooO0o0);
        boolean zOooOO0O = OooOO0O();
        o00Oo0oo.o00oO0o.OooOooo(parcel, 6, 4);
        parcel.writeInt(zOooOO0O ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public C1629h4() {
        this(null, false, false, 0L, false);
    }
}
