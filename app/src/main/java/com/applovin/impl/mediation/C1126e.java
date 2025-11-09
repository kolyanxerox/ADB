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
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.applovin.impl.mediation.e */
/* loaded from: classes.dex */
public class C1126e {

    /* renamed from: a */
    private final C1220k f1420a;

    /* renamed from: b */
    private final Map f1421b = new HashMap(4);

    /* renamed from: c */
    private final Object f1422c = new Object();

    /* renamed from: d */
    private final Map f1423d = new HashMap(4);

    /* renamed from: e */
    private final Object f1424e = new Object();

    /* renamed from: f */
    private final Map f1425f = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: g */
    private final Map f1426g = new HashMap();

    /* renamed from: h */
    private final Object f1427h = new Object();

    /* renamed from: com.applovin.impl.mediation.e$a */
    public class a implements C1136n5.b {

        /* renamed from: a */
        final /* synthetic */ long f1428a;

        /* renamed from: b */
        final /* synthetic */ Map f1429b;

        /* renamed from: c */
        final /* synthetic */ String f1430c;

        /* renamed from: d */
        final /* synthetic */ C1284x2 f1431d;

        /* renamed from: e */
        final /* synthetic */ Context f1432e;

        /* renamed from: f */
        final /* synthetic */ AbstractC1118a.a f1433f;

        public a(long j, Map map, String str, C1284x2 c1284x2, Context context, AbstractC1118a.a aVar) {
            this.f1428a = j;
            this.f1429b = map;
            this.f1430c = str;
            this.f1431d = c1284x2;
            this.f1432e = context;
            this.f1433f = aVar;
        }

