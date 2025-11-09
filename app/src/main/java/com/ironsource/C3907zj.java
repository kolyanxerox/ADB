package com.ironsource;

import com.ironsource.mediationsdk.metadata.C3401a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.zj */
/* loaded from: classes2.dex */
public class C3907zj {

    /* renamed from: a */
    private final boolean f13007a;

    /* renamed from: b */
    private String f13008b;

    /* renamed from: c */
    private String f13009c;

    /* renamed from: d */
    private boolean f13010d;

    /* renamed from: e */
    private C2972bh f13011e;

    /* renamed from: f */
    private Map<String, String> f13012f;

    /* renamed from: g */
    private InterfaceC3299kp f13013g;

    /* renamed from: h */
    private String f13014h;

    /* renamed from: i */
    private boolean f13015i;

    /* renamed from: j */
    private boolean f13016j;

    public C3907zj(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, Map<String, String> map, InterfaceC3299kp interfaceC3299kp, C2972bh c2972bh) {
        this.f13008b = str;
        this.f13009c = str2;
        this.f13007a = z;
        this.f13010d = z2;
        this.f13012f = map;
        this.f13013g = interfaceC3299kp;
        this.f13011e = c2972bh;
        this.f13015i = z3;
        this.f13016j = z4;
        this.f13014h = str3;
    }

    /* renamed from: a */
    public Map<String, String> m13389a() {
        HashMap map = new HashMap();
        map.put("instanceId", this.f13008b);
        map.put("instanceName", this.f13009c);
        map.put("rewarded", Boolean.toString(this.f13007a));
        map.put("inAppBidding", Boolean.toString(this.f13010d));
        map.put("isOneFlow", Boolean.toString(this.f13015i));
        map.put(C3034d9.f7907r, String.valueOf(2));
        C2972bh c2972bh = this.f13011e;
        map.put("width", c2972bh != null ? Integer.toString(c2972bh.m7924c()) : "0");
        C2972bh c2972bh2 = this.f13011e;
        map.put("height", c2972bh2 != null ? Integer.toString(c2972bh2.m7922a()) : "0");
        C2972bh c2972bh3 = this.f13011e;
        map.put("label", c2972bh3 != null ? c2972bh3.m7923b() : "");
        map.put(C3034d9.f7911v, Boolean.toString(m13399i()));
        if (this.f13016j) {
            map.put("isMultipleAdObjects", C3401a.f9920g);
        }
        String str = this.f13014h;
        if (str != null) {
            map.put("adUnitId", str);
        }
        Map<String, String> map2 = this.f13012f;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* renamed from: b */
    public final InterfaceC3299kp m13392b() {
        return this.f13013g;
    }

    /* renamed from: c */
    public String m13393c() {
        return this.f13014h;
    }

    /* renamed from: d */
    public Map<String, String> m13394d() {
        return this.f13012f;
    }

    /* renamed from: e */
    public String m13395e() {
        return this.f13008b;
    }

    /* renamed from: f */
    public String m13396f() {
        return this.f13009c.replaceAll("IronSource_", "");
    }

    /* renamed from: g */
    public String m13397g() {
        return this.f13009c;
    }

    /* renamed from: h */
    public C2972bh m13398h() {
        return this.f13011e;
    }

    /* renamed from: i */
    public boolean m13399i() {
        return m13398h() != null && m13398h().m7925d();
    }

    /* renamed from: j */
    public boolean m13400j() {
        return this.f13010d;
    }

    /* renamed from: k */
    public boolean m13401k() {
        return m13400j() || m13403m();
    }

    /* renamed from: l */
    public boolean m13402l() {
        return this.f13016j;
    }

    /* renamed from: m */
    public boolean m13403m() {
        return this.f13015i;
    }

    /* renamed from: n */
    public boolean m13404n() {
        return this.f13007a;
    }

    /* renamed from: a */
    public void m13390a(InterfaceC3299kp interfaceC3299kp) {
        this.f13013g = interfaceC3299kp;
    }

    /* renamed from: a */
    public void m13391a(String str) {
        this.f13014h = str;
    }
}
