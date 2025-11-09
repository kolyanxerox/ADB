package com.ironsource;

/* renamed from: com.ironsource.x2 */
/* loaded from: classes2.dex */
public class C3822x2 extends C3233is {

    /* renamed from: h */
    private static String f12554h = "type";

    /* renamed from: i */
    private static String f12555i = "numOfAdUnits";

    /* renamed from: j */
    private static String f12556j = "firstCampaignCredits";

    /* renamed from: k */
    private static String f12557k = "totalNumberCredits";

    /* renamed from: l */
    private static String f12558l = "productType";

    /* renamed from: b */
    private String f12559b;

    /* renamed from: c */
    private String f12560c;

    /* renamed from: d */
    private String f12561d;

    /* renamed from: e */
    private String f12562e;

    /* renamed from: f */
    private String f12563f;

    /* renamed from: g */
    private boolean f12564g;

    public C3822x2(String str) {
        boolean z;
        super(str);
        if (m9389a(f12554h)) {
            m13005k(m9393d(f12554h));
        }
        if (m9389a(f12555i)) {
            m13002h(m9393d(f12555i));
            z = true;
        } else {
            z = false;
        }
        m12994a(z);
        if (m9389a(f12556j)) {
            m13000g(m9393d(f12556j));
        }
        if (m9389a(f12557k)) {
            m13004j(m9393d(f12557k));
        }
        if (m9389a(f12558l)) {
            m13003i(m9393d(f12558l));
        }
    }

    /* renamed from: a */
    private void m12994a(boolean z) {
        this.f12564g = z;
    }

    /* renamed from: b */
    public String m12995b() {
        return this.f12562e;
    }

    /* renamed from: c */
    public String m12996c() {
        return this.f12561d;
    }

    /* renamed from: d */
    public String m12997d() {
        return this.f12560c;
    }

    /* renamed from: e */
    public String m12998e() {
        return this.f12563f;
    }

    /* renamed from: f */
    public String m12999f() {
        return this.f12559b;
    }

    /* renamed from: g */
    public void m13000g(String str) {
        this.f12562e = str;
    }

    /* renamed from: h */
    public void m13002h(String str) {
        this.f12561d = str;
    }

    /* renamed from: i */
    public void m13003i(String str) {
        this.f12560c = str;
    }

    /* renamed from: j */
    public void m13004j(String str) {
        this.f12563f = str;
    }

    /* renamed from: k */
    public void m13005k(String str) {
        this.f12559b = str;
    }

    /* renamed from: g */
    public boolean m13001g() {
        return this.f12564g;
    }
}
