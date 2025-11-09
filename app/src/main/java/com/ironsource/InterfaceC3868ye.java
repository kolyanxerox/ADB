package com.ironsource;

/* renamed from: com.ironsource.ye */
/* loaded from: classes2.dex */
public interface InterfaceC3868ye {

    /* renamed from: com.ironsource.ye$a */
    public static final class a implements InterfaceC3868ye {

        /* renamed from: a */
        private final EnumC2935af f12749a;

        public a(EnumC2935af strategy) {
            kotlin.jvm.internal.OooOo.OooO0o0(strategy, "strategy");
            this.f12749a = strategy;
        }

        @Override // com.ironsource.InterfaceC3868ye
        /* renamed from: a */
        public String mo13198a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.InterfaceC3868ye
        /* renamed from: b */
        public EnumC2935af mo13199b() {
            return this.f12749a;
        }

        /* renamed from: c */
        public final EnumC2935af m13200c() {
            return this.f12749a;
        }
    }

    /* renamed from: a */
    String mo13198a();

    /* renamed from: b */
    EnumC2935af mo13199b();
}
