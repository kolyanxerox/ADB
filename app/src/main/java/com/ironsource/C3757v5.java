package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.v5 */
/* loaded from: classes2.dex */
public final class C3757v5 extends AbstractC3347m implements InterfaceC3478o6, InterfaceC3316l7 {

    /* renamed from: b */
    private final C3349m1 f12292b;

    /* renamed from: c */
    private final C3245j6 f12293c;

    /* renamed from: d */
    private final WeakReference<InterfaceC3791w5> f12294d;

    /* renamed from: e */
    private LevelPlayAdInfo f12295e;

    /* renamed from: f */
    private LevelPlayAdInfo f12296f;

    /* renamed from: g */
    private final AbstractC3212i7 f12297g;

    public C3757v5(InterfaceC3791w5 listener, C3349m1 adTools, C3245j6 bannerAdProperties, C3792w6 bannerViewContainer) {
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.OooOo.OooO0o0(bannerViewContainer, "bannerViewContainer");
        this.f12292b = adTools;
        this.f12293c = bannerAdProperties;
        this.f12294d = new WeakReference<>(listener);
        this.f12295e = m12739p();
        this.f12296f = m12739p();
        this.f12297g = AbstractC3212i7.f8990c.m9283a(adTools, bannerViewContainer, adTools.m9963b(bannerAdProperties.m8437c()), bannerAdProperties, this, m12738o());
    }

    /* renamed from: a */
    private final C3315l6 m12736a(C3349m1 c3349m1, C3245j6 c3245j6, boolean z) {
        IronLog.INTERNAL.verbose();
        return new C3315l6(c3349m1, C3354m6.f9491z.m10008a(c3245j6, m9935n().mo8493a(), z), this);
    }

    /* renamed from: o */
    private final InterfaceC3443n6 m12738o() {
        return new o000oOoO(this, 4);
    }

    /* renamed from: p */
    private final LevelPlayAdInfo m12739p() {
        String string = this.f12293c.m8436b().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "bannerAdProperties.adId.toString()");
        String strM8437c = this.f12293c.m8437c();
        String string2 = this.f12293c.m8434a().toString();
        kotlin.jvm.internal.OooOo.OooO0Oo(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strM8437c, string2, null, null, null, null, 120, null);
    }

    /* renamed from: c */
    public final void m12740c() {
        this.f12297g.mo8046c();
    }

    @Override // com.ironsource.InterfaceC3316l7
    /* renamed from: d */
    public void mo9749d(IronSourceError ironSourceError) {
        InterfaceC3791w5 interfaceC3791w5 = this.f12294d.get();
        if (interfaceC3791w5 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f12295e;
            String string = this.f12293c.m8436b().toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "bannerAdProperties.adId.toString()");
            interfaceC3791w5.mo10844a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.f12293c.m8437c()));
        }
    }

    /* renamed from: e */
    public final void m12741e() {
        this.f12297g.mo8048e();
    }

    /* renamed from: f */
    public final void m12742f() {
        this.f12297g.mo8049f();
    }

    /* renamed from: g */
    public final void m12743g() {
        this.f12297g.mo8050g();
    }

    @Override // com.ironsource.InterfaceC3207i2
    /* renamed from: h */
    public void mo7754h() {
        InterfaceC3791w5 interfaceC3791w5 = this.f12294d.get();
        if (interfaceC3791w5 != null) {
            interfaceC3791w5.mo10854d(this.f12295e);
        }
    }

    @Override // com.ironsource.InterfaceC3478o6
    /* renamed from: j */
    public /* bridge */ /* synthetic */ oo00o.OooOo mo11028j() {
        m12744q();
        return oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.ironsource.InterfaceC3478o6
    /* renamed from: k */
    public /* bridge */ /* synthetic */ oo00o.OooOo mo11029k() {
        m12746s();
        return oo00o.OooOo.f33195OooO00o;
    }

    @Override // com.ironsource.InterfaceC3316l7
    /* renamed from: l */
    public void mo9750l() {
        this.f12295e = this.f12296f;
        this.f12296f = m12739p();
        InterfaceC3791w5 interfaceC3791w5 = this.f12294d.get();
        if (interfaceC3791w5 != null) {
            interfaceC3791w5.mo10850b(this.f12295e);
        }
    }

    @Override // com.ironsource.InterfaceC3478o6
    /* renamed from: m */
    public /* bridge */ /* synthetic */ oo00o.OooOo mo11030m() {
        m12745r();
        return oo00o.OooOo.f33195OooO00o;
    }

    /* renamed from: q */
    public void m12744q() {
        InterfaceC3791w5 interfaceC3791w5 = this.f12294d.get();
        if (interfaceC3791w5 != null) {
            interfaceC3791w5.mo10856e(this.f12295e);
        }
    }

    /* renamed from: r */
    public void m12745r() {
        InterfaceC3791w5 interfaceC3791w5 = this.f12294d.get();
        if (interfaceC3791w5 != null) {
            interfaceC3791w5.mo10852c(this.f12295e);
        }
    }

    /* renamed from: s */
    public void m12746s() {
        InterfaceC3791w5 interfaceC3791w5 = this.f12294d.get();
        if (interfaceC3791w5 != null) {
            interfaceC3791w5.mo10843a(this.f12295e);
        }
    }

    /* renamed from: a */
    public static final C3315l6 m12737a(C3757v5 this$0, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        return this$0.m12736a(this$0.f12292b, this$0.f12293c, z);
    }

    @Override // com.ironsource.InterfaceC3316l7
    /* renamed from: c */
    public void mo9748c(IronSourceError ironSourceError) {
        InterfaceC3791w5 interfaceC3791w5 = this.f12294d.get();
        if (interfaceC3791w5 != null) {
            String string = this.f12293c.m8436b().toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "bannerAdProperties.adId.toString()");
            interfaceC3791w5.mo10842a(new LevelPlayAdError(ironSourceError, string, this.f12293c.m8437c()));
        }
    }

    @Override // com.ironsource.InterfaceC3316l7
    /* renamed from: a */
    public void mo9747a(C3578r1 adUnitCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoM11705c = adUnitCallback.m11705c();
        if (levelPlayAdInfoM11705c != null) {
            this.f12296f = levelPlayAdInfoM11705c;
            InterfaceC3791w5 interfaceC3791w5 = this.f12294d.get();
            if (interfaceC3791w5 != null) {
                interfaceC3791w5.mo10845a(levelPlayAdInfoM11705c, false);
            }
        }
    }
}
