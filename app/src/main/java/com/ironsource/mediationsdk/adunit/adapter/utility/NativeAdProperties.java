package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C3551q9;
import kotlin.jvm.internal.OooOo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class NativeAdProperties {
    private final AdOptionsPosition adOptionsPosition;
    private final AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(JSONObject config) {
        OooOo.OooO0o0(config, "config");
        this.defaultAdOptionPosition = AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(config);
    }

    public final AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    private final AdOptionsPosition getAdOptionsPosition(JSONObject jSONObject) {
        String position = jSONObject.optString(AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            OooOo.OooO0Oo(position, "position");
            return AdOptionsPosition.valueOf(position);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return this.defaultAdOptionPosition;
        }
    }
}
