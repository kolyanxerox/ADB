package com.ironsource;

/* renamed from: com.ironsource.vw */
/* loaded from: classes2.dex */
public final class C3784vw implements InterfaceC3866yc {

    /* renamed from: a */
    private final C3161gq f12428a;

    /* renamed from: b */
    private final String f12429b;

    public C3784vw(C3161gq folderRootUrl, String version) {
        kotlin.jvm.internal.OooOo.OooO0o0(folderRootUrl, "folderRootUrl");
        kotlin.jvm.internal.OooOo.OooO0o0(version, "version");
        this.f12428a = folderRootUrl;
        this.f12429b = version;
    }

    /* renamed from: a */
    public final String m12833a() {
        return this.f12429b;
    }

    @Override // com.ironsource.InterfaceC3866yc
    public String value() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12428a.m9001a());
        sb.append("/versions/");
        return OooO0oO.OooOo.OooOOOo(sb, this.f12429b, "/mobileController.html");
    }
}
