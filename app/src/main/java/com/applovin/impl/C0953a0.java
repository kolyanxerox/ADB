package com.applovin.impl;

/* renamed from: com.applovin.impl.a0 */
/* loaded from: classes.dex */
public class C0953a0 {

    /* renamed from: a */
    private final String f163a;

    /* renamed from: b */
    private final String f164b;

    /* renamed from: c */
    private final String f165c;

    /* renamed from: d */
    private final String f166d;

    /* renamed from: e */
    private final String f167e;

    /* renamed from: f */
    private final int f168f;

    /* renamed from: g */
    private final boolean f169g;

    public C0953a0(String str, int i) {
        this.f167e = str;
        this.f168f = i;
        String[] strArrSplit = str.split(",");
        boolean z = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f169g = z;
        if (z) {
            this.f163a = m66a(strArrSplit[0]);
            this.f164b = m66a(strArrSplit[1]);
            this.f165c = m66a(strArrSplit[2]);
            this.f166d = strArrSplit.length == 4 ? m66a(strArrSplit[3]) : "";
            return;
        }
        this.f163a = "";
        this.f164b = "";
        this.f165c = "";
        this.f166d = "";
    }

    /* renamed from: a */
    public boolean m69a(Object obj) {
        return obj instanceof C0953a0;
    }

    /* renamed from: b */
    public String m70b() {
        return this.f163a;
    }

    /* renamed from: c */
    public String m71c() {
        return this.f164b;
    }

    /* renamed from: d */
    public String m72d() {
        return this.f167e;
    }

    /* renamed from: e */
    public String m73e() {
        return this.f165c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0953a0)) {
            return false;
        }
        C0953a0 c0953a0 = (C0953a0) obj;
        if (!c0953a0.m69a((Object) this)) {
            return false;
        }
        String strM70b = m70b();
        String strM70b2 = c0953a0.m70b();
        if (strM70b != null ? !strM70b.equals(strM70b2) : strM70b2 != null) {
            return false;
        }
        String strM71c = m71c();
        String strM71c2 = c0953a0.m71c();
        if (strM71c != null ? !strM71c.equals(strM71c2) : strM71c2 != null) {
            return false;
        }
        String strM73e = m73e();
        String strM73e2 = c0953a0.m73e();
        if (strM73e != null ? !strM73e.equals(strM73e2) : strM73e2 != null) {
            return false;
        }
        String strM67a = m67a();
        String strM67a2 = c0953a0.m67a();
        return strM67a != null ? strM67a.equals(strM67a2) : strM67a2 == null;
    }

    /* renamed from: f */
    public int m74f() {
        return this.f168f;
    }

    /* renamed from: g */
    public boolean m75g() {
        return this.f163a.equals("applovin.com");
    }

    /* renamed from: h */
    public boolean m76h() {
        return this.f169g;
    }

    public int hashCode() {
        String strM70b = m70b();
        int iHashCode = strM70b == null ? 43 : strM70b.hashCode();
        String strM71c = m71c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strM71c == null ? 43 : strM71c.hashCode());
        String strM73e = m73e();
        int iHashCode3 = (iHashCode2 * 59) + (strM73e == null ? 43 : strM73e.hashCode());
        String strM67a = m67a();
        return (iHashCode3 * 59) + (strM67a != null ? strM67a.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + m70b() + ", publisherId=" + m71c() + ", relationship=" + m73e() + ", certificateAuthorityId=" + m67a() + ", rawValue=" + m72d() + ", rowNumber=" + m74f() + ", valid=" + m76h() + ")";
    }

    /* renamed from: a */
    public String m67a() {
        return this.f166d;
    }

    /* renamed from: a */
    public boolean m68a(C0953a0 c0953a0) {
        if (!c0953a0.m70b().equals(this.f163a) || !c0953a0.m71c().equals(this.f164b) || !c0953a0.m73e().equals(this.f165c)) {
            return false;
        }
        if (c0953a0.m67a().equals("")) {
            return true;
        }
        return c0953a0.m67a().equals(this.f166d);
    }

    /* renamed from: a */
    private String m66a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    public C0953a0(String str) {
        this(str, -1);
    }
}
