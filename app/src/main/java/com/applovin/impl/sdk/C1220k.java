package com.applovin.impl.sdk;

import OooO0oO.OooOo;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.AbstractC1054i3;
import com.applovin.impl.AbstractC1063j2;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1144o3;
import com.applovin.impl.AbstractC1145o4;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1175r0;
import com.applovin.impl.AbstractC1249t3;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0959a6;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0990c;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C0998c7;
import com.applovin.impl.C1002d1;
import com.applovin.impl.C1012e1;
import com.applovin.impl.C1019e8;
import com.applovin.impl.C1020f;
import com.applovin.impl.C1035g4;
import com.applovin.impl.C1044h3;
import com.applovin.impl.C1052i1;
import com.applovin.impl.C1058i7;
import com.applovin.impl.C1059i8;
import com.applovin.impl.C1060j;
import com.applovin.impl.C1068j7;
import com.applovin.impl.C1094m3;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1166q0;
import com.applovin.impl.C1167q1;
import com.applovin.impl.C1178r3;
import com.applovin.impl.C1180r5;
import com.applovin.impl.C1187s3;
import com.applovin.impl.C1246t0;
import com.applovin.impl.C1259u4;
import com.applovin.impl.C1267v3;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1275w2;
import com.applovin.impl.C1277w4;
import com.applovin.impl.C1286x4;
import com.applovin.impl.C1295y4;
import com.applovin.impl.C1303z3;
import com.applovin.impl.SharedPreferencesOnSharedPreferenceChangeListenerC1279w6;
import com.applovin.impl.mediation.C1122d;
import com.applovin.impl.mediation.C1126e;
import com.applovin.impl.mediation.C1127f;
import com.applovin.impl.mediation.C1128g;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.C1236b;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinMediationProvider;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.k */
/* loaded from: classes.dex */
public class C1220k {

    /* renamed from: D0 */
    public static C1220k f2089D0;

    /* renamed from: E0 */
    protected static Context f2090E0;

    /* renamed from: F0 */
    private static boolean f2091F0;

    /* renamed from: H0 */
    private static final boolean f2093H0;

    /* renamed from: I0 */
    private static volatile C0990c f2094I0;

    /* renamed from: A0 */
    private AppLovinSdk.SdkInitializationListener f2097A0;

    /* renamed from: a */
    private String f2125a;

    /* renamed from: b */
    private String f2127b;

    /* renamed from: c */
    private WeakReference f2129c;

    /* renamed from: d */
    private final long f2131d;

    /* renamed from: e */
    private long f2133e;

    /* renamed from: f */
    private long f2135f;

    /* renamed from: g */
    private Long f2137g;

    /* renamed from: h */
    private long f2139h;

    /* renamed from: j */
    private final AppLovinSdkSettings f2143j;

    /* renamed from: j0 */
    private C1126e f2144j0;

    /* renamed from: k */
    private MaxSegmentCollection f2145k;

    /* renamed from: l */
    private String f2147l;

    /* renamed from: l0 */
    private List f2148l0;

    /* renamed from: q */
    private volatile AppLovinSdk f2157q;

    /* renamed from: q0 */
    private boolean f2158q0;

    /* renamed from: v0 */
    private String f2168v0;

    /* renamed from: w0 */
    private AppLovinSdkInitializationConfiguration f2170w0;

    /* renamed from: z0 */
    private AppLovinSdk.SdkInitializationListener f2176z0;

    /* renamed from: J0 */
    private static final Object f2095J0 = new Object();

    /* renamed from: G0 */
    private static final long f2092G0 = System.currentTimeMillis();

    /* renamed from: i */
    private final AtomicBoolean f2141i = new AtomicBoolean();

    /* renamed from: m */
    private final AtomicReference f2149m = new AtomicReference();

    /* renamed from: n */
    private final AtomicReference f2151n = new AtomicReference();

    /* renamed from: o */
    private final AtomicReference f2153o = new AtomicReference();

    /* renamed from: p */
    private final AtomicReference f2155p = new AtomicReference();

    /* renamed from: r */
    private final C1240o f2159r = new C1240o(this);

    /* renamed from: s */
    private final C1020f f2161s = new C1020f(this);

    /* renamed from: t */
    private final C1275w2 f2163t = new C1275w2(this);

    /* renamed from: u */
    private final C1167q1 f2165u = new C1167q1(this);

    /* renamed from: v */
    private final C1058i7 f2167v = new C1058i7(this);

    /* renamed from: w */
    private final AtomicReference f2169w = new AtomicReference();

    /* renamed from: x */
    private final AtomicReference f2171x = new AtomicReference();

    /* renamed from: y */
    private final AtomicReference f2173y = new AtomicReference();

    /* renamed from: z */
    private final AtomicReference f2175z = new AtomicReference();

    /* renamed from: A */
    private final AtomicReference f2096A = new AtomicReference();

    /* renamed from: B */
    private final AtomicReference f2098B = new AtomicReference();

    /* renamed from: C */
    private final AtomicReference f2100C = new AtomicReference();

    /* renamed from: D */
    private final AtomicReference f2102D = new AtomicReference();

    /* renamed from: E */
    private final AtomicReference f2103E = new AtomicReference();

    /* renamed from: F */
    private final AtomicReference f2104F = new AtomicReference();

    /* renamed from: G */
    private final AtomicReference f2105G = new AtomicReference();

    /* renamed from: H */
    private final AtomicReference f2106H = new AtomicReference();

    /* renamed from: I */
    private final AtomicReference f2107I = new AtomicReference();

    /* renamed from: J */
    private final AtomicReference f2108J = new AtomicReference();

    /* renamed from: K */
    private final AtomicReference f2109K = new AtomicReference();

    /* renamed from: L */
    private final AtomicReference f2110L = new AtomicReference();

    /* renamed from: M */
    private final AtomicReference f2111M = new AtomicReference();

    /* renamed from: N */
    private final AtomicReference f2112N = new AtomicReference();

    /* renamed from: O */
    private final AtomicReference f2113O = new AtomicReference();

    /* renamed from: P */
    private final AtomicReference f2114P = new AtomicReference();

    /* renamed from: Q */
    private final AtomicReference f2115Q = new AtomicReference();

    /* renamed from: R */
    private final AtomicReference f2116R = new AtomicReference();

    /* renamed from: S */
    private final AtomicReference f2117S = new AtomicReference();

    /* renamed from: T */
    private final AtomicReference f2118T = new AtomicReference();

    /* renamed from: U */
    private final AtomicReference f2119U = new AtomicReference();

    /* renamed from: V */
    private final AtomicReference f2120V = new AtomicReference();

    /* renamed from: W */
    private final AtomicReference f2121W = new AtomicReference();

    /* renamed from: X */
    private final AtomicReference f2122X = new AtomicReference();

    /* renamed from: Y */
    private final AtomicReference f2123Y = new AtomicReference();

    /* renamed from: Z */
    private final AtomicReference f2124Z = new AtomicReference();

    /* renamed from: a0 */
    private final AtomicReference f2126a0 = new AtomicReference();

    /* renamed from: b0 */
    private final AtomicReference f2128b0 = new AtomicReference();

    /* renamed from: c0 */
    private final AtomicReference f2130c0 = new AtomicReference();

    /* renamed from: d0 */
    private final AtomicReference f2132d0 = new AtomicReference();

    /* renamed from: e0 */
    private final AtomicReference f2134e0 = new AtomicReference();

    /* renamed from: f0 */
    private final AtomicReference f2136f0 = new AtomicReference();

    /* renamed from: g0 */
    private final AtomicReference f2138g0 = new AtomicReference();

    /* renamed from: h0 */
    private final AtomicReference f2140h0 = new AtomicReference();

    /* renamed from: i0 */
    private final AtomicReference f2142i0 = new AtomicReference();

