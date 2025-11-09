package com.unity3d.ads.network.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;

/* loaded from: classes3.dex */
public final class HttpResponse {
    private final Object body;
    private final Map<String, Object> headers;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, 14, null);
        OooOo.OooO0o0(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.statusCode;
        }
        if ((i2 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i2 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i, map, str);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, Object> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final HttpResponse copy(Object body, int i, Map<String, ? extends Object> headers, String urlString) {
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(urlString, "urlString");
        return new HttpResponse(body, i, headers, urlString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return OooOo.OooO00o(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && OooOo.OooO00o(this.headers, httpResponse.headers) && OooOo.OooO00o(this.urlString, httpResponse.urlString);
    }

    public final Object getBody() {
        return this.body;
    }

    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return this.urlString.hashCode() + ((this.headers.hashCode() + OooO00o.OooO00o(this.statusCode, this.body.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(body=");
        sb.append(this.body);
        sb.append(", statusCode=");
        sb.append(this.statusCode);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", urlString=");
        return OooO00o.OooO0oO(')', this.urlString, sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i) {
        this(body, i, null, null, 12, null);
        OooOo.OooO0o0(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map<String, ? extends Object> headers) {
        this(body, i, headers, null, 8, null);
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
    }

    public HttpResponse(Object body, int i, Map<String, ? extends Object> headers, String urlString) {
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(urlString, "urlString");
        this.body = body;
        this.statusCode = i;
        this.headers = headers;
        this.urlString = urlString;
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, int i2, OooOO0O oooOO0O) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? o00oO0o.f31247OooOo0O : map, (i2 & 8) != 0 ? "" : str);
    }
}
