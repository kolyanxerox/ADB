package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.w3 */
/* loaded from: classes2.dex */
public final class C3789w3 {

    /* renamed from: a */
    private final Map<LevelPlay.AdFormat, C3506p> f12439a;

    public C3789w3(JSONObject applicationAuctionSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(applicationAuctionSettings, "applicationAuctionSettings");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        int iOooOOOO = o00O0.o0O0O00.OooOOOO(adFormatArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iOooOOOO < 16 ? 16 : iOooOOOO);
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = applicationAuctionSettings.optJSONObject(C2951av.m7841a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new C3506p(jSONObjectOptJSONObject));
        }
        this.f12439a = linkedHashMap;
    }

    /* renamed from: a */
    public final Map<LevelPlay.AdFormat, C3506p> m12839a() {
        return this.f12439a;
    }
}