    /* renamed from: k0 */
    private final AtomicReference f2146k0 = new AtomicReference();

    /* renamed from: m0 */
    private final Object f2150m0 = new Object();

    /* renamed from: n0 */
    private final AtomicBoolean f2152n0 = new AtomicBoolean(true);

    /* renamed from: o0 */
    private final AtomicBoolean f2154o0 = new AtomicBoolean();

    /* renamed from: p0 */
    private final AtomicBoolean f2156p0 = new AtomicBoolean();

    /* renamed from: r0 */
    private boolean f2160r0 = false;

    /* renamed from: s0 */
    private boolean f2162s0 = false;

    /* renamed from: t0 */
    private boolean f2164t0 = false;

    /* renamed from: u0 */
    private int f2166u0 = 0;

    /* renamed from: x0 */
    private final Object f2172x0 = new Object();

    /* renamed from: y0 */
    private SdkConfigurationImpl f2174y0 = new SdkConfigurationImpl(this);

    /* renamed from: B0 */
    private final AbstractRunnableC1036g5 f2099B0 = new C1156p6(this, true, "scheduleAdLoadIntegrationError", new OooOO0(2, this));

    /* renamed from: C0 */
    private final AbstractRunnableC1036g5 f2101C0 = new C1156p6(this, true, "sdkInit", new OooOO0(3, this));

    /* renamed from: com.applovin.impl.sdk.k$a */
    public class a implements C1180r5.b {
        public a() {
        }

