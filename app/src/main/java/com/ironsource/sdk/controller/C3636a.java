package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3098ex;
import com.ironsource.C3256jh;
import com.ironsource.InterfaceC3077eh;
import com.ironsource.InterfaceC3715tx;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.a */
/* loaded from: classes2.dex */
public class C3636a implements InterfaceC3077eh {

    /* renamed from: d */
    private static final String f11416d = "loadWithUrl";

    /* renamed from: e */
    private static final String f11417e = "sendMessage";

    /* renamed from: f */
    public static final String f11418f = "removeAdView";

    /* renamed from: g */
    public static final String f11419g = "webviewAction";

    /* renamed from: h */
    public static final String f11420h = "handleGetViewVisibility";

    /* renamed from: i */
    private static final String f11421i = "functionName";

    /* renamed from: j */
    private static final String f11422j = "functionParams";

    /* renamed from: k */
    private static final String f11423k = "success";

    /* renamed from: l */
    private static final String f11424l = "fail";

    /* renamed from: m */
    public static final String f11425m = "errMsg";

    /* renamed from: n */
    private static final String f11426n = "%s | unsupported AdViews API";

    /* renamed from: a */
    private InterfaceC3715tx f11427a;

    /* renamed from: b */
    private C3256jh f11428b = C3256jh.m9487a();

    /* renamed from: c */
    private Context f11429c;

    /* renamed from: com.ironsource.sdk.controller.a$b */
    public static class b {

        /* renamed from: a */
        String f11430a;

        /* renamed from: b */
        JSONObject f11431b;

        /* renamed from: c */
        String f11432c;

        /* renamed from: d */
        String f11433d;

        private b() {
        }
    }

    public C3636a(Context context) {
        this.f11429c = context;
    }

    /* renamed from: a */
    private b m11926a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f11430a = jSONObject.optString("functionName");
        bVar.f11431b = jSONObject.optJSONObject("functionParams");
        bVar.f11432c = jSONObject.optString("success");
        bVar.f11433d = jSONObject.optString("fail");
        return bVar;
    }

    /* renamed from: a */
    public void m11927a(InterfaceC3715tx interfaceC3715tx) {
        this.f11427a = interfaceC3715tx;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m11928a(java.lang.String r10, com.ironsource.InterfaceC3874yk r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.C3636a.m11928a(java.lang.String, com.ironsource.yk):void");
    }

    @Override // com.ironsource.InterfaceC3077eh
    /* renamed from: a */
    public void mo8491a(String str, String str2, String str3) {
        mo8492a(str, C3098ex.m8573a(str2, str3));
    }

    @Override // com.ironsource.InterfaceC3077eh
    /* renamed from: a */
    public void mo8492a(String str, JSONObject jSONObject) {
        if (this.f11427a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f11427a.mo12234a(str, jSONObject);
    }
}
