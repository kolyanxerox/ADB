package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.t7 */
/* loaded from: classes.dex */
public class C1253t7 implements InterfaceC1135n4 {

    /* renamed from: a */
    private a f2403a;

    /* renamed from: b */
    private Uri f2404b;

    /* renamed from: c */
    private String f2405c;

    /* renamed from: com.applovin.impl.t7$a */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private C1253t7() {
    }

    /* renamed from: a */
    public static C1253t7 m3351a(C1099m8 c1099m8, C1253t7 c1253t7, C1220k c1220k) {
        if (c1099m8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c1253t7 == null) {
            try {
                c1253t7 = new C1253t7();
            } catch (Throwable th) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3212a("VastNonVideoResource", "Error occurred while initializing", th);
                }
                c1220k.m2832E().m2152a("VastNonVideoResource", th);
                return null;
            }
        }
        if (c1253t7.f2404b == null && !StringUtils.isValidString(c1253t7.f2405c)) {
            String strM3353a = m3353a(c1099m8, "StaticResource");
            if (URLUtil.isValidUrl(strM3353a)) {
                c1253t7.f2404b = Uri.parse(strM3353a);
                c1253t7.f2403a = a.STATIC;
                return c1253t7;
            }
            String strM3353a2 = m3353a(c1099m8, "IFrameResource");
            if (StringUtils.isValidString(strM3353a2)) {
                c1253t7.f2403a = a.IFRAME;
                if (URLUtil.isValidUrl(strM3353a2)) {
                    c1253t7.f2404b = Uri.parse(strM3353a2);
                    return c1253t7;
                }
                c1253t7.f2405c = strM3353a2;
                return c1253t7;
            }
            String strM3353a3 = m3353a(c1099m8, "HTMLResource");
            if (StringUtils.isValidString(strM3353a3)) {
                c1253t7.f2403a = a.HTML;
                if (URLUtil.isValidUrl(strM3353a3)) {
                    c1253t7.f2404b = Uri.parse(strM3353a3);
                    return c1253t7;
                }
                c1253t7.f2405c = strM3353a3;
            }
        }
        return c1253t7;
    }

    /* renamed from: b */
    public String m3356b() {
        return this.f2405c;
    }

    /* renamed from: c */
    public Uri m3357c() {
        return this.f2404b;
    }

    /* renamed from: d */
    public a m3358d() {
        return this.f2403a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1253t7)) {
            return false;
        }
        C1253t7 c1253t7 = (C1253t7) obj;
        if (this.f2403a != c1253t7.f2403a) {
            return false;
        }
        Uri uri = this.f2404b;
        if (uri == null ? c1253t7.f2404b != null : !uri.equals(c1253t7.f2404b)) {
            return false;
        }
        String str = this.f2405c;
        String str2 = c1253t7.f2405c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f2403a;
        int iHashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f2404b;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f2405c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastNonVideoResource{type=");
        sb.append(this.f2403a);
        sb.append(", resourceUri=");
        sb.append(this.f2404b);
        sb.append(", resourceContents='");
        return OooO0oO.OooOo.OooOOOo(sb, this.f2405c, "'}");
    }

    /* renamed from: a */
    private static String m3353a(C1099m8 c1099m8, String str) {
        C1099m8 c1099m8M1515c = c1099m8.m1515c(str);
        if (c1099m8M1515c != null) {
            return c1099m8M1515c.m1517d();
        }
        return null;
    }

    /* renamed from: a */
    public void m3354a(Uri uri) {
        this.f2404b = uri;
    }

    /* renamed from: a */
    public void m3355a(String str) {
        this.f2405c = str;
    }

    /* renamed from: a */
    public static C1253t7 m3352a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "type", null);
        a aVarValueOf = string == null ? null : a.valueOf(string);
        String string2 = JsonUtils.getString(jSONObject, "resource_uri", null);
        Uri uri = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        C1253t7 c1253t7 = new C1253t7();
        c1253t7.f2403a = aVarValueOf;
        c1253t7.f2404b = uri;
        c1253t7.f2405c = JsonUtils.getString(jSONObject, "resource_contents", null);
        return c1253t7;
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        a aVar = this.f2403a;
        JsonUtils.putString(jSONObject, "type", aVar == null ? null : aVar.toString());
        Uri uri = this.f2404b;
        JsonUtils.putString(jSONObject, "resource_uri", uri != null ? uri.toString() : null);
        JsonUtils.putString(jSONObject, "resource_contents", this.f2405c);
        return jSONObject;
    }
}
