package com.applovin.shadow.okhttp3.internal.http;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String method) {
        OooOo.OooO0o0(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String method) {
        OooOo.OooO0o0(method, "method");
        return method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT");
    }

    public final boolean invalidatesCache(String method) {
        OooOo.OooO0o0(method, "method");
        return method.equals("POST") || method.equals("PATCH") || method.equals("PUT") || method.equals("DELETE") || method.equals("MOVE");
    }

    public final boolean redirectsToGet(String method) {
        OooOo.OooO0o0(method, "method");
        return !method.equals("PROPFIND");
    }

    public final boolean redirectsWithBody(String method) {
        OooOo.OooO0o0(method, "method");
        return method.equals("PROPFIND");
    }
}
