package com.ironsource;

import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.c */
/* loaded from: classes2.dex */
public final class C2989c implements InterfaceC3181hb<JSONObject> {

    /* renamed from: a */
    private final InterfaceC3866yc f7670a;

    /* renamed from: b */
    private final String f7671b;

    /* renamed from: c */
    private final InterfaceC3801wf f7672c;

    /* renamed from: d */
    private final o00O0Oo.Oooo000 f7673d;

    /* renamed from: e */
    private C3769vh f7674e;

    public C2989c(InterfaceC3866yc fileUrl, String destinationPath, InterfaceC3801wf downloadManager, o00O0Oo.Oooo000 onFinish) {
        kotlin.jvm.internal.OooOo.OooO0o0(fileUrl, "fileUrl");
        kotlin.jvm.internal.OooOo.OooO0o0(destinationPath, "destinationPath");
        kotlin.jvm.internal.OooOo.OooO0o0(downloadManager, "downloadManager");
        kotlin.jvm.internal.OooOo.OooO0o0(onFinish, "onFinish");
        this.f7670a = fileUrl;
        this.f7671b = destinationPath;
        this.f7672c = downloadManager;
        this.f7673d = onFinish;
        this.f7674e = new C3769vh(mo8061b(), C3034d9.f7897h);
    }

    @Override // com.ironsource.InterfaceC3602rp
    /* renamed from: a */
    public void mo8059a(C3769vh file) {
        kotlin.jvm.internal.OooOo.OooO0o0(file, "file");
        if (kotlin.jvm.internal.OooOo.OooO00o(file.getName(), C3034d9.f7897h)) {
            try {
                mo8064i().invoke(new oo00o.OooOOO0(m8058c(file)));
            } catch (Exception e) {
                C3551q9.m11517d().m11519a(e);
                AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(e), mo8064i());
            }
        }
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: b */
    public String mo8061b() {
        return this.f7671b;
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: c */
    public InterfaceC3866yc mo8063c() {
        return this.f7670a;
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: i */
    public o00O0Oo.Oooo000 mo8064i() {
        return this.f7673d;
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: j */
    public C3769vh mo8065j() {
        return this.f7674e;
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: k */
    public InterfaceC3801wf mo8066k() {
        return this.f7672c;
    }

    /* renamed from: c */
    private final JSONObject m8058c(C3769vh c3769vh) {
        return new JSONObject(IronSourceStorageUtils.readFile(c3769vh));
    }

    @Override // com.ironsource.InterfaceC3181hb
    /* renamed from: b */
    public void mo8062b(C3769vh c3769vh) {
        kotlin.jvm.internal.OooOo.OooO0o0(c3769vh, "<set-?>");
        this.f7674e = c3769vh;
    }

    @Override // com.ironsource.InterfaceC3602rp
    /* renamed from: a */
    public void mo8060a(C3769vh c3769vh, C3454nh error) {
        kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
        AbstractC2183w4.OooOOoo(o00O0.o000OOo.OooO0O0(new Exception("Unable to download abTestMap.json: " + error.m10992b())), mo8064i());
    }
}
