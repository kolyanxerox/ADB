package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xi */
/* loaded from: classes2.dex */
public final class C2234xi {

    /* renamed from: OooO, reason: collision with root package name */
    public final String f25627OooO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final List f25628OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final String f25629OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final String f25630OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f25631OooO0Oo;

    /* renamed from: OooO0o, reason: collision with root package name */
    public final String f25632OooO0o;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f25633OooO0o0;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public final int f25634OooO0oO;

    /* renamed from: OooO0oo, reason: collision with root package name */
    public final JSONObject f25635OooO0oo;

    /* renamed from: OooOO0, reason: collision with root package name */
    public final long f25636OooOO0;

    /* renamed from: OooOO0O, reason: collision with root package name */
    public final long f25637OooOO0O;

    public C2234xi(JSONObject jSONObject) throws NumberFormatException {
        this.f25632OooO0o = jSONObject.optString("url");
        this.f25629OooO0O0 = jSONObject.optString("base_uri");
        this.f25630OooO0OO = jSONObject.optString("post_parameters");
        String strOptString = jSONObject.optString("drt_include");
        this.f25631OooO0Oo = strOptString != null && (strOptString.equals("1") || strOptString.equals(C3401a.f9920g));
        String strOptString2 = jSONObject.optString("cookies_include", C3401a.f9920g);
        this.f25633OooO0o0 = strOptString2 != null && (strOptString2.equals("1") || strOptString2.equals(C3401a.f9920g));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString3 = jSONObject.optString("errors");
        this.f25628OooO00o = strOptString3 == null ? null : Arrays.asList(strOptString3.split(","));
        this.f25634OooO0oO = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f25635OooO0oo = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f25627OooO = jSONObject.optString("pool_key");
        String strOptString4 = jSONObject.optString("start_time");
        Long lValueOf = -1L;
        if (!TextUtils.isEmpty(strOptString4)) {
            try {
                lValueOf = Long.valueOf(strOptString4);
            } catch (NumberFormatException unused) {
            }
        }
        this.f25636OooOO0 = lValueOf.longValue();
        String strOptString5 = jSONObject.optString("end_time");
        Long lValueOf2 = -1L;
        if (!TextUtils.isEmpty(strOptString5)) {
            try {
                lValueOf2 = Long.valueOf(strOptString5);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f25637OooOO0O = lValueOf2.longValue();
    }
}
