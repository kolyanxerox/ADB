package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.C2992c2;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.sdk.mediation.C3658R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;

/* renamed from: com.ironsource.ml */
/* loaded from: classes2.dex */
public final class C3423ml implements InterfaceC3791w5 {

    /* renamed from: n */
    public static final a f10292n = new a(null);

    /* renamed from: a */
    private final UUID f10293a;

    /* renamed from: b */
    private final String f10294b;

    /* renamed from: c */
    private final C3792w6 f10295c;

    /* renamed from: d */
    private final LevelPlayBannerAdView.Config f10296d;

    /* renamed from: e */
    private final C3349m1 f10297e;

    /* renamed from: f */
    private final InterfaceC3455ni f10298f;

    /* renamed from: g */
    private LevelPlayAdSize f10299g;

    /* renamed from: h */
    private LevelPlayBannerAdViewListener f10300h;

    /* renamed from: i */
    private String f10301i;

    /* renamed from: j */
    private C3757v5 f10302j;

    /* renamed from: k */
    private Boolean f10303k;

    /* renamed from: l */
    private Placement f10304l;

    /* renamed from: m */
    private boolean f10305m;

    /* renamed from: com.ironsource.ml$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final oo00o.OooOO0 m10862a(Context context, AttributeSet attributeSet) {
            kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
            String str = "";
            if (attributeSet == null) {
                return new oo00o.OooOO0("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3658R.styleable.LevelPlayBannerAdView);
            kotlin.jvm.internal.OooOo.OooO0Oo(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (typedArrayObtainStyledAttributes.hasValue(C3658R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(C3658R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(C3658R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(C3658R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                oo00o.OooOO0 oooOO0 = new oo00o.OooOO0(str, builder.build());
                typedArrayObtainStyledAttributes.recycle();
                return oooOO0;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3423ml(UUID adId, String adUnitId, C3792w6 bannerContainer, LevelPlayBannerAdView.Config config, C3349m1 adTools) {
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        this.f10293a = adId;
        this.f10294b = adUnitId;
        this.f10295c = bannerContainer;
        this.f10296d = config;
        this.f10297e = adTools;
        this.f10298f = C3495on.f10667s.m11213d().mo8691o();
        LevelPlayAdSize adSize = config.getAdSize();
        this.f10299g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.f10301i = placementName == null ? "" : placementName;
        adTools.m9970e().m7903a(new C3436n(IronSource.AD_UNIT.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.m9970e().m7909f().m13106a(bidFloor.doubleValue());
        }
    }

    /* renamed from: a */
    private final C3757v5 m10824a() {
        this.f10304l = this.f10297e.m9959a(this.f10301i);
        Context context = this.f10295c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f10293a;
        String str = this.f10294b;
        Placement placement = this.f10304l;
        if (placement == null) {
            kotlin.jvm.internal.OooOo.OooOO0o("bannerPlacement");
            throw null;
        }
        C3245j6 c3245j6 = new C3245j6(uuid, str, placement, this.f10299g, null, null, this.f10298f.mo9703a(), this.f10296d.getBidFloor(), 48, null);
        this.f10297e.m9970e().m7903a(new C2628a2(this.f10297e, c3245j6, null, 4, null));
        ISBannerSize iSBannerSizeM9957a = this.f10297e.m9957a(c3245j6.m9442h());
        C2967bc c2967bcM9970e = this.f10297e.m9970e();
        C3349m1 c3349m1 = this.f10297e;
        Placement placement2 = this.f10304l;
        if (placement2 != null) {
            c2967bcM9970e.m7903a(new C3860y6(c3349m1, iSBannerSizeM9957a, placement2.getPlacementName()));
            return new C3757v5(this, this.f10297e, c3245j6, this.f10295c);
        }
        kotlin.jvm.internal.OooOo.OooOO0o("bannerPlacement");
        throw null;
    }

