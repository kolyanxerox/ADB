package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.he */
/* loaded from: classes2.dex */
public final class C3184he implements InterfaceC3219ie {

    /* renamed from: a */
    private final C3004ce f8866a;

    /* renamed from: b */
    private final C3555qd f8867b;

    public C3184he(C3004ce strategy, C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f8866a = strategy;
        this.f8867b = adUnit;
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8296a() {
        this.f8866a.m8118a("ad expired while loading");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8300b() {
        this.f8866a.m8118a("show success while loading");
    }

    @Override // com.ironsource.InterfaceC3219ie
    public void loadAd() {
        this.f8866a.m8124d().mo8470a(new IronSourceError(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8297a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f8866a.m8124d().mo8473b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8301b(IronSourceError ironSourceError) {
        this.f8866a.m8118a("show failed while loading");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8298a(IronSourceError ironSourceError) {
        C3004ce c3004ce = this.f8866a;
        c3004ce.m8114a(new C3039de(c3004ce, this.f8867b, false, 4, null));
        this.f8866a.m8124d().mo8470a(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8302b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3004ce c3004ce = this.f8866a;
        c3004ce.m8114a(new C3149ge(c3004ce, this.f8867b));
        this.f8866a.m8124d().mo8471a(adInfo);
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8299a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8866a.m8118a("load success with better ad while loading");
    }
}
