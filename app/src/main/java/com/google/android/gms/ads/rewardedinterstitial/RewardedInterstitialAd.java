package com.google.android.gms.ads.rewardedinterstitial;

import Oooo00O.o000000O;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1559f8;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.C1682ik;

/* loaded from: classes2.dex */
public abstract class RewardedInterstitialAd {
    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "AdUnitId cannot be null.");
        o000000O.OooO(adRequest, "AdRequest cannot be null.");
        o000000O.OooO(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18811OooOO0O.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new C1682ik(context2, str2).OooO00o(adRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(context2).OooO00o("RewardedInterstitialAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new C1682ik(context, str).OooO00o(adRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    @NonNull
    public abstract Bundle getAdMetadata();

    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    @NonNull
    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(@NonNull ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdManagerAdRequest adManagerAdRequest, @NonNull final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "AdUnitId cannot be null.");
        o000000O.OooO(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        o000000O.OooO(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18811OooOO0O.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new C1682ik(context2, str2).OooO00o(adManagerAdRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(context2).OooO00o("RewardedInterstitialAdManager.load", e);
                        }
                    }
                });
                return;
            }
        }
        new C1682ik(context, str).OooO00o(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
    }
}
