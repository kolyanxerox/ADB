package com.ironsource;

import android.app.Activity;
import com.ironsource.C3034d9;
import com.ironsource.C3905zh;
import com.ironsource.InterfaceC3843xn;
import com.ironsource.sdk.controller.C3640e;
import com.ironsource.sdk.controller.InterfaceC3641f;
import com.ironsource.sdk.controller.InterfaceC3647l;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.wn */
/* loaded from: classes2.dex */
public final class C3809wn implements InterfaceC3843xn {

    /* renamed from: a */
    private final String f12508a;

    /* renamed from: b */
    private final C3640e f12509b;

    /* renamed from: c */
    private final InterfaceC3560qi f12510c;

    /* renamed from: d */
    private final InterfaceC3890z2 f12511d;

    /* renamed from: e */
    private final String f12512e;

    /* renamed from: f */
    private InterfaceC3843xn.a f12513f;

    /* renamed from: com.ironsource.wn$a */
    public static final class a {

        /* renamed from: a */
        public static final a f12514a = new a();

        /* renamed from: b */
        public static final String f12515b = "nativeAd.load";

        /* renamed from: c */
        public static final String f12516c = "nativeAd.loadReport";

        /* renamed from: d */
        public static final String f12517d = "nativeAd.register";

        /* renamed from: e */
        public static final String f12518e = "nativeAd.click";

        /* renamed from: f */
        public static final String f12519f = "nativeAd.privacyClick";

        /* renamed from: g */
        public static final String f12520g = "nativeAd.visibilityChanged";

        /* renamed from: h */
        public static final String f12521h = "nativeAd.destroy";

        private a() {
        }
    }

    public C3809wn(String id, C3640e controllerManager, InterfaceC3560qi imageLoader, InterfaceC3890z2 adViewManagement) {
        kotlin.jvm.internal.OooOo.OooO0o0(id, "id");
        kotlin.jvm.internal.OooOo.OooO0o0(controllerManager, "controllerManager");
        kotlin.jvm.internal.OooOo.OooO0o0(imageLoader, "imageLoader");
        kotlin.jvm.internal.OooOo.OooO0o0(adViewManagement, "adViewManagement");
        this.f12508a = id;
        this.f12509b = controllerManager;
        this.f12510c = imageLoader;
        this.f12511d = adViewManagement;
        this.f12512e = "wn";
        controllerManager.m11988a(id, m12937c());
    }

    /* renamed from: c */
    private final InterfaceC3647l.b m12937c() {
        return new InterfaceC3647l.b() { // from class: com.ironsource.o0000O00
            @Override // com.ironsource.sdk.controller.InterfaceC3647l.b
            /* renamed from: a */
            public final void mo11067a(C3565qn c3565qn) {
                C3809wn.m12930a(this.f28530OooO00o, c3565qn);
            }
        };
    }

