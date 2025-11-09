package com.unity3d.services.core.network.core;

import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.jvm.internal.OooOO0O;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00OOO0.oo000o;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class RefactoredOkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final oo000o client;
    private final ISDKDispatchers dispatchers;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.services.core.network.core.RefactoredOkHttp3Client", m13472f = "RefactoredOkHttp3Client.kt", m13473l = {119}, m13474m = "execute")
    /* renamed from: com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1 */
    public static final class C43421 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C43421(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RefactoredOkHttp3Client.this.execute(null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.services.core.network.core.RefactoredOkHttp3Client$executeBlocking$1", m13472f = "RefactoredOkHttp3Client.kt", m13473l = {37}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.network.core.RefactoredOkHttp3Client$executeBlocking$1 */
    public static final class C43431 extends OooOOOO implements o00O0O {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43431(HttpRequest httpRequest, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$request = httpRequest;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            return RefactoredOkHttp3Client.this.new C43431(this.$request, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) throws UnityAdsNetworkException {
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
            RefactoredOkHttp3Client refactoredOkHttp3Client = RefactoredOkHttp3Client.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = refactoredOkHttp3Client.execute(httpRequest, this);
            return objExecute == oooOo00 ? oooOo00 : objExecute;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, o00O0O0O.OooO0OO oooO0OO) {
            return ((C43431) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public RefactoredOkHttp3Client(ISDKDispatchers dispatchers, oo000o client) {
        kotlin.jvm.internal.OooOo.OooO0o0(dispatchers, "dispatchers");
        kotlin.jvm.internal.OooOo.OooO0o0(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object execute(com.unity3d.services.core.network.model.HttpRequest r11, o00O0O0O.OooO0OO r12) throws com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.unity3d.services.core.network.core.RefactoredOkHttp3Client.C43421
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1 r0 = (com.unity3d.services.core.network.core.RefactoredOkHttp3Client.C43421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1 r0 = new com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r11 = r0.L$2
            o00OOO0.oo000o r11 = (o00OOO0.oo000o) r11
            java.lang.Object r11 = r0.L$1
            o00OOO0.o0OO00O r11 = (o00OOO0.o0OO00O) r11
            java.lang.Object r11 = r0.L$0
            com.unity3d.services.core.network.model.HttpRequest r11 = (com.unity3d.services.core.network.model.HttpRequest) r11
            o00O0.o000OOo.OooOO0O(r12)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            return r12
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            o00O0.o000OOo.OooOO0O(r12)
            o00OOO0.o0OO00O r12 = com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(r11)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            o00OOO0.oo000o r2 = r10.client     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r2.getClass()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            o00OOO0.o00Ooo r4 = new o00OOO0.o00Ooo     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.<init>(r2)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            int r2 = r11.getConnectTimeout()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            long r5 = (long) r2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            int r2 = o00OOO0O.OooO0OO.OooO0Oo(r5)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.OooOo0 = r2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            int r2 = r11.getReadTimeout()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            long r5 = (long) r2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            int r2 = o00OOO0O.OooO0OO.OooO0Oo(r5)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.f32267OooOo0O = r2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            int r2 = r11.getWriteTimeout()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            long r5 = (long) r2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            int r2 = o00OOO0O.OooO0OO.OooO0Oo(r5)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.f32268OooOo0o = r2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            o00OOO0.oo000o r2 = new o00OOO0.oo000o     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r2.<init>(r4)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.L$0 = r11     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.L$1 = r12     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.L$2 = r2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.label = r3     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            o00O0oOo.oo0o0Oo r4 = new o00O0oOo.oo0o0Oo     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            o00O0O0O.OooO0OO r0 = Oooo0o0.OooO.OooOOOO(r0)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.<init>(r3, r0)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.OooOOo0()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            o00OOO0.o0Oo0oo r12 = o00OOO0.o0Oo0oo.OooO0OO(r2, r12)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$1 r0 = new com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$1     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.<init>(r12)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r4.OooOo00(r0)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$2 r0 = new com.unity3d.services.core.network.core.RefactoredOkHttp3Client$execute$2$2     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r0.<init>()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            r12.OooO00o(r0)     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            java.lang.Object r11 = r4.OooOOOo()     // Catch: java.io.IOException -> La4 java.net.SocketTimeoutException -> Lb9
            if (r11 != r1) goto La3
            return r1
        La3:
            return r11
        La4:
            com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r0 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException
            java.lang.String r4 = r11.getBaseURL()
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            java.lang.String r1 = "Network request failed"
            r2 = 0
            r3 = 0
            r5 = 0
            r8 = 54
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        Lb9:
            com.unity3d.ads.core.data.model.exception.NetworkTimeoutException r0 = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException
            java.lang.String r4 = r11.getBaseURL()
            r6 = 0
            java.lang.String r7 = "refactored-okhttp"
            java.lang.String r1 = "Network request timeout"
            r2 = 0
            r3 = 0
            r5 = 0
            r8 = 54
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.RefactoredOkHttp3Client.execute(com.unity3d.services.core.network.model.HttpRequest, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        kotlin.jvm.internal.OooOo.OooO0o0(request, "request");
        return (HttpResponse) o0000OO0.OooOoO(this.dispatchers.getIo(), new C43431(request, null));
    }
}
