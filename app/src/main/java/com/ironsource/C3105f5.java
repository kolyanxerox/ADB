package com.ironsource;

import com.ironsource.mediationsdk.C3390h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.f5 */
/* loaded from: classes2.dex */
public final class C3105f5 {

    /* renamed from: a */
    private final String f8500a;

    /* renamed from: b */
    private final boolean f8501b;

    /* renamed from: c */
    private boolean f8502c;

    /* renamed from: d */
    private String f8503d;

    /* renamed from: e */
    private Map<String, ? extends Object> f8504e;

    /* renamed from: f */
    private C3390h f8505f;

    /* renamed from: g */
    private Map<String, Object> f8506g;

    public C3105f5(String name, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
        this.f8500a = name;
        this.f8501b = z;
        this.f8503d = "";
        this.f8504e = o00O0.o00oO0o.f31247OooOo0O;
        this.f8506g = new HashMap();
    }

    /* renamed from: a */
    public static /* synthetic */ C3105f5 m8624a(C3105f5 c3105f5, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3105f5.f8500a;
        }
        if ((i & 2) != 0) {
            z = c3105f5.f8501b;
        }
        return c3105f5.m8625a(str, z);
    }

    /* renamed from: b */
    public final void m8631b(Map<String, ? extends Object> map) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<set-?>");
        this.f8504e = map;
    }

    /* renamed from: c */
    public final Map<String, Object> m8633c() {
        return this.f8506g;
    }

    /* renamed from: d */
    public final C3390h m8634d() {
        return this.f8505f;
    }

    /* renamed from: e */
    public final boolean m8635e() {
        return this.f8501b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3105f5)) {
            return false;
        }
        C3105f5 c3105f5 = (C3105f5) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f8500a, c3105f5.f8500a) && this.f8501b == c3105f5.f8501b;
    }

    /* renamed from: f */
    public final Map<String, Object> m8636f() {
        return this.f8504e;
    }

    /* renamed from: g */
    public final String m8637g() {
        return this.f8500a;
    }

    /* renamed from: h */
    public final String m8638h() {
        return this.f8503d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f8500a.hashCode() * 31;
        boolean z = this.f8501b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    /* renamed from: i */
    public final boolean m8639i() {
        return this.f8502c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuctionRequestInstanceInfo(name=");
        sb.append(this.f8500a);
        sb.append(", bidder=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f8501b, ')');
    }

    /* renamed from: a */
    public final C3105f5 m8625a(String name, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
        return new C3105f5(name, z);
    }

    /* renamed from: b */
    public final boolean m8632b() {
        return this.f8501b;
    }

    /* renamed from: a */
    public final String m8626a() {
        return this.f8500a;
    }

    /* renamed from: a */
    public final void m8627a(C3390h c3390h) {
        this.f8505f = c3390h;
    }

    /* renamed from: a */
    public final void m8628a(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<set-?>");
        this.f8503d = str;
    }

    /* renamed from: a */
    public final void m8629a(Map<String, Object> map) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<set-?>");
        this.f8506g = map;
    }

    /* renamed from: a */
    public final void m8630a(boolean z) {
        this.f8502c = z;
    }
}
