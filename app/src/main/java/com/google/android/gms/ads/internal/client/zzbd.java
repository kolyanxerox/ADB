package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* loaded from: classes2.dex */
public class zzbd extends AdListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final Object f16015OooOo0O = new Object();

    /* renamed from: OooOo0o, reason: collision with root package name */
    public AdListener f16016OooOo0o;

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        synchronized (this.f16015OooOo0O) {
            try {
                AdListener adListener = this.f16016OooOo0o;
                if (adListener != null) {
                    adListener.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.f16015OooOo0O) {
            try {
                AdListener adListener = this.f16016OooOo0o;
                if (adListener != null) {
                    adListener.onAdClosed();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.f16015OooOo0O) {
            try {
                AdListener adListener = this.f16016OooOo0o;
                if (adListener != null) {
                    adListener.onAdFailedToLoad(loadAdError);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.f16015OooOo0O) {
            try {
                AdListener adListener = this.f16016OooOo0o;
                if (adListener != null) {
                    adListener.onAdImpression();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.f16015OooOo0O) {
            try {
                AdListener adListener = this.f16016OooOo0o;
                if (adListener != null) {
                    adListener.onAdLoaded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.f16015OooOo0O) {
            try {
                AdListener adListener = this.f16016OooOo0o;
                if (adListener != null) {
                    adListener.onAdOpened();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(AdListener adListener) {
        synchronized (this.f16015OooOo0O) {
            this.f16016OooOo0o = adListener;
        }
    }
}