        @Override // com.applovin.impl.C1136n5.b
        /* renamed from: a */
        public void mo1705a(JSONArray jSONArray) {
            this.f1429b.put("sct_ms", Long.valueOf(SystemClock.elapsedRealtime() - this.f1428a));
            this.f1429b.put("calfc", Integer.valueOf(C1126e.this.m1751b(this.f1430c)));
            C1251t5 c1251t5 = new C1251t5(this.f1431d, jSONArray, this.f1432e, C1126e.this.f1420a, this.f1433f);
            if (((Boolean) C1126e.this.f1420a.m2866a(AbstractC1144o3.f1636e8)).booleanValue()) {
                C1126e.this.f1420a.m2918r0().m403a((AbstractRunnableC1036g5) c1251t5, C0987b6.b.MEDIATION);
            } else {
                C1126e.this.f1420a.m2918r0().m402a(c1251t5);
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.e$b */
    public static class b implements AbstractC1118a.a {

        /* renamed from: a */
        private final C1220k f1435a;

        /* renamed from: b */
        private final WeakReference f1436b;

        /* renamed from: c */
        private final C1126e f1437c;

        /* renamed from: d */
        private final c f1438d;

        /* renamed from: e */
        private final MaxAdFormat f1439e;

        /* renamed from: f */
        private final Map f1440f;

        /* renamed from: g */
        private final Map f1441g;

        /* renamed from: h */
        private final Map f1442h;

        /* renamed from: i */
        private final int f1443i;

        /* renamed from: j */
        private long f1444j;

        /* renamed from: k */
        private long f1445k;

        public /* synthetic */ b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, C1126e c1126e, C1220k c1220k, Context context, a aVar) {
            this(map, map2, map3, cVar, maxAdFormat, j, j2, c1126e, c1220k, context);
        }

        /* renamed from: a */
        private void m1757a(MaxAd maxAd) {
            Context contextM2824o = (Context) this.f1436b.get();
            if (contextM2824o == null) {
                contextM2824o = C1220k.m2824o();
            }
            Context context = contextM2824o;
            this.f1444j = SystemClock.elapsedRealtime();
            this.f1445k = System.currentTimeMillis();
            this.f1442h.put("art", EnumC1050i.SEQUENTIAL_OR_PRECACHE.m959b());
            this.f1437c.m1744a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f1440f, this.f1441g, this.f1442h, context, this);
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
            this.f1437c.m1754d(str);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f1444j;
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) maxError.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                maxError2 = maxError;
                this.f1435a.m2860X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, maxError2, this.f1445k, jElapsedRealtime);
            } else {
                maxError2 = maxError;
            }
            boolean z = maxError2.getCode() == -5603 && AbstractC1078k7.m1228c(this.f1435a) && ((Boolean) this.f1435a.m2866a(C1268v4.f2858o6)).booleanValue();
            if (this.f1435a.m2879a(AbstractC1144o3.f1628Y7, this.f1439e) && this.f1438d.f1448c < this.f1443i && !z) {
                c.m1764e(this.f1438d);
                int iPow = (int) Math.pow(2.0d, this.f1438d.f1448c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new OooO(this, iPow, str, 1), TimeUnit.SECONDS.toMillis(iPow));
                return;
            }
            this.f1438d.f1448c = 0;
            this.f1438d.f1447b.set(false);
            if (this.f1438d.f1449d != null) {
                MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxError2;
                maxErrorImpl.setLoadTag(this.f1438d.f1446a);
                maxErrorImpl.setRequestLatencyMillis(jElapsedRealtime);
                AbstractC1168q2.m2169a(this.f1438d.f1449d, str, maxError2);
                this.f1438d.f1449d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            int sizeSafely;
            AbstractC1266v2 abstractC1266v2 = (AbstractC1266v2) maxAd;
            abstractC1266v2.m3537i(this.f1438d.f1446a);
            abstractC1266v2.m3529a(SystemClock.elapsedRealtime() - this.f1444j);
            MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl = (MaxAdWaterfallInfoImpl) abstractC1266v2.getWaterfall();
            if (maxAdWaterfallInfoImpl != null) {
                this.f1435a.m2860X().processWaterfallInfoPostback(maxAdWaterfallInfoImpl, null, this.f1445k, abstractC1266v2.getRequestLatencyMillis());
            }
            this.f1437c.m1743a(maxAd.getAdUnitId());
            this.f1438d.f1448c = 0;
            if (this.f1438d.f1449d == null) {
                this.f1437c.m1742a(abstractC1266v2);
                this.f1438d.f1447b.set(false);
                int iM3513K = abstractC1266v2.m3513K();
                synchronized (this.f1437c.f1424e) {
                    sizeSafely = CollectionUtils.getSizeSafely((Queue) this.f1437c.f1423d.get(maxAd.getAdUnitId()));
                }
                if (sizeSafely < iM3513K) {
                    int i = sizeSafely + 1;
                    this.f1435a.m2847O();
                    if (C1240o.m3200a()) {
                        this.f1435a.m2847O().m3211a("MediationAdLoadManagerV2", OooO0oO.OooOo.OooO0o0(i, iM3513K, "Preloading waterfall ", " of "));
                    }
                    m1757a(maxAd);
                    return;
                }
                return;
            }
            abstractC1266v2.m3504A().m1833c().m1558a(this.f1438d.f1449d);
            this.f1438d.f1449d.onAdLoaded(abstractC1266v2);
            this.f1437c.f1425f.put(maxAd.getAdUnitId(), abstractC1266v2);
            if (abstractC1266v2.m3516N().endsWith("load")) {
                this.f1438d.f1449d.onAdRevenuePaid(abstractC1266v2);
            }
            this.f1438d.f1449d = null;
            if ((!this.f1435a.m2888c(AbstractC1144o3.f1624U7).contains(maxAd.getAdUnitId()) && !this.f1435a.m2879a(AbstractC1144o3.f1623T7, maxAd.getFormat())) || this.f1435a.m2922t0().m493c() || this.f1435a.m2922t0().m494d()) {
                this.f1438d.f1447b.set(false);
                return;
            }
            int iM3513K2 = abstractC1266v2.m3513K();
            this.f1435a.m2847O();
            if (C1240o.m3200a()) {
                this.f1435a.m2847O().m3211a("MediationAdLoadManagerV2", "Preloading waterfall 1 of " + iM3513K2);
            }
            m1757a(maxAd);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        private b(Map map, Map map2, Map map3, c cVar, MaxAdFormat maxAdFormat, long j, long j2, C1126e c1126e, C1220k c1220k, Context context) {
            this.f1435a = c1220k;
            this.f1436b = new WeakReference(context);
            this.f1437c = c1126e;
            this.f1438d = cVar;
            this.f1439e = maxAdFormat;
            this.f1441g = map2;
            this.f1440f = map;
            this.f1442h = map3;
            this.f1444j = j;
            this.f1445k = j2;
            if (CollectionUtils.getBoolean(map2, "disable_auto_retries")) {
                this.f1443i = -1;
            } else if (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) {
                this.f1443i = Math.min(2, ((Integer) c1220k.m2866a(AbstractC1144o3.f1627X7)).intValue());
            } else {
                this.f1443i = ((Integer) c1220k.m2866a(AbstractC1144o3.f1627X7)).intValue();
            }
        }

        /* renamed from: a */
        public /* synthetic */ void m1756a(int i, String str) {
            this.f1441g.put("retry_delay_sec", Integer.valueOf(i));
            this.f1441g.put("retry_attempt", Integer.valueOf(this.f1438d.f1448c));
            Context contextM2824o = (Context) this.f1436b.get();
            if (contextM2824o == null) {
                contextM2824o = C1220k.m2824o();
            }
            Context context = contextM2824o;
            this.f1442h.put("art", EnumC1050i.EXPONENTIAL_RETRY.m959b());
            this.f1442h.put("era", Integer.valueOf(this.f1438d.f1448c));
            this.f1445k = System.currentTimeMillis();
            this.f1437c.m1744a(str, this.f1439e, this.f1440f, this.f1441g, this.f1442h, context, this);
        }
    }

