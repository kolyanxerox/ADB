package com.applovin.shadow.okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: com.applovin.shadow.okhttp3.EventListener$Companion$NONE$1
    };

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        private Companion() {
        }
    }

    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response cachedResponse) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(cachedResponse, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(response, "response");
    }

    public void cacheMiss(Call call) {
        OooOo.OooO0o0(call, "call");
    }

    public void callEnd(Call call) {
        OooOo.OooO0o0(call, "call");
    }

    public void callFailed(Call call, IOException ioe) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(ioe, "ioe");
    }

    public void callStart(Call call) {
        OooOo.OooO0o0(call, "call");
    }

    public void canceled(Call call) {
        OooOo.OooO0o0(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(inetSocketAddress, "inetSocketAddress");
        OooOo.OooO0o0(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException ioe) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(inetSocketAddress, "inetSocketAddress");
        OooOo.OooO0o0(proxy, "proxy");
        OooOo.OooO0o0(ioe, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(inetSocketAddress, "inetSocketAddress");
        OooOo.OooO0o0(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(connection, "connection");
    }

    public void dnsEnd(Call call, String domainName, List<InetAddress> inetAddressList) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(domainName, "domainName");
        OooOo.OooO0o0(inetAddressList, "inetAddressList");
    }

    public void dnsStart(Call call, String domainName) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(domainName, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl url, List<Proxy> proxies) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(url, "url");
        OooOo.OooO0o0(proxies, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl url) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(url, "url");
    }

    public void requestBodyEnd(Call call, long j) {
        OooOo.OooO0o0(call, "call");
    }

    public void requestBodyStart(Call call) {
        OooOo.OooO0o0(call, "call");
    }

    public void requestFailed(Call call, IOException ioe) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(ioe, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(request, "request");
    }

    public void requestHeadersStart(Call call) {
        OooOo.OooO0o0(call, "call");
    }

    public void responseBodyEnd(Call call, long j) {
        OooOo.OooO0o0(call, "call");
    }

    public void responseBodyStart(Call call) {
        OooOo.OooO0o0(call, "call");
    }

    public void responseFailed(Call call, IOException ioe) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(ioe, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(response, "response");
    }

    public void responseHeadersStart(Call call) {
        OooOo.OooO0o0(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        OooOo.OooO0o0(call, "call");
        OooOo.OooO0o0(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        OooOo.OooO0o0(call, "call");
    }

    public void secureConnectStart(Call call) {
        OooOo.OooO0o0(call, "call");
    }
}
