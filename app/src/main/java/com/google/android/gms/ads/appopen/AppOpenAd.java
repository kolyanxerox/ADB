package com.google.android.gms.ads.appopen;

import Oooo00O.o000000O;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.AbstractC1448c7;
import com.google.android.gms.internal.ads.AbstractC1559f8;
import com.google.android.gms.internal.ads.C1518e4;
import com.google.android.gms.internal.ads.C1643hi;
import com.google.android.gms.internal.ads.C2108u3;
import com.google.android.gms.internal.ads.InterfaceC2256y3;

/* loaded from: classes2.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    public @interface AppOpenAdOrientation {
    }

    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        try {
            return com.google.android.gms.ads.zzb.zza(context).zzj(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    @Deprecated
    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @AppOpenAdOrientation final int i, @NonNull final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "adUnitId cannot be null.");
        o000000O.OooO(adRequest, "AdRequest cannot be null.");
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18805OooO0Oo.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i2 = i;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new C1518e4(context2, str2, adRequest2.zza(), i2, appOpenAdLoadCallback).OooO00o();
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(context2).OooO00o("AppOpenAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new C1518e4(context, str, adRequest.zza(), i, appOpenAdLoadCallback).OooO00o();
    }

    @Nullable
    public static AppOpenAd pollAd(@NonNull Context context, @NonNull String str) {
        try {
            InterfaceC2256y3 interfaceC2256y3Zze = com.google.android.gms.ads.zzb.zza(context).zze(str);
            if (interfaceC2256y3Zze != null) {
                return new C2108u3(interfaceC2256y3Zze, str);
            }
            zzo.zzl("Failed to obtain an App Open ad from the preloader.", null);
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

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "adUnitId cannot be null.");
        o000000O.OooO(adRequest, "AdRequest cannot be null.");
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18805OooO0Oo.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new C1518e4(context2, str2, adRequest2.zza(), 3, appOpenAdLoadCallback).OooO00o();
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(context2).OooO00o("AppOpenAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new C1518e4(context, str, adRequest.zza(), 3, appOpenAdLoadCallback).OooO00o();
    }

    @Deprecated
    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i, @NonNull final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        o000000O.OooO(context, "Context cannot be null.");
        o000000O.OooO(str, "adUnitId cannot be null.");
        o000000O.OooO(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        o000000O.OooO0Oo("#008 Must be called on the main UI thread.");
        AbstractC1448c7.OooO00o(context);
        if (((Boolean) AbstractC1559f8.f18805OooO0Oo.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0ooOOoo)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i2 = i;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new C1518e4(context2, str2, adManagerAdRequest2.zza(), i2, appOpenAdLoadCallback).OooO00o();
                        } catch (IllegalStateException e) {
                            C1643hi.OooO0OO(context2).OooO00o("AppOpenAdManager.load", e);
                        }
                    }
                });
                return;
            }
        }
        new C1518e4(context, str, adManagerAdRequest.zza(), i, appOpenAdLoadCallback).OooO00o();
    }
}
