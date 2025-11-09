package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC3765vd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* renamed from: com.ironsource.ed */
/* loaded from: classes2.dex */
public final class C3073ed extends AbstractC3347m implements InterfaceC3695td, InterfaceC3730ud {

    /* renamed from: b */
    private final InterfaceC3148gd f8403b;

    /* renamed from: c */
    private final C3061e1 f8404c;

    /* renamed from: d */
    private final InterfaceC3765vd f8405d;

    public C3073ed(InterfaceC3148gd listener, C3349m1 adTools, C3061e1 adProperties, InterfaceC3765vd.b adUnitStrategyFactory, InterfaceC3590rd fullscreenAdUnitFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitStrategyFactory, "adUnitStrategyFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.f8403b = listener;
        this.f8404c = adProperties;
        this.f8405d = adUnitStrategyFactory.m12773a(adTools, adTools.m9965b(adProperties.m8439e(), adProperties.m8437c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC3730ud
    /* renamed from: a */
    public void mo8468a() {
        this.f8403b.mo8943a();
    }

    @Override // com.ironsource.InterfaceC3730ud
    /* renamed from: b */
    public void mo8472b() {
        this.f8403b.mo8946b();
    }

    @Override // com.ironsource.InterfaceC3207i2
    /* renamed from: h */
    public void mo7754h() {
        this.f8403b.onAdClicked();
    }

    /* renamed from: o */
    public final void m8474o() {
        this.f8405d.loadAd();
    }

    @Override // com.ironsource.InterfaceC3730ud
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8403b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC3695td
    public void onClosed() {
        this.f8403b.onAdClosed();
    }

    public /* synthetic */ C3073ed(InterfaceC3148gd interfaceC3148gd, C3349m1 c3349m1, C3061e1 c3061e1, InterfaceC3765vd.b bVar, InterfaceC3590rd interfaceC3590rd, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(interfaceC3148gd, c3349m1, c3061e1, (i & 8) != 0 ? new InterfaceC3765vd.b() : bVar, interfaceC3590rd);
    }

    /* renamed from: a */
    public final void m8469a(Activity activity, Placement placement) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f8404c.m8435a(placement);
        this.f8405d.mo8113a(activity);
    }

    @Override // com.ironsource.InterfaceC3730ud
    /* renamed from: b */
    public void mo8473b(IronSourceError ironSourceError) {
        InterfaceC3148gd interfaceC3148gd = this.f8403b;
        String string = this.f8404c.m8436b().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adProperties.adId.toString()");
        interfaceC3148gd.mo8944a(new LevelPlayAdError(ironSourceError, string, this.f8404c.m8437c()));
    }

    @Override // com.ironsource.InterfaceC3730ud
    /* renamed from: a */
    public void mo8470a(IronSourceError ironSourceError) {
        InterfaceC3148gd interfaceC3148gd = this.f8403b;
        String string = this.f8404c.m8436b().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adProperties.adId.toString()");
        interfaceC3148gd.onAdLoadFailed(new LevelPlayAdError(ironSourceError, string, this.f8404c.m8437c()));
    }

    @Override // com.ironsource.InterfaceC3730ud
    /* renamed from: a */
    public void mo8471a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8403b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC3695td
    /* renamed from: a */
    public void mo7750a(LevelPlayReward reward) {
        kotlin.jvm.internal.OooOo.OooO0o0(reward, "reward");
        this.f8403b.mo8945a(reward);
    }
}
