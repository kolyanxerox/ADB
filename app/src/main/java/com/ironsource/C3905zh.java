package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.C3034d9;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.zh */
/* loaded from: classes2.dex */
public final class C3905zh {

    /* renamed from: a */
    private final String f12989a;

    /* renamed from: b */
    private final String f12990b;

    /* renamed from: c */
    private final String f12991c;

    /* renamed from: d */
    private final String f12992d;

    /* renamed from: e */
    private final Drawable f12993e;

    /* renamed from: f */
    private final WebView f12994f;

    /* renamed from: g */
    private final View f12995g;

    /* renamed from: com.ironsource.zh$a */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC3560qi f12996a;

        /* renamed from: b */
        private final InterfaceC3890z2 f12997b;

        public a(InterfaceC3560qi imageLoader, InterfaceC3890z2 adViewManagement) {
            kotlin.jvm.internal.OooOo.OooO0o0(imageLoader, "imageLoader");
            kotlin.jvm.internal.OooOo.OooO0o0(adViewManagement, "adViewManagement");
            this.f12996a = imageLoader;
            this.f12997b = adViewManagement;
        }

        /* renamed from: b */
        private final oo00o.OooOOO0 m13366b(String str) {
            if (str == null) {
                return null;
            }
            return new oo00o.OooOOO0(this.f12996a.mo11413a(str));
        }

        /* renamed from: a */
        public final b m13367a(Context activityContext, JSONObject json) {
            kotlin.jvm.internal.OooOo.OooO0o0(activityContext, "activityContext");
            kotlin.jvm.internal.OooOo.OooO0o0(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject(C3034d9.h.f8063D0);
            String strM7803b = jSONObjectOptJSONObject != null ? C2938ai.m7803b(jSONObjectOptJSONObject, C3034d9.h.f8077K0) : null;
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(C3034d9.h.f8067F0);
            String strM7803b2 = jSONObjectOptJSONObject2 != null ? C2938ai.m7803b(jSONObjectOptJSONObject2, C3034d9.h.f8077K0) : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject(C3034d9.h.f8065E0);
            String strM7803b3 = jSONObjectOptJSONObject3 != null ? C2938ai.m7803b(jSONObjectOptJSONObject3, C3034d9.h.f8077K0) : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(C3034d9.h.f8069G0);
            String strM7803b4 = jSONObjectOptJSONObject4 != null ? C2938ai.m7803b(jSONObjectOptJSONObject4, C3034d9.h.f8077K0) : null;
            JSONObject jSONObjectOptJSONObject5 = json.optJSONObject(C3034d9.h.f8071H0);
            String strM7803b5 = jSONObjectOptJSONObject5 != null ? C2938ai.m7803b(jSONObjectOptJSONObject5, "url") : null;
            JSONObject jSONObjectOptJSONObject6 = json.optJSONObject(C3034d9.h.f8073I0);
            String strM7803b6 = jSONObjectOptJSONObject6 != null ? C2938ai.m7803b(jSONObjectOptJSONObject6, "adViewId") : null;
            JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(C3034d9.h.f8075J0);
            return new b(new b.a(strM7803b, strM7803b2, strM7803b3, strM7803b4, m13366b(strM7803b5), m13365a(strM7803b6), C3812wq.f12525a.m12955a(activityContext, jSONObjectOptJSONObject7 != null ? C2938ai.m7803b(jSONObjectOptJSONObject7, "url") : null, this.f12996a)));
        }

        /* renamed from: a */
        private final oo00o.OooOOO0 m13365a(String str) {
            if (str == null) {
                return null;
            }
            InterfaceC3043di interfaceC3043diMo9491a = this.f12997b.mo9491a(str);
            WebView presentingView = interfaceC3043diMo9491a != null ? interfaceC3043diMo9491a.getPresentingView() : null;
            return presentingView == null ? new oo00o.OooOOO0(o00O0.o000OOo.OooO0O0(new Exception(androidx.datastore.preferences.protobuf.OooO00o.OooO0o('\'', "missing adview for id: '", str)))) : new oo00o.OooOOO0(presentingView);
        }
    }

