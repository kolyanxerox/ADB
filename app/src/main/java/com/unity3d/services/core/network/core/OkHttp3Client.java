package com.unity3d.services.core.network.core;

import OooOOo0.o0OOO0o;
import android.content.Context;
import androidx.core.text.HtmlCompat;
import com.ironsource.sdk.controller.OooO0o;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import gatewayprotocol.p014v1.NativeConfigurationOuterClass;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketTimeoutException;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o000Ooo.o00oO0o;
import o00O.o0OoOo0;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0Oo0.o00Oo0;
import o00O0oO.o0OO00O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00OOO00;
import o00O0oOo.oo0o0Oo;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0O00OOO;
import o00O0ooo.o0O0OOO0;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import o00OOO0.OooOO0;
import o00OOO0.o00000;
import o00OOO0.o000000;
import o00OOO0.o000oOoO;
import o00OOO0.o00Ooo;
import o00OOO0.o0Oo0oo;
import o00OOO0.oo000o;
import o00OOOoO.o0000;
import o00OOOoO.o0000oo;
import o00OOOoO.o000O0;
import o00OOOoO.o000OO0O;
import o00OOOoO.o00O000;

/* loaded from: classes3.dex */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "okhttp";
    private final CleanupDirectory cleanupDirectory;
    private final oo000o client;
    private final Context context;
    private final ISDKDispatchers dispatchers;
    private final AlternativeFlowReader isAlternativeFlowReader;
    private final File okHttpCache;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public static final class RequestComplete {
        private final Object body;
        private final o000000 response;

        public RequestComplete(o000000 response, Object obj) {
            OooOo.OooO0o0(response, "response");
            this.response = response;
            this.body = obj;
        }

        public static /* synthetic */ RequestComplete copy$default(RequestComplete requestComplete, o000000 o000000Var, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                o000000Var = requestComplete.response;
            }
            if ((i & 2) != 0) {
                obj = requestComplete.body;
            }
            return requestComplete.copy(o000000Var, obj);
        }

        public final o000000 component1() {
            return this.response;
        }

        public final Object component2() {
            return this.body;
        }

        public final RequestComplete copy(o000000 response, Object obj) {
            OooOo.OooO0o0(response, "response");
            return new RequestComplete(response, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestComplete)) {
                return false;
            }
            RequestComplete requestComplete = (RequestComplete) obj;
            return OooOo.OooO00o(this.response, requestComplete.response) && OooOo.OooO00o(this.body, requestComplete.body);
        }

        public final Object getBody() {
            return this.body;
        }

        public final o000000 getResponse() {
            return this.response;
        }

        public int hashCode() {
            int iHashCode = this.response.hashCode() * 31;
            Object obj = this.body;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "RequestComplete(response=" + this.response + ", body=" + this.body + ')';
        }

        public /* synthetic */ RequestComplete(o000000 o000000Var, Object obj, int i, OooOO0O oooOO0O) {
            this(o000000Var, (i & 2) != 0 ? null : obj);
        }
    }

    @OooO(m13471c = "com.unity3d.services.core.network.core.OkHttp3Client$execute$2", m13472f = "OkHttp3Client.kt", m13473l = {74}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$2 */
    public static final class C43392 extends OooOOOO implements o00O0O {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43392(HttpRequest httpRequest, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$request = httpRequest;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return OkHttp3Client.this.new C43392(this.$request, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, UnityAdsNetworkException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Object objMakeRequest;
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            try {
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    OkHttp3Client okHttp3Client = OkHttp3Client.this;
                    HttpRequest httpRequest = this.$request;
                    long connectTimeout = httpRequest.getConnectTimeout();
                    long readTimeout = this.$request.getReadTimeout();
                    long writeTimeout = this.$request.getWriteTimeout();
                    this.label = 1;
                    objMakeRequest = okHttp3Client.makeRequest(httpRequest, connectTimeout, readTimeout, writeTimeout, this);
                    if (objMakeRequest == oooOo00) {
                        return oooOo00;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000OOo.OooOO0O(obj);
                    objMakeRequest = obj;
                }
                RequestComplete requestComplete = (RequestComplete) objMakeRequest;
                o000000 o000000VarComponent1 = requestComplete.component1();
                String strComponent2 = requestComplete.component2();
                if (!OkHttp3Client.this.isAlternativeFlowReader.invoke()) {
                    strComponent2 = strComponent2 instanceof File ? o00O0Oo0.oo000o.OooOOO((File) strComponent2) : strComponent2 instanceof byte[] ? new String((byte[]) strComponent2, o0OO00O.f31451OooO00o) : "";
                }
                int i2 = o000000VarComponent1.f32208OooOo;
                TreeMap treeMapOooO0oO = o000000VarComponent1.f32213OooOoOO.OooO0oO();
                String str = o000000VarComponent1.f32209OooOo0O.f32277OooO00o.f32292OooO;
                Object obj2 = strComponent2 == null ? "" : strComponent2;
                String str2 = o000000VarComponent1.f32210OooOo0o.f32276OooOo0O;
                OooOo.OooO0Oo(str, "toString()");
                return new HttpResponse(obj2, i2, treeMapOooO0oO, str, str2, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 0L, 64, null);
            } catch (SocketTimeoutException unused) {
                throw new NetworkTimeoutException("Network request timeout", null, null, this.$request.getBaseURL(), null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
            } catch (IOException unused2) {
                throw new UnityAdsNetworkException("Network request failed", null, null, this.$request.getBaseURL(), null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
            }
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C43392) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    @OooO(m13471c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", m13472f = "OkHttp3Client.kt", m13473l = {HtmlCompat.FROM_HTML_MODE_COMPACT}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1 */
    public static final class C43401 extends OooOOOO implements o00O0O {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43401(HttpRequest httpRequest, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$request = httpRequest;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return OkHttp3Client.this.new C43401(this.$request, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            OkHttp3Client okHttp3Client = OkHttp3Client.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = okHttp3Client.execute(httpRequest, this);
            return objExecute == oooOo00 ? oooOo00 : objExecute;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C43401) create(o000oo2, oooO0OO)).invokeSuspend(oo00o.OooOo.f33195OooO00o);
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, oo000o client, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, AlternativeFlowReader isAlternativeFlowReader) {
        OooOo.OooO0o0(dispatchers, "dispatchers");
        OooOo.OooO0o0(client, "client");
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(sessionRepository, "sessionRepository");
        OooOo.OooO0o0(cleanupDirectory, "cleanupDirectory");
        OooOo.OooO0o0(isAlternativeFlowReader, "isAlternativeFlowReader");
        this.dispatchers = dispatchers;
        this.client = client;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.isAlternativeFlowReader = isAlternativeFlowReader;
        this.okHttpCache = getOkHttpCache();
    }

    private final File getOkHttpCache() {
        File filesDir = this.context.getFilesDir();
        OooOo.OooO0Oo(filesDir, "context.filesDir");
        File fileOooOOOO = o00O0Oo0.oo000o.OooOOOO(filesDir);
        fileOooOOOO.mkdirs();
        if (this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
            this.cleanupDirectory.invoke(fileOooOOOO, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
        }
        return fileOooOOOO;
    }

    public final Object makeRequest(final HttpRequest httpRequest, long j, long j2, long j3, OooO0OO oooO0OO) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o00OOO0.o0OO00O okHttpProtoRequest = httpRequest.isProtobuf() ? HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest) : HttpRequestToOkHttpRequestKt.toOkHttpRequest(httpRequest);
        oo000o oo000oVar = this.client;
        oo000oVar.getClass();
        o00Ooo o00ooo2 = new o00Ooo(oo000oVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o00ooo2.OooOo0 = o00OOO0O.OooO0OO.OooO0Oo(j);
        o00ooo2.f32267OooOo0O = o00OOO0O.OooO0OO.OooO0Oo(j2);
        o00ooo2.f32268OooOo0o = o00OOO0O.OooO0OO.OooO0Oo(j3);
        oo000o oo000oVar2 = new oo000o(o00ooo2);
        final File file = new File(this.okHttpCache, StringExtensionsKt.getSHA256Hash(httpRequest.getBaseURL()));
        Long l = new Long((file.exists() && file.isFile()) ? file.length() : 0L);
        o00OOO0.o0OO00O o0oo00oOooO0OO = null;
        if (l.longValue() <= 0) {
            l = null;
        }
        if (l != null) {
            long jLongValue = l.longValue();
            DeviceLog.debug("Resuming download for " + httpRequest.getBaseURL());
            o0OOO0o o0ooo0oOooO00o = okHttpProtoRequest.OooO00o();
            String str = "bytes=" + jLongValue + '-';
            o00oO0o o00oo0o = (o00oO0o) o0ooo0oOooO00o.f13520OooOoO0;
            o00oo0o.getClass();
            o000oOoO.OooO00o("Range");
            o000oOoO.OooO0O0(str, "Range");
            o00oo0o.OooO0OO("Range", str);
            o0oo00oOooO0OO = o0ooo0oOooO00o.OooO0OO();
        }
        final oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        if (o0oo00oOooO0OO != null) {
            okHttpProtoRequest = o0oo00oOooO0OO;
        }
        o0Oo0oo.OooO0OO(oo000oVar2, okHttpProtoRequest).OooO00o(new OooOO0() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1
            @Override // o00OOO0.OooOO0
            public void onFailure(o00OOO0.OooO call, IOException e) {
                OooOo.OooO0o0(call, "call");
                OooOo.OooO0o0(e, "e");
                oo0o0oo.resumeWith(o000OOo.OooO0O0(e));
            }

            @Override // o00OOO0.OooOO0
            public void onResponse(o00OOO0.OooO call, o000000 response) throws IOException {
                o000OO0O o000oo0o;
                o00OOO00 o00ooo00OooOOo0;
                OooOo.OooO0o0(call, "call");
                OooOo.OooO0o0(response, "response");
                int i = response.f32208OooOo;
                if (i < 200 || i >= 300) {
                    oo0o0oo.resumeWith(o000OOo.OooO0O0(new IOException("Network request failed with code " + i)));
                    return;
                }
                try {
                    o00000 o00000Var = response.f32215OooOoo0;
                    if (o00000Var == null) {
                        oo0o0oo.resumeWith(new OkHttp3Client.RequestComplete(response, null, 2, null));
                        return;
                    }
                    final long jOooO00o = o00000Var.OooO00o();
                    o0000 o0000Var = new o0000();
                    String strOooO00o = response.OooO00o("Cache-Control");
                    if (((strOooO00o == null || o00O0oO.o000000.Oooo0o("no-cache", strOooO00o)) ? null : this) != null) {
                        File file2 = file;
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        Logger logger = o000O0.f32570OooO00o;
                        o000oo0o = new o000OO0O(new o00OOOoO.o00000(1, new FileOutputStream(file2, true), new o00O000()));
                    } else {
                        o000oo0o = null;
                    }
                    oO00000o oo00000oOooO0OO = o000oo0o != null ? o0o0000.OooO0OO(0L) : null;
                    if (oo00000oOooO0OO != null) {
                        final o0OoOo0 o0oooo0 = new o0OoOo0(new o0O00OOO(new o000o00o.o0Oo0oo(3), oo00000oOooO0OO, null), 0);
                        final o0OoOoOo o0oooooo = new o0OoOoOo() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1

                            /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2 */
                            public static final class C43372<T> implements o0O000Oo {
                                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                                @OooO(m13471c = "com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2", m13472f = "OkHttp3Client.kt", m13473l = {223}, m13474m = "emit")
                                /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                                    Object L$0;
                                    Object L$1;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(OooO0OO oooO0OO) {
                                        super(oooO0OO);
                                    }

                                    @Override // o00O0OO0.OooO00o
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return C43372.this.emit(null, this);
                                    }
                                }

                                public C43372(o0O000Oo o0o000oo) {
                                    this.$this_unsafeFlow = o0o000oo;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // o00O0ooo.o0O000Oo
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object emit(java.lang.Object r9, o00O0O0O.OooO0OO r10) {
                                    /*
                                        r8 = this;
                                        boolean r0 = r10 instanceof com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1.C43372.AnonymousClass1
                                        if (r0 == 0) goto L13
                                        r0 = r10
                                        com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$1 r0 = (com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1.C43372.AnonymousClass1) r0
                                        int r1 = r0.label
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.label = r1
                                        goto L18
                                    L13:
                                        com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$1 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1$2$1
                                        r0.<init>(r10)
                                    L18:
                                        java.lang.Object r10 = r0.result
                                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                                        int r2 = r0.label
                                        r3 = 1
                                        if (r2 == 0) goto L2f
                                        if (r2 != r3) goto L27
                                        o00O0.o000OOo.OooOO0O(r10)
                                        goto L4a
                                    L27:
                                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                                        r9.<init>(r10)
                                        throw r9
                                    L2f:
                                        o00O0.o000OOo.OooOO0O(r10)
                                        o00O0ooo.o0O000Oo r10 = r8.$this_unsafeFlow
                                        r2 = r9
                                        java.lang.Number r2 = (java.lang.Number) r2
                                        long r4 = r2.longValue()
                                        r6 = 0
                                        int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                                        if (r2 == 0) goto L4a
                                        r0.label = r3
                                        java.lang.Object r9 = r10.emit(r9, r0)
                                        if (r9 != r1) goto L4a
                                        return r1
                                    L4a:
                                        oo00o.OooOo r9 = oo00o.OooOo.f33195OooO00o
                                        return r9
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$filter$1.C43372.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                                }
                            }

                            @Override // o00O0ooo.o0OoOoOo
                            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO2) {
                                Object objCollect = o0oooo0.collect(new C43372(o0o000oo), oooO0OO2);
                                return objCollect == OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
                            }
                        };
                        o00ooo00OooOOo0 = o0o0000.OooOOo0(new o0O0OOO0(new o0OoOoOo() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1

                            /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2 */
                            public static final class C43382<T> implements o0O000Oo {
                                final /* synthetic */ long $contentLength$inlined;
                                final /* synthetic */ o0O000Oo $this_unsafeFlow;

                                @OooO(m13471c = "com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2", m13472f = "OkHttp3Client.kt", m13473l = {223}, m13474m = "emit")
                                /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(OooO0OO oooO0OO) {
                                        super(oooO0OO);
                                    }

                                    @Override // o00O0OO0.OooO00o
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return C43382.this.emit(null, this);
                                    }
                                }

                                public C43382(o0O000Oo o0o000oo, long j) {
                                    this.$this_unsafeFlow = o0o000oo;
                                    this.$contentLength$inlined = j;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // o00O0ooo.o0O000Oo
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object emit(java.lang.Object r7, o00O0O0O.OooO0OO r8) {
                                    /*
                                        r6 = this;
                                        boolean r0 = r8 instanceof com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1.C43382.AnonymousClass1
                                        if (r0 == 0) goto L13
                                        r0 = r8
                                        com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$1 r0 = (com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1.C43382.AnonymousClass1) r0
                                        int r1 = r0.label
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.label = r1
                                        goto L18
                                    L13:
                                        com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$1 r0 = new com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1$2$1
                                        r0.<init>(r8)
                                    L18:
                                        java.lang.Object r8 = r0.result
                                        o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                                        int r2 = r0.label
                                        r3 = 1
                                        if (r2 == 0) goto L2f
                                        if (r2 != r3) goto L27
                                        o00O0.o000OOo.OooOO0O(r8)
                                        goto L55
                                    L27:
                                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                        r7.<init>(r8)
                                        throw r7
                                    L2f:
                                        o00O0.o000OOo.OooOO0O(r8)
                                        o00O0ooo.o0O000Oo r8 = r6.$this_unsafeFlow
                                        java.lang.Number r7 = (java.lang.Number) r7
                                        long r4 = r7.longValue()
                                        float r7 = (float) r4
                                        long r4 = r6.$contentLength$inlined
                                        float r2 = (float) r4
                                        float r7 = r7 / r2
                                        r2 = 100
                                        float r2 = (float) r2
                                        float r7 = r7 * r2
                                        int r7 = o00O0.o000OOo.OooO(r7)
                                        java.lang.Integer r2 = new java.lang.Integer
                                        r2.<init>(r7)
                                        r0.label = r3
                                        java.lang.Object r7 = r8.emit(r2, r0)
                                        if (r7 != r1) goto L55
                                        return r1
                                    L55:
                                        oo00o.OooOo r7 = oo00o.OooOo.f33195OooO00o
                                        return r7
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$$inlined$map$1.C43382.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                                }
                            }

                            @Override // o00O0ooo.o0OoOoOo
                            public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO2) {
                                Object objCollect = o0oooooo.collect(new C43382(o0o000oo, jOooO00o), oooO0OO2);
                                return objCollect == OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
                            }
                        }, new C4341x945bbe94(httpRequest, null), 2), o0000OO0.OooO0O0(this.dispatchers.getIo()));
                    } else {
                        o00ooo00OooOOo0 = null;
                    }
                    o0000oo o0000ooVarOooO0OO = o00000Var.OooO0OO();
                    OkHttp3Client$makeRequest$2$1$onResponse$1 okHttp3Client$makeRequest$2$1$onResponse$1 = new OkHttp3Client$makeRequest$2$1$onResponse$1(o0000ooVarOooO0OO, o000oo0o != null ? o000oo0o.f32593OooOo0o : o0000Var);
                    o00O0o.OooOO0 oooOO0 = new o00O0o.OooOO0(new o00Oo0(okHttp3Client$makeRequest$2$1$onResponse$1, new OooO0o(okHttp3Client$makeRequest$2$1$onResponse$1, 5)));
                    OkHttp3Client$makeRequest$2$1$onResponse$2 predicate = OkHttp3Client$makeRequest$2$1$onResponse$2.INSTANCE;
                    OooOo.OooO0o0(predicate, "predicate");
                    o00O0Oo0.o0OoOo0 o0oooo02 = new o00O0Oo0.o0OoOo0(new o00Oo0(oooOO0, predicate, 3), (byte) 0);
                    long jLongValue2 = 0;
                    while (o0oooo02.hasNext()) {
                        jLongValue2 += ((Number) o0oooo02.next()).longValue();
                        if (o000oo0o != null) {
                            o000oo0o.OooO00o();
                        }
                        if (oo00000oOooO0OO != null) {
                            oo00000oOooO0OO.OooO(null, Long.valueOf(jLongValue2));
                        }
                    }
                    if (o000oo0o != null) {
                        o000oo0o.close();
                    }
                    if (o00ooo00OooOOo0 != null) {
                        o00ooo00OooOOo0.OooO00o(null);
                    }
                    o0000ooVarOooO0OO.close();
                    o00000Var.close();
                    oo0o0oo.resumeWith(new OkHttp3Client.RequestComplete(response, o000oo0o != null ? file : o0000Var.readByteArray(o0000Var.f32535OooOo0o)));
                } catch (IOException e) {
                    oo0o0oo.resumeWith(o000OOo.OooO0O0(e));
                }
            }
        });
        Object objOooOOOo = oo0o0oo.OooOOOo();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOOo;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00O(new C43392(httpRequest, null), this.dispatchers.getIo(), oooO0OO);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        OooOo.OooO0o0(request, "request");
        return (HttpResponse) o0000OO0.OooOoO(this.dispatchers.getIo(), new C43401(request, null));
    }
}
