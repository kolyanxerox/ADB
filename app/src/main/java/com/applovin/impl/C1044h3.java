package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.h3 */
/* loaded from: classes.dex */
public class C1044h3 {

    /* renamed from: a */
    protected final C1220k f837a;

    /* renamed from: b */
    private final JSONObject f838b;

    /* renamed from: d */
    protected final JSONObject f840d;

    /* renamed from: f */
    private final Map f842f;

    /* renamed from: g */
    private final C1026f5 f843g;

    /* renamed from: h */
    protected final C1026f5 f844h;

    /* renamed from: i */
    private String f845i;

    /* renamed from: j */
    private String f846j;

    /* renamed from: c */
    private final Object f839c = new Object();

    /* renamed from: e */
    protected final Object f841e = new Object();

    public C1044h3(Map map, JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f837a = c1220k;
        if (((Boolean) c1220k.m2866a(C1268v4.f2874q6)).booleanValue()) {
            this.f843g = new C1026f5(jSONObject2);
            this.f844h = new C1026f5(jSONObject);
            this.f838b = null;
            this.f840d = null;
        } else {
            this.f838b = jSONObject2;
            this.f840d = jSONObject;
            this.f843g = null;
            this.f844h = null;
        }
        this.f842f = map;
    }

    /* renamed from: j */
    private int m881j() {
        return m883a("mute_state", m892b("mute_state", ((Integer) this.f837a.m2866a(AbstractC1144o3.f1622S7)).intValue()));
    }

