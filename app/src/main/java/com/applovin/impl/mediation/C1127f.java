package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.AbstractC1013e2;
import com.applovin.impl.AbstractC1072k1;
import com.applovin.impl.AbstractC1144o3;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1037g6;
import com.applovin.impl.C1044h3;
import com.applovin.impl.C1056i5;
import com.applovin.impl.C1170q4;
import com.applovin.impl.C1286x4;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.f */
/* loaded from: classes.dex */
public class C1127f {

    /* renamed from: a */
    private final C1220k f1450a;

    /* renamed from: b */
    private final C1240o f1451b;

    /* renamed from: c */
    private final AtomicBoolean f1452c = new AtomicBoolean();

    /* renamed from: d */
    private final Set f1453d = new HashSet();

    /* renamed from: e */
    private final Object f1454e = new Object();

    /* renamed from: f */
    private final JSONArray f1455f = new JSONArray();

    /* renamed from: g */
    private final LinkedHashMap f1456g = new LinkedHashMap();

    /* renamed from: h */
    private final Object f1457h = new Object();

    /* renamed from: i */
    private final Map f1458i = new HashMap();

    /* renamed from: j */
    private final Map f1459j = new HashMap();

    /* renamed from: k */
    private final Object f1460k = new Object();

    /* renamed from: l */
    private List f1461l;

    public C1127f(C1220k c1220k) {
        this.f1450a = c1220k;
        this.f1451b = c1220k.m2847O();
    }

    /* renamed from: a */
    public void m1772a(Activity activity) {
        if (this.f1452c.compareAndSet(false, true)) {
            String str = (String) this.f1450a.m2867a(C1286x4.f3034F);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<C1044h3> listM1766a = m1766a(JsonUtils.getJSONArray(jSONObject, this.f1450a.m2922t0().m493c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f1461l = listM1766a;
                    for (C1044h3 c1044h3 : listM1766a) {
                        this.f1458i.put(c1044h3.m895b(), c1044h3);
                    }
                    long j = StringUtils.parseLong(this.f1450a.m2912o0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    C1056i5 c1056i5 = new C1056i5(listM1766a, activity, this.f1450a);
                    if (j > 0) {
                        this.f1450a.m2918r0().m404a(c1056i5, C0987b6.b.MEDIATION, j);
                    } else {
                        this.f1450a.m2918r0().m402a(c1056i5);
                    }
                } catch (JSONException e) {
                    if (C1240o.m3200a()) {
                        this.f1451b.m3212a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                    AbstractC1072k1.m1127a((Throwable) e);
                }
            }
        }
    }

    /* renamed from: b */
    public JSONArray m1775b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f1457h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f1455f);
        }
        return jSONArrayShallowCopy;
    }

    /* renamed from: c */
    public boolean m1777c() {
        return this.f1452c.get();
    }

    /* renamed from: c */
    private void m1768c(C1044h3 c1044h3) {
        String strM895b = c1044h3.m895b();
        synchronized (this.f1454e) {
            try {
                if (this.f1453d.contains(strM895b)) {
                    return;
                }
                this.f1453d.add(strM895b);
                this.f1450a.m2848P().m576d(C0993c2.f493O, AbstractC1013e2.m674a(c1044h3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public boolean m1776b(C1044h3 c1044h3) {
        boolean zContainsKey;
        synchronized (this.f1457h) {
            zContainsKey = this.f1456g.containsKey(c1044h3.m895b());
        }
        return zContainsKey;
    }

    /* renamed from: a */
    public C1170q4 m1769a(C1044h3 c1044h3, Activity activity) {
        C1044h3 c1044h3M1765a = m1765a(c1044h3);
        if (c1044h3M1765a == null) {
            return C1170q4.m2258a("AdapterInitialization:" + c1044h3.m899c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strM895b = c1044h3.m895b();
        synchronized (this.f1460k) {
            try {
                C1170q4 c1170q4 = (C1170q4) this.f1459j.get(strM895b);
                if (c1170q4 == null || (c1170q4.m2274d() && c1044h3M1765a.m920q())) {
                    final C1170q4 c1170q42 = new C1170q4("AdapterInitialization:" + c1044h3.m899c());
                    this.f1459j.put(strM895b, c1170q42);
                    C1129h c1129hM1780a = this.f1450a.m2854T().m1780a(c1044h3M1765a);
                    if (c1129hM1780a == null) {
                        c1170q42.m2266a("Adapter implementation not found");
                        return c1170q42;
                    }
                    if (C1240o.m3200a()) {
                        this.f1451b.m3215d("MediationAdapterInitializationManager", "Initializing adapter " + c1044h3M1765a);
                    }
                    m1768c(c1044h3M1765a);
                    c1129hM1780a.m1826a(MaxAdapterParametersImpl.m1522a(c1044h3M1765a), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.OooOO0
                        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                        public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                            C1127f.m1767a(c1170q42, initializationStatus, str);
                        }
                    });
                    C1037g6.m799a(c1044h3M1765a.m916m(), c1170q42, "The adapter (" + c1044h3.m899c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f1450a);
                    return c1170q42;
                }
                return c1170q4;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m1767a(C1170q4 c1170q4, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                c1170q4.m2266a(str);
                return;
            } else {
                c1170q4.m2271b(initializationStatus);
                return;
            }
        }
        AbstractC1072k1.m1126a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        c1170q4.m2266a("Adapter reported INITIALIZING");
    }

    /* renamed from: a */
    private C1044h3 m1765a(C1044h3 c1044h3) {
        List<C1044h3> list;
        if (((Boolean) this.f1450a.m2866a(AbstractC1144o3.f1650l8)).booleanValue()) {
            C1044h3 c1044h32 = (C1044h3) this.f1458i.get(c1044h3.m895b());
            return c1044h32 != null ? c1044h32 : c1044h3;
        }
        if (!this.f1450a.m2922t0().m493c() || (list = this.f1461l) == null) {
            return c1044h3;
        }
        for (C1044h3 c1044h33 : list) {
            if (c1044h33.m895b().equals(c1044h3.m895b())) {
                return c1044h33;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Integer m1770a(String str) {
        Integer num;
        synchronized (this.f1457h) {
            num = (Integer) this.f1456g.get(str);
        }
        return num;
    }

    /* renamed from: a */
    public Set m1771a() {
        HashSet hashSet;
        synchronized (this.f1457h) {
            hashSet = new HashSet(this.f1456g.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    public void m1773a(C1044h3 c1044h3, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zM1776b;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f1457h) {
            try {
                zM1776b = m1776b(c1044h3);
                if (!zM1776b) {
                    this.f1456g.put(c1044h3.m895b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, Constants.CLASS, c1044h3.m895b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f1455f.put(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zM1776b) {
            return;
        }
        this.f1450a.m2873a(c1044h3);
        this.f1450a.m2860X().processAdapterInitializationPostback(c1044h3, j, initializationStatus, str);
        this.f1450a.m2923u().m2771a(initializationStatus, c1044h3.m895b());
    }

    /* renamed from: a */
    private List m1766a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C1044h3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.f1450a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m1774a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f1457h) {
            this.f1456g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f1450a.m2923u().m2771a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
