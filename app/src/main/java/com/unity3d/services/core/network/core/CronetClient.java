package com.unity3d.services.core.network.core;

import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oO.o0000;
import o00O0oO.o000000;
import o00O0oO.o0OO00O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o0Oo0oo;
import o00O0oOo.oo0o0Oo;
import oo00o.OooOo;
import org.apache.tika.metadata.HttpHeaders;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes3.dex */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    private final ISDKDispatchers dispatchers;
    private final CronetEngine engine;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    @OooO(m13471c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", m13472f = "CronetClient.kt", m13473l = {31}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.network.core.CronetClient$executeBlocking$1 */
    public static final class C43341 extends OooOOOO implements o00O0O {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43341(HttpRequest httpRequest, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$request = httpRequest;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return CronetClient.this.new C43341(this.$request, oooO0OO);
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
            CronetClient cronetClient = CronetClient.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = cronetClient.execute(httpRequest, this);
            return objExecute == oooOo00 ? oooOo00 : objExecute;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C43341) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public CronetClient(CronetEngine engine, ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.OooOo.OooO0o0(engine, "engine");
        kotlin.jvm.internal.OooOo.OooO0o0(dispatchers, "dispatchers");
        this.engine = engine;
        this.dispatchers = dispatchers;
    }

    public final String buildUrl(HttpRequest httpRequest) {
        return o000000.OoooOoO(o000000.Ooooooo(httpRequest.getBaseURL(), '/') + '/' + o000000.Ooooooo(httpRequest.getPath(), '/'), "/");
    }

    public final long getContentSize(UrlResponseInfo urlResponseInfo) {
        String str;
        Long lOooOoo0;
        List<String> list = urlResponseInfo.getAllHeaders().get(HttpHeaders.CONTENT_LENGTH);
        if (list == null || (str = list.get(0)) == null || (lOooOoo0 = o0000.OooOoo0(str)) == null) {
            return -1L;
        }
        return lOooOoo0.longValue();
    }

    public final int getPriority(int i) {
        if (i == 0) {
            return 4;
        }
        if (i != 1) {
            return i != 2 ? 1 : 2;
        }
        return 3;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, OooO0OO oooO0OO) {
        byte[] bytes;
        final oo0o0Oo oo0o0oo = new oo0o0Oo(1, Oooo0o0.OooO.OooOOOO(oooO0OO));
        oo0o0oo.OooOOo0();
        final ISDKDispatchers iSDKDispatchers = this.dispatchers;
        final long readTimeout = httpRequest.getReadTimeout();
        UnityAdsUrlRequestCallback unityAdsUrlRequestCallback = new UnityAdsUrlRequestCallback(iSDKDispatchers, readTimeout) { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
                super.onCanceled(urlRequest, urlResponseInfo);
                oo0o0oo.resumeWith(o000OOo.OooO0O0(new NetworkTimeoutException("Network request timed out", null, null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, null, "cronet", 38, null)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
                super.onFailed(urlRequest, urlResponseInfo, cronetException);
                NetworkException networkException = cronetException instanceof NetworkException ? (NetworkException) cronetException : null;
                oo0o0oo.resumeWith(o000OOo.OooO0O0(new UnityAdsNetworkException("Network request failed", null, urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest request, UrlResponseInfo info, byte[] bodyBytes) {
                kotlin.jvm.internal.OooOo.OooO0o0(request, "request");
                kotlin.jvm.internal.OooOo.OooO0o0(info, "info");
                kotlin.jvm.internal.OooOo.OooO0o0(bodyBytes, "bodyBytes");
                o0Oo0oo o0oo0oo = oo0o0oo;
                int httpStatusCode = info.getHttpStatusCode();
                Map<String, List<String>> allHeaders = info.getAllHeaders();
                String url = info.getUrl();
                String negotiatedProtocol = info.getNegotiatedProtocol();
                long contentSize = this.getContentSize(info);
                kotlin.jvm.internal.OooOo.OooO0Oo(allHeaders, "allHeaders");
                kotlin.jvm.internal.OooOo.OooO0Oo(url, "url");
                kotlin.jvm.internal.OooOo.OooO0Oo(negotiatedProtocol, "negotiatedProtocol");
                o0oo0oo.resumeWith(new HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize));
            }
        };
        UrlRequest.Builder builderNewUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), unityAdsUrlRequestCallback, o0000OO0.OooO0o(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builderNewUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bytes = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bytes = ((String) httpRequest.getBody()).getBytes(o0OO00O.f31451OooO00o);
                kotlin.jvm.internal.OooOo.OooO0Oo(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = new byte[0];
            }
            builderNewUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bytes), o0000OO0.OooO0o(this.dispatchers.getIo()));
        }
        UrlRequest req = builderNewUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        oo0o0oo.OooOo00(new CronetClient$execute$2$2(req));
        kotlin.jvm.internal.OooOo.OooO0Oo(req, "req");
        unityAdsUrlRequestCallback.startTimer(req);
        req.start();
        Object objOooOOOo = oo0o0oo.OooOOOo();
        OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
        return objOooOOOo;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        kotlin.jvm.internal.OooOo.OooO0o0(request, "request");
        return (HttpResponse) o0000OO0.OooOoO(this.dispatchers.getIo(), new C43341(request, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}
