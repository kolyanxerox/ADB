package com.ironsource;

import android.util.Log;
import com.ironsource.InterfaceC3318l9;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.n9 */
/* loaded from: classes2.dex */
public final class C3446n9 implements InterfaceC3592rf {

    /* renamed from: a */
    private final C3283k9 f10385a;

    /* renamed from: b */
    private final o00O0Oo.Oooo000 f10386b;

    /* renamed from: c */
    private final InterfaceC3801wf f10387c;

    /* renamed from: d */
    private final InterfaceC3621s9 f10388d;

    /* renamed from: e */
    private final String f10389e;

    /* renamed from: f */
    private C3769vh f10390f;

    /* renamed from: g */
    private long f10391g;

    /* renamed from: h */
    private final C3161gq f10392h;

    /* renamed from: i */
    private String f10393i;

    /* renamed from: com.ironsource.n9$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.OooOo00 implements o00O0Oo.Oooo000 {
        public a(Object obj) {
            super(1, obj, C3446n9.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m10978a(Object obj) {
            ((C3446n9) this.receiver).m10972b(obj);
        }

        @Override // o00O0Oo.Oooo000
        public /* synthetic */ Object invoke(Object obj) {
            m10978a(((oo00o.OooOOO0) obj).f33191OooOo0O);
            return oo00o.OooOo.f33195OooO00o;
        }
    }

    /* renamed from: com.ironsource.n9$b */
    public /* synthetic */ class b extends kotlin.jvm.internal.OooOo00 implements o00O0Oo.Oooo000 {
        public b(Object obj) {
            super(1, obj, C3446n9.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m10979a(Object obj) throws JSONException {
            ((C3446n9) this.receiver).m10970a(obj);
        }

        @Override // o00O0Oo.Oooo000
        public /* synthetic */ Object invoke(Object obj) throws JSONException {
            m10979a(((oo00o.OooOOO0) obj).f33191OooOo0O);
            return oo00o.OooOo.f33195OooO00o;
        }
    }

    public C3446n9(C3283k9 config, o00O0Oo.Oooo000 onFinish, InterfaceC3801wf downloadManager, InterfaceC3621s9 currentTimeProvider) {
        kotlin.jvm.internal.OooOo.OooO0o0(config, "config");
        kotlin.jvm.internal.OooOo.OooO0o0(onFinish, "onFinish");
        kotlin.jvm.internal.OooOo.OooO0o0(downloadManager, "downloadManager");
        kotlin.jvm.internal.OooOo.OooO0o0(currentTimeProvider, "currentTimeProvider");
        this.f10385a = config;
        this.f10386b = onFinish;
        this.f10387c = downloadManager;
        this.f10388d = currentTimeProvider;
        this.f10389e = "n9";
        this.f10390f = new C3769vh(config.mo9657b(), "mobileController_0.html");
        this.f10391g = currentTimeProvider.mo11889a();
        this.f10392h = new C3161gq(config.mo9658c());
        this.f10393i = "";
    }

    /* renamed from: a */
    private final C3357m9 m10968a(String str) {
        return new C3357m9(new C3784vw(this.f10392h, str), this.f10385a.mo9657b() + "/mobileController_" + str + ".html", this.f10387c, new a(this));
    }

    @Override // com.ironsource.InterfaceC3592rf
    /* renamed from: b */
    public C3769vh mo10975b() {
        return this.f10390f;
    }

    /* renamed from: c */
    public final InterfaceC3621s9 m10976c() {
        return this.f10388d;
    }

    /* renamed from: d */
    public final o00O0Oo.Oooo000 m10977d() {
        return this.f10386b;
    }

    @Override // com.ironsource.InterfaceC3592rf
    /* renamed from: a */
    public void mo10973a() {
        this.f10391g = this.f10388d.mo11889a();
        new C2989c(new C3024d(this.f10392h), this.f10385a.mo9657b() + "/temp", this.f10387c, new b(this)).m9110l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m10972b(Object obj) {
        boolean z = obj instanceof oo00o.OooOO0O;
        if (z) {
            new InterfaceC3318l9.a(this.f10385a.mo9659d()).mo9751a();
        } else {
            C3769vh c3769vh = (C3769vh) (z ? null : obj);
            if (!kotlin.jvm.internal.OooOo.OooO00o(c3769vh != null ? c3769vh.getAbsolutePath() : null, this.f10390f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f10390f);
                    kotlin.jvm.internal.OooOo.OooO0O0(c3769vh);
                    o00O0Oo0.oo000o.OooOO0o(c3769vh, this.f10390f);
                } catch (Exception e) {
                    C3551q9.m11517d().m11519a(e);
                    Log.e(this.f10389e, "Unable to copy downloaded mobileController.html to cache folder: " + e.getMessage());
                }
                kotlin.jvm.internal.OooOo.OooO0O0(c3769vh);
                this.f10390f = c3769vh;
            }
            new InterfaceC3318l9.b(this.f10385a.mo9659d(), this.f10391g, this.f10388d).mo9751a();
        }
        o00O0Oo.Oooo000 oooo000 = this.f10386b;
        if (z) {
            obj = null;
        }
        oooo000.invoke(obj);
    }

    @Override // com.ironsource.InterfaceC3592rf
    /* renamed from: a */
    public boolean mo10974a(C3769vh file) {
        kotlin.jvm.internal.OooOo.OooO0o0(file, "file");
        String name = file.getName();
        kotlin.jvm.internal.OooOo.OooO0Oo(name, "file.name");
        Pattern patternCompile = Pattern.compile("mobileController(_\\d+)?\\.html");
        kotlin.jvm.internal.OooOo.OooO0Oo(patternCompile, "compile(...)");
        return patternCompile.matcher(name).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m10970a(Object obj) throws JSONException {
        if (obj instanceof oo00o.OooOO0O) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null || kotlin.jvm.internal.OooOo.OooO00o(jSONObject.optString("htmlBuildNumber"), "")) {
            m10968a("0").m9110l();
            return;
        }
        SDKUtils.updateControllerConfig("abTestMap", jSONObject);
        String string = jSONObject.getString("htmlBuildNumber");
        kotlin.jvm.internal.OooOo.OooO0Oo(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
        this.f10393i = string;
        C3357m9 c3357m9M10968a = m10968a(string);
        if (!c3357m9M10968a.m9109h()) {
            c3357m9M10968a.m9110l();
            return;
        }
        C3769vh c3769vhMo8065j = c3357m9M10968a.mo8065j();
        this.f10390f = c3769vhMo8065j;
        this.f10386b.invoke(c3769vhMo8065j);
    }
}
