package com.google.android.gms.ads;

import Oooo00O.o000000O;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1559f8;
import com.google.android.gms.internal.ads.BinderC1458ch;
import com.google.android.gms.internal.ads.BinderC1525eb;
import com.google.android.gms.internal.ads.BinderC1562fb;
import com.google.android.gms.internal.ads.BinderC1636hb;
import com.google.android.gms.internal.ads.BinderC1673ib;
import com.google.android.gms.internal.ads.BinderC2082te;
import com.google.android.gms.internal.ads.BinderC2269yg;
import com.google.android.gms.internal.ads.BinderC2306zg;
import com.google.android.gms.internal.ads.C1385ah;
import com.google.android.gms.internal.ads.C1414b9;
import com.google.android.gms.internal.ads.de0;

/* loaded from: classes2.dex */
public class AdLoader {

    /* renamed from: OooO00o */
    public final zzr f15882OooO00o;

    /* renamed from: OooO0O0 */
    public final Context f15883OooO0O0;

    /* renamed from: OooO0OO */
    public final zzbr f15884OooO0OO;

    public static class Builder {

        /* renamed from: OooO00o */
        public final Context f15885OooO00o;

        /* renamed from: OooO0O0 */
        public final zzbu f15886OooO0O0;

        public Builder(@NonNull Context context, @NonNull String str) {
            o000000O.OooO(context, "context cannot be null");
            zzbu zzbuVarZzd = zzbc.zza().zzd(context, str, new BinderC2082te());
            this.f15885OooO00o = context;
            this.f15886OooO0O0 = zzbuVarZzd;
        }

        @NonNull
        public AdLoader build() {
            Context context = this.f15885OooO00o;
            try {
                return new AdLoader(context, this.f15886OooO0O0.zze(), zzr.zza);
            } catch (RemoteException e) {
                zzo.zzh("Failed to build AdLoader.", e);
                return new AdLoader(context, new zzfi().zzc(), zzr.zza);
            }
        }

        @NonNull
        public Builder forAdManagerAdView(@NonNull OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @NonNull AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f15886OooO0O0.zzj(new BinderC1636hb(onAdManagerAdViewLoadedListener), new zzs(this.f15885OooO00o, adSizeArr));
                return this;
            } catch (RemoteException e) {
                zzo.zzk("Failed to add Google Ad Manager banner ad listener", e);
                return this;
            }
        }

        @NonNull
        public Builder forCustomFormatAd(@NonNull String str, @NonNull NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            C1385ah c1385ah = new C1385ah(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.f15886OooO0O0.zzh(str, new BinderC2306zg(c1385ah), onCustomClickListener == null ? null : new BinderC2269yg(c1385ah));
                return this;
            } catch (RemoteException e) {
                zzo.zzk("Failed to add custom format ad listener", e);
                return this;
            }
        }

        @NonNull
        public Builder forNativeAd(@NonNull NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.f15886OooO0O0.zzk(new BinderC1458ch(onNativeAdLoadedListener));
                return this;
            } catch (RemoteException e) {
                zzo.zzk("Failed to add google native ad listener", e);
                return this;
            }
        }

        @NonNull
        public Builder withAdListener(@NonNull AdListener adListener) {
            try {
                this.f15886OooO0O0.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
                return this;
            } catch (RemoteException e) {
                zzo.zzk("Failed to set AdListener.", e);
                return this;
            }
        }

        @NonNull
        public Builder withAdManagerAdViewOptions(@NonNull AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.f15886OooO0O0.zzm(adManagerAdViewOptions);
                return this;
            } catch (RemoteException e) {
                zzo.zzk("Failed to specify Ad Manager banner ad options", e);
                return this;
            }
        }

        @NonNull
        public Builder withNativeAdOptions(@NonNull NativeAdOptions nativeAdOptions) {
            try {
                this.f15886OooO0O0.zzo(new C1414b9(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
                return this;
            } catch (RemoteException e) {
                zzo.zzk("Failed to specify native ad options", e);
                return this;
            }
        }

        @Deprecated
        public final Builder zza(String str, com.google.android.gms.ads.formats.zzg zzgVar, @Nullable com.google.android.gms.ads.formats.zzf zzfVar) {
            de0 de0Var = new de0(8, zzgVar, zzfVar);
            try {
                this.f15886OooO0O0.zzh(str, new BinderC1562fb(de0Var), zzfVar == null ? null : new BinderC1525eb(de0Var));
                return this;
            } catch (RemoteException e) {
                zzo.zzk("Failed to add custom template ad listener", e);
                return this;
            }
        }

        @Deprecated
        public final Builder zzb(com.google.android.gms.ads.formats.zzi zziVar) {
            try {
                this.f15886OooO0O0.zzk(new BinderC1673ib(zziVar));
                return this;
            } catch (RemoteException e) {
                zzo.zzk("Failed to add google native ad listener", e);
                return this;
            }
        }

        @NonNull
        @Deprecated
        public final Builder zzc(@NonNull com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.f15886OooO0O0.zzo(new C1414b9(nativeAdOptions));
                return this;
            } catch (RemoteException e) {
                zzo.zzk("Failed to specify native ad options", e);
                return this;
            }
        }
    }

    public AdLoader(Context context, zzbr zzbrVar, zzr zzrVar) {
        this.f15883OooO0O0 = context;
        this.f15884OooO0OO = zzbrVar;
        this.f15882OooO00o = zzrVar;
    }

    public final void OooO00o(final zzei zzeiVar) {
        Context context = this.f15883OooO0O0;
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18804OooO0OO.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader adLoader = this.zza;
                        zzei zzeiVar2 = zzeiVar;
                        adLoader.getClass();
                        try {
                            adLoader.f15884OooO0OO.zzg(adLoader.f15882OooO00o.zza(adLoader.f15883OooO0O0, zzeiVar2));
                        } catch (RemoteException e) {
                            zzo.zzh("Failed to load ad.", e);
                        }
                    }
                });
                return;
            }
        }
        try {
            this.f15884OooO0OO.zzg(this.f15882OooO00o.zza(context, zzeiVar));
        } catch (RemoteException e) {
            zzo.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.f15884OooO0OO.zzi();
        } catch (RemoteException e) {
            zzo.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAd(@NonNull AdRequest adRequest) {
        OooO00o(adRequest.f15887OooO00o);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void loadAds(@NonNull AdRequest adRequest, int i) {
        try {
            this.f15884OooO0OO.zzh(this.f15882OooO00o.zza(this.f15883OooO0O0, adRequest.f15887OooO00o), i);
        } catch (RemoteException e) {
            zzo.zzh("Failed to load ads.", e);
        }
    }

    public void loadAd(@NonNull AdManagerAdRequest adManagerAdRequest) {
        OooO00o(adManagerAdRequest.f15887OooO00o);
    }
}
