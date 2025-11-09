package com.ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.C3353m5;
import com.ironsource.C3451ne;
import com.ironsource.C3495on;
import com.ironsource.C3551q9;
import com.ironsource.C3702tk;
import com.ironsource.C3899zb;
import com.ironsource.EnumC2638ac;
import com.ironsource.InterfaceC3721u4;
import com.ironsource.InterfaceC3767vf;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.demandOnly.InterfaceC3385p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.d */
/* loaded from: classes2.dex */
public class C3368d {

    /* renamed from: A */
    public static final boolean f9603A = false;

    /* renamed from: B */
    private static C3368d f9604B = new C3368d();

    /* renamed from: c */
    public static final String f9605c = "auctionId";

    /* renamed from: d */
    public static final String f9606d = "armData";

    /* renamed from: e */
    public static final String f9607e = "larmData";

    /* renamed from: f */
    public static final String f9608f = "isAdUnitCapped";

    /* renamed from: g */
    public static final String f9609g = "settings";

    /* renamed from: h */
    public static final String f9610h = "waterfall";

    /* renamed from: i */
    public static final String f9611i = "genericParams";

    /* renamed from: j */
    public static final String f9612j = "configurations";

    /* renamed from: k */
    public static final String f9613k = "instances";

    /* renamed from: l */
    public static final String f9614l = "${AUCTION_LOSS}";

    /* renamed from: m */
    public static final String f9615m = "${AUCTION_MBR}";

    /* renamed from: n */
    public static final String f9616n = "${AUCTION_PRICE}";

    /* renamed from: o */
    public static final String f9617o = "${DYNAMIC_DEMAND_SOURCE}";

    /* renamed from: p */
    public static final String f9618p = "${INSTANCE}";

    /* renamed from: q */
    public static final String f9619q = "${INSTANCE_TYPE}";

    /* renamed from: r */
    public static final String f9620r = "${PLACEMENT_NAME}";

    /* renamed from: s */
    private static final String f9621s = "adMarkup";

    /* renamed from: t */
    private static final String f9622t = "dynamicDemandSource";

    /* renamed from: u */
    private static final String f9623u = "params";

    /* renamed from: v */
    public static final String f9624v = "dlpl";

    /* renamed from: w */
    public static final String f9625w = "adUnit";

    /* renamed from: x */
    public static final String f9626x = "parallelLoad";

    /* renamed from: y */
    public static final String f9627y = "bidderExclusive";

    /* renamed from: z */
    public static final String f9628z = "showPriorityEnabled";

    /* renamed from: a */
    private final AtomicBoolean f9629a = new AtomicBoolean(false);

    /* renamed from: b */
    private final InterfaceC3767vf f9630b = C3495on.m11199U().mo8686f();

    /* renamed from: com.ironsource.mediationsdk.d$a */
    public static class a {

        /* renamed from: a */
        private String f9631a;

        /* renamed from: b */
        private List<C3353m5> f9632b;

        /* renamed from: c */
        private C3353m5 f9633c;

        /* renamed from: d */
        private JSONObject f9634d;

        /* renamed from: e */
        private JSONObject f9635e;

        /* renamed from: f */
        private int f9636f;

        /* renamed from: g */
        private String f9637g;

        /* renamed from: h */
        private InterfaceC3721u4 f9638h;

        public a(String str) {
            this.f9631a = str;
        }

        /* renamed from: b */
        public JSONObject m10147b() {
            return this.f9635e;
        }

        /* renamed from: c */
        public int m10148c() {
            return this.f9636f;
        }

        /* renamed from: d */
        public String m10149d() {
            return this.f9637g;
        }

        /* renamed from: e */
        public C3353m5 m10150e() {
            return this.f9633c;
        }

        /* renamed from: f */
        public JSONObject m10151f() {
            return this.f9634d;
        }

        /* renamed from: g */
        public InterfaceC3721u4 m10152g() {
            return this.f9638h;
        }

        /* renamed from: h */
        public List<C3353m5> m10153h() {
            return this.f9632b;
        }

        /* renamed from: a */
        public InterfaceC3385p m10145a(String str) {
            InterfaceC3721u4 interfaceC3721u4 = this.f9638h;
            return interfaceC3721u4 != null ? interfaceC3721u4.mo12539a(str) : new InterfaceC3385p.b();
        }

