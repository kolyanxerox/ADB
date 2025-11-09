package com.applovin.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.p3 */
/* loaded from: classes.dex */
public class C1153p3 {

    /* renamed from: c */
    private static final Set f1707c = new HashSet();

    /* renamed from: d */
    private static final Map f1708d = new HashMap();

    /* renamed from: e */
    public static final C1153p3 f1709e;

    /* renamed from: f */
    public static final C1153p3 f1710f;

    /* renamed from: g */
    public static final C1153p3 f1711g;

    /* renamed from: a */
    private String f1712a;

    /* renamed from: b */
    private Set f1713b;

    /* renamed from: com.applovin.impl.p3$a */
    public enum a {
        SESSION("session"),
        INSTALL("install");


        /* renamed from: a */
        private final String f1717a;

        a(String str) {
            this.f1717a = str;
        }

        /* renamed from: b */
        public String m2069b() {
            return this.f1717a;
        }
    }

    /* renamed from: com.applovin.impl.p3$b */
    public interface b {
        /* renamed from: a */
        Object mo1a(Object obj);
    }

    static {
        a aVar = a.SESSION;
        f1709e = m2063a("ars", aVar, a.INSTALL);
        f1710f = m2063a("ar", aVar);
        f1711g = m2063a("ttdasi_ms", aVar);
    }

    private C1153p3(String str, Set set) {
        this.f1712a = str;
        this.f1713b = set;
    }

    /* renamed from: a */
    public boolean m2066a(Object obj) {
        return obj instanceof C1153p3;
    }

    /* renamed from: b */
    public Set m2067b() {
        return this.f1713b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1153p3)) {
            return false;
        }
        C1153p3 c1153p3 = (C1153p3) obj;
        if (!c1153p3.m2066a(this)) {
            return false;
        }
        String strM2064a = m2064a();
        String strM2064a2 = c1153p3.m2064a();
        if (strM2064a != null ? !strM2064a.equals(strM2064a2) : strM2064a2 != null) {
            return false;
        }
        Set setM2067b = m2067b();
        Set setM2067b2 = c1153p3.m2067b();
        return setM2067b != null ? setM2067b.equals(setM2067b2) : setM2067b2 == null;
    }

    public int hashCode() {
        String strM2064a = m2064a();
        int iHashCode = strM2064a == null ? 43 : strM2064a.hashCode();
        Set setM2067b = m2067b();
        return ((iHashCode + 59) * 59) + (setM2067b != null ? setM2067b.hashCode() : 43);
    }

    public String toString() {
        return this.f1712a;
    }

    /* renamed from: a */
    public String m2064a() {
        return this.f1712a;
    }

    /* renamed from: a */
    private static C1153p3 m2063a(String str, a... aVarArr) {
        Set set = f1707c;
        if (!set.contains(str)) {
            C1153p3 c1153p3 = new C1153p3(str, new HashSet(Arrays.asList(aVarArr)));
            set.add(str);
            f1708d.put(str, c1153p3);
            return c1153p3;
        }
        throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0("Key has already been used: ", str));
    }

    /* renamed from: a */
    public boolean m2065a(a aVar) {
        return this.f1713b.contains(aVar);
    }

    /* renamed from: a */
    public static C1153p3 m2062a(String str) {
        return (C1153p3) f1708d.get(str);
    }
}
