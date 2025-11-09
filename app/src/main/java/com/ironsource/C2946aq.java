package com.ironsource;

/* renamed from: com.ironsource.aq */
/* loaded from: classes2.dex */
public final class C2946aq {

    /* renamed from: a */
    private final long f7557a;

    /* renamed from: b */
    private final EnumC3480o8 f7558b;

    public C2946aq(long j, EnumC3480o8 unit) {
        kotlin.jvm.internal.OooOo.OooO0o0(unit, "unit");
        this.f7557a = j;
        this.f7558b = unit;
    }

    /* renamed from: a */
    public final long m7829a() {
        return this.f7557a;
    }

    /* renamed from: b */
    public final EnumC3480o8 m7830b() {
        return this.f7558b;
    }

    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f7557a + " unit=" + this.f7558b + ')';
    }

    public /* synthetic */ C2946aq(long j, EnumC3480o8 enumC3480o8, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(j, (i & 2) != 0 ? EnumC3480o8.Second : enumC3480o8);
    }
}
