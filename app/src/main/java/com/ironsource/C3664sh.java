package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sh */
/* loaded from: classes2.dex */
public class C3664sh implements InterfaceC3041dg {
    @Override // com.ironsource.InterfaceC3041dg
    /* renamed from: a */
    public String mo8307a(Map<String, Object> map) {
        try {
            return "data=" + Base64.encodeToString(new JSONObject().put(C3037dc.f8241Q, C3037dc.f8242R).put("data", new JSONObject(map)).toString().getBytes(), 2);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
