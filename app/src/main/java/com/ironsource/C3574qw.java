package com.ironsource;

/* renamed from: com.ironsource.qw */
/* loaded from: classes2.dex */
public final class C3574qw {

    /* renamed from: a */
    private final InterfaceC3621s9 f11161a;

    public C3574qw(InterfaceC3621s9 currentTimeProvider) {
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        this.f11161a = currentTimeProvider;
    }

    /* renamed from: a */
    public final boolean m11691a(long j, long j2) {
        long jMo11889a = this.f11161a.mo11889a();
        return j2 <= 0 || j <= 0 || jMo11889a < j || jMo11889a - j > j2;
    }
}
