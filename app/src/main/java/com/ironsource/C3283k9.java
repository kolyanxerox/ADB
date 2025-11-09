package com.ironsource;

/* renamed from: com.ironsource.k9 */
/* loaded from: classes2.dex */
public final class C3283k9 implements InterfaceC3662sf {

    /* renamed from: a */
    private final String f9249a;

    /* renamed from: b */
    private final String f9250b;

    /* renamed from: c */
    private final boolean f9251c;

    /* renamed from: d */
    private final C3161gq f9252d;

    public C3283k9() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.ironsource.InterfaceC3662sf
    /* renamed from: a */
    public C3161gq mo9656a() {
        return this.f9252d;
    }

    @Override // com.ironsource.InterfaceC3662sf
    /* renamed from: b */
    public String mo9657b() {
        return this.f9250b;
    }

    @Override // com.ironsource.InterfaceC3662sf
    /* renamed from: c */
    public String mo9658c() {
        return this.f9249a;
    }

    @Override // com.ironsource.InterfaceC3662sf
    /* renamed from: d */
    public boolean mo9659d() {
        return this.f9251c;
    }

    public C3283k9(String controllerUrl, String cacheFolder, boolean z, C3161gq rootFolder) {
        kotlin.jvm.internal.OooOo.OooO0o0(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.OooOo.OooO0o0(cacheFolder, "cacheFolder");
        kotlin.jvm.internal.OooOo.OooO0o0(rootFolder, "rootFolder");
        this.f9249a = controllerUrl;
        this.f9250b = cacheFolder;
        this.f9251c = z;
        this.f9252d = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3283k9(String str, String str2, boolean z, C3161gq c3161gq, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C3161gq(str) : c3161gq);
    }
}
