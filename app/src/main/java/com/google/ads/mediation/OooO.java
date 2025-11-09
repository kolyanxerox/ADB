package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.C1451ca;
import com.google.android.gms.internal.ads.x30;

/* loaded from: classes2.dex */
public final class OooO extends AdListener implements zzi, zzg, zzf {

    /* renamed from: OooOo */
    public final Object f15863OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f15864OooOo0O = 0;

    /* renamed from: OooOo0o */
    public final Object f15865OooOo0o;

    public OooO(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f15865OooOo0o = abstractAdViewAdapter;
        this.f15863OooOo = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        switch (this.f15864OooOo0O) {
            case 0:
                ((MediationNativeListener) this.f15863OooOo).onAdClicked((AbstractAdViewAdapter) this.f15865OooOo0o);
                break;
            default:
                super.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        switch (this.f15864OooOo0O) {
            case 0:
                ((MediationNativeListener) this.f15863OooOo).onAdClosed((AbstractAdViewAdapter) this.f15865OooOo0o);
                break;
            default:
                super.onAdClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        switch (this.f15864OooOo0O) {
            case 0:
                ((MediationNativeListener) this.f15863OooOo).onAdFailedToLoad((AbstractAdViewAdapter) this.f15865OooOo0o, loadAdError);
                break;
            default:
                ((x30) this.f15863OooOo).o000O(x30.o000O0oo(loadAdError), (String) this.f15865OooOo0o);
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        switch (this.f15864OooOo0O) {
            case 0:
                ((MediationNativeListener) this.f15863OooOo).onAdImpression((AbstractAdViewAdapter) this.f15865OooOo0o);
                break;
            default:
                super.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        switch (this.f15864OooOo0O) {
            case 0:
                break;
            default:
                super.onAdLoaded();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        switch (this.f15864OooOo0O) {
            case 0:
                ((MediationNativeListener) this.f15863OooOo).onAdOpened((AbstractAdViewAdapter) this.f15865OooOo0o);
                break;
            default:
                super.onAdOpened();
                break;
        }
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public void zza(UnifiedNativeAd unifiedNativeAd) {
        OooO00o oooO00o = new OooO00o();
        oooO00o.setHeadline(unifiedNativeAd.zzh());
        oooO00o.setImages(unifiedNativeAd.zzk());
        oooO00o.setBody(unifiedNativeAd.zzf());
        oooO00o.setIcon(unifiedNativeAd.zzb());
        oooO00o.setCallToAction(unifiedNativeAd.zzg());
        oooO00o.setAdvertiser(unifiedNativeAd.zze());
        oooO00o.setStarRating(unifiedNativeAd.zzc());
        oooO00o.setStore(unifiedNativeAd.zzj());
        oooO00o.setPrice(unifiedNativeAd.zzi());
        oooO00o.zzd(unifiedNativeAd.zzd());
        oooO00o.setOverrideImpressionRecording(true);
        oooO00o.setOverrideClickHandling(true);
        oooO00o.zze(unifiedNativeAd.zza());
        ((MediationNativeListener) this.f15863OooOo).onAdLoaded((AbstractAdViewAdapter) this.f15865OooOo0o, oooO00o);
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public void zzb(C1451ca c1451ca, String str) {
        ((MediationNativeListener) this.f15863OooOo).zze((AbstractAdViewAdapter) this.f15865OooOo0o, c1451ca, str);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public void zzc(C1451ca c1451ca) {
        ((MediationNativeListener) this.f15863OooOo).zzd((AbstractAdViewAdapter) this.f15865OooOo0o, c1451ca);
    }

    public OooO(x30 x30Var, String str) {
        this.f15865OooOo0o = str;
        this.f15863OooOo = x30Var;
    }

    private final void OooO00o() {
    }
}
