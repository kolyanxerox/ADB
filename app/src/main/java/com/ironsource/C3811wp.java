package com.ironsource;

/* renamed from: com.ironsource.wp */
/* loaded from: classes2.dex */
public final class C3811wp {

    /* renamed from: a */
    private final boolean f12523a;

    /* renamed from: b */
    private final int f12524b;

    public C3811wp() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C3811wp m12947a(C3811wp c3811wp, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c3811wp.f12523a;
        }
        if ((i2 & 2) != 0) {
            i = c3811wp.f12524b;
        }
        return c3811wp.m12948a(z, i);
    }

    /* renamed from: b */
    public final int m12950b() {
        return this.f12524b;
    }

    /* renamed from: c */
    public final int m12951c() {
        return this.f12524b;
    }

    /* renamed from: d */
    public final boolean m12952d() {
        return this.f12523a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3811wp)) {
            return false;
        }
        C3811wp c3811wp = (C3811wp) obj;
        return this.f12523a == c3811wp.f12523a && this.f12524b == c3811wp.f12524b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public int hashCode() {
        boolean z = this.f12523a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Integer.hashCode(this.f12524b) + (r0 * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OpenUrlConfigurations(isImmersive=");
        sb.append(this.f12523a);
        sb.append(", flags=");
        return OooO0oO.OooOo.OooOOO0(sb, this.f12524b, ')');
    }

    public C3811wp(boolean z, int i) {
        this.f12523a = z;
        this.f12524b = i;
    }

    /* renamed from: a */
    public final C3811wp m12948a(boolean z, int i) {
        return new C3811wp(z, i);
    }

    public /* synthetic */ C3811wp(boolean z, int i, int i2, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 805306368 : i);
    }

    /* renamed from: a */
    public final boolean m12949a() {
        return this.f12523a;
    }
}
