package com.applovin.impl.sdk.network;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.applovin.impl.AbstractC1188s4;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.C1220k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.a */
/* loaded from: classes.dex */
public class C1235a {

    /* renamed from: a */
    private String f2259a;

    /* renamed from: b */
    private String f2260b;

    /* renamed from: c */
    private Map f2261c;

    /* renamed from: d */
    private Map f2262d;

    /* renamed from: e */
    private final JSONObject f2263e;

    /* renamed from: f */
    private String f2264f;

    /* renamed from: g */
    private final Object f2265g;

    /* renamed from: h */
    private final int f2266h;

    /* renamed from: i */
    private int f2267i;

    /* renamed from: j */
    private final int f2268j;

    /* renamed from: k */
    private final int f2269k;

    /* renamed from: l */
    private final boolean f2270l;

    /* renamed from: m */
    private final boolean f2271m;

    /* renamed from: n */
    private final boolean f2272n;

    /* renamed from: o */
    private final boolean f2273o;

    /* renamed from: p */
    private final AbstractC1188s4.a f2274p;

    /* renamed from: q */
    private final boolean f2275q;

    /* renamed from: r */
    private final boolean f2276r;

    /* renamed from: com.applovin.impl.sdk.network.a$a */
    public static class a {

        /* renamed from: a */
        String f2277a;

        /* renamed from: b */
        String f2278b;

        /* renamed from: c */
        String f2279c;

        /* renamed from: e */
        Map f2281e;

        /* renamed from: f */
        JSONObject f2282f;

        /* renamed from: g */
        Object f2283g;

        /* renamed from: i */
        int f2285i;

        /* renamed from: j */
        int f2286j;

        /* renamed from: k */
        boolean f2287k;

        /* renamed from: m */
        boolean f2289m;

        /* renamed from: n */
        boolean f2290n;

        /* renamed from: o */
        boolean f2291o;

        /* renamed from: p */
        boolean f2292p;

        /* renamed from: q */
        AbstractC1188s4.a f2293q;

        /* renamed from: h */
        int f2284h = 1;

        /* renamed from: l */
        boolean f2288l = true;

        /* renamed from: d */
        Map f2280d = new HashMap();

        public a(C1220k c1220k) {
            this.f2285i = ((Integer) c1220k.m2866a(C1268v4.f2669R2)).intValue();
            this.f2286j = ((Integer) c1220k.m2866a(C1268v4.f2661Q2)).intValue();
            this.f2289m = ((Boolean) c1220k.m2866a(C1268v4.f2847n3)).booleanValue();
            this.f2290n = ((Boolean) c1220k.m2866a(C1268v4.f2743a5)).booleanValue();
            this.f2293q = AbstractC1188s4.a.m2392a(((Integer) c1220k.m2866a(C1268v4.f2751b5)).intValue());
            this.f2292p = ((Boolean) c1220k.m2866a(C1268v4.f2945z5)).booleanValue();
        }

        /* renamed from: a */
        public a mo3098a(Map map) {
            this.f2281e = map;
            return this;
        }

        /* renamed from: b */
        public a mo3103b(String str) {
            this.f2278b = str;
            return this;
        }

        /* renamed from: c */
        public a mo3107c(String str) {
            this.f2277a = str;
            return this;
        }

        /* renamed from: d */
        public a m3109d(boolean z) {
            this.f2288l = z;
            return this;
        }

        /* renamed from: e */
        public a m3110e(boolean z) {
            this.f2289m = z;
            return this;
        }

        /* renamed from: f */
        public a m3111f(boolean z) {
            this.f2291o = z;
            return this;
        }

        /* renamed from: a */
        public a mo3099a(JSONObject jSONObject) {
            this.f2282f = jSONObject;
            return this;
        }

        /* renamed from: b */
        public a mo3104b(Map map) {
            this.f2280d = map;
            return this;
        }

        /* renamed from: c */
        public a mo3106c(int i) {
            this.f2285i = i;
            return this;
        }

