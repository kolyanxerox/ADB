package com.ironsource;

import com.google.android.gms.internal.ads.AbstractC2183w4;

/* renamed from: com.ironsource.m9 */
/* loaded from: classes2.dex */
public final class C3357m9 implements InterfaceC3181hb<C3769vh> {

    /* renamed from: a */
    private final InterfaceC3866yc f9498a;

    /* renamed from: b */
    private final String f9499b;

    /* renamed from: c */
    private final InterfaceC3801wf f9500c;

    /* renamed from: d */
    private final o00O0Oo.Oooo000 f9501d;

    /* renamed from: e */
    private C3769vh f9502e;

    public C3357m9(InterfaceC3866yc fileUrl, String destinationPath, InterfaceC3801wf downloadManager, o00O0Oo.Oooo000 onFinish) {
        kotlin.jvm.internal.OooOo.OooO0o0(fileUrl, "fileUrl");
        kotlin.jvm.internal.OooOo.OooO0o0(destinationPath, "destinationPath");
        kotlin.jvm.internal.OooOo.OooO0o0(downloadManager, "downloadManager");
        kotlin.jvm.internal.OooOo.OooO0o0(onFinish, "onFinish");
        this.f9498a = fileUrl;
        this.f9499b = destinationPath;
        this.f9500c = downloadManager;
        this.f9501d = onFinish;
        this.f9502e = new C3769vh(mo8061b());
    }

    @Override // com.ironsource.InterfaceC3602rp
    /* renamed from: a */
    public void mo8059a(C3769vh file) {
        kotlin.jvm.internal.OooOo.OooO0o0(file, "file");
        mo8064i().invoke(new oo00o.OooOOO0(file));
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: b */
    public String mo8061b() {
        return this.f9499b;
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: c */
    public InterfaceC3866yc mo8063c() {
        return this.f9498a;
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: i */
    public o00O0Oo.Oooo000 mo8064i() {
        return this.f9501d;
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: j */
    public C3769vh mo8065j() {
        return this.f9502e;
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: k */
    public InterfaceC3801wf mo8066k() {
        return this.f9500c;
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: b */
    public void mo8062b(C3769vh c3769vh) {
        kotlin.jvm.internal.OooOo.OooO0o0(c3769vh, "<set-?>");
        this.f9502e = c3769vh;
    }

    @Override // com.ironsource.InterfaceC3602rp
    /* renamed from: a */
    public void mo8060a(C3769vh c3769vh, C3454nh error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new Exception("Unable to download mobileController.html: " + error.m10992b())), mo8064i());
    }
}
