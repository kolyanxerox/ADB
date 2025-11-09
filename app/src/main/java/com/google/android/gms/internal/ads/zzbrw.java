package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes2.dex */
public final class zzbrw implements MediationInterstitialAdapter {

    /* renamed from: OooO00o */
    public Activity f26399OooO00o;

    /* renamed from: OooO0O0 */
    public MediationInterstitialListener f26400OooO0O0;

    /* renamed from: OooO0OO */
    public Uri f26401OooO0OO;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        zzo.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        zzo.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        zzo.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f26400OooO0O0 = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzo.zzj("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            zzo.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f26400OooO0O0.onAdFailedToLoad(this, 0);
            return;
        }
        if (!C1927p7.OooO00o(context)) {
            zzo.zzj("Default browser does not support custom tabs. Bailing out.");
            this.f26400OooO0O0.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            zzo.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f26400OooO0O0.onAdFailedToLoad(this, 0);
        } else {
            this.f26399OooO00o = (Activity) context;
            this.f26401OooO0OO = Uri.parse(string);
            this.f26400OooO0O0.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
        customTabsIntentBuild.intent.setData(this.f26401OooO0OO);
        zzs.zza.post(new wp0(this, false, new AdOverlayInfoParcel(new zzc(customTabsIntentBuild.intent, null), null, new C1825mg(this), null, new VersionInfoParcel(0, 0, false), null, null, ""), 8));
        C1941pl c1941pl = zzv.zzp().OooOO0o;
        c1941pl.getClass();
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (c1941pl.f23365OooO00o) {
            try {
                if (c1941pl.f23367OooO0OO == 3) {
                    if (c1941pl.f23366OooO0O0 + ((Long) zzbe.zzc().OooO00o(AbstractC1448c7.o00oo)).longValue() <= jCurrentTimeMillis) {
                        c1941pl.f23367OooO0OO = 1;
                    }
                }
            } finally {
            }
        }
        ((Oooo0OO.oo000o) zzv.zzC()).getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (c1941pl.f23365OooO00o) {
            try {
                if (c1941pl.f23367OooO0OO != 2) {
                    return;
                }
                c1941pl.f23367OooO0OO = 3;
                if (c1941pl.f23367OooO0OO == 3) {
                    c1941pl.f23366OooO0O0 = jCurrentTimeMillis2;
                }
            } finally {
            }
        }
    }
}
