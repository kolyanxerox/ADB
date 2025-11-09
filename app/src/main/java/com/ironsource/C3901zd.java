package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.zd */
/* loaded from: classes2.dex */
public final class C3901zd implements InterfaceC2969be {

    /* renamed from: a */
    private final C3799wd f12961a;

    /* renamed from: b */
    private final C3555qd f12962b;

    /* renamed from: c */
    private boolean f12963c;

    public C3901zd(C3799wd strategy, C3555qd currentAdUnit, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        this.f12961a = strategy;
        this.f12962b = currentAdUnit;
        this.f12963c = z;
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7746a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f12961a.m12891a("show called while loading");
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7751b(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12961a.m12891a("show success while loading");
    }

    @Override // com.ironsource.InterfaceC2969be
    public void loadAd() {
        if (this.f12963c) {
            this.f12961a.m12891a("load called while loading");
        }
        this.f12963c = true;
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7747a(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12961a.m12891a("ad expired while loading");
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7752b(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12961a.m12890a(new C3833xd(this.f12961a));
        if (this.f12963c) {
            this.f12961a.m12894d().mo8470a(ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7748a(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12961a.m12891a("show failed while loading");
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7753b(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        if (!this.f12963c) {
            this.f12961a.m12890a(new C3867yd(this.f12961a, this.f12962b, null, false));
            return;
        }
        C3555qd c3555qdMo9215a = this.f12961a.m12892b().mo9215a(false, this.f12961a.m12893c());
        this.f12961a.m12890a(new C3867yd(this.f12961a, this.f12962b, c3555qdMo9215a, true));
        this.f12961a.m12894d().mo8471a(adInfo);
        c3555qdMo9215a.m11543a(this.f12961a);
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7749a(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f12961a.m12891a("ad info changed while loading");
    }
}
