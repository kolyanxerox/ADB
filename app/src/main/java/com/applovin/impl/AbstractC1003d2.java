package com.applovin.impl;

import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.C0993c2;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.OfficeOpenXMLExtended;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.d2 */
/* loaded from: classes.dex */
public abstract class AbstractC1003d2 {

    /* renamed from: g */
    private static volatile ExecutorService f635g;

    /* renamed from: a */
    protected final C1220k f637a;

    /* renamed from: b */
    protected final C1240o f638b;

    /* renamed from: c */
    private final C0993c2.b f639c;

    /* renamed from: d */
    private final Map f640d = Collections.synchronizedMap(new HashMap());

    /* renamed from: e */
    private final Set f641e = Collections.synchronizedSet(new HashSet());

    /* renamed from: f */
    private static final int f634f = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: h */
    private static final Object f636h = new Object();

    /* renamed from: com.applovin.impl.d2$a */
    public class a implements ThreadFactory {

        /* renamed from: com.applovin.impl.d2$a$a, reason: collision with other inner class name */
        public class C4551a implements Thread.UncaughtExceptionHandler {
            public C4551a() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                AbstractC1003d2.this.f637a.m2847O();
                if (C1240o.m3200a()) {
                    AbstractC1003d2.this.f637a.m2847O().m3212a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) AbstractC1003d2.this.f637a.m2866a(C1268v4.f2658Q)).intValue());
            thread.setUncaughtExceptionHandler(new C4551a());
            return thread;
        }
    }

    public AbstractC1003d2(C1220k c1220k, C0993c2.b bVar) {
        this.f637a = c1220k;
        this.f638b = c1220k.m2847O();
        this.f639c = bVar;
        m559a();
    }

    /* renamed from: a */
    private void m559a() {
        if (f635g != null) {
            return;
        }
        synchronized (f636h) {
            try {
                if (f635g != null) {
                    return;
                }
                f635g = Executors.newFixedThreadPool(1, new a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    private void m569c(C0993c2 c0993c2, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (c0993c2.m453a() == C0993c2.b.AD || c0993c2.m453a() == C0993c2.b.MEDIATED_AD || c0993c2.m453a() == C0993c2.b.USER_SESSION || !AbstractC1078k7.m1199a(((Integer) this.f637a.m2866a(C1268v4.f2939z)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) m557a(c0993c2, map).openConnection();
            } catch (Throwable th2) {
                httpURLConnection = null;
                th = th2;
            }
            try {
                int i = f634f;
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
                httpURLConnection.setDefaultUseCaches(false);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("AppLovin-Event-Type", c0993c2.m454b());
                int responseCode = httpURLConnection.getResponseCode();
                if (C1240o.m3200a()) {
                    this.f638b.m3211a("HealthEventsReporter", c0993c2.m454b() + " reported with code " + responseCode + " and extra parameters " + map);
                }
                this.f640d.put(c0993c2, Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th3) {
                th = th3;
                try {
                    if (C1240o.m3200a()) {
                        this.f638b.m3216d("HealthEventsReporter", "Failed to report " + c0993c2.m454b() + " with extra parameters " + map, th);
                    }
                    AbstractC1078k7.m1198a(httpURLConnection, this.f637a);
                } finally {
                    AbstractC1078k7.m1198a(httpURLConnection, this.f637a);
                }
            }
        }
    }

    /* renamed from: d */
    public void m576d(C0993c2 c0993c2, Map map) {
        m575a(c0993c2, map, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m561a(String str, C0993c2 c0993c2, JSONObject jSONObject) {
        HttpURLConnection httpURLConnection = null;
        try {
            URL url = new URL(str);
            byte[] bytes = jSONObject.toString().getBytes("UTF-8");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                int i = f634f;
                httpURLConnection2.setConnectTimeout(i);
                httpURLConnection2.setReadTimeout(i);
                httpURLConnection2.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection2.setDefaultUseCaches(false);
                httpURLConnection2.setAllowUserInteraction(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("AppLovin-Event-Type", c0993c2.m454b());
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                outputStream.write(bytes);
                outputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                if (C1240o.m3200a()) {
                    this.f638b.m3211a("HealthEventsReporter", c0993c2.m454b() + " reported with code " + responseCode);
                }
                this.f640d.put(c0993c2, Long.valueOf(System.currentTimeMillis()));
                AbstractC1078k7.m1198a(httpURLConnection2, this.f637a);
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    if (C1240o.m3200a()) {
                        this.f638b.m3216d("HealthEventsReporter", "Failed to report " + c0993c2.m454b(), th);
                    }
                } finally {
                    AbstractC1078k7.m1198a(httpURLConnection, this.f637a);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: d */
    private void m570d(C0993c2 c0993c2, List list) {
        String str = (String) this.f637a.m2866a(C1268v4.f2530A);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double dM452a = c0993c2.m452a(this.f637a);
        if (AbstractC1078k7.m1199a(dM452a)) {
            if (((Boolean) this.f637a.m2866a(C1268v4.f2578G)).booleanValue()) {
                m561a(str, c0993c2, m558a(c0993c2, dM452a, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f635g.execute(new OooOo0O.OooO0O0(this, str, c0993c2, m558a(c0993c2, dM452a, Collections.singletonList((Map) it.next())), 1));
            }
        }
    }

    /* renamed from: a */
    public void m571a(C0993c2 c0993c2, String str) {
        m572a(c0993c2, str, new HashMap());
    }

    /* renamed from: a */
    public void m572a(C0993c2 c0993c2, String str, Map map) {
        map.put("source", str);
        m576d(c0993c2, map);
    }

    /* renamed from: a */
    public void m573a(C0993c2 c0993c2, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.f641e.add(str2)) {
            map.put("source", str);
            m572a(c0993c2, str, map);
        }
    }

    /* renamed from: a */
    public void m575a(C0993c2 c0993c2, Map map, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        m574a(c0993c2, arrayList, j);
    }

    /* renamed from: a */
    public void m574a(C0993c2 c0993c2, List list, long j) {
        if (m563a(c0993c2, j)) {
            return;
        }
        try {
            if (AbstractC1078k7.m1246h()) {
                f635g.execute(new androidx.webkit.OooO00o(this, c0993c2, list, 4));
            } else {
                m565b(c0993c2, list);
            }
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.f638b.m3216d("HealthEventsReporter", "Failed to report " + c0993c2.m454b() + " with extra parameters collection " + list, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m565b(C0993c2 c0993c2, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (C1240o.m3200a()) {
            this.f638b.m3211a("HealthEventsReporter", "Reporting " + c0993c2.m454b() + " with extra parameters collection " + list);
        }
        if (this.f639c != c0993c2.m453a()) {
            AbstractC1072k1.m1126a("Health event " + c0993c2.m454b() + " category: " + c0993c2.m453a() + " does not match the reporter category: " + this.f639c, new Object[0]);
        }
        m569c(c0993c2, list);
        m570d(c0993c2, list);
    }

    /* renamed from: c */
    private Map m568c(C0993c2 c0993c2, Map map) {
        HashMap map2 = new HashMap(map);
        if (c0993c2 == C0993c2.f470C0) {
            map2.remove("details");
        }
        return map2;
    }

    /* renamed from: b */
    private Map m564b(C0993c2 c0993c2, Map map) {
        HashMap map2 = new HashMap();
        map2.put("type", c0993c2.m454b());
        if (c0993c2 == C0993c2.f552y0 || c0993c2 == C0993c2.f550x0 || c0993c2 == C0993c2.f492N0 || c0993c2 == C0993c2.f488L0) {
            if (((Boolean) this.f637a.m2866a(C1268v4.f2824k4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(AbstractC1079k8.m1263d()), map2);
                CollectionUtils.putStringIfValid("wvv", AbstractC1079k8.m1262c(), map2);
                CollectionUtils.putStringIfValid("wvpn", AbstractC1079k8.m1259b(), map2);
            }
            CollectionUtils.putStringIfValid("oglv", this.f637a.m2827B().m2987I(), map2);
        }
        Map mapM2989L = this.f637a.m2827B().m2989L();
        map2.put(C3451ne.f10417G, String.valueOf(mapM2989L.get(C3451ne.f10417G)));
        map2.put("country_code", String.valueOf(mapM2989L.get("country_code")));
        map2.put("cc", this.f637a.m2927w().getCountryCode());
        map2.put("applovin_random_token", this.f637a.m2902i0());
        map2.put("compass_random_token", this.f637a.m2925v());
        map2.put(C3451ne.f10402B, Build.MODEL);
        map2.put("brand", Build.MANUFACTURER);
        map2.put("brand_name", Build.BRAND);
        map2.put("hardware", Build.HARDWARE);
        map2.put("revision", Build.DEVICE);
        map2.put(C3451ne.f10411E, Build.VERSION.RELEASE);
        map2.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        map2.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C1060j.m1024b(), map2);
        map2.put(C3451ne.f10517u, (String) this.f637a.m2866a(C1268v4.f2891t));
        m567b(map2);
        m562a(map2);
        if (map != null) {
            map2.putAll(m568c(c0993c2, map));
        }
        return map2;
    }

    /* renamed from: a */
    private URL m557a(C0993c2 c0993c2, Map map) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error?");
        Iterator it = m564b(c0993c2, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strEncode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String strEncode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb.append(strEncode);
            sb.append(C3034d9.i.f8173b);
            sb.append(strEncode2);
            if (it.hasNext()) {
                sb.append(C3034d9.i.f8175c);
            }
        }
        return new URL(sb.toString());
    }

    /* renamed from: a */
    private JSONObject m558a(C0993c2 c0993c2, double d, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (c0993c2 == C0993c2.f552y0 || c0993c2 == C0993c2.f550x0 || c0993c2 == C0993c2.f492N0 || c0993c2 == C0993c2.f488L0) {
            if (((Boolean) this.f637a.m2866a(C1268v4.f2824k4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(AbstractC1079k8.m1263d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", AbstractC1079k8.m1262c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", AbstractC1079k8.m1259b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.f637a.m2827B().m2987I());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map mapM2989L = this.f637a.m2827B().m2989L();
        JsonUtils.putObject(jSONObject2, C3451ne.f10417G, mapM2989L.get(C3451ne.f10417G));
        JsonUtils.putObject(jSONObject2, C3451ne.f10411E, mapM2989L.get(C3451ne.f10411E));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(mapM2989L.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", mapM2989L.get("brand"));
        JsonUtils.putObject(jSONObject2, C3451ne.f10402B, mapM2989L.get(C3451ne.f10402B));
        JsonUtils.putObject(jSONObject2, "revision", mapM2989L.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", mapM2989L.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.f637a.m2927w().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.f637a.m2902i0());
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(C1060j.m1024b()));
        Map mapM2984E = this.f637a.m2827B().m2984E();
        JsonUtils.putObject(jSONObject2, "sdk_version", mapM2984E.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.f637a.m2866a(C1268v4.f2598I3));
        JsonUtils.putObject(jSONObject2, "app_version", mapM2984E.get("app_version"));
        JsonUtils.putObject(jSONObject2, C3034d9.h.f8089V, mapM2984E.get(C3034d9.h.f8089V));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) mapM2984E.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, C3451ne.f10517u, this.f637a.m2866a(C1268v4.f2891t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.f637a.m2857V());
        SessionTracker sessionTrackerM2911n0 = this.f637a.m2911n0();
        JsonUtils.putObject(jSONObject2, "app_state", sessionTrackerM2911n0.getCurrentApplicationState().m2474b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(sessionTrackerM2911n0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, "session_id", sessionTrackerM2911n0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - C1220k.m2823n()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", c0993c2.m454b());
            JsonUtils.putDouble(jSONObject3, "weight", d);
            JsonUtils.putString(jSONObject3, AppLovinEventTypes.USER_COMPLETED_LEVEL, "DEBUG");
            m562a(map);
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m567b(java.util.Map r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.Context r2 = com.applovin.impl.sdk.C1220k.m2824o()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L18
            android.content.Context r3 = com.applovin.impl.sdk.C1220k.m2824o()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L19
            goto L1a
        L18:
            r3 = r0
        L19:
            r2 = 0
        L1a:
            java.lang.String r4 = "package_name"
            r6.put(r4, r3)
            if (r2 == 0) goto L23
            java.lang.String r0 = r2.versionName
        L23:
            java.lang.String r3 = "app_version"
            r6.put(r3, r0)
            if (r2 == 0) goto L2c
            int r1 = r2.versionCode
        L2c:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "app_version_code"
            r6.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC1003d2.m567b(java.util.Map):void");
    }

    /* renamed from: a */
    private void m562a(Map map) {
        if (map == null) {
            return;
        }
        Object objM3041a = this.f637a.m2839I().m3041a();
        if (objM3041a instanceof AbstractC1207b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((AbstractC1207b) objM3041a).getAdIdNumber()));
        } else if (objM3041a instanceof AbstractC1266v2) {
            AbstractC1266v2 abstractC1266v2 = (AbstractC1266v2) objM3041a;
            map.put("fs_ad_network", abstractC1266v2.getNetworkName());
            map.put("fs_ad_creative_id", abstractC1266v2.getCreativeId());
        } else {
            map.put("fs_ad_network", OfficeOpenXMLExtended.SECURITY_NONE);
            map.put("fs_ad_creative_id", OfficeOpenXMLExtended.SECURITY_NONE);
        }
    }

    /* renamed from: a */
    private boolean m563a(C0993c2 c0993c2, long j) {
        Long l = (Long) this.f640d.get(c0993c2);
        return System.currentTimeMillis() - (l != null ? l.longValue() : -1L) < j;
    }
}
