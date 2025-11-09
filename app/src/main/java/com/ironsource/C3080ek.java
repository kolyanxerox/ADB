package com.ironsource;

/* renamed from: com.ironsource.ek */
/* loaded from: classes2.dex */
public final class C3080ek {

    /* renamed from: a */
    private final String f8416a;

    /* renamed from: b */
    private final String f8417b;

    public C3080ek(String advId, String advIdType) {
        kotlin.jvm.internal.OooOo.OooO0o0(advId, "advId");
        kotlin.jvm.internal.OooOo.OooO0o0(advIdType, "advIdType");
        this.f8416a = advId;
        this.f8417b = advIdType;
    }

    /* renamed from: a */
    public static /* synthetic */ C3080ek m8503a(C3080ek c3080ek, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3080ek.f8416a;
        }
        if ((i & 2) != 0) {
            str2 = c3080ek.f8417b;
        }
        return c3080ek.m8504a(str, str2);
    }

    /* renamed from: b */
    public final String m8506b() {
        return this.f8417b;
    }

    /* renamed from: c */
    public final String m8507c() {
        return this.f8416a;
    }

    /* renamed from: d */
    public final String m8508d() {
        return this.f8417b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3080ek)) {
            return false;
        }
        C3080ek c3080ek = (C3080ek) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f8416a, c3080ek.f8416a) && kotlin.jvm.internal.OooOo.OooO00o(this.f8417b, c3080ek.f8417b);
    }

    public int hashCode() {
        return this.f8417b.hashCode() + (this.f8416a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IronSourceAdvId(advId=");
        sb.append(this.f8416a);
        sb.append(", advIdType=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f8417b, sb);
    }

    /* renamed from: a */
    public final C3080ek m8504a(String advId, String advIdType) {
        kotlin.jvm.internal.OooOo.OooO0o0(advId, "advId");
        kotlin.jvm.internal.OooOo.OooO0o0(advIdType, "advIdType");
        return new C3080ek(advId, advIdType);
    }

    /* renamed from: a */
    public final String m8505a() {
        return this.f8416a;
    }
}
