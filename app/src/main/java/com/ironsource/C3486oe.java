package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adquality.AdQualityBridge;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.oe */
/* loaded from: classes2.dex */
public class C3486oe {

    /* renamed from: a */
    private final InterfaceC3767vf f10649a;

    /* renamed from: b */
    private final ConcurrentHashMap<String, Object> f10650b;

    /* renamed from: c */
    private final AtomicBoolean f10651c;

    /* renamed from: d */
    private final AtomicBoolean f10652d;

    /* renamed from: com.ironsource.oe$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f10653a;

        public a(Context context) {
            this.f10653a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3486oe.this.m11143e(this.f10653a);
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C3486oe.this.f10651c.set(false);
        }
    }

    /* renamed from: com.ironsource.oe$b */
    public static class b {

        /* renamed from: a */
        static volatile C3486oe f10655a = new C3486oe(null);

        private b() {
        }
    }

    private C3486oe() {
        this.f10651c = new AtomicBoolean(false);
        this.f10652d = new AtomicBoolean(false);
        this.f10649a = C3495on.m11199U().mo8686f();
        this.f10650b = new ConcurrentHashMap<>();
    }

    /* renamed from: b */
    public static C3486oe m11141b() {
        return b.f10655a;
    }

    /* renamed from: d */
    private void m11142d(Context context) {
        if (context == null || this.f10652d.getAndSet(true)) {
            return;
        }
        m11139a("auid", this.f10649a.mo4879t(context));
        m11139a(C3451ne.f10402B, this.f10649a.mo4849e());
        m11139a(C3451ne.f10514t, this.f10649a.mo4852g());
        m11139a(C3451ne.f10411E, this.f10649a.mo4865m());
        m11139a(C3451ne.f10502p, this.f10649a.mo4874r(context));
        String adQualitySdkVersion = AdQualityBridge.getAdQualitySdkVersion();
        if (!TextUtils.isEmpty(adQualitySdkVersion)) {
            m11139a(C3451ne.f10401A1, adQualitySdkVersion);
        }
        String strMo4870p = this.f10649a.mo4870p();
        if (strMo4870p != null) {
            m11139a(C3451ne.f10414F, strMo4870p.replaceAll("[^0-9/.]", ""));
            m11139a(C3451ne.f10421I, strMo4870p);
        }
        m11139a(C3451ne.f10457a, String.valueOf(this.f10649a.mo4862l()));
        String strMo4859j = this.f10649a.mo4859j(context);
        if (!TextUtils.isEmpty(strMo4859j)) {
            m11139a(C3451ne.f10434O0, strMo4859j);
        }
        String strM7872e = C2959b4.m7872e(context);
        if (!TextUtils.isEmpty(strM7872e)) {
            m11139a(C3451ne.f10499o, strM7872e);
        }
        String strMo4857i = this.f10649a.mo4857i(context);
        if (!TextUtils.isEmpty(strMo4857i)) {
            m11139a(C3451ne.f10518u0, strMo4857i);
        }
        m11139a(C3451ne.f10472f, context.getPackageName());
        m11139a(C3451ne.f10520v, String.valueOf(this.f10649a.mo4855h(context)));
        m11139a(C3451ne.f10458a0, C3451ne.f10482i0);
        m11139a(C3451ne.f10461b0, Long.valueOf(C2959b4.m7873f(context)));
        m11139a(C3451ne.f10455Z, Long.valueOf(C2959b4.m7870d(context)));
        m11139a(C3451ne.f10466d, C2959b4.m7866b(context));
        m11139a(C3451ne.f10431N, Integer.valueOf(C3896z8.m13304f(context)));
        m11139a(C3451ne.f10451X, C3896z8.m13305g(context));
        m11139a("stid", C3126fq.m8738c(context));
        m11139a(C3451ne.f10417G, "android");
        m11139a(C3451ne.f10532z, this.f10649a.mo4856i());
        m11139a(C3451ne.f10529y, this.f10649a.mo4836a(this.f10649a.mo4885z(context)));
        m11136a();
    }

