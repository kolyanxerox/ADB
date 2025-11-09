package com.ironsource;

import android.app.Activity;
import com.ironsource.C3555qd;
import com.ironsource.InterfaceC3765vd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.je */
/* loaded from: classes2.dex */
public final class C3253je implements InterfaceC3765vd, C3555qd.b, C3555qd.a {

    /* renamed from: a */
    private final C3349m1 f9104a;

    /* renamed from: b */
    private final InterfaceC3765vd.a f9105b;

    /* renamed from: c */
    private final InterfaceC3590rd f9106c;

    /* renamed from: d */
    private final InterfaceC3695td f9107d;

    /* renamed from: e */
    private final InterfaceC3730ud f9108e;

    /* renamed from: f */
    private C3555qd f9109f;

    public C3253je(C3349m1 adTools, InterfaceC3765vd.a config, InterfaceC3590rd fullscreenAdUnitFactory, InterfaceC3695td fullscreenAdUnitListener, InterfaceC3730ud listener) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        kotlin.jvm.internal.OooOo.OooO0o0(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f9104a = adTools;
        this.f9105b = config;
        this.f9106c = fullscreenAdUnitFactory;
        this.f9107d = fullscreenAdUnitListener;
        this.f9108e = listener;
    }

    /* renamed from: a */
    public final C3349m1 m9479a() {
        return this.f9104a;
    }

    /* renamed from: b */
    public final InterfaceC3765vd.a m9480b() {
        return this.f9105b;
    }

    @Override // com.ironsource.InterfaceC3765vd
    public void loadAd() {
        C3555qd c3555qdMo9215a = this.f9106c.mo9215a(true, this.f9107d);
        c3555qdMo9215a.m11543a(this);
        this.f9109f = c3555qdMo9215a;
    }

    @Override // com.ironsource.InterfaceC3765vd
    /* renamed from: a */
    public void mo8113a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        C3555qd c3555qd = this.f9109f;
        if (c3555qd != null) {
            c3555qd.m11542a(activity, this);
        }
    }

    @Override // com.ironsource.C3555qd.a
    /* renamed from: b */
    public void mo8120b(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f9108e.mo8472b();
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: a */
    public void mo8115a(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f9109f = null;
        this.f9108e.mo8468a();
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: b */
    public void mo8121b(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f9108e.mo8470a(ironSourceError);
    }

    @Override // com.ironsource.C3555qd.a
    /* renamed from: a */
    public void mo8116a(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f9108e.mo8473b(ironSourceError);
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: b */
    public void mo8122b(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f9108e.mo8471a(adInfo);
    }

    @Override // com.ironsource.C3555qd.b
    /* renamed from: a */
    public void mo8117a(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f9108e.onAdInfoChanged(adInfo);
    }
}
