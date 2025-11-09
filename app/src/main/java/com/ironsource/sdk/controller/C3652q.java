package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C2959b4;
import com.ironsource.C3233is;
import com.ironsource.C3551q9;
import com.ironsource.InterfaceC3874yk;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.q */
/* loaded from: classes2.dex */
public class C3652q {

    /* renamed from: b */
    private static final String f11634b = "q";

    /* renamed from: c */
    private static final String f11635c = "getPermissions";

    /* renamed from: d */
    private static final String f11636d = "isPermissionGranted";

    /* renamed from: e */
    private static final String f11637e = "permissions";

    /* renamed from: f */
    private static final String f11638f = "permission";

    /* renamed from: g */
    private static final String f11639g = "status";

    /* renamed from: h */
    private static final String f11640h = "functionName";

    /* renamed from: i */
    private static final String f11641i = "functionParams";

    /* renamed from: j */
    private static final String f11642j = "success";

    /* renamed from: k */
    private static final String f11643k = "fail";

    /* renamed from: l */
    private static final String f11644l = "unhandledPermission";

    /* renamed from: a */
    private Context f11645a;

    /* renamed from: com.ironsource.sdk.controller.q$b */
    public static class b {

        /* renamed from: a */
        String f11646a;

        /* renamed from: b */
        JSONObject f11647b;

        /* renamed from: c */
        String f11648c;

        /* renamed from: d */
        String f11649d;

        private b() {
        }
    }

    public C3652q(Context context) {
        this.f11645a = context;
    }

    /* renamed from: a */
    private b m12059a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f11646a = jSONObject.optString("functionName");
        bVar.f11647b = jSONObject.optJSONObject("functionParams");
        bVar.f11648c = jSONObject.optString("success");
        bVar.f11649d = jSONObject.optString("fail");
        return bVar;
    }

    /* renamed from: b */
    public void m12062b(JSONObject jSONObject, b bVar, InterfaceC3874yk interfaceC3874yk) throws JSONException {
        String str;
        boolean z;
        C3233is c3233is = new C3233is();
        try {
            String string = jSONObject.getString(f11638f);
            c3233is.m9391b(f11638f, string);
            if (C2959b4.m7871d(this.f11645a, string)) {
                c3233is.m9391b("status", String.valueOf(C2959b4.m7869c(this.f11645a, string)));
                str = bVar.f11648c;
                z = true;
            } else {
                c3233is.m9391b("status", f11644l);
                str = bVar.f11649d;
                z = false;
            }
            interfaceC3874yk.mo12251a(z, str, c3233is);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            c3233is.m9391b("errMsg", e.getMessage());
            interfaceC3874yk.mo12251a(false, bVar.f11649d, c3233is);
        }
    }

    /* renamed from: a */
    public void m12060a(String str, InterfaceC3874yk interfaceC3874yk) throws Exception {
        b bVarM12059a = m12059a(str);
        if (f11635c.equals(bVarM12059a.f11646a)) {
            m12061a(bVarM12059a.f11647b, bVarM12059a, interfaceC3874yk);
            return;
        }
        if (f11636d.equals(bVarM12059a.f11646a)) {
            m12062b(bVarM12059a.f11647b, bVarM12059a, interfaceC3874yk);
            return;
        }
        Logger.m12266i(f11634b, "PermissionsJSAdapter unhandled API request " + str);
    }

    /* renamed from: a */
    public void m12061a(JSONObject jSONObject, b bVar, InterfaceC3874yk interfaceC3874yk) throws JSONException {
        C3233is c3233is = new C3233is();
        try {
            c3233is.m9388a(f11637e, C2959b4.m7864a(this.f11645a, jSONObject.getJSONArray(f11637e)));
            interfaceC3874yk.mo12251a(true, bVar.f11648c, c3233is);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            Logger.m12266i(f11634b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e.getMessage());
            c3233is.m9391b("errMsg", e.getMessage());
            interfaceC3874yk.mo12251a(false, bVar.f11649d, c3233is);
        }
    }
}
