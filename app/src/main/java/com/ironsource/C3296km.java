package com.ironsource;

import android.app.Activity;
import com.ironsource.C3192hm;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;

/* renamed from: com.ironsource.km */
/* loaded from: classes2.dex */
public final class C3296km {

    /* renamed from: a */
    private final InterfaceC3116fg f9265a;

    /* renamed from: b */
    private final C3192hm f9266b;

    /* renamed from: com.ironsource.km$a */
    public static final class a implements InterfaceC3753v1 {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3753v1
        /* renamed from: a */
        public AbstractC3718u1 mo9691a(boolean z, C3061e1 adProperties) {
            kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
            return C3666sj.f11913z.m12286a(adProperties, C3296km.this.f9265a.mo8694t().mo8493a(), z);
        }
    }

    public C3296km(String adUnitId, C3192hm.b config, C3349m1 adTools, C3113fd adControllerFactory, InterfaceC3116fg provider, InterfaceC3621s9 currentTimeProvider, C3697tf idFactory) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(adControllerFactory, "adControllerFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(provider, "provider");
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(idFactory, "idFactory");
        this.f9265a = provider;
        this.f9266b = new C3192hm(LevelPlay.AdFormat.INTERSTITIAL, adUnitId, config, adTools, adControllerFactory, m9685a(), provider, currentTimeProvider, idFactory);
    }

    /* renamed from: b */
    public final String m9688b() {
        String string = this.f9266b.m9196f().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    /* renamed from: c */
    public final boolean m9689c() {
        IronLog.API.info("LevelPlayInterstitialAd.isAdReady()");
        return this.f9266b.m9204n();
    }

    /* renamed from: d */
    public final void m9690d() {
        IronLog.API.info("LevelPlayInterstitialAd.loadAd()");
        this.f9266b.m9205o();
    }

    /* renamed from: a */
    private final InterfaceC3753v1 m9685a() {
        return new a();
    }

    /* renamed from: a */
    public final void m9686a(Activity activity, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        IronLog.API.info("LevelPlayInterstitialAd.showAd() placementName: " + str);
        this.f9266b.m9186a(activity, str);
    }

    /* renamed from: a */
    public final void m9687a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        IronLog.API.info("LevelPlayInterstitialAd.setListener()");
        this.f9266b.m9188a(levelPlayInterstitialAdListener != null ? C3335lm.m9829b(levelPlayInterstitialAdListener) : null);
    }
}
