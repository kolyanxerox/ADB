package com.iab.omid.library.ironsrc.adsession;

import com.iab.omid.library.ironsrc.utils.C2558c;
import com.iab.omid.library.ironsrc.utils.C2562g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        this.creativeType = creativeType;
        this.impressionType = impressionType;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z) {
        C2562g.m4415a(creativeType, "CreativeType is null");
        C2562g.m4415a(impressionType, "ImpressionType is null");
        C2562g.m4415a(owner, "Impression owner is null");
        C2562g.m4413a(owner, creativeType, impressionType);
        return new AdSessionConfiguration(creativeType, impressionType, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C2558c.m4390a(jSONObject, "impressionOwner", this.impressionOwner);
        C2558c.m4390a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        C2558c.m4390a(jSONObject, "creativeType", this.creativeType);
        C2558c.m4390a(jSONObject, "impressionType", this.impressionType);
        C2558c.m4390a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
