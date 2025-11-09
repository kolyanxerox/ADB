package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.vn */
/* loaded from: classes2.dex */
public final class C3775vn extends AbstractC3347m implements InterfaceC3263jo, InterfaceC3276k2, InterfaceC3787w1 {

    /* renamed from: b */
    private final InterfaceC3877yn f12403b;

    /* renamed from: c */
    private final C3349m1 f12404c;

    /* renamed from: d */
    private final C3124fo f12405d;

    /* renamed from: e */
    private C3194ho f12406e;

    /* renamed from: f */
    private LevelPlayAdInfo f12407f;

    public C3775vn(InterfaceC3877yn listener, C3349m1 adTools, C3124fo nativeAdProperties) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAdProperties, "nativeAdProperties");
        this.f12403b = listener;
        this.f12404c = adTools;
        this.f12405d = nativeAdProperties;
        this.f12407f = m12792o();
    }

    /* renamed from: a */
    private final C3194ho m12791a(C3349m1 c3349m1, C3124fo c3124fo) {
        IronLog.INTERNAL.verbose();
        return new C3194ho(c3349m1, C3229io.f9038y.m9372a(c3124fo, m9935n().mo8493a()), this);
    }

    /* renamed from: o */
    private final LevelPlayAdInfo m12792o() {
        String string = this.f12405d.m8436b().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "nativeAdProperties.adId.toString()");
        String strM8437c = this.f12405d.m8437c();
        String string2 = this.f12405d.m8434a().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string2, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strM8437c, string2, null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC3787w1
    /* renamed from: b */
    public void mo8044b() {
        throw new oo00o.OooO("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: c */
    public void mo8047c(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoM11705c = adUnitCallback.m11705c();
        if (levelPlayAdInfoM11705c != null) {
            this.f12407f = levelPlayAdInfoM11705c;
            this.f12403b.mo11576a(levelPlayAdInfoM11705c);
        }
    }

    @Override // com.ironsource.InterfaceC3207i2
    /* renamed from: h */
    public void mo7754h() {
        this.f12403b.mo11577b(this.f12407f);
    }

    /* renamed from: p */
    public final void m12794p() {
        this.f12407f = m12792o();
        C3194ho c3194ho = this.f12406e;
        if (c3194ho != null) {
            c3194ho.m10925a(true);
        } else {
            kotlin.jvm.internal.OooOo.OooOO0o("nativeAdUnit");
            throw null;
        }
    }

    /* renamed from: q */
    public final void m12795q() {
        C3194ho c3194hoM12791a = m12791a(this.f12404c, this.f12405d);
        this.f12406e = c3194hoM12791a;
        if (c3194hoM12791a != null) {
            c3194hoM12791a.m10923a((InterfaceC3276k2) this);
        } else {
            kotlin.jvm.internal.OooOo.OooOO0o("nativeAdUnit");
            throw null;
        }
    }

    @Override // com.ironsource.InterfaceC3276k2
    /* renamed from: a */
    public void mo8043a(IronSourceError ironSourceError) {
        this.f12403b.onNativeAdLoadFailed(ironSourceError);
    }

    /* renamed from: a */
    public final void m12793a(C3670sn nativeAdBinder) {
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAdBinder, "nativeAdBinder");
        C3194ho c3194ho = this.f12406e;
        if (c3194ho != null) {
            c3194ho.m10922a(new C2944ao(nativeAdBinder), this);
        } else {
            kotlin.jvm.internal.OooOo.OooOO0o("nativeAdUnit");
            throw null;
        }
    }

    @Override // com.ironsource.InterfaceC3787w1
    /* renamed from: b */
    public void mo8045b(IronSourceError ironSourceError) {
        throw new oo00o.OooO("An operation is not implemented: Not yet implemented");
    }
}
