package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* renamed from: com.applovin.impl.g3 */
/* loaded from: classes.dex */
public class C1034g3 {

    /* renamed from: a */
    private final String f771a;

    /* renamed from: b */
    private final MaxAdFormat f772b;

    public C1034g3(String str, MaxAdFormat maxAdFormat) {
        this.f771a = str;
        this.f772b = maxAdFormat;
    }

    /* renamed from: a */
    public boolean m778a(Object obj) {
        return obj instanceof C1034g3;
    }

    /* renamed from: b */
    public String m779b() {
        return this.f771a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1034g3)) {
            return false;
        }
        C1034g3 c1034g3 = (C1034g3) obj;
        if (!c1034g3.m778a(this)) {
            return false;
        }
        String strM779b = m779b();
        String strM779b2 = c1034g3.m779b();
        if (strM779b != null ? !strM779b.equals(strM779b2) : strM779b2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatM777a = m777a();
        MaxAdFormat maxAdFormatM777a2 = c1034g3.m777a();
        return maxAdFormatM777a != null ? maxAdFormatM777a.equals(maxAdFormatM777a2) : maxAdFormatM777a2 == null;
    }

    public int hashCode() {
        String strM779b = m779b();
        int iHashCode = strM779b == null ? 43 : strM779b.hashCode();
        MaxAdFormat maxAdFormatM777a = m777a();
        return ((iHashCode + 59) * 59) + (maxAdFormatM777a != null ? maxAdFormatM777a.hashCode() : 43);
    }

    public String toString() {
        return this.f771a + "-" + this.f772b.getLabel();
    }

    /* renamed from: a */
    public MaxAdFormat m777a() {
        return this.f772b;
    }

    /* renamed from: a */
    public static C1034g3 m776a(String str) {
        String[] strArrSplit = str.split("-");
        return new C1034g3(strArrSplit[0], MaxAdFormat.formatFromString(strArrSplit[1]));
    }
}
