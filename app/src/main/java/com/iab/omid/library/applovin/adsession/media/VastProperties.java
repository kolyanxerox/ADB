package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.C2508d;
import com.iab.omid.library.applovin.utils.C2511g;
import com.ironsource.C3034d9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f3457a;

    /* renamed from: b */
    private final Float f3458b;

    /* renamed from: c */
    private final boolean f3459c;

    /* renamed from: d */
    private final Position f3460d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f3457a = z;
        this.f3458b = f;
        this.f3459c = z2;
        this.f3460d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C2511g.m4162a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C2511g.m4162a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m3998a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f3457a);
            if (this.f3457a) {
                jSONObject.put("skipOffset", this.f3458b);
            }
            jSONObject.put("autoPlay", this.f3459c);
            jSONObject.put(C3034d9.h.f8078L, this.f3460d);
            return jSONObject;
        } catch (JSONException e) {
            C2508d.m4152a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f3460d;
    }

    public Float getSkipOffset() {
        return this.f3458b;
    }

    public boolean isAutoPlay() {
        return this.f3459c;
    }

    public boolean isSkippable() {
        return this.f3457a;
    }
}
