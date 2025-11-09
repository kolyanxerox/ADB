package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.i3 */
/* loaded from: classes.dex */
public abstract class AbstractC1054i3 extends AbstractC1175r0 {

    /* renamed from: e */
    private static final String[] f894e = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* renamed from: f */
    private static final String[] f895f = {"ads", "settings", "signal_providers", "ad_unit_signal_providers"};

    /* renamed from: a */
    public static String m970a(C1220k c1220k) {
        return AbstractC1175r0.m2287a((String) c1220k.m2866a(AbstractC1144o3.f1641h7), "1.0/mediate", c1220k);
    }

    /* renamed from: b */
    public static String m971b(C1220k c1220k) {
        return AbstractC1175r0.m2287a((String) c1220k.m2866a(AbstractC1144o3.f1639g7), "1.0/mediate", c1220k);
    }

    /* renamed from: d */
    public static void m972d(JSONObject jSONObject, C1220k c1220k) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            C1136n5.m1895a(jSONObject, c1220k);
        }
    }

    /* renamed from: e */
    public static void m973e(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            c1220k.m2890c(C1286x4.f3034F);
            return;
        }
        JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f895f);
        c1220k.m2885b(C1286x4.f3034F, jSONObjectShallowCopy.toString());
    }

    /* renamed from: f */
    public static void m974f(JSONObject jSONObject, C1220k c1220k) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f894e);
            c1220k.m2885b(C1286x4.f3033E, jSONObjectShallowCopy.toString());
            C1136n5.m1894a(jSONObjectShallowCopy);
        }
    }

    /* renamed from: g */
    public static void m975g(JSONObject jSONObject, C1220k c1220k) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers") && JsonUtils.valueExists(jSONObject, "signal_providers")) {
            try {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(JsonUtils.getString(jSONArray.getJSONObject(i), "name", null));
                }
                HashSet hashSet2 = new HashSet();
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
                Iterator it = JsonUtils.toList(jSONObject2.names()).iterator();
                while (it.hasNext()) {
                    hashSet2.addAll(JsonUtils.getList(jSONObject2, (String) it.next(), null));
                }
                if (hashSet.equals(hashSet2)) {
                    return;
                }
                Set differenceSet = CollectionUtils.getDifferenceSet(hashSet, hashSet2);
                C1240o.m3207h("MediationConnectionUtils", "\"signal_providers\" contains extra network(s): " + differenceSet);
                Set differenceSet2 = CollectionUtils.getDifferenceSet(hashSet2, hashSet);
                C1240o.m3207h("MediationConnectionUtils", "\"ad_unit_signal_providers\" contains extra network(s): " + differenceSet2);
                c1220k.m2832E().m572a(C0993c2.f490M0, "signalProvidersMismatch", CollectionUtils.hashMap("details", "extraSignalProviderNetworks=" + differenceSet + ",extraAdUnitSignalProviderNetworks=" + differenceSet2));
                AbstractC1072k1.m1126a("Networks within \"signal_providers\" and \"ad_unit_signal_providers\" do not match.", new Object[0]);
            } catch (JSONException e) {
                C1240o.m3204c("MediationConnectionUtils", "Failed to parse JSON", e);
                c1220k.m2832E().m2148a("MediationConnectionUtils", "verifyBidderNetworksMatchFromJson", e);
                AbstractC1072k1.m1128a((Throwable) e, "Failed to parse JSON in verifyBidderNetworksMatchFromJson", new Object[0]);
            }
        }
    }

    /* renamed from: h */
    public static String m976h(C1220k c1220k) {
        C1268v4 c1268v4 = AbstractC1144o3.f1664s8;
        return AbstractC1175r0.m2287a((String) c1220k.m2866a(((Boolean) c1220k.m2866a(c1268v4)).booleanValue() ? AbstractC1144o3.f1662r8 : AbstractC1144o3.f1641h7), ((Boolean) c1220k.m2866a(c1268v4)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", c1220k);
    }

    /* renamed from: i */
    public static String m977i(C1220k c1220k) {
        C1268v4 c1268v4 = AbstractC1144o3.f1664s8;
        return AbstractC1175r0.m2287a((String) c1220k.m2866a(((Boolean) c1220k.m2866a(c1268v4)).booleanValue() ? AbstractC1144o3.f1660q8 : AbstractC1144o3.f1639g7), ((Boolean) c1220k.m2866a(c1268v4)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", c1220k);
    }
}
