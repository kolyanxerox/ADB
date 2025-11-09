package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC3171h1;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.hd */
/* loaded from: classes2.dex */
public final class C3183hd implements InterfaceC3520pd {

    /* renamed from: a */
    private final C3192hm f8857a;

    /* renamed from: b */
    private final a f8858b;

    /* renamed from: c */
    private final LevelPlayAdInfo f8859c;

    /* renamed from: com.ironsource.hd$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C3183hd(C3192hm adInternal, a status) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInternal, "adInternal");
        kotlin.jvm.internal.OooOo.OooO0o0(status, "status");
        this.f8857a = adInternal;
        this.f8858b = status;
        String string = adInternal.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
        this.f8859c = new LevelPlayAdInfo(string, adInternal.m9199i(), adInternal.m9195e().toString(), null, null, null, null, 120, null);
    }

    /* renamed from: e */
    private final boolean m9112e() {
        if (this.f8857a.m9199i().length() == 0) {
            C3192hm c3192hm = this.f8857a;
            String string = this.f8857a.m9196f().toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
            C3192hm.m9170a(c3192hm, new LevelPlayAdError(string, this.f8857a.m9199i(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f8857a.m9197g().m9972g()) {
            C3192hm c3192hm2 = this.f8857a;
            String string2 = this.f8857a.m9196f().toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string2, "adInternal.adId.toString()");
            C3192hm.m9170a(c3192hm2, new LevelPlayAdError(string2, this.f8857a.m9199i(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        C3122fm c3122fmMo8493a = this.f8857a.m9203m().mo8694t().mo8493a();
        if (c3122fmMo8493a != null && c3122fmMo8493a.m8719a(this.f8857a.m9199i(), this.f8857a.m9195e())) {
            return true;
        }
        C3192hm c3192hm3 = this.f8857a;
        String string3 = this.f8857a.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string3, "adInternal.adId.toString()");
        C3192hm.m9170a(c3192hm3, new LevelPlayAdError(string3, this.f8857a.m9199i(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9113a() {
        this.f8857a.m9193a("onAdExpired on " + this.f8858b + " state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: b */
    public void mo9116b() {
        this.f8857a.m9193a("onAdDisplayed on " + this.f8858b + " state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: c */
    public LevelPlayAdInfo mo9117c() {
        return this.f8859c;
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: d */
    public InterfaceC3171h1 mo9118d() {
        return new InterfaceC3171h1.a(this.f8858b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void loadAd() {
        if (m9112e()) {
            this.f8857a.m9206p();
        }
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClicked() {
        this.f8857a.m9193a("onAdClicked on " + this.f8858b + " state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClosed() {
        this.f8857a.m9193a("onAdClosed on " + this.f8858b + " state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8857a.m9193a("onAdInfoChanged on " + this.f8858b + " state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f8857a.m9193a("onAdLoadFailed on " + this.f8858b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8857a.m9193a("onAdLoaded on " + this.f8858b + " state");
    }

    public /* synthetic */ C3183hd(C3192hm c3192hm, a aVar, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3192hm, (i & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9114a(Activity activity, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        String str2 = this.f8858b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String string = this.f8857a.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
        this.f8857a.m9191a(new LevelPlayAdError(string, this.f8857a.m9199i(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.f8859c);
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9115a(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f8857a.m9193a("onAdDisplayFailed on " + this.f8858b + " state with error: " + error.getErrorMessage());
    }
}
