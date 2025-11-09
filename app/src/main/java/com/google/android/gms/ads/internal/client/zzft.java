package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Objects;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzft extends o000O000 {
    public static final Parcelable.Creator<zzft> CREATOR = new zzfu();
    public final String zza;
    public final int zzb;
    public final zzm zzc;
    public final int zzd;

    public zzft(String str, int i, zzm zzmVar, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzmVar;
        this.zzd = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            if (this.zza.equals(zzftVar.zza) && this.zzb == zzftVar.zzb && this.zzc.zza(zzftVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOo0(parcel, 1, str);
        int i2 = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i2);
        o00oO0o.OooOo00(parcel, 3, this.zzc, i);
        int i3 = this.zzd;
        o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(i3);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
