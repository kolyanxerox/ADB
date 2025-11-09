package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VersionInfo;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.lg */
/* loaded from: classes2.dex */
public final class C1788lg extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1788lg> CREATOR = new o00OO000(29);
    public final int zza;
    public final int zzb;
    public final int zzc;

    public C1788lg(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static C1788lg OooO0o0(VersionInfo versionInfo) {
        return new C1788lg(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1788lg)) {
            C1788lg c1788lg = (C1788lg) obj;
            if (c1788lg.zzc == this.zzc && c1788lg.zzb == this.zzb && c1788lg.zza == this.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        return this.zza + "." + this.zzb + "." + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = this.zzc;
        o00Oo0oo.o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(i4);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
