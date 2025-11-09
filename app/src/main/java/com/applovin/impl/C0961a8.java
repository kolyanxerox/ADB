package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a8 */
/* loaded from: classes.dex */
public class C0961a8 {

    /* renamed from: a */
    private final int f205a;

    /* renamed from: b */
    private final int f206b;

    /* renamed from: c */
    private final int f207c;

    /* renamed from: d */
    private final int f208d;

    /* renamed from: e */
    private final boolean f209e;

    /* renamed from: f */
    private final int f210f;

    /* renamed from: g */
    private final int f211g;

    /* renamed from: h */
    private final int f212h;

    /* renamed from: i */
    private final float f213i;

    /* renamed from: j */
    private final float f214j;

    public C0961a8(JSONObject jSONObject, C1220k c1220k) {
        c1220k.m2847O();
        if (C1240o.m3200a()) {
            c1220k.m2847O().m3215d("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f205a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f206b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f207c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f208d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f209e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", Boolean.FALSE).booleanValue();
        this.f210f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        this.f211g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        this.f212h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
        this.f213i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f214j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    /* renamed from: a */
    public float m139a() {
        return this.f213i;
    }

    /* renamed from: b */
    public long m140b() {
        return this.f211g;
    }

    /* renamed from: c */
    public float m141c() {
        return this.f214j;
    }

    /* renamed from: d */
    public long m142d() {
        return this.f212h;
    }

    /* renamed from: e */
    public int m143e() {
        return this.f208d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0961a8 c0961a8 = (C0961a8) obj;
            if (this.f205a == c0961a8.f205a && this.f206b == c0961a8.f206b && this.f207c == c0961a8.f207c && this.f208d == c0961a8.f208d && this.f209e == c0961a8.f209e && this.f210f == c0961a8.f210f && this.f211g == c0961a8.f211g && this.f212h == c0961a8.f212h && Float.compare(c0961a8.f213i, this.f213i) == 0 && Float.compare(c0961a8.f214j, this.f214j) == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int m144f() {
        return this.f206b;
    }

    /* renamed from: g */
    public int m145g() {
        return this.f207c;
    }

    /* renamed from: h */
    public long m146h() {
        return this.f210f;
    }

    public int hashCode() {
        int i = ((((((((((((((this.f205a * 31) + this.f206b) * 31) + this.f207c) * 31) + this.f208d) * 31) + (this.f209e ? 1 : 0)) * 31) + this.f210f) * 31) + this.f211g) * 31) + this.f212h) * 31;
        float f = this.f213i;
        int iFloatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f214j;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    /* renamed from: i */
    public int m147i() {
        return this.f205a;
    }

    /* renamed from: j */
    public boolean m148j() {
        return this.f209e;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f205a + ", heightPercentOfScreen=" + this.f206b + ", margin=" + this.f207c + ", gravity=" + this.f208d + ", tapToFade=" + this.f209e + ", tapToFadeDurationMillis=" + this.f210f + ", fadeInDurationMillis=" + this.f211g + ", fadeOutDurationMillis=" + this.f212h + ", fadeInDelay=" + this.f213i + ", fadeOutDelay=" + this.f214j + '}';
    }
}
