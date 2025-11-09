package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.ironsource.C3056dv;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.tv */
/* loaded from: classes2.dex */
public final class C3713tv implements C3056dv.c, C3056dv.d, C3056dv.b {

    /* renamed from: a */
    private final WeakReference<TestSuiteActivity> f12106a;

    /* renamed from: b */
    private final Handler f12107b;

    /* renamed from: c */
    private RelativeLayout f12108c;

    /* renamed from: d */
    private IronSourceBannerLayout f12109d;

    public C3713tv(TestSuiteActivity activity, Handler handler) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(handler, "handler");
        this.f12106a = new WeakReference<>(activity);
        this.f12107b = handler;
    }

    /* renamed from: a */
    private final RelativeLayout m12489a(TestSuiteActivity testSuiteActivity) {
        RelativeLayout relativeLayout = new RelativeLayout(testSuiteActivity);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return relativeLayout;
    }

    /* renamed from: f */
    private final TestSuiteActivity m12492f() {
        return this.f12106a.get();
    }

    @Override // com.ironsource.C3056dv.b
    /* renamed from: b */
    public void mo8409b() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f12109d;
        if (ironSourceBannerLayout != null) {
            C3573qv.f11160a.m11672a(ironSourceBannerLayout);
        }
        this.f12107b.post(new OooO0o(this, 10));
        this.f12109d = null;
    }

    @Override // com.ironsource.C3056dv.c
    /* renamed from: c */
    public void mo8411c() {
        C3573qv.f11160a.m11669a((Activity) this.f12106a.get());
    }

    @Override // com.ironsource.C3056dv.d
    /* renamed from: d */
    public void mo8415d() {
        C3573qv.f11160a.m11680b((Activity) this.f12106a.get());
    }

    @Override // com.ironsource.C3056dv.c
    /* renamed from: e */
    public boolean mo8412e() {
        return C3573qv.f11160a.m11686e();
    }

    @Override // com.ironsource.C3056dv.b
    /* renamed from: a */
    public void mo8407a(double d) {
        TestSuiteActivity testSuiteActivityM12492f;
        if (this.f12108c != null || (testSuiteActivityM12492f = m12492f()) == null) {
            return;
        }
        IronSourceBannerLayout ironSourceBannerLayout = this.f12109d;
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.setLayoutParams(C3783vv.f12423a.m12828a((Context) testSuiteActivityM12492f));
        }
        this.f12108c = m12489a(testSuiteActivityM12492f);
        this.f12107b.post(new o00000O(0, this, testSuiteActivityM12492f));
    }

    @Override // com.ironsource.C3056dv.d
    /* renamed from: b */
    public void mo8414b(C3270jv loadAdConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadAdConfig, "loadAdConfig");
        C3573qv c3573qv = C3573qv.f11160a;
        c3573qv.m11671a(IronSource.AD_UNIT.REWARDED_VIDEO, loadAdConfig);
        c3573qv.m11689h();
    }

    @Override // com.ironsource.C3056dv.c
    /* renamed from: a */
    public void mo8410a(C3270jv loadAdConfig) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadAdConfig, "loadAdConfig");
        C3573qv c3573qv = C3573qv.f11160a;
        c3573qv.m11671a(IronSource.AD_UNIT.INTERSTITIAL, loadAdConfig);
        c3573qv.m11688g();
    }

    @Override // com.ironsource.C3056dv.b
    /* renamed from: a */
    public void mo8408a(C3270jv loadAdConfig, String description, int i, int i2) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadAdConfig, "loadAdConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(description, "description");
        mo8409b();
        C3573qv c3573qv = C3573qv.f11160a;
        c3573qv.m11671a(IronSource.AD_UNIT.BANNER, loadAdConfig);
        TestSuiteActivity testSuiteActivityM12492f = m12492f();
        if (testSuiteActivityM12492f != null) {
            IronSourceBannerLayout ironSourceBannerLayoutM11663a = c3573qv.m11663a(testSuiteActivityM12492f, c3573qv.m11662a(description, i, i2));
            this.f12109d = ironSourceBannerLayoutM11663a;
            c3573qv.m11681b(ironSourceBannerLayoutM11663a);
        }
    }

    /* renamed from: a */
    public static final void m12490a(C3713tv this$0) {
        RelativeLayout container;
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.f12108c;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        TestSuiteActivity testSuiteActivityM12492f = this$0.m12492f();
        if (testSuiteActivityM12492f != null && (container = testSuiteActivityM12492f.getContainer()) != null) {
            container.removeView(this$0.f12108c);
        }
        this$0.f12108c = null;
    }

    /* renamed from: a */
    public static final void m12491a(C3713tv this$0, TestSuiteActivity testSuiteActivity) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.f12108c;
        if (relativeLayout != null) {
            relativeLayout.addView(this$0.f12109d);
        }
        testSuiteActivity.getContainer().addView(this$0.f12108c);
    }

    @Override // com.ironsource.C3056dv.d
    /* renamed from: a */
    public boolean mo8413a() {
        return C3573qv.f11160a.m11687f();
    }
}
