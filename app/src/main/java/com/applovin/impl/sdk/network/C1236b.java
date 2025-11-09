package com.applovin.impl.sdk.network;

import OooOo0o.o000oOoO;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.webkit.OooO00o;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1156p6;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.b */
/* loaded from: classes.dex */
public class C1236b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1220k f2294a;

    /* renamed from: b */
    private final C1240o f2295b;

    /* renamed from: c */
    private final int f2296c;

    /* renamed from: d */
    private final C1237c f2297d;

    /* renamed from: e */
    private final Object f2298e = new Object();

    /* renamed from: f */
    private final List f2299f;

    /* renamed from: g */
    private final Set f2300g;

    /* renamed from: h */
    private final List f2301h;

    /* renamed from: com.applovin.impl.sdk.network.b$a */
    public class a implements AppLovinPostbackListener {

        /* renamed from: a */
        final /* synthetic */ C1238d f2302a;

        /* renamed from: b */
        final /* synthetic */ AppLovinPostbackListener f2303b;

        public a(C1238d c1238d, AppLovinPostbackListener appLovinPostbackListener) {
            this.f2302a = c1238d;
            this.f2303b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i) {
            C1240o unused = C1236b.this.f2295b;
            if (C1240o.m3200a()) {
                C1236b.this.f2295b.m3215d("PersistentPostbackManager", "Failed to submit postback: " + this.f2302a + " with error code: " + i + "; will retry later...");
            }
            C1236b.this.m3124d(this.f2302a);
            AbstractC1168q2.m2189a(this.f2303b, str, i);
            if (this.f2302a.m3136c() == 1) {
                C1236b.this.f2294a.m2832E().m2149a("dispatchPostback", str, i, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            C1236b.this.m3114a(this.f2302a);
            C1240o unused = C1236b.this.f2295b;
            if (C1240o.m3200a()) {
                C1236b.this.f2295b.m3211a("PersistentPostbackManager", "Successfully submit postback: " + this.f2302a);
            }
            C1236b.this.m3122c();
            AbstractC1168q2.m2188a(this.f2303b, str);
        }
    }

    public C1236b(C1220k c1220k) {
        ArrayList arrayList = new ArrayList();
        this.f2299f = arrayList;
        this.f2300g = new HashSet();
        this.f2301h = new ArrayList();
        if (c1220k == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f2294a = c1220k;
        this.f2295b = c1220k.m2847O();
        int iIntValue = ((Integer) c1220k.m2866a(C1268v4.f2589H2)).intValue();
        this.f2296c = iIntValue;
        if (!((Boolean) c1220k.m2866a(C1268v4.f2613K2)).booleanValue()) {
            this.f2297d = null;
            return;
        }
        C1237c c1237c = new C1237c(this, c1220k);
        this.f2297d = c1237c;
        arrayList.addAll(c1237c.m3133a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    /* renamed from: d */
    public List m3130d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f2298e) {
            try {
                if (((Boolean) this.f2294a.m2866a(C1268v4.f2605J2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f2301h.size());
                    arrayList.addAll(this.f2301h);
                } else {
                    arrayList.ensureCapacity(this.f2299f.size());
                    arrayList.addAll(this.f2299f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public void m3131e(C1238d c1238d) {
        m3127a(c1238d, true);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f2294a.m2918r0().m403a((AbstractRunnableC1036g5) this.f2297d, C0987b6.b.OTHER);
    }

    /* renamed from: c */
    private void m3123c(C1238d c1238d) {
        synchronized (this.f2298e) {
            while (this.f2299f.size() > this.f2296c) {
                try {
                    this.f2299f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f2299f.add(c1238d);
        }
        if (C1240o.m3200a()) {
            this.f2295b.m3211a("PersistentPostbackManager", "Enqueued postback: " + c1238d);
        }
    }

    /* renamed from: e */
    public /* synthetic */ void m3125e() {
        synchronized (this.f2298e) {
            try {
                ArrayList arrayList = new ArrayList(this.f2299f);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    m3119b((C1238d) obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ void m3120b(C1238d c1238d, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f2298e) {
            m3123c(c1238d);
            m3115a(c1238d, appLovinPostbackListener);
        }
    }

    /* renamed from: a */
    public void m3127a(C1238d c1238d, boolean z) {
        m3128a(c1238d, z, (AppLovinPostbackListener) null);
    }

    /* renamed from: a */
    public void m3128a(C1238d c1238d, boolean z, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(c1238d.m3144k())) {
            if (C1240o.m3200a()) {
                this.f2295b.m3214b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z) {
                c1238d.m3135a();
            }
            m3116a(new OooO00o(this, c1238d, appLovinPostbackListener, 16), AbstractC1078k7.m1246h(), c1238d.m3146m());
        }
    }

    /* renamed from: b */
    public void m3129b() {
        m3116a((Runnable) new o000oOoO(this, 13), true, false);
    }

    /* renamed from: b */
    private void m3119b(C1238d c1238d) {
        m3115a(c1238d, (AppLovinPostbackListener) null);
    }

    /* renamed from: c */
    public void m3122c() {
        synchronized (this.f2298e) {
            try {
                Iterator it = this.f2301h.iterator();
                while (it.hasNext()) {
                    m3119b((C1238d) it.next());
                }
                this.f2301h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public void m3124d(C1238d c1238d) {
        synchronized (this.f2298e) {
            this.f2300g.remove(c1238d);
            this.f2301h.add(c1238d);
        }
    }

    /* renamed from: a */
    public void m3126a() {
        synchronized (this.f2298e) {
            this.f2299f.clear();
            this.f2301h.clear();
        }
        this.f2294a.m2918r0().m403a((AbstractRunnableC1036g5) this.f2297d, C0987b6.b.OTHER);
    }

    /* renamed from: a */
    private void m3115a(C1238d c1238d, AppLovinPostbackListener appLovinPostbackListener) {
        if (C1240o.m3200a()) {
            this.f2295b.m3211a("PersistentPostbackManager", "Preparing to submit postback: " + c1238d);
        }
        if (this.f2294a.m2835F0() && !c1238d.m3146m()) {
            if (C1240o.m3200a()) {
                this.f2295b.m3211a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(c1238d.m3144k())) {
            if (C1240o.m3200a()) {
                this.f2295b.m3214b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f2298e) {
            try {
                if (this.f2300g.contains(c1238d)) {
                    if (C1240o.m3200a()) {
                        this.f2295b.m3211a("PersistentPostbackManager", "Skipping in progress postback: " + c1238d.m3144k());
                    }
                    return;
                }
                c1238d.m3145l();
                Integer num = (Integer) this.f2294a.m2866a(C1268v4.f2581G2);
                if (c1238d.m3136c() > num.intValue()) {
                    if (C1240o.m3200a()) {
                        this.f2295b.m3218k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + c1238d);
                    }
                    m3114a(c1238d);
                    return;
                }
                synchronized (this.f2298e) {
                    this.f2300g.add(c1238d);
                }
                C1239e c1239eMo3101a = C1239e.m3176b(this.f2294a).mo3103b(c1238d.m3144k()).mo3097a(c1238d.m3137d()).mo3104b(c1238d.m3142i()).mo3107c(c1238d.m3141h()).mo3098a(c1238d.m3140g()).mo3099a(c1238d.m3143j() != null ? new JSONObject(c1238d.m3143j()) : null).mo3105b(c1238d.m3148o()).mo3100a(c1238d.m3147n()).mo3095a(c1238d.m3139f()).m3196h(c1238d.m3149p()).m3191e(c1238d.m3138e()).mo3101a();
                if (C1240o.m3200a()) {
                    this.f2295b.m3211a("PersistentPostbackManager", "Submitting postback: " + c1238d);
                }
                this.f2294a.m2898g0().dispatchPostbackRequest(c1239eMo3101a, new a(c1238d, appLovinPostbackListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m3114a(C1238d c1238d) {
        synchronized (this.f2298e) {
            this.f2300g.remove(c1238d);
            this.f2299f.remove(c1238d);
        }
        if (C1240o.m3200a()) {
            this.f2295b.m3211a("PersistentPostbackManager", "Dequeued postback: " + c1238d);
        }
    }

    /* renamed from: a */
    private void m3116a(Runnable runnable, boolean z, boolean z2) {
        if (z) {
            this.f2294a.m2918r0().m403a((AbstractRunnableC1036g5) new C1156p6(this.f2294a, z2, "runPostbackTask", runnable), C0987b6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
