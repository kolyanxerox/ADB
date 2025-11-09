package com.google.android.gms.ads.internal.client;

import Oooo00o.o000O000;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class zzfb extends o000O000 {
    public static final Parcelable.Creator<zzfb> CREATOR = new zzfc();
    private final int zza;
    private final int zzb;
    private final String zzc;

    public zzfb(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        int i2 = this.zza;
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(i3);
        o00oO0o.OooOo0(parcel, 3, this.zzc);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public zzfb() {
        this(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }
}
