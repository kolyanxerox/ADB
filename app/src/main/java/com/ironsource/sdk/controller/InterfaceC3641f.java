package com.ironsource.sdk.controller;

import java.util.UUID;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.f */
/* loaded from: classes2.dex */
public interface InterfaceC3641f {

    /* renamed from: com.ironsource.sdk.controller.f$a */
    public static final class a {

        /* renamed from: c */
        public static final C4584a f11527c = new C4584a(null);

        /* renamed from: a */
        private final String f11528a;

        /* renamed from: b */
        private final JSONObject f11529b;

        /* renamed from: com.ironsource.sdk.controller.f$a$a, reason: collision with other inner class name */
        public static final class C4584a {
            private C4584a() {
            }

            /* renamed from: a */
            public final a m12014a(String jsonStr) throws JSONException {
                OooOo.OooO0o0(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id = jSONObject.getString(b.f11531b);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
                OooOo.OooO0Oo(id, "id");
                return new a(id, jSONObjectOptJSONObject);
            }

            public /* synthetic */ C4584a(OooOO0O oooOO0O) {
                this();
            }
        }

        public a(String msgId, JSONObject jSONObject) {
            OooOo.OooO0o0(msgId, "msgId");
            this.f11528a = msgId;
            this.f11529b = jSONObject;
        }

        /* renamed from: a */
        public static /* synthetic */ a m12007a(a aVar, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f11528a;
            }
            if ((i & 2) != 0) {
                jSONObject = aVar.f11529b;
            }
            return aVar.m12009a(str, jSONObject);
        }

        /* renamed from: b */
        public final JSONObject m12011b() {
            return this.f11529b;
        }

        /* renamed from: c */
        public final String m12012c() {
            return this.f11528a;
        }

        /* renamed from: d */
        public final JSONObject m12013d() {
            return this.f11529b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return OooOo.OooO00o(this.f11528a, aVar.f11528a) && OooOo.OooO00o(this.f11529b, aVar.f11529b);
        }

        public int hashCode() {
            int iHashCode = this.f11528a.hashCode() * 31;
            JSONObject jSONObject = this.f11529b;
            return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
        }

        public String toString() {
            return "CallbackToNative(msgId=" + this.f11528a + ", params=" + this.f11529b + ')';
        }

        /* renamed from: a */
        public static final a m12008a(String str) throws JSONException {
            return f11527c.m12014a(str);
        }

        /* renamed from: a */
        public final a m12009a(String msgId, JSONObject jSONObject) {
            OooOo.OooO0o0(msgId, "msgId");
            return new a(msgId, jSONObject);
        }

        /* renamed from: a */
        public final String m12010a() {
            return this.f11528a;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$b */
    public static final class b {

        /* renamed from: a */
        public static final b f11530a = new b();

        /* renamed from: b */
        public static final String f11531b = "msgId";

        /* renamed from: c */
        public static final String f11532c = "adId";

        /* renamed from: d */
        public static final String f11533d = "params";

        /* renamed from: e */
        public static final String f11534e = "success";

        /* renamed from: f */
        public static final String f11535f = "reason";

        /* renamed from: g */
        public static final String f11536g = "command";

        private b() {
        }
    }

    /* renamed from: com.ironsource.sdk.controller.f$c */
    public static final class c {

        /* renamed from: a */
        private final String f11537a;

        /* renamed from: b */
        private final String f11538b;

        /* renamed from: c */
        private final JSONObject f11539c;

        /* renamed from: d */
        private String f11540d;

        public c(String adId, String command, JSONObject params) {
            OooOo.OooO0o0(adId, "adId");
            OooOo.OooO0o0(command, "command");
            OooOo.OooO0o0(params, "params");
            this.f11537a = adId;
            this.f11538b = command;
            this.f11539c = params;
            String string = UUID.randomUUID().toString();
            OooOo.OooO0Oo(string, "randomUUID().toString()");
            this.f11540d = string;
        }

        /* renamed from: a */
        public static /* synthetic */ c m12015a(c cVar, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.f11537a;
            }
            if ((i & 2) != 0) {
                str2 = cVar.f11538b;
            }
            if ((i & 4) != 0) {
                jSONObject = cVar.f11539c;
            }
            return cVar.m12016a(str, str2, jSONObject);
        }

        /* renamed from: b */
        public final String m12019b() {
            return this.f11538b;
        }

        /* renamed from: c */
        public final JSONObject m12020c() {
            return this.f11539c;
        }

        /* renamed from: d */
        public final String m12021d() {
            return this.f11537a;
        }

        /* renamed from: e */
        public final String m12022e() {
            return this.f11538b;
        }

        public boolean equals(Object obj) {
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar == null) {
                return false;
            }
            if (this == cVar) {
                return true;
            }
            return OooOo.OooO00o(this.f11540d, cVar.f11540d) && OooOo.OooO00o(this.f11537a, cVar.f11537a) && OooOo.OooO00o(this.f11538b, cVar.f11538b) && OooOo.OooO00o(this.f11539c.toString(), cVar.f11539c.toString());
        }

        /* renamed from: f */
        public final String m12023f() {
            return this.f11540d;
        }

        /* renamed from: g */
        public final JSONObject m12024g() {
            return this.f11539c;
        }

        /* renamed from: h */
        public final String m12025h() {
            String string = new JSONObject().put(b.f11531b, this.f11540d).put(b.f11532c, this.f11537a).put("params", this.f11539c).toString();
            OooOo.OooO0Oo(string, "JSONObject()\n          .…ms)\n          .toString()");
            return string;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return "MessageToController(adId=" + this.f11537a + ", command=" + this.f11538b + ", params=" + this.f11539c + ')';
        }

        /* renamed from: a */
        public final c m12016a(String adId, String command, JSONObject params) {
            OooOo.OooO0o0(adId, "adId");
            OooOo.OooO0o0(command, "command");
            OooOo.OooO0o0(params, "params");
            return new c(adId, command, params);
        }

        /* renamed from: a */
        public final String m12017a() {
            return this.f11537a;
        }

        /* renamed from: a */
        public final void m12018a(String str) {
            OooOo.OooO0o0(str, "<set-?>");
            this.f11540d = str;
        }
    }
}
