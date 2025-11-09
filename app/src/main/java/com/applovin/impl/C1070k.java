package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.k */
/* loaded from: classes.dex */
public class C1070k {

    /* renamed from: a */
    private final C1220k f978a;

    /* renamed from: b */
    private final String f979b;

    /* renamed from: com.applovin.impl.k$a */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");


        /* renamed from: a */
        private final String f984a;

        a(String str) {
            this.f984a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f984a;
        }
    }

    public C1070k(String str, C1220k c1220k) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f979b = str;
        this.f978a = c1220k;
    }

    /* renamed from: a */
    public JSONObject m1119a() {
        if (m1121c() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f979b.substring(m1122d().length()), 0), "UTF-8"));
                this.f978a.m2847O();
                if (!C1240o.m3200a()) {
                    return jSONObject;
                }
                this.f978a.m2847O().m3211a("AdToken", "Decoded token into ad response: " + jSONObject);
                return jSONObject;
            } catch (JSONException e) {
                this.f978a.m2847O();
                if (C1240o.m3200a()) {
                    this.f978a.m2847O().m3212a("AdToken", "Unable to decode token '" + this.f979b + "' into JSON", e);
                }
                this.f978a.m2832E().m2148a("AdToken", "decodeFullAdResponseStr", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            this.f978a.m2847O();
            if (C1240o.m3200a()) {
                this.f978a.m2847O().m3212a("AdToken", OooO0oO.OooOo.OooOOOo(new StringBuilder("Unable to process ad response from token '"), this.f979b, "'"), e2);
            }
            this.f978a.m2832E().m2148a("AdToken", "decodeFullAdResponse", e2);
            return null;
        }
    }

    /* renamed from: b */
    public String m1120b() {
        return this.f979b;
    }

    /* renamed from: c */
    public a m1121c() {
        return m1118a(C1268v4.f2924x0) != null ? a.REGULAR : m1118a(C1268v4.f2932y0) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    /* renamed from: d */
    public String m1122d() {
        String strM1118a = m1118a(C1268v4.f2924x0);
        if (!TextUtils.isEmpty(strM1118a)) {
            return strM1118a;
        }
        String strM1118a2 = m1118a(C1268v4.f2932y0);
        if (TextUtils.isEmpty(strM1118a2)) {
            return null;
        }
        return strM1118a2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1070k)) {
            return false;
        }
        String str = this.f979b;
        String str2 = ((C1070k) obj).f979b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f979b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("AdToken{id=", StringUtils.prefixToIndex(32, this.f979b), ", type=");
        sbOooOoO0.append(m1121c());
        sbOooOoO0.append('}');
        return sbOooOoO0.toString();
    }

    /* renamed from: a */
    private String m1118a(C1268v4 c1268v4) {
        for (String str : this.f978a.m2888c(c1268v4)) {
            if (this.f979b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }
}
