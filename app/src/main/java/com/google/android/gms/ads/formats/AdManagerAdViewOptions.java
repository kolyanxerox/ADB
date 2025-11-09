package com.google.android.gms.ads.formats;

import Oooo00o.o000O000;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.AbstractBinderC2115ua;
import com.google.android.gms.internal.ads.C2078ta;
import com.google.android.gms.internal.ads.InterfaceC2152va;
import o00Oo0oo.o00oO0o;

/* loaded from: classes2.dex */
public final class AdManagerAdViewOptions extends o000O000 {

    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zzc();
    private final boolean zza;

    @Nullable
    private final IBinder zzb;

    public static final class Builder {

        /* renamed from: OooO00o */
        public boolean f15931OooO00o = false;

        @NonNull
        public AdManagerAdViewOptions build() {
            return new AdManagerAdViewOptions(this);
        }

        @NonNull
        public Builder setManualImpressionsEnabled(boolean z) {
            this.f15931OooO00o = z;
            return this;
        }
    }

    public AdManagerAdViewOptions(Builder builder) {
        this.zza = builder.f15931OooO00o;
        this.zzb = null;
    }

    public boolean getManualImpressionsEnabled() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        boolean manualImpressionsEnabled = getManualImpressionsEnabled();
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(manualImpressionsEnabled ? 1 : 0);
        o00oO0o.OooOOo(parcel, 2, this.zzb);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    @Nullable
    public final InterfaceC2152va zza() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        int i = AbstractBinderC2115ua.f24613OooOo0O;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2152va ? (InterfaceC2152va) iInterfaceQueryLocalInterface : new C2078ta(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.zza = z;
        this.zzb = iBinder;
    }
}
