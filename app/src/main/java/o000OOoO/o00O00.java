package o000oooo;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import o000Ooo.o00oO0o;
import o00oOoo.o000000;

/* loaded from: classes3.dex */
public final class o00O00 extends RewardedAdLoadCallback {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31143OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f31144OooOo0o;

    public /* synthetic */ o00O00(Object obj, int i) {
        this.f31143OooOo0O = i;
        this.f31144OooOo0o = obj;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        switch (this.f31143OooOo0O) {
            case 0:
                super.onAdFailedToLoad(loadAdError);
                ((o00O00O) this.f31144OooOo0o).f31155OooO0OO.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
                break;
            default:
                super.onAdFailedToLoad(loadAdError);
                ((o000000) this.f31144OooOo0o).f32800OooO0OO.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        switch (this.f31143OooOo0O) {
            case 0:
                RewardedAd rewardedAd2 = rewardedAd;
                super.onAdLoaded(rewardedAd2);
                o00O00O o00o00o = (o00O00O) this.f31144OooOo0o;
                o00o00o.f31155OooO0OO.onAdLoaded();
                rewardedAd2.setFullScreenContentCallback(o00o00o.f31157OooO0o);
                o00o00o.f31154OooO0O0.f31133OooO0OO = rewardedAd2;
                o00oO0o o00oo0o = o00o00o.f31138OooO00o;
                if (o00oo0o != null) {
                    o00oo0o.OooO0o0();
                    break;
                }
                break;
            default:
                RewardedAd rewardedAd3 = rewardedAd;
                super.onAdLoaded(rewardedAd3);
                o000000 o000000Var = (o000000) this.f31144OooOo0o;
                o000000Var.f32800OooO0OO.onAdLoaded();
                rewardedAd3.setFullScreenContentCallback(o000000Var.f32802OooO0o);
                o000000Var.f32799OooO0O0.f31133OooO0OO = rewardedAd3;
                o00oO0o o00oo0o2 = o000000Var.f31138OooO00o;
                if (o00oo0o2 != null) {
                    o00oo0o2.OooO0o0();
                    break;
                }
                break;
        }
    }
}
