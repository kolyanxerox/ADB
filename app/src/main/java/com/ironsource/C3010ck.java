package com.ironsource;

import android.content.Context;
import com.ironsource.C3571qt;
import com.ironsource.InterfaceC3717u0;
import com.ironsource.mediationsdk.C3404p;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.ck */
/* loaded from: classes2.dex */
public final class C3010ck {

    /* renamed from: a */
    public static final C3010ck f7784a = new C3010ck();

    /* renamed from: b */
    private static final C2974bj f7785b = new C2974bj();

    /* renamed from: com.ironsource.ck$a */
    public static final class a implements InitListener {
        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    /* renamed from: com.ironsource.ck$b */
    public static final class b implements InterfaceC3710ts {

        /* renamed from: a */
        final /* synthetic */ Context f7786a;

        /* renamed from: b */
        final /* synthetic */ C3216ib f7787b;

        /* renamed from: c */
        final /* synthetic */ InitListener f7788c;

        public b(Context context, C3216ib c3216ib, InitListener initListener) {
            this.f7786a = context;
            this.f7787b = c3216ib;
            this.f7788c = initListener;
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8029a(C3465ns sdkConfig) {
            kotlin.jvm.internal.OooOo.OooO0o0(sdkConfig, "sdkConfig");
            C3010ck.f7784a.m8165a(this.f7786a, sdkConfig.m11051d(), this.f7787b, this.f7788c);
        }

        @Override // com.ironsource.InterfaceC3710ts
        /* renamed from: a */
        public void mo8030a(C3535ps error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            C3010ck.f7784a.m8171a(this.f7788c, this.f7787b, error);
        }
    }

    private C3010ck() {
    }

    /* renamed from: a */
    public final void m8165a(Context context, C3571qt c3571qt, C3216ib c3216ib, InitListener initListener) {
        String strM10564r = C3404p.m10470j().m10564r();
        C3700ti c3700tiM11637f = c3571qt.m11637f();
        kotlin.jvm.internal.OooOo.OooO0Oo(c3700tiM11637f, "serverResponse.initialConfiguration");
        NetworkSettings networkSettingsM8546b = c3571qt.m11642k().m8546b("IronSource");
        kotlin.jvm.internal.OooOo.OooO0Oo(networkSettingsM8546b, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = networkSettingsM8546b.getInterstitialSettings();
        kotlin.jvm.internal.OooOo.OooO0Oo(interstitialSettings, "networkSettings.interstitialSettings");
        c3700tiM11637f.m12433a(new InterfaceC3717u0.a(interstitialSettings));
        c3700tiM11637f.m12434a(ConfigFile.getConfigFile().getPluginType());
        c3700tiM11637f.m12437b(strM10564r);
        new C3786w0(new C3706to()).mo12729a(context, c3700tiM11637f, new a());
        m8169a(c3571qt, c3216ib, initListener);
    }

    /* renamed from: a */
    public final void m8173a(Context context, InitRequest initRequest, InitListener initializationListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "initRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        f7785b.m7935a(new androidx.webkit.OooO00o(initRequest, context, initializationListener));
    }

    /* renamed from: a */
    public static final void m8168a(C3535ps error, InitListener initListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "$error");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(f7785b.m7932a(error));
        }
    }

    /* renamed from: a */
    private final void m8169a(C3571qt c3571qt, C3216ib c3216ib, InitListener initListener) {
        C3209i4 c3209i4M13291e;
        C3891z3 c3891z3M12633b = c3571qt.m11635c().m12633b();
        new C3530pn().m11434a((c3891z3M12633b == null || (c3209i4M13291e = c3891z3M12633b.m13291e()) == null) ? null : c3209i4M13291e.m9255b(), true);
        String sessionId = C3404p.m10470j().m10564r();
        C3426mo c3426moM10882a = C3426mo.f10310e.m10882a();
        c3426moM10882a.m10873a(c3571qt.m11642k());
        c3426moM10882a.m10874a(c3571qt.m11635c());
        kotlin.jvm.internal.OooOo.OooO0Oo(sessionId, "sessionId");
        c3426moM10882a.m10875a(sessionId);
        c3426moM10882a.m10880g();
        long jM9304a = C3216ib.m9304a(c3216ib);
        C2974bj c2974bj = f7785b;
        C3571qt.a aVarM11639h = c3571qt.m11639h();
        kotlin.jvm.internal.OooOo.OooO0Oo(aVarM11639h, "serverResponse.origin");
        c2974bj.m7933a(jM9304a, aVarM11639h);
        c2974bj.m7937b(new OooO0o(initListener, 1));
    }

    /* renamed from: a */
    public static final void m8170a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* renamed from: a */
    public final void m8171a(InitListener initListener, C3216ib c3216ib, C3535ps c3535ps) {
        long jM9304a = C3216ib.m9304a(c3216ib);
        C2974bj c2974bj = f7785b;
        c2974bj.m7934a(c3535ps, jM9304a);
        c2974bj.m7937b(new o00000O0(6, c3535ps, initListener));
    }

    /* renamed from: a */
    public static final void m8172a(InitRequest initRequest, Context context, InitListener initializationListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(initRequest, "$initRequest");
        kotlin.jvm.internal.OooOo.OooO0o0(context, "$context");
        kotlin.jvm.internal.OooOo.OooO0o0(initializationListener, "$initializationListener");
        C3216ib c3216ib = new C3216ib();
        C3019ct.f7838a.m8227c(context, new C3780vs(initRequest.getAppKey(), null, o00O0.OooOOO.OoooOo0(f7785b.m7936a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c3216ib, initializationListener));
    }

    /* renamed from: a */
    public final void m8174a(String key, String value) {
        kotlin.jvm.internal.OooOo.OooO0o0(key, "key");
        kotlin.jvm.internal.OooOo.OooO0o0(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        C3404p.m10470j().m10523a(key, arrayList);
    }
}
