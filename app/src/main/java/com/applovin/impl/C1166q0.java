package com.applovin.impl;

import androidx.core.util.Consumer;
import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.C1294y3;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.network.C1235a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.ironsource.C3571qt;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.q0 */
/* loaded from: classes.dex */
public class C1166q0 {

    /* renamed from: e */
    private static final List f1770e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: a */
    private final C1220k f1771a;

    /* renamed from: b */
    private final C1240o f1772b;

    /* renamed from: c */
    private final C1294y3 f1773c;

    /* renamed from: d */
    private d f1774d;

    /* renamed from: com.applovin.impl.q0$b */
    public static class b {

        /* renamed from: a */
        private long f1775a;

        /* renamed from: b */
        private long f1776b;

        /* renamed from: a */
        public long m2139a() {
            return this.f1775a;
        }

        /* renamed from: b */
        public long m2140b() {
            return this.f1776b;
        }

        /* renamed from: a */
        public void m2135a(long j) {
            this.f1775a = j;
        }

        /* renamed from: b */
        public void m2137b(long j) {
            this.f1776b = j;
        }
    }

    /* renamed from: com.applovin.impl.q0$c */
    public class c implements Consumer {

        /* renamed from: a */
        private final String f1777a;

        /* renamed from: b */
        private final C1235a f1778b;

        /* renamed from: c */
        private final String f1779c;

        /* renamed from: d */
        private final Object f1780d;

        /* renamed from: e */
        private final boolean f1781e;

        /* renamed from: f */
        private final b f1782f;

        /* renamed from: g */
        private final e f1783g;

