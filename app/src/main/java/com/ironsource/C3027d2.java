package com.ironsource;

/* renamed from: com.ironsource.d2 */
/* loaded from: classes2.dex */
public final class C3027d2 {

    /* renamed from: a */
    private final EnumC3200hu f7867a;

    /* renamed from: b */
    private final String f7868b;

    /* renamed from: c */
    private final String f7869c;

    /* renamed from: d */
    private final EnumC3558qg f7870d;

    /* renamed from: e */
    private final String f7871e;

    public C3027d2(EnumC3200hu recordType, String advertiserBundleId, String networkInstanceId, EnumC3558qg adProvider, String adInstanceId) {
        kotlin.jvm.internal.OooOo.OooO0o0(recordType, "recordType");
        kotlin.jvm.internal.OooOo.OooO0o0(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.OooOo.OooO0o0(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.OooOo.OooO0o0(adProvider, "adProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceId, "adInstanceId");
        this.f7867a = recordType;
        this.f7868b = advertiserBundleId;
        this.f7869c = networkInstanceId;
        this.f7870d = adProvider;
        this.f7871e = adInstanceId;
    }

    /* renamed from: a */
    public final C3741uo m8254a(InterfaceC3460nn<C3027d2, C3741uo> mapper) {
        kotlin.jvm.internal.OooOo.OooO0o0(mapper, "mapper");
        return mapper.mo8213a(this);
    }

    /* renamed from: b */
    public final EnumC3558qg m8256b() {
        return this.f7870d;
    }

    /* renamed from: c */
    public final String m8257c() {
        return this.f7868b;
    }

    /* renamed from: d */
    public final String m8258d() {
        return this.f7869c;
    }

    /* renamed from: e */
    public final EnumC3200hu m8259e() {
        return this.f7867a;
    }

    /* renamed from: a */
    public final String m8255a() {
        return this.f7871e;
    }
}
