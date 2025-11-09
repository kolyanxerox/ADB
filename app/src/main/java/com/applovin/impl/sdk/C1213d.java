package com.applovin.impl.sdk;

import OooO0oo.o00Oo0;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.AbstractC1072k1;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1254u;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1286x4;
import com.applovin.impl.o0O0O00;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1212c;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d */
/* loaded from: classes.dex */
public class C1213d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1220k f2026a;

    /* renamed from: b */
    private final C1212c f2027b;

    /* renamed from: c */
    private final List f2028c = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.sdk.d$a */
    public interface a {
        /* renamed from: a */
        void mo1974a(AbstractC1207b abstractC1207b);
    }

    public C1213d(C1220k c1220k) {
        this.f2026a = c1220k;
        this.f2027b = new C1212c(c1220k);
    }

    /* renamed from: c */
    public /* synthetic */ void m2690c(C1212c.a aVar) {
        if (aVar == null) {
            this.f2026a.m2847O();
            if (C1240o.m3200a()) {
                this.f2026a.m2847O().m3211a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.f2028c.add(aVar);
        if (((Boolean) this.f2026a.m2866a(C1268v4.f2715X0)).booleanValue()) {
            m2695h();
        }
    }

    /* renamed from: d */
    public /* synthetic */ void m2691d() {
        this.f2026a.m2916q0().m3800b(C1286x4.f3032D);
        this.f2027b.m2667a();
    }

    /* renamed from: e */
    private void m2693e() {
        String str = (String) this.f2026a.m2916q0().m3794a(C1286x4.f3032D);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            C1212c.a aVarM2674a = C1212c.a.m2674a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.f2026a);
            if (aVarM2674a != null) {
                if (m2687a(aVarM2674a)) {
                    long jM2677c = aVarM2674a.m2677c() - SystemClock.elapsedRealtime();
                    this.f2026a.m2897g().m576d(C0993c2.f487L, CollectionUtils.map("details", "ttl = " + jM2677c + "ms"));
                } else {
                    this.f2028c.add(0, aVarM2674a);
                }
            }
        }
    }

    /* renamed from: f */
    private void m2694f() {
        this.f2026a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2026a, "loadPersistedAdFilesQueueAndCleanupAsync", new OooO0o(this, 0)), C0987b6.b.OTHER);
    }

    /* renamed from: h */
    private void m2695h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f2028c) {
            try {
                Iterator it = this.f2028c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1212c.a) it.next()).mo1363a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2026a.m2916q0().m3801b(C1286x4.f3032D, new JSONArray((Collection) arrayList).toString());
    }

    /* renamed from: a */
    public void m2697a(C1254u c1254u, a aVar) {
        if (aVar == null) {
            this.f2026a.m2847O();
            if (C1240o.m3200a()) {
                this.f2026a.m2847O().m3214b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            AbstractC1072k1.m1126a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (c1254u == null) {
            m2686a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.f2026a.m2897g().m707a(C0993c2.f481I, c1254u, (AppLovinError) null);
        C1212c.a aVarM2682a = m2682a(c1254u.m3377g());
        this.f2027b.m2668a(aVarM2682a, new o0O0O00(this, aVar, aVarM2682a, c1254u));
    }

    /* renamed from: b */
    public void m2698b() {
        m2694f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    /* renamed from: g */
    public void m2700g() {
        this.f2026a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2026a, "resetManagerState", new OooO0o(this, 1)), C0987b6.b.OTHER);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        m2695h();
    }

    /* renamed from: d */
    private void m2692d(C1212c.a aVar) {
        if (aVar != null && this.f2028c.remove(aVar)) {
            this.f2027b.m2671b(aVar);
        }
    }

    /* renamed from: b */
    public void m2699b(AbstractC1207b abstractC1207b) {
        if (abstractC1207b == null) {
            return;
        }
        this.f2026a.m2897g().m705a(C0993c2.f475F, abstractC1207b);
        this.f2027b.m2670b(abstractC1207b, new o00Oo0(this, 12));
    }

    /* renamed from: b */
    private boolean m2688b(C1212c.a aVar) {
        long jM2676b = aVar.m2676b();
        return (jM2676b == 0 || jM2676b == C1220k.m2823n()) ? false : true;
    }

    /* renamed from: c */
    public /* synthetic */ void m2689c() {
        m2693e();
        m2683a();
    }

    /* renamed from: a */
    public /* synthetic */ void m2685a(a aVar, C1212c.a aVar2, C1254u c1254u, AbstractC1207b abstractC1207b, String str) {
        if (abstractC1207b != null && !StringUtils.isValidString(str)) {
            m2684a(aVar, abstractC1207b, aVar2);
        } else {
            m2686a(aVar, aVar2, c1254u, str);
        }
    }

    /* renamed from: a */
    public void m2696a(AbstractC1207b abstractC1207b) {
        if (abstractC1207b == null) {
            return;
        }
        m2692d(C1212c.a.m2672a(abstractC1207b));
    }

    /* renamed from: a */
    private C1212c.a m2682a(AppLovinAdType appLovinAdType) {
        C1212c.a aVar;
        synchronized (this.f2028c) {
            try {
                Iterator it = this.f2028c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (C1212c.a) it.next();
                    if (aVar.m2680f().equals(appLovinAdType) && !m2687a(aVar) && m2688b(aVar)) {
                        break;
                    }
                }
                this.f2028c.remove(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private void m2686a(a aVar, C1212c.a aVar2, C1254u c1254u, String str) {
        if (aVar == null) {
            return;
        }
        this.f2026a.m2847O();
        if (C1240o.m3200a()) {
            this.f2026a.m2847O().m3211a("AdPersistenceManager", str);
        }
        aVar.mo1974a(null);
        this.f2027b.m2671b(aVar2);
        this.f2026a.m2897g().m707a(C0993c2.f485K, c1254u, new AppLovinError(-1, str));
    }

    /* renamed from: a */
    private void m2684a(a aVar, AbstractC1207b abstractC1207b, C1212c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.f2026a.m2847O();
        if (C1240o.m3200a()) {
            this.f2026a.m2847O().m3211a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.mo1974a(abstractC1207b);
        this.f2027b.m2671b(aVar2);
        this.f2026a.m2897g().m705a(C0993c2.f483J, abstractC1207b);
    }

    /* renamed from: a */
    private boolean m2687a(C1212c.a aVar) {
        return ((Long) this.f2026a.m2866a(C1268v4.f2731Z0)).longValue() + SystemClock.elapsedRealtime() >= aVar.m2677c();
    }

    /* renamed from: a */
    private void m2683a() {
        synchronized (this.f2028c) {
            this.f2027b.m2669a(new ArrayList(this.f2028c));
        }
    }
}
