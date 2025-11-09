package com.ironsource;

import com.ironsource.sdk.controller.InterfaceC3641f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.qn */
/* loaded from: classes2.dex */
public final class C3565qn {

    /* renamed from: d */
    public static final a f10958d = new a(null);

    /* renamed from: a */
    private final String f10959a;

    /* renamed from: b */
    private final String f10960b;

    /* renamed from: c */
    private final JSONObject f10961c;

    /* renamed from: com.ironsource.qn$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final C3565qn m11597a(String jsonStr) throws JSONException {
            kotlin.jvm.internal.OooOo.OooO0o0(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString(InterfaceC3641f.b.f11532c);
            String command = jSONObject.getString("command");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            kotlin.jvm.internal.OooOo.OooO0Oo(adId, "adId");
            kotlin.jvm.internal.OooOo.OooO0Oo(command, "command");
            return new C3565qn(adId, command, jSONObjectOptJSONObject);
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    public C3565qn(String adId, String command, JSONObject jSONObject) {
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        kotlin.jvm.internal.OooOo.OooO0o0(command, "command");
        this.f10959a = adId;
        this.f10960b = command;
        this.f10961c = jSONObject;
    }

    /* renamed from: a */
    public static /* synthetic */ C3565qn m11588a(C3565qn c3565qn, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3565qn.f10959a;
        }
        if ((i & 2) != 0) {
            str2 = c3565qn.f10960b;
        }
        if ((i & 4) != 0) {
            jSONObject = c3565qn.f10961c;
        }
        return c3565qn.m11590a(str, str2, jSONObject);
    }

    /* renamed from: b */
    public final String m11592b() {
        return this.f10960b;
    }

    /* renamed from: c */
    public final JSONObject m11593c() {
        return this.f10961c;
    }

    /* renamed from: d */
    public final String m11594d() {
        return this.f10959a;
    }

    /* renamed from: e */
    public final String m11595e() {
        return this.f10960b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3565qn)) {
            return false;
        }
        C3565qn c3565qn = (C3565qn) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f10959a, c3565qn.f10959a) && kotlin.jvm.internal.OooOo.OooO00o(this.f10960b, c3565qn.f10960b) && kotlin.jvm.internal.OooOo.OooO00o(this.f10961c, c3565qn.f10961c);
    }

    /* renamed from: f */
    public final JSONObject m11596f() {
        return this.f10961c;
    }

    public int hashCode() {
        int iOooO0O0 = androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(this.f10959a.hashCode() * 31, 31, this.f10960b);
        JSONObject jSONObject = this.f10961c;
        return iOooO0O0 + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "MessageToNative(adId=" + this.f10959a + ", command=" + this.f10960b + ", params=" + this.f10961c + ')';
    }

    /* renamed from: a */
    public static final C3565qn m11589a(String str) throws JSONException {
        return f10958d.m11597a(str);
    }

    /* renamed from: a */
    public final C3565qn m11590a(String adId, String command, JSONObject jSONObject) {
        kotlin.jvm.internal.OooOo.OooO0o0(adId, "adId");
        kotlin.jvm.internal.OooOo.OooO0o0(command, "command");
        return new C3565qn(adId, command, jSONObject);
    }

    /* renamed from: a */
    public final String m11591a() {
        return this.f10959a;
    }
}
