package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class o000O00 extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<o000O00> CREATOR = new o000Oo0(1);
    public final int zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final Intent zzc;

    public o000O00(int i, String str, Intent intent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = intent;
    }

    public static o000O00 OooO0o0(Activity activity) {
        return new o000O00(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O00)) {
            return false;
        }
        o000O00 o000o002 = (o000O00) obj;
        return this.zza == o000o002.zza && Objects.equals(this.zzb, o000o002.zzb) && Objects.equals(this.zzc, o000o002.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        o00Oo0oo.o00oO0o.OooOo0(parcel, 2, this.zzb);
        o00Oo0oo.o00oO0o.OooOo00(parcel, 3, this.zzc, i);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