    /* renamed from: com.applovin.impl.mediation.e$c */
    public static class c {

        /* renamed from: a */
        private final String f1446a;

        /* renamed from: b */
        private final AtomicBoolean f1447b;

        /* renamed from: c */
        private int f1448c;

        /* renamed from: d */
        private volatile AbstractC1118a.a f1449d;

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        /* renamed from: e */
        public static /* synthetic */ int m1764e(c cVar) {
            int i = cVar.f1448c;
            cVar.f1448c = i + 1;
            return i;
        }

        private c(String str) {
            this.f1447b = new AtomicBoolean();
            this.f1446a = str;
        }
    }

    public C1126e(C1220k c1220k) {
        this.f1420a = c1220k;
    }

    /* renamed from: b */
    private String m1745b(String str, String str2) {
        StringBuilder sbOooOo0O = OooO0oO.OooOo.OooOo0O(str);
        sbOooOo0O.append(str2 != null ? "-".concat(str2) : "");
        return sbOooOo0O.toString();
    }

    /* renamed from: f */
    private AbstractC1266v2 m1749f(String str) {
        synchronized (this.f1424e) {
            try {
                Queue queue = (Queue) this.f1423d.get(str);
                if (CollectionUtils.isEmpty(queue)) {
                    return null;
                }
                return (AbstractC1266v2) queue.poll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public boolean m1755e(String str) {
        boolean z;
        synchronized (this.f1424e) {
            z = !CollectionUtils.isEmpty((Queue) this.f1423d.get(str));
        }
        return z;
    }

    /* renamed from: c */
    public Queue m1752c(String str) {
        ArrayDeque arrayDeque = new ArrayDeque();
        AbstractC1266v2 abstractC1266v2 = (AbstractC1266v2) this.f1425f.get(str);
        if (abstractC1266v2 != null) {
            arrayDeque.add(abstractC1266v2);
        }
        synchronized (this.f1422c) {
            try {
                Queue queue = (Queue) this.f1423d.get(str);
                if (queue != null) {
                    arrayDeque.addAll(queue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayDeque;
    }

    /* renamed from: d */
    public void m1754d(String str) {
        synchronized (this.f1427h) {
            try {
                this.f1420a.m2847O();
                if (C1240o.m3200a()) {
                    this.f1420a.m2847O().m3211a("MediationAdLoadManagerV2", "Incrementing ad load failures count for ad unit ID: " + str);
                }
                Integer num = (Integer) this.f1426g.get(str);
                if (num == null) {
                    num = 0;
                }
                this.f1426g.put(str, Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m1750a(String str, String str2, MaxAdFormat maxAdFormat, EnumC1050i enumC1050i, Map map, Map map2, Context context, AbstractC1118a.a aVar) {
        AbstractC1266v2 abstractC1266v2M1749f = (this.f1420a.m2922t0().m494d() || AbstractC1078k7.m1247h(C1220k.m2824o())) ? null : m1749f(str);
        if (abstractC1266v2M1749f != null) {
            abstractC1266v2M1749f.m3537i(str2);
            abstractC1266v2M1749f.m3504A().m1833c().m1558a(aVar);
            aVar.onAdLoaded(abstractC1266v2M1749f);
            this.f1425f.put(str, abstractC1266v2M1749f);
            if (abstractC1266v2M1749f.m3516N().endsWith("load")) {
                aVar.onAdRevenuePaid(abstractC1266v2M1749f);
            }
        }
        c cVarM1737a = m1737a(str, str2);
        if (!cVarM1737a.f1447b.compareAndSet(false, true)) {
            if (cVarM1737a.f1449d != null && cVarM1737a.f1449d != aVar) {
                C1240o.m3209j("MediationAdLoadManagerV2", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
            }
            cVarM1737a.f1449d = aVar;
            return;
        }
        if (abstractC1266v2M1749f == null) {
            cVarM1737a.f1449d = aVar;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("art", enumC1050i.m959b());
        if (StringUtils.isValidString(str2)) {
            mapSynchronizedMap.put("alt", str2);
        }
        m1744a(str, maxAdFormat, map, map2, mapSynchronizedMap, context, new b(map, map2, mapSynchronizedMap, cVarM1737a, maxAdFormat, SystemClock.elapsedRealtime(), System.currentTimeMillis(), this, this.f1420a, context, null));
    }

    /* renamed from: b */
    public int m1751b(String str) {
        int iIntValue;
        synchronized (this.f1427h) {
            try {
                Integer num = (Integer) this.f1426g.get(str);
                iIntValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    /* renamed from: c */
    public void m1753c(String str, String str2) {
        synchronized (this.f1422c) {
            this.f1421b.remove(m1745b(str, str2));
        }
    }

    /* renamed from: a */
    public void m1744a(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, Context context, AbstractC1118a.a aVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1284x2 c1284x2 = new C1284x2(str, maxAdFormat, map, map2, map3, m1736a(str, maxAdFormat));
        this.f1420a.m2918r0().m403a((AbstractRunnableC1036g5) new C1136n5(c1284x2, context, this.f1420a, new a(jElapsedRealtime, map3, str, c1284x2, context, aVar)), C0987b6.b.MEDIATION);
    }

    /* renamed from: a */
    private C1040h m1736a(String str, MaxAdFormat maxAdFormat) {
        if (((Boolean) this.f1420a.m2866a(C1268v4.f2551C4)).booleanValue()) {
            C1178r3 c1178r3M2862Y = this.f1420a.m2862Y();
            C1153p3 c1153p3 = C1153p3.f1709e;
            Map mapM2331a = c1178r3M2862Y.m2331a(c1153p3, C1169q3.m2254a(str));
            C1153p3.a aVar = C1153p3.a.SESSION;
            int iM1735a = m1735a(mapM2331a, aVar);
            C1153p3.a aVar2 = C1153p3.a.INSTALL;
            int iM1735a2 = m1735a(mapM2331a, aVar2);
            Map mapM2331a2 = this.f1420a.m2862Y().m2331a(c1153p3, C1169q3.m2253a(maxAdFormat));
            return new C1040h(iM1735a, iM1735a2, m1735a(mapM2331a2, aVar), m1735a(mapM2331a2, aVar2));
        }
        return new C1040h(-1, -1, -1, -1);
    }

    /* renamed from: a */
    private int m1735a(Map map, C1153p3.a aVar) {
        Long l;
        if (map == null || (l = (Long) map.get(aVar.m2069b())) == null) {
            return -1;
        }
        return l.intValue();
    }

    /* renamed from: a */
    public void m1742a(AbstractC1266v2 abstractC1266v2) {
        synchronized (this.f1424e) {
            try {
                Queue arrayDeque = (Queue) this.f1423d.get(abstractC1266v2.getAdUnitId());
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    this.f1423d.put(abstractC1266v2.getAdUnitId(), arrayDeque);
                }
                arrayDeque.add(abstractC1266v2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private c m1737a(String str, String str2) {
        c cVar;
        synchronized (this.f1422c) {
            try {
                String strM1745b = m1745b(str, str2);
                cVar = (c) this.f1421b.get(strM1745b);
                if (cVar == null) {
                    cVar = new c(str2, null);
                    this.f1421b.put(strM1745b, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public void m1743a(String str) {
        synchronized (this.f1427h) {
            try {
                this.f1420a.m2847O();
                if (C1240o.m3200a()) {
                    this.f1420a.m2847O().m3211a("MediationAdLoadManagerV2", "Clearing ad load failures count for ad unit ID: " + str);
                }
                this.f1426g.remove(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
