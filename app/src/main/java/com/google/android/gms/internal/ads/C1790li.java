package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.li */
/* loaded from: classes2.dex */
public final class C1790li extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1790li> CREATOR = new C1569fi(2);
    public final boolean zza;

    @Nullable
    public final List zzb;

    public C1790li(List list, boolean z) {
        this.zza = z;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOooo(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        o00Oo0oo.o00oO0o.OooOo0o(parcel, 3, this.zzb);
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
