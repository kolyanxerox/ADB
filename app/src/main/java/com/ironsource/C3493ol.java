package com.ironsource;

/* renamed from: com.ironsource.ol */
/* loaded from: classes2.dex */
public final class C3493ol {

    /* renamed from: a */
    private final long f10662a;

    /* renamed from: b */
    private final long f10663b;

    /* renamed from: c */
    private final boolean f10664c;

    public C3493ol(long j, long j2, boolean z) {
        this.f10662a = j;
        this.f10663b = j2;
        this.f10664c = z;
    }

    /* renamed from: a */
    public final long m11162a() {
        return this.f10662a;
    }

    /* renamed from: b */
    public final long m11164b() {
        return this.f10663b;
    }

    /* renamed from: c */
    public final boolean m11165c() {
        return this.f10664c;
    }

    /* renamed from: d */
    public final long m11166d() {
        return this.f10662a;
    }

    /* renamed from: e */
    public final long m11167e() {
        return this.f10663b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3493ol)) {
            return false;
        }
        C3493ol c3493ol = (C3493ol) obj;
        return this.f10662a == c3493ol.f10662a && this.f10663b == c3493ol.f10663b && this.f10664c == c3493ol.f10664c;
    }

    /* renamed from: f */
    public final boolean m11168f() {
        return this.f10664c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (Long.hashCode(this.f10663b) + (Long.hashCode(this.f10662a) * 31)) * 31;
        boolean z = this.f10664c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=");
        sb.append(this.f10662a);
        sb.append(", visibilityCheckerInterval=");
        sb.append(this.f10663b);
        sb.append(", isAutoRefreshEnabled=");
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOOO(sb, this.f10664c, ')');
    }

    /* renamed from: a */
    public final C3493ol m11163a(long j, long j2, boolean z) {
        return new C3493ol(j, j2, z);
    }

    /* renamed from: a */
    public static /* synthetic */ C3493ol m11161a(C3493ol c3493ol, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c3493ol.f10662a;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = c3493ol.f10663b;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            z = c3493ol.f10664c;
        }
        return c3493ol.m11163a(j3, j4, z);
    }
}