    /* renamed from: com.ironsource.zh$b */
    public static final class b {

        /* renamed from: a */
        private final a f12998a;

        /* renamed from: com.ironsource.zh$b$a */
        public static final class a {

            /* renamed from: a */
            private final String f12999a;

            /* renamed from: b */
            private final String f13000b;

            /* renamed from: c */
            private final String f13001c;

            /* renamed from: d */
            private final String f13002d;

            /* renamed from: e */
            private final oo00o.OooOOO0 f13003e;

            /* renamed from: f */
            private final oo00o.OooOOO0 f13004f;

            /* renamed from: g */
            private final View f13005g;

            public a(String str, String str2, String str3, String str4, oo00o.OooOOO0 oooOOO0, oo00o.OooOOO0 oooOOO02, View privacyIcon) {
                kotlin.jvm.internal.OooOo.OooO0o0(privacyIcon, "privacyIcon");
                this.f12999a = str;
                this.f13000b = str2;
                this.f13001c = str3;
                this.f13002d = str4;
                this.f13003e = oooOOO0;
                this.f13004f = oooOOO02;
                this.f13005g = privacyIcon;
            }

            /* renamed from: a */
            public static /* synthetic */ a m13372a(a aVar, String str, String str2, String str3, String str4, oo00o.OooOOO0 oooOOO0, oo00o.OooOOO0 oooOOO02, View view, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f12999a;
                }
                if ((i & 2) != 0) {
                    str2 = aVar.f13000b;
                }
                if ((i & 4) != 0) {
                    str3 = aVar.f13001c;
                }
                if ((i & 8) != 0) {
                    str4 = aVar.f13002d;
                }
                if ((i & 16) != 0) {
                    oooOOO0 = aVar.f13003e;
                }
                if ((i & 32) != 0) {
                    oooOOO02 = aVar.f13004f;
                }
                if ((i & 64) != 0) {
                    view = aVar.f13005g;
                }
                oo00o.OooOOO0 oooOOO03 = oooOOO02;
                View view2 = view;
                oo00o.OooOOO0 oooOOO04 = oooOOO0;
                String str5 = str3;
                return aVar.m13373a(str, str2, str5, str4, oooOOO04, oooOOO03, view2);
            }

            /* renamed from: b */
            public final String m13375b() {
                return this.f13000b;
            }

            /* renamed from: c */
            public final String m13376c() {
                return this.f13001c;
            }

            /* renamed from: d */
            public final String m13377d() {
                return this.f13002d;
            }

            /* renamed from: e */
            public final oo00o.OooOOO0 m13378e() {
                return this.f13003e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.OooOo.OooO00o(this.f12999a, aVar.f12999a) && kotlin.jvm.internal.OooOo.OooO00o(this.f13000b, aVar.f13000b) && kotlin.jvm.internal.OooOo.OooO00o(this.f13001c, aVar.f13001c) && kotlin.jvm.internal.OooOo.OooO00o(this.f13002d, aVar.f13002d) && kotlin.jvm.internal.OooOo.OooO00o(this.f13003e, aVar.f13003e) && kotlin.jvm.internal.OooOo.OooO00o(this.f13004f, aVar.f13004f) && kotlin.jvm.internal.OooOo.OooO00o(this.f13005g, aVar.f13005g);
            }

            /* renamed from: f */
            public final oo00o.OooOOO0 m13379f() {
                return this.f13004f;
            }

