package com.ironsource;

import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3370a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.i5 */
/* loaded from: classes2.dex */
public final class C3210i5 {

    /* renamed from: h */
    public static final b f8973h = new b(null);

    /* renamed from: a */
    private final String f8974a;

    /* renamed from: b */
    private final InterfaceC3370a f8975b;

    /* renamed from: c */
    private final C3353m5 f8976c;

    /* renamed from: d */
    private final JSONObject f8977d;

    /* renamed from: e */
    private final JSONObject f8978e;

    /* renamed from: f */
    private final C2995c5 f8979f;

    /* renamed from: g */
    private final C3442n5 f8980g;

    /* renamed from: com.ironsource.i5$a */
    public static final class a {

        /* renamed from: a */
        private final JSONObject f8981a;

        /* renamed from: b */
        private final String f8982b;

        /* renamed from: c */
        private final String f8983c;

        /* renamed from: d */
        private final InterfaceC3370a f8984d;

        /* renamed from: e */
        private final C3353m5 f8985e;

        /* renamed from: f */
        private final JSONObject f8986f;

        /* renamed from: g */
        private final JSONObject f8987g;

        /* renamed from: h */
        private final C2995c5 f8988h;

        /* renamed from: i */
        private final C3442n5 f8989i;

        public a(JSONObject auctionData, String instanceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(auctionData, "auctionData");
            kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
            this.f8981a = auctionData;
            this.f8982b = instanceId;
            JSONObject jSONObjectM9269a = m9269a(auctionData);
            this.f8983c = auctionData.optString("auctionId");
            InterfaceC3370a interfaceC3370aM9268a = m9268a(auctionData, jSONObjectM9269a);
            this.f8984d = interfaceC3370aM9268a;
            this.f8985e = m9272c(jSONObjectM9269a);
            this.f8986f = m9273d(jSONObjectM9269a);
            this.f8987g = m9271b(jSONObjectM9269a);
            this.f8988h = m9267a(interfaceC3370aM9268a, instanceId);
            this.f8989i = m9270b(interfaceC3370aM9268a, instanceId);
        }

        /* renamed from: a */
        private final C2995c5 m9267a(InterfaceC3370a interfaceC3370a, String str) {
            C3353m5 c3353m5Mo10157a = interfaceC3370a.mo10157a(str);
            if (c3353m5Mo10157a == null) {
                return null;
            }
            C2995c5 c2995c5 = new C2995c5();
            c2995c5.m8091a(c3353m5Mo10157a.m9985b());
            c2995c5.m8095c(c3353m5Mo10157a.m9991h());
            c2995c5.m8093b(c3353m5Mo10157a.m9990g());
            return c2995c5;
        }

        /* renamed from: b */
        private final C3442n5 m9270b(InterfaceC3370a interfaceC3370a, String str) {
            C3353m5 c3353m5Mo10157a = interfaceC3370a.mo10157a(str);
            if (c3353m5Mo10157a == null) {
                return null;
            }
            String strM9994k = c3353m5Mo10157a.m9994k();
            kotlin.jvm.internal.OooOo.OooO0Oo(strM9994k, "it.serverData");
            return new C3442n5(strM9994k);
        }

        /* renamed from: c */
        private final C3353m5 m9272c(JSONObject jSONObject) {
            return new C3353m5(jSONObject);
        }

        /* renamed from: d */
        private final JSONObject m9273d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        /* renamed from: a */
        public final C3210i5 m9274a() {
            return new C3210i5(this.f8983c, this.f8984d, this.f8985e, this.f8986f, this.f8987g, this.f8988h, this.f8989i);
        }

        /* renamed from: b */
        public final JSONObject m9275b() {
            return this.f8981a;
        }

        /* renamed from: c */
        public final String m9276c() {
            return this.f8982b;
        }

        /* renamed from: a */
        private final JSONObject m9269a(JSONObject jSONObject) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        }

