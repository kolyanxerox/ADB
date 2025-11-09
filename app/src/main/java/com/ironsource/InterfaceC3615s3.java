package com.ironsource;

import com.ironsource.C3034d9;
import com.ironsource.C3419mh;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.s3 */
/* loaded from: classes2.dex */
public interface InterfaceC3615s3 {

    /* renamed from: a */
    public static final b f11265a = b.f11281a;

    /* renamed from: com.ironsource.s3$a */
    public interface a extends InterfaceC3615s3 {

        /* renamed from: com.ironsource.s3$a$a, reason: collision with other inner class name */
        public static final class C4582a implements a {

            /* renamed from: b */
            private final String f11266b;

            /* renamed from: c */
            private final String f11267c;

            /* renamed from: d */
            private final C3419mh.e f11268d;

            /* renamed from: e */
            private final String f11269e;

            /* renamed from: f */
            private final String f11270f;

            /* renamed from: g */
            private final C4583a f11271g;

            /* renamed from: h */
            private final int f11272h;

            /* renamed from: i */
            private final int f11273i;

            /* renamed from: com.ironsource.s3$a$a$a, reason: collision with other inner class name */
            public static final class C4583a {

                /* renamed from: a */
                private final int f11274a;

                /* renamed from: b */
                private final int f11275b;

                public C4583a(int i, int i2) {
                    this.f11274a = i;
                    this.f11275b = i2;
                }

                /* renamed from: a */
                public final int m11817a() {
                    return this.f11274a;
                }

                /* renamed from: b */
                public final int m11819b() {
                    return this.f11275b;
                }

                /* renamed from: c */
                public final int m11820c() {
                    return this.f11274a;
                }

                /* renamed from: d */
                public final int m11821d() {
                    return this.f11275b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4583a)) {
                        return false;
                    }
                    C4583a c4583a = (C4583a) obj;
                    return this.f11274a == c4583a.f11274a && this.f11275b == c4583a.f11275b;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f11275b) + (Integer.hashCode(this.f11274a) * 31);
                }

                public String toString() {
                    StringBuilder sb = new StringBuilder("Coordinates(x=");
                    sb.append(this.f11274a);
                    sb.append(", y=");
                    return OooO0oO.OooOo.OooOOO0(sb, this.f11275b, ')');
                }

                /* renamed from: a */
                public final C4583a m11818a(int i, int i2) {
                    return new C4583a(i, i2);
                }

