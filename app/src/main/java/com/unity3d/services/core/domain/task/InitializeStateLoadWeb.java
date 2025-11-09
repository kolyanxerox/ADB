package com.unity3d.services.core.domain.task;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class InitializeStateLoadWeb extends MetricTask<Params, LoadWebResult> {
    private final ISDKDispatchers dispatchers;
    private final HttpClient httpClient;
    private final InitializeStateNetworkError initializeStateNetworkError;

    public static final class LoadWebResult {
        private final Configuration config;
        private final String webViewDataString;

        public LoadWebResult(Configuration config, String webViewDataString) {
            OooOo.OooO0o0(config, "config");
            OooOo.OooO0o0(webViewDataString, "webViewDataString");
            this.config = config;
            this.webViewDataString = webViewDataString;
        }

        public static /* synthetic */ LoadWebResult copy$default(LoadWebResult loadWebResult, Configuration configuration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = loadWebResult.config;
            }
            if ((i & 2) != 0) {
                str = loadWebResult.webViewDataString;
            }
            return loadWebResult.copy(configuration, str);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final String component2() {
            return this.webViewDataString;
        }

        public final LoadWebResult copy(Configuration config, String webViewDataString) {
            OooOo.OooO0o0(config, "config");
            OooOo.OooO0o0(webViewDataString, "webViewDataString");
            return new LoadWebResult(config, webViewDataString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadWebResult)) {
                return false;
            }
            LoadWebResult loadWebResult = (LoadWebResult) obj;
            return OooOo.OooO00o(this.config, loadWebResult.config) && OooOo.OooO00o(this.webViewDataString, loadWebResult.webViewDataString);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewDataString() {
            return this.webViewDataString;
        }

        public int hashCode() {
            return this.webViewDataString.hashCode() + (this.config.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LoadWebResult(config=");
            sb.append(this.config);
            sb.append(", webViewDataString=");
            return OooO00o.OooO0oO(')', this.webViewDataString, sb);
        }
    }

    public static final class Params implements BaseParams {
        private final Configuration config;

        public Params(Configuration config) {
            OooOo.OooO0o0(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration config) {
            OooOo.OooO0o0(config, "config");
            return new Params(config);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && OooOo.OooO00o(this.config, ((Params) obj).config);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateLoadWeb(ISDKDispatchers dispatchers, InitializeStateNetworkError initializeStateNetworkError, HttpClient httpClient) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(initializeStateNetworkError, "initializeStateNetworkError");
        OooOo.OooO0o0(httpClient, "httpClient");
        this.dispatchers = dispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError;
        this.httpClient = httpClient;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("download_web_view");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo13783doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params r6, o00O0O0O.OooO0OO r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            o00O0.o000OOo.OooOO0O(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            o00O0.o000OOo.OooOO0O(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            o00O0oOo.o0000O00 r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.label = r3
            java.lang.Object r7 = o00O0oOo.o0000OO0.Oooo00O(r2, r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            oo00o.OooOOO0 r7 = (oo00o.OooOOO0) r7
            java.lang.Object r6 = r7.f33191OooOo0O
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb.mo13783doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
