package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzga extends o000O000 {
    public static final Parcelable.Creator<zzga> CREATOR = new zzgb();
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzga(boolean z, boolean z2, boolean z3) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzb;
        o00oO0o.OooOooo(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.zzc;
        o00oO0o.OooOooo(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public zzga(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }
}
