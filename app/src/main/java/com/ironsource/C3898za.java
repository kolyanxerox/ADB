package com.ironsource;

import android.content.Context;

/* renamed from: com.ironsource.za */
/* loaded from: classes2.dex */
public class C3898za {

    /* renamed from: h */
    private static C3898za f12939h;

    /* renamed from: a */
    private String f12940a;

    /* renamed from: b */
    private String f12941b;

    /* renamed from: c */
    private String f12942c;

    /* renamed from: d */
    private String f12943d;

    /* renamed from: e */
    private int f12944e;

    /* renamed from: f */
    private String f12945f;

    /* renamed from: g */
    private final InterfaceC3767vf f12946g;

    private C3898za(Context context) {
        InterfaceC3767vf interfaceC3767vfMo8686f = C3495on.m11199U().mo8686f();
        this.f12946g = interfaceC3767vfMo8686f;
        this.f12940a = interfaceC3767vfMo8686f.mo4852g();
        this.f12941b = interfaceC3767vfMo8686f.mo4849e();
        this.f12942c = interfaceC3767vfMo8686f.mo4865m();
        this.f12943d = interfaceC3767vfMo8686f.mo4870p();
        this.f12944e = interfaceC3767vfMo8686f.mo4862l();
        this.f12945f = interfaceC3767vfMo8686f.mo4859j(context);
    }

    /* renamed from: b */
    public static C3898za m13309b(Context context) {
        if (f12939h == null) {
            f12939h = new C3898za(context);
        }
        return f12939h;
    }

    /* renamed from: g */
    public static void m13310g() {
        f12939h = null;
    }

    /* renamed from: a */
    public float m13311a(Context context) {
        return this.f12946g.mo4864m(context);
    }

    /* renamed from: c */
    public String m13314c() {
        return this.f12941b;
    }

    /* renamed from: d */
    public String m13315d() {
        return this.f12940a;
    }

    /* renamed from: e */
    public String m13316e() {
        return this.f12942c;
    }

    /* renamed from: f */
    public String m13317f() {
        return this.f12943d;
    }

    /* renamed from: a */
    public int m13312a() {
        return this.f12944e;
    }

    /* renamed from: b */
    public String m13313b() {
        return this.f12945f;
    }
}
