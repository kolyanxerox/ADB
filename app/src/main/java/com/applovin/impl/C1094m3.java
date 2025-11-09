package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.C0984b3;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1166q0;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C3034d9;
import com.ironsource.C3451ne;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.m3 */
/* loaded from: classes.dex */
public class C1094m3 implements C1166q0.e {

    /* renamed from: l */
    private static WeakReference f1182l;

    /* renamed from: m */
    private static final AtomicBoolean f1183m = new AtomicBoolean();

    /* renamed from: a */
    private final C1220k f1184a;

    /* renamed from: b */
    private final C1240o f1185b;

    /* renamed from: c */
    private final Context f1186c;

    /* renamed from: d */
    private final C1084l3 f1187d;

    /* renamed from: g */
    private boolean f1190g;

    /* renamed from: i */
    private boolean f1192i;

    /* renamed from: j */
    private Map f1193j;

    /* renamed from: k */
    private final C0981b0 f1194k;

    /* renamed from: e */
    private final Map f1188e = new HashMap();

    /* renamed from: f */
    private final AtomicBoolean f1189f = new AtomicBoolean();

    /* renamed from: h */
    private int f1191h = 2;

    /* renamed from: com.applovin.impl.m3$a */
    public class a extends AbstractC0980b {
        public a() {
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                C1240o.m3206g("AppLovinSdk", "Started mediation debugger");
                if (!C1094m3.this.m1486c() || C1094m3.f1182l.get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    WeakReference unused = C1094m3.f1182l = new WeakReference(maxDebuggerActivity);
                    maxDebuggerActivity.setListAdapter(C1094m3.this.f1187d, C1094m3.this.f1184a.m2893e());
                }
                C1094m3.f1183m.set(false);
            }
        }

        @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                C1240o.m3206g("AppLovinSdk", "Mediation debugger destroyed");
                WeakReference unused = C1094m3.f1182l = null;
            }
        }
    }

    public C1094m3(C1220k c1220k) {
        this.f1184a = c1220k;
        this.f1185b = c1220k.m2847O();
        Context contextM2824o = C1220k.m2824o();
        this.f1186c = contextM2824o;
        C1084l3 c1084l3 = new C1084l3(contextM2824o);
        this.f1187d = c1084l3;
        this.f1194k = new C0981b0(c1220k, c1084l3);
    }

    /* renamed from: d */
    public /* synthetic */ void m1487d() {
        Activity activityM2926v0 = this.f1184a.m2926v0();
        if (activityM2926v0 == null || activityM2926v0.isFinishing()) {
            C1240o.m3207h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(activityM2926v0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new o00000O(this, 0)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    /* renamed from: f */
    private void m1488f() {
        this.f1184a.m2893e().m438a(new a());
    }

    /* renamed from: e */
    public void m1494e() {
        if (this.f1189f.compareAndSet(false, true)) {
            this.f1184a.m2918r0().m403a((AbstractRunnableC1036g5) new C1260u5(this, this.f1184a), C0987b6.b.OTHER);
        }
    }

    /* renamed from: g */
    public boolean m1495g() {
        return this.f1190g;
    }

    /* renamed from: h */
    public void m1496h() {
        m1492a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f1187d + "}";
    }

    /* renamed from: c */
    public boolean m1486c() {
        WeakReference weakReference = f1182l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* renamed from: a */
    public void m1493a(boolean z, int i) {
        this.f1190g = z;
        this.f1191h = i;
    }

    /* renamed from: a */
    public void m1492a(Map map) {
        this.f1193j = map;
        m1494e();
        if (!m1486c() && f1183m.compareAndSet(false, true)) {
            if (!this.f1192i) {
                m1488f();
                this.f1192i = true;
            }
            Intent intent = new Intent(this.f1186c, (Class<?>) MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            C1240o.m3206g("AppLovinSdk", "Starting mediation debugger...");
            this.f1186c.startActivity(intent);
            return;
        }
        C1240o.m3207h("AppLovinSdk", "Mediation debugger is already showing");
    }

    /* renamed from: a */
    public List m1489a(String str) {
        Map map = this.f1193j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.f1193j.get(str);
    }

    /* renamed from: a */
    private void m1481a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0984b3 c0984b3 = (C0984b3) it.next();
            if (c0984b3.m338A() && c0984b3.m365q() == C0984b3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new o00000O0(this, 1), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void m1480a(DialogInterface dialogInterface, int i) {
        m1496h();
    }

    /* renamed from: a */
    private List m1478a(JSONObject jSONObject, C1220k c1220k) {
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo(C3451ne.f10407C1, jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayOooOOoo.length());
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C0984b3 c0984b3 = new C0984b3(jSONObject2, c1220k);
                arrayList.add(c0984b3);
                this.f1188e.put(c0984b3.m350b(), c0984b3);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private List m1479a(JSONObject jSONObject, List list, C1220k c1220k) {
        JSONArray jSONArrayOooOOoo = androidx.datastore.preferences.protobuf.OooO00o.OooOOoo("ad_units", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayOooOOoo.length());
        for (int i = 0; i < jSONArrayOooOOoo.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayOooOOoo, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new C1130n(jSONObject2, this.f1188e, c1220k));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    private List m1476a(List list, C1220k c1220k) {
        List<String> adUnitIds = c1220k.m2842K() != null ? c1220k.m2842K().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1130n c1130n = (C1130n) it.next();
                if (adUnitIds.contains(c1130n.m1873c())) {
                    arrayList.add(c1130n);
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    private List m1477a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            C0953a0 c0953a0 = new C0953a0(str);
            if (c0953a0.m76h()) {
                arrayList.add(c0953a0);
            } else if (C1240o.m3200a()) {
                this.f1185b.m3214b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.C1166q0.e
    /* renamed from: a */
    public void mo933a(String str, JSONObject jSONObject, int i) {
        List listM1478a = m1478a(jSONObject, this.f1184a);
        List listM1479a = m1479a(jSONObject, listM1478a, this.f1184a);
        List listM1476a = m1476a(listM1479a, this.f1184a);
        List listM1477a = m1477a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f1187d.m1308a(listM1478a, listM1479a, listM1476a, listM1477a, JsonUtils.getString(jSONObject2, C3034d9.h.f8063D0, null), JsonUtils.getString(jSONObject2, Constants.MESSAGE, null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.f1184a);
        if (!listM1477a.isEmpty()) {
            this.f1194k.m316a();
        }
        if (m1495g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new o00000O0(this, 0), TimeUnit.SECONDS.toMillis(this.f1191h));
        } else {
            m1481a(listM1478a);
        }
    }

    @Override // com.applovin.impl.C1166q0.e
    /* renamed from: a */
    public void mo931a(String str, int i, String str2, JSONObject jSONObject) {
        if (C1240o.m3200a()) {
            this.f1185b.m3214b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        }
        C1240o.m3207h("AppLovinSdk", "Unable to show mediation debugger.");
        this.f1184a.m2832E().m2149a("fetchMediationDebuggerInfo", str, i, str2);
        this.f1187d.m1308a(null, null, null, null, null, null, null, false, this.f1184a);
        this.f1189f.set(false);
    }
}
