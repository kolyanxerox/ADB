package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.z */
/* loaded from: classes.dex */
public class C1299z {

    /* renamed from: a */
    private final Map f3171a;

    /* renamed from: b */
    private final List f3172b;

    public C1299z(Map map, List list) {
        this.f3171a = map;
        this.f3172b = list;
    }

    /* renamed from: a */
    public boolean m3817a(Object obj) {
        return obj instanceof C1299z;
    }

    /* renamed from: b */
    public List m3818b() {
        return this.f3172b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1299z)) {
            return false;
        }
        C1299z c1299z = (C1299z) obj;
        if (!c1299z.m3817a(this)) {
            return false;
        }
        Map mapM3816a = m3816a();
        Map mapM3816a2 = c1299z.m3816a();
        if (mapM3816a != null ? !mapM3816a.equals(mapM3816a2) : mapM3816a2 != null) {
            return false;
        }
        List listM3818b = m3818b();
        List listM3818b2 = c1299z.m3818b();
        return listM3818b != null ? listM3818b.equals(listM3818b2) : listM3818b2 == null;
    }

    public int hashCode() {
        Map mapM3816a = m3816a();
        int iHashCode = mapM3816a == null ? 43 : mapM3816a.hashCode();
        List listM3818b = m3818b();
        return ((iHashCode + 59) * 59) + (listM3818b != null ? listM3818b.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + m3816a() + ", invalidEntries=" + m3818b() + ")";
    }

    /* renamed from: a */
    public Map m3816a() {
        return this.f3171a;
    }
}
