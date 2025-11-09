package com.ironsource;

import com.ironsource.C3473o1;

/* renamed from: com.ironsource.h0 */
/* loaded from: classes2.dex */
public final class C3170h0 {

    /* renamed from: a */
    private C3473o1.a f8788a;

    public C3170h0(C3473o1.a performance) {
        kotlin.jvm.internal.OooOo.OooO0o0(performance, "performance");
        this.f8788a = performance;
    }

    /* renamed from: a */
    public static /* synthetic */ C3170h0 m9026a(C3170h0 c3170h0, C3473o1.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = c3170h0.f8788a;
        }
        return c3170h0.m9027a(aVar);
    }

    /* renamed from: b */
    public final C3473o1.a m9029b() {
        return this.f8788a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3170h0) && this.f8788a == ((C3170h0) obj).f8788a;
    }

    public int hashCode() {
        return this.f8788a.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.f8788a + ')';
    }

    /* renamed from: a */
    public final C3170h0 m9027a(C3473o1.a performance) {
        kotlin.jvm.internal.OooOo.OooO0o0(performance, "performance");
        return new C3170h0(performance);
    }

    /* renamed from: b */
    public final void m9030b(C3473o1.a aVar) {
        kotlin.jvm.internal.OooOo.OooO0o0(aVar, "<set-?>");
        this.f8788a = aVar;
    }

    /* renamed from: a */
    public final C3473o1.a m9028a() {
        return this.f8788a;
    }
}