        public /* synthetic */ c(C1166q0 c1166q0, String str, C1235a c1235a, String str2, Object obj, boolean z, b bVar, e eVar, a aVar) {
            this(str, c1235a, str2, obj, z, bVar, eVar);
        }

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x004f: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:80), block:B:131:0x004e */
        @Override // androidx.core.util.Consumer
        /* renamed from: a */
        public void accept(C1294y3.d dVar) {
            MalformedURLException malformedURLException;
            int iM3771c;
            int i;
            long jM3773e = dVar.m3773e();
            Object objM2126a = null;
            try {
                try {
                    iM3771c = dVar.m3771c();
                    try {
                        if (iM3771c > 0) {
                            try {
                                if (iM3771c < 200 || iM3771c >= 400) {
                                    this.f1783g.mo931a(this.f1777a, iM3771c, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f1782f;
                                    if (bVar != null) {
                                        bVar.m2135a(jM3773e);
                                    }
                                    C1166q0.this.m2130a(this.f1779c, this.f1777a, iM3771c, jM3773e);
                                    byte[] bArrM3772d = dVar.m3772d();
                                    if (AbstractC1078k7.m1247h(C1220k.m2824o()) && (!this.f1781e || AbstractC1188s4.m2386b(bArrM3772d) != AbstractC1188s4.a.V2)) {
                                        C1166q0.this.f1771a.m2923u().m2774a(bArrM3772d != null ? new String(dVar.m3772d(), Charset.forName("UTF-8")) : "", this.f1777a, this.f1778b.m3076b() != null ? this.f1778b.m3076b().toString() : "");
                                    }
                                    if (bArrM3772d == null) {
                                        this.f1783g.mo933a(this.f1777a, this.f1780d, iM3771c);
                                        return;
                                    }
                                    String str = new String(dVar.m3772d(), Charset.forName("UTF-8"));
                                    b bVar2 = this.f1782f;
                                    if (bVar2 != null) {
                                        bVar2.m2137b(bArrM3772d.length);
                                        if (this.f1778b.m3093r()) {
                                            C1166q0.this.f1774d = new d(this.f1778b.m3081f(), bArrM3772d.length, jM3773e);
                                        }
                                    }
                                    if (this.f1781e) {
                                        String strM2388b = AbstractC1188s4.m2388b(bArrM3772d, C1166q0.this.f1771a.m2904j0(), C1166q0.this.f1771a);
                                        if (strM2388b == null) {
                                            HashMap map = new HashMap(2);
                                            map.put("request", StringUtils.getHostAndPath(this.f1777a));
                                            map.put(C3571qt.f11099n, str);
                                            C1166q0.this.f1771a.m2836G().trackEvent("rdf", map);
                                        }
                                        str = strM2388b;
                                    }
                                    try {
                                        this.f1783g.mo933a(this.f1777a, C1166q0.this.m2126a(str, this.f1780d), iM3771c);
                                        return;
                                    } catch (Throwable th) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f1777a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                        C1240o unused = C1166q0.this.f1772b;
                                        if (C1240o.m3200a()) {
                                            C1166q0.this.f1772b.m3212a("ConnectionManager", str2, th);
                                        }
                                        C1166q0.this.f1771a.m2832E().m2151a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f1777a)));
                                        this.f1783g.mo931a(this.f1777a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e) {
                                    e = e;
                                }
                            } catch (MalformedURLException e2) {
                                malformedURLException = e2;
                                iM3771c = i;
                            }
                        } else {
                            try {
                                C1166q0.this.m2131a(this.f1779c, this.f1777a, iM3771c, jM3773e, (Throwable) null);
                                this.f1783g.mo931a(this.f1777a, iM3771c, null, null);
                                return;
                            } catch (MalformedURLException e3) {
                                e = e3;
                                iM3771c = iM3771c;
                            }
                        }
                    } catch (MalformedURLException e4) {
                        e = e4;
                    }
                    malformedURLException = e;
                } catch (Throwable th2) {
                    int iM3770b = dVar.m3770b();
                    try {
                        byte[] bArrM3774f = dVar.m3774f();
                        String str3 = new String(bArrM3774f);
                        if (bArrM3774f != null) {
                            if (this.f1781e) {
                                str3 = AbstractC1188s4.m2388b(bArrM3774f, C1166q0.this.f1771a.m2904j0(), C1166q0.this.f1771a);
                            }
                            objM2126a = C1166q0.this.m2126a(str3, this.f1780d);
                        }
                    } catch (Throwable unused2) {
                    }
                    C1166q0.this.m2131a(this.f1779c, this.f1777a, iM3770b, jM3773e, th2);
                    this.f1783g.mo931a(this.f1777a, iM3770b, th2.getMessage(), objM2126a);
                    return;
                }
            } catch (MalformedURLException e5) {
                malformedURLException = e5;
                iM3771c = 0;
            }
            MalformedURLException malformedURLException2 = malformedURLException;
            if (this.f1780d != null) {
                C1166q0.this.m2131a(this.f1779c, this.f1777a, iM3771c, jM3773e, malformedURLException2);
                this.f1783g.mo931a(this.f1777a, -901, malformedURLException2.getMessage(), null);
            } else {
                C1166q0.this.m2130a(this.f1779c, this.f1777a, iM3771c, jM3773e);
                this.f1783g.mo933a(this.f1777a, this.f1780d, -901);
            }
        }

        private c(String str, C1235a c1235a, String str2, Object obj, boolean z, b bVar, e eVar) {
            this.f1777a = str;
            this.f1778b = c1235a;
            this.f1779c = str2;
            this.f1780d = obj;
            this.f1781e = z;
            this.f1782f = bVar;
            this.f1783g = eVar;
        }
    }

    /* renamed from: com.applovin.impl.q0$d */
    public static class d {

        /* renamed from: a */
        private final long f1785a = System.currentTimeMillis();

        /* renamed from: b */
        private final String f1786b;

        /* renamed from: c */
        private final long f1787c;

        /* renamed from: d */
        private final long f1788d;

        public d(String str, long j, long j2) {
            this.f1786b = str;
            this.f1787c = j;
            this.f1788d = j2;
        }

        /* renamed from: a */
        public boolean m2143a(Object obj) {
            return obj instanceof d;
        }

        /* renamed from: b */
        public long m2144b() {
            return this.f1787c;
        }

        /* renamed from: c */
        public long m2145c() {
            return this.f1785a;
        }

        /* renamed from: d */
        public String m2146d() {
            return this.f1786b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.m2143a(this) || m2145c() != dVar.m2145c() || m2144b() != dVar.m2144b() || m2142a() != dVar.m2142a()) {
                return false;
            }
            String strM2146d = m2146d();
            String strM2146d2 = dVar.m2146d();
            return strM2146d != null ? strM2146d.equals(strM2146d2) : strM2146d2 == null;
        }

        public int hashCode() {
            long jM2145c = m2145c();
            long jM2144b = m2144b();
            int i = ((((int) (jM2145c ^ (jM2145c >>> 32))) + 59) * 59) + ((int) (jM2144b ^ (jM2144b >>> 32)));
            long jM2142a = m2142a();
            String strM2146d = m2146d();
            return (((i * 59) + ((int) ((jM2142a >>> 32) ^ jM2142a))) * 59) + (strM2146d == null ? 43 : strM2146d.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + m2145c() + ", urlHostAndPathString=" + m2146d() + ", responseSizeBytes=" + m2144b() + ", connectionTimeMillis=" + m2142a() + ")";
        }

        /* renamed from: a */
        public long m2142a() {
            return this.f1788d;
        }
    }

    /* renamed from: com.applovin.impl.q0$e */
    public interface e {
        /* renamed from: a */
        void mo931a(String str, int i, String str2, Object obj);

        /* renamed from: a */
        void mo933a(String str, Object obj, int i);
    }

    public C1166q0(C1220k c1220k) {
        this.f1771a = c1220k;
        this.f1772b = c1220k.m2847O();
        C1294y3 c1294y3 = new C1294y3(c1220k);
        this.f1773c = c1294y3;
        c1294y3.m3739a();
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x020c A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #3 {all -> 0x013c, blocks: (B:155:0x0105, B:159:0x012c, B:158:0x0128, B:166:0x0166, B:168:0x017e, B:174:0x01a0, B:189:0x01f2, B:192:0x0201, B:194:0x020c, B:176:0x01a4, B:179:0x01ac, B:184:0x01c3, B:186:0x01c9, B:187:0x01de, B:170:0x018d, B:197:0x0215, B:181:0x01bd), top: B:227:0x0105, inners: #0 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2134a(com.applovin.impl.sdk.network.C1235a r20, com.applovin.impl.C1166q0.b r21, com.applovin.impl.C1166q0.e r22) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C1166q0.m2134a(com.applovin.impl.sdk.network.a, com.applovin.impl.q0$b, com.applovin.impl.q0$e):void");
    }

    /* renamed from: a */
    public d m2133a() {
        return this.f1774d;
    }

    /* renamed from: a */
    public Object m2126a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof C1099m8) {
                return C1139n8.m1910a(str, this.f1771a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (C1240o.m3200a()) {
                this.f1772b.m3214b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* renamed from: a */
    public void m2130a(String str, String str2, int i, long j) {
        if (C1240o.m3200a()) {
            this.f1772b.m3215d("ConnectionManager", "Successful " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + AbstractC1175r0.m2304g(this.f1771a) + " to " + m2127a(str2));
        }
    }

    /* renamed from: a */
    public void m2131a(String str, String str2, int i, long j, Throwable th) {
        if (C1240o.m3200a()) {
            this.f1772b.m3212a("ConnectionManager", "Failed " + str + " returned " + i + " in " + (j / 1000.0f) + " s over " + AbstractC1175r0.m2304g(this.f1771a) + " to " + m2127a(str2), th);
        }
    }

    /* renamed from: a */
    private String m2127a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
