package com.ironsource;

/* renamed from: com.ironsource.f8 */
/* loaded from: classes2.dex */
public final class C3108f8 {

    /* renamed from: a */
    private String f8511a;

    /* renamed from: b */
    private String f8512b;

    /* renamed from: c */
    private String f8513c;

    public C3108f8(String cachedAppKey, String cachedUserId, String cachedSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.OooOo.OooO0o0(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.OooOo.OooO0o0(cachedSettings, "cachedSettings");
        this.f8511a = cachedAppKey;
        this.f8512b = cachedUserId;
        this.f8513c = cachedSettings;
    }

    /* renamed from: a */
    public static /* synthetic */ C3108f8 m8643a(C3108f8 c3108f8, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3108f8.f8511a;
        }
        if ((i & 2) != 0) {
            str2 = c3108f8.f8512b;
        }
        if ((i & 4) != 0) {
            str3 = c3108f8.f8513c;
        }
        return c3108f8.m8644a(str, str2, str3);
    }

    /* renamed from: b */
    public final String m8647b() {
        return this.f8512b;
    }

    /* renamed from: c */
    public final String m8649c() {
        return this.f8513c;
    }

    /* renamed from: d */
    public final String m8651d() {
        return this.f8511a;
    }

    /* renamed from: e */
    public final String m8652e() {
        return this.f8513c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3108f8)) {
            return false;
        }
        C3108f8 c3108f8 = (C3108f8) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f8511a, c3108f8.f8511a) && kotlin.jvm.internal.OooOo.OooO00o(this.f8512b, c3108f8.f8512b) && kotlin.jvm.internal.OooOo.OooO00o(this.f8513c, c3108f8.f8513c);
    }

    /* renamed from: f */
    public final String m8653f() {
        return this.f8512b;
    }

    public int hashCode() {
        return this.f8513c.hashCode() + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(this.f8511a.hashCode() * 31, 31, this.f8512b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CachedResponse(cachedAppKey=");
        sb.append(this.f8511a);
        sb.append(", cachedUserId=");
        sb.append(this.f8512b);
        sb.append(", cachedSettings=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f8513c, sb);
    }

    /* renamed from: a */
    public final C3108f8 m8644a(String cachedAppKey, String cachedUserId, String cachedSettings) {
        kotlin.jvm.internal.OooOo.OooO0o0(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.OooOo.OooO0o0(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.OooOo.OooO0o0(cachedSettings, "cachedSettings");
        return new C3108f8(cachedAppKey, cachedUserId, cachedSettings);
    }

    /* renamed from: b */
    public final void m8648b(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<set-?>");
        this.f8513c = str;
    }

    /* renamed from: c */
    public final void m8650c(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<set-?>");
        this.f8512b = str;
    }

    /* renamed from: a */
    public final String m8645a() {
        return this.f8511a;
    }

    /* renamed from: a */
    public final void m8646a(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<set-?>");
        this.f8511a = str;
    }
}
