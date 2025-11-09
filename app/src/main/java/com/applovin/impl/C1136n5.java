package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.C0958a5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.n5 */
/* loaded from: classes.dex */
public class C1136n5 extends AbstractRunnableC1036g5 {

    /* renamed from: j */
    private static JSONObject f1523j;

    /* renamed from: k */
    private static final Object f1524k = new Object();

    /* renamed from: l */
    private static final Map f1525l = Collections.synchronizedMap(new HashMap());

    /* renamed from: g */
    private final C1284x2 f1526g;

    /* renamed from: h */
    private final Context f1527h;

    /* renamed from: i */
    private final b f1528i;

    /* renamed from: com.applovin.impl.n5$b */
    public interface b {
        /* renamed from: a */
        void mo1705a(JSONArray jSONArray);
    }

    /* renamed from: com.applovin.impl.n5$c */
    public static class c implements C0958a5.a, Runnable {

        /* renamed from: a */
        private final b f1529a;

        /* renamed from: b */
        private final Object f1530b;

        /* renamed from: c */
        private int f1531c;

        /* renamed from: d */
        private final AtomicBoolean f1532d;

        /* renamed from: e */
        private final Collection f1533e;

        /* renamed from: f */
        private final C1220k f1534f;

        /* renamed from: g */
        private final C1240o f1535g;

        public /* synthetic */ c(int i, b bVar, C1220k c1220k, a aVar) {
            this(i, bVar, c1220k);
        }

        @Override // com.applovin.impl.C0958a5.a
        /* renamed from: a */
        public void mo120a(C0958a5 c0958a5) throws JSONException {
            boolean z;
            synchronized (this.f1530b) {
                this.f1533e.add(c0958a5);
                int i = this.f1531c - 1;
                this.f1531c = i;
                z = i < 1;
            }
            if (z && this.f1532d.compareAndSet(false, true)) {
                if (AbstractC1078k7.m1246h() && ((Boolean) this.f1534f.m2866a(C1268v4.f2634N)).booleanValue()) {
                    this.f1534f.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f1534f, "handleSignalCollectionCompleted", new o0OO00O(this, 1)), C0987b6.b.MEDIATION);
                } else {
                    m1898a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (this.f1532d.compareAndSet(false, true)) {
                m1898a();
            }
        }

        private c(int i, b bVar, C1220k c1220k) {
            this.f1531c = i;
            this.f1529a = bVar;
            this.f1534f = c1220k;
            this.f1535g = c1220k.m2847O();
            this.f1530b = new Object();
            this.f1533e = new ArrayList(i);
            this.f1532d = new AtomicBoolean();
        }

        /* renamed from: a */
        public void m1898a() throws JSONException {
            ArrayList arrayList;
            synchronized (this.f1530b) {
                arrayList = new ArrayList(this.f1533e);
            }
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C0958a5 c0958a5 = (C0958a5) obj;
                try {
                    JSONObject jSONObject = new JSONObject();
                    C0986b5 c0986b5M118f = c0958a5.m118f();
                    jSONObject.put("name", c0986b5M118f.m899c());
                    jSONObject.put(Constants.CLASS, c0986b5M118f.m895b());
                    jSONObject.put("adapter_version", c0958a5.m113a());
                    jSONObject.put("sdk_version", c0958a5.m116d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorM115c = c0958a5.m115c();
                    if (maxErrorM115c != null) {
                        jSONObject2.put("error_message", maxErrorM115c.getMessage());
                    } else {
                        jSONObject2.put("signal", c0958a5.m117e());
                    }
                    jSONObject2.put("signal_collection_time_ms", c0958a5.m114b());
                    jSONObject2.put("is_cached", c0958a5.m119g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (C1240o.m3200a()) {
                        this.f1535g.m3211a("TaskCollectSignals", "Collected signal from " + c0986b5M118f);
                    }
                } catch (JSONException e) {
                    if (C1240o.m3200a()) {
                        this.f1535g.m3212a("TaskCollectSignals", "Failed to create signal data", e);
                    }
                    this.f1534f.m2832E().m2148a("TaskCollectSignals", "createSignalsData", e);
                }
            }
            m1899a(jSONArray);
        }

        /* renamed from: a */
        private void m1899a(JSONArray jSONArray) {
            b bVar = this.f1529a;
            if (bVar != null) {
                bVar.mo1705a(jSONArray);
            }
        }
    }

