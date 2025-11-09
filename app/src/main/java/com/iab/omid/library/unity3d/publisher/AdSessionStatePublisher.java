package com.iab.omid.library.unity3d.publisher;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.C2580a;
import com.iab.omid.library.unity3d.adsession.ErrorType;
import com.iab.omid.library.unity3d.adsession.VerificationScriptResource;
import com.iab.omid.library.unity3d.adsession.media.MediaEvents;
import com.iab.omid.library.unity3d.internal.C2593f;
import com.iab.omid.library.unity3d.internal.C2594g;
import com.iab.omid.library.unity3d.utils.C2603a;
import com.iab.omid.library.unity3d.utils.C2604b;
import com.iab.omid.library.unity3d.utils.C2605c;
import com.iab.omid.library.unity3d.utils.C2608f;
import com.iab.omid.library.unity3d.weakreference.C2624b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class AdSessionStatePublisher {

    /* renamed from: a */
    private String f3778a;

    /* renamed from: b */
    private C2624b f3779b;

    /* renamed from: c */
    private AdEvents f3780c;

    /* renamed from: d */
    private MediaEvents f3781d;

    /* renamed from: e */
    private EnumC2600a f3782e;

    /* renamed from: f */
    private long f3783f;

    /* renamed from: com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher$a */
    public enum EnumC2600a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m4591a();
        this.f3778a = str;
        this.f3779b = new C2624b(null);
    }

    /* renamed from: a */
    public void m4591a() {
        this.f3783f = C2608f.m4649b();
        this.f3782e = EnumC2600a.AD_STATE_IDLE;
    }

    /* renamed from: b */
    public void mo4606b() {
        this.f3779b.clear();
    }

    /* renamed from: c */
    public AdEvents m4608c() {
        return this.f3780c;
    }

    /* renamed from: d */
    public MediaEvents m4609d() {
        return this.f3781d;
    }

    /* renamed from: e */
    public boolean m4610e() {
        return this.f3779b.get() != null;
    }

    /* renamed from: f */
    public void m4611f() {
        C2594g.m4560a().m4561a(getWebView(), this.f3778a);
    }

    /* renamed from: g */
    public void m4612g() {
        C2594g.m4560a().m4572b(getWebView(), this.f3778a);
    }

    public WebView getWebView() {
        return this.f3779b.get();
    }

    /* renamed from: h */
    public void m4613h() {
        m4604a((JSONObject) null);
    }

    /* renamed from: i */
    public void mo4614i() {
    }

    /* renamed from: a */
    public void m4592a(float f) {
        C2594g.m4560a().m4562a(getWebView(), this.f3778a, f);
    }

    /* renamed from: b */
    public void m4607b(String str, long j) {
        if (j >= this.f3783f) {
            this.f3782e = EnumC2600a.AD_STATE_VISIBLE;
            C2594g.m4560a().m4564a(getWebView(), this.f3778a, str);
        }
    }

    /* renamed from: a */
    public void m4593a(WebView webView) {
        this.f3779b = new C2624b(webView);
    }

    /* renamed from: a */
    public void m4594a(AdEvents adEvents) {
        this.f3780c = adEvents;
    }

    /* renamed from: a */
    public void m4595a(AdSessionConfiguration adSessionConfiguration) {
        C2594g.m4560a().m4566a(getWebView(), this.f3778a, adSessionConfiguration.toJsonObject());
    }

    /* renamed from: a */
    public void m4596a(ErrorType errorType, String str) {
        C2594g.m4560a().m4563a(getWebView(), this.f3778a, errorType, str);
    }

    /* renamed from: a */
    public void mo4597a(C2580a c2580a, AdSessionContext adSessionContext) {
        m4598a(c2580a, adSessionContext, null);
    }

    /* renamed from: a */
    public void m4598a(C2580a c2580a, AdSessionContext adSessionContext, JSONObject jSONObject) throws JSONException {
        String adSessionId = c2580a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C2605c.m4631a(jSONObject2, "environment", "app");
        C2605c.m4631a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C2605c.m4631a(jSONObject2, "deviceInfo", C2604b.m4622d());
        C2605c.m4631a(jSONObject2, "deviceCategory", C2603a.m4617a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C2605c.m4631a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C2605c.m4631a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C2605c.m4631a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C2605c.m4631a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C2605c.m4631a(jSONObject4, "libraryVersion", "1.4.9-Unity3d");
        C2605c.m4631a(jSONObject4, "appId", C2593f.m4557b().m4558a().getApplicationContext().getPackageName());
        C2605c.m4631a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C2605c.m4631a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C2605c.m4631a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C2605c.m4631a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C2594g.m4560a().m4567a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* renamed from: a */
    public void m4599a(MediaEvents mediaEvents) {
        this.f3781d = mediaEvents;
    }

    /* renamed from: a */
    public void m4600a(String str) {
        m4602a(str, (JSONObject) null);
    }

    /* renamed from: a */
    public void m4601a(String str, long j) {
        if (j >= this.f3783f) {
            EnumC2600a enumC2600a = this.f3782e;
            EnumC2600a enumC2600a2 = EnumC2600a.AD_STATE_NOTVISIBLE;
            if (enumC2600a != enumC2600a2) {
                this.f3782e = enumC2600a2;
                C2594g.m4560a().m4564a(getWebView(), this.f3778a, str);
            }
        }
    }

    /* renamed from: a */
    public void m4602a(String str, @Nullable JSONObject jSONObject) {
        C2594g.m4560a().m4565a(getWebView(), this.f3778a, str, jSONObject);
    }

    /* renamed from: a */
    public void m4603a(@NonNull Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C2605c.m4631a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C2594g.m4560a().m4570a(getWebView(), jSONObject);
    }

    /* renamed from: a */
    public void m4604a(@Nullable JSONObject jSONObject) {
        C2594g.m4560a().m4574b(getWebView(), this.f3778a, jSONObject);
    }

    /* renamed from: a */
    public void m4605a(boolean z) {
        if (m4610e()) {
            C2594g.m4560a().m4573b(getWebView(), this.f3778a, z ? "foregrounded" : "backgrounded");
        }
    }
}
