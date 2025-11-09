package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.ge */
/* loaded from: classes2.dex */
public final class C3149ge implements InterfaceC3219ie {

    /* renamed from: a */
    private final C3004ce f8722a;

    /* renamed from: b */
    private final C3555qd f8723b;

    public C3149ge(C3004ce strategy, C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        this.f8722a = strategy;
        this.f8723b = adUnit;
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8296a() {
        C3004ce c3004ce = this.f8722a;
        c3004ce.m8114a(new C3039de(c3004ce, null, true));
        this.f8722a.m8124d().mo8468a();
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8300b() {
        this.f8722a.m8124d().mo8472b();
        C3555qd c3555qdMo9215a = this.f8722a.m8119b().mo9215a(false, this.f8722a.m8123c());
        C3004ce c3004ce = this.f8722a;
        c3004ce.m8114a(new C3114fe(c3004ce, this.f8723b, c3555qdMo9215a));
        c3555qdMo9215a.m11543a(this.f8722a);
    }

    @Override // com.ironsource.InterfaceC3219ie
    public void loadAd() {
        C3004ce c3004ce = this.f8722a;
        c3004ce.m8114a(new C3039de(c3004ce, null, false, 4, null));
        this.f8722a.loadAd();
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8297a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f8723b.m11542a(activity, this.f8722a);
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8301b(IronSourceError ironSourceError) {
        if (!C3001cb.f7731a.m8107a(ironSourceError)) {
            C3004ce c3004ce = this.f8722a;
            c3004ce.m8114a(new C3039de(c3004ce, null, false, 4, null));
        }
        this.f8722a.m8124d().mo8473b(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8298a(IronSourceError ironSourceError) {
        this.f8722a.m8118a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: b */
    public void mo8302b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8722a.m8118a("Ad unit is already loaded");
    }

    @Override // com.ironsource.InterfaceC3219ie
    /* renamed from: a */
    public void mo8299a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        this.f8722a.m8124d().onAdInfoChanged(adInfo);
    }
}
