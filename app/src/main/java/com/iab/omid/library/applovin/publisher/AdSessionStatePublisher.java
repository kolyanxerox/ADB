package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C2480a;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.C2494g;
import com.iab.omid.library.applovin.internal.C2495h;
import com.iab.omid.library.applovin.utils.C2505a;
import com.iab.omid.library.applovin.utils.C2506b;
import com.iab.omid.library.applovin.utils.C2507c;
import com.iab.omid.library.applovin.utils.C2510f;
import com.iab.omid.library.applovin.weakreference.C2527b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f3514a;

    /* renamed from: b */
    private C2527b f3515b;

    /* renamed from: c */
    private AdEvents f3516c;

    /* renamed from: d */
    private MediaEvents f3517d;

    /* renamed from: e */
    private EnumC2502a f3518e;

    /* renamed from: f */
    private long f3519f;

    /* renamed from: com.iab.omid.library.applovin.publisher.AdSessionStatePublisher$a */
    public enum EnumC2502a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m4096a();
        this.f3514a = str;
        this.f3515b = new C2527b(null);
    }

    /* renamed from: a */
    public void m4096a() {
        this.f3519f = C2510f.m4157b();
        this.f3518e = EnumC2502a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo4111b() {
        this.f3515b.clear();
    }

    /* renamed from: c */
    public AdEvents m4114c() {
        return this.f3516c;
    }

    /* renamed from: d */
    public MediaEvents m4115d() {
        return this.f3517d;
    }

    /* renamed from: e */
    public boolean m4116e() {
        return this.f3515b.get() != null;
    }

    /* renamed from: f */
    public void m4117f() {
        C2495h.m4058a().m4059a(getWebView(), this.f3514a);
    }

    /* renamed from: g */
    public void m4118g() {
        C2495h.m4058a().m4070b(getWebView(), this.f3514a);
    }

    public WebView getWebView() {
        return this.f3515b.get();
    }

    /* renamed from: h */
    public void m4119h() {
        m4109a((JSONObject) null);
    }

    /* renamed from: i */
    public void mo4120i() {
    }

    /* renamed from: a */
    public void m4097a(float f) {
        C2495h.m4058a().m4060a(getWebView(), this.f3514a, f);
    }

    /* renamed from: b */
    public void m4112b(String str, long j) {
        if (j >= this.f3519f) {
            this.f3518e = EnumC2502a.AD_STATE_VISIBLE;
            C2495h.m4058a().m4071b(getWebView(), this.f3514a, str);
        }
    }

    /* renamed from: a */
    public void m4098a(WebView webView) {
        this.f3515b = new C2527b(webView);
    }

    /* renamed from: b */
    public void m4113b(boolean z) {
        if (m4116e()) {
            C2495h.m4058a().m4062a(getWebView(), this.f3514a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m4099a(AdEvents adEvents) {
        this.f3516c = adEvents;
    }

    /* renamed from: a */
    public void m4100a(AdSessionConfiguration adSessionConfiguration) {
        C2495h.m4058a().m4064a(getWebView(), this.f3514a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m4101a(ErrorType errorType, String str) {
        C2495h.m4058a().m4061a(getWebView(), this.f3514a, errorType, str);
    }

    /* renamed from: a */
    public void mo4102a(C2480a c2480a, AdSessionContext adSessionContext) {
        m4103a(c2480a, adSessionContext, null);
    }

    /* renamed from: a */
    public void m4103a(C2480a c2480a, AdSessionContext adSessionContext, JSONObject jSONObject) throws JSONException {
        String strM3986c = c2480a.m3986c();
        JSONObject jSONObject2 = new JSONObject();
        C2507c.m4137a(jSONObject2, "environment", "app");
        C2507c.m4137a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C2507c.m4137a(jSONObject2, "deviceInfo", C2506b.m4128d());
        C2507c.m4137a(jSONObject2, "deviceCategory", C2505a.m4123a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C2507c.m4137a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C2507c.m4137a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C2507c.m4137a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C2507c.m4137a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C2507c.m4137a(jSONObject4, "libraryVersion", "1.5.3-Applovin");
        C2507c.m4137a(jSONObject4, "appId", C2494g.m4055b().m4056a().getApplicationContext().getPackageName());
        C2507c.m4137a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C2507c.m4137a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C2507c.m4137a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C2507c.m4137a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C2495h.m4058a().m4065a(getWebView(), strM3986c, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m4104a(MediaEvents mediaEvents) {
        this.f3517d = mediaEvents;
    }

    /* renamed from: a */
    public void m4105a(String str) {
        m4107a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m4106a(String str, long j) {
        if (j >= this.f3519f) {
            EnumC2502a enumC2502a = this.f3518e;
            EnumC2502a enumC2502a2 = EnumC2502a.AD_STATE_NOTVISIBLE;
            if (enumC2502a != enumC2502a2) {
                this.f3518e = enumC2502a2;
                C2495h.m4058a().m4071b(getWebView(), this.f3514a, str);
            }
        }
    }

    /* renamed from: a */
    public void m4107a(String str, @Nullable JSONObject jSONObject) {
        C2495h.m4058a().m4063a(getWebView(), this.f3514a, str, jSONObject);
    }

    /* renamed from: a */
    public void m4108a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C2507c.m4137a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C2495h.m4058a().m4068a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m4109a(@Nullable JSONObject jSONObject) {
        C2495h.m4058a().m4072b(getWebView(), this.f3514a, jSONObject);
    }

    /* renamed from: a */
    public void m4110a(boolean z) {
        if (m4116e()) {
            C2495h.m4058a().m4073c(getWebView(), this.f3514a, z ? "foregrounded" : "backgrounded");
        }
    }
}
