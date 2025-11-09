package com.applovin.impl;

import com.applovin.impl.sdk.C1219j;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1221l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.c7 */
/* loaded from: classes.dex */
public class C0998c7 {

    /* renamed from: a */
    private final C1220k f586a;

    /* renamed from: b */
    private boolean f587b;

    /* renamed from: c */
    private List f588c;

    public C0998c7(C1220k c1220k) {
        this.f586a = c1220k;
        C1286x4 c1286x4 = C1286x4.f3036H;
        this.f587b = ((Boolean) c1220k.m2868a(c1286x4, Boolean.FALSE)).booleanValue() || C1290y.m3680a(C1220k.m2824o()).m3682a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || c1220k.m2827B().m2990R();
        c1220k.m2890c(c1286x4);
    }

    /* renamed from: e */
    private void m487e() {
        C1219j c1219jM2923u = this.f586a.m2923u();
        if (this.f587b) {
            c1219jM2923u.m2781b(this.f588c);
        } else {
            c1219jM2923u.m2775a(this.f588c);
        }
    }

    /* renamed from: a */
    public void m489a(String str) {
        if (StringUtils.isValidString(str)) {
            m490a(Collections.singletonList(str));
        } else {
            m490a((List) null);
        }
    }

    /* renamed from: b */
    public List m492b() {
        return this.f588c;
    }

    /* renamed from: c */
    public boolean m493c() {
        return this.f587b;
    }

    /* renamed from: d */
    public boolean m494d() {
        List list = this.f588c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* renamed from: a */
    public void m490a(List list) {
        if (list == null && this.f588c == null) {
            return;
        }
        if (list == null || !list.equals(this.f588c)) {
            this.f588c = list;
            m487e();
        }
    }

    /* renamed from: a */
    public void m488a() {
        this.f586a.m2885b(C1286x4.f3036H, Boolean.TRUE);
    }

    /* renamed from: a */
    public void m491a(JSONObject jSONObject) {
        if (this.f587b) {
            return;
        }
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("test_mode_idfas", jSONObject);
        C1221l c1221lM2827B = this.f586a.m2827B();
        boolean zM2990R = c1221lM2827B.m2990R();
        String strM3413a = c1221lM2827B.m2997f().m3413a();
        C1221l.b bVarM2985F = c1221lM2827B.m2985F();
        this.f587b = zM2990R || JsonUtils.containsCaseInsensitiveString(strM3413a, jSONArrayOooOOoo) || JsonUtils.containsCaseInsensitiveString(bVarM2985F != null ? bVarM2985F.f2195a : null, jSONArrayOooOOoo);
    }
}