            /* renamed from: g */
            public final View m13380g() {
                return this.f13005g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: h */
            public final C3905zh m13381h() {
                Drawable drawable;
                String str = this.f12999a;
                String str2 = this.f13000b;
                String str3 = this.f13001c;
                String str4 = this.f13002d;
                oo00o.OooOOO0 oooOOO0 = this.f13003e;
                if (oooOOO0 != null) {
                    Object obj = oooOOO0.f33191OooOo0O;
                    if (obj instanceof oo00o.OooOO0O) {
                        obj = null;
                    }
                    drawable = (Drawable) obj;
                } else {
                    drawable = null;
                }
                oo00o.OooOOO0 oooOOO02 = this.f13004f;
                if (oooOOO02 != null) {
                    Object obj2 = oooOOO02.f33191OooOo0O;
                    webView = obj2 instanceof oo00o.OooOO0O ? null : obj2;
                }
                return new C3905zh(str, str2, str3, str4, drawable, webView, this.f13005g);
            }

            public int hashCode() {
                Object obj;
                Object obj2;
                String str = this.f12999a;
                int iHashCode = 0;
                int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f13000b;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f13001c;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f13002d;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                oo00o.OooOOO0 oooOOO0 = this.f13003e;
                int iHashCode6 = (iHashCode5 + ((oooOOO0 == null || (obj = oooOOO0.f33191OooOo0O) == null) ? 0 : obj.hashCode())) * 31;
                oo00o.OooOOO0 oooOOO02 = this.f13004f;
                if (oooOOO02 != null && (obj2 = oooOOO02.f33191OooOo0O) != null) {
                    iHashCode = obj2.hashCode();
                }
                return this.f13005g.hashCode() + ((iHashCode6 + iHashCode) * 31);
            }

            /* renamed from: i */
            public final String m13382i() {
                return this.f13000b;
            }

            /* renamed from: j */
            public final String m13383j() {
                return this.f13001c;
            }

            /* renamed from: k */
            public final String m13384k() {
                return this.f13002d;
            }

            /* renamed from: l */
            public final oo00o.OooOOO0 m13385l() {
                return this.f13003e;
            }

            /* renamed from: m */
            public final oo00o.OooOOO0 m13386m() {
                return this.f13004f;
            }

            /* renamed from: n */
            public final View m13387n() {
                return this.f13005g;
            }

            /* renamed from: o */
            public final String m13388o() {
                return this.f12999a;
            }

            public String toString() {
                return "Data(title=" + this.f12999a + ", advertiser=" + this.f13000b + ", body=" + this.f13001c + ", cta=" + this.f13002d + ", icon=" + this.f13003e + ", media=" + this.f13004f + ", privacyIcon=" + this.f13005g + ')';
            }

            /* renamed from: a */
            public final a m13373a(String str, String str2, String str3, String str4, oo00o.OooOOO0 oooOOO0, oo00o.OooOOO0 oooOOO02, View privacyIcon) {
                kotlin.jvm.internal.OooOo.OooO0o0(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, oooOOO0, oooOOO02, privacyIcon);
            }

            /* renamed from: a */
            public final String m13374a() {
                return this.f12999a;
            }
        }

        public b(a data) {
            kotlin.jvm.internal.OooOo.OooO0o0(data, "data");
            this.f12998a = data;
        }

        /* renamed from: a */
        public final a m13370a() {
            return this.f12998a;
        }

        /* renamed from: b */
        public final JSONObject m13371b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (this.f12998a.m13388o() != null) {
                m13368a(jSONObject, C3034d9.h.f8063D0);
            }
            if (this.f12998a.m13382i() != null) {
                m13368a(jSONObject, C3034d9.h.f8067F0);
            }
            if (this.f12998a.m13383j() != null) {
                m13368a(jSONObject, C3034d9.h.f8065E0);
            }
            if (this.f12998a.m13384k() != null) {
                m13368a(jSONObject, C3034d9.h.f8069G0);
            }
            oo00o.OooOOO0 oooOOO0M13385l = this.f12998a.m13385l();
            if (oooOOO0M13385l != null) {
                m13369a(jSONObject, C3034d9.h.f8071H0, oooOOO0M13385l.f33191OooOo0O);
            }
            oo00o.OooOOO0 oooOOO0M13386m = this.f12998a.m13386m();
            if (oooOOO0M13386m != null) {
                m13369a(jSONObject, C3034d9.h.f8073I0, oooOOO0M13386m.f33191OooOo0O);
            }
            return jSONObject;
        }

