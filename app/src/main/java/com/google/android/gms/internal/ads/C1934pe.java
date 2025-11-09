package com.google.android.gms.internal.ads;

import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3007ch;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pe */
/* loaded from: classes2.dex */
public final class C1934pe {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final List f23326OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f23327OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f23328OooO0OO;

    public C1934pe(JSONObject jSONObject) throws JSONException {
        jSONObject.optString(C3007ch.f7763x);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f23326OooO00o = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        zzv.zzh();
        C2008re.OooO00o("clickurl", jSONObject);
        zzv.zzh();
        C2008re.OooO00o("imp_urls", jSONObject);
        zzv.zzh();
        C2008re.OooO00o("downloaded_imp_urls", jSONObject);
        zzv.zzh();
        C2008re.OooO00o("fill_urls", jSONObject);
        zzv.zzh();
        C2008re.OooO00o("video_start_urls", jSONObject);
        zzv.zzh();
        C2008re.OooO00o("video_complete_urls", jSONObject);
        zzv.zzh();
        C2008re.OooO00o("video_reward_urls", jSONObject);
        jSONObject.optString(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER);
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzv.zzh();
            C2008re.OooO00o("manual_impression_urls", jSONObjectOptJSONObject);
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f23327OooO0O0 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        zzv.zzh();
        C2008re.OooO00o("template_ids", jSONObject);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.f23328OooO0OO = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
