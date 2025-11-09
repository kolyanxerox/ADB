package com.unity3d.services.core.network.mapper;

import OooOOo0.o0OOO0o;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.OooOo;
import o000Ooo.o00oO0o;
import o00O0.OooOo00;
import o00O0oO.o000000;
import o00OOO0.o000oOoO;
import o00OOO0.o00Oo0;
import o00OOO0.o0O0O00;
import o00OOO0.o0OO00O;

/* loaded from: classes3.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final o0O0O00 generateOkHttpBody(Object obj) {
        return obj instanceof byte[] ? o0O0O00.OooO0O0(o00Oo0.OooO0O0("text/plain;charset=utf-8"), (byte[]) obj) : obj instanceof String ? o0O0O00.OooO00o(o00Oo0.OooO0O0("text/plain;charset=utf-8"), (String) obj) : o0O0O00.OooO00o(o00Oo0.OooO0O0("text/plain;charset=utf-8"), "");
    }

    private static final o000oOoO generateOkHttpHeaders(HttpRequest httpRequest) {
        o00oO0o o00oo0o = new o00oO0o(15);
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            String strOooOooo = OooOo00.OooOooo(entry.getValue(), ",", null, null, null, 62);
            o000oOoO.OooO00o(key);
            o000oOoO.OooO0O0(strOooOooo, key);
            o00oo0o.OooO0OO(key, strOooOooo);
        }
        return new o000oOoO(o00oo0o);
    }

    private static final o0O0O00 generateOkHttpProtobufBody(Object obj) {
        return obj instanceof byte[] ? o0O0O00.OooO0O0(o00Oo0.OooO0O0(CommonGatewayClient.HEADER_PROTOBUF), (byte[]) obj) : obj instanceof String ? o0O0O00.OooO00o(o00Oo0.OooO0O0(CommonGatewayClient.HEADER_PROTOBUF), (String) obj) : o0O0O00.OooO00o(o00Oo0.OooO0O0(CommonGatewayClient.HEADER_PROTOBUF), "");
    }

    public static final o0OO00O toOkHttpProtoRequest(HttpRequest httpRequest) {
        OooOo.OooO0o0(httpRequest, "<this>");
        o0OOO0o o0ooo0o = new o0OOO0o(19);
        o0ooo0o.OooOo00(o000000.OoooOoO(o000000.Ooooooo(httpRequest.getBaseURL(), '/') + '/' + o000000.Ooooooo(httpRequest.getPath(), '/'), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        o0ooo0o.OooOO0o(string, body != null ? generateOkHttpProtobufBody(body) : null);
        o0ooo0o.f13520OooOoO0 = generateOkHttpHeaders(httpRequest).OooO0o0();
        return o0ooo0o.OooO0OO();
    }

    public static final o0OO00O toOkHttpRequest(HttpRequest httpRequest) {
        OooOo.OooO0o0(httpRequest, "<this>");
        o0OOO0o o0ooo0o = new o0OOO0o(19);
        o0ooo0o.OooOo00(o000000.OoooOoO(o000000.Ooooooo(httpRequest.getBaseURL(), '/') + '/' + o000000.Ooooooo(httpRequest.getPath(), '/'), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        o0ooo0o.OooOO0o(string, body != null ? generateOkHttpBody(body) : null);
        o0ooo0o.f13520OooOoO0 = generateOkHttpHeaders(httpRequest).OooO0o0();
        return o0ooo0o.OooO0OO();
    }
}
