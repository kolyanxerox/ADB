package com.ironsource;

/* renamed from: com.ironsource.en */
/* loaded from: classes2.dex */
public final class C3083en {

    /* renamed from: a */
    private final EnumC3079ej f8419a;

    /* renamed from: b */
    private final String f8420b;

    /* renamed from: c */
    private final long f8421c;

    /* renamed from: d */
    private final boolean f8422d;

    /* renamed from: e */
    private final boolean f8423e;

    public C3083en(EnumC3079ej instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceType, "instanceType");
        kotlin.jvm.internal.OooOo.OooO0o0(adSourceNameForEvents, "adSourceNameForEvents");
        this.f8419a = instanceType;
        this.f8420b = adSourceNameForEvents;
        this.f8421c = j;
        this.f8422d = z;
        this.f8423e = z2;
    }

    /* renamed from: a */
    public final EnumC3079ej m8515a() {
        return this.f8419a;
    }

    /* renamed from: b */
    public final String m8517b() {
        return this.f8420b;
    }

    /* renamed from: c */
    public final long m8518c() {
        return this.f8421c;
    }

    /* renamed from: d */
    public final boolean m8519d() {
        return this.f8422d;
    }

    /* renamed from: e */
    public final boolean m8520e() {
        return this.f8423e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3083en)) {
            return false;
        }
        C3083en c3083en = (C3083en) obj;
        return this.f8419a == c3083en.f8419a && kotlin.jvm.internal.OooOo.OooO00o(this.f8420b, c3083en.f8420b) && this.f8421c == c3083en.f8421c && this.f8422d == c3083en.f8422d && this.f8423e == c3083en.f8423e;
    }

    /* renamed from: f */
    public final String m8521f() {
        return this.f8420b;
    }

    /* renamed from: g */
    public final EnumC3079ej m8522g() {
        return this.f8419a;
    }

    /* renamed from: h */
    public final long m8523h() {
        return this.f8421c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (Long.hashCode(this.f8421c) + androidx.datastore.preferences.protobuf.OooO00o.OooO0O0(this.f8419a.hashCode() * 31, 31, this.f8420b)) * 31;
        boolean z = this.f8422d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.f8423e;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean m8524i() {
        return this.f8423e;
    }

    /* renamed from: j */
    public final boolean m8525j() {
        return this.f8422d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadTaskConfig(instanceType=");
        sb.append(this.f8419a);
        sb.append(", adSourceNameForEvents=");
        sb.append(this.f8420b);
        sb.append(", loadTimeoutInMills=");
        sb.append(this.f8421c);
        sb.append(", isOneFlow=");
        sb.append(this.f8422d);
        sb.append(", isMultipleAdObjects=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f8423e, ')');
    }

    public /* synthetic */ C3083en(EnumC3079ej enumC3079ej, String str, long j, boolean z, boolean z2, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(enumC3079ej, str, j, z, (i & 16) != 0 ? true : z2);
    }

    /* renamed from: a */
    public final C3083en m8516a(EnumC3079ej instanceType, String adSourceNameForEvents, long j, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceType, "instanceType");
        kotlin.jvm.internal.OooOo.OooO0o0(adSourceNameForEvents, "adSourceNameForEvents");
        return new C3083en(instanceType, adSourceNameForEvents, j, z, z2);
    }

    /* renamed from: a */
    public static /* synthetic */ C3083en m8514a(C3083en c3083en, EnumC3079ej enumC3079ej, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC3079ej = c3083en.f8419a;
        }
        if ((i & 2) != 0) {
            str = c3083en.f8420b;
        }
        if ((i & 4) != 0) {
            j = c3083en.f8421c;
        }
        if ((i & 8) != 0) {
            z = c3083en.f8422d;
        }
        if ((i & 16) != 0) {
            z2 = c3083en.f8423e;
        }
        long j2 = j;
        return c3083en.m8516a(enumC3079ej, str, j2, z, z2);
    }
}
