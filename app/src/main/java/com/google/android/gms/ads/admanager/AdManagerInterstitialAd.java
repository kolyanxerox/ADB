package com.google.android.gms.ads.admanager;

import Oooo00O.o000000O;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1559f8;
import com.google.android.gms.internal.ads.C1638hd;
import com.google.android.gms.internal.ads.C1643hi;

/* loaded from: classes2.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdManagerAdRequest adManagerAdRequest, @NonNull final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "AdUnitId cannot be null.");
        o000000O.OooO(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        o000000O.OooO(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18801OooO.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new C1638hd(context2, str2).OooO00o(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(context2).OooO00o("AdManagerInterstitialAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new C1638hd(context, str).OooO00o(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    @Nullable
    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(@Nullable AppEventListener appEventListener);
}
