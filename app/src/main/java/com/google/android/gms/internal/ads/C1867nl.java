package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.nl */
/* loaded from: classes2.dex */
public final class C1867nl {

    /* renamed from: OooO0Oo */
    public String f21506OooO0Oo;

    /* renamed from: OooO0o */
    public long f21507OooO0o;

    /* renamed from: OooO0o0 */
    public String f21508OooO0o0;

    /* renamed from: OooO0oO */
    public JSONObject f21509OooO0oO;

    /* renamed from: OooO0oo */
    public boolean f21510OooO0oo;

    /* renamed from: OooOO0 */
    public boolean f21511OooOO0;

    /* renamed from: OooO00o */
    public final ArrayList f21503OooO00o = new ArrayList();

    /* renamed from: OooO0O0 */
    public final ArrayList f21504OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO */
    public final HashMap f21505OooO0OO = new HashMap();

    /* renamed from: OooO */
    public final ArrayList f21502OooO = new ArrayList();

    public C1867nl(String str, long j) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f21506OooO0Oo = "";
        this.f21510OooO0oo = false;
        this.f21511OooOO0 = false;
        this.f21508OooO0o0 = str;
        this.f21507OooO0o = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f21509OooO0oO = new JSONObject(str);
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Ooo)).booleanValue() && OooO00o()) {
                return;
            }
            if (this.f21509OooO0oO.optInt("status", -1) != 1) {
                this.f21510OooO0oo = false;
                zzo.zzj("App settings could not be fetched successfully.");
                return;
            }
            this.f21510OooO0oo = true;
            this.f21506OooO0Oo = this.f21509OooO0oO.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f21509OooO0oO.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i);
                    String strOptString = jSONObject.optString("format");
                    String strOptString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f21504OooO0O0.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f21505OooO0OO.put(strOptString2, new C1971qe(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f21509OooO0oO.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    this.f21503OooO00o.add(jSONArrayOptJSONArray3.optString(i2));
                }
            }
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0oO0Ooo)).booleanValue() && (jSONObjectOptJSONObject2 = this.f21509OooO0oO.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    this.f21502OooO.add(jSONArrayOptJSONArray.get(i3).toString());
                }
            }
            if (!((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00ooo0O)).booleanValue() || (jSONObjectOptJSONObject = this.f21509OooO0oO.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f21511OooOO0 = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            zzo.zzk("Exception occurred while processing app setting json", e);
            zzv.zzp().OooO0oo("AppSettings.parseAppSettingsJson", e);
        }
    }

    public final boolean OooO00o() {
        if (!TextUtils.isEmpty(this.f21508OooO0o0) && this.f21509OooO0oO != null) {
            C2148v6 c2148v6 = AbstractC1448c7.o0Oooo;
            long jLongValue = ((Long) zzbe.zzc().OooO00o(c2148v6)).longValue();
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0Oooo0o)).booleanValue() && !TextUtils.isEmpty(this.f21508OooO0o0)) {
                jLongValue = this.f21509OooO0oO.optLong("cache_ttl_sec", ((Long) zzbe.zzc().OooO00o(c2148v6)).longValue());
            }
            ((Oooo0OO.oo000o) zzv.zzC()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jLongValue >= 0) {
                long j = this.f21507OooO0o;
                if (j > jCurrentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - j) > jLongValue) {
                    this.f21503OooO00o.clear();
                    this.f21504OooO0O0.clear();
                    this.f21505OooO0OO.clear();
                    this.f21506OooO0Oo = "";
                    this.f21508OooO0o0 = "";
                    this.f21509OooO0oO = null;
                    this.f21510OooO0oo = false;
                    this.f21502OooO.clear();
                    this.f21511OooOO0 = false;
                    return true;
                }
            }
        }
        return false;
    }
}