    /* renamed from: e */
    public void m11143e(Context context) {
        if (context == null) {
            return;
        }
        try {
            String strMo4871p = this.f10649a.mo4871p(context);
            if (!TextUtils.isEmpty(strMo4871p)) {
                m11139a(C3451ne.f10444T0, strMo4871p);
            }
            String strMo4837a = this.f10649a.mo4837a(context);
            if (TextUtils.isEmpty(strMo4837a)) {
                return;
            }
            m11139a(C3451ne.f10511s, Boolean.valueOf(Boolean.parseBoolean(strMo4837a)));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: f */
    private void m11144f(Context context) {
        if (context == null) {
            return;
        }
        m11137a(context);
        String strMo4826G = this.f10649a.mo4826G(context);
        if (!TextUtils.isEmpty(strMo4826G)) {
            m11139a(C3451ne.f10424J0, strMo4826G);
        } else if (m11140a(C3451ne.f10424J0)) {
            m11149b(C3451ne.f10424J0);
        }
        m11139a("idfi", this.f10649a.mo4882w(context));
        String strMo4842b = this.f10649a.mo4842b(context);
        if (!TextUtils.isEmpty(strMo4842b)) {
            m11139a(C3451ne.f10505q, strMo4842b.toUpperCase(Locale.getDefault()));
        }
        m11139a(C3451ne.f10508r, this.f10649a.mo4828I(context));
        String strMo4841b = this.f10649a.mo4841b();
        if (!TextUtils.isEmpty(strMo4841b)) {
            m11139a("tz", strMo4841b);
        }
        String strM4798b = C2635a9.m4798b(context);
        if (!TextUtils.isEmpty(strM4798b) && !strM4798b.equals("none")) {
            m11139a(C3451ne.f10484j, strM4798b);
        }
        String strM4801d = C2635a9.m4801d(context);
        if (!TextUtils.isEmpty(strM4801d)) {
            m11139a(C3451ne.f10487k, strM4801d);
        }
        m11139a("vpn", Boolean.valueOf(C2635a9.m4802e(context)));
        String strMo4867n = this.f10649a.mo4867n(context);
        if (!TextUtils.isEmpty(strMo4867n)) {
            m11139a("icc", strMo4867n);
        }
        int iMo4821B = this.f10649a.mo4821B(context);
        if (iMo4821B >= 0) {
            m11139a(C3451ne.f10483i1, Integer.valueOf(iMo4821B));
        }
        m11139a(C3451ne.f10486j1, this.f10649a.mo4823D(context));
        m11139a(C3451ne.f10489k1, this.f10649a.mo4830K(context));
        m11139a(C3451ne.f10476g0, Float.valueOf(this.f10649a.mo4864m(context)));
        m11139a(C3451ne.f10493m, String.valueOf(this.f10649a.mo4868o()));
        m11139a(C3451ne.f10437Q, Integer.valueOf(this.f10649a.mo4846d()));
        m11139a(C3451ne.f10435P, Integer.valueOf(this.f10649a.mo4860k()));
        m11139a(C3451ne.f10450W0, String.valueOf(this.f10649a.mo4858j()));
        m11139a(C3451ne.f10474f1, String.valueOf(this.f10649a.mo4872q()));
        m11139a("mcc", Integer.valueOf(C3896z8.m13300b(context)));
        m11139a("mnc", Integer.valueOf(C3896z8.m13301c(context)));
        m11139a(C3451ne.f10441S, Boolean.valueOf(this.f10649a.mo4844c()));
        m11139a(C3451ne.f10475g, Boolean.valueOf(this.f10649a.mo4829J(context)));
        m11139a(C3451ne.f10478h, Integer.valueOf(this.f10649a.mo4863l(context)));
        m11139a(C3451ne.f10460b, Boolean.valueOf(this.f10649a.mo4845c(context)));
        m11139a(C3451ne.f10423J, Boolean.valueOf(this.f10649a.mo4847d(context)));
        m11139a("rt", Boolean.valueOf(this.f10649a.mo4851f()));
        m11139a(C3451ne.f10453Y, String.valueOf(this.f10649a.mo4854h()));
        m11139a(C3451ne.f10469e, Integer.valueOf(this.f10649a.mo4884y(context)));
        m11139a(C3451ne.f10452X0, Boolean.valueOf(this.f10649a.mo4873q(context)));
        m11139a(C3451ne.f10463c, this.f10649a.mo4850f(context));
        m11139a(C3451ne.f10464c0, this.f10649a.mo4878t());
        C3853y c3853y = new C3853y(C3495on.m11199U().mo8689k());
        HashMap map = new HashMap();
        c3853y.mo9324a(map);
        m11139a(C3451ne.f10406C0, map);
        m11139a(C3451ne.f10425K, ConfigFile.getConfigFile().getPluginType());
        m11139a(C3451ne.f10427L, ConfigFile.getConfigFile().getPluginVersion());
        m11139a(C3451ne.f10429M, ConfigFile.getConfigFile().getPluginFrameworkVersion());
    }

    /* renamed from: c */
    public void m11151c(Context context) {
        try {
            m11142d(context);
            m11144f(context);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public /* synthetic */ C3486oe(a aVar) {
        this();
    }

    /* renamed from: a */
    private void m11136a() {
        String strMo10893a = C3504ow.f10716a.mo10893a();
        if (strMo10893a != null) {
            HashMap mapOooOOo = androidx.datastore.preferences.protobuf.OooO00o.OooOOo("sdk", strMo10893a);
            HashMap map = new HashMap();
            map.put(C3451ne.f10416F1, mapOooOOo);
            HashMap map2 = new HashMap();
            map2.put(C3451ne.f10407C1, map);
            m11147a(map2);
        }
    }

    /* renamed from: b */
    public JSONObject m11148b(Context context) throws JSONException {
        m11144f(context);
        return new JSONObject(C3556qe.m11549a(this.f10650b));
    }

    /* renamed from: b */
    public void m11149b(String str) {
        if (str == null) {
            return;
        }
        try {
            this.f10650b.remove(str);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: b */
    public void m11150b(String str, Object obj) {
        m11139a(str, obj);
    }

    /* renamed from: a */
    private void m11137a(Context context) {
        if (this.f10651c.get()) {
            return;
        }
        try {
            this.f10651c.set(true);
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(context));
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
            this.f10651c.set(false);
        }
    }

    /* renamed from: a */
    private void m11139a(String str, Object obj) {
        if (str == null || obj == null) {
            return;
        }
        try {
            if (obj instanceof Boolean) {
                obj = Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            this.f10650b.put(str, obj);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    public void m11145a(String str, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        try {
            Object obj = this.f10650b.get(str);
            if (!(obj instanceof JSONArray)) {
                m11139a(str, (Object) jSONArray);
                return;
            }
            JSONArray jSONArray2 = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                jSONArray2.put(jSONArray.get(i));
            }
            m11139a(str, (Object) jSONArray2);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    public void m11146a(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = this.f10650b.get(str);
            if (!(obj instanceof JSONObject)) {
                m11139a(str, (Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            m11139a(str, (Object) jSONObject2);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    public void m11147a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                if (map.containsKey(str)) {
                    m11139a(str, map.get(str));
                }
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    private boolean m11140a(String str) {
        return str != null && this.f10650b.containsKey(str);
    }
}
