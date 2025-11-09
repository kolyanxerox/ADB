package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import com.ironsource.C3824x4;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.t0 */
/* loaded from: classes.dex */
public class C1246t0 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a */
    private final C1220k f2367a;

    /* renamed from: b */
    private final C1291y0 f2368b;

    /* renamed from: com.applovin.impl.t0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2369a;

        static {
            int[] iArr = new int[AppLovinSdkConfiguration.ConsentFlowUserGeography.values().length];
            f2369a = iArr;
            try {
                iArr[AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2369a[AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2369a[AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.applovin.impl.t0$b */
    public static class b {

        /* renamed from: a */
        private boolean f2370a;

        /* renamed from: b */
        private boolean f2371b;

        /* renamed from: c */
        private boolean f2372c;

        /* renamed from: d */
        private AppLovinCmpError f2373d;

        /* renamed from: e */
        private C1184s0 f2374e;

        public b() {
        }

        /* renamed from: b */
        public boolean m3292b() {
            return this.f2370a;
        }

        /* renamed from: c */
        public void m3293c() {
            this.f2372c = true;
            this.f2370a = true;
        }

        /* renamed from: d */
        public void m3294d() {
            this.f2371b = true;
            this.f2370a = true;
        }

        public b(C1184s0 c1184s0) {
            this.f2374e = c1184s0;
        }

        /* renamed from: a */
        public boolean m3291a() {
            return this.f2372c;
        }

        /* renamed from: a */
        public void m3290a(AppLovinCmpError appLovinCmpError) {
            this.f2373d = appLovinCmpError;
        }

        /* renamed from: a */
        public void m3289a(C1184s0 c1184s0) {
            this.f2374e = c1184s0;
        }
    }

    /* renamed from: com.applovin.impl.t0$c */
    public interface c {
        /* renamed from: a */
        void mo63a(b bVar);
    }

    public C1246t0(C1220k c1220k) {
        this.f2367a = c1220k;
        this.f2368b = new C1291y0(c1220k);
        if (AbstractC1078k7.m1253k(C1220k.m2824o())) {
            AppLovinCommunicator.getInstance(C1220k.m2824o()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    /* renamed from: a */
    public static TermsAndPrivacyPolicyFlowSettingsImpl m3267a(Context context) {
        if (context == null) {
            C1240o.m3207h("ConsentFlowManager", "Failed to get default Terms and Privacy Policy flow settings.");
            return new TermsAndPrivacyPolicyFlowSettingsImpl(false, false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, null, null);
        }
        String strM1167a = AbstractC1078k7.m1167a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (C1220k) null);
        JSONObject jSONObject = JsonUtils.getJSONObject(StringUtils.isValidString(strM1167a) ? JsonUtils.jsonObjectFromJsonString(strM1167a, new JSONObject()) : new JSONObject(), "consent_flow_settings", new JSONObject());
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", bool);
        Boolean bool3 = JsonUtils.getBoolean(jSONObject, "consent_flow_show_terms_and_privacy_policy_alert_in_gdpr", bool);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri uri = URLUtil.isValidUrl(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new TermsAndPrivacyPolicyFlowSettingsImpl(bool2.booleanValue(), bool3.booleanValue(), m3268a(string), URLUtil.isValidUrl(string3) ? Uri.parse(string3) : null, uri);
    }

    /* renamed from: c */
    private TermsAndPrivacyPolicyFlowSettingsImpl m3275c() {
        return (TermsAndPrivacyPolicyFlowSettingsImpl) this.f2367a.m2912o0().getTermsAndPrivacyPolicyFlowSettings();
    }

    /* renamed from: b */
    public JSONObject m3277b() {
        TermsAndPrivacyPolicyFlowSettingsImpl termsAndPrivacyPolicyFlowSettingsImplM3275c = m3275c();
        Uri privacyPolicyUri = termsAndPrivacyPolicyFlowSettingsImplM3275c.getPrivacyPolicyUri();
        Uri termsOfServiceUri = termsAndPrivacyPolicyFlowSettingsImplM3275c.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(m3284j()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    /* renamed from: d */
    public AppLovinSdkConfiguration.ConsentFlowUserGeography m3278d() {
        return m3275c().getDebugUserGeography();
    }

    /* renamed from: e */
    public String m3279e() {
        Object objM3280f = m3280f();
        Object objM3282h = m3282h();
        StringBuilder sb = new StringBuilder("\nConsent Flow Enabled - ");
        sb.append(m3284j());
        sb.append("\nTerms of Service - ");
        if (objM3282h == null) {
            objM3282h = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objM3282h);
        sb.append("\nPrivacy Policy - ");
        if (objM3280f == null) {
            objM3280f = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objM3280f);
        return sb.toString();
    }

    /* renamed from: f */
    public Uri m3280f() {
        return m3275c().getPrivacyPolicyUri();
    }

    /* renamed from: g */
    public String m3281g() {
        return "Migrate to the new Terms and Privacy Policy Flow by following these steps:\n\t1. Delete the 'terms_flow_settings' entry from your 'applovin_settings.xml' file.\n\t2. Follow the integration instructions in our documentation: " + m3266a();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    /* renamed from: h */
    public Uri m3282h() {
        return m3275c().getTermsOfServiceUri();
    }

    /* renamed from: i */
    public boolean m3283i() {
        return this.f2368b.m3710a();
    }

    /* renamed from: j */
    public boolean m3284j() {
        Map<String, String> extraParameters = this.f2367a.m2912o0().getExtraParameters();
        return extraParameters.containsKey("consent_flow_enabled") ? Boolean.parseBoolean(extraParameters.get("consent_flow_enabled")) : m3275c().isEnabled();
    }

    /* renamed from: k */
    public boolean m3285k() {
        if (AbstractC1078k7.m1228c(this.f2367a)) {
            int i = a.f2369a[m3278d().ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
        }
        return this.f2367a.m2927w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
    }

    /* renamed from: l */
    public boolean m3286l() {
        return this.f2367a.m2912o0().getExtraParameters().containsKey("terms_flow_settings");
    }

    /* renamed from: m */
    public boolean m3287m() {
        return m3275c().shouldShowTermsAndPrivacyPolicyAlertInGdpr();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f2368b.m3709a(this.f2367a.m2926v0(), new o000000(this, 4));
    }

    /* renamed from: b */
    private void m3273b(Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new OooO(23, this, activity));
    }

    /* renamed from: b */
    public static /* synthetic */ void m3274b(Uri uri, DialogInterface dialogInterface, int i) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* renamed from: a */
    public void m3276a(Activity activity, c cVar) {
        if (!m3284j()) {
            cVar.mo63a(new b(new C1184s0(C1184s0.f1870c, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
        } else if (m3275c().getPrivacyPolicyUri() == null) {
            m3273b(activity);
        } else {
            this.f2368b.m3709a(activity, new OooO0OO(this, cVar));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m3272a(c cVar, b bVar) {
        if (bVar.f2374e == null) {
            this.f2367a.m2885b(C1286x4.f3064s, Boolean.FALSE);
        }
        cVar.mo63a(bVar);
    }

    /* renamed from: a */
    public /* synthetic */ void m3271a(b bVar) {
        if (bVar.f2374e == null) {
            this.f2367a.m2885b(C1286x4.f3064s, Boolean.FALSE);
        }
        AppLovinCommunicator.getInstance(C1220k.m2824o()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }

    /* renamed from: a */
    private static AppLovinSdkConfiguration.ConsentFlowUserGeography m3268a(String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if (C3824x4.f12569d.equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    /* renamed from: a */
    public /* synthetic */ void m3269a(Activity activity) {
        final Uri uriM3266a = m3266a();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.o000O0o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f15757OooOo0O.m3270a(uriM3266a, dialogInterface, i);
            }
        }).setNegativeButton("DISMISS", new o00000O(uriM3266a, 1)).create().show();
    }

    /* renamed from: a */
    public /* synthetic */ void m3270a(Uri uri, DialogInterface dialogInterface, int i) {
        AbstractC1048h7.m948a(uri, C1220k.m2824o(), this.f2367a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* renamed from: a */
    private Uri m3266a() {
        return Uri.parse((String) this.f2367a.m2866a(this.f2367a.m2840I0() ? C1268v4.f2633M6 : C1268v4.f2625L6));
    }
}