    /* renamed from: d */
    private final JSONObject m12938d() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("command", a.f12518e).put("sdkCallback", C3034d9.g.f8019U);
        kotlin.jvm.internal.OooOo.OooO0Oo(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.ironsource.InterfaceC3843xn
    /* renamed from: a */
    public InterfaceC3843xn.a mo12939a() {
        return this.f12513f;
    }

    @Override // com.ironsource.InterfaceC3843xn
    /* renamed from: b */
    public void mo12945b() {
        this.f12509b.mo11983a(new InterfaceC3641f.c(this.f12508a, a.f12519f, new JSONObject()), (InterfaceC3647l.a) null);
    }

    @Override // com.ironsource.InterfaceC3843xn
    public void destroy() {
        this.f12509b.mo11983a(new InterfaceC3641f.c(this.f12508a, a.f12521h, new JSONObject()), (InterfaceC3647l.a) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3809wn(String str, C3640e c3640e, InterfaceC3560qi interfaceC3560qi, InterfaceC3890z2 interfaceC3890z2, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        interfaceC3560qi = (i & 4) != 0 ? new C3525pi(null, 1, null) : interfaceC3560qi;
        if ((i & 8) != 0) {
            interfaceC3890z2 = C3256jh.m9487a();
            kotlin.jvm.internal.OooOo.OooO0Oo(interfaceC3890z2, "getInstance()");
        }
        this(str, c3640e, interfaceC3560qi, interfaceC3890z2);
    }

    /* renamed from: a */
    private final void m12926a(Activity activity, InterfaceC3641f.a aVar) {
        if (aVar.m12013d() == null) {
            InterfaceC3843xn.a aVarMo12939a = mo12939a();
            if (aVarMo12939a != null) {
                aVarMo12939a.mo13066a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (aVar.m12013d().optBoolean("success", false)) {
            C3905zh.b bVarM13367a = new C3905zh.a(this.f12510c, this.f12511d).m13367a(activity, aVar.m12013d());
            m12933a(bVarM13367a, bVarM13367a.m13370a().m13381h());
            return;
        }
        String reason = aVar.m12013d().optString("reason", "failed to load native ad: unexpected error");
        InterfaceC3843xn.a aVarMo12939a2 = mo12939a();
        if (aVarMo12939a2 != null) {
            kotlin.jvm.internal.OooOo.OooO0Oo(reason, "reason");
            aVarMo12939a2.mo13066a(reason);
        }
    }

    /* renamed from: b */
    private final void m12935b(InterfaceC3641f.a aVar) {
        if (aVar.m12013d() == null) {
            Logger.m12266i(this.f12512e, "failed to handle show on native ad: missing params");
            return;
        }
        if (aVar.m12013d().optBoolean("success", false)) {
            InterfaceC3843xn.a aVarMo12939a = mo12939a();
            if (aVarMo12939a != null) {
                aVarMo12939a.mo13064a();
                return;
            }
            return;
        }
        String strOptString = aVar.m12013d().optString("reason", "unexpected error");
        Logger.m12266i(this.f12512e, "failed to handle show on native ad: " + strOptString);
    }

    /* renamed from: b */
    public static final void m12936b(C3809wn this$0, InterfaceC3641f.a it) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
        this$0.m12935b(it);
    }

    @Override // com.ironsource.InterfaceC3843xn
    /* renamed from: a */
    public void mo12940a(Activity activity, JSONObject loadParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        kotlin.jvm.internal.OooOo.OooO0o0(loadParams, "loadParams");
        this.f12509b.mo11981a(activity);
        this.f12509b.mo11983a(new InterfaceC3641f.c(this.f12508a, a.f12515b, loadParams), new o0000O0(this, activity, 0));
    }

    @Override // com.ironsource.InterfaceC3843xn
    /* renamed from: a */
    public void mo12941a(C3008ci viewHolder) throws JSONException {
        kotlin.jvm.internal.OooOo.OooO0o0(viewHolder, "viewHolder");
        JSONObject params = new JSONObject().put("assetViews", viewHolder.m8159t()).put("adViewClickCommand", m12938d());
        String str = this.f12508a;
        kotlin.jvm.internal.OooOo.OooO0Oo(params, "params");
        this.f12509b.mo11983a(new InterfaceC3641f.c(str, a.f12517d, params), (InterfaceC3647l.a) null);
    }

    /* renamed from: a */
    private final void m12927a(C3565qn c3565qn) {
        if (c3565qn.m11596f() == null) {
            Logger.m12266i(this.f12512e, "failed to handle click on native ad: missing params");
            return;
        }
        if (c3565qn.m11596f().optBoolean("success", false)) {
            InterfaceC3843xn.a aVarMo12939a = mo12939a();
            if (aVarMo12939a != null) {
                aVarMo12939a.mo13067h();
                return;
            }
            return;
        }
        String strOptString = c3565qn.m11596f().optString("reason", "unexpected error");
        Logger.m12266i(this.f12512e, "failed to handle click on native ad: " + strOptString);
    }

    /* renamed from: a */
    private final void m12928a(InterfaceC3641f.a aVar) {
        if (aVar.m12013d() == null) {
            Logger.m12266i(this.f12512e, "failed to handle click on native ad: missing params");
            return;
        }
        if (aVar.m12013d().optBoolean("success", false)) {
            InterfaceC3843xn.a aVarMo12939a = mo12939a();
            if (aVarMo12939a != null) {
                aVarMo12939a.mo13067h();
                return;
            }
            return;
        }
        String strOptString = aVar.m12013d().optString("reason", "unexpected error");
        Logger.m12266i(this.f12512e, "failed to handle click on native ad: " + strOptString);
    }

    /* renamed from: a */
    public static final void m12929a(C3809wn this$0, Activity activity, InterfaceC3641f.a it) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "$activity");
        kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
        this$0.m12926a(activity, it);
    }

    /* renamed from: a */
    public static final void m12930a(C3809wn this$0, C3565qn msg) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(msg, "msg");
        if (kotlin.jvm.internal.OooOo.OooO00o(msg.m11595e(), a.f12518e)) {
            this$0.m12927a(msg);
        }
    }

    /* renamed from: a */
    public static final void m12931a(C3809wn this$0, InterfaceC3641f.a it) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
        this$0.m12928a(it);
    }

