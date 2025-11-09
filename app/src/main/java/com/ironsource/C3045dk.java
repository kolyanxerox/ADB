package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3034d9;
import com.ironsource.C3419mh;
import com.ironsource.InterfaceC3257ji;
import com.ironsource.InterfaceC3472o0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.C3640e;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.dk */
/* loaded from: classes2.dex */
public final class C3045dk implements InterfaceC3267js, InterfaceC3829x9, InterfaceC3795w9, InterfaceC3726u9, InterfaceC3761v9, InterfaceC3225ik, InterfaceC3567qp {

    /* renamed from: m */
    private static final String f8284m = "IronSourceAdsPublisherAgent";

    /* renamed from: n */
    private static C3045dk f8285n;

    /* renamed from: a */
    private C3640e f8286a;

    /* renamed from: b */
    private String f8287b;

    /* renamed from: c */
    private String f8288c;

    /* renamed from: d */
    private C3796wa f8289d;

    /* renamed from: e */
    private C3601ro f8290e;

    /* renamed from: g */
    private C3144g9 f8292g;

    /* renamed from: f */
    private boolean f8291f = false;

    /* renamed from: h */
    private FeaturesManager f8293h = FeaturesManager.getInstance();

    /* renamed from: i */
    private InterfaceC3257ji.a f8294i = C3495on.m11193O().mo8483g();

    /* renamed from: j */
    private InterfaceC3472o0.a f8295j = C3495on.m11193O().mo8479F();

    /* renamed from: k */
    private InterfaceC3472o0 f8296k = C3495on.m11199U().mo8683G();

    /* renamed from: l */
    private InterfaceC3291kh f8297l = C3495on.m11199U().mo8681A();

    /* renamed from: com.ironsource.dk$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f8298a;

        /* renamed from: b */
        final /* synthetic */ String f8299b;

        /* renamed from: c */
        final /* synthetic */ C3762va f8300c;

