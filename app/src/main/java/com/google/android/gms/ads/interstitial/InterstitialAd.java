package com.google.android.gms.ads.interstitial;

import Oooo00O.o000000O;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1559f8;
import com.google.android.gms.internal.ads.C1638hd;
import com.google.android.gms.internal.ads.C1643hi;

/* loaded from: classes2.dex */
public abstract class InterstitialAd {
    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        try {
            return zzb.zza(context).zzk(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "AdUnitId cannot be null.");
        o000000O.OooO(adRequest, "AdRequest cannot be null.");
        o000000O.OooO(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18801OooO.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new C1638hd(context2, str2).OooO00o(adRequest2.zza(), interstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(context2).OooO00o("InterstitialAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new C1638hd(context, str).OooO00o(adRequest.zza(), interstitialAdLoadCallback);
    }

    @Nullable
    public static InterstitialAd pollAd(@NonNull Context context, @NonNull String str) {
        try {
            zzby zzbyVarZzf = zzb.zza(context).zzf(str);
            if (zzbyVarZzf != null) {
                return new C1638hd(context, str, zzbyVarZzf);
            }
            zzo.zzl("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void show(@NonNull Activity activity);
}