    /* renamed from: a */
    public static final void m12932a(C3809wn this$0, C3905zh adData, InterfaceC3641f.a it) {
        kotlin.jvm.internal.OooOo.OooO0o0(this$0, "this$0");
        kotlin.jvm.internal.OooOo.OooO0o0(adData, "$adData");
        kotlin.jvm.internal.OooOo.OooO0o0(it, "it");
        this$0.m12934a(adData, it);
    }

    @Override // com.ironsource.InterfaceC3843xn
    /* renamed from: a */
    public void mo12942a(InterfaceC3843xn.a aVar) {
        this.f12513f = aVar;
    }

    /* renamed from: a */
    private final void m12933a(C3905zh.b bVar, C3905zh c3905zh) {
        this.f12509b.mo11983a(new InterfaceC3641f.c(this.f12508a, "nativeAd.loadReport." + this.f12508a, bVar.m13371b()), new o0000O0(this, c3905zh, 1));
    }

    /* renamed from: a */
    private final void m12934a(C3905zh c3905zh, InterfaceC3641f.a aVar) {
        if (aVar.m12013d() == null) {
            InterfaceC3843xn.a aVarMo12939a = mo12939a();
            if (aVarMo12939a != null) {
                aVarMo12939a.mo13066a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (aVar.m12013d().optBoolean("success", false)) {
            InterfaceC3843xn.a aVarMo12939a2 = mo12939a();
            if (aVarMo12939a2 != null) {
                aVarMo12939a2.mo13065a(c3905zh);
                return;
            }
            return;
        }
        String reason = aVar.m12013d().optString("reason", "failed to load native ad: unexpected error");
        InterfaceC3843xn.a aVarMo12939a3 = mo12939a();
        if (aVarMo12939a3 != null) {
            kotlin.jvm.internal.OooOo.OooO0Oo(reason, "reason");
            aVarMo12939a3.mo13066a(reason);
        }
    }

    @Override // com.ironsource.InterfaceC3843xn
    /* renamed from: a */
    public void mo12943a(C3920zw viewVisibilityParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(viewVisibilityParams, "viewVisibilityParams");
        this.f12509b.mo11983a(new InterfaceC3641f.c(this.f12508a, a.f12520g, viewVisibilityParams.m13438g()), new o0000oo(this, 1));
    }

    @Override // com.ironsource.InterfaceC3843xn
    /* renamed from: a */
    public void mo12944a(JSONObject clickParams) {
        kotlin.jvm.internal.OooOo.OooO0o0(clickParams, "clickParams");
        this.f12509b.mo11983a(new InterfaceC3641f.c(this.f12508a, a.f12518e, clickParams), new o0000oo(this, 0));
    }
}
