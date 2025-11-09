package com.applovin.impl.sdk.p005ad;

import android.net.Uri;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.applovin.impl.C1005d4;
import com.applovin.impl.C1026f5;
import com.applovin.impl.InterfaceC1135n4;
import com.applovin.impl.adview.AbstractC0970e;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.a */
/* loaded from: classes.dex */
public final class C1206a extends AbstractC1207b implements InterfaceC1135n4 {

    /* renamed from: n */
    private final String f1979n;

    /* renamed from: o */
    private final String f1980o;

    /* renamed from: p */
    private final String f1981p;

    /* renamed from: q */
    private final C1005d4 f1982q;

    public C1206a(JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        super(jSONObject, jSONObject2, c1220k);
        this.f1979n = m2488s1();
        this.f1980o = m2491w1();
        this.f1981p = m2484v1();
        this.f1982q = new C1005d4(this);
    }

    /* renamed from: a */
    public static C1206a m2482a(JSONObject jSONObject, C1220k c1220k) {
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null) {
            return null;
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, "html", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, MimeTypes.BASE_TYPE_VIDEO, "");
        JsonUtils.putString(jSONObject3, "html", JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, MimeTypes.BASE_TYPE_VIDEO, JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        C1206a c1206a = new C1206a(jSONObject3, jSONObject2, c1220k);
        JSONArray jSONArrayOooOOoo = OooO00o.OooOOoo("cached_ad_html_resources_urls", jSONObject);
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArrayOooOOoo, i, null);
            if (objectAtIndex instanceof String) {
                String str = (String) objectAtIndex;
                if (!TextUtils.isEmpty(str)) {
                    c1206a.m2574a(Uri.parse(str));
                }
            }
        }
        c1206a.m2486d(string);
        if (StringUtils.isValidString(string2)) {
            c1206a.m2485d(Uri.parse(string2));
        }
        return c1206a;
    }

    /* renamed from: t */
    public /* synthetic */ void m2483t(C1026f5 c1026f5) {
        c1026f5.m740b("html", this.f1979n);
        c1026f5.m740b("stream_url", this.f1981p);
    }

    /* renamed from: v1 */
    private String m2484v1() {
        return getStringFromAdObject("stream_url", "");
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: K0 */
    public boolean mo1355K0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: O0 */
    public boolean mo1358O0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: Q0 */
    public void mo1359Q0() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m732a(new OooO00o(this, 0));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f1979n);
            JsonUtils.putString(this.adObject, "stream_url", this.f1981p);
        }
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: S */
    public String mo1360S() {
        return this.f1980o;
    }

    /* renamed from: d */
    public void m2486d(String str) {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m740b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject jSONObjectDeepCopy;
        JSONObject jSONObjectM730a;
        C1026f5 c1026f5 = this.synchronizedFullResponse;
        if (c1026f5 != null) {
            jSONObjectM730a = c1026f5.m730a();
        } else {
            synchronized (this.fullResponseLock) {
                jSONObjectDeepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObjectM730a = jSONObjectDeepCopy;
        }
        JSONArray jSONArrayOooOOoo = OooO00o.OooOOoo("ads", jSONObjectM730a);
        if (jSONArrayOooOOoo.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayOooOOoo, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f1979n);
            JsonUtils.putString(jSONObject, MimeTypes.BASE_TYPE_VIDEO, this.f1980o);
            JsonUtils.putString(jSONObject, "stream_url", this.f1981p);
        }
        return jSONObjectM730a;
    }

    @Override // com.applovin.impl.sdk.p005ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return mo1370v0() != null;
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.m2894e0().m788e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: m */
    public Uri mo1365m() {
        String stringFromAdObject = getStringFromAdObject("click_url", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: m0 */
    public Uri mo1366m0() {
        String stringFromAdObject = getStringFromAdObject("video_click_url", "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : mo1365m();
    }

    /* renamed from: r1 */
    public AbstractC0970e.a m2487r1() {
        return m2571a(getIntFromAdObject("expandable_style", AbstractC0970e.a.INVISIBLE.m277b()));
    }

    /* renamed from: s1 */
    public String m2488s1() {
        return getStringFromAdObject("html", "");
    }

    /* renamed from: t1 */
    public float m2489t1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    /* renamed from: u1 */
    public String m2490u1() {
        return this.f1981p;
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b
    /* renamed from: v0 */
    public Uri mo1370v0() {
        String strM2484v1 = m2484v1();
        if (StringUtils.isValidString(strM2484v1)) {
            return Uri.parse(strM2484v1);
        }
        String strM2491w1 = m2491w1();
        if (StringUtils.isValidString(strM2491w1)) {
            return Uri.parse(strM2491w1);
        }
        return null;
    }

    /* renamed from: w1 */
    public String m2491w1() {
        return getStringFromAdObject(MimeTypes.BASE_TYPE_VIDEO, "");
    }

    /* renamed from: x1 */
    public boolean m2492x1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    /* renamed from: y1 */
    public void m2493y1() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m741c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.p005ad.AbstractC1207b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public C1005d4 getAdEventTracker() {
        return this.f1982q;
    }

    /* renamed from: d */
    public void m2485d(Uri uri) {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            c1026f5.m740b(MimeTypes.BASE_TYPE_VIDEO, uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, MimeTypes.BASE_TYPE_VIDEO, uri.toString());
        }
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.f1979n);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.f1980o);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.f1981p);
        ArrayList arrayList = new ArrayList();
        Iterator it = m2615l().iterator();
        while (it.hasNext()) {
            arrayList.add(((Uri) it.next()).toString());
        }
        JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray((Collection) arrayList));
        C1026f5 c1026f5 = this.synchronizedFullResponse;
        if (c1026f5 != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", c1026f5.m730a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }
}
