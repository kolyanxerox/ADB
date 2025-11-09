package o000oooo;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.services.banners.BannerView;
import o00oOoo.o0OO00O;
import o00oOoo.oo0o0Oo;

/* loaded from: classes3.dex */
public final class o00 extends AdListener {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31129OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f31130OooOo0o;

    public /* synthetic */ o00(Object obj, int i) {
        this.f31129OooOo0O = i;
        this.f31130OooOo0o = obj;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        switch (this.f31129OooOo0O) {
            case 0:
                super.onAdClicked();
                ((o00O0000) this.f31130OooOo0o).f31147OooO0O0.onAdClicked();
                break;
            default:
                super.onAdClicked();
                ((oo0o0Oo) this.f31130OooOo0o).f32813OooO0O0.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        switch (this.f31129OooOo0O) {
            case 0:
                super.onAdClosed();
                ((o00O0000) this.f31130OooOo0o).f31147OooO0O0.onAdClosed();
                break;
            default:
                super.onAdClosed();
                ((oo0o0Oo) this.f31130OooOo0o).f32813OooO0O0.onAdClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        AdView adView;
        AdView adView2;
        switch (this.f31129OooOo0O) {
            case 0:
                super.onAdFailedToLoad(loadAdError);
                o00O0000 o00o0000 = (o00O0000) this.f31130OooOo0o;
                o000OOo0 o000ooo02 = o00o0000.f31148OooO0OO;
                BannerView bannerView = o000ooo02.f31140OooO0oo;
                if (bannerView != null && (adView = o000ooo02.f31142OooOO0O) != null) {
                    bannerView.removeView(adView);
                }
                o00o0000.f31147OooO0O0.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
                break;
            default:
                super.onAdFailedToLoad(loadAdError);
                oo0o0Oo oo0o0oo = (oo0o0Oo) this.f31130OooOo0o;
                o0OO00O o0oo00o = oo0o0oo.f32814OooO0OO;
                BannerView bannerView2 = o0oo00o.f32810OooO0oo;
                if (bannerView2 != null && (adView2 = o0oo00o.f32812OooOO0O) != null) {
                    bannerView2.removeView(adView2);
                }
                oo0o0oo.f32813OooO0O0.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        switch (this.f31129OooOo0O) {
            case 0:
                super.onAdImpression();
                ((o00O0000) this.f31130OooOo0o).f31147OooO0O0.onAdImpression();
                break;
            default:
                super.onAdImpression();
                ((oo0o0Oo) this.f31130OooOo0o).f32813OooO0O0.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        switch (this.f31129OooOo0O) {
            case 0:
                super.onAdLoaded();
                ((o00O0000) this.f31130OooOo0o).f31147OooO0O0.onAdLoaded();
                break;
            default:
                super.onAdLoaded();
                ((oo0o0Oo) this.f31130OooOo0o).f32813OooO0O0.onAdLoaded();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        switch (this.f31129OooOo0O) {
            case 0:
                super.onAdOpened();
                ((o00O0000) this.f31130OooOo0o).f31147OooO0O0.onAdOpened();
                break;
            default:
                super.onAdOpened();
                ((oo0o0Oo) this.f31130OooOo0o).f32813OooO0O0.onAdOpened();
                break;
        }
    }
}
