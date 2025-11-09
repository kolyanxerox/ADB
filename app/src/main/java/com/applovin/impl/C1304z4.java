package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.z4 */
/* loaded from: classes.dex */
public class C1304z4 {

    /* renamed from: a */
    private final C1220k f3226a;

    /* renamed from: b */
    private final Map f3227b = new HashMap();

    /* renamed from: c */
    private final Object f3228c = new Object();

    /* renamed from: com.applovin.impl.z4$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3229a;

        static {
            int[] iArr = new int[b.values().length];
            f3229a = iArr;
            try {
                iArr[b.AD_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3229a[b.AD_UNIT_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3229a[b.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.applovin.impl.z4$b */
    public enum b {
        AD_FORMAT,
        AD_UNIT_ID,
        ALL
    }

    /* renamed from: com.applovin.impl.z4$c */
    public static class c {

        /* renamed from: a */
        private final C0958a5 f3234a;

        /* renamed from: b */
        private final long f3235b;

        /* renamed from: c */
        private final long f3236c;

        public /* synthetic */ c(C0958a5 c0958a5, long j, a aVar) {
            this(c0958a5, j);
        }

        /* renamed from: d */
        public boolean m3875d() {
            return SystemClock.elapsedRealtime() - this.f3236c > this.f3235b;
        }

        /* renamed from: a */
        public boolean m3877a(Object obj) {
            return obj instanceof c;
        }

        /* renamed from: c */
        public C0958a5 m3879c() {
            return this.f3234a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.m3877a((Object) this) || m3878b() != cVar.m3878b() || m3876a() != cVar.m3876a()) {
                return false;
            }
            C0958a5 c0958a5M3879c = m3879c();
            C0958a5 c0958a5M3879c2 = cVar.m3879c();
            return c0958a5M3879c != null ? c0958a5M3879c.equals(c0958a5M3879c2) : c0958a5M3879c2 == null;
        }

        public int hashCode() {
            long jM3878b = m3878b();
            long jM3876a = m3876a();
            C0958a5 c0958a5M3879c = m3879c();
            return ((((((int) (jM3878b ^ (jM3878b >>> 32))) + 59) * 59) + ((int) ((jM3876a >>> 32) ^ jM3876a))) * 59) + (c0958a5M3879c == null ? 43 : c0958a5M3879c.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SignalCacheManager.SignalWrapper(signal=");
            sb.append(m3879c());
            sb.append(", expirationTimeMillis=");
            sb.append(m3878b());
            sb.append(", cacheTimestampMillis=");
            return OooO0oO.OooOo.OooOOOO(sb, m3876a(), ")");
        }

        private c(C0958a5 c0958a5, long j) {
            this.f3234a = c0958a5;
            this.f3235b = j;
            this.f3236c = SystemClock.elapsedRealtime();
        }

        /* renamed from: b */
        public long m3878b() {
            return this.f3235b;
        }

        /* renamed from: a */
        public long m3876a() {
            return this.f3236c;
        }
    }

    public C1304z4(C1220k c1220k) {
        this.f3226a = c1220k;
    }

    /* renamed from: a */
    public void m3870a(C0958a5 c0958a5, C0986b5 c0986b5, String str, MaxAdFormat maxAdFormat) {
        if (c0958a5 == null) {
            return;
        }
        long jM385v = c0986b5.m385v();
        if (jM385v <= 0) {
            return;
        }
        this.f3226a.m2847O();
        if (C1240o.m3200a()) {
            this.f3226a.m2847O().m3211a("SignalCacheManager", "Caching signal for: " + c0986b5);
        }
        String strM3869a = m3869a(c0986b5, str, maxAdFormat);
        c cVar = new c(c0958a5, jM385v, null);
        synchronized (this.f3228c) {
            this.f3227b.put(strM3869a, cVar);
        }
    }

    /* renamed from: b */
    public C0958a5 m3871b(C0986b5 c0986b5, String str, MaxAdFormat maxAdFormat) {
        String strM3869a = m3869a(c0986b5, str, maxAdFormat);
        synchronized (this.f3228c) {
            try {
                c cVar = (c) this.f3227b.get(strM3869a);
                if (cVar == null) {
                    return null;
                }
                if (cVar.m3875d()) {
                    this.f3227b.remove(strM3869a);
                    return null;
                }
                this.f3226a.m2847O();
                if (C1240o.m3200a()) {
                    this.f3226a.m2847O().m3211a("SignalCacheManager", "Returning cached signal for: " + c0986b5);
                }
                return cVar.f3234a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private String m3869a(C0986b5 c0986b5, String str, MaxAdFormat maxAdFormat) {
        String strM899c = c0986b5.m899c();
        int i = a.f3229a[c0986b5.m383t().ordinal()];
        if (i != 1) {
            return i != 2 ? strM899c : OooO0oO.OooOo.OooOoo(strM899c, "_", str);
        }
        StringBuilder sbOooOo = OooO0oO.OooOo.OooOo(strM899c, "_");
        sbOooOo.append(maxAdFormat.getLabel());
        return sbOooOo.toString();
    }
}