        /* renamed from: a */
        public a mo3097a(String str) {
            this.f2279c = str;
            return this;
        }

        /* renamed from: b */
        public a mo3102b(int i) {
            this.f2286j = i;
            return this;
        }

        /* renamed from: c */
        public a m3108c(boolean z) {
            this.f2287k = z;
            return this;
        }

        /* renamed from: a */
        public a mo3096a(Object obj) {
            this.f2283g = obj;
            return this;
        }

        /* renamed from: b */
        public a mo3105b(boolean z) {
            this.f2292p = z;
            return this;
        }

        /* renamed from: a */
        public a mo3094a(int i) {
            this.f2284h = i;
            return this;
        }

        /* renamed from: a */
        public a mo3100a(boolean z) {
            this.f2290n = z;
            return this;
        }

        /* renamed from: a */
        public a mo3095a(AbstractC1188s4.a aVar) {
            this.f2293q = aVar;
            return this;
        }

        /* renamed from: a */
        public C1235a mo3101a() {
            return new C1235a(this);
        }
    }

    public C1235a(a aVar) {
        this.f2259a = aVar.f2278b;
        this.f2260b = aVar.f2277a;
        this.f2261c = aVar.f2280d;
        this.f2262d = aVar.f2281e;
        this.f2263e = aVar.f2282f;
        this.f2264f = aVar.f2279c;
        this.f2265g = aVar.f2283g;
        int i = aVar.f2284h;
        this.f2266h = i;
        this.f2267i = i;
        this.f2268j = aVar.f2285i;
        this.f2269k = aVar.f2286j;
        this.f2270l = aVar.f2287k;
        this.f2271m = aVar.f2288l;
        this.f2272n = aVar.f2289m;
        this.f2273o = aVar.f2290n;
        this.f2274p = aVar.f2293q;
        this.f2275q = aVar.f2291o;
        this.f2276r = aVar.f2292p;
    }

    /* renamed from: a */
    public void m3075a(String str) {
        this.f2259a = str;
    }

    /* renamed from: b */
    public void m3077b(String str) {
        this.f2260b = str;
    }

    /* renamed from: c */
    public int m3078c() {
        return this.f2266h - this.f2267i;
    }

    /* renamed from: d */
    public Object m3079d() {
        return this.f2265g;
    }

