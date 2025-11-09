package com.applovin.impl;

import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.p7 */
/* loaded from: classes.dex */
public abstract class AbstractC1157p7 {

    /* renamed from: f */
    private static final List f1725f = Arrays.asList("video/mp4", MimeTypes.VIDEO_WEBM, "video/3gpp", "video/x-matroska");

    /* renamed from: a */
    private final C1220k f1726a;

    /* renamed from: c */
    private final JSONObject f1728c;

    /* renamed from: d */
    private final JSONObject f1729d;

    /* renamed from: b */
    protected List f1727b = new ArrayList();

    /* renamed from: e */
    private final long f1730e = System.currentTimeMillis();

    public AbstractC1157p7(JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
        this.f1726a = c1220k;
        this.f1728c = jSONObject;
        this.f1729d = jSONObject2;
    }

    /* renamed from: a */
    public List m2079a() {
        return this.f1727b;
    }

    /* renamed from: b */
    public JSONObject m2080b() {
        return this.f1728c;
    }

    /* renamed from: c */
    public long m2081c() {
        return this.f1730e;
    }

    /* renamed from: d */
    public int m2082d() {
        return this.f1727b.size();
    }

    /* renamed from: e */
    public JSONObject m2083e() {
        return this.f1729d;
    }

    /* renamed from: f */
    public List m2084f() {
        List<String> listExplode = CollectionUtils.explode(JsonUtils.getString(this.f1728c, "vast_preferred_video_types", null));
        return !listExplode.isEmpty() ? listExplode : f1725f;
    }

    /* renamed from: g */
    public int m2085g() {
        return AbstractC1078k7.m1222c(JsonUtils.getInt(this.f1728c, "video_completion_percent", -1));
    }
}
