package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.gh */
/* loaded from: classes2.dex */
public class C3152gh {

    /* renamed from: a */
    private InterfaceC3077eh f8724a;

    /* renamed from: c */
    private WebView f8726c;

    /* renamed from: d */
    private String f8727d;

    /* renamed from: e */
    private String f8728e = "gh";

    /* renamed from: f */
    private String[] f8729f = {"handleGetViewVisibility"};

    /* renamed from: g */
    private final String[] f8730g = {C3007ch.f7747h, C3007ch.f7748i, C3007ch.f7746g, "handleGetViewVisibility", C3007ch.f7749j};

    /* renamed from: b */
    private C3886yw f8725b = new C3886yw();

    /* renamed from: com.ironsource.gh$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f8731a;

        /* renamed from: b */
        final /* synthetic */ String f8732b;

        /* renamed from: c */
        final /* synthetic */ String f8733c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f8734d;

        public a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f8731a = str;
            this.f8732b = str2;
            this.f8733c = str3;
            this.f8734d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C3152gh.this.m8954b(this.f8731a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f8731a;
                    Log.e(C3152gh.this.f8728e, str);
                    C3152gh.this.m8963a(this.f8732b, str);
                    return;
                }
                if (this.f8731a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C3152gh.this.m8972e(this.f8733c);
                } else if (this.f8731a.equalsIgnoreCase(C3007ch.f7749j) || this.f8731a.equalsIgnoreCase(C3007ch.f7748i)) {
                    C3152gh.this.m8964a(this.f8734d.getString("params"), this.f8733c, this.f8732b);
                }
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f8731a;
                Log.e(C3152gh.this.f8728e, str2);
                C3152gh.this.m8963a(this.f8732b, str2);
            }
        }
    }

    /* renamed from: com.ironsource.gh$b */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f8736a;

        /* renamed from: b */
        final /* synthetic */ String f8737b;

        public b(String str, String str2) {
            this.f8736a = str;
            this.f8737b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3152gh.this.f8726c.evaluateJavascript(this.f8736a, null);
            } catch (Throwable th) {
                C3551q9.m11517d().m11519a(th);
                Log.e(C3152gh.this.f8728e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f8737b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    /* renamed from: d */
    private void m8955d() {
        if (this.f8724a == null || this.f8725b == null) {
            return;
        }
        m8965a(C3007ch.f7740a, m8959a());
    }

    /* renamed from: h */
    private boolean m8957h(String str) {
        for (String str2 : this.f8729f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m8958i(String str) {
        return str.equalsIgnoreCase(C3007ch.f7750k);
    }

    /* renamed from: c */
    public String m8969c() {
        return this.f8727d;
    }

    /* renamed from: e */
    public void m8971e() {
        if (this.f8724a == null || this.f8725b == null) {
            return;
        }
        m8965a(C3007ch.f7741b, m8959a());
    }

    /* renamed from: f */
    public void m8973f(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.f8727d);
            m8965a(str, jSONObject);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: g */
    public void m8974g(String str) {
        this.f8727d = str;
    }

    /* renamed from: a */
    private String m8950a(String str) {
        return String.format(C3007ch.f7760u, str);
    }

    /* renamed from: d */
    private void m8956d(String str) {
        C3523pg.f10822a.m11404d(new b(OooO0oO.OooOo.OooOO0O("javascript:try{", str, "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}"), str));
    }

    /* renamed from: b */
    public void m8968b() {
        this.f8724a = null;
        this.f8725b = null;
    }

    /* renamed from: c */
    public void m8970c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("method");
            if (TextUtils.isEmpty(strOptString) || !m8957h(strOptString)) {
                m8965a(jSONObject.optString(C3007ch.f7761v, C3007ch.f7742c), jSONObject);
            } else if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                m8967a(jSONObject, (String) null, (String) null);
            }
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            Log.e(this.f8728e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: e */
    public void m8972e(String str) throws JSONException {
        JSONObject jSONObjectM13236a = this.f8725b.m13236a();
        jSONObjectM13236a.put("adViewId", this.f8727d);
        m8965a(str, jSONObjectM13236a);
    }

    /* renamed from: b */
    public boolean m8954b(String str) {
        for (String str2 : this.f8730g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject m8959a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C3007ch.f7758s, this.f8725b.m13236a());
            jSONObject.put(C3007ch.f7755p, jSONObject2);
            jSONObject.put("adViewId", m8969c());
            return jSONObject;
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return new JSONObject();
        }
    }

    /* renamed from: a */
    private JSONObject m8951a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(C3007ch.f7763x, jSONObject.getString(C3007ch.f7763x));
            jSONObject2.put("data", this.f8725b.m13236a());
            return jSONObject2;
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            Log.e(this.f8728e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e.toString());
            return jSONObject2;
        }
    }

    /* renamed from: a */
    public void m8960a(WebView webView) {
        this.f8726c = webView;
    }

    /* renamed from: a */
    public void m8961a(InterfaceC3077eh interfaceC3077eh) {
        this.f8724a = interfaceC3077eh;
    }

    /* renamed from: a */
    public void m8962a(String str, int i, boolean z) {
        this.f8725b.m13237a(str, i, z);
        if (m8958i(str)) {
            m8955d();
        }
    }

    /* renamed from: a */
    public void m8963a(String str, String str2) {
        InterfaceC3077eh interfaceC3077eh = this.f8724a;
        if (interfaceC3077eh != null) {
            interfaceC3077eh.mo8491a(str, str2, this.f8727d);
        }
    }

    /* renamed from: a */
    public void m8964a(String str, String str2, String str3) throws JSONException {
        if (this.f8726c == null) {
            String strOooOO0 = OooO0oO.OooOo.OooOO0("No external adUnit attached to ISNAdView while trying to send message: ", str);
            Log.e(this.f8728e, strOooOO0);
            this.f8724a.mo8491a(str3, strOooOO0, this.f8727d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
            str = "\"" + str + "\"";
        }
        m8956d(m8950a(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.f8727d);
        m8965a(str2, jSONObject);
    }

    /* renamed from: a */
    public void m8965a(String str, JSONObject jSONObject) {
        InterfaceC3077eh interfaceC3077eh = this.f8724a;
        if (interfaceC3077eh != null) {
            interfaceC3077eh.mo8492a(str, jSONObject);
        }
    }

    /* renamed from: a */
    public void m8966a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f8724a == null) {
            C3699th.m12428a(C3198hs.f8935t, new C3489oh().m11155a(C3037dc.f8270y, "mDelegate is null").m11156a());
        } else {
            C3523pg.f10822a.m11404d(new a(str, str3, str2, jSONObject));
        }
    }

    /* renamed from: a */
    public void m8967a(JSONObject jSONObject, String str, String str2) throws JSONException {
        m8964a(m8951a(jSONObject).toString(), str, str2);
    }
}
