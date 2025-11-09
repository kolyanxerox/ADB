package com.ironsource;

import android.app.Activity;
import com.ironsource.C3183hd;
import com.ironsource.InterfaceC3171h1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.ld */
/* loaded from: classes2.dex */
public final class C3322ld implements InterfaceC3520pd {

    /* renamed from: a */
    private final C3192hm f9320a;

    /* renamed from: b */
    private LevelPlayAdInfo f9321b;

    /* renamed from: c */
    private final InterfaceC3621s9 f9322c;

    /* renamed from: d */
    private final long f9323d;

    public C3322ld(C3192hm adInternal, LevelPlayAdInfo adInfo, InterfaceC3621s9 currentTimeProvider) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInternal, "adInternal");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        this.f9320a = adInternal;
        this.f9321b = adInfo;
        this.f9322c = currentTimeProvider;
        this.f9323d = currentTimeProvider.mo11889a();
    }

    /* renamed from: e */
    private final long m9761e() {
        return this.f9322c.mo11889a() - this.f9323d;
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9113a() {
        IronLog.INTERNAL.verbose(C3349m1.m9956a(this.f9320a.m9197g(), "onAdExpired", (String) null, 2, (Object) null));
        this.f9320a.m9187a(C3183hd.a.Expired);
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: b */
    public void mo9116b() {
        this.f9320a.m9193a("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: c */
    public LevelPlayAdInfo mo9117c() {
        return this.f9321b;
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: d */
    public InterfaceC3171h1 mo9118d() {
        C3445n8 c3445n8Mo7975a = this.f9320a.m9203m().mo8695u().mo7975a(this.f9320a.m9199i());
        return c3445n8Mo7975a.m10966d() ? InterfaceC3171h1.a.f8789c.m9036a(c3445n8Mo7975a.m10967e()) : InterfaceC3171h1.b.f8792a;
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void loadAd() {
        this.f9320a.m9197g().m9970e().m7911h().m9902a(Long.valueOf(m9761e()));
        this.f9320a.m9192a(this.f9321b);
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClicked() {
        this.f9320a.m9193a("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdClosed() {
        this.f9320a.m9193a("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3349m1 c3349m1M9197g = this.f9320a.m9197g();
        IronLog.INTERNAL.verbose(C3349m1.m9956a(c3349m1M9197g, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        c3349m1M9197g.m9970e().m7911h().m9901a(this.f9321b, adInfo);
        this.f9321b = adInfo;
        c3349m1M9197g.m13102e(new o00000O0(13, this, adInfo));
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoadFailed(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f9320a.m9193a("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3520pd
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f9320a.m9193a("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9114a(Activity activity, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        Placement placementM9958a = this.f9320a.m9197g().m9958a(this.f9320a.m9195e(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.f9321b, str);
        this.f9321b = levelPlayAdInfo;
        C3192hm c3192hm = this.f9320a;
        c3192hm.m9189a(new C3450nd(c3192hm, levelPlayAdInfo));
        this.f9320a.m9194d().m8469a(activity, placementM9958a);
    }

    /* renamed from: a */
    public static final void m9760a(C3322ld this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        InterfaceC3227im interfaceC3227imM9202l = this$0.f9320a.m9202l();
        if (interfaceC3227imM9202l != null) {
            interfaceC3227imM9202l.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3520pd
    /* renamed from: a */
    public void mo9115a(LevelPlayAdError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        this.f9320a.m9193a("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
