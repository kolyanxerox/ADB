package com.unity3d.services.core.network.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.unity3d.ads.core.data.model.OperationType;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;

/* loaded from: classes3.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
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
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        OooOo.OooO0o0(baseURL, "baseURL");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, Object obj2) {
        int i7;
        File file2;
        String str4;
        HttpRequest httpRequest2;
        OperationType operationType2;
        String str5;
        RequestType requestType2;
        Object obj3;
        Map map3;
        Map map4;
        BodyType bodyType2;
        String str6;
        Integer num2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        String str7 = (i6 & 1) != 0 ? httpRequest.baseURL : str;
        String str8 = (i6 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType3 = (i6 & 4) != 0 ? httpRequest.method : requestType;
        Object obj4 = (i6 & 8) != 0 ? httpRequest.body : obj;
        Map map5 = (i6 & 16) != 0 ? httpRequest.headers : map;
        Map map6 = (i6 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType3 = (i6 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str9 = (i6 & 128) != 0 ? httpRequest.scheme : str3;
        Integer num3 = (i6 & 256) != 0 ? httpRequest.port : num;
        int i12 = (i6 & 512) != 0 ? httpRequest.connectTimeout : i;
        int i13 = (i6 & 1024) != 0 ? httpRequest.readTimeout : i2;
        int i14 = (i6 & 2048) != 0 ? httpRequest.writeTimeout : i3;
        int i15 = (i6 & 4096) != 0 ? httpRequest.callTimeout : i4;
        boolean z3 = (i6 & 8192) != 0 ? httpRequest.isProtobuf : z;
        String str10 = str7;
        OperationType operationType3 = (i6 & 16384) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i6 & 32768) != 0 ? httpRequest.downloadDestination : file;
        if ((i6 & 65536) != 0) {
            file2 = file3;
            i7 = httpRequest.priority;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i8 = i12;
            i9 = i13;
            i10 = i14;
            i11 = i15;
            z2 = z3;
            str4 = str10;
            httpRequest2 = httpRequest;
        } else {
            i7 = i5;
            file2 = file3;
            str4 = str10;
            httpRequest2 = httpRequest;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i8 = i12;
            i9 = i13;
            i10 = i14;
            i11 = i15;
            z2 = z3;
        }
        return httpRequest2.copy(str4, str5, requestType2, obj3, map3, map4, bodyType2, str6, num2, i8, i9, i10, i11, z2, operationType2, file2, i7);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
        OooOo.OooO0o0(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, file, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return OooOo.OooO00o(this.baseURL, httpRequest.baseURL) && OooOo.OooO00o(this.path, httpRequest.path) && this.method == httpRequest.method && OooOo.OooO00o(this.body, httpRequest.body) && OooOo.OooO00o(this.headers, httpRequest.headers) && OooOo.OooO00o(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && OooOo.OooO00o(this.scheme, httpRequest.scheme) && OooOo.OooO00o(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && OooOo.OooO00o(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.method.hashCode() + OooO00o.OooO0O0(this.baseURL.hashCode() * 31, 31, this.path)) * 31;
        Object obj = this.body;
        int iOooO0O0 = OooO00o.OooO0O0((this.bodyType.hashCode() + ((this.parameters.hashCode() + ((this.headers.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.scheme);
        Integer num = this.port;
        int iOooO00o = OooO00o.OooO00o(this.callTimeout, OooO00o.OooO00o(this.writeTimeout, OooO00o.OooO00o(this.readTimeout, OooO00o.OooO00o(this.connectTimeout, (iOooO0O0 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
        boolean z = this.isProtobuf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode2 = (this.operationType.hashCode() + ((iOooO00o + i) * 31)) * 31;
        File file = this.downloadDestination;
        return Integer.hashCode(this.priority) + ((iHashCode2 + (file != null ? file.hashCode() : 0)) * 31);
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
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
        sb.append(", bodyType=");
        sb.append(this.bodyType);
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
        sb.append(this.callTimeout);
        sb.append(", isProtobuf=");
        sb.append(this.isProtobuf);
        sb.append(", operationType=");
        sb.append(this.operationType);
        sb.append(", downloadDestination=");
        sb.append(this.downloadDestination);
        sb.append(", priority=");
        return OooO0oO.OooOo.OooOOO0(sb, this.priority, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, 0, 0, 0, false, null, null, 0, 130048, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, 0, 0, false, null, null, 0, 129024, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, 0, false, null, null, 0, 126976, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, false, null, null, 0, 122880, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, null, null, 0, 114688, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, null, 0, 98304, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
        OooOo.OooO0o0(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, file, 0, 65536, null);
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
        OooOo.OooO0o0(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map<String, ? extends List<String>> headers, Map<String, String> parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        OooOo.OooO0o0(baseURL, "baseURL");
        OooOo.OooO0o0(path, "path");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(parameters, "parameters");
        OooOo.OooO0o0(bodyType, "bodyType");
        OooOo.OooO0o0(scheme, "scheme");
        OooOo.OooO0o0(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
        this.isProtobuf = z;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, OooOO0O oooOO0O) {
        String str4 = (i6 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i6 & 4) != 0 ? RequestType.GET : requestType;
        Object obj2 = (i6 & 8) != 0 ? null : obj;
        int i7 = i6 & 16;
        Map map3 = o00oO0o.f31247OooOo0O;
        this(str, str4, requestType2, obj2, i7 != 0 ? map3 : map, (i6 & 32) == 0 ? map2 : map3, (i6 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i6 & 128) != 0 ? "https" : str3, (i6 & 256) != 0 ? null : num, (i6 & 512) != 0 ? 30000 : i, (i6 & 1024) != 0 ? 30000 : i2, (i6 & 2048) != 0 ? 30000 : i3, (i6 & 4096) == 0 ? i4 : 30000, (i6 & 8192) != 0 ? false : z, (i6 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i6 & 32768) != 0 ? null : file, (i6 & 65536) != 0 ? 0 : i5);
    }
}
