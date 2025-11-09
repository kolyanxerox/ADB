package com.applovin.impl.mediation;

import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1144o3;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.AbstractRunnableC1036g5;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1040h;
import com.applovin.impl.C1136n5;
import com.applovin.impl.C1153p3;
import com.applovin.impl.C1169q3;
import com.applovin.impl.C1178r3;
import com.applovin.impl.C1251t5;
import com.applovin.impl.C1268v4;
import com.applovin.impl.C1284x2;
import com.applovin.impl.EnumC1050i;
import com.applovin.impl.mediation.ads.AbstractC1118a;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.applovin.impl.mediation.d */
/* loaded from: classes.dex */
public class C1122d {

    /* renamed from: a */
    private final C1220k f1355a;

    /* renamed from: b */
    private final Map f1356b = new HashMap(4);

    /* renamed from: c */
    private final Object f1357c = new Object();

    /* renamed from: d */
    private final Map f1358d = new HashMap(4);

    /* renamed from: e */
    private final Object f1359e = new Object();

    /* renamed from: f */
    private final Map f1360f = new HashMap();

    /* renamed from: g */
    private final Object f1361g = new Object();

    /* renamed from: com.applovin.impl.mediation.d$a */
    public class a implements C1136n5.b {

        /* renamed from: a */
        final /* synthetic */ long f1362a;

        /* renamed from: b */
        final /* synthetic */ Map f1363b;

        /* renamed from: c */
        final /* synthetic */ String f1364c;

        /* renamed from: d */
        final /* synthetic */ C1284x2 f1365d;

        /* renamed from: e */
        final /* synthetic */ Context f1366e;

        /* renamed from: f */
        final /* synthetic */ AbstractC1118a.a f1367f;

        public a(long j, Map map, String str, C1284x2 c1284x2, Context context, AbstractC1118a.a aVar) {
            this.f1362a = j;
            this.f1363b = map;
            this.f1364c = str;
            this.f1365d = c1284x2;
            this.f1366e = context;
            this.f1367f = aVar;
        }

        @Override // com.applovin.impl.C1136n5.b
        /* renamed from: a */
        public void mo1705a(JSONArray jSONArray) {
            this.f1363b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f1362a));
            this.f1363b.put("calfc", Integer.valueOf(C1122d.this.m1702b(this.f1364c)));
            C1251t5 c1251t5 = new C1251t5(this.f1365d, jSONArray, this.f1366e, C1122d.this.f1355a, this.f1367f);
            if (((Boolean) C1122d.this.f1355a.m2866a(AbstractC1144o3.f1636e8)).booleanValue()) {
                C1122d.this.f1355a.m2918r0().m403a((AbstractRunnableC1036g5) c1251t5, C0987b6.b.MEDIATION);
            } else {
                C1122d.this.f1355a.m2918r0().m402a(c1251t5);
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$b */
    public static class b implements AbstractC1118a.a {

        /* renamed from: a */
        private final C1220k f1369a;

        /* renamed from: b */
        private final WeakReference f1370b;

        /* renamed from: c */
        private final C1122d f1371c;

        /* renamed from: d */
        private final c f1372d;

        /* renamed from: e */
        private final MaxAdFormat f1373e;

        /* renamed from: f */
        private final Map f1374f;

        /* renamed from: g */
        private final Map f1375g;

        /* renamed from: h */
        private final Map f1376h;

        /* renamed from: i */
        private final int f1377i;

        /* renamed from: j */
        private long f1378j;

        /* renamed from: k */
        private long f1379k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, C1122d c1122d, C1220k c1220k, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j, j2, c1122d, c1220k, context);
        }

