package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.fe */
/* loaded from: classes2.dex */
public final class C3114fe implements InterfaceC3219ie {

    /* renamed from: a */
    private final C3004ce f8577a;

    /* renamed from: b */
    private final C3555qd f8578b;

    /* renamed from: c */
    private final C3555qd f8579c;

    public C3114fe(C3004ce strategy, C3555qd currentAdUnit, C3555qd progressiveAdUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(progressiveAdUnit, "progressiveAdUnit");
        this.f8577a = strategy;
        this.f8578b = currentAdUnit;
        this.f8579c = progressiveAdUnit;
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8296a() {
        this.f8577a.m8118a("ad expired before progressive load success");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8300b() {
        this.f8577a.m8118a("show success before progressive load success");
    }

    @Override // com.ironsource.InterfaceC3219ie
    public void loadAd() {
        C3004ce c3004ce = this.f8577a;
        c3004ce.m8114a(new C3184he(c3004ce, this.f8579c));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8297a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f8577a.m8124d().mo8473b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8301b(IronSourceError ironSourceError) {
        this.f8577a.m8118a("show failed before progressive load success");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8298a(IronSourceError ironSourceError) {
        C3004ce c3004ce = this.f8577a;
        c3004ce.m8114a(new C3039de(c3004ce, this.f8578b, false, 4, null));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8302b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        C3004ce c3004ce = this.f8577a;
        c3004ce.m8114a(new C3074ee(c3004ce, this.f8578b, this.f8579c, adInfo));
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8299a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8577a.m8118a("load success with better ad before progressive load success");
    }
}
