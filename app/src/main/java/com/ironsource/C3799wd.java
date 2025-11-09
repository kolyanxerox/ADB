package com.ironsource;

import android.app.Activity;
import com.ironsource.C3555qd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.wd */
/* loaded from: classes2.dex */
public final class C3799wd implements InterfaceC3765vd, C3555qd.b, C3555qd.a {

    /* renamed from: f */
    public static final a f12447f = new a(null);

    /* renamed from: g */
    public static final String f12448g = "Fullscreen ProgressiveOnLoaded Strategy";

    /* renamed from: a */
    private final C3349m1 f12449a;

    /* renamed from: b */
    private final InterfaceC3590rd f12450b;

    /* renamed from: c */
    private final InterfaceC3695td f12451c;

    /* renamed from: d */
    private final InterfaceC3730ud f12452d;

    /* renamed from: e */
    private InterfaceC2969be f12453e;

    /* renamed from: com.ironsource.wd$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3799wd(C3349m1 adTools, InterfaceC3590rd factory, InterfaceC3695td fullscreenAdUnitListener, InterfaceC3730ud listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(factory, "factory");
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f12449a = adTools;
        this.f12450b = factory;
        this.f12451c = fullscreenAdUnitListener;
        this.f12452d = listener;
        this.f12453e = new C3833xd(this);
    }

    /* renamed from: a */
    public final C3349m1 m12889a() {
        return this.f12449a;
    }

    /* renamed from: b */
    public final InterfaceC3590rd m12892b() {
        return this.f12450b;
    }

    /* renamed from: c */
    public final InterfaceC3695td m12893c() {
        return this.f12451c;
    }

    /* renamed from: d */
    public final InterfaceC3730ud m12894d() {
        return this.f12452d;
    }

    @Override // com.ironsource.InterfaceC3765vd
    public void loadAd() {
        this.f12453e.loadAd();
    }

    @Override // com.ironsource.InterfaceC3765vd
    /* renamed from: a */
    public void mo8113a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f12453e.mo7746a(activity);
    }

    @Override // com.ironsource.C3555qd.a
    /* renamed from: b */
    public void mo8120b(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12453e.mo7751b(adUnit);
    }

    /* renamed from: a */
    public final void m12890a(InterfaceC2969be state) {
        kotlin.jvm.internal.OooOo.OooO0o0(state, "state");
        this.f12453e = state;
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: b */
    public void mo8121b(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12453e.mo7752b(adUnit, ironSourceError);
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: a */
    public void mo8115a(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12453e.mo7747a(adUnit);
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: b */
    public void mo8122b(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f12453e.mo7753b(adUnit, adInfo);
    }

    @Override // com.ironsource.C3555qd.a
    /* renamed from: a */
    public void mo8116a(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12453e.mo7748a(adUnit, ironSourceError);
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: a */
    public void mo8117a(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f12453e.mo7749a(adUnit, adInfo);
    }

    /* renamed from: a */
    public final void m12891a(String message) {
        kotlin.jvm.internal.OooOo.OooO0o0(message, "message");
        this.f12449a.m9970e().m7911h().m9917f("Fullscreen ProgressiveOnLoaded Strategy - ".concat(message));
    }
}