    /* renamed from: e */
    public AbstractC1188s4.a m3080e() {
        return this.f2274p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1235a)) {
            return false;
        }
        C1235a c1235a = (C1235a) obj;
        String str = this.f2259a;
        if (str == null ? c1235a.f2259a != null : !str.equals(c1235a.f2259a)) {
            return false;
        }
        Map map = this.f2261c;
        if (map == null ? c1235a.f2261c != null : !map.equals(c1235a.f2261c)) {
            return false;
        }
        Map map2 = this.f2262d;
        if (map2 == null ? c1235a.f2262d != null : !map2.equals(c1235a.f2262d)) {
            return false;
        }
        String str2 = this.f2264f;
        if (str2 == null ? c1235a.f2264f != null : !str2.equals(c1235a.f2264f)) {
            return false;
        }
        String str3 = this.f2260b;
        if (str3 == null ? c1235a.f2260b != null : !str3.equals(c1235a.f2260b)) {
            return false;
        }
        JSONObject jSONObject = this.f2263e;
        if (jSONObject == null ? c1235a.f2263e != null : !jSONObject.equals(c1235a.f2263e)) {
            return false;
        }
        Object obj2 = this.f2265g;
        if (obj2 == null ? c1235a.f2265g == null : obj2.equals(c1235a.f2265g)) {
            return this.f2266h == c1235a.f2266h && this.f2267i == c1235a.f2267i && this.f2268j == c1235a.f2268j && this.f2269k == c1235a.f2269k && this.f2270l == c1235a.f2270l && this.f2271m == c1235a.f2271m && this.f2272n == c1235a.f2272n && this.f2273o == c1235a.f2273o && this.f2274p == c1235a.f2274p && this.f2275q == c1235a.f2275q && this.f2276r == c1235a.f2276r;
        }
        return false;
    }

    /* renamed from: f */
    public String m3081f() {
        return this.f2259a;
    }

    /* renamed from: g */
    public Map m3082g() {
        return this.f2262d;
    }

    /* renamed from: h */
    public String m3083h() {
        return this.f2260b;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f2259a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2264f;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2260b;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Object obj = this.f2265g;
        int iM2394b = ((((this.f2274p.m2394b() + ((((((((((((((((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.f2266h) * 31) + this.f2267i) * 31) + this.f2268j) * 31) + this.f2269k) * 31) + (this.f2270l ? 1 : 0)) * 31) + (this.f2271m ? 1 : 0)) * 31) + (this.f2272n ? 1 : 0)) * 31) + (this.f2273o ? 1 : 0)) * 31)) * 31) + (this.f2275q ? 1 : 0)) * 31) + (this.f2276r ? 1 : 0);
        Map map = this.f2261c;
        if (map != null) {
            iM2394b = (iM2394b * 31) + map.hashCode();
        }
        Map map2 = this.f2262d;
        if (map2 != null) {
            iM2394b = (iM2394b * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f2263e;
        if (jSONObject == null) {
            return iM2394b;
        }
        char[] charArray = jSONObject.toString().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray).hashCode() + (iM2394b * 31);
    }

    /* renamed from: i */
    public Map m3084i() {
        return this.f2261c;
    }

    /* renamed from: j */
    public int m3085j() {
        return this.f2267i;
    }

    /* renamed from: k */
    public int m3086k() {
        return this.f2269k;
    }

    /* renamed from: l */
    public int m3087l() {
        return this.f2268j;
    }

    /* renamed from: m */
    public boolean m3088m() {
        return this.f2273o;
    }

    /* renamed from: n */
    public boolean m3089n() {
        return this.f2270l;
    }

    /* renamed from: o */
    public boolean m3090o() {
        return this.f2276r;
    }

    /* renamed from: p */
    public boolean m3091p() {
        return this.f2271m;
    }

    /* renamed from: q */
    public boolean m3092q() {
        return this.f2272n;
    }

    /* renamed from: r */
    public boolean m3093r() {
        return this.f2275q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest {endpoint=");
        sb.append(this.f2259a);
        sb.append(", backupEndpoint=");
        sb.append(this.f2264f);
        sb.append(", httpMethod=");
        sb.append(this.f2260b);
        sb.append(", httpHeaders=");
        sb.append(this.f2262d);
        sb.append(", body=");
        sb.append(this.f2263e);
        sb.append(", emptyResponse=");
        sb.append(this.f2265g);
        sb.append(", initialRetryAttempts=");
        sb.append(this.f2266h);
        sb.append(", retryAttemptsLeft=");
        sb.append(this.f2267i);
        sb.append(", timeoutMillis=");
        sb.append(this.f2268j);
        sb.append(", retryDelayMillis=");
        sb.append(this.f2269k);
        sb.append(", exponentialRetries=");
        sb.append(this.f2270l);
        sb.append(", retryOnAllErrors=");
        sb.append(this.f2271m);
        sb.append(", retryOnNoConnection=");
        sb.append(this.f2272n);
        sb.append(", encodingEnabled=");
        sb.append(this.f2273o);
        sb.append(", encodingType=");
        sb.append(this.f2274p);
        sb.append(", trackConnectionSpeed=");
        sb.append(this.f2275q);
        sb.append(", gzipBodyEncoding=");
        return OooO00o.OooOOOO(sb, this.f2276r, '}');
    }

    /* renamed from: a */
    public String m3073a() {
        return this.f2264f;
    }

    /* renamed from: b */
    public JSONObject m3076b() {
        return this.f2263e;
    }

    /* renamed from: a */
    public void m3074a(int i) {
        this.f2267i = i;
    }

    /* renamed from: a */
    public static a m3072a(C1220k c1220k) {
        return new a(c1220k);
    }
}
