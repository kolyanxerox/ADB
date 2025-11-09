package com.ironsource;

/* renamed from: com.ironsource.g2 */
/* loaded from: classes2.dex */
public final class C3137g2 {

    /* renamed from: a */
    private final long f8678a;

    public C3137g2(long j) {
        this.f8678a = j;
    }

    /* renamed from: a */
    public final long m8855a() {
        return this.f8678a;
    }

    /* renamed from: b */
    public final long m8857b() {
        return this.f8678a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3137g2) && this.f8678a == ((C3137g2) obj).f8678a;
    }

    public int hashCode() {
        return Long.hashCode(this.f8678a);
    }

    public String toString() {
        return "AdUnitInteractionData(impressionTimeout=" + this.f8678a + ')';
    }

    /* renamed from: a */
    public final C3137g2 m8856a(long j) {
        return new C3137g2(j);
    }

    /* renamed from: a */
    public static /* synthetic */ C3137g2 m8854a(C3137g2 c3137g2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c3137g2.f8678a;
        }
        return c3137g2.m8856a(j);
    }
}
