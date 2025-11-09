package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.utils.C2606d;
import com.iab.omid.library.unity3d.utils.C2609g;
import com.ironsource.C3034d9;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f3728a;

    /* renamed from: b */
    private final Float f3729b;

    /* renamed from: c */
    private final boolean f3730c;

    /* renamed from: d */
    private final Position f3731d;

    private VastProperties(boolean z, Float f, boolean z2, Position position) {
        this.f3728a = z;
        this.f3729b = f;
        this.f3730c = z2;
        this.f3731d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position) {
        C2609g.m4654a(position, "Position is null");
        return new VastProperties(false, null, z, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position) {
        C2609g.m4654a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position);
    }

    /* renamed from: a */
    public JSONObject m4507a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f3728a);
            if (this.f3728a) {
                jSONObject.put("skipOffset", this.f3729b);
            }
            jSONObject.put("autoPlay", this.f3730c);
            jSONObject.put(C3034d9.h.f8078L, this.f3731d);
            return jSONObject;
        } catch (JSONException e) {
            C2606d.m4645a("VastProperties: JSON error", e);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f3731d;
    }

    public Float getSkipOffset() {
        return this.f3729b;
    }

    public boolean isAutoPlay() {
        return this.f3730c;
    }

    public boolean isSkippable() {
        return this.f3728a;
    }
}
