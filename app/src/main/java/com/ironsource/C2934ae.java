package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* renamed from: com.ironsource.ae */
/* loaded from: classes2.dex */
public final class C2934ae implements InterfaceC2969be, InterfaceC3695td {

    /* renamed from: a */
    private final C3799wd f7491a;

    /* renamed from: b */
    private final C3555qd f7492b;

    /* renamed from: c */
    private C3555qd f7493c;

    public C2934ae(C3799wd strategy, C3555qd currentAdUnit, C3555qd c3555qd) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        this.f7491a = strategy;
        this.f7492b = currentAdUnit;
        this.f7493c = c3555qd;
        currentAdUnit.m11544a(this);
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC2969be m7744a(C2934ae c2934ae, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 1) != 0) {
            ironSourceError = null;
        }
        return c2934ae.m7745a(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7752b(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        if (adUnit == this.f7493c) {
            this.f7493c = null;
        } else {
            this.f7491a.m12891a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC3207i2
    /* renamed from: h */
    public void mo7754h() {
        this.f7491a.m12893c().mo7754h();
    }

    @Override // com.ironsource.InterfaceC2969be
    public void loadAd() {
        this.f7491a.m12891a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC3695td
    public void onClosed() {
        this.f7491a.m12890a(m7744a(this, null, 1, null));
        this.f7491a.m12893c().onClosed();
    }

    /* renamed from: a */
    private final InterfaceC2969be m7745a(IronSourceError ironSourceError) {
        if (C3001cb.f7731a.m8107a(ironSourceError)) {
            return new C3867yd(this.f7491a, this.f7492b, this.f7493c, true);
        }
        C3555qd c3555qd = this.f7493c;
        if (c3555qd == null) {
            return new C3833xd(this.f7491a);
        }
        if (c3555qd.m11546e() == null) {
            return new C3901zd(this.f7491a, c3555qd, false);
        }
        return new C3867yd(this.f7491a, c3555qd, null, false, 8, null);
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7753b(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        if (adUnit == this.f7492b) {
            this.f7491a.m12891a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7746a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f7491a.m12891a("show called while showing");
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7751b(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        if (adUnit.equals(this.f7492b)) {
            this.f7491a.m12894d().mo8472b();
        } else {
            this.f7491a.m12891a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7747a(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        if (adUnit == this.f7493c) {
            this.f7493c = null;
        } else {
            this.f7491a.m12891a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7749a(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        if (adUnit == this.f7492b) {
            this.f7491a.m12891a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC3695td
    /* renamed from: a */
    public void mo7750a(LevelPlayReward reward) {
        kotlin.jvm.internal.OooOo.OooO0o0(reward, "reward");
        this.f7491a.m12893c().mo7750a(reward);
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7748a(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        if (!adUnit.equals(this.f7492b)) {
            this.f7491a.m12891a("progressive show failed while showing current ad");
            return;
        }
        this.f7491a.m12890a(m7745a(ironSourceError));
        this.f7491a.m12894d().mo8473b(ironSourceError);
    }
}
