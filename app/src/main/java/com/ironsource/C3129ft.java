package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3571qt;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* renamed from: com.ironsource.ft */
/* loaded from: classes2.dex */
public final class C3129ft {

    /* renamed from: a */
    private final C3190hk f8657a = new C3190hk();

    /* renamed from: b */
    private final C3119fj f8658b = new C3119fj(IronSourceThreadManager.INSTANCE.getInitHandler());

    /* renamed from: c */
    private final InterfaceC3767vf f8659c = C3495on.f10667s.m11213d().mo8686f();

    /* renamed from: com.ironsource.ft$a */
    public static final class a extends AbstractRunnableC3302ks {

        /* renamed from: a */
        final /* synthetic */ Runnable f8660a;

        public a(Runnable runnable) {
            this.f8660a = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3302ks
        /* renamed from: a */
        public void mo8710a() {
            this.f8660a.run();
        }
    }

    /* renamed from: a */
    public final C3571qt m8797a(Context context, String appKey) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(appKey, "appKey");
        return C3404p.m10470j().m10495a(context, appKey);
    }

    /* renamed from: b */
    public final InterfaceC3767vf m8808b() {
        return this.f8659c;
    }

    /* renamed from: c */
    public final C3190hk m8812c() {
        return this.f8657a;
    }

    /* renamed from: d */
    public final IronSourceSegment m8815d() {
        return C3404p.m10470j().m10563q();
    }

    /* renamed from: e */
    public final void m8817e(Runnable callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(callback), 0L, 2, null);
    }

    /* renamed from: f */
    public final void m8819f() {
        C3404p.m10470j().m10490S();
    }

    /* renamed from: g */
    public final void m8820g() {
        C3495on.f10667s.m11213d().mo8698z().mo12605a(new C3899zb(EnumC2638ac.USING_CACHE_FOR_INIT_EVENT, IronSourceUtils.getMediationAdditionalData(false)));
    }

    /* renamed from: a */
    public final String m8798a(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        String advertiserId = C3404p.m10470j().getAdvertiserId(context);
        kotlin.jvm.internal.OooOo.OooO0Oo(advertiserId, "getInstance().getAdvertiserId(context)");
        return advertiserId;
    }

    /* renamed from: b */
    public final String m8809b(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        String strMo4832M = this.f8659c.mo4832M(context);
        kotlin.jvm.internal.OooOo.OooO0Oo(strMo4832M, "deviceInfoService.getOrG…UniqueIdentifier(context)");
        return strMo4832M;
    }

    /* renamed from: c */
    public final void m8813c(Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        this.f8658b.m8709b(runnable);
    }

    /* renamed from: d */
    public final void m8816d(Runnable callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, callback, 0L, 2, null);
    }

    /* renamed from: e */
    public final boolean m8818e() {
        return IronSourceUtils.isEncryptedResponse();
    }

    /* renamed from: a */
    public final void m8799a() {
        C3092er.m8541c().m8543a();
    }

    /* renamed from: b */
    public final void m8810b(AbstractRunnableC3302ks safeRunnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(safeRunnable, "safeRunnable");
        this.f8658b.m8706a(safeRunnable);
    }

    /* renamed from: c */
    public final boolean m8814c(Context context) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        return IronSourceUtils.isNetworkConnected(context);
    }

    /* renamed from: a */
    public final void m8800a(long j, C3571qt.a responseOrigin) {
        kotlin.jvm.internal.OooOo.OooO0o0(responseOrigin, "responseOrigin");
        C3404p.m10470j().m10501a(j, responseOrigin);
    }

    /* renamed from: b */
    public final void m8811b(Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    /* renamed from: a */
    public final void m8801a(C2994c4 reporterSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(reporterSettings, "reporterSettings");
        C3551q9.m11517d().m11520a(reporterSettings.m8084b(), reporterSettings.m8086d(), reporterSettings.m8085c(), reporterSettings.m8087e(), IronSourceUtils.getSessionId(), reporterSettings.m8083a(), reporterSettings.m8089g());
    }

    /* renamed from: a */
    public final void m8802a(EnumC3054dt initStatus) {
        kotlin.jvm.internal.OooOo.OooO0o0(initStatus, "initStatus");
        C3094et.f8460a.m8557a(initStatus);
    }

    /* renamed from: a */
    public static /* synthetic */ void m8795a(C3129ft c3129ft, AbstractRunnableC3302ks abstractRunnableC3302ks, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3129ft.m8804a(abstractRunnableC3302ks, j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m8796a(C3129ft c3129ft, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c3129ft.m8806a(runnable, j);
    }

    /* renamed from: a */
    public final void m8803a(AbstractRunnableC3302ks safeRunnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(safeRunnable, "safeRunnable");
        m8795a(this, safeRunnable, 0L, 2, (Object) null);
    }

    /* renamed from: a */
    public final void m8804a(AbstractRunnableC3302ks safeRunnable, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(safeRunnable, "safeRunnable");
        this.f8658b.m8707a(safeRunnable, j);
    }

    /* renamed from: a */
    public final void m8805a(Runnable callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        this.f8658b.m8708a(callback);
    }

    /* renamed from: a */
    public final void m8806a(Runnable runnable, long j) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnable, j);
    }

    /* renamed from: a */
    public final void m8807a(String key, String value) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        C3288ke.m9661a().m9663a(key, value);
    }
}
