package com.google.android.gms.ads.formats;

import Oooo00o.o000O000;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.internal.ads.AbstractBinderC2115ua;
import com.google.android.gms.internal.ads.C2078ta;
import com.google.android.gms.internal.ads.InterfaceC2152va;
import o00Oo0oo.o00oO0o;

@Deprecated
/* loaded from: classes2.dex */
public final class PublisherAdViewOptions extends o000O000 {

    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzh();
    private final boolean zza;

    @Nullable
    private final zzcm zzb;

    @Nullable
    private final IBinder zzc;

    @Deprecated
    public static final class Builder {
        @NonNull
        public Builder setShouldDelayBannerRenderingListener(@NonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.zza = z;
        this.zzb = iBinder != null ? zzcl.zzd(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iOooOoO = o00oO0o.OooOoO(parcel, 20293);
        boolean z = this.zza;
        o00oO0o.OooOooo(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        zzcm zzcmVar = this.zzb;
        o00oO0o.OooOOo(parcel, 2, zzcmVar == null ? null : zzcmVar.asBinder());
        o00oO0o.OooOOo(parcel, 3, this.zzc);
        o00oO0o.OooOoo(parcel, iOooOoO);
    }

    @Nullable
    public final zzcm zza() {
        return this.zzb;
    }

    @Nullable
    public final InterfaceC2152va zzb() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        int i = AbstractBinderC2115ua.f24613OooOo0O;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2152va ? (InterfaceC2152va) iInterfaceQueryLocalInterface : new C2078ta(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public final boolean zzc() {
        return this.zza;
    }
}
