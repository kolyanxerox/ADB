package com.applovin.impl.privacy.cmp;

import OooO0oO.OooOo;
import OooOo.OooO;
import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1071k0;
import com.applovin.impl.C1268v4;
import com.applovin.impl.o0O0O00;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.HashMap;

/* renamed from: com.applovin.impl.privacy.cmp.a */
/* loaded from: classes.dex */
public class C1164a {

    /* renamed from: a */
    private final C1220k f1754a;

    /* renamed from: b */
    private final C1240o f1755b;

    /* renamed from: c */
    private ConsentForm f1756c;

    /* renamed from: d */
    private int f1757d;

    /* renamed from: com.applovin.impl.privacy.cmp.a$a */
    public interface a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public C1164a(C1220k c1220k) {
        this.f1754a = c1220k;
        this.f1755b = c1220k.m2847O();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(C1220k.m2824o());
        m2106a("Initializing with SDK Version: " + m2113b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    /* renamed from: a */
    public void m2111a() {
        if (this.f1756c != null) {
            this.f1756c = null;
        }
        this.f1757d = 0;
    }

    /* renamed from: b */
    public String m2113b() {
        return null;
    }

    /* renamed from: c */
    public void m2115c() {
        m2106a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(C1220k.m2824o()).reset();
    }

    /* renamed from: d */
    public boolean m2116d() {
        return true;
    }

    /* renamed from: e */
    public boolean m2117e() {
        return true;
    }

    /* renamed from: b */
    public /* synthetic */ void m2107b(a aVar, FormError formError) {
        m2109b("Failed to request consent info with error: " + formError.getMessage());
        aVar.onFlowLoadFailed(m2098a(formError, "Consent info update failed"));
    }

    /* renamed from: c */
    private boolean m2110c(String str) {
        if (!this.f1754a.m2888c(C1268v4.f2657P6).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.f1754a.m2866a(C1268v4.f2649O6);
        return num.intValue() < 0 || this.f1757d < num.intValue();
    }

    /* renamed from: a */
    public void m2112a(Activity activity, C1071k0 c1071k0, a aVar) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (AbstractC1078k7.m1228c(this.f1754a) && c1071k0.m1124a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f1754a.m2912o0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new OooO(this, activity, aVar, 6), new OooO00o(this, aVar));
    }

    /* renamed from: b */
    public void m2114b(Activity activity, final C1071k0 c1071k0, final a aVar) {
        if (this.f1756c == null) {
            m2109b("Failed to show - not ready yet");
            aVar.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            m2106a("Showing consent form...");
            this.f1756c.show(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.applovin.impl.privacy.cmp.OooO0O0
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    this.f15810OooO00o.m2100a(c1071k0, aVar, formError);
                }
            });
        }
    }

    /* renamed from: b */
    public void m2105a(FormError formError, C1071k0 c1071k0, a aVar) {
        m2106a("Retrying to load and show consent form...");
        this.f1757d++;
        UserMessagingPlatform.loadConsentForm(C1220k.m2824o(), new o0O0O00(this, aVar, formError, c1071k0), new OooO(this, aVar, formError, 7));
    }

    /* renamed from: b */
    private void m2109b(String str) {
        if (C1240o.m3200a()) {
            this.f1755b.m3214b("GoogleCmpAdapter", str);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m2099a(Activity activity, a aVar) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean zIsConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        m2106a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + zIsConsentFormAvailable);
        if (!zIsConsentFormAvailable) {
            m2109b("Failed to load form.");
            aVar.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
        } else if (consentStatus != 2) {
            m2109b(OooOo.OooO0o(consentStatus, "Failed to load with consent status: "));
            aVar.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, OooOo.OooO0o(consentStatus, "Consent form not required for consent status: ")));
        } else {
            m2106a("Successfully requested consent info");
            m2106a("Loading consent form...");
            UserMessagingPlatform.loadConsentForm(activity, new OooO00o(this, aVar), new OooO00o(this, aVar));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m2101a(a aVar, ConsentForm consentForm) {
        m2106a("Successfully loaded consent form");
        this.f1756c = consentForm;
        aVar.onFlowLoaded(null);
    }

    /* renamed from: a */
    public /* synthetic */ void m2102a(a aVar, FormError formError) {
        m2109b("Failed to load with error: " + formError.getMessage());
        aVar.onFlowLoadFailed(m2098a(formError, "Consent form load failed"));
    }

    /* renamed from: a */
    public /* synthetic */ void m2100a(C1071k0 c1071k0, a aVar, FormError formError) {
        if (formError != null) {
            String strValueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            HashMap map = new HashMap(2);
            map.put("error_code", strValueOf);
            map.put("error_message", message);
            this.f1754a.m2832E().m572a(C0993c2.f468B0, "googleConsentFormDismissed", map);
            if (m2110c(strValueOf)) {
                m2106a(OooOo.OooOO0("Consent form was dismissed due to error: ", message));
                AppLovinSdkUtils.runOnUiThread(new OooOo0O.OooO0O0(this, formError, c1071k0, aVar, 7));
                return;
            } else {
                m2109b(OooOo.OooOO0("Failed to show with error: ", message));
                aVar.onFlowShowFailed(m2098a(formError, "Consent form show failed"));
                return;
            }
        }
        m2106a("Consent form finished showing");
        aVar.onFlowHidden(null);
    }

    /* renamed from: a */
    public /* synthetic */ void m2103a(a aVar, FormError formError, C1071k0 c1071k0, ConsentForm consentForm) {
        m2106a("Successfully re-loaded consent form");
        this.f1756c = consentForm;
        Activity activityM2926v0 = this.f1754a.m2926v0();
        if (activityM2926v0 == null) {
            aVar.onFlowShowFailed(m2098a(formError, "Consent form show failed"));
        } else {
            m2114b(activityM2926v0, c1071k0, aVar);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m2104a(a aVar, FormError formError, FormError formError2) {
        m2109b("Retry to load failed with error: " + formError2.getMessage());
        aVar.onFlowShowFailed(m2098a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.applovin.impl.privacy.cmp.CmpErrorImpl m2098a(com.google.android.ump.FormError r4, java.lang.String r5) {
        /*
            r3 = this;
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED
            int r1 = r4.getErrorCode()
            r2 = 1
            if (r1 == r2) goto L16
            r2 = 2
            if (r1 == r2) goto L16
            r2 = 3
            if (r1 == r2) goto L13
            r2 = 4
            if (r1 == r2) goto L16
            goto L18
        L13:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR
            goto L18
        L16:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE
        L18:
            com.applovin.impl.privacy.cmp.CmpErrorImpl r1 = new com.applovin.impl.privacy.cmp.CmpErrorImpl
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getMessage()
            r1.<init>(r0, r5, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.privacy.cmp.C1164a.m2098a(com.google.android.ump.FormError, java.lang.String):com.applovin.impl.privacy.cmp.CmpErrorImpl");
    }

    /* renamed from: a */
    private void m2106a(String str) {
        if (C1240o.m3200a()) {
            this.f1755b.m3211a("GoogleCmpAdapter", str);
        }
    }
}
