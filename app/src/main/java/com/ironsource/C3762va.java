package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.va */
/* loaded from: classes2.dex */
public class C3762va {

    /* renamed from: h */
    public static final int f12317h = 0;

    /* renamed from: i */
    public static final int f12318i = 1;

    /* renamed from: j */
    public static final int f12319j = 2;

    /* renamed from: k */
    public static final int f12320k = 3;

    /* renamed from: l */
    public static final int f12321l = -1;

    /* renamed from: a */
    private String f12322a;

    /* renamed from: b */
    private String f12323b;

    /* renamed from: c */
    private int f12324c;

    /* renamed from: d */
    private Map<String, String> f12325d;

    /* renamed from: e */
    private int f12326e;

    /* renamed from: f */
    private boolean f12327f;

    /* renamed from: g */
    private C3907zj f12328g;

    public C3762va(C3907zj c3907zj) {
        this(c3907zj.m13395e(), c3907zj.m13397g(), c3907zj.m13389a(), c3907zj.m13392b());
        this.f12328g = c3907zj;
    }

    /* renamed from: a */
    public void m12753a() {
        Map<String, String> map = this.f12325d;
        if (map != null) {
            map.clear();
        }
        this.f12325d = null;
    }

    /* renamed from: b */
    public Map<String, String> m12756b() {
        HashMap map = new HashMap();
        map.put("demandSourceId", this.f12323b);
        map.put("demandSourceName", this.f12322a);
        Map<String, String> map2 = this.f12325d;
        if (map2 != null) {
            map.putAll(map2);
        }
        return map;
    }

    /* renamed from: c */
    public C3907zj m12758c() {
        return this.f12328g;
    }

    /* renamed from: d */
    public boolean m12760d() {
        return this.f12327f;
    }

    /* renamed from: e */
    public int m12761e() {
        return this.f12326e;
    }

    /* renamed from: f */
    public String m12762f() {
        return this.f12322a;
    }

    /* renamed from: g */
    public Map<String, String> m12763g() {
        return this.f12325d;
    }

    /* renamed from: h */
    public String m12764h() {
        return this.f12323b;
    }

    /* renamed from: i */
    public InterfaceC3299kp m12765i() {
        if (this.f12328g != null) {
            return m12758c().m13392b();
        }
        return null;
    }

    /* renamed from: j */
    public int m12766j() {
        return this.f12324c;
    }

    /* renamed from: k */
    public boolean m12767k() {
        Map<String, String> map = this.f12325d;
        if (map == null || !map.containsKey("rewarded")) {
            return false;
        }
        return Boolean.parseBoolean(this.f12325d.get("rewarded"));
    }

    public C3762va(String str, String str2, Map<String, String> map, InterfaceC3299kp interfaceC3299kp) {
        this.f12324c = -1;
        this.f12323b = str;
        this.f12322a = str2;
        this.f12325d = map;
        this.f12326e = 0;
        this.f12327f = false;
        this.f12328g = null;
    }

    /* renamed from: a */
    public void m12754a(boolean z) {
        this.f12327f = z;
    }

    /* renamed from: b */
    public synchronized void m12757b(int i) {
        this.f12326e = i;
    }

    /* renamed from: c */
    public void m12759c(int i) {
        this.f12324c = i;
    }

    /* renamed from: a */
    public boolean m12755a(int i) {
        return this.f12324c == i;
    }
}
