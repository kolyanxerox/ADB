package com.unity3d.services;

import OooO00o.OooO00o;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.OooOO0O;
import o00O0.o000OOo;
import o00O0.o0O0O00;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO0;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000O0;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o0000oo;
import o00O0oOo.o000OO;
import oo00o.OooOO0;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class SDKErrorHandler implements o0000O0 {
    public static final Companion Companion = new Companion(null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final AlternativeFlowReader alternativeFlowReader;
    private final o0000O00 ioDispatcher;
    private final o0000oo key;
    private final o000OO scope;
    private final SDKMetricsSender sdkMetricsSender;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", m13472f = "SDKErrorHandler.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.SDKErrorHandler$sendDiagnostic$1 */
    public static final class C42041 extends OooOOOO implements o00O0O {
        final /* synthetic */ String $name;
        final /* synthetic */ String $reason;
        final /* synthetic */ String $scopeName;
        final /* synthetic */ String $stackTrace;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42041(String str, String str2, String str3, String str4, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$name = str;
            this.$reason = str2;
            this.$stackTrace = str3;
            this.$scopeName = str4;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return SDKErrorHandler.this.new C42041(this.$name, this.$reason, this.$stackTrace, this.$scopeName, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            SendDiagnosticEvent.DefaultImpls.invoke$default(SDKErrorHandler.this.sendDiagnosticEvent, this.$name, null, o0O0O00.OooOOo0(new OooOO0("reason", this.$reason), new OooOO0("reason_debug", this.$stackTrace), new OooOO0("coroutine_name", this.$scopeName)), null, null, null, 58, null);
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C42041) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public SDKErrorHandler(o0000O00 ioDispatcher, AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, SDKMetricsSender sdkMetricsSender) {
        kotlin.jvm.internal.OooOo.OooO0o0(ioDispatcher, "ioDispatcher");
        kotlin.jvm.internal.OooOo.OooO0o0(alternativeFlowReader, "alternativeFlowReader");
        kotlin.jvm.internal.OooOo.OooO0o0(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.OooOo.OooO0o0(sdkMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = ioDispatcher;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sdkMetricsSender;
        this.scope = o0000OO0.OooOo0o(o0000OO0.OooO0O0(ioDispatcher), new o0000O0O("SDKErrorHandler"));
        this.key = o0000oo.f31508OooOo0O;
    }

    private final String retrieveCoroutineName(OooOOO0 oooOOO0) {
        String str;
        o0000O0O o0000o0o2 = (o0000O0O) oooOOO0.get(o0000O0O.f31494OooOo0o);
        return (o0000o0o2 == null || (str = o0000o0o2.f31495OooOo0O) == null) ? "unknown" : str;
    }

    private final void sendDiagnostic(String str, String str2, String str3, String str4) {
        o0000OO0.OooOo0(this.scope, null, new C42041(str, str2, str4, str3, null), 3);
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // o00O0O0O.OooOOO0
    public <R> R fold(R r, o00O0O operation) {
        kotlin.jvm.internal.OooOo.OooO0o0(operation, "operation");
        return (R) operation.invoke(r, this);
    }

    @Override // o00O0O0O.OooOOO0
    public <E extends o00O0O0O.OooOO0> E get(o00O0O0O.OooOO0O oooOO0O) {
        return (E) OooO00o.OooO(this, oooOO0O);
    }

    @Override // o00O0oOo.o0000O0
    public void handleException(OooOOO0 context, Throwable exception) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        kotlin.jvm.internal.OooOo.OooO0o0(context, "context");
        kotlin.jvm.internal.OooOo.OooO0o0(exception, "exception");
        String strRetrieveCoroutineName = retrieveCoroutineName(context);
        String str = exception instanceof NullPointerException ? "native_exception_npe" : exception instanceof OutOfMemoryError ? "native_exception_oom" : exception instanceof IllegalStateException ? "native_exception_ise" : exception instanceof SecurityException ? "native_exception_se" : exception instanceof RuntimeException ? "native_exception_re" : "native_exception";
        boolean zInvoke = this.alternativeFlowReader.invoke();
        String strRetrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(exception);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + strRetrieveUnityCrashValue);
        if (zInvoke) {
            sendDiagnostic(str, strRetrieveUnityCrashValue, strRetrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(exception, 15));
        } else {
            sendMetric(new Metric(str, strRetrieveUnityCrashValue, null, 4, null));
        }
    }

    @Override // o00O0O0O.OooOOO0
    public OooOOO0 minusKey(o00O0O0O.OooOO0O oooOO0O) {
        return OooO00o.OooOOoo(this, oooOO0O);
    }

    @Override // o00O0O0O.OooOOO0
    public OooOOO0 plus(OooOOO0 oooOOO0) {
        return OooO00o.OooOo00(this, oooOOO0);
    }

    @Override // o00O0O0O.OooOO0
    public o0000oo getKey() {
        return this.key;
    }
}
