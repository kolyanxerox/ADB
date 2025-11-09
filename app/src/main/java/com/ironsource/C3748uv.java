package com.ironsource;

/* renamed from: com.ironsource.uv */
/* loaded from: classes2.dex */
public final class C3748uv {

    /* renamed from: a */
    private String f12280a;

    public C3748uv() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a */
    public static /* synthetic */ C3748uv m12719a(C3748uv c3748uv, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3748uv.f12280a;
        }
        return c3748uv.m12720a(str);
    }

    /* renamed from: b */
    public final String m12722b() {
        return this.f12280a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3748uv) && kotlin.jvm.internal.OooOo.OooO00o(this.f12280a, ((C3748uv) obj).f12280a);
    }

    public int hashCode() {
        String str = this.f12280a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f12280a, new StringBuilder("TestSuiteSettings(controllerUrl="));
    }

    public C3748uv(String str) {
        this.f12280a = str;
    }

    /* renamed from: a */
    public final C3748uv m12720a(String str) {
        return new C3748uv(str);
    }

    /* renamed from: b */
    public final void m12723b(String str) {
        this.f12280a = str;
    }

    public /* synthetic */ C3748uv(String str, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? null : str);
    }

    /* renamed from: a */
    public final String m12721a() {
        return this.f12280a;
    }
}
