package com.ironsource;

import android.content.Context;
import com.ironsource.C3034d9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.jh */
/* loaded from: classes2.dex */
public class C3256jh implements InterfaceC3890z2 {

    /* renamed from: b */
    private static final String f9110b = "jh";

    /* renamed from: c */
    private static C3256jh f9111c;

    /* renamed from: a */
    private final Map<String, InterfaceC3043di> f9112a = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.ironsource.jh$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C3222ih f9113a;

        /* renamed from: b */
        final /* synthetic */ Context f9114b;

        /* renamed from: c */
        final /* synthetic */ String f9115c;

        public a(C3222ih c3222ih, Context context, String str) {
            this.f9113a = c3222ih;
            this.f9114b = context;
            this.f9115c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3256jh.this.f9112a.put(this.f9115c, new C3042dh(this.f9113a, this.f9114b));
        }
    }

    /* renamed from: a */
    private C2972bh m9486a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(C3034d9.h.f8082O));
            String string = jSONObject2.get("height").toString();
            String string2 = jSONObject2.get("width").toString();
            return new C2972bh(Integer.parseInt(string2), Integer.parseInt(string), jSONObject2.get("label").toString());
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            return new C2972bh();
        }
    }

    /* renamed from: b */
    private C2972bh m9489b(JSONObject jSONObject) {
        C2972bh c2972bh = new C2972bh();
        try {
            return m9486a(jSONObject);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            return c2972bh;
        }
    }

    /* renamed from: c */
    public String m9495c(JSONObject jSONObject) throws JSONException {
        return (jSONObject == null || !jSONObject.has("adViewId")) ? (jSONObject == null || !jSONObject.has("params")) ? "" : new JSONObject(jSONObject.getString("params")).getString("adViewId") : jSONObject.getString("adViewId");
    }

    /* renamed from: d */
    public void m9497d(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = new JSONObject(jSONObject.getString("params")).getString("adViewId");
        if (string.isEmpty()) {
            Logger.m12266i(f9110b, "sendMessageToAd fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f9112a.containsKey(string)) {
            Logger.m12266i(f9110b, "sendMessageToAd fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        InterfaceC3043di interfaceC3043di = this.f9112a.get(string);
        if (interfaceC3043di != null) {
            interfaceC3043di.mo8316c(jSONObject, str, str2);
        }
    }

    /* renamed from: d */
    private boolean m9490d(JSONObject jSONObject) {
        return jSONObject.optBoolean(C3034d9.h.f8130s0);
    }

    @Override // com.ironsource.InterfaceC3890z2
    /* renamed from: a */
    public InterfaceC3043di mo9491a(String str) {
        if (str.isEmpty() || !this.f9112a.containsKey(str)) {
            return null;
        }
        return this.f9112a.get(str);
    }

    /* renamed from: b */
    public void m9494b(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.m12266i(f9110b, "performWebViewAction fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f9112a.containsKey(string)) {
            Logger.m12266i(f9110b, "performWebViewAction fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        InterfaceC3043di interfaceC3043di = this.f9112a.get(string);
        String string2 = jSONObject.getString(C3034d9.h.f8136v0);
        if (interfaceC3043di != null) {
            interfaceC3043di.mo8313a(string2, str, str2);
        }
    }

    /* renamed from: c */
    public void m9496c(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.m12266i(f9110b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f9112a.containsKey(string)) {
            Logger.m12266i(f9110b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        InterfaceC3043di interfaceC3043di = this.f9112a.get(string);
        this.f9112a.remove(string);
        if (interfaceC3043di != null) {
            interfaceC3043di.mo8312a(str, str2);
        }
    }

    /* renamed from: a */
    public static synchronized C3256jh m9487a() {
        try {
            if (f9111c == null) {
                f9111c = new C3256jh();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9111c;
    }

    /* renamed from: a */
    public void m9492a(InterfaceC3077eh interfaceC3077eh, JSONObject jSONObject, Context context, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.m12266i(f9110b, "loadWithUrl fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        C2972bh c2972bhM9489b = m9489b(jSONObject);
        if (this.f9112a.containsKey(string)) {
            Logger.m12266i(f9110b, "sendMessageToAd fail - collection already contain adViewId");
            throw new Exception("collection already contain adViewId");
        }
        C3222ih c3222ih = new C3222ih(interfaceC3077eh, context, string, c2972bhM9489b);
        c3222ih.m9343e(IronSourceStorageUtils.getNetworkStorageDir(context));
        c3222ih.mo8315b(jSONObject, str, str2);
        if (m9490d(jSONObject)) {
            C3523pg.f10822a.m11404d(new a(c3222ih, context, string));
        } else {
            this.f9112a.put(string, c3222ih);
        }
    }

    /* renamed from: a */
    public void m9493a(JSONObject jSONObject, String str, String str2) throws Exception {
        String string = jSONObject.getString("adViewId");
        if (string.isEmpty()) {
            Logger.m12266i(f9110b, "removeAdView fail - adViewId is empty");
            throw new Exception("adViewId is empty");
        }
        if (!this.f9112a.containsKey(string)) {
            Logger.m12266i(f9110b, "removeAdView fail - collection does not contain adViewId");
            throw new Exception("collection does not contain adViewId");
        }
        InterfaceC3043di interfaceC3043di = this.f9112a.get(string);
        if (interfaceC3043di != null) {
            interfaceC3043di.mo8314a(jSONObject, str, str2);
        }
    }
}
