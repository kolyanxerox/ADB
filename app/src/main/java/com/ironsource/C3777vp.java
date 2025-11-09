package com.ironsource;

/* renamed from: com.ironsource.vp */
/* loaded from: classes2.dex */
public final class C3777vp {

    /* renamed from: a */
    private final String f12408a;

    /* renamed from: b */
    private final String f12409b;

    public C3777vp(String url, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(url, "url");
        this.f12408a = url;
        this.f12409b = str;
    }

    /* renamed from: a */
    public static /* synthetic */ C3777vp m12796a(C3777vp c3777vp, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3777vp.f12408a;
        }
        if ((i & 2) != 0) {
            str2 = c3777vp.f12409b;
        }
        return c3777vp.m12797a(str, str2);
    }

    /* renamed from: b */
    public final String m12799b() {
        return this.f12409b;
    }

    /* renamed from: c */
    public final String m12800c() {
        return this.f12409b;
    }

    /* renamed from: d */
    public final String m12801d() {
        return this.f12408a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3777vp)) {
            return false;
        }
        C3777vp c3777vp = (C3777vp) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f12408a, c3777vp.f12408a) && kotlin.jvm.internal.OooOo.OooO00o(this.f12409b, c3777vp.f12409b);
    }

    public int hashCode() {
        int iHashCode = this.f12408a.hashCode() * 31;
        String str = this.f12409b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpenUrl(url=");
        sb.append(this.f12408a);
        sb.append(", packageName=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f12409b, sb);
    }

    public /* synthetic */ C3777vp(String str, String str2, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    /* renamed from: a */
    public final C3777vp m12797a(String url, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(url, "url");
        return new C3777vp(url, str);
    }

    /* renamed from: a */
    public final String m12798a() {
        return this.f12408a;
    }
}
