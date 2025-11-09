package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* renamed from: com.ironsource.yd */
/* loaded from: classes2.dex */
public final class C3867yd implements InterfaceC2969be {

    /* renamed from: a */
    private final C3799wd f12745a;

    /* renamed from: b */
    private final C3555qd f12746b;

    /* renamed from: c */
    private C3555qd f12747c;

    /* renamed from: d */
    private boolean f12748d;

    public C3867yd(C3799wd strategy, C3555qd currentAdUnit, C3555qd c3555qd, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
        kotlin.jvm.internal.OooOo.OooO0o0(currentAdUnit, "currentAdUnit");
        this.f12745a = strategy;
        this.f12746b = currentAdUnit;
        this.f12747c = c3555qd;
        this.f12748d = z;
    }

    /* renamed from: a */
    private final void m13197a() {
        InterfaceC2969be c3901zd;
        C3799wd c3799wd;
        C3555qd c3555qd = this.f12747c;
        if (c3555qd == null) {
            c3799wd = this.f12745a;
            c3901zd = new C3833xd(c3799wd);
        } else {
            if (c3555qd.m11546e() != null) {
                C3799wd c3799wd2 = this.f12745a;
                C3555qd c3555qd2 = this.f12747c;
                kotlin.jvm.internal.OooOo.OooO0O0(c3555qd2);
                c3901zd = new C3867yd(c3799wd2, c3555qd2, null, false, 8, null);
            } else {
                C3799wd c3799wd3 = this.f12745a;
                C3555qd c3555qd3 = this.f12747c;
                kotlin.jvm.internal.OooOo.OooO0O0(c3555qd3);
                c3901zd = new C3901zd(c3799wd3, c3555qd3, false);
            }
            c3799wd = this.f12745a;
        }
        c3799wd.m12890a(c3901zd);
        this.f12745a.m12894d().mo8468a();
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7753b(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        if (kotlin.jvm.internal.OooOo.OooO00o(this.f12746b, adUnit)) {
            this.f12745a.m12891a("load success after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC2969be
    public void loadAd() {
        oo00o.OooOo oooOo;
        if (this.f12748d) {
            this.f12745a.m12891a("load called while current ad is loaded");
            return;
        }
        this.f12748d = true;
        LevelPlayAdInfo levelPlayAdInfoM11546e = this.f12746b.m11546e();
        if (levelPlayAdInfoM11546e != null) {
            this.f12745a.m12894d().mo8471a(levelPlayAdInfoM11546e);
            oooOo = oo00o.OooOo.f33195OooO00o;
        } else {
            oooOo = null;
        }
        if (oooOo == null) {
            this.f12745a.m12891a("current ad is loaded without ad info");
        } else if (this.f12747c == null) {
            C3555qd c3555qdMo9215a = this.f12745a.m12892b().mo9215a(false, this.f12745a.m12893c());
            this.f12747c = c3555qdMo9215a;
            c3555qdMo9215a.m11543a(this.f12745a);
        }
    }

    public /* synthetic */ C3867yd(C3799wd c3799wd, C3555qd c3555qd, C3555qd c3555qd2, boolean z, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(c3799wd, c3555qd, c3555qd2, (i & 8) != 0 ? false : z);
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7746a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        this.f12745a.m12890a(new C2934ae(this.f12745a, this.f12746b, this.f12747c));
        this.f12746b.m11542a(activity, this.f12745a);
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7751b(C3555qd adUnit) {
        C3799wd c3799wd;
        String str;
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        if (adUnit.equals(this.f12746b)) {
            c3799wd = this.f12745a;
            str = "show success when loaded";
        } else {
            c3799wd = this.f12745a;
            str = "progressive show success while current ad is loaded";
        }
        c3799wd.m12891a(str);
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7747a(C3555qd adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        if (adUnit.equals(this.f12747c)) {
            this.f12747c = null;
        } else if (adUnit.equals(this.f12746b)) {
            m13197a();
        }
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: b */
    public void mo7752b(C3555qd adUnit, IronSourceError ironSourceError) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        if (adUnit.equals(this.f12747c)) {
            this.f12747c = null;
        } else {
            this.f12745a.m12891a("load failed after current ad is loaded");
        }
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7748a(C3555qd adUnit, IronSourceError ironSourceError) {
        C3799wd c3799wd;
        String str;
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        if (adUnit.equals(this.f12746b)) {
            c3799wd = this.f12745a;
            str = "show failed when loaded";
        } else {
            c3799wd = this.f12745a;
            str = "progressive show failed while current ad is loaded";
        }
        c3799wd.m12891a(str);
    }

    @Override // com.ironsource.InterfaceC2969be
    /* renamed from: a */
    public void mo7749a(C3555qd adUnit, LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(adInfo, "adInfo");
        if (adUnit.equals(this.f12746b)) {
            this.f12745a.m12894d().onAdInfoChanged(adInfo);
        }
    }
}
