package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ei */
/* loaded from: classes2.dex */
public final class C1532ei extends Oooo00o.o000O000 {
    public static final Parcelable.Creator<C1532ei> CREATOR = new C1569fi(0);
    public final View zza;
    public final Map zzb;

    public C1532ei(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) Oooo0o.OooO0OO.o000O0oO(Oooo0o.OooO0OO.o000O0o0(iBinder));
        this.zzb = (Map) Oooo0o.OooO0OO.o000O0oO(Oooo0o.OooO0OO.o000O0o0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        View view = this.zza;
        int iOooOoO = o00Oo0oo.o00oO0o.OooOoO(parcel, 20293);
        o00Oo0oo.o00oO0o.OooOOo(parcel, 1, new Oooo0o.OooO0OO(view));
        o00Oo0oo.o00oO0o.OooOOo(parcel, 2, new Oooo0o.OooO0OO(this.zzb));
        o00Oo0oo.o00oO0o.OooOoo(parcel, iOooOoO);
    }
}
