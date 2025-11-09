package com.unity3d.ads.network.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.applovin.shadow.okio.Utf8;
import com.unity3d.ads.network.model.HttpBody;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;

/* loaded from: classes3.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        OooOo.OooO0o0(baseURL, "baseURL");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = httpRequest.baseURL;
        }
        if ((i5 & 2) != 0) {
            str2 = httpRequest.path;
        }
        if ((i5 & 4) != 0) {
            requestType = httpRequest.method;
        }
        if ((i5 & 8) != 0) {
            httpBody = httpRequest.body;
        }
        if ((i5 & 16) != 0) {
            map = httpRequest.headers;
        }
        if ((i5 & 32) != 0) {
            map2 = httpRequest.parameters;
        }
        if ((i5 & 64) != 0) {
            str3 = httpRequest.scheme;
        }
        if ((i5 & 128) != 0) {
            num = httpRequest.port;
        }
        if ((i5 & 256) != 0) {
            i = httpRequest.connectTimeout;
        }
        if ((i5 & 512) != 0) {
            i2 = httpRequest.readTimeout;
        }
        if ((i5 & 1024) != 0) {
            i3 = httpRequest.writeTimeout;
        }
        if ((i5 & 2048) != 0) {
            i4 = httpRequest.callTimeout;
        }
        int i6 = i3;
        int i7 = i4;
        int i8 = i;
        int i9 = i2;
        String str4 = str3;
        Integer num2 = num;
        Map map3 = map;
        Map map4 = map2;
        return httpRequest.copy(str, str2, requestType, httpBody, map3, map4, str4, num2, i8, i9, i6, i7);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i, int i2, int i3, int i4) {
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(scheme, "scheme");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return OooOo.OooO00o(this.baseURL, httpRequest.baseURL) && OooOo.OooO00o(this.path, httpRequest.path) && this.method == httpRequest.method && OooOo.OooO00o(this.body, httpRequest.body) && OooOo.OooO00o(this.headers, httpRequest.headers) && OooOo.OooO00o(this.parameters, httpRequest.parameters) && OooOo.OooO00o(this.scheme, httpRequest.scheme) && OooOo.OooO00o(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0((this.parameters.hashCode() + ((this.headers.hashCode() + ((this.body.hashCode() + ((this.method.hashCode() + OooO00o.OooO0O0(this.baseURL.hashCode() * 31, 31, this.path)) * 31)) * 31)) * 31)) * 31, 31, this.scheme);
        Integer num = this.port;
        return Integer.hashCode(this.callTimeout) + OooO00o.OooO00o(this.writeTimeout, OooO00o.OooO00o(this.readTimeout, OooO00o.OooO00o(this.connectTimeout, (iOooO0O0 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest(baseURL=");
        sb.append(this.baseURL);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", parameters=");
        sb.append(this.parameters);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(", port=");
        sb.append(this.port);
        sb.append(", connectTimeout=");
        sb.append(this.connectTimeout);
        sb.append(", readTimeout=");
        sb.append(this.readTimeout);
        sb.append(", writeTimeout=");
        sb.append(this.writeTimeout);
        sb.append(", callTimeout=");
        return OooO0oO.OooOo.OooOOO0(sb, this.callTimeout, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, Utf8.MASK_2BYTES, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, 0, 0, 0, 3584, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i, int i2) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, 0, 0, 3072, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i, int i2, int i3) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, i3, 0, 2048, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map<String, ? extends List<String>> headers, Map<String, String> parameters, String scheme, Integer num, int i, int i2, int i3, int i4) {
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, OooOO0O oooOO0O) {
        String str4 = (i5 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i5 & 4) != 0 ? RequestType.GET : requestType;
        HttpBody httpBody2 = (i5 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody;
        int i6 = i5 & 16;
        Map map3 = o00oO0o.f31247OooOo0O;
        this(str, str4, requestType2, httpBody2, i6 != 0 ? map3 : map, (i5 & 32) == 0 ? map2 : map3, (i5 & 64) != 0 ? "https" : str3, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? 30000 : i, (i5 & 512) != 0 ? 30000 : i2, (i5 & 1024) != 0 ? 30000 : i3, (i5 & 2048) != 0 ? 30000 : i4);
    }
}