        /* renamed from: a */
        public /* synthetic */ void m1706a(int i, String str) {
            this.f1375g.put("retry_delay_sec", Integer.valueOf(i));
            this.f1375g.put("retry_attempt", Integer.valueOf(this.f1372d.f1382c));
            Context contextM2824o = (Context) this.f1370b.get();
            if (contextM2824o == null) {
                contextM2824o = C1220k.m2824o();
            }
            Context context = contextM2824o;
            this.f1376h.put("art", EnumC1050i.EXPONENTIAL_RETRY.m959b());
            this.f1376h.put("era", Integer.valueOf(this.f1372d.f1382c));
            this.f1379k = System.currentTimeMillis();
            this.f1371c.m1696a(str, this.f1373e, this.f1374f, this.f1375g, this.f1376h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxError maxError2;
            this.f1371c.m1699c(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f1378j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f1369a.m2860X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f1379k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z = maxError2.getCode() == -5603 && AbstractC1078k7.m1228c(this.f1369a) && ((Boolean) this.f1369a.m2866a(C1268v4.f2858o6)).booleanValue();
            if (this.f1369a.m2879a(AbstractC1144o3.f1628Y7, this.f1373e) && this.f1372d.f1382c < this.f1377i && !z) {
                c.m1713e(this.f1372d);
                int iPow = (int) Math.pow(2.0d, this.f1372d.f1382c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new OooO(this, iPow, str, 0), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f1372d.f1382c = 0;
            this.f1372d.f1381b.set(false);
            if (this.f1372d.f1383d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f1372d.f1380a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                AbstractC1168q2.m2169a(this.f1372d.f1383d, str, maxError2);
                this.f1372d.f1383d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            AbstractC1266v2 abstractC1266v2 = (AbstractC1266v2) maxAd;
            abstractC1266v2.m3537i(this.f1372d.f1380a);
            abstractC1266v2.m3529a(SystemClock.elapsedRealtime() - this.f1378j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) abstractC1266v2.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f1369a.m2860X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f1379k, abstractC1266v2.getRequestLatencyMillis());
            }
            this.f1371c.m1695a(maxAd.getAdUnitId());
            this.f1372d.f1382c = 0;
            if (this.f1372d.f1383d == null) {
                this.f1371c.m1694a(abstractC1266v2);
                this.f1372d.f1381b.set(false);
                return;
            }
            abstractC1266v2.m3504A().m1833c().m1558a(this.f1372d.f1383d);
            this.f1372d.f1383d.onAdLoaded(abstractC1266v2);
            if (abstractC1266v2.m3516N().endsWith("load")) {
                this.f1372d.f1383d.onAdRevenuePaid(abstractC1266v2);
            }
            this.f1372d.f1383d = null;
            if ((!this.f1369a.m2888c(AbstractC1144o3.f1624U7).contains(maxAd.getAdUnitId()) && !this.f1369a.m2879a(AbstractC1144o3.f1623T7, maxAd.getFormat())) || this.f1369a.m2922t0().m493c() || this.f1369a.m2922t0().m494d()) {
                this.f1372d.f1381b.set(false);
                return;
            }
            Context contextM2824o = (Context) this.f1370b.get();
            if (contextM2824o == null) {
                contextM2824o = C1220k.m2824o();
            }
            Context context = contextM2824o;
            this.f1378j = SystemClock.elapsedRealtime();
            this.f1379k = System.currentTimeMillis();
            this.f1376h.put("art", EnumC1050i.SEQUENTIAL_OR_PRECACHE.m959b());
            this.f1371c.m1696a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f1374f, this.f1375g, this.f1376h, context, this);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, C1122d c1122d, C1220k c1220k, Context context) {
            this.f1369a = c1220k;
            this.f1370b = new WeakReference(context);
            this.f1371c = c1122d;
            this.f1372d = cVar;
            this.f1373e = maxAdFormat;
            this.f1375g = map2;
            this.f1374f = map;
            this.f1376h = map3;
            this.f1378j = j;
            this.f1379k = j2;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f1377i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f1377i = Math.min(2, ((Integer) c1220k.m2866a(AbstractC1144o3.f1627X7)).intValue());
            } else {
                this.f1377i = ((Integer) c1220k.m2866a(AbstractC1144o3.f1627X7)).intValue();
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$c */
    public static class c {

        /* renamed from: a */
        private final String f1380a;

        /* renamed from: b */
        private final AtomicBoolean f1381b;

        /* renamed from: c */
        private int f1382c;

        /* renamed from: d */
        private volatile AbstractC1118a.a f1383d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        /* renamed from: e */
        public static /* synthetic */ int m1713e(c cVar) {
            int i = cVar.f1382c;
            cVar.f1382c = i + 1;
            return i;
        }

        private c(String str) {
            this.f1381b = new AtomicBoolean();
            this.f1380a = str;
        }
    }

    public C1122d(C1220k c1220k) {
        this.f1355a = c1220k;
    }

    /* renamed from: b */
    private String m1697b(String str, String str2) {
        StringBuilder sbOooOo0O = OooO0oO.OooOo.OooOo0O(str);
        sbOooOo0O.append(str2 != null ? "-".concat(str2) : "");
        return sbOooOo0O.toString();
    }

    /* renamed from: e */
    private AbstractC1266v2 m1700e(String str) {
        AbstractC1266v2 abstractC1266v2;
        synchronized (this.f1359e) {
            abstractC1266v2 = (AbstractC1266v2) this.f1358d.get(str);
            this.f1358d.remove(str);
        }
        return abstractC1266v2;
    }

    /* renamed from: c */
    public void m1703c(String str, String str2) {
        synchronized (this.f1357c) {
            this.f1356b.remove(m1697b(str, str2));
        }
    }

    /* renamed from: d */
    public boolean m1704d(String str) {
        boolean z;
        synchronized (this.f1359e) {
            z = this.f1358d.get(str) != null;
        }
        return z;
    }

    /* renamed from: a */
    public void m1701a(String str, String str2, MaxAdFormat maxAdFormat, EnumC1050i enumC1050i, Map map, Map map2, Context context, AbstractC1118a.a aVar) {
        AbstractC1266v2 abstractC1266v2M1700e = (this.f1355a.m2922t0().m494d() || AbstractC1078k7.m1247h(C1220k.m2824o())) ? null : m1700e(str);
        if (abstractC1266v2M1700e != null) {
            abstractC1266v2M1700e.m3537i(str2);
            abstractC1266v2M1700e.m3504A().m1833c().m1558a(aVar);
            aVar.onAdLoaded(abstractC1266v2M1700e);
            if (abstractC1266v2M1700e.m3516N().endsWith("load")) {
                aVar.onAdRevenuePaid(abstractC1266v2M1700e);
            }
        }
        c cVarM1689a = m1689a(str, str2);
        if (!cVarM1689a.f1381b.compareAndSet(false, true)) {
            if (cVarM1689a.f1383d != null && cVarM1689a.f1383d != aVar) {
                C1240o.m3209j("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarM1689a.f1383d = aVar;
            return;
        }
        if (abstractC1266v2M1700e == null) {
            cVarM1689a.f1383d = aVar;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", enumC1050i.m959b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        m1696a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarM1689a, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f1355a, context, null));
    }

    /* renamed from: c */
    public void m1699c(String str) {
        synchronized (this.f1361g) {
            try {
                this.f1355a.m2847O();
                if (C1240o.m3200a()) {
                    this.f1355a.m2847O().m3211a("MediationAdLoadManager", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f1360f.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f1360f.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public int m1702b(String str) {
        int iIntValue;
        synchronized (this.f1361g) {
            try {
                Integer num = (Integer) this.f1360f.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    /* renamed from: a */
    public void m1696a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, AbstractC1118a.a aVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1284x2 c1284x2 = new C1284x2(str, maxAdFormat, map, map2, map3, m1688a(str, maxAdFormat));
        this.f1355a.m2918r0().m403a((AbstractRunnableC1036g5) new C1136n5(c1284x2, context, this.f1355a, new a(jElapsedRealtime, map3, str, c1284x2, context, aVar)), C0987b6.b.MEDIATION);
    }

    /* renamed from: a */
    private C1040h m1688a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f1355a.m2866a(C1268v4.f2551C4)).booleanValue()) {
            C1178r3 c1178r3M2862Y = this.f1355a.m2862Y();
            C1153p3 c1153p3 = C1153p3.f1709e;
            Map mapM2331a = c1178r3M2862Y.m2331a(c1153p3, C1169q3.m2254a(str));
            C1153p3.a aVar = C1153p3.a.SESSION;
            int iM1687a = m1687a(mapM2331a, aVar);
            C1153p3.a aVar2 = C1153p3.a.INSTALL;
            int iM1687a2 = m1687a(mapM2331a, aVar2);
            Map mapM2331a2 = this.f1355a.m2862Y().m2331a(c1153p3, C1169q3.m2253a(maxAdFormat));
            return new C1040h(iM1687a, iM1687a2, m1687a(mapM2331a2, aVar), m1687a(mapM2331a2, aVar2));
        }
        return new C1040h(-1, -1, -1, -1);
    }

    /* renamed from: a */
    private int m1687a(Map map, C1153p3.a aVar) {
        Long l;
        if (map == null || (l = (Long) map.get(aVar.m2069b())) == null) {
            return -1;
        }
        return l.intValue();
    }

    /* renamed from: a */
    public void m1694a(AbstractC1266v2 abstractC1266v2) {
        synchronized (this.f1359e) {
            try {
                if (this.f1358d.containsKey(abstractC1266v2.getAdUnitId())) {
                    C1240o.m3207h("AppLovinSdk", "Ad in cache already: " + abstractC1266v2.getAdUnitId());
                }
                this.f1358d.put(abstractC1266v2.getAdUnitId(), abstractC1266v2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private c m1689a(String str, String str2) {
        c cVar;
        synchronized (this.f1357c) {
            try {
                String strM1697b = m1697b(str, str2);
                cVar = (c) this.f1356b.get(strM1697b);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f1356b.put(strM1697b, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public void m1695a(String str) {
        synchronized (this.f1361g) {
            try {
                this.f1355a.m2847O();
                if (C1240o.m3200a()) {
                    this.f1355a.m2847O().m3211a("MediationAdLoadManager", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f1360f.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
