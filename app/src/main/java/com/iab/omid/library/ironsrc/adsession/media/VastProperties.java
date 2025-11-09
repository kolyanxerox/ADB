package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.utils.C2559d;
import com.iab.omid.library.ironsrc.utils.C2562g;
import com.ironsource.C3034d9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f3592a;

    /* renamed from: b */
    private final Float f3593b;

    /* renamed from: c */
    private final boolean f3594c;

    /* renamed from: d */
    private final Position f3595d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f3592a = z;
        this.f3593b = f;
        this.f3594c = z2;
        this.f3595d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C2562g.m4415a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C2562g.m4415a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m4251a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f3592a);
            if (this.f3592a) {
                jSONObject.put("skipOffset", this.f3593b);
            }
            jSONObject.put("autoPlay", this.f3594c);
            jSONObject.put(C3034d9.h.f8078L, this.f3595d);
            return jSONObject;
        } catch (JSONException e) {
            C2559d.m4405a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f3595d;
    }

    public Float getSkipOffset() {
        return this.f3593b;
    }

    public boolean isAutoPlay() {
        return this.f3594c;
    }

    public boolean isSkippable() {
        return this.f3592a;
    }
}
