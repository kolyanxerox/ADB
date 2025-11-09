package com.unity3d.services.core.network.model;

import androidx.datastore.preferences.protobuf.OooO00o;
import com.applovin.shadow.okhttp3.internal.p007ws.WebSocketProtocol;
import com.ironsource.InterfaceC3173h3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;

/* loaded from: classes3.dex */
public final class HttpResponse {
    private final Object body;
    private final String client;
    private final long contentSize;
    private final Map<String, List<String>> headers;
    private final String protocol;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, null, null, 0L, WebSocketProtocol.PAYLOAD_SHORT, null);
        OooOo.OooO0o0(body, "body");
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, Object obj2) {
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
        if ((i2 & 16) != 0) {
            str2 = httpResponse.protocol;
        }
        if ((i2 & 32) != 0) {
            str3 = httpResponse.client;
        }
        if ((i2 & 64) != 0) {
            j = httpResponse.contentSize;
        }
        long j2 = j;
        String str4 = str2;
        String str5 = str3;
        return httpResponse.copy(obj, i, map, str, str4, str5, j2);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final String component5() {
        return this.protocol;
    }

    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    public final HttpResponse copy(Object body, int i, Map<String, ? extends List<String>> headers, String urlString, String protocol, String client, long j) {
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(urlString, "urlString");
        OooOo.OooO0o0(protocol, "protocol");
        OooOo.OooO0o0(client, "client");
        return new HttpResponse(body, i, headers, urlString, protocol, client, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return OooOo.OooO00o(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && OooOo.OooO00o(this.headers, httpResponse.headers) && OooOo.OooO00o(this.urlString, httpResponse.urlString) && OooOo.OooO00o(this.protocol, httpResponse.protocol) && OooOo.OooO00o(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    public final Object getBody() {
        return this.body;
    }

    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return Long.hashCode(this.contentSize) + OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0((this.headers.hashCode() + OooO00o.OooO00o(this.statusCode, this.body.hashCode() * 31, 31)) * 31, 31, this.urlString), 31, this.protocol), 31, this.client);
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i) {
        this(body, i, null, null, null, null, 0L, 124, null);
        OooOo.OooO0o0(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map<String, ? extends List<String>> headers) {
        this(body, i, headers, null, null, null, 0L, 120, null);
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map<String, ? extends List<String>> headers, String urlString) {
        this(body, i, headers, urlString, null, null, 0L, InterfaceC3173h3.d.b.f8827j, null);
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(urlString, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map<String, ? extends List<String>> headers, String urlString, String protocol) {
        this(body, i, headers, urlString, protocol, null, 0L, 96, null);
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(urlString, "urlString");
        OooOo.OooO0o0(protocol, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map<String, ? extends List<String>> headers, String urlString, String protocol, String client) {
        this(body, i, headers, urlString, protocol, client, 0L, 64, null);
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(urlString, "urlString");
        OooOo.OooO0o0(protocol, "protocol");
        OooOo.OooO0o0(client, "client");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpResponse(Object body, int i, Map<String, ? extends List<String>> headers, String urlString, String protocol, String client, long j) {
        OooOo.OooO0o0(body, "body");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(urlString, "urlString");
        OooOo.OooO0o0(protocol, "protocol");
        OooOo.OooO0o0(client, "client");
        this.body = body;
        this.statusCode = i;
        this.headers = headers;
        this.urlString = urlString;
        this.protocol = protocol;
        this.client = client;
        this.contentSize = j;
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, OooOO0O oooOO0O) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? o00oO0o.f31247OooOo0O : map, (i2 & 8) != 0 ? "" : str, (i2 & 16) == 0 ? str2 : "", (i2 & 32) != 0 ? "unknown" : str3, (i2 & 64) != 0 ? -1L : j);
    }
}
