package com.applovin.impl.sdk;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.net.Uri;
import android.p001os.OutcomeReceiver;
import android.text.TextUtils;
import android.view.InputEvent;
import com.applovin.impl.AbstractC1145o4;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C3007ch;
import com.ironsource.C3451ne;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.r */
/* loaded from: classes.dex */
public class C1243r {

    /* renamed from: a */
    private final C1220k f2351a;

    /* renamed from: b */
    private final Executor f2352b;

    /* renamed from: e */
    private final MeasurementManager f2355e;

    /* renamed from: h */
    private final TopicsManager f2358h;

    /* renamed from: c */
    private final Set f2353c = new HashSet();

    /* renamed from: d */
    private final Object f2354d = new Object();

    /* renamed from: f */
    private final AtomicReference f2356f = new AtomicReference(new JSONArray());

    /* renamed from: g */
    private final d f2357g = new d(this, null);

    /* renamed from: com.applovin.impl.sdk.r$a */
    public class a implements OutcomeReceiver {
        public a() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            C1243r.this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                C1243r.this.f2351a.m2847O().m3212a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        public void onResult(Object obj) {
            C1243r.this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                C1243r.this.f2351a.m2847O().m3211a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.r$b */
    public class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            C1243r.this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                C1243r.this.f2351a.m2847O().m3212a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        public void onResult(Object obj) {
            C1243r.this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                C1243r.this.f2351a.m2847O().m3211a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.r$c */
    public class c implements OutcomeReceiver {
        public c() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            C1243r.this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                C1243r.this.f2351a.m2847O().m3212a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        public void onResult(Object obj) {
            C1243r.this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                C1243r.this.f2351a.m2847O().m3211a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.r$d */
    public class d implements OutcomeReceiver {
        private d() {
        }

        /* renamed from: a */
        public void m3253a(GetTopicsResponse getTopicsResponse) {
            List topics = getTopicsResponse.getTopics();
            int size = topics.size();
            C1243r.this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                C1243r.this.f2351a.m2847O().m3215d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = topics.iterator();
            while (it.hasNext()) {
                Topic topicOooOOo = androidx.privacysandbox.ads.adservices.measurement.OooO00o.OooOOo(it.next());
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, C3007ch.f7763x, topicOooOOo.getTopicId());
                JsonUtils.putLong(jSONObject, C3451ne.f10402B, topicOooOOo.getModelVersion());
                JsonUtils.putLong(jSONObject, "taxonomy", topicOooOOo.getTaxonomyVersion());
                jSONArray.put(jSONObject);
            }
            C1243r.this.f2356f.set(jSONArray);
            C1243r.this.m3244b(((Boolean) C1243r.this.f2351a.m2866a(C1268v4.f2721X6)).booleanValue(), ((Long) C1243r.this.f2351a.m2866a(C1268v4.f2705V6)).longValue());
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            m3253a(androidx.privacysandbox.ads.adservices.measurement.OooO00o.OooOOo0(obj));
        }

        public /* synthetic */ d(C1243r c1243r, a aVar) {
            this();
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            String str;
            Long l = (Long) C1243r.this.f2351a.m2866a(C1268v4.f2713W6);
            boolean z = l.longValue() == -1;
            C1243r.this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                C1240o c1240oM2847O = C1243r.this.f2351a.m2847O();
                StringBuilder sb = new StringBuilder("Failed to retrieve topics");
                if (z) {
                    str = "";
                } else {
                    str = ", retrying in " + l + " ms";
                }
                sb.append(str);
                c1240oM2847O.m3212a("PrivacySandboxService", sb.toString(), exc);
            }
            if (z) {
                return;
            }
            C1243r.this.m3244b(((Boolean) C1243r.this.f2351a.m2866a(C1268v4.f2729Y6)).booleanValue(), l.longValue());
        }
    }

    public C1243r(C1220k c1220k) {
        this.f2351a = c1220k;
        this.f2352b = c1220k.m2918r0().m408b();
        Context contextM2824o = C1220k.m2824o();
        this.f2355e = androidx.privacysandbox.ads.adservices.customaudience.OooO00o.OooOOO0(contextM2824o.getSystemService(androidx.privacysandbox.ads.adservices.customaudience.OooO00o.OooOOo()));
        this.f2358h = androidx.privacysandbox.ads.adservices.measurement.OooO00o.OooOo00(contextM2824o.getSystemService(androidx.privacysandbox.ads.adservices.measurement.OooO00o.OooOo0()));
        if (((Boolean) c1220k.m2866a(C1268v4.f2697U6)).booleanValue()) {
            m3244b(((Boolean) c1220k.m2866a(C1268v4.f2721X6)).booleanValue(), 0L);
        }
    }

    /* renamed from: c */
    private boolean m3245c(String str) {
        synchronized (this.f2354d) {
            try {
                if (this.f2353c.contains(str)) {
                    return false;
                }
                this.f2353c.add(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public void m3248b(List list) {
        m3239a("register impression", new OooO0O0(7, this, list));
    }

    /* renamed from: a */
    public /* synthetic */ void m3240a(List list) {
        if (list == null || list.isEmpty() || this.f2355e == null || !AbstractC1145o4.m2011e(C1220k.f2090E0)) {
            return;
        }
        this.f2351a.m2847O();
        if (C1240o.m3200a()) {
            this.f2351a.m2847O().m3211a("PrivacySandboxService", "Registering impression...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f2355e.registerSource(Uri.parse((String) it.next()), null, this.f2352b, new a());
        }
    }

    /* renamed from: b */
    public void m3249b(List list, InputEvent inputEvent) {
        m3239a("register click", new OooO00o(this, list, inputEvent, 4));
    }

    /* renamed from: b */
    public void m3247b(String str) {
        m3239a("register conversion trigger event", new OooO0O0(8, this, str));
    }

    /* renamed from: b */
    public void m3244b(boolean z, long j) {
        m3239a("retrieve topics", new OooOOOO(this, z, j, 0));
    }

    /* renamed from: a */
    public /* synthetic */ void m3241a(List list, InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.f2355e == null || !AbstractC1145o4.m2011e(C1220k.f2090E0)) {
            return;
        }
        this.f2351a.m2847O();
        if (C1240o.m3200a()) {
            this.f2351a.m2847O().m3211a("PrivacySandboxService", "Registering click...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f2355e.registerSource(Uri.parse((String) it.next()), inputEvent, this.f2352b, new b());
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m3238a(String str) {
        if (TextUtils.isEmpty(str) || this.f2355e == null || !AbstractC1145o4.m2011e(C1220k.f2090E0)) {
            return;
        }
        this.f2351a.m2847O();
        if (C1240o.m3200a()) {
            androidx.datastore.preferences.protobuf.OooO00o.OooOoO0("Registering conversion: ", str, this.f2351a.m2847O(), "PrivacySandboxService");
        }
        this.f2355e.registerTrigger(Uri.parse(str), this.f2352b, new c());
    }

    /* renamed from: a */
    public JSONArray m3246a() {
        return (JSONArray) this.f2356f.get();
    }

    /* renamed from: a */
    public /* synthetic */ void m3242a(boolean z, long j) {
        if (this.f2358h == null) {
            return;
        }
        GetTopicsRequest getTopicsRequestBuild = androidx.privacysandbox.ads.adservices.measurement.OooO00o.OooOO0o().setShouldRecordObservation(z).setAdsSdkName("AppLovin").build();
        if (j <= 0) {
            this.f2358h.getTopics(getTopicsRequestBuild, this.f2352b, this.f2357g);
        } else {
            this.f2351a.m2918r0().m404a(new C1156p6(this.f2351a, true, "getTopics", new OooO0O0(6, this, getTopicsRequestBuild)), C0987b6.b.OTHER, j);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m3236a(GetTopicsRequest getTopicsRequest) {
        this.f2358h.getTopics(getTopicsRequest, this.f2352b, this.f2357g);
    }

    /* renamed from: a */
    private void m3239a(String str, Runnable runnable) {
        try {
            this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                this.f2351a.m2847O().m3211a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th) {
            this.f2351a.m2847O();
            if (C1240o.m3200a()) {
                this.f2351a.m2847O().m3212a("PrivacySandboxService", "Failed to run operation: " + str, th);
            }
            if (m3245c(str)) {
                this.f2351a.m2832E().m2148a("PrivacySandboxService", str, th);
            }
        }
    }
}
