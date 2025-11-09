package com.ironsource;

import android.app.Activity;
import com.ironsource.C3183hd;
import com.ironsource.InterfaceC3171h1;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.md */
/* loaded from: classes2.dex */
public final class C3361md implements InterfaceC3520pd {

    /* renamed from: a */
    private final C3192hm f9517a;

    /* renamed from: b */
    private final InterfaceC3621s9 f9518b;

    /* renamed from: c */
    private final long f9519c;

    /* renamed from: d */
    private final LevelPlayAdInfo f9520d;

    public C3361md(C3192hm adInternal, InterfaceC3621s9 currentTimeProvider) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInternal, "adInternal");
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        this.f9517a = adInternal;
        this.f9518b = currentTimeProvider;
        this.f9519c = currentTimeProvider.mo11889a();
        String string = adInternal.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
        this.f9520d = new LevelPlayAdInfo(string, adInternal.m9199i(), adInternal.m9195e().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9113a() {
        this.f9517a.m9193a("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: b */
    public void mo9116b() {
        this.f9517a.m9193a("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: c */
    public LevelPlayAdInfo mo9117c() {
        return this.f9520d;
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: d */
    public InterfaceC3171h1 mo9118d() {
        return new InterfaceC3171h1.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void loadAd() {
        String string = this.f9517a.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
        this.f9517a.m9190a(new LevelPlayAdError(string, this.f9517a.m9199i(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.f9518b.mo11889a() - this.f9519c);
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClicked() {
        this.f9517a.m9193a("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClosed() {
        this.f9517a.m9193a("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f9517a.m9193a("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f9517a.m9190a(error, this.f9518b.mo11889a() - this.f9519c);
        this.f9517a.m9187a(C3183hd.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3192hm c3192hm = this.f9517a;
        c3192hm.m9189a(new C3322ld(c3192hm, adInfo, this.f9518b));
        this.f9517a.m9192a(adInfo);
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9114a(Activity activity, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        String string = this.f9517a.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adInternal.adId.toString()");
        this.f9517a.m9191a(new LevelPlayAdError(string, this.f9517a.m9199i(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.f9520d);
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9115a(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f9517a.m9193a("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