        /* renamed from: a */
        private static final void m13368a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        /* renamed from: a */
        private static final <T> void m13369a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", !(obj instanceof oo00o.OooOO0O));
            Throwable thOooO00o = oo00o.OooOOO0.OooO00o(obj);
            if (thOooO00o != null) {
                String message = thOooO00o.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            jSONObject.put(str, jSONObject2);
        }
    }

    public C3905zh(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        kotlin.jvm.internal.OooOo.OooO0o0(privacyIcon, "privacyIcon");
        this.f12989a = str;
        this.f12990b = str2;
        this.f12991c = str3;
        this.f12992d = str4;
        this.f12993e = drawable;
        this.f12994f = webView;
        this.f12995g = privacyIcon;
    }

    /* renamed from: a */
    public static /* synthetic */ C3905zh m13349a(C3905zh c3905zh, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3905zh.f12989a;
        }
        if ((i & 2) != 0) {
            str2 = c3905zh.f12990b;
        }
        if ((i & 4) != 0) {
            str3 = c3905zh.f12991c;
        }
        if ((i & 8) != 0) {
            str4 = c3905zh.f12992d;
        }
        if ((i & 16) != 0) {
            drawable = c3905zh.f12993e;
        }
        if ((i & 32) != 0) {
            webView = c3905zh.f12994f;
        }
        if ((i & 64) != 0) {
            view = c3905zh.f12995g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return c3905zh.m13350a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    /* renamed from: b */
    public final String m13352b() {
        return this.f12990b;
    }

    /* renamed from: c */
    public final String m13353c() {
        return this.f12991c;
    }

    /* renamed from: d */
    public final String m13354d() {
        return this.f12992d;
    }

    /* renamed from: e */
    public final Drawable m13355e() {
        return this.f12993e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3905zh)) {
            return false;
        }
        C3905zh c3905zh = (C3905zh) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f12989a, c3905zh.f12989a) && kotlin.jvm.internal.OooOo.OooO00o(this.f12990b, c3905zh.f12990b) && kotlin.jvm.internal.OooOo.OooO00o(this.f12991c, c3905zh.f12991c) && kotlin.jvm.internal.OooOo.OooO00o(this.f12992d, c3905zh.f12992d) && kotlin.jvm.internal.OooOo.OooO00o(this.f12993e, c3905zh.f12993e) && kotlin.jvm.internal.OooOo.OooO00o(this.f12994f, c3905zh.f12994f) && kotlin.jvm.internal.OooOo.OooO00o(this.f12995g, c3905zh.f12995g);
    }

    /* renamed from: f */
    public final WebView m13356f() {
        return this.f12994f;
    }

    /* renamed from: g */
    public final View m13357g() {
        return this.f12995g;
    }

    /* renamed from: h */
    public final String m13358h() {
        return this.f12990b;
    }

    public int hashCode() {
        String str = this.f12989a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12990b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12991c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f12992d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f12993e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f12994f;
        return this.f12995g.hashCode() + ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31);
    }

    /* renamed from: i */
    public final String m13359i() {
        return this.f12991c;
    }

    /* renamed from: j */
    public final String m13360j() {
        return this.f12992d;
    }

    /* renamed from: k */
    public final Drawable m13361k() {
        return this.f12993e;
    }

    /* renamed from: l */
    public final WebView m13362l() {
        return this.f12994f;
    }

    /* renamed from: m */
    public final View m13363m() {
        return this.f12995g;
    }

    /* renamed from: n */
    public final String m13364n() {
        return this.f12989a;
    }

    public String toString() {
        return "ISNNativeAdData(title=" + this.f12989a + ", advertiser=" + this.f12990b + ", body=" + this.f12991c + ", cta=" + this.f12992d + ", icon=" + this.f12993e + ", mediaView=" + this.f12994f + ", privacyIcon=" + this.f12995g + ')';
    }

    /* renamed from: a */
    public final C3905zh m13350a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        kotlin.jvm.internal.OooOo.OooO0o0(privacyIcon, "privacyIcon");
        return new C3905zh(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    /* renamed from: a */
    public final String m13351a() {
        return this.f12989a;
    }
}