        /* renamed from: a */
        public String m10146a() {
            return this.f9631a;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.d$b */
    public static class b implements Runnable {

        /* renamed from: d */
        private static final int f9639d = 15000;

        /* renamed from: a */
        private String f9640a;

        /* renamed from: b */
        private String f9641b;

        /* renamed from: c */
        private String f9642c;

        public b(String str, String str2, String str3) {
            this.f9640a = str;
            this.f9641b = str2;
            this.f9642c = str3;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException, IOException {
            String str = this.f9640a + ";" + this.f9641b + ";" + this.f9642c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f9642c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(f9639d);
                httpURLConnection.setConnectTimeout(f9639d);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                C3495on.m11199U().mo8698z().mo12605a(new C3899zb(responseCode == 200 || responseCode == 204 ? EnumC2638ac.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : EnumC2638ac.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, responseCode).put("reason", responseMessage)));
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e.getMessage());
            }
        }
    }

    /* renamed from: com.ironsource.mediationsdk.d$c */
    public enum c {
        NOT_SECURE,
        SECURE
    }

    /* renamed from: b */
    public static C3368d m10127b() {
        return f9604B;
    }

    /* renamed from: a */
    public a m10128a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f9633c = new C3353m5(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(f9606d) ? jSONObject2.optJSONObject(f9606d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f9634d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f9635e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f9613k)) {
                aVar.f9638h = new InterfaceC3721u4.a(jSONObject2.optJSONObject(f9613k));
            }
        }
        aVar.f9632b = new ArrayList();
        if (jSONObject.has(f9610h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f9610h);
            for (int i = 0; i < jSONArray.length(); i++) {
                C3353m5 c3353m5 = new C3353m5(jSONArray.getJSONObject(i), i, jSONObjectOptJSONObject);
                if (!c3353m5.m9996m()) {
                    aVar.f9636f = 1002;
                    aVar.f9637g = "waterfall " + i;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f9632b.add(c3353m5);
            }
        }
        return aVar;
    }

    /* renamed from: c */
    public String m10136c(String str) throws JSONException {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str) && C3702tk.m12449a(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("params")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("parameters = " + jSONObject2);
                    if (jSONObject2.has("dynamicDemandSource")) {
                        string = jSONObject2.getString("dynamicDemandSource");
                        ironLog.verbose("demand source = " + string);
                        return string;
                    }
                }
            }
            return "";
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception " + e.getMessage());
            return string;
        }
    }

    /* renamed from: a */
    private c m10125a() {
        c cVar = c.SECURE;
        if (Build.VERSION.SDK_INT >= 28) {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return cVar;
            }
        } else if ((ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) == 0) {
            return cVar;
        }
        return c.NOT_SECURE;
    }

    /* renamed from: b */
    public Map<String, String> m10135b(String str) throws JSONException {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception " + e.getMessage());
        }
        return map;
    }

    /* renamed from: a */
    public String m10129a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adMarkup")) {
                    return jSONObject.getString("adMarkup");
                }
            }
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error("exception " + e.getMessage());
        }
        return str;
    }

    /* renamed from: a */
    public String m10130a(String str, int i, C3353m5 c3353m5, String str2, String str3, String str4) throws NumberFormatException {
        String strM9992i = c3353m5.m9992i();
        return m10131a(str, c3353m5.m9986c(), i, m10127b().m10136c(c3353m5.m9994k()), strM9992i, m10127b().m10126a(strM9992i, str2), str3, str4);
    }

    /* renamed from: a */
    private String m10126a(String str, String str2) throws NumberFormatException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d = Double.parseDouble(str);
        return Double.parseDouble(str2) == 0.0d ? "" : String.valueOf(Math.round((d / r7) * 1000.0d) / 1000.0d);
    }

    /* renamed from: a */
    public String m10131a(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(f9616n, str4).replace(f9614l, str6).replace(f9615m, str5).replace(f9618p, str2).replace(f9619q, Integer.toString(i)).replace(f9617o, str3).replace(f9620r, str7);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x020e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject m10132a(com.ironsource.mediationsdk.C3391i r26) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C3368d.m10132a(com.ironsource.mediationsdk.i):org.json.JSONObject");
    }

    /* renamed from: a */
    public void m10133a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    /* renamed from: a */
    public void m10134a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(C3451ne.f10486j1)) || !this.f9629a.compareAndSet(false, true)) {
            return;
        }
        C3495on.m11199U().mo8698z().mo12605a(new C3899zb(EnumC2638ac.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z, true, -1)));
    }
}