        /* renamed from: b */
        private final JSONObject m9271b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        /* renamed from: a */
        private final InterfaceC3370a m9268a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(C3368d.f9606d);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C3368d.f9610h);
            if (jSONArrayOptJSONArray != null) {
                o00O0o0O.o00Ooo o00oooOooOOOO = o00Oo0oo.o00oO0o.OooOOOO(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = o00oooOooOOOO.iterator();
                while (((o00O0o0O.o00Oo0) it).f31439OooOo) {
                    int iNextInt = ((o00O0.o0Oo0oo) it).nextInt();
                    C3353m5 c3353m5 = new C3353m5(jSONArrayOptJSONArray.getJSONObject(iNextInt), iNextInt, jSONObjectOptJSONObject);
                    if (!c3353m5.m9996m()) {
                        c3353m5 = null;
                    }
                    if (c3353m5 != null) {
                        arrayList2.add(c3353m5);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new InterfaceC3370a.a(arrayList);
        }
    }

    /* renamed from: com.ironsource.i5$b */
    public static final class b {
        private b() {
        }

        /* renamed from: a */
        private final Object m9277a(C3210i5 c3210i5, String str) {
            C3870yg c3870yg;
            String strM9259b = c3210i5.m9259b();
            if (strM9259b == null || strM9259b.length() == 0) {
                c3870yg = new C3870yg(C3797wb.f12445a.m12875i());
            } else if (c3210i5.m9266i()) {
                c3870yg = new C3870yg(C3797wb.f12445a.m12872f());
            } else {
                C3353m5 c3353m5M9257a = c3210i5.m9257a(str);
                if (c3353m5M9257a == null) {
                    c3870yg = new C3870yg(C3797wb.f12445a.m12876j());
                } else {
                    String strM9994k = c3353m5M9257a.m9994k();
                    if (strM9994k != null && strM9994k.length() != 0) {
                        return c3210i5;
                    }
                    c3870yg = new C3870yg(C3797wb.f12445a.m12871e());
                }
            }
            return o00O0.o000OOo.OooO0O0(c3870yg);
        }

        public /* synthetic */ b(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }

        /* renamed from: a */
        public final Object m9278a(JSONObject auctionData, String instanceId) {
            kotlin.jvm.internal.OooOo.OooO0o0(auctionData, "auctionData");
            kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
            return m9277a(new a(auctionData, instanceId).m9274a(), instanceId);
        }
    }

    public C3210i5(String str, InterfaceC3370a waterfall, C3353m5 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, C2995c5 c2995c5, C3442n5 c3442n5) {
        kotlin.jvm.internal.OooOo.OooO0o0(waterfall, "waterfall");
        kotlin.jvm.internal.OooOo.OooO0o0(genericNotifications, "genericNotifications");
        this.f8974a = str;
        this.f8975b = waterfall;
        this.f8976c = genericNotifications;
        this.f8977d = jSONObject;
        this.f8978e = jSONObject2;
        this.f8979f = c2995c5;
        this.f8980g = c3442n5;
    }

    /* renamed from: a */
    private final C3353m5 m9256a(InterfaceC3370a interfaceC3370a, String str) {
        return interfaceC3370a.mo10157a(str);
    }

    /* renamed from: b */
    public final String m9259b() {
        return this.f8974a;
    }

    /* renamed from: c */
    public final C2995c5 m9260c() {
        return this.f8979f;
    }

    /* renamed from: d */
    public final JSONObject m9261d() {
        return this.f8978e;
    }

    /* renamed from: e */
    public final C3353m5 m9262e() {
        return this.f8976c;
    }

    /* renamed from: f */
    public final JSONObject m9263f() {
        return this.f8977d;
    }

    /* renamed from: g */
    public final C3442n5 m9264g() {
        return this.f8980g;
    }

    /* renamed from: h */
    public final InterfaceC3370a m9265h() {
        return this.f8975b;
    }

    /* renamed from: i */
    public final boolean m9266i() {
        return this.f8975b.isEmpty();
    }

    /* renamed from: a */
    public final C3353m5 m9257a(String providerName) {
        kotlin.jvm.internal.OooOo.OooO0o0(providerName, "providerName");
        return m9256a(this.f8975b, providerName);
    }

    /* renamed from: a */
    public final String m9258a() {
        C3442n5 c3442n5 = this.f8980g;
        if (c3442n5 != null) {
            return c3442n5.m10950d();
        }
        return null;
    }
}