        @Override // com.applovin.impl.C1180r5.b
        /* renamed from: a */
        public void mo2345a(JSONObject jSONObject) {
            boolean zIsValid = JsonUtils.isValid(jSONObject);
            C1220k.this.m2816c(jSONObject);
            if (((Boolean) C1220k.this.m2866a(AbstractC1144o3.f1625V7)).booleanValue()) {
                C1220k c1220k = C1220k.this;
                c1220k.f2144j0 = new C1126e(c1220k);
            }
            C1220k.this.m2909m().m2753a();
            AbstractC1175r0.m2290a(jSONObject, zIsValid, C1220k.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            C1220k.this.m2856U().m1493a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            C1220k.this.m2832E().m2154b();
            C1220k c1220k2 = C1220k.this;
            c1220k2.f2148l0 = c1220k2.m2801a(jSONObject);
            if (zIsValid) {
                C1220k.this.f2174y0.setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            C1220k.this.m2922t0().m491a(jSONObject);
            C1220k.this.m2811b(jSONObject);
            AbstractC1168q2.m2223b(((Boolean) C1220k.this.m2866a(C1268v4.f2826k6)).booleanValue());
            AbstractC1168q2.m2192a(((Boolean) C1220k.this.m2866a(C1268v4.f2834l6)).booleanValue());
            C1220k.this.m2790R0();
            if (!((Boolean) C1220k.this.m2866a(C1268v4.f2749b3)).booleanValue() || zIsValid || !AbstractC1175r0.m2293a(C1220k.m2824o())) {
                C1220k.this.m2789P0();
                return;
            }
            C1220k.this.m2847O();
            if (C1240o.m3200a()) {
                C1220k.this.m2847O().m3215d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            C1220k.this.m2791U0();
        }
    }

    /* renamed from: com.applovin.impl.sdk.k$b */
    public class b implements C1246t0.c {
        public b() {
        }

        @Override // com.applovin.impl.C1246t0.c
        /* renamed from: a */
        public void mo63a(C1246t0.b bVar) {
            C1220k.this.m2847O();
            if (C1240o.m3200a()) {
                C1220k.this.m2847O().m3211a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            C1220k.this.f2156p0.set(bVar.m3292b());
            if (!bVar.m3291a()) {
                C1220k.this.m2815c("Initializing SDK in MAX environment...");
                return;
            }
            C1220k.this.m2847O();
            if (C1240o.m3200a()) {
                C1220k.this.m2847O().m3211a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            C1220k.this.m2855T0();
            C1220k.this.m2853S0();
        }
    }

    /* renamed from: com.applovin.impl.sdk.k$c */
    public class c implements C1180r5.b {
        public c() {
        }

        @Override // com.applovin.impl.C1180r5.b
        /* renamed from: a */
        public void mo2345a(JSONObject jSONObject) {
            C1220k.this.m2816c(jSONObject);
            C1220k.this.f2141i.set(false);
            C1220k.this.m2789P0();
        }
    }

    /* renamed from: com.applovin.impl.sdk.k$d */
    public class d implements C1267v3.a {

        /* renamed from: a */
        final /* synthetic */ C1267v3 f2180a;

        public d(C1267v3 c1267v3) {
            this.f2180a = c1267v3;
        }

        @Override // com.applovin.impl.C1267v3.a
        /* renamed from: a */
        public void mo2935a() {
            C1220k.this.m2847O();
            if (C1240o.m3200a()) {
                C1220k.this.m2847O().m3215d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (C1220k.this.f2150m0) {
                try {
                    if (!C1220k.this.f2158q0) {
                        C1220k.this.m2855T0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f2180a.m3547b(this);
        }

        @Override // com.applovin.impl.C1267v3.a
        /* renamed from: b */
        public void mo2936b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new OooOo0o.OooO(1));
            f2093H0 = true;
        } catch (Throwable unused) {
            f2093H0 = false;
        }
    }

    public C1220k(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.f2158q0 = false;
        f2089D0 = this;
        this.f2143j = appLovinSdkSettings;
        this.f2131d = System.currentTimeMillis();
        this.f2158q0 = true;
        if (!m2783G0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://developers.applovin.com/en/android/overview/integration");
        }
        f2090E0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.f2129c = new WeakReference((Activity) context);
        }
    }

    /* renamed from: B0 */
    private void m2782B0() {
        Context context = f2090E0;
        C1240o c1240oM2847O = m2847O();
        C1295y4 c1295y4M2916q0 = m2916q0();
        C1246t0 c1246t0M2931y = m2931y();
        m2793a(context);
        m2911n0();
        m2903j();
        m2913p();
        m2891c0();
        m2852S().m1774a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.m2462a(this);
        String str = this.f2125a;
        if (str == null || str.length() != 86) {
            C1240o.m3207h("AppLovinSdk", "SDK key provided is invalid (" + this.f2125a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.f2127b) && this.f2127b.length() != 36) {
            String strOooOOOo = OooOo.OooOOOo(new StringBuilder("Axon event key length "), this.f2127b, " is invalid - expected 36");
            if (AbstractC1078k7.m1228c(this)) {
                throw new IllegalArgumentException(strOooOOOo);
            }
            C1240o.m3207h("AppLovinSdk", strOooOOOo);
        }
        if (c1246t0M2931y.m3286l()) {
            String str2 = "Terms Flow has been replaced. " + c1246t0M2931y.m3281g();
            if (AbstractC1078k7.m1228c(this)) {
                throw new IllegalStateException(str2);
            }
            C1240o.m3207h("AppLovinSdk", str2);
        }
        if (AbstractC1078k7.m1249i()) {
            C1240o.m3207h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!AbstractC1078k7.m1218b(this)) {
            C1240o.m3207h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (AbstractC1078k7.m1255m(context)) {
            this.f2143j.setVerboseLogging(true);
        }
        m2914p0().m3609a(C1268v4.f2819k, Boolean.valueOf(this.f2143j.isVerboseLoggingEnabled()));
        AbstractC1249t3.m3331e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C1286x4 c1286x4 = C1286x4.f3048c;
        if (TextUtils.isEmpty((String) c1295y4M2916q0.m3796a(c1286x4, (Object) null, defaultSharedPreferences))) {
            this.f2162s0 = true;
            c1295y4M2916q0.m3802b(c1286x4, Boolean.toString(true), defaultSharedPreferences);
        } else {
            c1295y4M2916q0.m3802b(c1286x4, Boolean.toString(false), defaultSharedPreferences);
        }
        C1286x4 c1286x42 = C1286x4.f3049d;
        if (((Boolean) c1295y4M2916q0.m3795a(c1286x42, Boolean.FALSE)).booleanValue()) {
            if (C1240o.m3200a()) {
                c1240oM2847O.m3211a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.f2164t0 = true;
        } else {
            if (C1240o.m3200a()) {
                c1240oM2847O.m3211a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            c1295y4M2916q0.m3801b(c1286x42, Boolean.TRUE);
            c1295y4M2916q0.m3801b(C1286x4.f3064s, Boolean.valueOf(c1246t0M2931y.m3284j()));
        }
        C1286x4 c1286x43 = C1286x4.f3050e;
        this.f2135f = ((Long) c1295y4M2916q0.m3795a(c1286x43, 0L)).longValue() + 1;
        m2916q0().m3801b(c1286x43, Long.valueOf(this.f2135f));
        C1286x4 c1286x44 = C1286x4.f3051f;
        this.f2137g = (Long) c1295y4M2916q0.m3795a(c1286x44, null);
        m2916q0().m3801b(c1286x44, Long.valueOf(f2092G0));
        C1286x4 c1286x45 = C1286x4.f3052g;
        String str3 = (String) c1295y4M2916q0.m3795a(c1286x45, null);
        if (StringUtils.isValidString(str3)) {
            if (AppLovinSdk.VERSION_CODE > AbstractC1078k7.m1243g(str3)) {
                c1295y4M2916q0.m3801b(c1286x45, AppLovinSdk.VERSION);
            }
        } else {
            c1295y4M2916q0.m3801b(c1286x45, AppLovinSdk.VERSION);
        }
        m2928w0().m576d(C0993c2.f511e, CollectionUtils.map("details", "isInitProviderContextSet=" + f2091F0));
    }

    /* renamed from: G0 */
    public static boolean m2783G0() {
        return f2093H0;
    }

    /* renamed from: J0 */
    public /* synthetic */ void m2784J0() {
        if (m2918r0().m414g()) {
            return;
        }
        m2847O();
        if (C1240o.m3200a()) {
            m2847O().m3211a("AppLovinSdk", "Timing out adapters init...");
        }
        m2918r0().m415h();
        m2886b(true);
    }

    /* renamed from: K0 */
    public /* synthetic */ void m2785K0() {
        C0987b6 c0987b6M2918r0 = m2918r0();
        int i = this.f2166u0 + 1;
        this.f2166u0 = i;
        c0987b6M2918r0.m403a((AbstractRunnableC1036g5) new C1180r5(i, this, new c()), C0987b6.b.CORE);
    }

    /* renamed from: L0 */
    public /* synthetic */ void m2786L0() {
        if (m2838H0()) {
            AbstractC1063j2.m1038b(this);
        }
    }

    /* renamed from: M0 */
    public /* synthetic */ void m2787M0() {
        synchronized (this.f2150m0) {
            try {
                boolean zM2293a = AbstractC1175r0.m2293a(m2824o());
                if (!m2838H0()) {
                    m2847O();
                    if (C1240o.m3200a()) {
                        m2847O().m3211a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + m2857V());
                    }
                }
                if (!((Boolean) m2866a(C1268v4.f2758c3)).booleanValue() || zM2293a) {
                    m2855T0();
                }
                if (((Boolean) m2866a(C1268v4.f2749b3)).booleanValue() && !zM2293a) {
                    m2847O();
                    if (C1240o.m3200a()) {
                        m2847O().m3215d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    m2791U0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: O0 */
    private C1243r m2788O0() {
        if (!AbstractC1145o4.m2012f(f2090E0)) {
            return null;
        }
        try {
            return new C1243r(this);
        } catch (Throwable th) {
            C1240o.m3202b("AppLovinSdk", "Failed to initialize Privacy Sandbox Service", th);
            return null;
        }
    }

    /* renamed from: P0 */
    public void m2789P0() {
        Long l = (Long) m2866a(C1268v4.f2823k3);
        if (l.longValue() >= 0 && this.f2141i.compareAndSet(false, true)) {
            C1019e8.m696a(l.longValue(), false, this, new OooOO0(1, this));
        }
    }

    /* renamed from: R0 */
    public void m2790R0() {
        if (!m2838H0()) {
            m2815c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.f2154o0.compareAndSet(false, true)) {
            m2815c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!m2931y().m3284j()) {
            m2815c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            m2931y().m3276a(m2926v0(), new b());
        }
    }

    /* renamed from: U0 */
    public void m2791U0() {
        C1267v3 c1267v3M2891c0 = m2891c0();
        c1267v3M2891c0.m3546a(new d(c1267v3M2891c0));
    }

    /* renamed from: W */
    private Map m2792W() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) m2866a(C1268v4.f2784f4)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    /* renamed from: n */
    public static long m2823n() {
        return f2092G0;
    }

    /* renamed from: o */
    public static Context m2824o() {
        return f2090E0;
    }

    /* renamed from: A */
    public C1012e1 m2825A() {
        Object c1012e1 = this.f2120V.get();
        if (c1012e1 == null) {
            synchronized (this.f2120V) {
                try {
                    c1012e1 = this.f2120V.get();
                    if (c1012e1 == null) {
                        c1012e1 = new C1012e1(this);
                        this.f2120V.set(c1012e1);
                    }
                } finally {
                }
            }
        }
        if (c1012e1 == this.f2120V) {
            c1012e1 = null;
        }
        return (C1012e1) c1012e1;
    }

    /* renamed from: A0 */
    public boolean m2826A0() {
        return this.f2164t0;
    }

    /* renamed from: B */
    public C1221l m2827B() {
        Object c1221l = this.f2096A.get();
        if (c1221l == null) {
            synchronized (this.f2096A) {
                try {
                    c1221l = this.f2096A.get();
                    if (c1221l == null) {
                        c1221l = new C1221l(this);
                        this.f2096A.set(c1221l);
                    }
                } finally {
                }
            }
        }
        if (c1221l == this.f2096A) {
            c1221l = null;
        }
        return (C1221l) c1221l;
    }

    /* renamed from: C */
    public C1052i1 m2828C() {
        Object c1052i1 = this.f2103E.get();
        if (c1052i1 == null) {
            synchronized (this.f2103E) {
                try {
                    c1052i1 = this.f2103E.get();
                    if (c1052i1 == null) {
                        c1052i1 = new C1052i1(this);
                        this.f2103E.set(c1052i1);
                    }
                } finally {
                }
            }
        }
        if (c1052i1 == this.f2103E) {
            c1052i1 = null;
        }
        return (C1052i1) c1052i1;
    }

    /* renamed from: C0 */
    public boolean m2829C0() {
        boolean z;
        synchronized (this.f2150m0) {
            z = this.f2160r0;
        }
        return z;
    }

    /* renamed from: D */
    public String m2830D() {
        return this.f2168v0;
    }

    /* renamed from: D0 */
    public boolean m2831D0() {
        return this.f2162s0;
    }

    /* renamed from: E */
    public C1167q1 m2832E() {
        return this.f2165u;
    }

    /* renamed from: E0 */
    public boolean m2833E0() {
        boolean z;
        synchronized (this.f2172x0) {
            z = this.f2170w0 != null;
        }
        return z;
    }

    /* renamed from: F */
    public String m2834F() {
        return m2930x0().m1107d();
    }

    /* renamed from: F0 */
    public boolean m2835F0() {
        boolean z;
        synchronized (this.f2150m0) {
            z = this.f2158q0;
        }
        return z;
    }

    /* renamed from: G */
    public EventServiceImpl m2836G() {
        Object eventServiceImpl = this.f2153o.get();
        if (eventServiceImpl == null) {
            synchronized (this.f2153o) {
                try {
                    eventServiceImpl = this.f2153o.get();
                    if (eventServiceImpl == null) {
                        eventServiceImpl = new EventServiceImpl(this);
                        this.f2153o.set(eventServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (eventServiceImpl == this.f2153o) {
            eventServiceImpl = null;
        }
        return (EventServiceImpl) eventServiceImpl;
    }

    /* renamed from: H */
    public C1222m m2837H() {
        Object c1222m = this.f2106H.get();
        if (c1222m == null) {
            synchronized (this.f2106H) {
                try {
                    c1222m = this.f2106H.get();
                    if (c1222m == null) {
                        c1222m = new C1222m(this);
                        this.f2106H.set(c1222m);
                    }
                } finally {
                }
            }
        }
        if (c1222m == this.f2106H) {
            c1222m = null;
        }
        return (C1222m) c1222m;
    }

    /* renamed from: H0 */
    public boolean m2838H0() {
        return StringUtils.containsIgnoreCase(m2857V(), AppLovinMediationProvider.MAX);
    }

    /* renamed from: I */
    public C1223n m2839I() {
        Object c1223n = this.f2108J.get();
        if (c1223n == null) {
            synchronized (this.f2108J) {
                try {
                    c1223n = this.f2108J.get();
                    if (c1223n == null) {
                        c1223n = new C1223n(this);
                        this.f2108J.set(c1223n);
                    }
                } finally {
                }
            }
        }
        if (c1223n == this.f2108J) {
            c1223n = null;
        }
        return (C1223n) c1223n;
    }

    /* renamed from: I0 */
    public boolean m2840I0() {
        return AbstractC1078k7.m1203a("com.unity3d.player.UnityPlayerActivity");
    }

    /* renamed from: J */
    public Activity m2841J() {
        WeakReference weakReference;
        if (!((Boolean) m2866a(C1268v4.f2912v4)).booleanValue() || (weakReference = this.f2129c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* renamed from: K */
    public AppLovinSdkInitializationConfiguration m2842K() {
        return this.f2170w0;
    }

    /* renamed from: L */
    public long m2843L() {
        return this.f2131d;
    }

    /* renamed from: M */
    public Long m2844M() {
        return this.f2137g;
    }

    /* renamed from: N */
    public long m2845N() {
        return this.f2135f;
    }

    /* renamed from: N0 */
    public void m2846N0() {
        m2886b(false);
    }

    /* renamed from: O */
    public C1240o m2847O() {
        return this.f2159r;
    }

    /* renamed from: P */
    public C1275w2 m2848P() {
        return this.f2163t;
    }

    /* renamed from: Q */
    public C1122d m2849Q() {
        Object c1122d = this.f2142i0.get();
        if (c1122d == null) {
            synchronized (this.f2142i0) {
                try {
                    c1122d = this.f2142i0.get();
                    if (c1122d == null) {
                        c1122d = new C1122d(this);
                        this.f2142i0.set(c1122d);
                    }
                } finally {
                }
            }
        }
        if (c1122d == this.f2142i0) {
            c1122d = null;
        }
        return (C1122d) c1122d;
    }

    /* renamed from: Q0 */
    public void m2850Q0() {
        if (StringUtils.isValidString(this.f2147l)) {
            return;
        }
        this.f2147l = AppLovinMediationProvider.MAX;
    }

    /* renamed from: R */
    public C1126e m2851R() {
        return this.f2144j0;
    }

    /* renamed from: S */
    public C1127f m2852S() {
        Object c1127f = this.f2132d0.get();
        if (c1127f == null) {
            synchronized (this.f2132d0) {
                try {
                    c1127f = this.f2132d0.get();
                    if (c1127f == null) {
                        c1127f = new C1127f(this);
                        this.f2132d0.set(c1127f);
                    }
                } finally {
                }
            }
        }
        if (c1127f == this.f2132d0) {
            c1127f = null;
        }
        return (C1127f) c1127f;
    }

    /* renamed from: S0 */
    public void m2853S0() {
        m2923u().m2768a();
    }

    /* renamed from: T */
    public C1128g m2854T() {
        Object c1128g = this.f2130c0.get();
        if (c1128g == null) {
            synchronized (this.f2130c0) {
                try {
                    c1128g = this.f2130c0.get();
                    if (c1128g == null) {
                        c1128g = new C1128g(this);
                        this.f2130c0.set(c1128g);
                    }
                } finally {
                }
            }
        }
        if (c1128g == this.f2130c0) {
            c1128g = null;
        }
        return (C1128g) c1128g;
    }

    /* renamed from: T0 */
    public void m2855T0() {
        synchronized (this.f2150m0) {
            this.f2158q0 = true;
            m2918r0().m416i();
            m2818d();
        }
    }

    /* renamed from: U */
    public C1094m3 m2856U() {
        Object c1094m3 = this.f2138g0.get();
        if (c1094m3 == null) {
            synchronized (this.f2138g0) {
                try {
                    c1094m3 = this.f2138g0.get();
                    if (c1094m3 == null) {
                        c1094m3 = new C1094m3(this);
                        this.f2138g0.set(c1094m3);
                    }
                } finally {
                }
            }
        }
        if (c1094m3 == this.f2138g0) {
            c1094m3 = null;
        }
        return (C1094m3) c1094m3;
    }

    /* renamed from: V */
    public String m2857V() {
        return this.f2147l;
    }

    /* renamed from: V0 */
    public void m2858V0() {
        C1240o.m3207h("AppLovinSdk", "Resetting SDK state...");
        m2914p0().m3608a();
        m2914p0().m3614e();
        if (this.f2152n0.compareAndSet(true, false)) {
            m2855T0();
        } else {
            this.f2152n0.set(true);
        }
    }

    /* renamed from: W0 */
    public void m2859W0() {
        if (StringUtils.isValidString(this.f2168v0)) {
            return;
        }
        this.f2168v0 = AppLovinMediationProvider.MAX;
        m2847O();
        if (C1240o.m3200a()) {
            m2847O().m3211a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    /* renamed from: X */
    public MediationServiceImpl m2860X() {
        Object mediationServiceImpl = this.f2134e0.get();
        if (mediationServiceImpl == null) {
            synchronized (this.f2134e0) {
                try {
                    mediationServiceImpl = this.f2134e0.get();
                    if (mediationServiceImpl == null) {
                        mediationServiceImpl = new MediationServiceImpl(this);
                        this.f2134e0.set(mediationServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (mediationServiceImpl == this.f2134e0) {
            mediationServiceImpl = null;
        }
        return (MediationServiceImpl) mediationServiceImpl;
    }

    /* renamed from: X0 */
    public void m2861X0() {
        m2933z().m555n();
    }

    /* renamed from: Y */
    public C1178r3 m2862Y() {
        Object c1178r3 = this.f2175z.get();
        if (c1178r3 == null) {
            synchronized (this.f2175z) {
                try {
                    c1178r3 = this.f2175z.get();
                    if (c1178r3 == null) {
                        c1178r3 = new C1178r3(this);
                        this.f2175z.set(c1178r3);
                    }
                } finally {
                }
            }
        }
        if (c1178r3 == this.f2175z) {
            c1178r3 = null;
        }
        return (C1178r3) c1178r3;
    }

    /* renamed from: Y0 */
    public void m2863Y0() {
        m2877a((Map) null);
    }

    /* renamed from: Z */
    public C1187s3 m2864Z() {
        Object c1187s3 = this.f2136f0.get();
        if (c1187s3 == null) {
            synchronized (this.f2136f0) {
                try {
                    c1187s3 = this.f2136f0.get();
                    if (c1187s3 == null) {
                        c1187s3 = new C1187s3();
                        this.f2136f0.set(c1187s3);
                    }
                } finally {
                }
            }
        }
        if (c1187s3 == this.f2136f0) {
            c1187s3 = null;
        }
        return (C1187s3) c1187s3;
    }

    /* renamed from: Z0 */
    public void m2865Z0() {
        if (AppLovinMediationProvider.ADMOB.equalsIgnoreCase(this.f2147l) && ((Boolean) m2866a(C1268v4.f2606J3)).booleanValue()) {
            String str = (String) m2866a(C1268v4.f2598I3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb.append(str2);
            sb.append(".");
            if (str.startsWith(sb.toString())) {
                return;
            }
            String strOooOO0o = OooOo.OooOO0o("Mismatched AdMob adapter (", str, ") and AppLovin SDK (", str2, ") versions detected, which may cause compatibility issues.");
            C1240o.m3207h("AppLovinSdk", strOooOO0o);
            AppLovinSdkUtils.runOnUiThread(true, new OooO0O0(3, this, strOooOO0o));
        }
    }

    /* renamed from: a0 */
    public C1241p m2881a0() {
        Object c1241p = this.f2140h0.get();
        if (c1241p == null) {
            synchronized (this.f2140h0) {
                try {
                    c1241p = this.f2140h0.get();
                    if (c1241p == null) {
                        c1241p = new C1241p(this);
                        this.f2140h0.set(c1241p);
                    }
                } finally {
                }
            }
        }
        if (c1241p == this.f2140h0) {
            c1241p = null;
        }
        return (C1241p) c1241p;
    }

    /* renamed from: b0 */
    public AppLovinNativeAdService m2887b0() {
        Object appLovinNativeAdService = this.f2151n.get();
        if (appLovinNativeAdService == null) {
            synchronized (this.f2151n) {
                try {
                    appLovinNativeAdService = this.f2151n.get();
                    if (appLovinNativeAdService == null) {
                        appLovinNativeAdService = new AppLovinNativeAdService(this);
                        this.f2151n.set(appLovinNativeAdService);
                    }
                } finally {
                }
            }
        }
        if (appLovinNativeAdService == this.f2151n) {
            appLovinNativeAdService = null;
        }
        return (AppLovinNativeAdService) appLovinNativeAdService;
    }

    /* renamed from: c0 */
    public C1267v3 m2891c0() {
        Object c1267v3 = this.f2111M.get();
        if (c1267v3 == null) {
            synchronized (this.f2111M) {
                try {
                    c1267v3 = this.f2111M.get();
                    if (c1267v3 == null) {
                        c1267v3 = new C1267v3(m2824o());
                        this.f2111M.set(c1267v3);
                    }
                } finally {
                }
            }
        }
        if (c1267v3 == this.f2111M) {
            c1267v3 = null;
        }
        return (C1267v3) c1267v3;
    }

    /* renamed from: d0 */
    public C1303z3 m2892d0() {
        Object c1303z3 = this.f2123Y.get();
        if (c1303z3 == null) {
            synchronized (this.f2123Y) {
                try {
                    c1303z3 = this.f2123Y.get();
                    if (c1303z3 == null) {
                        c1303z3 = new C1303z3(this);
                        this.f2123Y.set(c1303z3);
                    }
                } finally {
                }
            }
        }
        if (c1303z3 == this.f2123Y) {
            c1303z3 = null;
        }
        return (C1303z3) c1303z3;
    }

    /* renamed from: e0 */
    public C1035g4 m2894e0() {
        Object c1035g4 = this.f2118T.get();
        if (c1035g4 == null) {
            synchronized (this.f2118T) {
                try {
                    c1035g4 = this.f2118T.get();
                    if (c1035g4 == null) {
                        c1035g4 = new C1035g4(this);
                        this.f2118T.set(c1035g4);
                    }
                } finally {
                }
            }
        }
        if (c1035g4 == this.f2118T) {
            c1035g4 = null;
        }
        return (C1035g4) c1035g4;
    }

    /* renamed from: f0 */
    public C1236b m2896f0() {
        Object c1236b = this.f2126a0.get();
        if (c1236b == null) {
            synchronized (this.f2126a0) {
                try {
                    c1236b = this.f2126a0.get();
                    if (c1236b == null) {
                        c1236b = new C1236b(this);
                        this.f2126a0.set(c1236b);
                    }
                } finally {
                }
            }
        }
        if (c1236b == this.f2126a0) {
            c1236b = null;
        }
        return (C1236b) c1236b;
    }

    /* renamed from: g0 */
    public PostbackServiceImpl m2898g0() {
        Object postbackServiceImpl = this.f2124Z.get();
        if (postbackServiceImpl == null) {
            synchronized (this.f2124Z) {
                try {
                    postbackServiceImpl = this.f2124Z.get();
                    if (postbackServiceImpl == null) {
                        postbackServiceImpl = new PostbackServiceImpl(this);
                        this.f2124Z.set(postbackServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (postbackServiceImpl == this.f2124Z) {
            postbackServiceImpl = null;
        }
        return (PostbackServiceImpl) postbackServiceImpl;
    }

    /* renamed from: h0 */
    public C1243r m2900h0() {
        Object objM2788O0 = this.f2098B.get();
        if (objM2788O0 == null) {
            synchronized (this.f2098B) {
                try {
                    objM2788O0 = this.f2098B.get();
                    if (objM2788O0 == null) {
                        objM2788O0 = m2788O0();
                        if (objM2788O0 == null) {
                            objM2788O0 = this.f2098B;
                        }
                        this.f2098B.set(objM2788O0);
                    }
                } finally {
                }
            }
        }
        if (objM2788O0 == this.f2098B) {
            objM2788O0 = null;
        }
        return (C1243r) objM2788O0;
    }

    /* renamed from: i */
    public C1214e m2901i() {
        Object c1214e = this.f2104F.get();
        if (c1214e == null) {
            synchronized (this.f2104F) {
                try {
                    c1214e = this.f2104F.get();
                    if (c1214e == null) {
                        c1214e = new C1214e(this);
                        this.f2104F.set(c1214e);
                    }
                } finally {
                }
            }
        }
        if (c1214e == this.f2104F) {
            c1214e = null;
        }
        return (C1214e) c1214e;
    }

    /* renamed from: i0 */
    public String m2902i0() {
        return m2930x0().m1101a();
    }

    /* renamed from: j */
    public C1060j m2903j() {
        Object c1060j = this.f2128b0.get();
        if (c1060j == null) {
            synchronized (this.f2128b0) {
                try {
                    c1060j = this.f2128b0.get();
                    if (c1060j == null) {
                        c1060j = new C1060j(this);
                        this.f2128b0.set(c1060j);
                    }
                } finally {
                }
            }
        }
        if (c1060j == this.f2128b0) {
            c1060j = null;
        }
        return (C1060j) c1060j;
    }

    /* renamed from: j0 */
    public String m2904j0() {
        return this.f2125a;
    }

    /* renamed from: k */
    public AppLovinAdServiceImpl m2905k() {
        Object appLovinAdServiceImpl = this.f2149m.get();
        if (appLovinAdServiceImpl == null) {
            synchronized (this.f2149m) {
                try {
                    appLovinAdServiceImpl = this.f2149m.get();
                    if (appLovinAdServiceImpl == null) {
                        appLovinAdServiceImpl = new AppLovinAdServiceImpl(this);
                        this.f2149m.set(appLovinAdServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (appLovinAdServiceImpl == this.f2149m) {
            appLovinAdServiceImpl = null;
        }
        return (AppLovinAdServiceImpl) appLovinAdServiceImpl;
    }

    /* renamed from: k0 */
    public MaxSegmentCollectionImpl m2906k0() {
        return (MaxSegmentCollectionImpl) this.f2145k;
    }

    /* renamed from: l */
    public C1216g m2907l() {
        Object c1216g = this.f2109K.get();
        if (c1216g == null) {
            synchronized (this.f2109K) {
                try {
                    c1216g = this.f2109K.get();
                    if (c1216g == null) {
                        c1216g = new C1216g(this);
                        this.f2109K.set(c1216g);
                    }
                } finally {
                }
            }
        }
        if (c1216g == this.f2109K) {
            c1216g = null;
        }
        return (C1216g) c1216g;
    }

    /* renamed from: l0 */
    public Map m2908l0() {
        MaxSegmentCollectionImpl maxSegmentCollectionImplM2906k0 = m2906k0();
        if (maxSegmentCollectionImplM2906k0 == null) {
            return null;
        }
        return maxSegmentCollectionImplM2906k0.getJsonData();
    }

    /* renamed from: m */
    public C1217h m2909m() {
        Object c1217h = this.f2122X.get();
        if (c1217h == null) {
            synchronized (this.f2122X) {
                try {
                    c1217h = this.f2122X.get();
                    if (c1217h == null) {
                        c1217h = new C1217h(this);
                        this.f2122X.set(c1217h);
                    }
                } finally {
                }
            }
        }
        if (c1217h == this.f2122X) {
            c1217h = null;
        }
        return (C1217h) c1217h;
    }

    /* renamed from: m0 */
    public C1259u4 m2910m0() {
        Object c1259u4 = this.f2113O.get();
        if (c1259u4 == null) {
            synchronized (this.f2113O) {
                try {
                    c1259u4 = this.f2113O.get();
                    if (c1259u4 == null) {
                        c1259u4 = new C1259u4(this);
                        this.f2113O.set(c1259u4);
                    }
                } finally {
                }
            }
        }
        if (c1259u4 == this.f2113O) {
            c1259u4 = null;
        }
        return (C1259u4) c1259u4;
    }

    /* renamed from: n0 */
    public SessionTracker m2911n0() {
        Object sessionTracker = this.f2107I.get();
        if (sessionTracker == null) {
            synchronized (this.f2107I) {
                try {
                    sessionTracker = this.f2107I.get();
                    if (sessionTracker == null) {
                        sessionTracker = new SessionTracker(this);
                        this.f2107I.set(sessionTracker);
                    }
                } finally {
                }
            }
        }
        if (sessionTracker == this.f2107I) {
            sessionTracker = null;
        }
        return (SessionTracker) sessionTracker;
    }

    /* renamed from: o0 */
    public AppLovinSdkSettings m2912o0() {
        return this.f2143j;
    }

    /* renamed from: p */
    public ArrayService m2913p() {
        Object arrayService = this.f2119U.get();
        if (arrayService == null) {
            synchronized (this.f2119U) {
                try {
                    arrayService = this.f2119U.get();
                    if (arrayService == null) {
                        arrayService = new ArrayService(this);
                        this.f2119U.set(arrayService);
                    }
                } finally {
                }
            }
        }
        if (arrayService == this.f2119U) {
            arrayService = null;
        }
        return (ArrayService) arrayService;
    }

    /* renamed from: p0 */
    public C1277w4 m2914p0() {
        Object c1277w4 = this.f2171x.get();
        if (c1277w4 == null) {
            synchronized (this.f2171x) {
                try {
                    c1277w4 = this.f2171x.get();
                    if (c1277w4 == null) {
                        c1277w4 = new C1277w4(this);
                        this.f2171x.set(c1277w4);
                    }
                } finally {
                }
            }
        }
        if (c1277w4 == this.f2171x) {
            c1277w4 = null;
        }
        return (C1277w4) c1277w4;
    }

    /* renamed from: q */
    public C1218i m2915q() {
        Object c1218i = this.f2114P.get();
        if (c1218i == null) {
            synchronized (this.f2114P) {
                try {
                    c1218i = this.f2114P.get();
                    if (c1218i == null) {
                        c1218i = new C1218i(this);
                        this.f2114P.set(c1218i);
                    }
                } finally {
                }
            }
        }
        if (c1218i == this.f2114P) {
            c1218i = null;
        }
        return (C1218i) c1218i;
    }

    /* renamed from: q0 */
    public C1295y4 m2916q0() {
        Object c1295y4 = this.f2100C.get();
        if (c1295y4 == null) {
            synchronized (this.f2100C) {
                try {
                    c1295y4 = this.f2100C.get();
                    if (c1295y4 == null) {
                        c1295y4 = new C1295y4(this);
                        this.f2100C.set(c1295y4);
                    }
                } finally {
                }
            }
        }
        if (c1295y4 == this.f2100C) {
            c1295y4 = null;
        }
        return (C1295y4) c1295y4;
    }

    /* renamed from: r */
    public String m2917r() {
        return this.f2127b;
    }

    /* renamed from: r0 */
    public C0987b6 m2918r0() {
        Object c0987b6 = this.f2169w.get();
        if (c0987b6 == null) {
            synchronized (this.f2169w) {
                try {
                    c0987b6 = this.f2169w.get();
                    if (c0987b6 == null) {
                        c0987b6 = new C0987b6(this);
                        this.f2169w.set(c0987b6);
                    }
                } finally {
                }
            }
        }
        if (c0987b6 == this.f2169w) {
            c0987b6 = null;
        }
        return (C0987b6) c0987b6;
    }

    /* renamed from: s */
    public String m2919s() {
        return m2930x0().m1103b();
    }

    /* renamed from: s0 */
    public SharedPreferencesOnSharedPreferenceChangeListenerC1279w6 m2920s0() {
        Object sharedPreferencesOnSharedPreferenceChangeListenerC1279w6 = this.f2116R.get();
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1279w6 == null) {
            synchronized (this.f2116R) {
                try {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1279w6 = this.f2116R.get();
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1279w6 == null) {
                        sharedPreferencesOnSharedPreferenceChangeListenerC1279w6 = new SharedPreferencesOnSharedPreferenceChangeListenerC1279w6(this);
                        this.f2116R.set(sharedPreferencesOnSharedPreferenceChangeListenerC1279w6);
                    }
                } finally {
                }
            }
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1279w6 == this.f2116R) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1279w6 = null;
        }
        return (SharedPreferencesOnSharedPreferenceChangeListenerC1279w6) sharedPreferencesOnSharedPreferenceChangeListenerC1279w6;
    }

    /* renamed from: t */
    public CmpServiceImpl m2921t() {
        Object cmpServiceImpl = this.f2155p.get();
        if (cmpServiceImpl == null) {
            synchronized (this.f2155p) {
                try {
                    cmpServiceImpl = this.f2155p.get();
                    if (cmpServiceImpl == null) {
                        cmpServiceImpl = new CmpServiceImpl(this);
                        this.f2155p.set(cmpServiceImpl);
                    }
                } finally {
                }
            }
        }
        if (cmpServiceImpl == this.f2155p) {
            cmpServiceImpl = null;
        }
        return (CmpServiceImpl) cmpServiceImpl;
    }

    /* renamed from: t0 */
    public C0998c7 m2922t0() {
        Object c0998c7 = this.f2146k0.get();
        if (c0998c7 == null) {
            synchronized (this.f2146k0) {
                try {
                    c0998c7 = this.f2146k0.get();
                    if (c0998c7 == null) {
                        c0998c7 = new C0998c7(this);
                        this.f2146k0.set(c0998c7);
                    }
                } finally {
                }
            }
        }
        if (c0998c7 == this.f2146k0) {
            c0998c7 = null;
        }
        return (C0998c7) c0998c7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CoreSdk{sdkKey='");
        sb.append(this.f2125a);
        sb.append("', enabled=");
        sb.append(this.f2160r0);
        sb.append(", isFirstSession=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f2162s0, '}');
    }

    /* renamed from: u */
    public C1219j m2923u() {
        Object c1219j = this.f2112N.get();
        if (c1219j == null) {
            synchronized (this.f2112N) {
                try {
                    c1219j = this.f2112N.get();
                    if (c1219j == null) {
                        c1219j = new C1219j(this);
                        this.f2112N.set(c1219j);
                    }
                } finally {
                }
            }
        }
        if (c1219j == this.f2112N) {
            c1219j = null;
        }
        return (C1219j) c1219j;
    }

    /* renamed from: u0 */
    public long m2924u0() {
        if (this.f2139h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.f2139h;
    }

    /* renamed from: v */
    public String m2925v() {
        return m2930x0().m1105c();
    }

    /* renamed from: v0 */
    public Activity m2926v0() {
        Activity activityM439b = m2793a(m2824o()).m439b();
        return activityM439b != null ? activityM439b : m2841J();
    }

    /* renamed from: w */
    public SdkConfigurationImpl m2927w() {
        return this.f2174y0;
    }

    /* renamed from: w0 */
    public C1058i7 m2928w0() {
        return this.f2167v;
    }

    /* renamed from: x */
    public C1166q0 m2929x() {
        Object c1166q0 = this.f2173y.get();
        if (c1166q0 == null) {
            synchronized (this.f2173y) {
                try {
                    c1166q0 = this.f2173y.get();
                    if (c1166q0 == null) {
                        c1166q0 = new C1166q0(this);
                        this.f2173y.set(c1166q0);
                    }
                } finally {
                }
            }
        }
        if (c1166q0 == this.f2173y) {
            c1166q0 = null;
        }
        return (C1166q0) c1166q0;
    }

    /* renamed from: x0 */
    public C1068j7 m2930x0() {
        Object c1068j7 = this.f2102D.get();
        if (c1068j7 == null) {
            synchronized (this.f2102D) {
                try {
                    c1068j7 = this.f2102D.get();
                    if (c1068j7 == null) {
                        c1068j7 = new C1068j7(this);
                        this.f2102D.set(c1068j7);
                    }
                } finally {
                }
            }
        }
        if (c1068j7 == this.f2102D) {
            c1068j7 = null;
        }
        return (C1068j7) c1068j7;
    }

    /* renamed from: y */
    public C1246t0 m2931y() {
        Object c1246t0 = this.f2115Q.get();
        if (c1246t0 == null) {
            synchronized (this.f2115Q) {
                try {
                    c1246t0 = this.f2115Q.get();
                    if (c1246t0 == null) {
                        c1246t0 = new C1246t0(this);
                        this.f2115Q.set(c1246t0);
                    }
                } finally {
                }
            }
        }
        if (c1246t0 == this.f2115Q) {
            c1246t0 = null;
        }
        return (C1246t0) c1246t0;
    }

    /* renamed from: y0 */
    public C1059i8 m2932y0() {
        Object c1059i8 = this.f2110L.get();
        if (c1059i8 == null) {
            synchronized (this.f2110L) {
                try {
                    c1059i8 = this.f2110L.get();
                    if (c1059i8 == null) {
                        c1059i8 = new C1059i8(this);
                        this.f2110L.set(c1059i8);
                    }
                } finally {
                }
            }
        }
        if (c1059i8 == this.f2110L) {
            c1059i8 = null;
        }
        return (C1059i8) c1059i8;
    }

    /* renamed from: z */
    public C1002d1 m2933z() {
        Object c1002d1 = this.f2117S.get();
        if (c1002d1 == null) {
            synchronized (this.f2117S) {
                try {
                    c1002d1 = this.f2117S.get();
                    if (c1002d1 == null) {
                        c1002d1 = new C1002d1(this);
                        this.f2117S.set(c1002d1);
                    }
                } finally {
                }
            }
        }
        if (c1002d1 == this.f2117S) {
            c1002d1 = null;
        }
        return (C1002d1) c1002d1;
    }

    /* renamed from: z0 */
    public AppLovinSdk m2934z0() {
        return this.f2157q;
    }

    /* renamed from: d */
    private void m2818d() {
        C0987b6 c0987b6M2918r0 = m2918r0();
        int i = this.f2166u0 + 1;
        this.f2166u0 = i;
        c0987b6M2918r0.m403a((AbstractRunnableC1036g5) new C1180r5(i, this, new a()), C0987b6.b.CORE);
    }

    /* renamed from: e */
    public C0990c m2893e() {
        return m2793a(f2090E0);
    }

    /* renamed from: f */
    public C1205a m2895f() {
        Object c1205a = this.f2105G.get();
        if (c1205a == null) {
            synchronized (this.f2105G) {
                try {
                    c1205a = this.f2105G.get();
                    if (c1205a == null) {
                        c1205a = new C1205a(this);
                        this.f2105G.set(c1205a);
                    }
                } finally {
                }
            }
        }
        if (c1205a == this.f2105G) {
            c1205a = null;
        }
        return (C1205a) c1205a;
    }

    /* renamed from: g */
    public C1020f m2897g() {
        return this.f2161s;
    }

    /* renamed from: h */
    public C1213d m2899h() {
        Object c1213d = this.f2121W.get();
        if (c1213d == null) {
            synchronized (this.f2121W) {
                try {
                    c1213d = this.f2121W.get();
                    if (c1213d == null) {
                        c1213d = new C1213d(this);
                        this.f2121W.set(c1213d);
                    }
                } finally {
                }
            }
        }
        if (c1213d == this.f2121W) {
            c1213d = null;
        }
        return (C1213d) c1213d;
    }

    /* renamed from: b */
    public static void m2807b(Context context) {
        if (context == null) {
            return;
        }
        f2090E0 = context.getApplicationContext();
        f2091F0 = true;
    }

    /* renamed from: c */
    public void m2816c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.f2139h = System.currentTimeMillis();
            AbstractC1175r0.m2300c(jSONObject, this);
            AbstractC1175r0.m2298b(jSONObject, this);
            AbstractC1175r0.m2289a(jSONObject, this);
            AbstractC1054i3.m974f(jSONObject, this);
            AbstractC1054i3.m972d(jSONObject, this);
            AbstractC1054i3.m973e(jSONObject, this);
            AbstractC1054i3.m975g(jSONObject, this);
        }
    }

    /* renamed from: b */
    public void m2805a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        m2782B0();
        this.f2143j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            C1240o.m3206g("AppLovinSdk", "Setting plugin version: ".concat(pluginVersion));
            m2914p0().m3609a(C1268v4.f2598I3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) m2866a(C1268v4.f2883s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        C0987b6 c0987b6M2918r0 = m2918r0();
        AbstractRunnableC1036g5 abstractRunnableC1036g5 = this.f2099B0;
        C0987b6.b bVar = C0987b6.b.CORE;
        c0987b6M2918r0.m403a(abstractRunnableC1036g5, bVar);
        m2918r0().m403a(this.f2101C0, bVar);
    }

    /* renamed from: a */
    public void m2874a(AppLovinSdk appLovinSdk) {
        this.f2157q = appLovinSdk;
    }

    /* renamed from: a */
    public static String m2798a(String str) {
        return m2799a(str, (List) null);
    }

    /* renamed from: a */
    public static String m2796a(int i) {
        return m2797a(i, (List) null);
    }

    /* renamed from: a */
    public static String m2799a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context contextM2824o = m2824o();
        return m2797a(contextM2824o.getResources().getIdentifier(str, "string", contextM2824o.getPackageName()), list);
    }

    /* renamed from: c */
    public void m2815c(String str) {
        m2847O();
        if (C1240o.m3200a()) {
            m2847O().m3211a("AppLovinSdk", str);
        }
        m2918r0().m402a(new C0959a6(this));
    }

    /* renamed from: a */
    public static String m2797a(int i, List list) throws Resources.NotFoundException {
        String string = m2824o().getResources().getString(i);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    /* renamed from: b */
    public void m2811b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.EMPTY_LIST).iterator();
        while (it.hasNext()) {
            C1240o.m3207h("AppLovinSdk", (String) it.next());
        }
    }

    /* renamed from: c */
    public void m2889c() {
        synchronized (this.f2150m0) {
            try {
                if (!this.f2158q0 && !this.f2160r0) {
                    m2855T0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static C0990c m2793a(Context context) {
        if (f2094I0 == null) {
            synchronized (f2095J0) {
                try {
                    if (f2094I0 == null) {
                        f2094I0 = new C0990c(context);
                    }
                } finally {
                }
            }
        }
        return f2094I0;
    }

    /* renamed from: b */
    public /* synthetic */ void m2810b(String str) {
        if (!AbstractC1078k7.m1228c(this)) {
            HashMap map = new HashMap();
            map.put("details", AppLovinMediationProvider.ADMOB);
            map.put("error_message", str);
            m2832E().m572a(C0993c2.f474E0, "adapterVersionMismatch", map);
            return;
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: c */
    public List m2888c(C1268v4 c1268v4) {
        return m2914p0().m3612c(c1268v4);
    }

    /* renamed from: c */
    public void m2890c(C1286x4 c1286x4) {
        m2916q0().m3800b(c1286x4);
    }

    /* renamed from: a */
    public void m2875a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.f2172x0) {
            try {
                if (this.f2170w0 != null) {
                    C1240o.m3207h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.f2170w0 + ". Ignoring the provided initialization configuration.");
                    if (!m2829C0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new OooO(this, sdkInitializationListener, 0));
                    return;
                }
                this.f2133e = System.currentTimeMillis();
                this.f2170w0 = appLovinSdkInitializationConfiguration;
                this.f2176z0 = sdkInitializationListener;
                this.f2125a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.f2127b = appLovinSdkInitializationConfiguration.getAxonEventKey();
                this.f2147l = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.f2145k = appLovinSdkInitializationConfiguration.getSegmentCollection();
                AbstractC1078k7.m1189a((Runnable) new OooO0O0(2, this, appLovinSdkInitializationConfiguration));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m2886b(boolean z) {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (m2931y().m3283i() || (sdkInitializationListener = this.f2176z0) == null) {
            return;
        }
        if (m2829C0()) {
            this.f2176z0 = null;
            this.f2097A0 = null;
            m2852S().m1774a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.f2097A0 == sdkInitializationListener) {
                return;
            }
            m2852S().m1774a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) m2866a(C1268v4.f2859p)).booleanValue()) {
                this.f2176z0 = null;
            } else {
                this.f2097A0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", m2829C0());
        JsonUtils.putBoolean(jSONObject, "timeout", z);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.f2156p0.get());
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f2133e;
        HashMap map = new HashMap();
        map.put("duration_ms", String.valueOf(jCurrentTimeMillis));
        map.put("details", jSONObject.toString());
        this.f2167v.m576d(C0993c2.f519i, map);
        AppLovinSdkUtils.runOnUiThreadDelayed(new OooO(this, sdkInitializationListener, 1), Math.max(0L, ((Long) m2866a(C1268v4.f2867q)).longValue()));
    }

    /* renamed from: a */
    public /* synthetic */ void m2804a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.f2174y0);
    }

    /* renamed from: a */
    public List m2801a(JSONObject jSONObject) {
        List listAsList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            MaxAdFormat fromString = MaxAdFormat.formatFromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public /* synthetic */ void m2808b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        m2847O();
        if (C1240o.m3200a()) {
            m2847O().m3211a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.f2174y0);
    }

    /* renamed from: a */
    public void m2878a(boolean z) {
        synchronized (this.f2150m0) {
            this.f2158q0 = false;
            this.f2160r0 = z;
        }
        if (z) {
            List listM3319a = AbstractC1249t3.m3319a(this);
            if (listM3319a.isEmpty()) {
                m2918r0().m415h();
                m2846N0();
                return;
            }
            Long l = (Long) m2866a(AbstractC1144o3.f1637f7);
            C1156p6 c1156p6 = new C1156p6(this, true, "timeoutInitAdapters", new OooOO0(0, this));
            m2847O();
            if (C1240o.m3200a()) {
                m2847O().m3211a("AppLovinSdk", "Waiting for required adapters to init: " + listM3319a + " - timing out in " + l + "ms...");
            }
            m2918r0().m405a(c1156p6, C0987b6.b.TIMEOUT, l.longValue(), true);
        }
    }

    /* renamed from: b */
    public List m2884b(C1268v4 c1268v4) {
        return m2914p0().m3611b(c1268v4);
    }

    /* renamed from: b */
    public void m2885b(C1286x4 c1286x4, Object obj) {
        m2916q0().m3801b(c1286x4, obj);
    }

    /* renamed from: b */
    public Object m2882b(C1286x4 c1286x4) {
        return m2916q0().m3794a(c1286x4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x006d, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0079, code lost:
    
        if (r12.hasNext() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x007b, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x008b, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x008d, code lost:
    
        r15.f2168v0 = (java.lang.String) r13.getValue();
        m2847O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x009c, code lost:
    
        if (com.applovin.impl.sdk.C1240o.m3200a() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x009e, code lost:
    
        m2847O().m3211a("AppLovinSdk", "Detected mediation provider: " + r15.f2168v0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00bd, code lost:
    
        if (r6.booleanValue() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00bf, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c2, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m2883b() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1220k.m2883b():java.lang.String");
    }

    /* renamed from: a */
    public void m2873a(C1044h3 c1044h3) {
        if (m2918r0().m414g()) {
            return;
        }
        List listM3319a = AbstractC1249t3.m3319a(this);
        if (listM3319a.size() <= 0 || !m2852S().m1771a().containsAll(listM3319a)) {
            return;
        }
        m2847O();
        if (C1240o.m3200a()) {
            m2847O().m3211a("AppLovinSdk", "All required adapters initialized");
        }
        m2918r0().m415h();
        m2846N0();
    }

    /* renamed from: a */
    public boolean m2880a(MaxAdFormat maxAdFormat) {
        List list = this.f2148l0;
        return (list == null || list.size() <= 0 || this.f2148l0.contains(maxAdFormat)) ? false : true;
    }

    /* renamed from: a */
    public void m2870a() {
        String str = (String) m2916q0().m3795a(C1286x4.f3052g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < AbstractC1078k7.m1243g(str)) {
                C1240o.m3207h("AppLovinSdk", androidx.datastore.preferences.protobuf.OooO00o.OooOOO(new StringBuilder("Current version ("), AppLovinSdk.VERSION, ") is older than earlier installed version (", str, "), which may cause compatibility issues."));
            }
        }
    }

    /* renamed from: a */
    public Object m2866a(C1268v4 c1268v4) {
        return m2914p0().m3607a(c1268v4);
    }

    /* renamed from: a */
    public boolean m2879a(C1268v4 c1268v4, MaxAdFormat maxAdFormat) {
        return m2884b(c1268v4).contains(maxAdFormat);
    }

    /* renamed from: a */
    public void m2877a(Map map) {
        m2856U().m1492a(map);
    }

    /* renamed from: a */
    public void m2872a(Uri uri) {
        m2828C().m967a(uri);
    }

    /* renamed from: a */
    public void m2876a(String str, Object obj, SharedPreferences.Editor editor) {
        m2916q0().m3798a(str, obj, editor);
    }

    /* renamed from: a */
    public Object m2867a(C1286x4 c1286x4) {
        return m2868a(c1286x4, (Object) null);
    }

    /* renamed from: a */
    public Object m2868a(C1286x4 c1286x4, Object obj) {
        return m2916q0().m3795a(c1286x4, obj);
    }

    /* renamed from: a */
    public Object m2869a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return C1295y4.m3789a(str, obj, cls, sharedPreferences);
    }

    /* renamed from: a */
    public void m2871a(SharedPreferences sharedPreferences) {
        m2916q0().m3797a(sharedPreferences);
    }
}
