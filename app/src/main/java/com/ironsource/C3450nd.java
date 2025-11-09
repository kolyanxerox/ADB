package com.ironsource;

import android.app.Activity;
import com.ironsource.C3183hd;
import com.ironsource.InterfaceC3171h1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.nd */
/* loaded from: classes2.dex */
public final class C3450nd implements InterfaceC3520pd {

    /* renamed from: a */
    private final C3192hm f10397a;

    /* renamed from: b */
    private final LevelPlayAdInfo f10398b;

    public C3450nd(C3192hm adInternal, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInternal, "adInternal");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10397a = adInternal;
        this.f10398b = adInfo;
    }

    /* renamed from: a */
    private final InterfaceC3520pd m10987a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (!C3001cb.f7731a.m8107a(C3783vv.f12423a.m12830a(levelPlayAdError))) {
            return new C3183hd(this.f10397a, C3183hd.a.ShowFailed);
        }
        C3192hm c3192hm = this.f10397a;
        return new C3322ld(c3192hm, levelPlayAdInfo, c3192hm.m9201k());
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: b */
    public void mo9116b() {
        C3349m1 c3349m1M9197g = this.f10397a.m9197g();
        IronLog.INTERNAL.verbose(C3349m1.m9956a(c3349m1M9197g, "onAdDisplayed adInfo: " + this.f10398b, (String) null, 2, (Object) null));
        c3349m1M9197g.m9970e().m7911h().m9915e();
        C3192hm c3192hm = this.f10397a;
        c3192hm.m9189a(new C3485od(c3192hm, this.f10398b));
        c3349m1M9197g.m13102e(new OooO0o(this, 7));
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: c */
    public LevelPlayAdInfo mo9117c() {
        return this.f10398b;
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: d */
    public InterfaceC3171h1 mo9118d() {
        return new InterfaceC3171h1.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void loadAd() {
        String string = this.f10397a.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
        C3192hm.m9170a(this.f10397a, new LevelPlayAdError(string, this.f10397a.m9199i(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClicked() {
        this.f10397a.m9193a("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClosed() {
        this.f10397a.m9193a("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10397a.m9193a("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f10397a.m9193a("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10397a.m9193a("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9113a() {
        this.f10397a.m9193a("onAdExpired on showing state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9114a(Activity activity, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        String string = this.f10397a.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
        this.f10397a.m9191a(new LevelPlayAdError(string, this.f10397a.m9199i(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.f10398b);
    }

    /* renamed from: a */
    public static final void m10988a(C3450nd this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        InterfaceC3227im interfaceC3227imM9202l = this$0.f10397a.m9202l();
        if (interfaceC3227imM9202l != null) {
            interfaceC3227imM9202l.onAdDisplayed(this$0.f10398b);
        }
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9115a(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f10397a.m9189a(m10987a(error, this.f10398b));
        this.f10397a.m9191a(error, this.f10398b);
    }
}
