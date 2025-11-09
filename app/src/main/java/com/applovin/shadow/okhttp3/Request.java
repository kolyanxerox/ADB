package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.HttpMethod;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o00O0.o0O0O00;
import o00O0oO.o0000O00;
import oo00o.OooOO0;

/* loaded from: classes.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i & 1) != 0) {
                requestBody = Util.EMPTY_REQUEST;
            }
            return builder.delete(requestBody);
        }

        public Builder addHeader(String name, String value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            this.headers.add(name, value);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null");
        }

        public Builder cacheControl(CacheControl cacheControl) {
            OooOo.OooO0o0(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? removeHeader("Cache-Control") : header("Cache-Control", string);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method("GET", null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String name, String value) {
            OooOo.OooO0o0(name, "name");
            OooOo.OooO0o0(value, "value");
            this.headers.set(name, value);
            return this;
        }

        public Builder headers(Headers headers) {
            OooOo.OooO0o0(headers, "headers");
            this.headers = headers.newBuilder();
            return this;
        }

        public Builder method(String method, RequestBody requestBody) {
            OooOo.OooO0o0(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                if (HttpMethod.requiresRequestBody(method)) {
                    throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0O("method ", method, " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(OooO0oO.OooOo.OooOO0O("method ", method, " must not have a request body.").toString());
            }
            this.method = method;
            this.body = requestBody;
            return this;
        }

        public Builder patch(RequestBody body) {
            OooOo.OooO0o0(body, "body");
            return method("PATCH", body);
        }

        public Builder post(RequestBody body) {
            OooOo.OooO0o0(body, "body");
            return method("POST", body);
        }

        public Builder put(RequestBody body) {
            OooOo.OooO0o0(body, "body");
            return method("PUT", body);
        }

        public Builder removeHeader(String name) {
            OooOo.OooO0o0(name, "name");
            this.headers.removeAll(name);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            OooOo.OooO0o0(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            OooOo.OooO0o0(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            OooOo.OooO0o0(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl url) {
            OooOo.OooO0o0(url, "url");
            this.url = url;
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public <T> Builder tag(Class<? super T> type, T t) {
            OooOo.OooO0o0(type, "type");
            if (t == null) {
                this.tags.remove(type);
                return this;
            }
            if (this.tags.isEmpty()) {
                this.tags = new LinkedHashMap();
            }
            Map<Class<?>, Object> map = this.tags;
            T tCast = type.cast(t);
            OooOo.OooO0O0(tCast);
            map.put(type, tCast);
            return this;
        }

        public Builder url(String url) {
            OooOo.OooO0o0(url, "url");
            if (o0000O00.Oooo0OO(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                OooOo.OooO0Oo(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = "http:".concat(strSubstring);
            } else if (o0000O00.Oooo0OO(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                OooOo.OooO0Oo(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = "https:".concat(strSubstring2);
            }
            return url(HttpUrl.Companion.get(url));
        }

        public Builder(Request request) {
            LinkedHashMap linkedHashMapOooOoO0;
            OooOo.OooO0o0(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                linkedHashMapOooOoO0 = new LinkedHashMap();
            } else {
                linkedHashMapOooOoO0 = o0O0O00.OooOoO0(request.getTags$okhttp());
            }
            this.tags = linkedHashMapOooOoO0;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url) {
            OooOo.OooO0o0(url, "url");
            HttpUrl.Companion companion = HttpUrl.Companion;
            String string = url.toString();
            OooOo.OooO0Oo(string, "url.toString()");
            return url(companion.get(string));
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> tags) {
        OooOo.OooO0o0(url, "url");
        OooOo.OooO0o0(method, "method");
        OooOo.OooO0o0(headers, "headers");
        OooOo.OooO0o0(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = requestBody;
        this.tags = tags;
    }

    /* renamed from: -deprecated_body */
    public final RequestBody m13653deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl */
    public final CacheControl m13654deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_headers */
    public final Headers m13655deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_method */
    public final String m13656deprecated_method() {
        return this.method;
    }

    /* renamed from: -deprecated_url */
    public final HttpUrl m13657deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.Companion.parse(this.headers);
        this.lazyCacheControl = cacheControl2;
        return cacheControl2;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String name) {
        OooOo.OooO0o0(name, "name");
        return this.headers.get(name);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.method);
        sb.append(", url=");
        sb.append(this.url);
        if (this.headers.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (OooOO0 oooOO0 : this.headers) {
                int i2 = i + 1;
                if (i < 0) {
                    o00O0.OooOo.OooOo00();
                    throw null;
                }
                OooOO0 oooOO02 = oooOO0;
                String str = (String) oooOO02.f33185OooOo0O;
                String str2 = (String) oooOO02.f33186OooOo0o;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        return OooO0oO.OooOo.OooO0Oo('}', "StringBuilder().apply(builderAction).toString()", sb);
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String name) {
        OooOo.OooO0o0(name, "name");
        return this.headers.values(name);
    }

    public final <T> T tag(Class<? extends T> type) {
        OooOo.OooO0o0(type, "type");
        return type.cast(this.tags.get(type));
    }
}
