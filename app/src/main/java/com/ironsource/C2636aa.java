package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3912zo;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.aa */
/* loaded from: classes2.dex */
public class C2636aa {

    /* renamed from: c */
    private static final String f3931c = "aa";

    /* renamed from: d */
    private static final String f3932d = "setSharedSignal";

    /* renamed from: e */
    private static final String f3933e = "getSharedSignal";

    /* renamed from: f */
    private static final String f3934f = "functionName";

    /* renamed from: g */
    private static final String f3935g = "functionParams";

    /* renamed from: h */
    private static final String f3936h = "success";

    /* renamed from: i */
    private static final String f3937i = "fail";

    /* renamed from: a */
    private final Context f3938a;

    /* renamed from: b */
    C3897z9 f3939b;

    /* renamed from: com.ironsource.aa$a */
    public static class a {

        /* renamed from: a */
        String f3940a;

        /* renamed from: b */
        JSONObject f3941b;

        /* renamed from: c */
        String f3942c;

        /* renamed from: d */
        String f3943d;

        private a() {
        }

        /* renamed from: a */
        public static a m4808a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f3940a = jSONObject.optString("functionName");
            aVar.f3941b = jSONObject.optJSONObject("functionParams");
            aVar.f3942c = jSONObject.optString("success");
            aVar.f3943d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public C2636aa(Context context, C3897z9 c3897z9) {
        this.f3938a = context;
        this.f3939b = c3897z9;
    }

    /* renamed from: a */
    private a m4803a(String str) throws JSONException {
        return a.m4808a(new JSONObject(str));
    }

    /* renamed from: b */
    private void m4806b(Context context, a aVar, InterfaceC3874yk interfaceC3874yk) {
        C3233is c3233is = new C3233is();
        JSONObject jSONObject = aVar.f3941b;
        this.f3939b.mo9676a(context, EnumC3863y9.m13176a(jSONObject.optString("source")), jSONObject.optString("key"), jSONObject.optString("data"));
        interfaceC3874yk.mo12251a(true, aVar.f3942c, c3233is);
    }

    /* renamed from: a */
    private void m4804a(Context context, a aVar, InterfaceC3874yk interfaceC3874yk) throws JSONException {
        C3233is c3233is = new C3233is();
        JSONObject jSONObject = aVar.f3941b;
        c3233is.m9391b("data", this.f3939b.mo9786a(context, EnumC3863y9.m13176a(jSONObject.optString("source")), jSONObject.optString("key")));
        interfaceC3874yk.mo12251a(true, aVar.f3942c, c3233is);
    }

    /* renamed from: a */
    private void m4805a(a aVar, InterfaceC3874yk interfaceC3874yk, Exception exc) throws JSONException {
        C3551q9.m11517d().m11519a(exc);
        String message = exc.getMessage();
        Logger.m12266i(f3931c, aVar.f3940a + " exception " + message);
        C3233is c3233is = new C3233is();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c3233is.m9391b(C3912zo.a.f13038g, message);
        interfaceC3874yk.mo12251a(false, aVar.f3943d, c3233is);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m4807a(java.lang.String r7, com.ironsource.InterfaceC3874yk r8) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.String r0 = "unsupported API: "
            com.ironsource.aa$a r1 = r6.m4803a(r7)
            java.lang.String r2 = r1.f3940a     // Catch: java.lang.Exception -> L22
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> L22
            r4 = 576059875(0x2255f9e3, float:2.8999172E-18)
            r5 = 1
            if (r3 == r4) goto L24
            r4 = 1486812399(0x589ef4ef, float:1.3981986E15)
            if (r3 == r4) goto L18
            goto L2e
        L18:
            java.lang.String r3 = "setSharedSignal"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L22
            if (r2 == 0) goto L2e
            r2 = 0
            goto L2f
        L22:
            r7 = move-exception
            goto L51
        L24:
            java.lang.String r3 = "getSharedSignal"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L22
            if (r2 == 0) goto L2e
            r2 = r5
            goto L2f
        L2e:
            r2 = -1
        L2f:
            if (r2 == 0) goto L4b
            if (r2 != r5) goto L39
            android.content.Context r7 = r6.f3938a     // Catch: java.lang.Exception -> L22
            r6.m4804a(r7, r1, r8)     // Catch: java.lang.Exception -> L22
            return
        L39:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Exception -> L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22
            r3.<init>(r0)     // Catch: java.lang.Exception -> L22
            r3.append(r7)     // Catch: java.lang.Exception -> L22
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Exception -> L22
            r2.<init>(r7)     // Catch: java.lang.Exception -> L22
            throw r2     // Catch: java.lang.Exception -> L22
        L4b:
            android.content.Context r7 = r6.f3938a     // Catch: java.lang.Exception -> L22
            r6.m4806b(r7, r1, r8)     // Catch: java.lang.Exception -> L22
            return
        L51:
            r6.m4805a(r1, r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C2636aa.m4807a(java.lang.String, com.ironsource.yk):void");
    }
}
