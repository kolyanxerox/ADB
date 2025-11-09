package com.ironsource;

/* renamed from: com.ironsource.il */
/* loaded from: classes2.dex */
public abstract class AbstractC3226il {

    /* renamed from: a */
    private final C3349m1 f9031a;

    /* renamed from: b */
    private String f9032b;

    /* renamed from: c */
    private boolean f9033c;

    public AbstractC3226il(C3349m1 adTools) {
        kotlin.jvm.internal.OooOo.OooO0o0(adTools, "adTools");
        this.f9031a = adTools;
        this.f9032b = "";
    }

    /* renamed from: a */
    public final C3349m1 m9348a() {
        return this.f9031a;
    }

    /* renamed from: b */
    public final String m9353b() {
        return this.f9032b;
    }

    /* renamed from: c */
    public final boolean m9355c() {
        return this.f9033c;
    }

    /* renamed from: d */
    public abstract boolean mo9356d();

    /* renamed from: a */
    public final void m9349a(C3061e1 adProperties) {
        kotlin.jvm.internal.OooOo.OooO0o0(adProperties, "adProperties");
        this.f9031a.m9970e().m7903a(new C2628a2(this.f9031a, adProperties, null, 4, null));
    }

    /* renamed from: b */
    public final void m9354b(Runnable callback) {
        kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
        this.f9031a.m13102e(callback);
    }

    /* renamed from: a */
    public final void m9350a(Runnable runnable) {
        kotlin.jvm.internal.OooOo.OooO0o0(runnable, "runnable");
        this.f9031a.m13101d(runnable);
    }

    /* renamed from: a */
    public final void m9351a(String str) {
        kotlin.jvm.internal.OooOo.OooO0o0(str, "<set-?>");
        this.f9032b = str;
    }

    /* renamed from: a */
    public final void m9352a(boolean z) {
        this.f9033c = z;
    }
}
