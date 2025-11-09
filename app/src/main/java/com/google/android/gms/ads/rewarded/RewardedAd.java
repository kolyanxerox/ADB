package com.google.android.gms.ads.rewarded;

import Oooo00O.o000000O;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1559f8;
import com.google.android.gms.internal.ads.C1425bk;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.InterfaceC2050sj;

/* loaded from: classes2.dex */
public abstract class RewardedAd {
    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "AdUnitId cannot be null.");
        C1425bk c1425bk = new C1425bk(context, str);
        try {
            return com.google.android.gms.ads.zzb.zza(c1425bk.f17514OooO0OO).zzl(c1425bk.f17512OooO00o);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final RewardedAdLoadCallback rewardedAdLoadCallback) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "AdUnitId cannot be null.");
        o000000O.OooO(adRequest, "AdRequest cannot be null.");
        o000000O.OooO(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18811OooOO0O.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new C1425bk(context2, str2).OooO00o(adRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(context2).OooO00o("RewardedAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        zzo.zze("Loading on UI thread");
        new C1425bk(context, str).OooO00o(adRequest.zza(), rewardedAdLoadCallback);
    }

    @Nullable
    public static RewardedAd pollAd(@NonNull Context context, @NonNull String str) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "AdUnitId cannot be null.");
        C1425bk c1425bk = new C1425bk(context, str);
        String str2 = c1425bk.f17512OooO00o;
        Context context2 = c1425bk.f17514OooO0OO;
        try {
            InterfaceC2050sj interfaceC2050sjZzg = com.google.android.gms.ads.zzb.zza(context2).zzg(str2);
            if (interfaceC2050sjZzg != null) {
                return new C1425bk(context2, str2, interfaceC2050sjZzg, c1425bk.f17515OooO0Oo);
            }
            zzo.zzl("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
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

    public abstract void setServerSideVerificationOptions(@Nullable ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdManagerAdRequest adManagerAdRequest, @NonNull final RewardedAdLoadCallback rewardedAdLoadCallback) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "AdUnitId cannot be null.");
        o000000O.OooO(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        o000000O.OooO(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18811OooOO0O.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                zzo.zze("Loading on background thread");
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new C1425bk(context2, str2).OooO00o(adManagerAdRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(context2).OooO00o("RewardedAd.loadAdManager", e);
                        }
                    }
                });
                return;
            }
        }
        zzo.zze("Loading on UI thread");
        new C1425bk(context, str).OooO00o(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }
}
