package com.ironsource;

import com.ironsource.C2992c2;
import com.ironsource.InterfaceC3529pm;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;

/* renamed from: com.ironsource.qm */
/* loaded from: classes2.dex */
public final class C3564qm extends AbstractC3226il implements InterfaceC3877yn {

    /* renamed from: d */
    private final UUID f10950d;

    /* renamed from: e */
    private final C3494om f10951e;

    /* renamed from: f */
    private C3775vn f10952f;

    /* renamed from: g */
    private String f10953g;

    /* renamed from: h */
    private Placement f10954h;

    /* renamed from: i */
    private InterfaceC3669sm f10955i;

    /* renamed from: j */
    private AdapterNativeAdData f10956j;

    /* renamed from: k */
    private AdapterNativeAdViewBinder f10957k;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3564qm(UUID adId, C3494om nativeAd) {
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        kotlin.jvm.internal.OooOo.OooO0o0(nativeAd, "nativeAd");
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.NATIVE_AD;
        super(new C3349m1(ad_unit, C2992c2.b.MEDIATION));
        this.f10950d = adId;
        this.f10951e = nativeAd;
        this.f10953g = "";
        m9348a().m9970e().m7903a(new C3436n(ad_unit, adId, m9353b()));
    }

    /* renamed from: a */
    public static final void m11567a(C3564qm this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            C3775vn c3775vn = this$0.f10952f;
            if (c3775vn == null) {
                kotlin.jvm.internal.OooOo.OooOO0o("nativeAdController");
                throw null;
            }
            c3775vn.m12794p();
            this$0.f10955i = null;
        } catch (Throwable th) {
            C3551q9.m11517d().m11519a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* renamed from: b */
    public static final void m11572b(C3564qm this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        if (this$0.m9355c()) {
            IronLog.INTERNAL.warning(C3349m1.m9956a(this$0.m9348a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.m9352a(true);
        if (this$0.mo9356d()) {
            C3775vn c3775vn = this$0.f10952f;
            if (c3775vn != null) {
                c3775vn.m12795q();
            } else {
                kotlin.jvm.internal.OooOo.OooOO0o("nativeAdController");
                throw null;
            }
        }
    }

    /* renamed from: e */
    private final C3775vn m11574e() {
        this.f10954h = m9348a().m9969d(this.f10953g);
        UUID uuid = this.f10950d;
        String strM9353b = m9353b();
        Placement placement = this.f10954h;
        if (placement == null) {
            kotlin.jvm.internal.OooOo.OooOO0o("placement");
            throw null;
        }
        C3124fo c3124fo = new C3124fo(uuid, strM9353b, placement);
        m9349a(c3124fo);
        return new C3775vn(this, m9348a(), c3124fo);
    }

    @Override // com.ironsource.AbstractC3226il
    /* renamed from: d */
    public boolean mo9356d() {
        this.f10952f = m11574e();
        return true;
    }

    /* renamed from: f */
    public final void m11579f() {
        m9350a(new o000000O(this, 0));
    }

    /* renamed from: g */
    public final UUID m11580g() {
        return this.f10950d;
    }

    /* renamed from: h */
    public final String m11581h() {
        AdapterNativeAdData adapterNativeAdData = this.f10956j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    /* renamed from: i */
    public final String m11582i() {
        AdapterNativeAdData adapterNativeAdData = this.f10956j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    /* renamed from: j */
    public final String m11583j() {
        AdapterNativeAdData adapterNativeAdData = this.f10956j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    /* renamed from: k */
    public final InterfaceC3529pm.a m11584k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.f10956j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC3529pm.a(icon.getDrawable(), icon.getUri());
    }

    /* renamed from: l */
    public final AdapterNativeAdViewBinder m11585l() {
        return this.f10957k;
    }

    /* renamed from: m */
    public final String m11586m() {
        AdapterNativeAdData adapterNativeAdData = this.f10956j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    /* renamed from: n */
    public final void m11587n() {
        m9350a(new o000000O(this, 1));
    }

    @Override // com.ironsource.InterfaceC3877yn
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String string = this.f10950d.toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "adId.toString()");
        m9354b(new o00000O0(24, this, new LevelPlayAdError(ironSourceError, string, m9353b())));
    }

    public /* synthetic */ C3564qm(UUID uuid, C3494om c3494om, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? C3697tf.f12051a.m12424a() : uuid, c3494om);
    }

    /* renamed from: a */
    public static final void m11568a(C3564qm this$0, InterfaceC3669sm interfaceC3669sm) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.f10955i = interfaceC3669sm;
    }

    /* renamed from: b */
    public static final void m11573b(C3564qm this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        InterfaceC3669sm interfaceC3669sm = this$0.f10955i;
        if (interfaceC3669sm != null) {
            interfaceC3669sm.m12290c(this$0.f10951e, adInfo);
        }
    }

    /* renamed from: a */
    public static final void m11569a(C3564qm this$0, LevelPlayAdError levelPlayError) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(levelPlayError, "$levelPlayError");
        InterfaceC3669sm interfaceC3669sm = this$0.f10955i;
        if (interfaceC3669sm != null) {
            interfaceC3669sm.m12287a(this$0.f10951e, levelPlayError);
        }
    }

    @Override // com.ironsource.InterfaceC3877yn
    /* renamed from: b */
    public void mo11577b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        m9354b(new o000000(this, adInfo, 1));
    }

    /* renamed from: a */
    public static final void m11570a(C3564qm this$0, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "$adInfo");
        InterfaceC3669sm interfaceC3669sm = this$0.f10955i;
        if (interfaceC3669sm != null) {
            interfaceC3669sm.m12289b(this$0.f10951e, adInfo);
        }
    }

    /* renamed from: b */
    public final void m11578b(String placementName) {
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "placementName");
        m9350a(new o00000O0(23, this, placementName));
    }

    /* renamed from: a */
    public static final void m11571a(C3564qm this$0, String placementName) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(placementName, "$placementName");
        this$0.f10953g = placementName;
    }

    /* renamed from: a */
    public final void m11575a(InterfaceC3669sm interfaceC3669sm) {
        m9350a(new o00000O0(25, this, interfaceC3669sm));
    }

    @Override // com.ironsource.InterfaceC3877yn
    /* renamed from: a */
    public void mo11576a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        C3670sn c3670sn = new C3670sn();
        C3775vn c3775vn = this.f10952f;
        if (c3775vn == null) {
            kotlin.jvm.internal.OooOo.OooOO0o("nativeAdController");
            throw null;
        }
        c3775vn.m12793a(c3670sn);
        this.f10956j = c3670sn.m12291a();
        this.f10957k = c3670sn.m12294b();
        m9354b(new o000000(this, adInfo, 0));
    }
}
