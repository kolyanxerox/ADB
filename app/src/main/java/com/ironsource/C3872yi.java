package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.yi */
/* loaded from: classes2.dex */
public final class C3872yi {

    /* renamed from: a */
    public static final C3872yi f12753a = new C3872yi();

    private C3872yi() {
    }

    /* renamed from: a */
    public static final JSONObject m13204a() throws JSONException {
        new C3190hk().m9141b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectPut = new JSONObject().put("data", IronSourceAES.encode(C3359mb.m10015b().m10017c(), new C3838xi().m13068a().toString()));
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectPut, "InitProvider()\n        .…ATA_KEY, encryptedData) }");
        return jSONObjectPut;
    }
}
