package com.ironsource;

import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.bp */
/* loaded from: classes2.dex */
public final class C2980bp {

    /* renamed from: a */
    private final String f7607a;

    /* renamed from: b */
    private final String f7608b;

    /* renamed from: c */
    private final String f7609c;

    /* renamed from: d */
    private final String f7610d;

    /* renamed from: e */
    private final String f7611e;

    /* renamed from: f */
    private final JSONObject f7612f;

    /* renamed from: g */
    private final Map<String, JSONObject> f7613g;

    /* renamed from: h */
    private final String f7614h;

    /* renamed from: i */
    private final String f7615i;

    /* renamed from: j */
    private final boolean f7616j;

    /* renamed from: k */
    private C2980bp f7617k;

    /* renamed from: l */
    private final oo00o.OooO0OO f7618l;

    /* renamed from: com.ironsource.bp$a */
    public static final class a extends kotlin.jvm.internal.Oooo000 implements o00O0Oo.OooO0O0 {
        public a() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NetworkSettings invoke() throws JSONException {
            String strM7967j = C2980bp.this.m7967j();
            String strM7969l = C2980bp.this.m7969l();
            String strM7965h = C2980bp.this.m7965h();
            String strM7968k = C2980bp.this.m7968k();
            JSONObject jSONObjectM7960c = C2980bp.this.m7960c();
            C2980bp c2980bp = C2980bp.this.f7617k;
            JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(jSONObjectM7960c, c2980bp != null ? c2980bp.m7960c() : null);
            JSONObject jSONObjectM7970m = C2980bp.this.m7970m();
            C2980bp c2980bp2 = C2980bp.this.f7617k;
            JSONObject jSONObjectMergeJsons2 = IronSourceUtils.mergeJsons(jSONObjectM7970m, c2980bp2 != null ? c2980bp2.m7970m() : null);
            JSONObject jSONObjectM7962e = C2980bp.this.m7962e();
            C2980bp c2980bp3 = C2980bp.this.f7617k;
            JSONObject jSONObjectMergeJsons3 = IronSourceUtils.mergeJsons(jSONObjectM7962e, c2980bp3 != null ? c2980bp3.m7962e() : null);
            JSONObject jSONObjectM7961d = C2980bp.this.m7961d();
            C2980bp c2980bp4 = C2980bp.this.f7617k;
            JSONObject jSONObjectMergeJsons4 = IronSourceUtils.mergeJsons(jSONObjectM7961d, c2980bp4 != null ? c2980bp4.m7961d() : null);
            JSONObject jSONObjectM7964g = C2980bp.this.m7964g();
            C2980bp c2980bp5 = C2980bp.this.f7617k;
            NetworkSettings networkSettings = new NetworkSettings(strM7967j, strM7969l, strM7965h, strM7968k, jSONObjectMergeJsons, jSONObjectMergeJsons2, jSONObjectMergeJsons3, jSONObjectMergeJsons4, IronSourceUtils.mergeJsons(jSONObjectM7964g, c2980bp5 != null ? c2980bp5.m7964g() : null));
            networkSettings.setIsMultipleInstances(C2980bp.this.m7972o());
            networkSettings.setSubProviderId(C2980bp.this.m7971n());
            networkSettings.setAdSourceNameForEvents(C2980bp.this.m7958b());
            return networkSettings;
        }
    }

    public C2980bp(String providerName, JSONObject networkSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerName, "providerName");
        kotlin.jvm.internal.OooOo.OooO0o0(networkSettings, "networkSettings");
        this.f7607a = providerName;
        this.f7608b = providerName;
        String strOptString = networkSettings.optString(C3015cp.f7799d, providerName);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString, "networkSettings.optStrin…,\n          providerName)");
        this.f7609c = strOptString;
        String strOptString2 = networkSettings.optString(C3015cp.f7800e, strOptString);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString2, "networkSettings.optStrin…roviderTypeForReflection)");
        this.f7610d = strOptString2;
        Object objOpt = networkSettings.opt(C3015cp.f7801f);
        this.f7611e = objOpt instanceof String ? (String) objOpt : null;
        this.f7612f = networkSettings.optJSONObject("application");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        ArrayList arrayList = new ArrayList(adFormatArrValues.length);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            arrayList.add(C2951av.m7841a(adFormat));
        }
        int iOooOOOO = o00O0.o0O0O00.OooOOOO(o00O0.Oooo000.OooOo0(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooOOOO < 16 ? 16 : iOooOOOO);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            JSONObject jSONObjectOptJSONObject = networkSettings.optJSONObject("adFormats");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(str) : null;
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            linkedHashMap.put(obj, jSONObjectOptJSONObject2);
        }
        this.f7613g = linkedHashMap;
        String strOptString3 = networkSettings.optString("spId", "0");
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString3, "networkSettings.optStrin…B_PROVIDER_ID_FIELD, \"0\")");
        this.f7614h = strOptString3;
        String strOptString4 = networkSettings.optString(C3015cp.f7796a);
        kotlin.jvm.internal.OooOo.OooO0Oo(strOptString4, "networkSettings.optString(AD_SOURCE_NAME_FIELD)");
        this.f7615i = strOptString4;
        this.f7616j = networkSettings.optBoolean(C3015cp.f7798c, false);
        this.f7618l = o0OOO0.OooO0oo(new a());
    }

    /* renamed from: b */
    public final String m7958b() {
        return this.f7615i;
    }

    /* renamed from: c */
    public final JSONObject m7960c() {
        return this.f7612f;
    }

    /* renamed from: d */
    public final JSONObject m7961d() throws JSONException {
        JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(this.f7613g.get("banner"), this.f7612f);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectMergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectMergeJsons;
    }

    /* renamed from: e */
    public final JSONObject m7962e() throws JSONException {
        JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(this.f7613g.get("interstitial"), this.f7612f);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectMergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectMergeJsons;
    }

    /* renamed from: f */
    public final NetworkSettings m7963f() {
        return (NetworkSettings) this.f7618l.getValue();
    }

    /* renamed from: g */
    public final JSONObject m7964g() throws JSONException {
        JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(this.f7613g.get("nativeAd"), this.f7612f);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectMergeJsons, "mergeJsons(\n            …EY], applicationSettings)");
        return jSONObjectMergeJsons;
    }

    /* renamed from: h */
    public final String m7965h() {
        return this.f7610d;
    }

    /* renamed from: i */
    public final String m7966i() {
        return this.f7608b;
    }

    /* renamed from: j */
    public final String m7967j() {
        return this.f7607a;
    }

    /* renamed from: k */
    public final String m7968k() {
        return this.f7611e;
    }

    /* renamed from: l */
    public final String m7969l() {
        return this.f7609c;
    }

    /* renamed from: m */
    public final JSONObject m7970m() throws JSONException {
        JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(this.f7613g.get("rewarded"), this.f7612f);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectMergeJsons, "mergeJsons(\n            …     applicationSettings)");
        return jSONObjectMergeJsons;
    }

    /* renamed from: n */
    public final String m7971n() {
        return this.f7614h;
    }

    /* renamed from: o */
    public final boolean m7972o() {
        return this.f7616j;
    }

    /* renamed from: a */
    public final Map<String, JSONObject> m7957a() {
        return this.f7613g;
    }

    /* renamed from: b */
    public final void m7959b(C2980bp c2980bp) {
        this.f7617k = c2980bp;
    }
}
