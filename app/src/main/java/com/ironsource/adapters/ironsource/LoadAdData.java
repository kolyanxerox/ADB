package com.ironsource.adapters.ironsource;

import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class LoadAdData {
    private final JSONObject localAdData;

    public LoadAdData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String adUnitId() {
        String it = this.localAdData.optString("adUnitId");
        OooOo.OooO0Oo(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final boolean isMultipleAdObjectsFlow() {
        return this.localAdData.optBoolean("isMultipleAdUnits", false);
    }

    public LoadAdData(JSONObject jSONObject) {
        this.localAdData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public /* synthetic */ LoadAdData(JSONObject jSONObject, int i, OooOO0O oooOO0O) {
        this((i & 1) != 0 ? null : jSONObject);
    }
}
