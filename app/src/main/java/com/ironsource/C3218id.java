package com.ironsource;

import android.app.Activity;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.C3473o1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.id */
/* loaded from: classes2.dex */
public final class C3218id extends AbstractC3887z implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {

    /* renamed from: w */
    private WeakReference<InterfaceC3252jd> f9008w;

    /* renamed from: x */
    private C3216ib f9009x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3218id(C3719u2 adTools, C2626a0 instanceData, C3135g0 adInstancePayload, InterfaceC3252jd listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        kotlin.jvm.internal.OooOo.OooO0o0(instanceData, "instanceData");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.OooOo.OooO0o0(listener, "listener");
        this.f9008w = new WeakReference<>(listener);
    }

    /* renamed from: H */
    private final void m9306H() {
        this.f9009x = new C3216ib();
        IronLog.INTERNAL.verbose(AbstractC3887z.m13248a(this, (String) null, 1, (Object) null));
        m13268f().m9970e().m7902a().m9940a(m13273k(), "");
        InterfaceC3252jd interfaceC3252jd = this.f9008w.get();
        if (interfaceC3252jd != null) {
            interfaceC3252jd.mo9478b(this);
        }
        mo9322c();
    }

    /* renamed from: I */
    private final void m9307I() {
        IronLog.INTERNAL.verbose(AbstractC3887z.m13248a(this, (String) null, 1, (Object) null));
        m13268f().m9970e().m7902a().m9947d(m13273k());
    }

    /* renamed from: J */
    private final void m9308J() {
        HashMap map = new HashMap();
        Map<String, String> mapM12536k = m13268f().m12536k();
        if (mapM12536k != null) {
            for (String str : mapM12536k.keySet()) {
                map.put(OooO0oO.OooOo.OooOO0("custom_", str), mapM12536k.get(str));
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM12529a = m13268f().m12529a(jCurrentTimeMillis, m13276o());
        long jM9304a = C3216ib.m9304a(this.f9009x);
        LevelPlayReward levelPlayRewardMo9699a = C3495on.f10667s.m11213d().mo8692p().mo9699a(m13273k(), m13275m().m4748i().mo9364b().m8437c());
        if (levelPlayRewardMo9699a == null) {
            levelPlayRewardMo9699a = C3319la.f9312a.m9753a();
        }
        LevelPlayReward levelPlayReward = levelPlayRewardMo9699a;
        m13268f().m9970e().m7902a().m9941a(m13273k(), levelPlayReward.getName(), levelPlayReward.getAmount(), jCurrentTimeMillis, strM12529a, jM9304a, map, m13268f().m12535j());
        InterfaceC3252jd interfaceC3252jd = this.f9008w.get();
        if (interfaceC3252jd != null) {
            interfaceC3252jd.mo9477a(this, levelPlayReward);
        }
    }

    /* renamed from: K */
    private final void m9309K() {
        IronLog.INTERNAL.verbose(AbstractC3887z.m13248a(this, (String) null, 1, (Object) null));
        m13268f().m9970e().m7902a().m9955l(m13273k());
        InterfaceC3252jd interfaceC3252jd = this.f9008w.get();
        if (interfaceC3252jd != null) {
            interfaceC3252jd.mo9475a(this);
        }
    }

    /* renamed from: L */
    private final void m9310L() {
        IronLog.INTERNAL.verbose(AbstractC3887z.m13248a(this, (String) null, 1, (Object) null));
        m13268f().m9970e().m7902a().m9952i(m13273k());
    }

    /* renamed from: M */
    private final void m9311M() {
        IronLog.INTERNAL.verbose(AbstractC3887z.m13248a(this, (String) null, 1, (Object) null));
        m13268f().m9970e().m7902a().m9954k(m13273k());
    }

    /* renamed from: b */
    private final void m9314b(int i, String str) {
        IronLog.INTERNAL.verbose(m13262a("error = " + i + ", " + str));
        m13268f().m9970e().m7902a().m9939a(m13273k(), i, str, "");
        m13264a(C3473o1.a.FailedToShow);
        IronSourceError ironSourceError = new IronSourceError(i, str);
        InterfaceC3252jd interfaceC3252jd = this.f9008w.get();
        if (interfaceC3252jd != null) {
            interfaceC3252jd.mo9476a(this, ironSourceError);
        }
        mo9322c();
    }

    /* renamed from: d */
    public static final void m9317d(C3218id this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m9309K();
    }

    /* renamed from: e */
    public static final void m9318e(C3218id this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m9310L();
    }

    /* renamed from: f */
    public static final void m9319f(C3218id this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m9311M();
    }

    /* renamed from: a */
    public final void m9320a(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m13262a("placementName = " + m13273k()));
        try {
            m13268f().m9970e().m7902a().m9937a(activity, m13273k());
            if (!(m13269g() instanceof AdapterAdFullScreenInterface)) {
                ironLog.error(m13262a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                m13268f().m9970e().m7911h().m9918g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            } else {
                Object objM13269g = m13269g();
                kotlin.jvm.internal.OooOo.OooO0OO(objM13269g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) objM13269g).showAd(m13271i(), this);
            }
        } catch (Throwable th) {
            StringBuilder sbOooOOO = AbstractC2183w4.OooOOO("showAd - exception = ", th);
            sbOooOOO.append(th.getMessage());
            String string = sbOooOOO.toString();
            IronLog.INTERNAL.error(m13262a(string));
            m13268f().m9970e().m7911h().m9918g(string);
            m9314b(C3855y1.m13121h(m13275m().m4747h()), string);
        }
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: c */
    public void mo9322c() {
        if (C3495on.f10667s.m11213d().mo8685d().mo11376d()) {
            if (!(m13269g() instanceof AdapterAdFullScreenInterface)) {
                IronLog.INTERNAL.error(m13262a("adapter not instance of AdapterAdFullScreenInterface"));
                return;
            }
            Object objM13269g = m13269g();
            kotlin.jvm.internal.OooOo.OooO0OO(objM13269g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
            ((AdapterAdFullScreenInterface) objM13269g).disposeAd(m13275m().m4746g());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        m13265a(new o0OoOo0(this, 4));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        m13265a(new o0OoOo0(this, 1));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        m13265a(new o0OoOo0(this, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowFailed(int i, String str) {
        m13265a(new androidx.profileinstaller.OooO00o(i, this, 2, str));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdShowSuccess() {
        m13265a(new o0OoOo0(this, 3));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        m13265a(new o0OoOo0(this, 5));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        m13265a(new o0OoOo0(this, 0));
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: z */
    public void mo9323z() {
        if (!(m13269g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(m13262a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object objM13269g = m13269g();
        kotlin.jvm.internal.OooOo.OooO0OO(objM13269g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) objM13269g).loadAd(m13275m().m4746g(), ContextProvider.getInstance().getCurrentActiveActivity(), this);
    }

    /* renamed from: b */
    public static final void m9315b(C3218id this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m9307I();
    }

    /* renamed from: c */
    public static final void m9316c(C3218id this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m9308J();
    }

    @Override // com.ironsource.AbstractC3887z
    /* renamed from: a */
    public void mo9321a(InterfaceC3205i0 adInstancePresenter) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.mo9247a(this);
    }

    /* renamed from: a */
    public static final void m9312a(C3218id this$0) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m9306H();
    }

    /* renamed from: a */
    public static final void m9313a(C3218id this$0, int i, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        this$0.m9314b(i, str);
    }
}
