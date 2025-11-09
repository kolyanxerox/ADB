package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* renamed from: com.applovin.impl.a6 */
/* loaded from: classes.dex */
public class C0959a6 extends AbstractRunnableC1036g5 {

    /* renamed from: g */
    private final C1220k f190g;

    public C0959a6(C1220k c1220k) {
        super("TaskInitializeSdk", c1220k, true);
        this.f190g = c1220k;
    }

    /* renamed from: e */
    public /* synthetic */ void m121e() {
        this.f190g.m2852S().m1772a(this.f190g.m2893e().m439b());
    }

    /* renamed from: f */
    private void m122f() {
        if (this.f190g.m2852S().m1777c()) {
            return;
        }
        Activity activityM2926v0 = this.f190g.m2926v0();
        if (activityM2926v0 != null) {
            this.f190g.m2852S().m1772a(activityM2926v0);
            return;
        }
        this.f190g.m2832E().m571a(C0993c2.f534p0, this.f777b + ":maybeInitializeAdapters()");
        this.f190g.m2918r0().m404a(new C1156p6(this.f190g, true, "initializeAdapters", new o0OO00O(this, 3)), C0987b6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }

    /* renamed from: g */
    private void m123g() {
        String str;
        boolean zM3613c = this.f190g.m2914p0().m3613c();
        Map mapM2999o = this.f190g.m2827B().m2999o();
        Map mapM2988K = this.f190g.m2827B().m2988K();
        String strM3413a = zM3613c ? this.f190g.m2827B().m2997f().m3413a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zM3613c) {
            str = mapM2999o.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        C1186s2 c1186s2 = new C1186s2();
        c1186s2.m2361a().m2367a("=====AppLovin SDK=====");
        c1186s2.m2367a("===SDK Versions===").m2368a("Version", AppLovinSdk.VERSION).m2368a("Plugin Version", this.f190g.m2866a(C1268v4.f2598I3)).m2368a("Ad Review Version", C1060j.m1024b()).m2368a("OM SDK Version", this.f190g.m2894e0().m786c());
        c1186s2.m2367a("===Device Info===").m2368a("OS", AbstractC1078k7.m1232d()).m2368a(IronSourceConstants.TYPE_GAID, strM3413a).m2368a("App Set ID", str).m2368a("Model", mapM2999o.get(C3451ne.f10402B)).m2368a("Locale", mapM2999o.get("locale")).m2368a("Emulator", mapM2999o.get("sim")).m2368a("Tablet", mapM2999o.get("is_tablet"));
        c1186s2.m2367a("===App Info===").m2368a("Application ID", mapM2988K.get(C3034d9.h.f8089V)).m2368a("Target SDK", mapM2988K.get("target_sdk"));
        c1186s2.m2367a("===SDK Settings===").m2368a("SDK Key", this.f190g.m2904j0()).m2368a("Mediation Provider", this.f190g.m2857V()).m2368a("TG", C1068j7.m1098a(this.f190g)).m2368a("MD", this.f190g.m2866a(C1268v4.f2891t)).m2368a("Test Mode On", Boolean.valueOf(this.f190g.m2922t0().m493c())).m2368a("Verbose Logging On", Boolean.valueOf(zM3613c));
        c1186s2.m2367a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").m2367a(AbstractC1150p0.m2042a(m791a()));
        c1186s2.m2367a("===MAX Terms and Privcay Policy Flow===");
        C1246t0 c1246t0M2931y = this.f190g.m2931y();
        boolean zM3284j = c1246t0M2931y.m3284j();
        c1186s2.m2368a("Enabled", Boolean.valueOf(zM3284j));
        if (zM3284j) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f190g.m2927w().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyM3278d = c1246t0M2931y.m3278d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            c1186s2.m2368a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (AbstractC1078k7.m1228c(this.f190g)) {
                if (consentFlowUserGeographyM3278d == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = OfficeOpenXMLExtended.SECURITY_NONE;
                }
                c1186s2.m2368a("Debug User Geography", str2);
            }
        }
        c1186s2.m2368a("Privacy Policy URI", c1246t0M2931y.m3280f()).m2368a("Terms of Service URI", c1246t0M2931y.m3282h());
        c1186s2.m2367a("===CMP (CONSENT MANAGEMENT PLATFORM)===").m2367a(this.f190g.m2920s0().m3630i());
        c1186s2.m2361a();
        C1240o.m3206g("AppLovinSdk", c1186s2.toString());
    }