    public C1136n5(C1284x2 c1284x2, Context context, C1220k c1220k, b bVar) {
        super("TaskCollectSignals", c1220k);
        this.f1526g = c1284x2;
        this.f1527h = context;
        this.f1528i = bVar;
    }

    /* renamed from: a */
    private void m1893a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f1528i, this.f776a);
        this.f776a.m2918r0().m404a(new C1156p6(this.f776a, "timeoutCollectSignal", cVar), C0987b6.b.TIMEOUT, ((Long) this.f776a.m2866a(AbstractC1144o3.f1653n7)).longValue());
        for (int i = 0; i < jSONArray.length(); i++) {
            m1891a(new C0986b5(this.f1526g, jSONArray.getJSONObject(i), jSONObject, this.f776a), cVar);
        }
    }

    /* renamed from: b */
    private void m1897b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f1525l.get(this.f1526g.m3642b());
        if (set == null || set.isEmpty()) {
            m1892a("No signal providers found for ad unit: " + this.f1526g.m3642b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        m1893a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (f1524k) {
                jSONArray = JsonUtils.getJSONArray(f1523j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f1525l.size() > 0) {
                    m1897b(jSONArray, f1523j);
                    return;
                } else {
                    m1893a(jSONArray, f1523j);
                    return;
                }
            }
            if (C1240o.m3200a()) {
                this.f778c.m3218k(this.f777b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f776a.m2868a(C1286x4.f3033E, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f1525l.size() > 0) {
                    m1897b(jSONArray2, jSONObject);
                    return;
                } else {
                    m1893a(jSONArray2, jSONObject);
                    return;
                }
            }
            m1892a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e) {
            m1892a("Failed to wait for signals", e);
            this.f776a.m2832E().m2148a("TaskCollectSignals", "waitForSignals", e);
        } catch (JSONException e2) {
            m1892a("Failed to parse signals JSON", e2);
            this.f776a.m2832E().m2148a("TaskCollectSignals", "parseSignalsJSON", e2);
        } catch (Throwable th) {
            m1892a("Failed to collect signals", th);
            this.f776a.m2832E().m2148a("TaskCollectSignals", "collectSignals", th);
        }
    }

    /* renamed from: a */
    private void m1891a(C0986b5 c0986b5, C0958a5.a aVar) {
        if (c0986b5.m921r()) {
            AppLovinSdkUtils.runOnUiThread(new androidx.webkit.OooO00o(this, c0986b5, aVar, 13));
        } else {
            this.f776a.m2860X().collectSignal(c0986b5, this.f1527h, aVar);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m1896b(C0986b5 c0986b5, C0958a5.a aVar) {
        this.f776a.m2860X().collectSignal(c0986b5, this.f1527h, aVar);
    }

    /* renamed from: a */
    private void m1892a(String str, Throwable th) {
        if (C1240o.m3200a()) {
            this.f778c.m3212a(this.f777b, "No signals collected: " + str, th);
        }
        b bVar = this.f1528i;
        if (bVar != null) {
            bVar.mo1705a(new JSONArray());
        }
    }

    /* renamed from: a */
    public static void m1894a(JSONObject jSONObject) {
        synchronized (f1524k) {
            f1523j = jSONObject;
        }
    }

    /* renamed from: a */
    public static void m1895a(JSONObject jSONObject, C1220k c1220k) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f1525l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e) {
            C1240o.m3204c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
            c1220k.m2832E().m2148a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e);
        }
    }
}