                /* renamed from: a */
                public static /* synthetic */ C4583a m11816a(C4583a c4583a, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c4583a.f11274a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c4583a.f11275b;
                    }
                    return c4583a.m11818a(i, i2);
                }
            }

            public C4582a(String successCallback, String failCallback, C3419mh.e productType, String demandSourceName, String url, C4583a coordinates, int i, int i2) {
                kotlin.jvm.internal.OooOo.OooO0o0(successCallback, "successCallback");
                kotlin.jvm.internal.OooOo.OooO0o0(failCallback, "failCallback");
                kotlin.jvm.internal.OooOo.OooO0o0(productType, "productType");
                kotlin.jvm.internal.OooOo.OooO0o0(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.OooOo.OooO0o0(url, "url");
                kotlin.jvm.internal.OooOo.OooO0o0(coordinates, "coordinates");
                this.f11266b = successCallback;
                this.f11267c = failCallback;
                this.f11268d = productType;
                this.f11269e = demandSourceName;
                this.f11270f = url;
                this.f11271g = coordinates;
                this.f11272h = i;
                this.f11273i = i2;
            }

            /* renamed from: a */
            public static /* synthetic */ C4582a m11803a(C4582a c4582a, String str, String str2, C3419mh.e eVar, String str3, String str4, C4583a c4583a, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = c4582a.f11266b;
                }
                if ((i3 & 2) != 0) {
                    str2 = c4582a.f11267c;
                }
                if ((i3 & 4) != 0) {
                    eVar = c4582a.f11268d;
                }
                if ((i3 & 8) != 0) {
                    str3 = c4582a.f11269e;
                }
                if ((i3 & 16) != 0) {
                    str4 = c4582a.f11270f;
                }
                if ((i3 & 32) != 0) {
                    c4583a = c4582a.f11271g;
                }
                if ((i3 & 64) != 0) {
                    i = c4582a.f11272h;
                }
                if ((i3 & 128) != 0) {
                    i2 = c4582a.f11273i;
                }
                int i4 = i;
                int i5 = i2;
                String str5 = str4;
                C4583a c4583a2 = c4583a;
                return c4582a.m11804a(str, str2, eVar, str3, str5, c4583a2, i4, i5);
            }

            @Override // com.ironsource.InterfaceC3615s3
            /* renamed from: b */
            public C3419mh.e mo11800b() {
                return this.f11268d;
            }

            @Override // com.ironsource.InterfaceC3615s3
            /* renamed from: c */
            public String mo11801c() {
                return this.f11266b;
            }

            @Override // com.ironsource.InterfaceC3615s3
            /* renamed from: d */
            public String mo11802d() {
                return this.f11269e;
            }

            /* renamed from: e */
            public final String m11805e() {
                return this.f11266b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4582a)) {
                    return false;
                }
                C4582a c4582a = (C4582a) obj;
                return kotlin.jvm.internal.OooOo.OooO00o(this.f11266b, c4582a.f11266b) && kotlin.jvm.internal.OooOo.OooO00o(this.f11267c, c4582a.f11267c) && this.f11268d == c4582a.f11268d && kotlin.jvm.internal.OooOo.OooO00o(this.f11269e, c4582a.f11269e) && kotlin.jvm.internal.OooOo.OooO00o(this.f11270f, c4582a.f11270f) && kotlin.jvm.internal.OooOo.OooO00o(this.f11271g, c4582a.f11271g) && this.f11272h == c4582a.f11272h && this.f11273i == c4582a.f11273i;
            }

            /* renamed from: f */
            public final String m11806f() {
                return this.f11267c;
            }

            /* renamed from: g */
            public final C3419mh.e m11807g() {
                return this.f11268d;
            }

            @Override // com.ironsource.InterfaceC3615s3.a
            public String getUrl() {
                return this.f11270f;
            }

            /* renamed from: h */
            public final String m11808h() {
                return this.f11269e;
            }

            public int hashCode() {
                return Integer.hashCode(this.f11273i) + androidx.datastore.preferences.protobuf.OooO00o.OooO00o(this.f11272h, (this.f11271g.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(androidx.datastore.preferences.protobuf.OooO00o.OooO0O0((this.f11268d.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(this.f11266b.hashCode() * 31, 31, this.f11267c)) * 31, 31, this.f11269e), 31, this.f11270f)) * 31, 31);
            }

            /* renamed from: i */
            public final String m11809i() {
                return this.f11270f;
            }

            /* renamed from: j */
            public final C4583a m11810j() {
                return this.f11271g;
            }

            /* renamed from: k */
            public final int m11811k() {
                return this.f11272h;
            }

            /* renamed from: l */
            public final int m11812l() {
                return this.f11273i;
            }

            /* renamed from: m */
            public final int m11813m() {
                return this.f11272h;
            }

            /* renamed from: n */
            public final C4583a m11814n() {
                return this.f11271g;
            }

            /* renamed from: o */
            public final int m11815o() {
                return this.f11273i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Click(successCallback=");
                sb.append(this.f11266b);
                sb.append(", failCallback=");
                sb.append(this.f11267c);
                sb.append(", productType=");
                sb.append(this.f11268d);
                sb.append(", demandSourceName=");
                sb.append(this.f11269e);
                sb.append(", url=");
                sb.append(this.f11270f);
                sb.append(", coordinates=");
                sb.append(this.f11271g);
                sb.append(", action=");
                sb.append(this.f11272h);
                sb.append(", metaState=");
                return OooO0oO.OooOo.OooOOO0(sb, this.f11273i, ')');
            }

            /* renamed from: a */
            public final C4582a m11804a(String successCallback, String failCallback, C3419mh.e productType, String demandSourceName, String url, C4583a coordinates, int i, int i2) {
                kotlin.jvm.internal.OooOo.OooO0o0(successCallback, "successCallback");
                kotlin.jvm.internal.OooOo.OooO0o0(failCallback, "failCallback");
                kotlin.jvm.internal.OooOo.OooO0o0(productType, "productType");
                kotlin.jvm.internal.OooOo.OooO0o0(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.OooOo.OooO0o0(url, "url");
                kotlin.jvm.internal.OooOo.OooO0o0(coordinates, "coordinates");
                return new C4582a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i, i2);
            }

            @Override // com.ironsource.InterfaceC3615s3
            /* renamed from: a */
            public String mo11799a() {
                return this.f11267c;
            }
        }

        /* renamed from: com.ironsource.s3$a$b */
        public static final class b implements a {

            /* renamed from: b */
            private final String f11276b;

            /* renamed from: c */
            private final String f11277c;

            /* renamed from: d */
            private final C3419mh.e f11278d;

            /* renamed from: e */
            private final String f11279e;

            /* renamed from: f */
            private final String f11280f;

            public b(String successCallback, String failCallback, C3419mh.e productType, String demandSourceName, String url) {
                kotlin.jvm.internal.OooOo.OooO0o0(successCallback, "successCallback");
                kotlin.jvm.internal.OooOo.OooO0o0(failCallback, "failCallback");
                kotlin.jvm.internal.OooOo.OooO0o0(productType, "productType");
                kotlin.jvm.internal.OooOo.OooO0o0(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.OooOo.OooO0o0(url, "url");
                this.f11276b = successCallback;
                this.f11277c = failCallback;
                this.f11278d = productType;
                this.f11279e = demandSourceName;
                this.f11280f = url;
            }

            /* renamed from: a */
            public static /* synthetic */ b m11822a(b bVar, String str, String str2, C3419mh.e eVar, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = bVar.f11276b;
                }
                if ((i & 2) != 0) {
                    str2 = bVar.f11277c;
                }
                if ((i & 4) != 0) {
                    eVar = bVar.f11278d;
                }
                if ((i & 8) != 0) {
                    str3 = bVar.f11279e;
                }
                if ((i & 16) != 0) {
                    str4 = bVar.f11280f;
                }
                String str5 = str4;
                C3419mh.e eVar2 = eVar;
                return bVar.m11823a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC3615s3
            /* renamed from: b */
            public C3419mh.e mo11800b() {
                return this.f11278d;
            }

            @Override // com.ironsource.InterfaceC3615s3
            /* renamed from: c */
            public String mo11801c() {
                return this.f11276b;
            }

            @Override // com.ironsource.InterfaceC3615s3
            /* renamed from: d */
            public String mo11802d() {
                return this.f11279e;
            }

            /* renamed from: e */
            public final String m11824e() {
                return this.f11276b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.OooOo.OooO00o(this.f11276b, bVar.f11276b) && kotlin.jvm.internal.OooOo.OooO00o(this.f11277c, bVar.f11277c) && this.f11278d == bVar.f11278d && kotlin.jvm.internal.OooOo.OooO00o(this.f11279e, bVar.f11279e) && kotlin.jvm.internal.OooOo.OooO00o(this.f11280f, bVar.f11280f);
            }

            /* renamed from: f */
            public final String m11825f() {
                return this.f11277c;
            }

            /* renamed from: g */
            public final C3419mh.e m11826g() {
                return this.f11278d;
            }

            @Override // com.ironsource.InterfaceC3615s3.a
            public String getUrl() {
                return this.f11280f;
            }

            /* renamed from: h */
            public final String m11827h() {
                return this.f11279e;
            }

            public int hashCode() {
                return this.f11280f.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0((this.f11278d.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(this.f11276b.hashCode() * 31, 31, this.f11277c)) * 31, 31, this.f11279e);
            }

            /* renamed from: i */
            public final String m11828i() {
                return this.f11280f;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Impression(successCallback=");
                sb.append(this.f11276b);
                sb.append(", failCallback=");
                sb.append(this.f11277c);
                sb.append(", productType=");
                sb.append(this.f11278d);
                sb.append(", demandSourceName=");
                sb.append(this.f11279e);
                sb.append(", url=");
                return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f11280f, sb);
            }

            /* renamed from: a */
            public final b m11823a(String successCallback, String failCallback, C3419mh.e productType, String demandSourceName, String url) {
                kotlin.jvm.internal.OooOo.OooO0o0(successCallback, "successCallback");
                kotlin.jvm.internal.OooOo.OooO0o0(failCallback, "failCallback");
                kotlin.jvm.internal.OooOo.OooO0o0(productType, "productType");
                kotlin.jvm.internal.OooOo.OooO0o0(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.OooOo.OooO0o0(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC3615s3
            /* renamed from: a */
            public String mo11799a() {
                return this.f11277c;
            }
        }

        String getUrl();
    }

    /* renamed from: com.ironsource.s3$b */
    public static final class b {

        /* renamed from: a */
        static final /* synthetic */ b f11281a = new b();

        private b() {
        }

        /* renamed from: a */
        private final a m11829a(JSONObject jSONObject) throws JSONException {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(C3034d9.f.f7997e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(C3034d9.h.f8117m);
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C3419mh.e eVarValueOf = C3419mh.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (!kotlin.jvm.internal.OooOo.OooO00o(strOptString, C3069e9.f8387d)) {
                if (!kotlin.jvm.internal.OooOo.OooO00o(strOptString, C3069e9.f8388e)) {
                    throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
                }
                kotlin.jvm.internal.OooOo.OooO0Oo(successCallback, "successCallback");
                kotlin.jvm.internal.OooOo.OooO0Oo(failCallback, "failCallback");
                kotlin.jvm.internal.OooOo.OooO0Oo(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.OooOo.OooO0Oo(url, "url");
                return new a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(C3069e9.f8389f);
            int i = jSONObject3.getInt(C3069e9.f8390g);
            int i2 = jSONObject3.getInt(C3069e9.f8391h);
            int iOptInt = jSONObject2.optInt("action", 0);
            int iOptInt2 = jSONObject2.optInt(C3069e9.f8393j, 0);
            kotlin.jvm.internal.OooOo.OooO0Oo(successCallback, "successCallback");
            kotlin.jvm.internal.OooOo.OooO0Oo(failCallback, "failCallback");
            kotlin.jvm.internal.OooOo.OooO0Oo(demandSourceName, "demandSourceName");
            kotlin.jvm.internal.OooOo.OooO0Oo(url, "url");
            return new a.C4582a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new a.C4582a.C4583a(i, i2), iOptInt, iOptInt2);
        }

        /* renamed from: a */
        public final InterfaceC3615s3 m11830a(String jsonString) {
            kotlin.jvm.internal.OooOo.OooO0o0(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String strOptString = jSONObject.optString("type", "none");
            if (kotlin.jvm.internal.OooOo.OooO00o(strOptString, C3069e9.f8386c)) {
                return m11829a(jSONObject);
            }
            throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("unsupported message type: ", strOptString));
        }
    }

    /* renamed from: a */
    static InterfaceC3615s3 m11798a(String str) {
        return f11265a.m11830a(str);
    }

    /* renamed from: a */
    String mo11799a();

    /* renamed from: b */
    C3419mh.e mo11800b();

    /* renamed from: c */
    String mo11801c();

    /* renamed from: d */
    String mo11802d();
}
