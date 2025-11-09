package com.applovin.impl;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C3007ch;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.v7 */
/* loaded from: classes.dex */
public class C1271v7 implements InterfaceC1135n4 {

    /* renamed from: a */
    private String f2977a;

    /* renamed from: b */
    private String f2978b;

    /* renamed from: c */
    private String f2979c;

    /* renamed from: d */
    private boolean f2980d;

    /* renamed from: e */
    private long f2981e = -1;

    /* renamed from: f */
    private int f2982f = -1;

    private C1271v7() {
    }

    /* renamed from: a */
    public static C1271v7 m3574a(C1099m8 c1099m8, AbstractC1157p7 abstractC1157p7, C1220k c1220k) {
        List<String> listExplode;
        int size;
        long seconds;
        if (c1099m8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strM1517d = c1099m8.m1517d();
            if (TextUtils.isEmpty(strM1517d)) {
                c1220k.m2847O();
                if (C1240o.m3200a()) {
                    c1220k.m2847O().m3214b("VastTracker", "Unable to create tracker. Could not find URL.");
                }
                return null;
            }
            C1271v7 c1271v7 = new C1271v7();
            c1271v7.f2979c = strM1517d;
            c1271v7.f2977a = (String) c1099m8.m1512a().get(C3007ch.f7763x);
            c1271v7.f2978b = (String) c1099m8.m1512a().get(NotificationCompat.CATEGORY_EVENT);
            c1271v7.f2980d = ((Boolean) c1220k.m2866a(C1268v4.f2735Z4)).booleanValue();
            if (abstractC1157p7 != null) {
                c1271v7.f2980d = JsonUtils.getBoolean(abstractC1157p7.m2080b(), "vast_fire_trackers_from_webview", Boolean.valueOf(c1271v7.f2980d)).booleanValue();
            }
            c1271v7.f2982f = m3573a(c1271v7.m3577b(), abstractC1157p7);
            String str = (String) c1099m8.m1512a().get(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);
            if (StringUtils.isValidString(str)) {
                String strTrim = str.trim();
                if (strTrim.contains("%")) {
                    c1271v7.f2982f = StringUtils.parseInt(strTrim.substring(0, strTrim.length() - 1));
                    return c1271v7;
                }
                if (strTrim.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER) && (size = (listExplode = CollectionUtils.explode(strTrim, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)).size()) > 0) {
                    int i = size - 1;
                    long j = 0;
                    for (int i2 = i; i2 >= 0; i2--) {
                        String str2 = listExplode.get(i2);
                        if (StringUtils.isNumeric(str2)) {
                            int i3 = Integer.parseInt(str2);
                            if (i2 == i) {
                                seconds = i3;
                            } else if (i2 == size - 2) {
                                seconds = TimeUnit.MINUTES.toSeconds(i3);
                            } else if (i2 == size - 3) {
                                seconds = TimeUnit.HOURS.toSeconds(i3);
                            }
                            j += seconds;
                        }
                    }
                    c1271v7.f2981e = j;
                    c1271v7.f2982f = -1;
                }
            }
            return c1271v7;
        } catch (Throwable th) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3212a("VastTracker", "Error occurred while initializing", th);
            }
            c1220k.m2832E().m2152a("VastTracker", th);
            return null;
        }
    }

    /* renamed from: b */
    public String m3577b() {
        return this.f2978b;
    }

    /* renamed from: c */
    public String m3578c() {
        return this.f2979c;
    }

    /* renamed from: d */
    public boolean m3579d() {
        return this.f2980d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1271v7)) {
            return false;
        }
        C1271v7 c1271v7 = (C1271v7) obj;
        if (this.f2981e != c1271v7.f2981e || this.f2982f != c1271v7.f2982f) {
            return false;
        }
        String str = this.f2977a;
        if (str == null ? c1271v7.f2977a != null : !str.equals(c1271v7.f2977a)) {
            return false;
        }
        String str2 = this.f2978b;
        if (str2 == null ? c1271v7.f2978b == null : str2.equals(c1271v7.f2978b)) {
            return this.f2979c.equals(c1271v7.f2979c);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f2977a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2978b;
        int iOooO0O0 = androidx.datastore.preferences.protobuf.OooO00o.OooO0O0((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f2979c);
        long j = this.f2981e;
        return ((iOooO0O0 + ((int) (j ^ (j >>> 32)))) * 31) + this.f2982f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastTracker{identifier='");
        sb.append(this.f2977a);
        sb.append("', event='");
        sb.append(this.f2978b);
        sb.append("', uriString='");
        sb.append(this.f2979c);
        sb.append("', offsetSeconds=");
        sb.append(this.f2981e);
        sb.append(", offsetPercent=");
        return OooO0oO.OooOo.OooOOO0(sb, this.f2982f, '}');
    }

    /* renamed from: a */
    public boolean m3576a(long j, int i) {
        long j2 = this.f2981e;
        boolean z = j2 >= 0;
        boolean z2 = j >= j2;
        int i2 = this.f2982f;
        return (z && z2) || ((i2 >= 0) && (i >= i2));
    }

    /* renamed from: a */
    private static int m3573a(String str, AbstractC1157p7 abstractC1157p7) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if (!"complete".equalsIgnoreCase(str)) {
            return -1;
        }
        if (abstractC1157p7 != null) {
            return abstractC1157p7.m2085g();
        }
        return 95;
    }

    /* renamed from: a */
    public static C1271v7 m3575a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        C1271v7 c1271v7 = new C1271v7();
        String string = JsonUtils.getString(jSONObject, "uri_string", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        c1271v7.f2979c = string;
        c1271v7.f2977a = JsonUtils.getString(jSONObject, Constants.IDENTIFIER, "");
        c1271v7.f2978b = JsonUtils.getString(jSONObject, NotificationCompat.CATEGORY_EVENT, "");
        c1271v7.f2981e = JsonUtils.getLong(jSONObject, "offset_seconds", -1L);
        c1271v7.f2982f = JsonUtils.getInt(jSONObject, "offset_percent", -1);
        return c1271v7;
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, Constants.IDENTIFIER, this.f2977a);
        JsonUtils.putString(jSONObject, NotificationCompat.CATEGORY_EVENT, this.f2978b);
        JsonUtils.putString(jSONObject, "uri_string", this.f2979c);
        JsonUtils.putLong(jSONObject, "offset_seconds", this.f2981e);
        JsonUtils.putInt(jSONObject, "offset_percent", this.f2982f);
        return jSONObject;
    }
}