    /* renamed from: h */
    private final boolean m10841h() {
        LevelPlayAdError levelPlayAdError;
        if (this.f10294b.length() == 0) {
            String string = this.f10293a.toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(string, this.f10294b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified");
        } else {
            if (this.f10297e.m9972g()) {
                C3122fm c3122fmMo8493a = C3495on.f10667s.m11213d().mo8694t().mo8493a();
                if (c3122fmMo8493a != null && c3122fmMo8493a.m8719a(this.f10294b, LevelPlay.AdFormat.BANNER)) {
                    return true;
                }
                LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.f10300h;
                if (levelPlayBannerAdViewListener != null) {
                    String string2 = this.f10293a.toString();
                    kotlin.jvm.internal.OooOo.OooO0Oo(string2, "adId.toString()");
                    levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string2, this.f10294b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
                }
                return false;
            }
            String string3 = this.f10293a.toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string3, "adId.toString()");
            levelPlayAdError = new LevelPlayAdError(string3, this.f10294b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback");
        }
        mo10842a(levelPlayAdError);
        return false;
    }

    /* renamed from: b */
    public final void m10849b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.f10297e.m13101d(new oo000o(this, 1));
    }

    /* renamed from: c */
    public final UUID m10851c() {
        return this.f10293a;
    }

    /* renamed from: d */
    public final LevelPlayAdSize m10853d() {
        return this.f10299g;
    }

    /* renamed from: e */
    public final String m10855e() {
        return this.f10294b;
    }

    /* renamed from: f */
    public final LevelPlayBannerAdViewListener m10857f() {
        return this.f10300h;
    }

    /* renamed from: g */
    public final String m10858g() {
        return this.f10301i;
    }