        public a(String str, String str2, C3762va c3762va) {
            this.f8298a = str;
            this.f8299b = str2;
            this.f8300c = c3762va;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3045dk.this.f8286a.mo11992a(this.f8298a, this.f8299b, this.f8300c, (InterfaceC3829x9) C3045dk.this);
        }
    }

    /* renamed from: com.ironsource.dk$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f8302a;

        public b(JSONObject jSONObject) {
            this.f8302a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3045dk.this.f8286a.mo11996a(this.f8302a, (InterfaceC3829x9) C3045dk.this);
        }
    }

    /* renamed from: com.ironsource.dk$c */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f8304a;

        /* renamed from: b */
        final /* synthetic */ String f8305b;

        /* renamed from: c */
        final /* synthetic */ C3762va f8306c;

        public c(String str, String str2, C3762va c3762va) {
            this.f8304a = str;
            this.f8305b = str2;
            this.f8306c = c3762va;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3045dk.this.f8286a.mo11991a(this.f8304a, this.f8305b, this.f8306c, (InterfaceC3795w9) C3045dk.this);
        }
    }

    /* renamed from: com.ironsource.dk$d */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f8308a;

        public d(String str) {
            this.f8308a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3045dk.this.f8286a.mo11989a(this.f8308a, C3045dk.this);
        }
    }

    /* renamed from: com.ironsource.dk$e */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f8310a;

        public e(JSONObject jSONObject) {
            this.f8310a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3045dk.this.f8286a.mo11995a(this.f8310a, (InterfaceC3795w9) C3045dk.this);
        }
    }

    /* renamed from: com.ironsource.dk$f */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3907zj f8312a;

        /* renamed from: b */
        final /* synthetic */ Map f8313b;

        public f(C3907zj c3907zj, Map map) {
            this.f8312a = c3907zj;
            this.f8313b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3419mh.e eVar = this.f8312a.m13399i() ? C3419mh.e.Banner : C3419mh.e.Interstitial;
            C3762va c3762vaM12849a = C3045dk.this.f8289d.m12849a(eVar, this.f8312a);
            C3489oh c3489oh = new C3489oh();
            c3489oh.m11155a(C3037dc.f8269x, Boolean.valueOf(this.f8312a.m13400j())).m11155a(C3037dc.f8231G, Boolean.valueOf(this.f8312a.m13403m())).m11155a(C3037dc.f8267v, this.f8312a.m13397g()).m11155a(C3037dc.f8268w, C3259jk.m9517a(this.f8312a)).m11155a(C3037dc.f8233I, Long.valueOf(C3309l0.f9291a.m9729b(this.f8312a.m13395e())));
            C3699th.m12428a(C3198hs.f8923h, c3489oh.m11156a());
            if (eVar == C3419mh.e.Banner) {
                C3045dk.this.f8286a.mo11990a(C3045dk.this.f8287b, C3045dk.this.f8288c, c3762vaM12849a, (InterfaceC3761v9) C3045dk.this);
                C3045dk.this.f8286a.mo11985a(c3762vaM12849a, this.f8313b, (InterfaceC3761v9) C3045dk.this);
            } else {
                C3045dk.this.f8286a.mo11991a(C3045dk.this.f8287b, C3045dk.this.f8288c, c3762vaM12849a, (InterfaceC3795w9) C3045dk.this);
                C3045dk.this.f8286a.mo12000b(c3762vaM12849a, this.f8313b, C3045dk.this);
            }
        }
    }

    /* renamed from: com.ironsource.dk$g */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3762va f8315a;

        /* renamed from: b */
        final /* synthetic */ Map f8316b;

        public g(C3762va c3762va, Map map) {
            this.f8315a = c3762va;
            this.f8316b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3045dk.this.f8286a.mo11986a(this.f8315a, this.f8316b, (InterfaceC3795w9) C3045dk.this);
        }
    }

    /* renamed from: com.ironsource.dk$h */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3907zj f8318a;

        public h(C3907zj c3907zj) {
            this.f8318a = c3907zj;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3419mh.e eVar = this.f8318a.m13399i() ? C3419mh.e.Banner : C3419mh.e.Interstitial;
            C3762va c3762vaM12849a = C3045dk.this.f8289d.m12849a(eVar, this.f8318a);
            C3489oh c3489oh = new C3489oh();
            c3489oh.m11155a(C3037dc.f8269x, Boolean.valueOf(this.f8318a.m13400j())).m11155a(C3037dc.f8267v, this.f8318a.m13397g()).m11155a(C3037dc.f8268w, C3259jk.m9517a(this.f8318a)).m11155a("isMultipleAdObjects", Boolean.valueOf(this.f8318a.m13402l()));
            C3699th.m12428a(C3198hs.f8928m, c3489oh.m11156a());
            if (eVar == C3419mh.e.Banner) {
                C3045dk.this.f8286a.mo11984a(c3762vaM12849a);
            } else {
                c3762vaM12849a.m12754a(false);
                C3045dk.this.f8286a.mo11999b(c3762vaM12849a);
            }
        }
    }

    private C3045dk(Context context, int i) {
        m8339c(context);
    }

    /* renamed from: a */
    public static synchronized C3045dk m8327a(Context context, int i) throws Exception {
        try {
            Logger.m12266i(f8284m, "getInstance()");
            if (f8285n == null) {
                f8285n = new C3045dk(context, i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8285n;
    }

    /* renamed from: b */
    public static synchronized C3045dk m8333b(Context context) throws Exception {
        return m8327a(context, 0);
    }

    /* renamed from: c */
    private InterfaceC3672sp m8337c(C3762va c3762va) {
        if (c3762va == null) {
            return null;
        }
        return (InterfaceC3672sp) c3762va.m12765i();
    }

    /* renamed from: d */
    private C3762va m8341d(C3419mh.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f8289d.m12850a(eVar, str);
    }

    @Override // com.ironsource.InterfaceC3795w9
    public void onInterstitialAdRewarded(String str, int i) {
        C3762va c3762vaM8341d = m8341d(C3419mh.e.Interstitial, str);
        InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
        if (c3762vaM8341d == null || interfaceC3462npM8334b == null) {
            return;
        }
        interfaceC3462npM8334b.onInterstitialAdRewarded(str, i);
    }

    @Override // com.ironsource.InterfaceC3267js, com.ironsource.InterfaceC3225ik
    public void onPause(Activity activity) {
        if (this.f8291f) {
            return;
        }
        mo8362b(activity);
    }

    @Override // com.ironsource.InterfaceC3267js, com.ironsource.InterfaceC3225ik
    public void onResume(Activity activity) {
        if (this.f8291f) {
            return;
        }
        mo8369c(activity);
    }

    public C3045dk(String str, String str2, Context context) {
        this.f8287b = str;
        this.f8288c = str2;
        m8339c(context);
    }

    /* renamed from: a */
    public static InterfaceC3225ik m8328a(Context context, String str, String str2) {
        return m8329a(str, str2, context);
    }

    /* renamed from: b */
    private InterfaceC3462np m8334b(C3762va c3762va) {
        if (c3762va == null) {
            return null;
        }
        return (InterfaceC3462np) c3762va.m12765i();
    }

    /* renamed from: a */
    public static synchronized InterfaceC3225ik m8329a(String str, String str2, Context context) {
        try {
            if (f8285n == null) {
                C3699th.m12427a(C3198hs.f8916a);
                f8285n = new C3045dk(str, str2, context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8285n;
    }

    @Override // com.ironsource.InterfaceC3567qp
    /* renamed from: c */
    public void mo8369c(Activity activity) {
        this.f8292g.m8926a(activity);
        this.f8286a.mo12004f();
        this.f8286a.mo11998b(activity);
    }

    @Override // com.ironsource.InterfaceC3829x9
    /* renamed from: d */
    public void mo8375d(String str, String str2) {
        InterfaceC3672sp interfaceC3672spM8337c;
        C3762va c3762vaM8341d = m8341d(C3419mh.e.RewardedVideo, str);
        if (c3762vaM8341d == null || (interfaceC3672spM8337c = m8337c(c3762vaM8341d)) == null) {
            return;
        }
        interfaceC3672spM8337c.m12303a(str2);
    }

    /* renamed from: a */
    private InterfaceC3338lp m8330a(C3762va c3762va) {
        if (c3762va == null) {
            return null;
        }
        return (InterfaceC3338lp) c3762va.m12765i();
    }

    /* renamed from: c */
    private void m8339c(Context context) {
        try {
            SDKUtils.getNetworkConfiguration();
            C3527pk.m11415a(context);
            IronSourceStorageUtils.initializeCacheDirectory(context, new C3782vu(SDKUtils.getNetworkConfiguration().optJSONObject(C3034d9.a.f7924k)));
            C3527pk.m11417e().m11426d(SDKUtils.getSDKVersion());
            this.f8289d = new C3796wa();
            C3144g9 c3144g9 = new C3144g9();
            this.f8292g = c3144g9;
            if (context instanceof Activity) {
                c3144g9.m8926a((Activity) context);
            }
            int debugMode = this.f8293h.getDebugMode();
            this.f8290e = new C3601ro();
            this.f8286a = new C3640e(context, this.f8292g, this.f8289d, C3523pg.f10822a, debugMode, this.f8293h.getDataManagerConfig(), this.f8287b, this.f8288c, this.f8290e);
            Logger.enableLogging(debugMode);
            Logger.m12266i(f8284m, "C'tor");
            m8346a(context);
            this.f8290e.m11754d();
            this.f8290e.m11755e();
            this.f8290e.m11745a(context);
            this.f8290e.m11751b();
            this.f8290e.m11744a();
            this.f8290e.m11752b(context);
            this.f8290e.m11753c();
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3567qp
    /* renamed from: b */
    public void mo8362b(Activity activity) {
        try {
            this.f8286a.mo12002d();
            this.f8286a.mo11982a((Context) activity);
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3225ik
    /* renamed from: a */
    public C3640e mo8343a() {
        return this.f8286a;
    }

    @Override // com.ironsource.InterfaceC3294kk
    /* renamed from: b */
    public void mo8363b(Activity activity, C3907zj c3907zj, Map<String, String> map) {
        if (C3495on.m11199U().mo8685d().mo11378f()) {
            this.f8292g.m8926a(activity);
        }
        mo8351a(c3907zj, map);
    }

    @Override // com.ironsource.InterfaceC3726u9
    /* renamed from: c */
    public void mo8370c(C3419mh.e eVar, String str) {
        InterfaceC3338lp interfaceC3338lpM8330a;
        C3762va c3762vaM8341d = m8341d(eVar, str);
        if (c3762vaM8341d != null) {
            if (eVar == C3419mh.e.RewardedVideo) {
                InterfaceC3672sp interfaceC3672spM8337c = m8337c(c3762vaM8341d);
                if (interfaceC3672spM8337c != null) {
                    interfaceC3672spM8337c.m12308d();
                    return;
                }
                return;
            }
            if (eVar == C3419mh.e.Interstitial) {
                InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
                if (interfaceC3462npM8334b != null) {
                    interfaceC3462npM8334b.onInterstitialClick();
                    return;
                }
                return;
            }
            if (eVar != C3419mh.e.Banner || (interfaceC3338lpM8330a = m8330a(c3762vaM8341d)) == null) {
                return;
            }
            interfaceC3338lpM8330a.onBannerClick();
        }
    }

    /* renamed from: c */
    private void m8340c(C3907zj c3907zj, Map<String, String> map) {
        try {
            map = m8332a(map);
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
            C3489oh c3489ohM11155a = new C3489oh().m11155a(C3037dc.f8225A, e2.getMessage()).m11155a(C3037dc.f8269x, Boolean.valueOf(c3907zj.m13400j())).m11155a(C3037dc.f8231G, Boolean.valueOf(c3907zj.m13403m())).m11155a(C3037dc.f8267v, c3907zj.m13397g()).m11155a(C3037dc.f8268w, C3259jk.m9517a(c3907zj)).m11155a(C3037dc.f8233I, Long.valueOf(C3309l0.f9291a.m9729b(c3907zj.m13395e())));
            C3309l0.f9291a.m9727a(c3907zj.m13395e());
            C3699th.m12428a(C3198hs.f8926k, c3489ohM11155a.m11156a());
            IronLog.INTERNAL.error(e2.toString());
            Logger.m12262d(f8284m, "loadInAppBiddingAd failed decoding  ADM " + e2.getMessage());
        }
        m8336b(c3907zj, map);
    }

    @Override // com.ironsource.InterfaceC3726u9
    /* renamed from: b */
    public void mo8364b(C3419mh.e eVar, String str) {
        InterfaceC3672sp interfaceC3672spM8337c;
        C3762va c3762vaM8341d = m8341d(eVar, str);
        if (c3762vaM8341d != null) {
            if (eVar == C3419mh.e.Interstitial) {
                InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
                if (interfaceC3462npM8334b != null) {
                    interfaceC3462npM8334b.onInterstitialOpen();
                    return;
                }
                return;
            }
            if (eVar != C3419mh.e.RewardedVideo || (interfaceC3672spM8337c = m8337c(c3762vaM8341d)) == null) {
                return;
            }
            interfaceC3672spM8337c.m12300a();
        }
    }

    /* renamed from: a */
    private Map<String, String> m8332a(Map<String, String> map) {
        map.put("adm", SDKUtils.decodeString(map.get("adm")));
        return map;
    }

    @Override // com.ironsource.InterfaceC3294kk
    /* renamed from: b */
    public void mo8365b(C3907zj c3907zj) {
        Logger.m12262d(f8284m, "destroyInstance " + c3907zj.m13395e());
        if (m8374c(c3907zj)) {
            this.f8295j.mo11063a(EnumC3310l1.DESTROYED, c3907zj.m13395e());
            this.f8294i.mo9502a(new C2985bu(this.f8296k.mo11061a(c3907zj.m13395e())));
        }
        this.f8286a.m11987a(new h(c3907zj));
    }

    @Override // com.ironsource.InterfaceC3829x9
    /* renamed from: c */
    public void mo8371c(String str) {
        InterfaceC3672sp interfaceC3672spM8337c;
        C3762va c3762vaM8341d = m8341d(C3419mh.e.RewardedVideo, str);
        if (c3762vaM8341d == null || (interfaceC3672spM8337c = m8337c(c3762vaM8341d)) == null) {
            return;
        }
        interfaceC3672spM8337c.m12305b();
    }

    /* renamed from: b */
    private void m8336b(C3907zj c3907zj, Map<String, String> map) {
        Logger.m12262d(f8284m, "loadOnNewInstance " + c3907zj.m13395e());
        this.f8286a.m11987a(new f(c3907zj, map));
    }

    @Override // com.ironsource.InterfaceC3267js, com.ironsource.InterfaceC3225ik
    /* renamed from: a */
    public void mo8344a(Activity activity) {
        try {
            Logger.m12266i(f8284m, "release()");
            C3898za.m13310g();
            this.f8292g.m8927b();
            this.f8286a.mo11982a((Context) activity);
            this.f8286a.destroy();
            this.f8286a = null;
        } catch (Exception e2) {
            C3551q9.m11517d().m11519a(e2);
        }
        f8285n = null;
    }

    @Override // com.ironsource.InterfaceC3795w9
    /* renamed from: c */
    public void mo8372c(String str, String str2) {
        C3419mh.e eVar = C3419mh.e.Interstitial;
        C3762va c3762vaM8341d = m8341d(eVar, str);
        C3489oh c3489oh = new C3489oh();
        c3489oh.m11155a(C3037dc.f8225A, str2).m11155a(C3037dc.f8267v, str);
        if (c3762vaM8341d != null) {
            C3489oh c3489ohM11155a = c3489oh.m11155a(C3037dc.f8268w, C3734uh.m12677a(c3762vaM8341d, eVar)).m11155a(C3037dc.f8270y, c3762vaM8341d.m12761e() == 2 ? C3037dc.f8229E : C3037dc.f8230F).m11155a(C3037dc.f8269x, Boolean.valueOf(C3734uh.m12680a(c3762vaM8341d)));
            C3309l0 c3309l0 = C3309l0.f9291a;
            c3489ohM11155a.m11155a(C3037dc.f8233I, Long.valueOf(c3309l0.m9729b(c3762vaM8341d.m12764h())));
            c3309l0.m9727a(c3762vaM8341d.m12764h());
            InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
            if (interfaceC3462npM8334b != null) {
                interfaceC3462npM8334b.onInterstitialLoadFailed(str2);
            }
        }
        C3699th.m12428a(C3198hs.f8922g, c3489oh.m11156a());
    }

    @Override // com.ironsource.InterfaceC3294kk
    /* renamed from: a */
    public void mo8345a(Activity activity, C3907zj c3907zj, Map<String, String> map) {
        this.f8292g.m8926a(activity);
        Logger.m12266i(f8284m, "showAd " + c3907zj.m13395e());
        C3762va c3762vaM12850a = this.f8289d.m12850a(C3419mh.e.Interstitial, c3907zj.m13395e());
        if (c3762vaM12850a == null) {
            return;
        }
        this.f8286a.m11987a(new g(c3762vaM12850a, map));
    }

    @Override // com.ironsource.InterfaceC3795w9
    /* renamed from: b */
    public void mo8366b(String str) {
        C3762va c3762vaM8341d = m8341d(C3419mh.e.Interstitial, str);
        if (c3762vaM8341d != null) {
            C3907zj c3907zjM12758c = c3762vaM8341d.m12758c();
            this.f8295j.mo11063a(EnumC3310l1.SHOW_SUCCESS, c3907zjM12758c.m13395e());
            if (m8374c(c3907zjM12758c)) {
                this.f8294i.mo9502a(new C3130fu(this.f8296k.mo11061a(c3907zjM12758c.m13395e())));
            }
            InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
            if (interfaceC3462npM8334b != null) {
                interfaceC3462npM8334b.onInterstitialShowSuccess();
            }
        }
    }

    @Override // com.ironsource.InterfaceC3267js
    /* renamed from: c */
    public void mo8373c(JSONObject jSONObject) {
        this.f8286a.m11987a(new e(jSONObject));
    }

    /* renamed from: a */
    public void m8346a(Context context) {
        this.f8291f = false;
        Boolean boolMo9673c = this.f8297l.mo9673c(C3034d9.a.f7920g);
        if (boolMo9673c == null) {
            boolMo9673c = Boolean.FALSE;
        }
        boolean zBooleanValue = boolMo9673c.booleanValue();
        this.f8291f = zBooleanValue;
        if (zBooleanValue) {
            try {
                ((Application) context).registerActivityLifecycleCallbacks(new C3204i(this));
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
                C3489oh c3489oh = new C3489oh();
                c3489oh.m11155a(C3037dc.f8270y, th.getMessage());
                C3699th.m12428a(C3198hs.f8936u, c3489oh.m11156a());
            }
        }
    }

    @Override // com.ironsource.InterfaceC3795w9
    /* renamed from: b */
    public void mo8367b(String str, String str2) {
        C3762va c3762vaM8341d = m8341d(C3419mh.e.Interstitial, str);
        if (c3762vaM8341d != null) {
            C3907zj c3907zjM12758c = c3762vaM8341d.m12758c();
            this.f8295j.mo11063a(EnumC3310l1.SHOW_FAIL, c3907zjM12758c.m13395e());
            if (m8374c(c3907zjM12758c)) {
                this.f8294i.mo9502a(new C3095eu(this.f8296k.mo11061a(c3907zjM12758c.m13395e())));
            }
            InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
            if (interfaceC3462npM8334b != null) {
                interfaceC3462npM8334b.onInterstitialShowFailed(str2);
            }
        }
    }

    /* renamed from: c */
    public boolean m8374c(C3907zj c3907zj) {
        return c3907zj.m13402l() && !c3907zj.m13399i() && mo8360a(c3907zj);
    }

    @Override // com.ironsource.InterfaceC3726u9
    /* renamed from: a */
    public void mo8347a(C3419mh.e eVar, String str) {
        InterfaceC3462np interfaceC3462npM8334b;
        C3762va c3762vaM8341d = m8341d(eVar, str);
        if (c3762vaM8341d != null) {
            if (eVar == C3419mh.e.RewardedVideo) {
                InterfaceC3672sp interfaceC3672spM8337c = m8337c(c3762vaM8341d);
                if (interfaceC3672spM8337c != null) {
                    interfaceC3672spM8337c.m12307c();
                    return;
                }
                return;
            }
            if (eVar != C3419mh.e.Interstitial || (interfaceC3462npM8334b = m8334b(c3762vaM8341d)) == null) {
                return;
            }
            interfaceC3462npM8334b.onInterstitialClose();
        }
    }

    @Override // com.ironsource.InterfaceC3267js
    /* renamed from: b */
    public void mo8368b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("demandSourceName");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f8286a.m11987a(new d(strOptString));
    }

    @Override // com.ironsource.InterfaceC3726u9
    /* renamed from: a */
    public void mo8348a(C3419mh.e eVar, String str, C3822x2 c3822x2) {
        InterfaceC3338lp interfaceC3338lpM8330a;
        C3762va c3762vaM8341d = m8341d(eVar, str);
        if (c3762vaM8341d != null) {
            c3762vaM8341d.m12757b(2);
            if (eVar == C3419mh.e.RewardedVideo) {
                InterfaceC3672sp interfaceC3672spM8337c = m8337c(c3762vaM8341d);
                if (interfaceC3672spM8337c != null) {
                    interfaceC3672spM8337c.m12302a(c3822x2);
                    return;
                }
                return;
            }
            if (eVar == C3419mh.e.Interstitial) {
                InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
                if (interfaceC3462npM8334b != null) {
                    interfaceC3462npM8334b.onInterstitialInitSuccess();
                    return;
                }
                return;
            }
            if (eVar != C3419mh.e.Banner || (interfaceC3338lpM8330a = m8330a(c3762vaM8341d)) == null) {
                return;
            }
            interfaceC3338lpM8330a.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.InterfaceC3726u9
    /* renamed from: a */
    public void mo8349a(C3419mh.e eVar, String str, String str2) {
        InterfaceC3338lp interfaceC3338lpM8330a;
        C3762va c3762vaM8341d = m8341d(eVar, str);
        C3489oh c3489ohM11155a = new C3489oh().m11155a(C3037dc.f8267v, str).m11155a(C3037dc.f8268w, eVar).m11155a(C3037dc.f8225A, str2);
        if (c3762vaM8341d != null) {
            C3309l0 c3309l0 = C3309l0.f9291a;
            c3489ohM11155a.m11155a(C3037dc.f8233I, Long.valueOf(c3309l0.m9729b(c3762vaM8341d.m12764h())));
            c3489ohM11155a.m11155a(C3037dc.f8269x, Boolean.valueOf(C3734uh.m12680a(c3762vaM8341d)));
            c3309l0.m9727a(c3762vaM8341d.m12764h());
            c3762vaM8341d.m12757b(3);
            if (eVar == C3419mh.e.RewardedVideo) {
                InterfaceC3672sp interfaceC3672spM8337c = m8337c(c3762vaM8341d);
                if (interfaceC3672spM8337c != null) {
                    interfaceC3672spM8337c.m12306b(str2);
                }
            } else if (eVar == C3419mh.e.Interstitial) {
                InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
                if (interfaceC3462npM8334b != null) {
                    interfaceC3462npM8334b.onInterstitialInitFailed(str2);
                }
            } else if (eVar == C3419mh.e.Banner && (interfaceC3338lpM8330a = m8330a(c3762vaM8341d)) != null) {
                interfaceC3338lpM8330a.onBannerLoadFail(str2);
            }
        }
        C3699th.m12428a(C3198hs.f8924i, c3489ohM11155a.m11156a());
    }

    @Override // com.ironsource.InterfaceC3726u9
    /* renamed from: a */
    public void mo8350a(C3419mh.e eVar, String str, String str2, JSONObject jSONObject) throws JSONException {
        InterfaceC3338lp interfaceC3338lpM8330a;
        C3762va c3762vaM8341d = m8341d(eVar, str);
        if (c3762vaM8341d == null || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            Logger.m12266i(f8284m, "Received Event Notification: " + str2 + " for demand source: " + c3762vaM8341d.m12762f());
            if (eVar == C3419mh.e.Interstitial) {
                InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
                if (interfaceC3462npM8334b != null) {
                    jSONObject.put("demandSourceName", str);
                    interfaceC3462npM8334b.onInterstitialEventNotificationReceived(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar == C3419mh.e.RewardedVideo) {
                InterfaceC3672sp interfaceC3672spM8337c = m8337c(c3762vaM8341d);
                if (interfaceC3672spM8337c != null) {
                    jSONObject.put("demandSourceName", str);
                    interfaceC3672spM8337c.m12304a(str2, jSONObject);
                    return;
                }
                return;
            }
            if (eVar != C3419mh.e.Banner || (interfaceC3338lpM8330a = m8330a(c3762vaM8341d)) == null) {
                return;
            }
            jSONObject.put("demandSourceName", str);
            if (str2.equalsIgnoreCase("impressions")) {
                interfaceC3338lpM8330a.onBannerShowSuccess();
            }
        } catch (JSONException e2) {
            C3551q9.m11517d().m11519a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3294kk
    /* renamed from: a */
    public void mo8351a(C3907zj c3907zj, Map<String, String> map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put(C3034d9.h.f8142y0, String.valueOf(jCurrentTimeMillis));
        C3309l0.f9291a.m9728a(c3907zj.m13395e(), jCurrentTimeMillis);
        C3489oh c3489oh = new C3489oh();
        c3489oh.m11155a(C3037dc.f8269x, Boolean.valueOf(c3907zj.m13400j())).m11155a(C3037dc.f8231G, Boolean.valueOf(c3907zj.m13403m())).m11155a(C3037dc.f8267v, c3907zj.m13397g()).m11155a(C3037dc.f8268w, C3259jk.m9517a(c3907zj)).m11155a(C3037dc.f8233I, Long.valueOf(jCurrentTimeMillis));
        C3699th.m12428a(C3198hs.f8921f, c3489oh.m11156a());
        Logger.m12262d(f8284m, "loadAd " + c3907zj.m13395e());
        C3437n0 c3437n0 = new C3437n0(c3907zj);
        this.f8295j.mo11064a(c3437n0);
        this.f8295j.mo11065a(new JSONObject(map), EnumC3310l1.LOAD_REQUEST, c3437n0.m10905c());
        if (m8374c(c3907zj)) {
            this.f8294i.mo9502a(new C3020cu(c3437n0));
        }
        if (c3907zj.m13401k()) {
            m8340c(c3907zj, map);
        } else {
            m8336b(c3907zj, map);
        }
    }

    @Override // com.ironsource.InterfaceC3829x9
    /* renamed from: a */
    public void mo8352a(String str, int i) {
        InterfaceC3672sp interfaceC3672spM8337c;
        C3762va c3762vaM8341d = m8341d(C3419mh.e.RewardedVideo, str);
        if (c3762vaM8341d == null || (interfaceC3672spM8337c = m8337c(c3762vaM8341d)) == null) {
            return;
        }
        interfaceC3672spM8337c.m12301a(i);
    }

    @Override // com.ironsource.InterfaceC3761v9
    /* renamed from: a */
    public void mo8353a(String str, C3042dh c3042dh) {
        InterfaceC3338lp interfaceC3338lpM8330a;
        C3762va c3762vaM8341d = m8341d(C3419mh.e.Banner, str);
        if (c3762vaM8341d == null || (interfaceC3338lpM8330a = m8330a(c3762vaM8341d)) == null) {
            return;
        }
        interfaceC3338lpM8330a.onBannerLoadSuccess(c3762vaM8341d.m12758c(), c3042dh);
    }

    @Override // com.ironsource.InterfaceC3761v9
    /* renamed from: a */
    public void mo8354a(String str, String str2) {
        InterfaceC3338lp interfaceC3338lpM8330a;
        C3762va c3762vaM8341d = m8341d(C3419mh.e.Banner, str);
        if (c3762vaM8341d == null || (interfaceC3338lpM8330a = m8330a(c3762vaM8341d)) == null) {
            return;
        }
        interfaceC3338lpM8330a.onBannerLoadFail(str2);
    }

    @Override // com.ironsource.InterfaceC3267js
    /* renamed from: a */
    public void mo8355a(String str, String str2, int i) {
        C3419mh.e productType;
        C3762va c3762vaM12850a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (productType = SDKUtils.getProductType(str)) == null || (c3762vaM12850a = this.f8289d.m12850a(productType, str2)) == null) {
            return;
        }
        c3762vaM12850a.m12759c(i);
    }

    @Override // com.ironsource.InterfaceC3267js
    /* renamed from: a */
    public void mo8356a(String str, String str2, String str3, Map<String, String> map, InterfaceC3462np interfaceC3462np) {
        this.f8287b = str;
        this.f8288c = str2;
        this.f8286a.m11987a(new c(str, str2, this.f8289d.m12851a(C3419mh.e.Interstitial, str3, map, interfaceC3462np)));
    }

    @Override // com.ironsource.InterfaceC3267js
    /* renamed from: a */
    public void mo8357a(String str, String str2, String str3, Map<String, String> map, InterfaceC3672sp interfaceC3672sp) {
        this.f8287b = str;
        this.f8288c = str2;
        this.f8286a.m11987a(new a(str, str2, this.f8289d.m12851a(C3419mh.e.RewardedVideo, str3, map, interfaceC3672sp)));
    }

    @Override // com.ironsource.InterfaceC3795w9
    /* renamed from: a */
    public void mo8358a(String str, JSONObject jSONObject) {
        C3419mh.e eVar = C3419mh.e.Interstitial;
        C3762va c3762vaM8341d = m8341d(eVar, str);
        C3489oh c3489ohM11155a = new C3489oh().m11155a(C3037dc.f8267v, str);
        if (c3762vaM8341d != null) {
            C3907zj c3907zjM12758c = c3762vaM8341d.m12758c();
            this.f8295j.mo11065a(jSONObject, EnumC3310l1.LOAD_SUCCESS, c3907zjM12758c.m13395e());
            if (m8374c(c3907zjM12758c)) {
                this.f8294i.mo9502a(new C3055du(this.f8296k.mo11061a(c3907zjM12758c.m13395e())));
            }
            C3489oh c3489ohM11155a2 = c3489ohM11155a.m11155a(C3037dc.f8268w, C3734uh.m12677a(c3762vaM8341d, eVar)).m11155a(C3037dc.f8269x, Boolean.valueOf(C3734uh.m12680a(c3762vaM8341d)));
            C3309l0 c3309l0 = C3309l0.f9291a;
            c3489ohM11155a2.m11155a(C3037dc.f8233I, Long.valueOf(c3309l0.m9729b(c3762vaM8341d.m12764h())));
            c3309l0.m9727a(c3762vaM8341d.m12764h());
            InterfaceC3462np interfaceC3462npM8334b = m8334b(c3762vaM8341d);
            if (interfaceC3462npM8334b != null) {
                interfaceC3462npM8334b.onInterstitialLoadSuccess(c3762vaM8341d.m12758c());
            }
        }
        C3699th.m12428a(C3198hs.f8927l, c3489ohM11155a.m11156a());
    }

    @Override // com.ironsource.InterfaceC3267js
    /* renamed from: a */
    public void mo8359a(JSONObject jSONObject) {
        this.f8286a.m11987a(new b(jSONObject));
    }

    @Override // com.ironsource.InterfaceC3294kk
    /* renamed from: a */
    public boolean mo8360a(C3907zj c3907zj) {
        Logger.m12262d(f8284m, "isAdAvailable " + c3907zj.m13395e());
        C3762va c3762vaM12850a = this.f8289d.m12850a(C3419mh.e.Interstitial, c3907zj.m13395e());
        if (c3762vaM12850a == null) {
            return false;
        }
        return c3762vaM12850a.m12760d();
    }

    @Override // com.ironsource.InterfaceC3267js
    /* renamed from: a */
    public boolean mo8361a(String str) {
        return this.f8286a.mo11997a(str);
    }
}
