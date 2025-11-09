package o000oooo;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import o00oOoo.o000000;
import o00oOoo.o000OOo;

/* loaded from: classes3.dex */
public final class o00O000 extends FullScreenContentCallback {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31145OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f31146OooOo0o;

    public /* synthetic */ o00O000(Object obj, int i) {
        this.f31145OooOo0O = i;
        this.f31146OooOo0o = obj;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        switch (this.f31145OooOo0O) {
            case 0:
                super.onAdClicked();
                ((o00O000o) this.f31146OooOo0o).f31151OooO0OO.onAdClicked();
                break;
            case 1:
                super.onAdClicked();
                ((o00O00O) this.f31146OooOo0o).f31155OooO0OO.onAdClicked();
                break;
            case 2:
                super.onAdClicked();
                ((o000OOo) this.f31146OooOo0o).f32805OooO0OO.onAdClicked();
                break;
            default:
                super.onAdClicked();
                ((o000000) this.f31146OooOo0o).f32800OooO0OO.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        switch (this.f31145OooOo0O) {
            case 0:
                super.onAdDismissedFullScreenContent();
                ((o00O000o) this.f31146OooOo0o).f31151OooO0OO.onAdClosed();
                break;
            case 1:
                super.onAdDismissedFullScreenContent();
                ((o00O00O) this.f31146OooOo0o).f31155OooO0OO.onAdClosed();
                break;
            case 2:
                super.onAdDismissedFullScreenContent();
                ((o000OOo) this.f31146OooOo0o).f32805OooO0OO.onAdClosed();
                break;
            default:
                super.onAdDismissedFullScreenContent();
                ((o000000) this.f31146OooOo0o).f32800OooO0OO.onAdClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        switch (this.f31145OooOo0O) {
            case 0:
                super.onAdFailedToShowFullScreenContent(adError);
                ((o00O000o) this.f31146OooOo0o).f31151OooO0OO.onAdFailedToShow(adError.getCode(), adError.toString());
                break;
            case 1:
                super.onAdFailedToShowFullScreenContent(adError);
                ((o00O00O) this.f31146OooOo0o).f31155OooO0OO.onAdFailedToShow(adError.getCode(), adError.toString());
                break;
            case 2:
                super.onAdFailedToShowFullScreenContent(adError);
                ((o000OOo) this.f31146OooOo0o).f32805OooO0OO.onAdFailedToShow(adError.getCode(), adError.toString());
                break;
            default:
                super.onAdFailedToShowFullScreenContent(adError);
                ((o000000) this.f31146OooOo0o).f32800OooO0OO.onAdFailedToShow(adError.getCode(), adError.toString());
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        switch (this.f31145OooOo0O) {
            case 0:
                super.onAdImpression();
                ((o00O000o) this.f31146OooOo0o).f31151OooO0OO.onAdImpression();
                break;
            case 1:
                super.onAdImpression();
                ((o00O00O) this.f31146OooOo0o).f31155OooO0OO.onAdImpression();
                break;
            case 2:
                super.onAdImpression();
                ((o000OOo) this.f31146OooOo0o).f32805OooO0OO.onAdImpression();
                break;
            default:
                super.onAdImpression();
                ((o000000) this.f31146OooOo0o).f32800OooO0OO.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        switch (this.f31145OooOo0O) {
            case 0:
                super.onAdShowedFullScreenContent();
                ((o00O000o) this.f31146OooOo0o).f31151OooO0OO.onAdOpened();
                break;
            case 1:
                super.onAdShowedFullScreenContent();
                ((o00O00O) this.f31146OooOo0o).f31155OooO0OO.onAdOpened();
                break;
            case 2:
                super.onAdShowedFullScreenContent();
                ((o000OOo) this.f31146OooOo0o).f32805OooO0OO.onAdOpened();
                break;
            default:
                super.onAdShowedFullScreenContent();
                ((o000000) this.f31146OooOo0o).f32800OooO0OO.onAdOpened();
                break;
        }
    }
}
