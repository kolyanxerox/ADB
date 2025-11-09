package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okhttp3.Cache;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String line) {
        OooOo.OooO0o0(builder, "builder");
        OooOo.OooO0o0(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sslSocket, boolean z) {
        OooOo.OooO0o0(connectionSpec, "connectionSpec");
        OooOo.OooO0o0(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        OooOo.OooO0o0(cache, "cache");
        OooOo.OooO0o0(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z) {
        OooOo.OooO0o0(cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    public static final Cookie parseCookie(long j, HttpUrl url, String setCookie) {
        OooOo.OooO0o0(url, "url");
        OooOo.OooO0o0(setCookie, "setCookie");
        return Cookie.Companion.parse$okhttp(j, url, setCookie);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String name, String value) {
        OooOo.OooO0o0(builder, "builder");
        OooOo.OooO0o0(name, "name");
        OooOo.OooO0o0(value, "value");
        return builder.addLenient$okhttp(name, value);
    }
}
