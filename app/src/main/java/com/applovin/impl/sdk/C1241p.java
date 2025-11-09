package com.applovin.impl.sdk;

import com.applovin.impl.AbstractC1266v2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.p */
/* loaded from: classes.dex */
public class C1241p {

    /* renamed from: a */
    private final C1240o f2341a;

    /* renamed from: b */
    private final Map f2342b = new HashMap(5);

    /* renamed from: c */
    private final Object f2343c = new Object();

    /* renamed from: d */
    private final Map f2344d = Collections.synchronizedMap(new HashMap(5));

    /* renamed from: e */
    private final Map f2345e = Collections.synchronizedMap(new HashMap(5));

    /* renamed from: com.applovin.impl.sdk.p$a */
    public static class a {

        /* renamed from: a */
        private final String f2346a;

        /* renamed from: b */
        private final String f2347b;

        /* renamed from: c */
        private final String f2348c;

        public a(String str, String str2, String str3) {
            this.f2346a = str;
            this.f2347b = str2;
            this.f2348c = str3;
        }

        /* renamed from: a */
        public boolean m3226a(Object obj) {
            return obj instanceof a;
        }

        /* renamed from: b */
        public String m3227b() {
            return this.f2346a;
        }

        /* renamed from: c */
        public String m3228c() {
            return this.f2348c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.m3226a(this)) {
                return false;
            }
            String strM3227b = m3227b();
            String strM3227b2 = aVar.m3227b();
            if (strM3227b != null ? !strM3227b.equals(strM3227b2) : strM3227b2 != null) {
                return false;
            }
            String strM3225a = m3225a();
            String strM3225a2 = aVar.m3225a();
            if (strM3225a != null ? !strM3225a.equals(strM3225a2) : strM3225a2 != null) {
                return false;
            }
            String strM3228c = m3228c();
            String strM3228c2 = aVar.m3228c();
            return strM3228c != null ? strM3228c.equals(strM3228c2) : strM3228c2 == null;
        }

        public int hashCode() {
            String strM3227b = m3227b();
            int iHashCode = strM3227b == null ? 43 : strM3227b.hashCode();
            String strM3225a = m3225a();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strM3225a == null ? 43 : strM3225a.hashCode());
            String strM3228c = m3228c();
            return (iHashCode2 * 59) + (strM3228c != null ? strM3228c.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + m3227b() + ", adapterName=" + m3225a() + ", networkName=" + m3228c() + ")";
        }

        /* renamed from: a */
        public String m3225a() {
            return this.f2347b;
        }
    }

    public C1241p(C1220k c1220k) {
        this.f2341a = c1220k.m2847O();
    }

    /* renamed from: a */
    public String m3219a(String str) {
        return (String) this.f2345e.get(str);
    }

    /* renamed from: b */
    public void m3222b(AbstractC1266v2 abstractC1266v2) {
        this.f2344d.put(abstractC1266v2.getAdUnitId(), abstractC1266v2.m3518P());
    }

    /* renamed from: c */
    public void m3224c(AbstractC1266v2 abstractC1266v2) {
        synchronized (this.f2343c) {
            try {
                if (C1240o.m3200a()) {
                    this.f2341a.m3211a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + abstractC1266v2);
                }
                this.f2342b.put(abstractC1266v2.getAdUnitId(), new a(abstractC1266v2.m3506C(), abstractC1266v2.m899c(), abstractC1266v2.getNetworkName()));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2345e.put(abstractC1266v2.getAdUnitId(), abstractC1266v2.m3518P());
    }

    /* renamed from: a */
    public void m3220a(AbstractC1266v2 abstractC1266v2) {
        synchronized (this.f2343c) {
            try {
                String adUnitId = abstractC1266v2.getAdUnitId();
                a aVar = (a) this.f2342b.get(adUnitId);
                if (aVar == null) {
                    if (C1240o.m3200a()) {
                        this.f2341a.m3211a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                    }
                    return;
                }
                if (abstractC1266v2.m3506C().equals(aVar.m3227b())) {
                    if (C1240o.m3200a()) {
                        this.f2341a.m3211a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                    }
                    this.f2342b.remove(adUnitId);
                } else if (C1240o.m3200a()) {
                    this.f2341a.m3211a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + abstractC1266v2 + " , since it could have already been updated with a new ad: " + aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public String m3221b(String str) {
        return (String) this.f2344d.get(str);
    }

    /* renamed from: c */
    public a m3223c(String str) {
        a aVar;
        synchronized (this.f2343c) {
            aVar = (a) this.f2342b.get(str);
        }
        return aVar;
    }
}
