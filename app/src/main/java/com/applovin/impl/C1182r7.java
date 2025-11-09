package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.r7 */
/* loaded from: classes.dex */
public class C1182r7 implements InterfaceC1135n4 {

    /* renamed from: a */
    public final Set f1864a = new HashSet();

    /* renamed from: b */
    public final Set f1865b = new HashSet();

    /* renamed from: c */
    private Uri f1866c;

    /* renamed from: d */
    private Uri f1867d;

    /* renamed from: e */
    private int f1868e;

    /* renamed from: f */
    private int f1869f;

    /* renamed from: a */
    public static C1182r7 m2347a(C1099m8 c1099m8, C1220k c1220k) throws NumberFormatException {
        if (c1099m8 == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        C1099m8 c1099m8M1515c = c1099m8.m1515c("StaticResource");
        if (c1099m8M1515c == null || !URLUtil.isValidUrl(c1099m8M1515c.m1517d())) {
            c1220k.m2847O();
            if (!C1240o.m3200a()) {
                return null;
            }
            c1220k.m2847O().m3214b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        C1182r7 c1182r7 = new C1182r7();
        c1182r7.f1866c = Uri.parse(c1099m8M1515c.m1517d());
        C1099m8 c1099m8M1513b = c1099m8.m1513b("IconClickThrough");
        if (c1099m8M1513b != null && URLUtil.isValidUrl(c1099m8M1513b.m1517d())) {
            c1182r7.f1867d = Uri.parse(c1099m8M1513b.m1517d());
        }
        String str = (String) c1099m8.m1512a().get("width");
        int i = 0;
        int i2 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) c1099m8.m1512a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) c1220k.m2866a(C1268v4.f2631M4)).intValue();
        if (i2 <= 0 || i <= 0) {
            c1182r7.f1869f = iIntValue;
            c1182r7.f1868e = iIntValue;
            return c1182r7;
        }
        double d = i2 / i;
        int iMin = Math.min(Math.max(i2, i), iIntValue);
        if (i2 >= i) {
            c1182r7.f1868e = iMin;
            c1182r7.f1869f = (int) (iMin / d);
            return c1182r7;
        }
        c1182r7.f1869f = iMin;
        c1182r7.f1868e = (int) (iMin * d);
        return c1182r7;
    }

    /* renamed from: b */
    public Set m2349b() {
        return this.f1864a;
    }

    /* renamed from: c */
    public Uri m2350c() {
        return this.f1867d;
    }

    /* renamed from: d */
    public int m2351d() {
        return this.f1869f;
    }

    /* renamed from: e */
    public Uri m2352e() {
        return this.f1866c;
    }

    /* renamed from: f */
    public Set m2353f() {
        return this.f1865b;
    }

    /* renamed from: g */
    public int m2354g() {
        return this.f1868e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + m2352e() + "', clickUri='" + m2350c() + "', width=" + m2354g() + ", height=" + m2351d() + "}";
    }

    /* renamed from: a */
    public static ImageView m2346a(Uri uri, Context context, C1220k c1220k) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, c1220k);
        return imageView;
    }

    /* renamed from: a */
    public static C1182r7 m2348a(JSONObject jSONObject, C1220k c1220k) {
        C1271v7 c1271v7M3575a;
        C1271v7 c1271v7M3575a2;
        if (jSONObject == null) {
            return null;
        }
        C1182r7 c1182r7 = new C1182r7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        c1182r7.f1866c = Uri.parse(string);
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("click_trackers", jSONObject);
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null);
            if (jSONObject2 != null && (c1271v7M3575a2 = C1271v7.m3575a(jSONObject2, c1220k)) != null) {
                c1182r7.f1864a.add(c1271v7M3575a2);
            }
        }
        JSONArray jSONArrayOooOOoo2 = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("view_trackers", jSONObject);
        for (int i2 = 0; i2 < jSONArrayOooOOoo2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayOooOOoo2, i2, (JSONObject) null);
            if (jSONObject3 != null && (c1271v7M3575a = C1271v7.m3575a(jSONObject3, c1220k)) != null) {
                c1182r7.f1865b.add(c1271v7M3575a);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        c1182r7.f1867d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        c1182r7.f1868e = JsonUtils.getInt(jSONObject, "width", 0);
        c1182r7.f1869f = JsonUtils.getInt(jSONObject, "height", 0);
        return c1182r7;
    }

    @Override // com.applovin.impl.InterfaceC1135n4
    /* renamed from: a */
    public JSONObject mo1363a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f1864a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C1271v7) it.next()).mo1363a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f1865b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((C1271v7) it2.next()).mo1363a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f1866c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f1867d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.f1868e);
        JsonUtils.putInt(jSONObject, "height", this.f1869f);
        return jSONObject;
    }
}