    /* renamed from: a */
    public JSONObject m889a() {
        JSONObject jSONObject;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m730a();
        }
        synchronized (this.f841e) {
            jSONObject = this.f840d;
        }
        return jSONObject;
    }

    /* renamed from: b */
    public Boolean m894b(String str, Boolean bool) {
        Boolean bool2;
        C1026f5 c1026f5 = this.f843g;
        if (c1026f5 != null) {
            return c1026f5.m725a(str, bool);
        }
        synchronized (this.f839c) {
            bool2 = JsonUtils.getBoolean(this.f838b, str, bool);
        }
        return bool2;
    }

    /* renamed from: c */
    public boolean m903c(String str) {
        boolean zHas;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m735a(str);
        }
        synchronized (this.f841e) {
            zHas = this.f840d.has(str);
        }
        return zHas;
    }

    /* renamed from: d */
    public boolean m905d(String str) {
        boolean zHas;
        C1026f5 c1026f5 = this.f843g;
        if (c1026f5 != null) {
            return c1026f5.m735a(str);
        }
        synchronized (this.f839c) {
            zHas = this.f838b.has(str);
        }
        return zHas;
    }

    /* renamed from: e */
    public Object m906e(String str) {
        Object objOpt;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m736b(str);
        }
        synchronized (this.f841e) {
            objOpt = this.f840d.opt(str);
        }
        return objOpt;
    }

    /* renamed from: f */
    public Bundle m908f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), m915l());
    }

    /* renamed from: g */
    public JSONObject m910g() {
        JSONObject jSONObject;
        C1026f5 c1026f5 = this.f843g;
        if (c1026f5 != null) {
            return c1026f5.m730a();
        }
        synchronized (this.f839c) {
            jSONObject = this.f838b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return m896b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f845i;
    }

    /* renamed from: h */
    public long m912h() {
        return m884a("init_completion_delay_ms", -1L);
    }

    /* renamed from: i */
    public Map m913i() {
        return this.f842f;
    }

    /* renamed from: k */
    public String m914k() {
        return m899c().split("_")[0];
    }

    /* renamed from: l */
    public Bundle m915l() {
        Bundle bundle;
        if (m906e("server_parameters") instanceof JSONObject) {
            C1026f5 c1026f5 = this.f844h;
            bundle = c1026f5 != null ? (Bundle) c1026f5.m726a(new OooOOo0.o0ooOOo(2)) : JsonUtils.toBundle(m890a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iM881j = m881j();
        if (iM881j != -1) {
            if (iM881j == 2) {
                bundle.putBoolean("is_muted", this.f837a.m2912o0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iM881j == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", m893b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", m896b("currency", ""));
        }
        return bundle;
    }

    /* renamed from: m */
    public long m916m() {
        return m884a("adapter_timeout_ms", ((Long) this.f837a.m2866a(AbstractC1144o3.f1655o7)).longValue());
    }

    /* renamed from: n */
    public Boolean m917n() {
        String str = this.f837a.m2912o0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : m903c("huc") ? m885a("huc", Boolean.FALSE) : m894b("huc", (Boolean) null);
    }

    /* renamed from: o */
    public Boolean m918o() {
        String str = this.f837a.m2912o0().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : m903c("dns") ? m885a("dns", Boolean.FALSE) : m894b("dns", (Boolean) null);
    }

    /* renamed from: p */
    public boolean m919p() {
        return m885a("is_testing", Boolean.FALSE).booleanValue();
    }

    /* renamed from: q */
    public boolean m920q() {
        return m885a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    /* renamed from: r */
    public boolean m921r() {
        return m885a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    /* renamed from: s */
    public boolean m922s() {
        return m885a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + m895b() + "', adapterName='" + m899c() + "', isTesting=" + m919p() + '}';
    }

    /* renamed from: f */
    public void m909f(String str) {
        this.f846j = str;
    }

    /* renamed from: a */
    public Boolean m885a(String str, Boolean bool) {
        Boolean bool2;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m725a(str, bool);
        }
        synchronized (this.f841e) {
            bool2 = JsonUtils.getBoolean(this.f840d, str, bool);
        }
        return bool2;
    }

    /* renamed from: b */
    public int m892b(String str, int i) {
        int i2;
        C1026f5 c1026f5 = this.f843g;
        if (c1026f5 != null) {
            return c1026f5.m723a(str, i);
        }
        synchronized (this.f839c) {
            i2 = JsonUtils.getInt(this.f838b, str, i);
        }
        return i2;
    }

    /* renamed from: c */
    public void m900c(String str, int i) {
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            c1026f5.m738b(str, i);
            return;
        }
        synchronized (this.f841e) {
            JsonUtils.putInt(this.f840d, str, i);
        }
    }

    /* renamed from: d */
    public String m904d() {
        if (m903c("consent_string")) {
            return m887a("consent_string", (String) null);
        }
        if (m905d("consent_string")) {
            return m896b("consent_string", (String) null);
        }
        return this.f837a.m2920s0().m3631j();
    }

    /* renamed from: e */
    public String m907e() {
        return this.f846j;
    }

    /* renamed from: g */
    public void m911g(String str) {
        this.f845i = str;
    }

    /* renamed from: a */
    public float m882a(String str, float f) {
        float f2;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m722a(str, f);
        }
        synchronized (this.f841e) {
            f2 = JsonUtils.getFloat(this.f840d, str, f);
        }
        return f2;
    }

    /* renamed from: b */
    public JSONArray m898b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        C1026f5 c1026f5 = this.f843g;
        if (c1026f5 != null) {
            return c1026f5.m729a(str, jSONArray);
        }
        synchronized (this.f839c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f838b, str, jSONArray);
        }
        return jSONArray2;
    }

    /* renamed from: c */
    public void m901c(String str, long j) {
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            c1026f5.m739b(str, j);
            return;
        }
        synchronized (this.f841e) {
            JsonUtils.putLong(this.f840d, str, j);
        }
    }

    /* renamed from: a */
    public int m883a(String str, int i) {
        int i2;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m723a(str, i);
        }
        synchronized (this.f841e) {
            i2 = JsonUtils.getInt(this.f840d, str, i);
        }
        return i2;
    }

    /* renamed from: b */
    public long m893b(String str, long j) {
        long j2;
        C1026f5 c1026f5 = this.f843g;
        if (c1026f5 != null) {
            return c1026f5.m724a(str, j);
        }
        synchronized (this.f839c) {
            j2 = JsonUtils.getLong(this.f838b, str, j);
        }
        return j2;
    }

    /* renamed from: c */
    public void m902c(String str, String str2) {
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            c1026f5.m740b(str, str2);
            return;
        }
        synchronized (this.f841e) {
            JsonUtils.putString(this.f840d, str, str2);
        }
    }

    /* renamed from: a */
    public JSONArray m888a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m729a(str, jSONArray);
        }
        synchronized (this.f841e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f840d, str, jSONArray);
        }
        return jSONArray2;
    }

    /* renamed from: b */
    public String m896b(String str, String str2) {
        String string;
        C1026f5 c1026f5 = this.f843g;
        if (c1026f5 != null) {
            return c1026f5.m727a(str, str2);
        }
        synchronized (this.f839c) {
            string = JsonUtils.getString(this.f838b, str, str2);
        }
        return string;
    }

    /* renamed from: c */
    public String m899c() {
        return m887a("name", (String) null);
    }

    /* renamed from: a */
    public JSONObject m890a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m731a(str, jSONObject);
        }
        synchronized (this.f841e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f840d, str, jSONObject);
        }
        return jSONObject2;
    }

    /* renamed from: b */
    public String m895b() {
        return m887a(Constants.CLASS, (String) null);
    }

    /* renamed from: b */
    public List m897b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            C1026f5 c1026f5 = this.f843g;
            if (c1026f5 != null) {
                listOptList = c1026f5.m737b(str, Collections.EMPTY_LIST);
            } else {
                listOptList = JsonUtils.optList(m898b(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            C1026f5 c1026f52 = this.f844h;
            if (c1026f52 != null) {
                listOptList2 = c1026f52.m737b(str, Collections.EMPTY_LIST);
            } else {
                listOptList2 = JsonUtils.optList(m888a(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            ArrayList arrayList = new ArrayList(listOptList2.size() + listOptList.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    /* renamed from: a */
    public long m884a(String str, long j) {
        long j2;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m724a(str, j);
        }
        synchronized (this.f841e) {
            j2 = JsonUtils.getLong(this.f840d, str, j);
        }
        return j2;
    }

    /* renamed from: a */
    public String m887a(String str, String str2) {
        String string;
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            return c1026f5.m727a(str, str2);
        }
        synchronized (this.f841e) {
            string = JsonUtils.getString(this.f840d, str, str2);
        }
        return string;
    }

    /* renamed from: a */
    public void m891a(String str, Object obj) {
        C1026f5 c1026f5 = this.f844h;
        if (c1026f5 != null) {
            c1026f5.m733a(str, obj);
            return;
        }
        synchronized (this.f841e) {
            JsonUtils.putObject(this.f840d, str, obj);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Bundle m880a(C1026f5 c1026f5) {
        return JsonUtils.toBundle(c1026f5.m731a("server_parameters", (JSONObject) null));
    }

    /* renamed from: a */
    public String m886a(String str) {
        String strM887a = m887a(str, "");
        return StringUtils.isValidString(strM887a) ? strM887a : m896b(str, "");
    }
}
