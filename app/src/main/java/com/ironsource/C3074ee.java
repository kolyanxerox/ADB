package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.ee */
/* loaded from: classes2.dex */
public final class C3074ee implements InterfaceC3219ie {

    /* renamed from: a */
    private final C3004ce f8406a;

    /* renamed from: b */
    private final C3555qd f8407b;

    /* renamed from: c */
    private final C3555qd f8408c;

    /* renamed from: d */
    private LevelPlayAdInfo f8409d;

    public C3074ee(C3004ce strategy, C3555qd currentAdUnit, C3555qd progressiveAdUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(progressiveAdUnit, "progressiveAdUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8406a = strategy;
        this.f8407b = currentAdUnit;
        this.f8408c = progressiveAdUnit;
        this.f8409d = adInfo;
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8296a() {
        C3004ce c3004ce = this.f8406a;
        c3004ce.m8114a(new C3039de(c3004ce, this.f8407b, true));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8300b() {
        this.f8406a.m8118a("show success on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.InterfaceC3219ie
    public void loadAd() {
        this.f8406a.m8124d().mo8471a(this.f8409d);
        C3004ce c3004ce = this.f8406a;
        c3004ce.m8114a(new C3149ge(c3004ce, this.f8408c));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8297a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f8406a.m8124d().mo8473b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8301b(IronSourceError ironSourceError) {
        this.f8406a.m8118a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8298a(IronSourceError ironSourceError) {
        this.f8406a.m8118a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8302b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8406a.m8118a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8299a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8409d = adInfo;
    }
}
