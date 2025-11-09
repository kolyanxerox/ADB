package com.ironsource;

/* renamed from: com.ironsource.dj */
/* loaded from: classes2.dex */
public final class C3044dj {

    /* renamed from: a */
    private final String f8281a;

    /* renamed from: b */
    private final int f8282b;

    /* renamed from: c */
    private final String f8283c;

    public C3044dj() {
        this(null, 0, null, 7, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C3044dj m8319a(C3044dj c3044dj, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c3044dj.f8281a;
        }
        if ((i2 & 2) != 0) {
            i = c3044dj.f8282b;
        }
        if ((i2 & 4) != 0) {
            str2 = c3044dj.f8283c;
        }
        return c3044dj.m8320a(str, i, str2);
    }

    /* renamed from: b */
    public final int m8322b() {
        return this.f8282b;
    }

    /* renamed from: c */
    public final String m8323c() {
        return this.f8283c;
    }

    /* renamed from: d */
    public final String m8324d() {
        return this.f8283c;
    }

    /* renamed from: e */
    public final String m8325e() {
        return this.f8281a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3044dj)) {
            return false;
        }
        C3044dj c3044dj = (C3044dj) obj;
        return kotlin.jvm.internal.OooOo.OooO00o(this.f8281a, c3044dj.f8281a) && this.f8282b == c3044dj.f8282b && kotlin.jvm.internal.OooOo.OooO00o(this.f8283c, c3044dj.f8283c);
    }

    /* renamed from: f */
    public final int m8326f() {
        return this.f8282b;
    }

    public int hashCode() {
        int iOooO00o = androidx.datastore.preferences.protobuf.OooO00o.OooO00o(this.f8282b, this.f8281a.hashCode() * 31, 31);
        String str = this.f8283c;
        return iOooO00o + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InstanceInformation(instanceId=");
        sb.append(this.f8281a);
        sb.append(", instanceType=");
        sb.append(this.f8282b);
        sb.append(", dynamicDemandSourceId=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0oO(')', this.f8283c, sb);
    }

    public C3044dj(String instanceId, int i, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
        this.f8281a = instanceId;
        this.f8282b = i;
        this.f8283c = str;
    }

    /* renamed from: a */
    public final C3044dj m8320a(String instanceId, int i, String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(instanceId, "instanceId");
        return new C3044dj(instanceId, i, str);
    }

    public /* synthetic */ C3044dj(String str, int i, String str2, int i2, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }

    /* renamed from: a */
    public final String m8321a() {
        return this.f8281a;
    }
}
