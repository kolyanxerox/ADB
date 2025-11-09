package o00oOoo;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.unity3d.services.banners.BannerView;
import o000ooOO.o000O0Oo;
import o000oooo.o000O;
import o000oooo.o000OO00;

/* loaded from: classes3.dex */
public final class o0OO00O extends o000O {

    /* renamed from: OooO */
    public int f32809OooO;

    /* renamed from: OooO0oo */
    public BannerView f32810OooO0oo;

    /* renamed from: OooOO0 */
    public int f32811OooOO0;

    /* renamed from: OooOO0O */
    public AdView f32812OooOO0O;

    @Override // o000oooo.o000O
    public final void OooO0o(AdRequest adRequest) {
        AdView adView;
        BannerView bannerView = this.f32810OooO0oo;
        if (bannerView == null || (adView = this.f32812OooOO0O) == null) {
            return;
        }
        bannerView.addView(adView);
        adView.setAdSize(new AdSize(this.f32809OooO, this.f32811OooOO0));
        adView.setAdUnitId(((o000O0Oo) this.f31134OooO0Oo).f31115OooO0OO);
        adView.setAdListener(((oo0o0Oo) ((o000OO00) this.f31135OooO0o)).f32815OooO0Oo);
        adView.loadAd(adRequest);
    }
}
