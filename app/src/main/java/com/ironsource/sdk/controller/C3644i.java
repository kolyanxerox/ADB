package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C3034d9;
import com.ironsource.C3233is;
import com.ironsource.C3495on;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.InterfaceC3874yk;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.i */
/* loaded from: classes2.dex */
public class C3644i {

    /* renamed from: c */
    private static final String f11552c = "i";

    /* renamed from: d */
    private static final String f11553d = "getDeviceData";

    /* renamed from: e */
    private static final String f11554e = "deviceDataFunction";

    /* renamed from: f */
    private static final String f11555f = "deviceDataParams";

    /* renamed from: g */
    private static final String f11556g = "success";

    /* renamed from: h */
    private static final String f11557h = "fail";

    /* renamed from: a */
    private Context f11558a;

    /* renamed from: b */
    private final InterfaceC3767vf f11559b = C3495on.m11199U().mo8686f();

    /* renamed from: com.ironsource.sdk.controller.i$b */
    public static class b {

        /* renamed from: a */
        String f11560a;

        /* renamed from: b */
        JSONObject f11561b;

        /* renamed from: c */
        String f11562c;

        /* renamed from: d */
        String f11563d;

        private b() {
        }
    }

    public C3644i(Context context) {
        this.f11558a = context;
    }

    /* renamed from: a */
    private C3233is m12036a() throws JSONException {
        C3233is c3233is = new C3233is();
        c3233is.m9391b(SDKUtils.encodeString(C3034d9.i.f8188i0), SDKUtils.encodeString(String.valueOf(this.f11559b.mo4844c())));
        c3233is.m9391b(SDKUtils.encodeString(C3034d9.i.f8190j0), SDKUtils.encodeString(String.valueOf(this.f11559b.mo4855h(this.f11558a))));
        c3233is.m9391b(SDKUtils.encodeString(C3034d9.i.f8192k0), SDKUtils.encodeString(String.valueOf(this.f11559b.mo4829J(this.f11558a))));
        c3233is.m9391b(SDKUtils.encodeString(C3034d9.i.f8194l0), SDKUtils.encodeString(String.valueOf(this.f11559b.mo4863l(this.f11558a))));
        c3233is.m9391b(SDKUtils.encodeString(C3034d9.i.f8196m0), SDKUtils.encodeString(String.valueOf(this.f11559b.mo4845c(this.f11558a))));
        c3233is.m9391b(SDKUtils.encodeString(C3034d9.i.f8198n0), SDKUtils.encodeString(String.valueOf(this.f11559b.mo4847d(this.f11558a))));
        return c3233is;
    }

    /* renamed from: a */
    private b m12037a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f11560a = jSONObject.optString(f11554e);
        bVar.f11561b = jSONObject.optJSONObject(f11555f);
        bVar.f11562c = jSONObject.optString("success");
        bVar.f11563d = jSONObject.optString("fail");
        return bVar;
    }

    /* renamed from: a */
    public void m12038a(String str, InterfaceC3874yk interfaceC3874yk) throws Exception {
        b bVarM12037a = m12037a(str);
        if (f11553d.equals(bVarM12037a.f11560a)) {
            interfaceC3874yk.mo12251a(true, bVarM12037a.f11562c, m12036a());
            return;
        }
        Logger.m12266i(f11552c, "unhandled API request " + str);
    }
}
