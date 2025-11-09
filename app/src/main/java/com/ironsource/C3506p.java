package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.p */
/* loaded from: classes2.dex */
public final class C3506p {

    /* renamed from: a */
    private final Boolean f10722a;

    public C3506p(JSONObject adFormatAuctionSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f10722a = adFormatAuctionSettings.has("isLoadWhileShow") ? Boolean.valueOf(adFormatAuctionSettings.optBoolean("isLoadWhileShow")) : null;
    }

    /* renamed from: a */
    public final Boolean m11245a() {
        return this.f10722a;
    }
}
