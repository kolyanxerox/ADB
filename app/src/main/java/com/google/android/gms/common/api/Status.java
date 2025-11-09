package com.google.android.gms.common.api;

import OooO0oO.OooOOO0;
import OooOoo0.o000OOo;
import OooOooo.o000Oo0;
import Oooo00O.o000000O;
import Oooo00o.o000O000;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class Status extends o000O000 implements ReflectedParcelable {
    private final int zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final PendingIntent zzd;

    @Nullable
    private final o000Oo0 zze;

    @NonNull
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1, null, null, null);

    @NonNull
    public static final Status RESULT_SUCCESS = new Status(0, null, null, null);

    @NonNull
    public static final Status RESULT_INTERRUPTED = new Status(14, null, null, null);

    @NonNull
    public static final Status RESULT_INTERNAL_ERROR = new Status(8, null, null, null);

    @NonNull
    public static final Status RESULT_TIMEOUT = new Status(15, null, null, null);

    @NonNull
    public static final Status RESULT_CANCELED = new Status(16, null, null, null);

    @NonNull
    public static final Status zza = new Status(17, null, null, null);

    @NonNull
    public static final Status RESULT_DEAD_CLIENT = new Status(18, null, null, null);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new o000OOo(7);

    public Status(int i, String str, PendingIntent pendingIntent, o000Oo0 o000oo02) {
        this.zzb = i;
        this.zzc = str;
        this.zzd = pendingIntent;
        this.zze = o000oo02;
    }

    public final boolean OooO() {
        return this.zzd != null;
    }

    public final int OooO0o() {
        return this.zzb;
    }

    public final o000Oo0 OooO0o0() {
        return this.zze;
    }

    public final String OooO0oO() {
        return this.zzc;
    }

    public final boolean OooOO0() {
        return this.zzb <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.zzb == status.zzb && o000000O.OooOO0o(this.zzc, status.zzc) && o000000O.OooOO0o(this.zzd, status.zzd) && o000000O.OooOO0o(this.zze, status.zze);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze});
    }

    public final String toString() {
        OooOOO0 oooOOO0 = new OooOOO0(this);
        String strOooO0o0 = this.zzc;
        if (strOooO0o0 == null) {
            strOooO0o0 = o00O0.o000OOo.OooO0o0(this.zzb);
        }
        oooOOO0.OooO00o(strOooO0o0, "statusCode");
        oooOOO0.OooO00o(this.zzd, "resolution");
        return oooOOO0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        int i2 = this.zzb;
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        o00oO0o.OooOo0(parcel, 2, this.zzc);
        o00oO0o.OooOo00(parcel, 3, this.zzd, i);
        o00oO0o.OooOo00(parcel, 4, this.zze, i);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
