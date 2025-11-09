package com.ironsource;

/* renamed from: com.ironsource.u */
/* loaded from: classes2.dex */
public final class C3716u {

    /* renamed from: a */
    private final EnumC3200hu f12110a;

    /* renamed from: b */
    private final String f12111b;

    /* renamed from: c */
    private final String f12112c;

    /* renamed from: d */
    private final String f12113d;

    /* renamed from: e */
    private final EnumC3558qg f12114e;

    /* renamed from: f */
    private final String f12115f;

    public C3716u(EnumC3200hu recordType, String advertiserBundleId, String networkInstanceId, String adUnitId, EnumC3558qg adProvider, String adInstanceId) {
        kotlin.jvm.internal.OooOo.OooO0o0(recordType, "recordType");
        kotlin.jvm.internal.OooOo.OooO0o0(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.OooOo.OooO0o0(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        kotlin.jvm.internal.OooOo.OooO0o0(adProvider, "adProvider");
        kotlin.jvm.internal.OooOo.OooO0o0(adInstanceId, "adInstanceId");
        this.f12110a = recordType;
        this.f12111b = advertiserBundleId;
        this.f12112c = networkInstanceId;
        this.f12113d = adUnitId;
        this.f12114e = adProvider;
        this.f12115f = adInstanceId;
    }

    /* renamed from: a */
    public final C3027d2 m12494a(InterfaceC3460nn<C3716u, C3027d2> mapper) {
        kotlin.jvm.internal.OooOo.OooO0o0(mapper, "mapper");
        return mapper.mo8213a(this);
    }

    /* renamed from: b */
    public final EnumC3558qg m12496b() {
        return this.f12114e;
    }

    /* renamed from: c */
    public final String m12497c() {
        return this.f12113d;
    }

    /* renamed from: d */
    public final String m12498d() {
        return this.f12111b;
    }

    /* renamed from: e */
    public final String m12499e() {
        return this.f12112c;
    }

    /* renamed from: f */
    public final EnumC3200hu m12500f() {
        return this.f12110a;
    }

    /* renamed from: a */
    public final String m12495a() {
        return this.f12115f;
    }
}
