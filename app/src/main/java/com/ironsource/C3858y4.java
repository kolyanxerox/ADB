package com.ironsource;

import com.ironsource.mediationsdk.C3390h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.y4 */
/* loaded from: classes2.dex */
public final class C3858y4 {

    /* renamed from: a */
    private final String f12710a;

    /* renamed from: b */
    private final boolean f12711b;

    /* renamed from: c */
    private boolean f12712c;

    /* renamed from: d */
    private String f12713d;

    /* renamed from: e */
    private Map<String, ? extends Object> f12714e;

    /* renamed from: f */
    private C3390h f12715f;

    /* renamed from: g */
    private Map<String, Object> f12716g;

    public C3858y4(String name, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
        this.f12710a = name;
        this.f12711b = z;
        this.f12713d = "";
        this.f12714e = o00O0.o00oO0o.f31247OooOo0O;
        this.f12716g = new HashMap();
    }

    /* renamed from: a */
    public static /* synthetic */ C3858y4 m13156a(C3858y4 c3858y4, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3858y4.f12710a;
        }
        if ((i & 2) != 0) {
            z = c3858y4.f12711b;
        }
        return c3858y4.m13157a(str, z);
    }

    /* renamed from: b */
    public final void m13163b(Map<String, ? extends Object> map) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<set-?>");
        this.f12714e = map;
    }

    /* renamed from: c */
    public final Map<String, Object> m13165c() {
        return this.f12716g;
    }

    /* renamed from: d */
    public final C3390h m13166d() {
        return this.f12715f;
    }

    /* renamed from: e */
    public final boolean m13167e() {
        return this.f12711b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3858y4)) {
            return false;
        }
        C3858y4 c3858y4 = (C3858y4) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f12710a, c3858y4.f12710a) && this.f12711b == c3858y4.f12711b;
    }

    /* renamed from: f */
    public final Map<String, Object> m13168f() {
        return this.f12714e;
    }

    /* renamed from: g */
    public final String m13169g() {
        return this.f12710a;
    }

    /* renamed from: h */
    public final String m13170h() {
        return this.f12713d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f12710a.hashCode() * 31;
        boolean z = this.f12711b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    /* renamed from: i */
    public final boolean m13171i() {
        return this.f12712c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuctionInstanceInfo(name=");
        sb.append(this.f12710a);
        sb.append(", bidder=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f12711b, ')');
    }

    /* renamed from: a */
    public final C3858y4 m13157a(String name, boolean z) {
        kotlin.jvm.internal.OooOo.OooO0o0(name, "name");
        return new C3858y4(name, z);
    }

    /* renamed from: b */
    public final boolean m13164b() {
        return this.f12711b;
    }

    /* renamed from: a */
    public final String m13158a() {
        return this.f12710a;
    }

    /* renamed from: a */
    public final void m13159a(C3390h c3390h) {
        this.f12715f = c3390h;
    }

    /* renamed from: a */
    public final void m13160a(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<set-?>");
        this.f12713d = str;
    }

    /* renamed from: a */
    public final void m13161a(Map<String, Object> map) {
        kotlin.jvm.internal.OooOo.OooO0o0(map, "<set-?>");
        this.f12716g = map;
    }

    /* renamed from: a */
    public final void m13162a(boolean z) {
        this.f12712c = z;
    }
}
