package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.h */
/* loaded from: classes.dex */
public class C1040h {

    /* renamed from: a */
    private final int f790a;

    /* renamed from: b */
    private final int f791b;

    /* renamed from: c */
    private final int f792c;

    /* renamed from: d */
    private final int f793d;

    public C1040h(int i, int i2, int i3, int i4) {
        this.f790a = i;
        this.f791b = i2;
        this.f792c = i3;
        this.f793d = i4;
    }

    /* renamed from: a */
    public boolean m814a(Object obj) {
        return obj instanceof C1040h;
    }

    /* renamed from: b */
    public int m815b() {
        return this.f792c;
    }

    /* renamed from: c */
    public int m816c() {
        return this.f791b;
    }

    /* renamed from: d */
    public int m817d() {
        return this.f790a;
    }

    /* renamed from: e */
    public Map m818e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f790a));
        map.put("air_num", Integer.valueOf(this.f791b));
        map.put("fsr_num", Integer.valueOf(this.f792c));
        map.put("fir_num", Integer.valueOf(this.f793d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1040h)) {
            return false;
        }
        C1040h c1040h = (C1040h) obj;
        return c1040h.m814a(this) && m817d() == c1040h.m817d() && m816c() == c1040h.m816c() && m815b() == c1040h.m815b() && m813a() == c1040h.m813a();
    }

    public int hashCode() {
        return m813a() + ((m815b() + ((m816c() + ((m817d() + 59) * 59)) * 59)) * 59);
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + m817d() + ", adUnitInstallAdRequestNumber=" + m816c() + ", adFormatSessionAdRequestNumber=" + m815b() + ", adFormatInstallAdRequestNumber=" + m813a() + ")";
    }

    /* renamed from: a */
    public int m813a() {
        return this.f793d;
    }
}
