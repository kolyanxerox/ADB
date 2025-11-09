package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C3611s;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.z7 */
/* loaded from: classes.dex */
public class C1307z7 implements InterfaceC1135n4 {

    /* renamed from: a */
    private Uri f3244a;

    /* renamed from: b */
    private Uri f3245b;

    /* renamed from: c */
    private a f3246c;

    /* renamed from: d */
    private String f3247d;

    /* renamed from: e */
    private int f3248e;

    /* renamed from: f */
    private int f3249f;

    /* renamed from: g */
    private long f3250g;

    /* renamed from: com.applovin.impl.z7$a */
    public enum a {
        Progressive,
        Streaming
    }

    private C1307z7() {
    }

    /* renamed from: a */
    public static C1307z7 m3893a(C1099m8 c1099m8, C1220k c1220k) {
        if (c1099m8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        try {
            String strM1517d = c1099m8.m1517d();
            if (!URLUtil.isValidUrl(strM1517d)) {
                c1220k.m2847O();
                if (!C1240o.m3200a()) {
                    return null;
                }
                c1220k.m2847O().m3214b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            }
            Uri uri = Uri.parse(strM1517d);
            C1307z7 c1307z7 = new C1307z7();
            c1307z7.f3244a = uri;
            c1307z7.f3245b = uri;
            c1307z7.f3250g = m3891a(c1099m8);
            c1307z7.f3246c = m3892a((String) c1099m8.m1512a().get(C3611s.f11242g));
            c1307z7.f3249f = StringUtils.parseInt((String) c1099m8.m1512a().get("height"));
            c1307z7.f3248e = StringUtils.parseInt((String) c1099m8.m1512a().get("width"));
            c1307z7.f3247d = ((String) c1099m8.m1512a().get("type")).toLowerCase(Locale.ENGLISH);
            return c1307z7;
        } catch (Throwable th) {
            c1220k.m2847O();
            if (C1240o.m3200a()) {
                c1220k.m2847O().m3212a("VastVideoFile", "Error occurred while initializing", th);
            }
            c1220k.m2832E().m2152a("VastVideoFile", th);
            return null;
        }
    }

    /* renamed from: b */
    public long m3896b() {
        return this.f3250g;
    }

    /* renamed from: c */
    public String m3897c() {
        return this.f3247d;
    }

    /* renamed from: d */
    public Uri m3898d() {
        return this.f3244a;
    }

    /* renamed from: e */
    public Uri m3899e() {
        return this.f3245b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1307z7)) {
            return false;
        }
        C1307z7 c1307z7 = (C1307z7) obj;
        if (this.f3248e != c1307z7.f3248e || this.f3249f != c1307z7.f3249f || this.f3250g != c1307z7.f3250g) {
            return false;
        }
        Uri uri = this.f3244a;
        if (uri == null ? c1307z7.f3244a != null : !uri.equals(c1307z7.f3244a)) {
            return false;
        }
        Uri uri2 = this.f3245b;
        if (uri2 == null ? c1307z7.f3245b != null : !uri2.equals(c1307z7.f3245b)) {
            return false;
        }
        if (this.f3246c != c1307z7.f3246c) {
            return false;
        }
        String str = this.f3247d;
        String str2 = c1307z7.f3247d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f3244a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f3245b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f3246c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f3247d;
        return Long.valueOf(this.f3250g).hashCode() + ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f3248e) * 31) + this.f3249f) * 31);
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f3244a + ", videoUri=" + this.f3245b + ", deliveryType=" + this.f3246c + ", fileType='" + this.f3247d + "', width=" + this.f3248e + ", height=" + this.f3249f + ", bitrate=" + this.f3250g + '}';
    }

    /* renamed from: a */
    private static a m3892a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    /* renamed from: a */
    private static long m3891a(C1099m8 c1099m8) {
        Map mapM1512a = c1099m8.m1512a();
        long j = StringUtils.parseLong((String) mapM1512a.get("bitrate"), 0L);
        if (j != 0) {
            return j;
        }
        return (StringUtils.parseLong((String) mapM1512a.get("maxBitrate"), 0L) + StringUtils.parseLong((String) mapM1512a.get("minBitrate"), 0L)) / 2;
    }

    /* renamed from: a */
    public void m3895a(Uri uri) {
        this.f3245b = uri;
    }

    /* renamed from: a */
    public static C1307z7 m3894a(JSONObject jSONObject, C1220k c1220k) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "source_video_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        Uri uri = Uri.parse(string);
        if (TextUtils.isEmpty(JsonUtils.getString(jSONObject, "video_uri", null))) {
            return null;
        }
        Uri uri2 = Uri.parse(string);
        String string2 = JsonUtils.getString(jSONObject, "file_type", null);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        a aVarValueOf = a.valueOf(JsonUtils.getString(jSONObject, "delivery_type", a.Progressive.toString()));
        int i = JsonUtils.getInt(jSONObject, "width", 0);
        int i2 = JsonUtils.getInt(jSONObject, "height", 0);
        int i3 = JsonUtils.getInt(jSONObject, "bitrate", 0);
        C1307z7 c1307z7 = new C1307z7();
        c1307z7.f3244a = uri;
        c1307z7.f3245b = uri2;
        c1307z7.f3246c = aVarValueOf;
        c1307z7.f3247d = string2;
        c1307z7.f3248e = i;
        c1307z7.f3249f = i2;
        c1307z7.f3250g = i3;
        return c1307z7;
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        Uri uri = this.f3244a;
        if (uri != null) {
            JsonUtils.putString(jSONObject, "source_video_uri", uri.toString());
        }
        Uri uri2 = this.f3245b;
        if (uri2 != null) {
            JsonUtils.putString(jSONObject, "video_uri", uri2.toString());
        }
        a aVar = this.f3246c;
        JsonUtils.putString(jSONObject, "delivery_type", aVar == null ? null : aVar.toString());
        JsonUtils.putString(jSONObject, "file_type", this.f3247d);
        JsonUtils.putInt(jSONObject, "width", this.f3248e);
        JsonUtils.putInt(jSONObject, "height", this.f3249f);
        JsonUtils.putLong(jSONObject, "bitrate", this.f3250g);
        return jSONObject;
    }
}
