package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.applovin.impl.r1 */
/* loaded from: classes.dex */
public class C1176r1 {

    /* renamed from: b */
    private final String f1840b;

    /* renamed from: c */
    private final Map f1841c;

    /* renamed from: a */
    private final String f1839a = UUID.randomUUID().toString();

    /* renamed from: d */
    private final long f1842d = System.currentTimeMillis();

    public C1176r1(String str, Map map) {
        this.f1840b = str;
        this.f1841c = map;
    }

    /* renamed from: a */
    public long m2305a() {
        return this.f1842d;
    }

    /* renamed from: b */
    public String m2306b() {
        return this.f1839a;
    }

    /* renamed from: c */
    public String m2307c() {
        return this.f1840b;
    }

    /* renamed from: d */
    public Map m2308d() {
        return this.f1841c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1176r1 c1176r1 = (C1176r1) obj;
        if (this.f1842d == c1176r1.f1842d && Objects.equals(this.f1840b, c1176r1.f1840b) && Objects.equals(this.f1841c, c1176r1.f1841c)) {
            return Objects.equals(this.f1839a, c1176r1.f1839a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1840b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f1841c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j = this.f1842d;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f1839a;
        return i + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f1840b + "', id='" + this.f1839a + "', creationTimestampMillis=" + this.f1842d + ", parameters=" + this.f1841c + '}';
    }
}
