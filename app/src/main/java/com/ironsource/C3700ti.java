package com.ironsource;

/* renamed from: com.ironsource.ti */
/* loaded from: classes2.dex */
public final class C3700ti {

    /* renamed from: a */
    private final String f12074a;

    /* renamed from: b */
    private final String f12075b;

    /* renamed from: c */
    private InterfaceC3717u0 f12076c;

    /* renamed from: d */
    private boolean f12077d;

    /* renamed from: e */
    private String f12078e;

    /* renamed from: f */
    private String f12079f;

    public C3700ti(String appKey, String userId) {
        kotlin.jvm.internal.OooOo.OooO0o0(appKey, "appKey");
        kotlin.jvm.internal.OooOo.OooO0o0(userId, "userId");
        this.f12074a = appKey;
        this.f12075b = userId;
    }

    /* renamed from: a */
    public static /* synthetic */ C3700ti m12429a(C3700ti c3700ti, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3700ti.f12074a;
        }
        if ((i & 2) != 0) {
            str2 = c3700ti.f12075b;
        }
        return c3700ti.m12430a(str, str2);
    }

    /* renamed from: b */
    public final String m12436b() {
        return this.f12075b;
    }

    /* renamed from: c */
    public final boolean m12438c() {
        return this.f12077d;
    }

    /* renamed from: d */
    public final String m12439d() {
        return this.f12074a;
    }

    /* renamed from: e */
    public final InterfaceC3717u0 m12440e() {
        return this.f12076c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3700ti)) {
            return false;
        }
        C3700ti c3700ti = (C3700ti) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f12074a, c3700ti.f12074a) && kotlin.jvm.internal.OooOo.OooO00o(this.f12075b, c3700ti.f12075b);
    }

    /* renamed from: f */
    public final String m12441f() {
        return this.f12079f;
    }

    /* renamed from: g */
    public final String m12442g() {
        return this.f12078e;
    }

    /* renamed from: h */
    public final String m12443h() {
        return this.f12075b;
    }

    public int hashCode() {
        return this.f12075b.hashCode() + (this.f12074a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InitConfig(appKey=");
        sb.append(this.f12074a);
        sb.append(", userId=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f12075b, sb);
    }

    /* renamed from: a */
    public final C3700ti m12430a(String appKey, String userId) {
        kotlin.jvm.internal.OooOo.OooO0o0(appKey, "appKey");
        kotlin.jvm.internal.OooOo.OooO0o0(userId, "userId");
        return new C3700ti(appKey, userId);
    }

    /* renamed from: b */
    public final void m12437b(String str) {
        this.f12078e = str;
    }

    /* renamed from: a */
    public final <T> T m12431a(InterfaceC3460nn<C3700ti, T> mapper) {
        kotlin.jvm.internal.OooOo.OooO0o0(mapper, "mapper");
        return mapper.mo8213a(this);
    }

    /* renamed from: a */
    public final String m12432a() {
        return this.f12074a;
    }

    /* renamed from: a */
    public final void m12433a(InterfaceC3717u0 interfaceC3717u0) {
        this.f12076c = interfaceC3717u0;
    }

    /* renamed from: a */
    public final void m12434a(String str) {
        this.f12079f = str;
    }

    /* renamed from: a */
    public final void m12435a(boolean z) {
        this.f12077d = z;
    }
}
