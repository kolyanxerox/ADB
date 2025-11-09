package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.u0 */
/* loaded from: classes2.dex */
public interface InterfaceC3717u0 {

    /* renamed from: com.ironsource.u0$a */
    public static final class a implements InterfaceC3717u0 {

        /* renamed from: a */
        private final JSONObject f12116a;

        public a(JSONObject applicationConfig) {
            kotlin.jvm.internal.OooOo.OooO0o0(applicationConfig, "applicationConfig");
            this.f12116a = applicationConfig;
        }

        @Override // com.ironsource.InterfaceC3717u0
        /* renamed from: a */
        public JSONObject mo12501a() {
            JSONObject jSONObjectOptJSONObject = this.f12116a.optJSONObject("controllerConfig");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        @Override // com.ironsource.InterfaceC3717u0
        /* renamed from: b */
        public int mo12502b() {
            int iOptInt = this.f12116a.optInt("debugMode", 0);
            if (this.f12116a.optBoolean(b.f12121e, false)) {
                return 3;
            }
            return iOptInt;
        }

        @Override // com.ironsource.InterfaceC3717u0
        /* renamed from: c */
        public String mo12503c() {
            String strOptString = this.f12116a.optString("controllerUrl");
            return strOptString == null ? "" : strOptString;
        }
    }

    /* renamed from: com.ironsource.u0$b */
    public static final class b {

        /* renamed from: a */
        public static final b f12117a = new b();

        /* renamed from: b */
        public static final String f12118b = "controllerUrl";

        /* renamed from: c */
        public static final String f12119c = "controllerConfig";

        /* renamed from: d */
        public static final String f12120d = "debugMode";

        /* renamed from: e */
        public static final String f12121e = "adptDebugMode";

        private b() {
        }
    }

    /* renamed from: a */
    JSONObject mo12501a();

    /* renamed from: b */
    int mo12502b();

    /* renamed from: c */
    String mo12503c();
}
