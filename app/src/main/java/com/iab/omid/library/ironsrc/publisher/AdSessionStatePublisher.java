package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C2531a;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.internal.C2545g;
import com.iab.omid.library.ironsrc.internal.C2546h;
import com.iab.omid.library.ironsrc.utils.C2556a;
import com.iab.omid.library.ironsrc.utils.C2557b;
import com.iab.omid.library.ironsrc.utils.C2558c;
import com.iab.omid.library.ironsrc.utils.C2561f;
import com.iab.omid.library.ironsrc.weakreference.C2578b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f3649a;

    /* renamed from: b */
    private C2578b f3650b;

    /* renamed from: c */
    private AdEvents f3651c;

    /* renamed from: d */
    private MediaEvents f3652d;

    /* renamed from: e */
    private EnumC2553a f3653e;

    /* renamed from: f */
    private long f3654f;

    /* renamed from: com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher$a */
    public enum EnumC2553a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m4349a();
        this.f3649a = str;
        this.f3650b = new C2578b(null);
    }

    /* renamed from: a */
    public void m4349a() {
        this.f3654f = C2561f.m4410b();
        this.f3653e = EnumC2553a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo4364b() {
        this.f3650b.clear();
    }

    /* renamed from: c */
    public AdEvents m4367c() {
        return this.f3651c;
    }

    /* renamed from: d */
    public MediaEvents m4368d() {
        return this.f3652d;
    }

    /* renamed from: e */
    public boolean m4369e() {
        return this.f3650b.get() != null;
    }

    /* renamed from: f */
    public void m4370f() {
        C2546h.m4311a().m4312a(getWebView(), this.f3649a);
    }

    /* renamed from: g */
    public void m4371g() {
        C2546h.m4311a().m4323b(getWebView(), this.f3649a);
    }

    public WebView getWebView() {
        return this.f3650b.get();
    }

    /* renamed from: h */
    public void m4372h() {
        m4362a((JSONObject) null);
    }

    /* renamed from: i */
    public void mo4373i() {
    }

    /* renamed from: a */
    public void m4350a(float f) {
        C2546h.m4311a().m4313a(getWebView(), this.f3649a, f);
    }

    /* renamed from: b */
    public void m4365b(String str, long j) {
        if (j >= this.f3654f) {
            this.f3653e = EnumC2553a.AD_STATE_VISIBLE;
            C2546h.m4311a().m4324b(getWebView(), this.f3649a, str);
        }
    }

    /* renamed from: a */
    public void m4351a(WebView webView) {
        this.f3650b = new C2578b(webView);
    }

    /* renamed from: b */
    public void m4366b(boolean z) {
        if (m4369e()) {
            C2546h.m4311a().m4315a(getWebView(), this.f3649a, z ? "locked" : "unlocked");
        }
    }

    /* renamed from: a */
    public void m4352a(AdEvents adEvents) {
        this.f3651c = adEvents;
    }

    /* renamed from: a */
    public void m4353a(AdSessionConfiguration adSessionConfiguration) {
        C2546h.m4311a().m4317a(getWebView(), this.f3649a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m4354a(ErrorType errorType, String str) {
        C2546h.m4311a().m4314a(getWebView(), this.f3649a, errorType, str);
    }

    /* renamed from: a */
    public void mo4355a(C2531a c2531a, AdSessionContext adSessionContext) {
        m4356a(c2531a, adSessionContext, null);
    }

    /* renamed from: a */
    public void m4356a(C2531a c2531a, AdSessionContext adSessionContext, JSONObject jSONObject) throws JSONException {
        String adSessionId = c2531a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C2558c.m4390a(jSONObject2, "environment", "app");
        C2558c.m4390a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C2558c.m4390a(jSONObject2, "deviceInfo", C2557b.m4381d());
        C2558c.m4390a(jSONObject2, "deviceCategory", C2556a.m4376a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C2558c.m4390a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C2558c.m4390a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C2558c.m4390a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C2558c.m4390a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C2558c.m4390a(jSONObject4, "libraryVersion", "1.5.2-Ironsrc");
        C2558c.m4390a(jSONObject4, "appId", C2545g.m4308b().m4309a().getApplicationContext().getPackageName());
        C2558c.m4390a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C2558c.m4390a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C2558c.m4390a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C2558c.m4390a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C2546h.m4311a().m4318a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m4357a(MediaEvents mediaEvents) {
        this.f3652d = mediaEvents;
    }

    /* renamed from: a */
    public void m4358a(String str) {
        m4360a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m4359a(String str, long j) {
        if (j >= this.f3654f) {
            EnumC2553a enumC2553a = this.f3653e;
            EnumC2553a enumC2553a2 = EnumC2553a.AD_STATE_NOTVISIBLE;
            if (enumC2553a != enumC2553a2) {
                this.f3653e = enumC2553a2;
                C2546h.m4311a().m4324b(getWebView(), this.f3649a, str);
            }
        }
    }

    /* renamed from: a */
    public void m4360a(String str, @Nullable JSONObject jSONObject) {
        C2546h.m4311a().m4316a(getWebView(), this.f3649a, str, jSONObject);
    }

    /* renamed from: a */
    public void m4361a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C2558c.m4390a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C2546h.m4311a().m4321a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m4362a(@Nullable JSONObject jSONObject) {
        C2546h.m4311a().m4325b(getWebView(), this.f3649a, jSONObject);
    }

    /* renamed from: a */
    public void m4363a(boolean z) {
        if (m4369e()) {
            C2546h.m4311a().m4326c(getWebView(), this.f3649a, z ? "foregrounded" : "backgrounded");
        }
    }
}
