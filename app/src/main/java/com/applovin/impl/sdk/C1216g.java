package com.applovin.impl.sdk;

import com.applovin.impl.AbstractC1072k1;
import com.applovin.impl.AbstractC1266v2;
import com.ironsource.C3069e9;
import com.ironsource.C3353m5;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.g */
/* loaded from: classes.dex */
public class C1216g {

    /* renamed from: a */
    private final C1220k f2041a;

    /* renamed from: b */
    private final Map f2042b = new HashMap();

    /* renamed from: c */
    private final Object f2043c = new Object();

    /* renamed from: d */
    private final Map f2044d = new HashMap();

    /* renamed from: e */
    private final Object f2045e = new Object();

    /* renamed from: com.applovin.impl.sdk.g$b */
    public static class b {

        /* renamed from: a */
        private final String f2046a;

        /* renamed from: b */
        private final String f2047b;

        /* renamed from: c */
        private final String f2048c;

        /* renamed from: d */
        private final String f2049d;

        /* renamed from: e */
        private final String f2050e;

        /* renamed from: f */
        private final String f2051f;

        /* renamed from: g */
        private final String f2052g;

        /* renamed from: h */
        private long f2053h;

        /* renamed from: i */
        private final ArrayDeque f2054i;

        /* renamed from: b */
        public String m2733b() {
            return this.f2049d;
        }

        /* renamed from: c */
        public String m2734c() {
            return this.f2048c;
        }

        /* renamed from: d */
        public String m2735d() {
            return this.f2050e;
        }

        /* renamed from: e */
        public String m2736e() {
            return this.f2051f;
        }

        /* renamed from: f */
        public String m2737f() {
            return this.f2052g;
        }

        /* renamed from: g */
        public String m2738g() {
            return this.f2047b;
        }

        /* renamed from: h */
        public String m2739h() {
            return this.f2051f;
        }

        /* renamed from: i */
        public c m2740i() {
            return (c) this.f2054i.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + m2740i() + "', adUnitId='" + this.f2046a + "', format='" + this.f2047b + "', adapterName='" + this.f2048c + "', adapterClass='" + this.f2049d + "', adapterVersion='" + this.f2050e + "', bCode='" + this.f2051f + "', creativeId='" + this.f2052g + "', updated=" + this.f2053h + '}';
        }

        private b(AbstractC1266v2 abstractC1266v2, c cVar) {
            this.f2054i = new ArrayDeque();
            this.f2046a = abstractC1266v2.getAdUnitId();
            this.f2047b = abstractC1266v2.getFormat().getLabel();
            this.f2048c = abstractC1266v2.m899c();
            this.f2049d = abstractC1266v2.m895b();
            this.f2050e = abstractC1266v2.m3544z();
            this.f2051f = abstractC1266v2.m3506C();
            this.f2052g = abstractC1266v2.getCreativeId();
            m2731a(cVar);
        }

        /* renamed from: a */
        public String m2732a() {
            return this.f2046a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m2731a(c cVar) {
            this.f2053h = System.currentTimeMillis();
            this.f2054i.add(cVar);
        }
    }

    /* renamed from: com.applovin.impl.sdk.g$c */
    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW(C3353m5.f9472v),
        HIDE("hide"),
        CLICK(C3069e9.f8387d),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* renamed from: a */
        private final String f2063a;

        c(String str) {
            this.f2063a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f2063a;
        }
    }

    /* renamed from: com.applovin.impl.sdk.g$d */
    public interface d {
        /* renamed from: a */
        void mo2465a(b bVar);
    }

    public C1216g(C1220k c1220k) {
        this.f2041a = c1220k;
        m2726a();
    }

    /* renamed from: a */
    public void m2729a(AbstractC1266v2 abstractC1266v2, c cVar) {
        synchronized (this.f2045e) {
            try {
                String strM3506C = abstractC1266v2.m3506C();
                b bVar = (b) this.f2044d.get(strM3506C);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(abstractC1266v2, cVar);
                    this.f2044d.put(strM3506C, bVar);
                } else if (bVar.m2740i() == cVar) {
                    return;
                } else {
                    bVar.m2731a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.f2044d.remove(strM3506C);
                }
                m2725a(bVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m2726a() {
        synchronized (this.f2043c) {
            try {
                for (c cVar : c.values()) {
                    this.f2042b.put(cVar, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m2728a(d dVar, Set set) {
        synchronized (this.f2043c) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    m2724a((c) it.next()).add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void m2727a(d dVar) {
        synchronized (this.f2043c) {
            try {
                Iterator it = this.f2042b.keySet().iterator();
                while (it.hasNext()) {
                    m2724a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private Set m2724a(c cVar) {
        synchronized (this.f2043c) {
            try {
                Set set = (Set) this.f2042b.get(cVar);
                if (AbstractC1072k1.m1129a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m2725a(b bVar, c cVar) {
        synchronized (this.f2043c) {
            try {
                Iterator it = m2724a(cVar).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).mo2465a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
