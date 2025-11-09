package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v10 {

    /* renamed from: OooO0O0, reason: collision with root package name */
    public JSONObject f24831OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final cq0 f24832OooO0OO;

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f24833OooO0Oo;

    /* renamed from: OooO0o0, reason: collision with root package name */
    public JSONObject f24835OooO0o0;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f24830OooO00o = new ConcurrentHashMap();

    /* renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f24834OooO0o = new AtomicBoolean(false);

    public v10(cq0 cq0Var) {
        this.f24832OooO0OO = cq0Var;
    }

    public final synchronized void OooO00o() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f24833OooO0Oo = true;
            C1867nl c1867nlZzg = zzv.zzp().OooO0Oo().zzg();
            if (c1867nlZzg != null && (jSONObject = c1867nlZzg.f21509OooO0oO) != null) {
                this.f24831OooO0O0 = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o00OoOO)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f24835OooO0o0 = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.f24830OooO00o.containsKey(strOptString2)) {
                                    map = (Map) this.f24830OooO00o.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f24830OooO00o.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }
}
