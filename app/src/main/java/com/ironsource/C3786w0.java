package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.w0 */
/* loaded from: classes2.dex */
public final class C3786w0 implements InterfaceC3752v0 {

    /* renamed from: a */
    private final InterfaceC3671so f12433a;

    /* renamed from: com.ironsource.w0$a */
    public static final class a implements InterfaceC3532pp {

        /* renamed from: a */
        final /* synthetic */ C3700ti f12434a;

        /* renamed from: b */
        final /* synthetic */ InitListener f12435b;

        public a(C3700ti c3700ti, InitListener initListener) {
            this.f12434a = c3700ti;
            this.f12435b = initListener;
        }

        @Override // com.ironsource.InterfaceC3532pp
        public void onFail(C3454nh error) {
            kotlin.jvm.internal.OooOo.OooO0o0(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.f12435b.onInitFailed(C3797wb.f12445a.m12861a(new IronSourceError(error.m10991a(), error.m10992b())));
        }

        @Override // com.ironsource.InterfaceC3532pp
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            StringBuilder sb = new StringBuilder("controllerURL = ");
            InterfaceC3717u0 interfaceC3717u0M12440e = this.f12434a.m12440e();
            sb.append(interfaceC3717u0M12440e != null ? interfaceC3717u0M12440e.mo12503c() : null);
            ironLog.verbose(sb.toString());
            StringBuilder sb2 = new StringBuilder("controllerConfig = ");
            InterfaceC3717u0 interfaceC3717u0M12440e2 = this.f12434a.m12440e();
            sb2.append(interfaceC3717u0M12440e2 != null ? interfaceC3717u0M12440e2.mo12501a() : null);
            ironLog.verbose(sb2.toString());
            StringBuilder sb3 = new StringBuilder("debugMode = ");
            InterfaceC3717u0 interfaceC3717u0M12440e3 = this.f12434a.m12440e();
            sb3.append(interfaceC3717u0M12440e3 != null ? Integer.valueOf(interfaceC3717u0M12440e3.mo12502b()) : null);
            ironLog.verbose(sb3.toString());
            ironLog.verbose("applicationKey = " + this.f12434a.m12439d());
            ironLog.verbose("userId = " + this.f12434a.m12443h());
            this.f12435b.onInitSuccess();
        }
    }

    public C3786w0(InterfaceC3671so networkInitApi) {
        kotlin.jvm.internal.OooOo.OooO0o0(networkInitApi, "networkInitApi");
        this.f12433a = networkInitApi;
    }

    @Override // com.ironsource.InterfaceC3752v0
    /* renamed from: a */
    public void mo12729a(Context context, C3700ti initConfig, InitListener initListener) {
        JSONObject jSONObjectMo12501a;
        String strMo12503c;
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(initConfig, "initConfig");
        kotlin.jvm.internal.OooOo.OooO0o0(initListener, "initListener");
        InterfaceC3671so interfaceC3671so = this.f12433a;
        InterfaceC3717u0 interfaceC3717u0M12440e = initConfig.m12440e();
        interfaceC3671so.mo12295a(interfaceC3717u0M12440e != null ? interfaceC3717u0M12440e.mo12502b() : 0);
        InterfaceC3717u0 interfaceC3717u0M12440e2 = initConfig.m12440e();
        if (interfaceC3717u0M12440e2 != null && (strMo12503c = interfaceC3717u0M12440e2.mo12503c()) != null) {
            this.f12433a.mo12299b(strMo12503c);
        }
        InterfaceC3717u0 interfaceC3717u0M12440e3 = initConfig.m12440e();
        if (interfaceC3717u0M12440e3 != null && (jSONObjectMo12501a = interfaceC3717u0M12440e3.mo12501a()) != null) {
            InterfaceC3671so interfaceC3671so2 = this.f12433a;
            String string = jSONObjectMo12501a.toString();
            kotlin.jvm.internal.OooOo.OooO0Oo(string, "applicationConfig.toString()");
            interfaceC3671so2.mo12298a(string);
        }
        Map<String, String> mapM11598a = new C3566qo().m11598a();
        this.f12433a.mo12297a(new a(initConfig, initListener));
        this.f12433a.mo12296a(context, initConfig.m12439d(), initConfig.m12443h(), mapM11598a);
    }
}
