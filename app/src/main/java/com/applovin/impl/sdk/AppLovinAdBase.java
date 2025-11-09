package com.applovin.impl.sdk;

import android.graphics.Color;
import com.applovin.impl.AbstractC0995c4;
import com.applovin.impl.C1026f5;
import com.applovin.impl.C1268v4;
import com.applovin.impl.InterfaceC0985b4;
import com.applovin.impl.sdk.array.ArrayDirectDownloadAd;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AppLovinAdBase implements InterfaceC0985b4, ArrayDirectDownloadAd {
    protected final JSONObject adObject;
    private final long createdAtMillis;
    protected final JSONObject fullResponse;
    protected final C1220k sdk;
    protected final C1026f5 synchronizedAdObject;
    protected final C1026f5 synchronizedFullResponse;
    protected final Object adObjectLock = new Object();
    protected final Object fullResponseLock = new Object();

    public AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.sdk = c1220k;
        if (((Boolean) c1220k.m2866a(C1268v4.f2874q6)).booleanValue()) {
            this.synchronizedAdObject = new C1026f5(jSONObject);
            this.synchronizedFullResponse = new C1026f5(jSONObject2);
            this.adObject = null;
            this.fullResponse = null;
        } else {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.synchronizedAdObject = null;
            this.synchronizedFullResponse = null;
        }
        this.createdAtMillis = System.currentTimeMillis();
    }

    public boolean containsKeyForAdObject(String str) {
        boolean zHas;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m735a(str);
        }
        synchronized (this.adObjectLock) {
            zHas = this.adObject.has(str);
        }
        return zHas;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    @Override // com.applovin.impl.InterfaceC0985b4
    public abstract /* synthetic */ AbstractC0995c4 getAdEventTracker();

    public abstract long getAdIdNumber();

    public boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean zBooleanValue;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m725a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            zBooleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return zBooleanValue;
    }

    public boolean getBooleanFromFullResponse(String str, boolean z) {
        boolean zBooleanValue;
        C1026f5 c1026f5 = this.synchronizedFullResponse;
        if (c1026f5 != null) {
            return c1026f5.m725a(str, Boolean.valueOf(z)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            zBooleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z)).booleanValue();
        }
        return zBooleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    public int getColorFromAdObject(String str, int i) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspId() {
        return getStringFromFullResponse("dsp_id", "");
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    public float getFloatFromAdObject(String str, float f) {
        float f2;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m722a(str, f);
        }
        synchronized (this.adObjectLock) {
            f2 = JsonUtils.getFloat(this.adObject, str, f);
        }
        return f2;
    }

    public int getIntFromAdObject(String str, int i) {
        int i2;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m723a(str, i);
        }
        synchronized (this.adObjectLock) {
            i2 = JsonUtils.getInt(this.adObject, str, i);
        }
        return i2;
    }

    public List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m728a(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    public JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m729a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m731a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    public long getLongFromAdObject(String str, long j) {
        long j2;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m724a(str, j);
        }
        synchronized (this.adObjectLock) {
            j2 = JsonUtils.getLong(this.adObject, str, j);
        }
        return j2;
    }

    public long getLongFromFullResponse(String str, long j) {
        long j2;
        C1026f5 c1026f5 = this.synchronizedFullResponse;
        if (c1026f5 != null) {
            return c1026f5.m724a(str, j);
        }
        synchronized (this.fullResponseLock) {
            j2 = JsonUtils.getLong(this.fullResponse, str, j);
        }
        return j2;
    }

    @Override // com.applovin.impl.InterfaceC0985b4
    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    @Override // com.applovin.impl.InterfaceC0985b4
    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    @Override // com.applovin.impl.InterfaceC0985b4
    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    public C1220k getSdk() {
        return this.sdk;
    }

    public String getStringFromAdObject(String str, String str2) {
        String string;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m727a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    public String getStringFromFullResponse(String str, String str2) {
        String string;
        C1026f5 c1026f5 = this.synchronizedFullResponse;
        if (c1026f5 != null) {
            return c1026f5.m727a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    public List<String> getStringListFromAdObject(String str, List<String> list) {
        List<String> stringList;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return c1026f5.m737b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    @Override // com.applovin.impl.InterfaceC0985b4
    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