    /* renamed from: i */
    public final void m10859i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.f10297e.m13101d(new oo000o(this, 2));
    }

    /* renamed from: j */
    public final void m10860j() {
        oo00o.OooOo oooOo;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        if (this.f10302j != null) {
            this.f10297e.m13101d(new oo000o(this, 0));
            oooOo = oo00o.OooOo.f33195OooO00o;
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            this.f10303k = Boolean.FALSE;
        }
    }

    /* renamed from: k */
    public final void m10861k() {
        oo00o.OooOo oooOo;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        if (this.f10302j != null) {
            this.f10297e.m13101d(new oo000o(this, 3));
            oooOo = oo00o.OooOo.f33195OooO00o;
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            this.f10303k = Boolean.TRUE;
        }
    }

    public /* synthetic */ C3423ml(UUID uuid, String str, C3792w6 c3792w6, LevelPlayBannerAdView.Config config, C3349m1 c3349m1, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? C3697tf.f12051a.m12424a() : uuid, str, c3792w6, config, (i & 16) != 0 ? new C3349m1(IronSource.AD_UNIT.BANNER, C2992c2.b.MEDIATION) : c3349m1);
    }

    /* renamed from: a */
    public static final void m10825a(C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        if (!this$0.f10305m) {
            IronLog.INTERNAL.warning(C3349m1.m9956a(this$0.f10297e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.f10302j == null) {
            IronLog.INTERNAL.warning(C3349m1.m9956a(this$0.f10297e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C3842xm.m13080a(this$0.f10297e, new oo000o(this$0, 4), 0L, 2, (Object) null);
        C3757v5 c3757v5 = this$0.f10302j;
        if (c3757v5 != null) {
            c3757v5.m12743g();
        }
        this$0.f10302j = null;
        this$0.f10303k = null;
        this$0.f10300h = null;
    }

    /* renamed from: b */
    public static final void m10833b(C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f10295c.removeAllViews();
        ViewParent parent = this$0.f10295c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.f10295c);
        }
    }

    /* renamed from: c */
    public static final void m10835c(C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        if (this$0.f10305m) {
            IronLog.INTERNAL.warning(C3349m1.m9956a(this$0.f10297e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.f10305m = true;
        if (this$0.m10841h()) {
            C3757v5 c3757v5M10824a = this$0.m10824a();
            Boolean bool = this$0.f10303k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    c3757v5M10824a.m12741e();
                } else {
                    c3757v5M10824a.m12740c();
                }
            }
            c3757v5M10824a.m12742f();
            this$0.f10302j = c3757v5M10824a;
        }
    }

    /* renamed from: d */
    public static final void m10837d(C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f10297e.m9970e().m7909f().m13109b();
        C3757v5 c3757v5 = this$0.f10302j;
        if (c3757v5 != null) {
            c3757v5.m12740c();
        }
    }

    /* renamed from: e */
    public static final void m10839e(C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f10297e.m9970e().m7909f().m13110c();
        C3757v5 c3757v5 = this$0.f10302j;
        if (c3757v5 != null) {
            c3757v5.m12741e();
        }
    }

    /* renamed from: a */
    public static final void m10826a(C3423ml this$0, LevelPlayAdSize adSize) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adSize, "$adSize");
        if (this$0.f10305m) {
            return;
        }
        this$0.f10299g = adSize;
    }

    @Override // com.ironsource.InterfaceC3791w5
    /* renamed from: b */
    public void mo10850b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10297e.m13102e(new o00oO0o(adInfo, this, 2));
    }

    @Override // com.ironsource.InterfaceC3791w5
    /* renamed from: c */
    public void mo10852c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10297e.m13102e(new o00oO0o(adInfo, this, 1));
    }

    @Override // com.ironsource.InterfaceC3791w5
    /* renamed from: d */
    public void mo10854d(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10297e.m13102e(new o00oO0o(adInfo, this, 4));
    }

    @Override // com.ironsource.InterfaceC3791w5
    /* renamed from: e */
    public void mo10856e(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10297e.m13102e(new o00oO0o(adInfo, this, 3));
    }

    /* renamed from: a */
    public static final void m10827a(C3423ml this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f10300h = levelPlayBannerAdViewListener;
    }

    /* renamed from: b */
    public static final void m10834b(LevelPlayAdInfo adInfo, C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f10300h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* renamed from: c */
    public static final void m10836c(LevelPlayAdInfo adInfo, C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f10300h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    /* renamed from: d */
    public static final void m10838d(LevelPlayAdInfo adInfo, C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f10300h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* renamed from: e */
    public static final void m10840e(LevelPlayAdInfo adInfo, C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f10300h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* renamed from: a */
    public static final void m10828a(C3423ml this$0, String placementName) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "$placementName");
        if (this$0.f10305m) {
            return;
        }
        this$0.f10301i = placementName;
    }

    @Override // com.ironsource.InterfaceC3791w5
    /* renamed from: a */
    public void mo10842a(LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.f10297e.m13102e(new o00000O0(16, levelPlayAdError, this));
        }
    }

    /* renamed from: a */
    public static final void m10829a(LevelPlayAdError it, C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(it, "$it");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f10300h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC3791w5
    /* renamed from: a */
    public void mo10843a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10297e.m13102e(new o00oO0o(adInfo, this, 0));
    }

    /* renamed from: a */
    public static final void m10830a(LevelPlayAdInfo adInfo, C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f10300h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3791w5
    /* renamed from: a */
    public void mo10844a(LevelPlayAdInfo adInfo, LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.f10297e.m13102e(new androidx.webkit.OooO00o(adInfo, levelPlayAdError, this, 26));
        }
    }

    /* renamed from: a */
    public static final void m10831a(LevelPlayAdInfo adInfo, LevelPlayAdError it, C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(it, "$it");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f10300h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    @Override // com.ironsource.InterfaceC3791w5
    /* renamed from: a */
    public void mo10845a(LevelPlayAdInfo adInfo, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f10297e.m13102e(new com.applovin.impl.o0OoOo0(z, adInfo, this, 3));
    }

    /* renamed from: a */
    public final void m10846a(LevelPlayAdSize adSize) {
        kotlin.jvm.internal.OooOo.OooO0o0(adSize, "adSize");
        IronLog.API.info("LevelPlayBannerAdView.setBannerAdSize() adSize: " + adSize);
        this.f10297e.m13101d(new o00000O0(19, this, adSize));
    }

    /* renamed from: a */
    public final void m10847a(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.f10297e.m13101d(new o00000O0(17, this, levelPlayBannerAdViewListener));
    }

    /* renamed from: a */
    public final void m10848a(String placementName) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        IronLog.API.info("LevelPlayBannerAdView.setPlacementName() placementName: ".concat(placementName));
        this.f10297e.m13101d(new o00000O0(18, this, placementName));
    }

    /* renamed from: a */
    public static final void m10832a(boolean z, LevelPlayAdInfo adInfo, C3423ml this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f10300h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }
}
