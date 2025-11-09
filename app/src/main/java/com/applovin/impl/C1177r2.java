package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.r2 */
/* loaded from: classes.dex */
public class C1177r2 implements Comparable {

    /* renamed from: a */
    private final String f1843a;

    /* renamed from: b */
    private final String f1844b;

    /* renamed from: c */
    private final boolean f1845c;

    /* renamed from: d */
    private final C0984b3 f1846d;

    public C1177r2(String str, String str2, boolean z, C0984b3 c0984b3) {
        this.f1843a = str;
        this.f1844b = str2;
        this.f1845c = z;
        this.f1846d = c0984b3;
    }

    /* renamed from: a */
    public String m2310a() {
        return this.f1844b;
    }

    /* renamed from: b */
    public List m2311b() {
        List listM360l = this.f1846d.m360l();
        return (listM360l == null || listM360l.isEmpty()) ? Collections.singletonList(this.f1843a) : listM360l;
    }

    /* renamed from: c */
    public String m2312c() {
        return this.f1843a;
    }

    /* renamed from: d */
    public C0984b3 m2313d() {
        return this.f1846d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1177r2 c1177r2 = (C1177r2) obj;
            String str = this.f1843a;
            if (str == null ? c1177r2.f1843a != null : !str.equals(c1177r2.f1843a)) {
                return false;
            }
            String str2 = this.f1844b;
            if (str2 == null ? c1177r2.f1844b != null : !str2.equals(c1177r2.f1844b)) {
                return false;
            }
            if (this.f1845c == c1177r2.f1845c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f1843a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1844b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f1845c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C1177r2 c1177r2) {
        return this.f1844b.compareToIgnoreCase(c1177r2.f1844b);
    }
}
