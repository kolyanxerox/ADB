package com.ironsource;

import android.content.Context;
import android.os.Handler;
import com.ironsource.C3056dv;
import com.ironsource.InterfaceC3455ni;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAd;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ironsource.mv */
/* loaded from: classes2.dex */
public final class C3433mv implements C3056dv.c, C3056dv.d, C3056dv.b {

    /* renamed from: a */
    private final InterfaceC3455ni.a f10332a;

    /* renamed from: b */
    private final WeakReference<TestSuiteActivity> f10333b;

    /* renamed from: c */
    private final Handler f10334c;

    /* renamed from: d */
    private final AtomicReference<LevelPlayBannerAdView> f10335d;

    /* renamed from: e */
    private final AtomicReference<LevelPlayInterstitialAd> f10336e;

    /* renamed from: f */
    private final AtomicReference<LevelPlayRewardedAd> f10337f;

    public C3433mv(TestSuiteActivity activity, Handler handler) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(handler, "handler");
        this.f10332a = C3495on.f10667s.m11211a().mo8488s();
        this.f10333b = new WeakReference<>(activity);
        this.f10334c = handler;
        this.f10335d = new AtomicReference<>();
        this.f10336e = new AtomicReference<>();
        this.f10337f = new AtomicReference<>();
    }

    /* renamed from: f */
    private final TestSuiteActivity m10892f() {
        return this.f10333b.get();
    }

    @Override // com.ironsource.C3056dv.b
    /* renamed from: a */
    public void mo8407a(double d) {
        LevelPlayBannerAdView levelPlayBannerAdView;
        TestSuiteActivity testSuiteActivityM10892f = m10892f();
        if (testSuiteActivityM10892f == null || (levelPlayBannerAdView = this.f10335d.get()) == null || levelPlayBannerAdView.getParent() != null) {
            return;
        }
        this.f10334c.post(new o0ooOOo(testSuiteActivityM10892f, levelPlayBannerAdView, 1));
    }

    @Override // com.ironsource.C3056dv.b
    /* renamed from: b */
    public void mo8409b() {
        LevelPlayBannerAdView andSet;
        TestSuiteActivity testSuiteActivityM10892f = m10892f();
        if (testSuiteActivityM10892f == null || (andSet = this.f10335d.getAndSet(null)) == null) {
            return;
        }
        andSet.destroy();
        this.f10334c.post(new o0ooOOo(testSuiteActivityM10892f, andSet, 0));
    }

    @Override // com.ironsource.C3056dv.c
    /* renamed from: c */
    public void mo8411c() {
        TestSuiteActivity testSuiteActivityM10892f = m10892f();
        if (testSuiteActivityM10892f != null) {
            LevelPlayInterstitialAd levelPlayInterstitialAd = this.f10336e.get();
            kotlin.jvm.internal.OooOo.OooO0Oo(levelPlayInterstitialAd, "interstitialAdRef.get()");
            LevelPlayInterstitialAd.showAd$default(levelPlayInterstitialAd, testSuiteActivityM10892f, null, 2, null);
        }
    }

    @Override // com.ironsource.C3056dv.d
    /* renamed from: d */
    public void mo8415d() {
        TestSuiteActivity testSuiteActivityM10892f = m10892f();
        if (testSuiteActivityM10892f != null) {
            LevelPlayRewardedAd levelPlayRewardedAd = this.f10337f.get();
            kotlin.jvm.internal.OooOo.OooO0Oo(levelPlayRewardedAd, "rewardedAdRef.get()");
            LevelPlayRewardedAd.showAd$default(levelPlayRewardedAd, testSuiteActivityM10892f, null, 2, null);
        }
    }

    @Override // com.ironsource.C3056dv.c
    /* renamed from: e */
    public boolean mo8412e() {
        LevelPlayInterstitialAd levelPlayInterstitialAd = this.f10336e.get();
        if (levelPlayInterstitialAd != null) {
            return levelPlayInterstitialAd.isAdReady();
        }
        return false;
    }

    @Override // com.ironsource.C3056dv.c
    /* renamed from: a */
    public void mo8410a(C3270jv loadAdConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadAdConfig, "loadAdConfig");
        this.f10332a.mo9704a(loadAdConfig);
        AtomicReference<LevelPlayInterstitialAd> atomicReference = this.f10336e;
        String strM9543a = loadAdConfig.m9543a();
        if (strM9543a == null) {
            strM9543a = "";
        }
        LevelPlayInterstitialAd levelPlayInterstitialAd = new LevelPlayInterstitialAd(strM9543a);
        levelPlayInterstitialAd.setListener(new C3503ov());
        levelPlayInterstitialAd.loadAd();
        atomicReference.set(levelPlayInterstitialAd);
    }

    @Override // com.ironsource.C3056dv.d
    /* renamed from: b */
    public void mo8414b(C3270jv loadAdConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadAdConfig, "loadAdConfig");
        this.f10332a.mo9704a(loadAdConfig);
        AtomicReference<LevelPlayRewardedAd> atomicReference = this.f10337f;
        String strM9543a = loadAdConfig.m9543a();
        if (strM9543a == null) {
            strM9543a = "";
        }
        LevelPlayRewardedAd levelPlayRewardedAd = new LevelPlayRewardedAd(strM9543a);
        levelPlayRewardedAd.setListener(new C3538pv());
        levelPlayRewardedAd.loadAd();
        atomicReference.set(levelPlayRewardedAd);
    }

    /* renamed from: b */
    public static final void m10891b(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView it) {
        kotlin.jvm.internal.OooOo.OooO0o0(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.OooOo.OooO0o0(it, "$it");
        testSuiteActivity.getContainer().removeView(it);
    }

    @Override // com.ironsource.C3056dv.b
    /* renamed from: a */
    public void mo8408a(C3270jv loadAdConfig, String description, int i, int i2) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadAdConfig, "loadAdConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(description, "description");
        mo8409b();
        TestSuiteActivity testSuiteActivityM10892f = m10892f();
        if (testSuiteActivityM10892f != null) {
            this.f10332a.mo9704a(loadAdConfig);
            LevelPlayBannerAdView.Config configBuild = new LevelPlayBannerAdView.Config.Builder().setAdSize(C3573qv.f11160a.m11677b(description, i, i2)).build();
            AtomicReference<LevelPlayBannerAdView> atomicReference = this.f10335d;
            String strM9543a = loadAdConfig.m9543a();
            if (strM9543a == null) {
                strM9543a = "";
            }
            LevelPlayBannerAdView levelPlayBannerAdView = new LevelPlayBannerAdView(testSuiteActivityM10892f, strM9543a, configBuild);
            levelPlayBannerAdView.setBannerListener(new C3468nv());
            levelPlayBannerAdView.pauseAutoRefresh();
            levelPlayBannerAdView.loadAd();
            atomicReference.set(levelPlayBannerAdView);
        }
    }

    /* renamed from: a */
    public static final void m10890a(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView banner) {
        kotlin.jvm.internal.OooOo.OooO0o0(testSuiteActivity, "$testSuiteActivity");
        kotlin.jvm.internal.OooOo.OooO0o0(banner, "$banner");
        testSuiteActivity.getContainer().addView(banner, C3783vv.f12423a.m12828a((Context) testSuiteActivity));
    }

    @Override // com.ironsource.C3056dv.d
    /* renamed from: a */
    public boolean mo8413a() {
        LevelPlayRewardedAd levelPlayRewardedAd = this.f10337f.get();
        if (levelPlayRewardedAd != null) {
            return levelPlayRewardedAd.isAdReady();
        }
        return false;
    }
}