    @Override // java.lang.Runnable
    public void run() {
        C1240o c1240o;
        String str;
        StringBuilder sbOooOo0O;
        String str2 = C3034d9.h.f8131t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1240o.m3200a()) {
            this.f778c.m3211a(this.f777b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f190g.m2837H().m3032b(m791a());
            this.f190g.m2837H().m3037e(m791a());
            this.f190g.m2918r0().m403a((AbstractRunnableC1036g5) new C1046h5(this.f190g), C0987b6.b.OTHER);
            this.f190g.m2827B().m2992U();
            this.f190g.m2910m0().m3400c();
            this.f190g.m2933z().m554l();
            if (AbstractC1078k7.m1228c(this.f190g)) {
                this.f190g.m2870a();
            }
            this.f190g.m2865Z0();
            this.f190g.m2913p().collectAppHubData();
            m123g();
            m122f();
            this.f190g.m2878a(true);
            this.f190g.m2896f0().m3129b();
            this.f190g.m2905k().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f190g.m2866a(C1268v4.f2533A2)).booleanValue()) {
                this.f190g.m2860X().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f190g.m2836G().maybeTrackAppOpenEvent();
            this.f190g.m2825A().m670a();
            if (((Boolean) this.f190g.m2866a(C1268v4.f2637N2)).booleanValue()) {
                this.f190g.m2932y0().m1019b();
            }
            if (((Boolean) this.f190g.m2866a(C1268v4.f2707W0)).booleanValue()) {
                this.f190g.m2899h().m2698b();
            } else {
                this.f190g.m2899h().m2700g();
            }
            if (this.f190g.m2856U().m1495g() || (((Boolean) this.f190g.m2866a(AbstractC1144o3.f1649l7)).booleanValue() && AbstractC1078k7.m1228c(this.f190g) && this.f190g.m2838H0())) {
                this.f190g.m2856U().m1494e();
            }
            if (this.f190g.m2900h0() != null) {
                this.f190g.m2900h0().m3247b((String) this.f190g.m2866a(C1268v4.f2899u));
            }
            this.f190g.m2894e0().m789i();
        } catch (Throwable th) {
            try {
                C1240o.m3204c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.f190g.m2878a(false);
                m793a(th);
                if (((Boolean) this.f190g.m2866a(C1268v4.f2803i)).booleanValue()) {
                    this.f190g.m2896f0().m3126a();
                }
                if (((Boolean) this.f190g.m2866a(C1268v4.f2795h)).booleanValue()) {
                    this.f190g.m2858V0();
                }
                if (this.f190g.m2900h0() != null) {
                    this.f190g.m2900h0().m3247b((String) this.f190g.m2866a(C1268v4.f2899u));
                }
                this.f190g.m2894e0().m789i();
                if (!C1240o.m3200a()) {
                    return;
                }
                c1240o = this.f778c;
                str = this.f777b;
                sbOooOo0O = OooO0oO.OooOo.OooOo0O("AppLovin SDK ");
                sbOooOo0O.append(AppLovinSdk.VERSION);
                sbOooOo0O.append(" initialization ");
                if (this.f190g.m2829C0()) {
                }
            } catch (Throwable th2) {
                if (this.f190g.m2900h0() != null) {
                    this.f190g.m2900h0().m3247b((String) this.f190g.m2866a(C1268v4.f2899u));
                }
                this.f190g.m2894e0().m789i();
                if (C1240o.m3200a()) {
                    C1240o c1240o2 = this.f778c;
                    String str3 = this.f777b;
                    StringBuilder sb = new StringBuilder("AppLovin SDK ");
                    sb.append(AppLovinSdk.VERSION);
                    sb.append(" initialization ");
                    if (this.f190g.m2829C0()) {
                        str2 = "succeeded";
                    }
                    sb.append(str2);
                    sb.append(" in ");
                    sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    androidx.datastore.preferences.protobuf.OooO00o.OooOoo(sb, "ms", c1240o2, str3);
                }
                throw th2;
            }
        }
        if (C1240o.m3200a()) {
            c1240o = this.f778c;
            str = this.f777b;
            sbOooOo0O = OooO0oO.OooOo.OooOo0O("AppLovin SDK ");
            sbOooOo0O.append(AppLovinSdk.VERSION);
            sbOooOo0O.append(" initialization ");
            if (this.f190g.m2829C0()) {
                str2 = "succeeded";
            }
            sbOooOo0O.append(str2);
            sbOooOo0O.append(" in ");
            sbOooOo0O.append(System.currentTimeMillis() - jCurrentTimeMillis);
            androidx.datastore.preferences.protobuf.OooO00o.OooOoo(sbOooOo0O, "ms", c1240o, str);
        }
    }
}
