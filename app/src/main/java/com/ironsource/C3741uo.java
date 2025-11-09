package com.ironsource;

/* renamed from: com.ironsource.uo */
/* loaded from: classes2.dex */
public final class C3741uo {

    /* renamed from: a */
    private final EnumC3200hu f12262a;

    /* renamed from: b */
    private final String f12263b;

    /* renamed from: c */
    private final EnumC3558qg f12264c;

    /* renamed from: d */
    private final String f12265d;

    public C3741uo(EnumC3200hu recordType, String advertiserBundleId, EnumC3558qg adProvider, String adInstanceId) {
        kotlin.jvm.internal.OooOo.OooO0o0(recordType, "recordType");
        kotlin.jvm.internal.OooOo.OooO0o0(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.OooOo.OooO0o0(adProvider, "adProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceId, "adInstanceId");
        this.f12262a = recordType;
        this.f12263b = advertiserBundleId;
        this.f12264c = adProvider;
        this.f12265d = adInstanceId;
    }

    /* renamed from: a */
    public final C3063e3 m12709a(InterfaceC3460nn<C3741uo, C3063e3> mapper) {
        kotlin.jvm.internal.OooOo.OooO0o0(mapper, "mapper");
        return mapper.mo8213a(this);
    }

    /* renamed from: b */
    public final EnumC3558qg m12711b() {
        return this.f12264c;
    }

    /* renamed from: c */
    public final String m12712c() {
        return this.f12263b;
    }

    /* renamed from: d */
    public final EnumC3200hu m12713d() {
        return this.f12262a;
    }

    /* renamed from: a */
    public final String m12710a() {
        return this.f12265d;
    }
}
