package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C3233is;
import com.ironsource.C3236iw;
import com.ironsource.C3551q9;
import com.ironsource.C3601ro;
import com.ironsource.InterfaceC3874yk;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.u */
/* loaded from: classes2.dex */
public class C3656u {

    /* renamed from: d */
    private static final String f11656d = "u";

    /* renamed from: e */
    private static final String f11657e = "updateToken";

    /* renamed from: f */
    private static final String f11658f = "getToken";

    /* renamed from: g */
    private static final String f11659g = "functionName";

    /* renamed from: h */
    private static final String f11660h = "functionParams";

    /* renamed from: i */
    private static final String f11661i = "success";

    /* renamed from: j */
    private static final String f11662j = "fail";

    /* renamed from: b */
    private Context f11664b;

    /* renamed from: a */
    private C3601ro f11663a = new C3601ro();

    /* renamed from: c */
    private C3236iw f11665c = new C3236iw();

    /* renamed from: com.ironsource.sdk.controller.u$b */
    public static class b {

        /* renamed from: a */
        String f11666a;

        /* renamed from: b */
        JSONObject f11667b;

        /* renamed from: c */
        String f11668c;

        /* renamed from: d */
        String f11669d;

        private b() {
        }
    }

    public C3656u(Context context) {
        this.f11664b = context;
    }

    /* renamed from: a */
    private b m12075a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f11666a = jSONObject.optString("functionName");
        bVar.f11667b = jSONObject.optJSONObject("functionParams");
        bVar.f11668c = jSONObject.optString("success");
        bVar.f11669d = jSONObject.optString("fail");
        return bVar;
    }

    /* renamed from: a */
    private void m12076a(b bVar, InterfaceC3874yk interfaceC3874yk) throws JSONException {
        try {
            JSONObject jSONObjectM9397a = this.f11665c.m9397a();
            Iterator<String> itKeys = jSONObjectM9397a.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectM9397a.get(next);
                if (obj instanceof String) {
                    jSONObjectM9397a.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC3874yk.mo12253a(true, bVar.f11668c, jSONObjectM9397a);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            interfaceC3874yk.mo12252a(false, bVar.f11669d, e.getMessage());
        }
    }

    /* renamed from: a */
    public void m12077a(String str, InterfaceC3874yk interfaceC3874yk) throws Exception {
        b bVarM12075a = m12075a(str);
        if (f11657e.equals(bVarM12075a.f11666a)) {
            m12078a(bVarM12075a.f11667b, bVarM12075a, interfaceC3874yk);
            return;
        }
        if (f11658f.equals(bVarM12075a.f11666a)) {
            m12076a(bVarM12075a, interfaceC3874yk);
            return;
        }
        Logger.m12266i(f11656d, "unhandled API request " + str);
    }

    /* renamed from: a */
    public void m12078a(JSONObject jSONObject, b bVar, InterfaceC3874yk interfaceC3874yk) {
        C3233is c3233is = new C3233is();
        try {
            this.f11663a.m11749a(jSONObject);
            interfaceC3874yk.mo12251a(true, bVar.f11668c, c3233is);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            Logger.m12266i(f11656d, "updateToken exception " + e.getMessage());
            interfaceC3874yk.mo12251a(false, bVar.f11669d, c3233is);
        }
    }
}
