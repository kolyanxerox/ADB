package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbs;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class od0 {

    /* renamed from: OooO00o */
    public final String f22973OooO00o;

    /* renamed from: OooO0O0 */
    public final String f22974OooO0O0;

    /* renamed from: OooO0OO */
    public final JSONObject f22975OooO0OO;

    /* renamed from: OooO0Oo */
    public final JSONObject f22976OooO0Oo;

    public od0(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException {
        JSONObject jSONObjectZzi = zzbs.zzi(jsonReader);
        this.f22976OooO0Oo = jSONObjectZzi;
        this.f22973OooO00o = jSONObjectZzi.optString("ad_html", null);
        this.f22974OooO0O0 = jSONObjectZzi.optString("ad_base_url", null);
        this.f22975OooO0OO = jSONObjectZzi.optJSONObject("ad_json");
    }
}
