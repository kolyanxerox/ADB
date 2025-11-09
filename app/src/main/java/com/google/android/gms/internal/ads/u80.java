package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.ironsource.C3451ne;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class u80 {

    /* renamed from: OooO0o, reason: collision with root package name */
    public final cq0 f24597OooO0o;

    /* renamed from: OooO0oO, reason: collision with root package name */
    public JSONObject f24599OooO0oO;

    /* renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f24593OooO00o = new HashMap();

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f24594OooO0O0 = new HashMap();

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f24595OooO0OO = new HashMap();

    /* renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f24596OooO0Oo = new HashMap();

    /* renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f24598OooO0o0 = new HashMap();

    public u80(cq0 cq0Var) {
        this.f24597OooO0o = cq0Var;
    }

    public static final Bundle OooO(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized mn0 OooO00o(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(zzv.zzp().OooO0Oo().zzg().f21508OooO0o0) && (map = (Map) this.f24595OooO0OO.get(str)) != null) {
                List<v80> list = (List) map.get(str2);
                if (list == null) {
                    String strOooOO0O = af0.OooOO0O(this.f24599OooO0oO, str2, str);
                    if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO0oo)).booleanValue()) {
                        strOooOO0O = strOooOO0O.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strOooOO0O);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (v80 v80Var : list) {
                        String str3 = v80Var.f24887OooO00o;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(v80Var.f24888OooO0O0);
                    }
                    return mn0.OooO00o(map2);
                }
            }
            return mn0.f21307OooOoo0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0O0(String str) {
        if (!TextUtils.isEmpty(str) && !this.f24593OooO00o.containsKey(str)) {
            this.f24593OooO00o.put(str, new v80(new Bundle(), str));
        }
    }

    public final synchronized mn0 OooO0OO(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(zzv.zzp().OooO0Oo().zzg().f21508OooO0o0)) {
                boolean zMatches = Pattern.matches((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17891o00OO00o), str);
                boolean zMatches2 = Pattern.matches((String) zzbe.zzc().OooO00o(AbstractC1448c7.f17889o00OO0), str);
                if (zMatches) {
                    map = new HashMap(this.f24598OooO0o0);
                } else if (zMatches2) {
                    map = new HashMap(this.f24596OooO0Oo);
                }
                return mn0.OooO00o(map);
            }
            return mn0.f21307OooOoo0;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList OooO0Oo(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleOooO = OooO(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = (String) arrayList2.get(i2);
                        OooO0O0(str);
                        if (((v80) this.f24593OooO00o.get(str)) != null) {
                            arrayList.add(new v80(bundleOooO, str));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void OooO0o(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.f24595OooO0OO.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.f24595OooO0OO.put(str, map);
            List arrayList2 = (List) map.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            map.put(str2, arrayList2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0o0() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) AbstractC1854n8.f21432OooO0O0.OooOOO()).booleanValue()) {
                if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17836o000o000)).booleanValue() && (jSONObject = zzv.zzp().OooO0Oo().zzg().f21509OooO0oO) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                                boolean zOptBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject3.optString(C3451ne.f10417G);
                                x80 x80Var = new x80(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.f24596OooO0Oo.put(strOptString, x80Var);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.f24598OooO0o0.put(strOptString, x80Var);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            zze.zzb("Malformed config loading JSON.", e);
        } finally {
        }
    }

    public final synchronized void OooO0oO() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = zzv.zzp().OooO0Oo().zzg().f21509OooO0oO;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f24599OooO0oO = jSONObject.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.o0OoO0oo)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String strOptString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    arrayList.addAll(OooO0Oo(jSONArrayOptJSONArray.getJSONObject(i2)));
                                }
                            }
                            OooO0o(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    zze.zzb("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void OooO0oo() {
        JSONObject jSONObject;
        if (!((Boolean) AbstractC1854n8.f21435OooO0o0.OooOOO()).booleanValue()) {
            if (((Boolean) zzbe.zzc().OooO00o(AbstractC1448c7.f17834o000Oooo)).booleanValue() && (jSONObject = zzv.zzp().OooO0Oo().zzg().f21509OooO0oO) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle bundleOooO = OooO(jSONObject2.optJSONObject("data"));
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject2.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f24594OooO0O0.put(strOptString, new x80(strOptString, zOptBoolean2, zOptBoolean, true, bundleOooO));
                        }
                    }
                } catch (JSONException e) {
                    zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }
}
