package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.xd */
/* loaded from: classes2.dex */
public final class C3833xd implements InterfaceC2969be {

    /* renamed from: a */
    private final C3799wd f12613a;

    public C3833xd(C3799wd strategy) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        this.f12613a = strategy;
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7746a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f12613a.m12891a("show called before load success");
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7751b(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12613a.m12891a("ad display success before load called");
    }

    @Override // com.ironsource.InterfaceC2969be
    public void loadAd() {
        C3555qd c3555qdMo9215a = this.f12613a.m12892b().mo9215a(true, this.f12613a.m12893c());
        this.f12613a.m12890a(new C3901zd(this.f12613a, c3555qdMo9215a, true));
        c3555qdMo9215a.m11543a(this.f12613a);
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7747a(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12613a.m12891a("ad expired before load called");
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7752b(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12613a.m12891a("load failed before load called");
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7748a(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f12613a.m12891a("ad display failed before load called");
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7753b(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f12613a.m12891a("load success before load called");
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7749a(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f12613a.m12891a("load success with better ad before load called");
    }
}
