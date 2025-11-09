package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import com.applovin.impl.sdk.C1240o;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;

/* loaded from: classes.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* renamed from: a */
    private boolean f1758a;

    /* renamed from: b */
    private boolean f1759b;

    /* renamed from: c */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f1760c;

    /* renamed from: d */
    private Uri f1761d;

    /* renamed from: e */
    private Uri f1762e;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z, boolean z2, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.f1758a = z;
        this.f1759b = z2;
        this.f1760c = consentFlowUserGeography;
        this.f1761d = uri;
        this.f1762e = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f1760c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.f1761d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.f1762e;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.f1758a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        C1240o.m3206g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f1760c = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z) {
        C1240o.m3206g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z);
        this.f1758a = z;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        C1240o.m3206g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f1761d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z) {
        C1240o.m3206g("ConsentFlowSettingsImpl", "Setting show Terms and Privacy Policy alert in GDPR: " + z);
        this.f1759b = z;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        C1240o.m3206g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f1762e = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
        return this.f1759b;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f1758a + ", privacyPolicyUri=" + this.f1761d + ", termsOfServiceUri=" + this.f1762e + '}';
    }
}
