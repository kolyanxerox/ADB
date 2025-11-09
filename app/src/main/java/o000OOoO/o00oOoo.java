package o000oooo;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import o000Ooo.o00oO0o;
import o00oOoo.o000OOo;

/* loaded from: classes3.dex */
public final class o00oOoo extends InterstitialAdLoadCallback {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31159OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f31160OooOo0o;

    public /* synthetic */ o00oOoo(Object obj, int i) {
        this.f31159OooOo0O = i;
        this.f31160OooOo0o = obj;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        switch (this.f31159OooOo0O) {
            case 0:
                super.onAdFailedToLoad(loadAdError);
                ((o00O000o) this.f31160OooOo0o).f31151OooO0OO.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
                break;
            default:
                super.onAdFailedToLoad(loadAdError);
                ((o000OOo) this.f31160OooOo0o).f32805OooO0OO.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        switch (this.f31159OooOo0O) {
            case 0:
                InterstitialAd interstitialAd2 = interstitialAd;
                super.onAdLoaded(interstitialAd2);
                o00O000o o00o000o = (o00O000o) this.f31160OooOo0o;
                o00o000o.f31151OooO0OO.onAdLoaded();
                interstitialAd2.setFullScreenContentCallback(o00o000o.f31153OooO0o0);
                o00o000o.f31150OooO0O0.f31133OooO0OO = interstitialAd2;
                o00oO0o o00oo0o = o00o000o.f31138OooO00o;
                if (o00oo0o != null) {
                    o00oo0o.OooO0o0();
                    break;
                }
                break;
            default:
                InterstitialAd interstitialAd3 = interstitialAd;
                super.onAdLoaded(interstitialAd3);
                o000OOo o000ooo2 = (o000OOo) this.f31160OooOo0o;
                o000ooo2.f32805OooO0OO.onAdLoaded();
                interstitialAd3.setFullScreenContentCallback(o000ooo2.f32807OooO0o0);
                o000ooo2.f32804OooO0O0.f31133OooO0OO = interstitialAd3;
                o00oO0o o00oo0o2 = o000ooo2.f31138OooO00o;
                if (o00oo0o2 != null) {
                    o00oo0o2.OooO0o0();
                    break;
                }
                break;
        }
    }
}
