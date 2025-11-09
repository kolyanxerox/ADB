package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.C3551q9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.g */
/* loaded from: classes2.dex */
final class C3642g {

    /* renamed from: c */
    private static final String f11541c = "com.ironsource.sdk.controller.g";

    /* renamed from: d */
    private static final String f11542d = "functionName";

    /* renamed from: e */
    private static final String f11543e = "params";

    /* renamed from: f */
    private static final String f11544f = "hash";

    /* renamed from: a */
    private final C3637b f11545a;

    /* renamed from: b */
    private final C3654s f11546b;

    public C3642g(C3637b c3637b, C3654s c3654s) {
        this.f11545a = c3637b;
        this.f11546b = c3654s;
    }

    /* renamed from: a */
    private String m12026a(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put(f11544f, SDKUtils.encodeString(str3));
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    private void m12030b(String str, String str2, String str3) {
        this.f11545a.m11929a(m12026a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.m12266i(f11541c, "messageHandler(" + str + StringUtils.SPACE + str3 + ")");
            if (this.f11546b.m12067a(str, str2, str3)) {
                m12029a(str, str2);
            } else {
                m12030b(str, str2, str3);
            }
        } catch (Exception e) {
            m12027a(e);
        }
    }

    /* renamed from: a */
    private void m12027a(Exception exc) {
        if (!(exc instanceof NoSuchMethodException)) {
            m12028a(exc.getLocalizedMessage());
            return;
        }
        IronLog.INTERNAL.error(exc.toString());
        Logger.m12266i(f11541c, "messageHandler failed with exception " + exc.getMessage());
    }

    /* renamed from: a */
    private void m12028a(String str) {
        this.f11545a.m11931b(str);
    }

    /* renamed from: a */
    private void m12029a(String str, String str2) throws Exception {
        this.f11545a.m11930a(str, str2);
    }
}
