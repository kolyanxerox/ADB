package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C3264jp;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.o */
/* loaded from: classes2.dex */
public class C3650o {

    /* renamed from: c */
    private static final String f11607c = "o";

    /* renamed from: d */
    private static final String f11608d = "activate";

    /* renamed from: e */
    private static final String f11609e = "startSession";

    /* renamed from: f */
    private static final String f11610f = "finishSession";

    /* renamed from: g */
    private static final String f11611g = "impressionOccurred";

    /* renamed from: h */
    private static final String f11612h = "getOmidData";

    /* renamed from: i */
    private static final String f11613i = "omidFunction";

    /* renamed from: j */
    private static final String f11614j = "omidParams";

    /* renamed from: k */
    private static final String f11615k = "success";

    /* renamed from: l */
    private static final String f11616l = "fail";

    /* renamed from: m */
    private static final String f11617m = "%s | unsupported OMID API";

    /* renamed from: a */
    private final Context f11618a;

    /* renamed from: b */
    private final C3264jp f11619b = new C3264jp();

    /* renamed from: com.ironsource.sdk.controller.o$b */
    public static class b {

        /* renamed from: a */
        String f11620a;

        /* renamed from: b */
        JSONObject f11621b;

        /* renamed from: c */
        String f11622c;

        /* renamed from: d */
        String f11623d;

        private b() {
        }
    }

    public C3650o(Context context) {
        this.f11618a = context;
    }

    /* renamed from: a */
    private b m12051a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f11620a = jSONObject.optString(f11613i);
        bVar.f11621b = jSONObject.optJSONObject(f11614j);
        bVar.f11622c = jSONObject.optString("success");
        bVar.f11623d = jSONObject.optString("fail");
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m12052a(java.lang.String r9, com.ironsource.InterfaceC3874yk r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C3650o.m12052a(java.lang.String, com.ironsource.yk):void");
    }
}
