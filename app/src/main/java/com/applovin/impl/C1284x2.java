package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* renamed from: com.applovin.impl.x2 */
/* loaded from: classes.dex */
public class C1284x2 {

    /* renamed from: a */
    private final String f3021a;

    /* renamed from: b */
    private final MaxAdFormat f3022b;

    /* renamed from: c */
    private final Map f3023c;

    /* renamed from: d */
    private final Map f3024d;

    /* renamed from: e */
    private final Map f3025e;

    /* renamed from: f */
    private final C1040h f3026f;

    public C1284x2(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, C1040h c1040h) {
        this.f3021a = str;
        this.f3022b = maxAdFormat;
        this.f3023c = map;
        this.f3024d = map2;
        this.f3025e = map3;
        this.f3026f = c1040h;
    }

    /* renamed from: a */
    public boolean m3641a(Object obj) {
        return obj instanceof C1284x2;
    }

    /* renamed from: b */
    public String m3642b() {
        return this.f3021a;
    }

    /* renamed from: c */
    public Map m3643c() {
        return this.f3025e;
    }

    /* renamed from: d */
    public Map m3644d() {
        return this.f3024d;
    }

    /* renamed from: e */
    public Map m3645e() {
        return this.f3023c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1284x2)) {
            return false;
        }
        C1284x2 c1284x2 = (C1284x2) obj;
        if (!c1284x2.m3641a(this)) {
            return false;
        }
        String strM3642b = m3642b();
        String strM3642b2 = c1284x2.m3642b();
        if (strM3642b != null ? !strM3642b.equals(strM3642b2) : strM3642b2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatM3640a = m3640a();
        MaxAdFormat maxAdFormatM3640a2 = c1284x2.m3640a();
        if (maxAdFormatM3640a != null ? !maxAdFormatM3640a.equals(maxAdFormatM3640a2) : maxAdFormatM3640a2 != null) {
            return false;
        }
        Map mapM3645e = m3645e();
        Map mapM3645e2 = c1284x2.m3645e();
        if (mapM3645e != null ? !mapM3645e.equals(mapM3645e2) : mapM3645e2 != null) {
            return false;
        }
        Map mapM3644d = m3644d();
        Map mapM3644d2 = c1284x2.m3644d();
        if (mapM3644d != null ? !mapM3644d.equals(mapM3644d2) : mapM3644d2 != null) {
            return false;
        }
        Map mapM3643c = m3643c();
        Map mapM3643c2 = c1284x2.m3643c();
        if (mapM3643c != null ? !mapM3643c.equals(mapM3643c2) : mapM3643c2 != null) {
            return false;
        }
        C1040h c1040hM3646f = m3646f();
        C1040h c1040hM3646f2 = c1284x2.m3646f();
        return c1040hM3646f != null ? c1040hM3646f.equals(c1040hM3646f2) : c1040hM3646f2 == null;
    }

    /* renamed from: f */
    public C1040h m3646f() {
        return this.f3026f;
    }

    public int hashCode() {
        String strM3642b = m3642b();
        int iHashCode = strM3642b == null ? 43 : strM3642b.hashCode();
        MaxAdFormat maxAdFormatM3640a = m3640a();
        int iHashCode2 = ((iHashCode + 59) * 59) + (maxAdFormatM3640a == null ? 43 : maxAdFormatM3640a.hashCode());
        Map mapM3645e = m3645e();
        int iHashCode3 = (iHashCode2 * 59) + (mapM3645e == null ? 43 : mapM3645e.hashCode());
        Map mapM3644d = m3644d();
        int iHashCode4 = (iHashCode3 * 59) + (mapM3644d == null ? 43 : mapM3644d.hashCode());
        Map mapM3643c = m3643c();
        int iHashCode5 = (iHashCode4 * 59) + (mapM3643c == null ? 43 : mapM3643c.hashCode());
        C1040h c1040hM3646f = m3646f();
        return (iHashCode5 * 59) + (c1040hM3646f != null ? c1040hM3646f.hashCode() : 43);
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + m3642b() + ", adFormat=" + m3640a() + ")";
    }

    /* renamed from: a */
    public MaxAdFormat m3640a() {
        return this.f3022b;
    }
}
