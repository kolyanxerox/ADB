package com.ironsource;

/* renamed from: com.ironsource.we */
/* loaded from: classes2.dex */
public final class C3800we implements InterfaceC3834xe {

    /* renamed from: a */
    private final long f12454a;

    /* renamed from: b */
    private final EnumC2935af f12455b;

    public C3800we(long j, EnumC2935af recoveryStrategy) {
        kotlin.jvm.internal.OooOo.OooO0o0(recoveryStrategy, "recoveryStrategy");
        this.f12454a = j;
        this.f12455b = recoveryStrategy;
    }

    @Override // com.ironsource.InterfaceC3834xe
    /* renamed from: a */
    public long mo12895a() {
        return this.f12454a;
    }

    @Override // com.ironsource.InterfaceC3834xe
    /* renamed from: b */
    public EnumC2935af mo12896b() {
        return this.f12455b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3800we(C3902ze feature) {
        this(feature.mo12776a(), feature.mo12777b());
        kotlin.jvm.internal.OooOo.OooO0o0(feature, "feature");
    }
}
