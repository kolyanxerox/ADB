package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C2629a3;
import com.ironsource.C3422mk;
import com.ironsource.C3551q9;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C3368d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.demandOnly.m */
/* loaded from: classes2.dex */
public class C3382m {

    /* renamed from: a */
    protected AbstractAdapter f9759a;

    /* renamed from: b */
    protected C2629a3 f9760b;

    /* renamed from: c */
    protected JSONObject f9761c;

    /* renamed from: d */
    private a f9762d;

    /* renamed from: e */
    private Timer f9763e;

    /* renamed from: f */
    long f9764f;

    /* renamed from: g */
    protected String f9765g;

    /* renamed from: h */
    protected JSONObject f9766h;

    /* renamed from: i */
    protected List<String> f9767i;

    /* renamed from: j */
    protected String f9768j;

    /* renamed from: k */
    private final Object f9769k = new Object();

    /* renamed from: l */
    private final Object f9770l = new Object();

    /* renamed from: m */
    protected final IronSource.AD_UNIT f9771m;

    /* renamed from: com.ironsource.mediationsdk.demandOnly.m$a */
    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C3382m(C2629a3 c2629a3, AbstractAdapter abstractAdapter) throws JSONException {
        this.f9760b = c2629a3;
        this.f9771m = c2629a3.m4767b();
        this.f9759a = abstractAdapter;
        JSONObject jSONObjectM4768c = c2629a3.m4768c();
        this.f9761c = jSONObjectM4768c;
        try {
            jSONObjectM4768c.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e) {
            C3551q9.m11517d().m11519a(e);
        }
        this.f9762d = a.NOT_LOADED;
        this.f9763e = null;
        this.f9765g = "";
        this.f9766h = null;
        this.f9767i = new ArrayList();
    }

    /* renamed from: a */
    public a m10238a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f9769k) {
            try {
                aVar2 = this.f9762d;
                if (Arrays.asList(aVarArr).contains(this.f9762d)) {
                    m10246b(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar2;
    }

    /* renamed from: b */
    public void m10246b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f9760b.m4771f() + ": current state=" + this.f9762d + ", new state=" + aVar);
        synchronized (this.f9769k) {
            this.f9762d = aVar;
        }
    }

    /* renamed from: f */
    public C2629a3 m10248f() {
        return this.f9760b;
    }

    /* renamed from: g */
    public String m10249g() {
        return this.f9765g;
    }

    /* renamed from: h */
    public String m10250h() {
        return this.f9760b.m4771f();
    }

    /* renamed from: i */
    public int m10251i() {
        return this.f9760b.m4769d();
    }

    /* renamed from: j */
    public Map<String, Object> mo10179j() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f9759a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f9759a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f9760b.m4774i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f9760b.m4766a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            map.put("instanceType", Integer.valueOf(this.f9760b.m4769d()));
            if (!TextUtils.isEmpty(this.f9765g)) {
                map.put("auctionId", this.f9765g);
            }
            JSONObject jSONObject = this.f9766h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f9766h);
            }
            if (!TextUtils.isEmpty(this.f9768j)) {
                map.put("dynamicDemandSource", this.f9768j);
            }
            if (m10256o()) {
                map.put("isOneFlow", 1);
                return map;
            }
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + m10250h() + ")", e);
        }
        return map;
    }

    /* renamed from: k */
    public String m10252k() {
        a aVar = this.f9762d;
        return aVar == null ? "null" : aVar.toString();
    }

    /* renamed from: l */
    public String m10253l() {
        return this.f9760b.m4774i();
    }

    /* renamed from: m */
    public List<String> m10254m() {
        return this.f9767i;
    }

    /* renamed from: n */
    public boolean m10255n() {
        return this.f9760b.m4775j();
    }

    /* renamed from: o */
    public boolean m10256o() {
        return this.f9761c.optBoolean("isOneFlow", false);
    }

    /* renamed from: p */
    public void m10257p() {
        synchronized (this.f9770l) {
            try {
                Timer timer = this.f9763e;
                if (timer != null) {
                    timer.cancel();
                    this.f9763e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m10239a(String str) {
        this.f9765g = str;
    }

    /* renamed from: b */
    public void m10247b(String str) {
        this.f9768j = C3368d.m10127b().m10136c(str);
    }

    /* renamed from: a */
    public void m10240a(List<String> list, String str, int i, String str2, String str3) {
        Iterator it = ((List) C3422mk.m10819a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            String str4 = str;
            int i2 = i;
            C3368d.m10127b().m10133a(str3, str4, C3368d.m10127b().m10131a((String) it.next(), str4, i2, str2, "", "", "", ""));
            str = str4;
            i = i2;
        }
    }

    /* renamed from: a */
    public void m10241a(TimerTask timerTask) {
        synchronized (this.f9770l) {
            m10257p();
            Timer timer = new Timer();
            this.f9763e = timer;
            timer.schedule(timerTask, this.f9764f);
        }
    }

    /* renamed from: a */
    public void m10242a(JSONObject jSONObject) {
        this.f9766h = jSONObject;
    }

    /* renamed from: a */
    public void m10243a(boolean z) throws JSONException {
        try {
            this.f9761c.put("isOneFlow", z);
        } catch (Exception e) {
            C3551q9.m11517d().m11519a(e);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z + ". Error: " + e.getMessage());
        }
    }

    /* renamed from: a */
    public boolean m10244a(a aVar) {
        boolean z;
        synchronized (this.f9769k) {
            z = this.f9762d == aVar;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m10245a(a aVar, a aVar2) {
        synchronized (this.f9769k) {
            try {
                if (this.f9762d != aVar) {
                    return false;
                }
                m10246b(aVar2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
