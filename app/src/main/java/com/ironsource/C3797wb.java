package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.wb */
/* loaded from: classes2.dex */
public final class C3797wb {

    /* renamed from: a */
    public static final C3797wb f12445a = new C3797wb();

    private C3797wb() {
    }

    /* renamed from: a */
    public final IronSourceError m12860a() {
        return m12854a(this, EnumC3836xg.ISErrorInitDecryptionFailure, null, 2, null);
    }

    /* renamed from: b */
    public final IronSourceError m12863b() {
        return m12854a(this, EnumC3836xg.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    /* renamed from: c */
    public final IronSourceError m12866c() {
        return m12854a(this, EnumC3836xg.ISErrorInitInvalidResponse, null, 2, null);
    }

    /* renamed from: d */
    public final IronSourceError m12869d() {
        return m12854a(this, EnumC3836xg.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    /* renamed from: e */
    public final IronSourceError m12871e() {
        return m12854a(this, EnumC3836xg.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    /* renamed from: f */
    public final IronSourceError m12872f() {
        return m12854a(this, EnumC3836xg.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    /* renamed from: g */
    public final IronSourceError m12873g() {
        return m12854a(this, EnumC3836xg.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    /* renamed from: h */
    public final IronSourceError m12874h() {
        return m12854a(this, EnumC3836xg.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    /* renamed from: i */
    public final IronSourceError m12875i() {
        return m12854a(this, EnumC3836xg.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    /* renamed from: j */
    public final IronSourceError m12876j() {
        return m12854a(this, EnumC3836xg.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    /* renamed from: k */
    public final IronSourceError m12877k() {
        return m12854a(this, EnumC3836xg.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    /* renamed from: l */
    public final IronSourceError m12878l() {
        return m12854a(this, EnumC3836xg.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    /* renamed from: m */
    public final IronSourceError m12879m() {
        return m12854a(this, EnumC3836xg.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    /* renamed from: n */
    public final IronSourceError m12880n() {
        return m12854a(this, EnumC3836xg.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    /* renamed from: o */
    public final IronSourceError m12881o() {
        return m12854a(this, EnumC3836xg.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    /* renamed from: p */
    public final IronSourceError m12882p() {
        return m12854a(this, EnumC3836xg.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    /* renamed from: q */
    public final IronSourceError m12883q() {
        return m12854a(this, EnumC3836xg.ISErrorLoadNullADM, null, 2, null);
    }

    /* renamed from: r */
    public final IronSourceError m12884r() {
        return m12854a(this, EnumC3836xg.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    /* renamed from: s */
    public final IronSourceError m12885s() {
        return m12854a(this, EnumC3836xg.ISErrorLoadTimedOut, null, 2, null);
    }

    /* renamed from: t */
    public final IronSourceError m12886t() {
        return m12854a(this, EnumC3836xg.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    /* renamed from: a */
    public final IronSourceError m12861a(IronSourceError networkError) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkError, "networkError");
        return m12856a(EnumC3836xg.ISErrorInitNetworkFailed, networkError);
    }

    /* renamed from: b */
    public final IronSourceError m12864b(IronSourceError error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        return m12856a(EnumC3836xg.ISErrorLoadNetworkFailed, error);
    }

    /* renamed from: c */
    public final IronSourceError m12867c(IronSourceError networkError) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkError, "networkError");
        return m12856a(EnumC3836xg.ISErrorShowNetworkFailed, networkError);
    }

    /* renamed from: d */
    public final IronSourceError m12870d(String str) {
        return m12857a(EnumC3836xg.ISErrorRewardedLoadNoConfig, str);
    }

    /* renamed from: a */
    public static /* synthetic */ IronSourceError m12854a(C3797wb c3797wb, EnumC3836xg enumC3836xg, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c3797wb.m12856a(enumC3836xg, ironSourceError);
    }

    /* renamed from: b */
    public static /* synthetic */ IronSourceError m12858b(C3797wb c3797wb, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c3797wb.m12865b(str);
    }

    /* renamed from: c */
    public static /* synthetic */ IronSourceError m12859c(C3797wb c3797wb, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c3797wb.m12870d(str);
    }

    /* renamed from: a */
    public static /* synthetic */ IronSourceError m12855a(C3797wb c3797wb, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c3797wb.m12862a(str);
    }

    /* renamed from: b */
    public final IronSourceError m12865b(String str) {
        return m12857a(EnumC3836xg.ISErrorInterstitialLoadNoConfig, str);
    }

    /* renamed from: c */
    public final IronSourceError m12868c(String description) {
        kotlin.jvm.internal.OooOo.OooO0o0(description, "description");
        return m12857a(EnumC3836xg.ISErrorLoadNetworkFailed, description);
    }

    /* renamed from: a */
    private final IronSourceError m12856a(EnumC3836xg enumC3836xg, IronSourceError ironSourceError) {
        String strM13051c;
        if (ironSourceError != null) {
            strM13051c = enumC3836xg.m13051c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ':' + ironSourceError.getErrorMessage() + '\'';
        } else {
            strM13051c = enumC3836xg.m13051c();
        }
        return new IronSourceError(enumC3836xg.m13050b(), strM13051c);
    }

    /* renamed from: a */
    private final IronSourceError m12857a(EnumC3836xg enumC3836xg, String str) {
        if (str == null || str.length() == 0) {
            str = enumC3836xg.m13051c();
        }
        return new IronSourceError(enumC3836xg.m13050b(), str);
    }

    /* renamed from: a */
    public final IronSourceError m12862a(String str) {
        return m12857a(EnumC3836xg.ISErrorBannerLoadNoConfig, str);
    }
}
