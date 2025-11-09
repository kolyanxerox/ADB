package o000oooo;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.unity3d.services.banners.BannerView;
import o000ooOO.o000O0Oo;

/* loaded from: classes3.dex */
public final class o000OOo0 extends o000O {

    /* renamed from: OooO */
    public int f31139OooO;

    /* renamed from: OooO0oo */
    public BannerView f31140OooO0oo;

    /* renamed from: OooOO0 */
    public int f31141OooOO0;

    /* renamed from: OooOO0O */
    public AdView f31142OooOO0O;

    @Override // o000oooo.o000O
    public final void OooO0o(AdRequest adRequest) {
        AdView adView;
        BannerView bannerView = this.f31140OooO0oo;
        if (bannerView == null || (adView = this.f31142OooOO0O) == null) {
            return;
        }
        bannerView.addView(adView);
        adView.setAdSize(new AdSize(this.f31139OooO, this.f31141OooOO0));
        adView.setAdUnitId(((o000O0Oo) this.f31134OooO0Oo).f31115OooO0OO);
        adView.setAdListener(((o00O0000) ((o000OO00) this.f31135OooO0o)).f31149OooO0Oo);
        adView.loadAd(adRequest);
    }
}
