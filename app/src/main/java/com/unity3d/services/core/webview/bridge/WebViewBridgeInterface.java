package com.unity3d.services.core.webview.bridge;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import com.ironsource.C3007ch;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import io.flutter.plugins.firebase.analytics.Constants;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0oO.o000000;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class WebViewBridgeInterface {
    private final IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker;
    private final IWebViewBridge webViewBridge;

    public WebViewBridgeInterface() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @JavascriptInterface
    public final void handleCallback(String callbackId, String callbackStatus, String rawParameters) throws Exception {
        OooOo.OooO0o0(callbackId, "callbackId");
        OooOo.OooO0o0(callbackStatus, "callbackStatus");
        OooOo.OooO0o0(rawParameters, "rawParameters");
        DeviceLog.debug("handleCallback " + callbackId + ' ' + callbackStatus + ' ' + rawParameters);
        this.webViewBridge.handleCallback(callbackId, callbackStatus, JSONArrayExtensionsKt.toTypedArray(new JSONArray(rawParameters)));
    }

    @JavascriptInterface
    public final void handleInvocation(String data) throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo.OooO0o0(data, "data");
        DeviceLog.debug("handleInvocation ".concat(data));
        JSONArray jSONArray = new JSONArray(data);
        Invocation invocation = new Invocation(this.webViewAppInvocationCallbackInvoker, this.webViewBridge);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            OooOo.OooO0OO(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            OooOo.OooO0OO(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = jSONArray2.get(1);
            OooOo.OooO0OO(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = jSONArray2.get(2);
            OooOo.OooO0OO(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj5 = jSONArray2.get(3);
            OooOo.OooO0OO(obj5, "null cannot be cast to non-null type kotlin.String");
            invocation.addInvocation((String) obj2, (String) obj3, JSONArrayExtensionsKt.toTypedArray((JSONArray) obj4), new WebViewCallback((String) obj5, invocation.getId()));
            invocation.nextInvocation();
        }
        invocation.sendInvocationCallback();
    }

    public final void onHandleCallback(WebView view, WebMessageCompat message, Uri sourceOrigin, boolean z, JavaScriptReplyProxy replyProxy) throws Exception {
        OooOo.OooO0o0(view, "view");
        OooOo.OooO0o0(message, "message");
        OooOo.OooO0o0(sourceOrigin, "sourceOrigin");
        OooOo.OooO0o0(replyProxy, "replyProxy");
        String data = message.getData();
        if (!z || data == null || o000000.OoooOO0(data)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(data);
        String callbackId = jSONObject.getString(C3007ch.f7763x);
        String callbackStatus = jSONObject.getString("status");
        String rawParameters = jSONObject.getString(Constants.PARAMETERS);
        OooOo.OooO0Oo(callbackId, "callbackId");
        OooOo.OooO0Oo(callbackStatus, "callbackStatus");
        OooOo.OooO0Oo(rawParameters, "rawParameters");
        handleCallback(callbackId, callbackStatus, rawParameters);
    }

    public final void onHandleInvocation(WebView view, WebMessageCompat message, Uri sourceOrigin, boolean z, JavaScriptReplyProxy replyProxy) throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo.OooO0o0(view, "view");
        OooOo.OooO0o0(message, "message");
        OooOo.OooO0o0(sourceOrigin, "sourceOrigin");
        OooOo.OooO0o0(replyProxy, "replyProxy");
        String data = message.getData();
        if (!z || data == null || o000000.OoooOO0(data)) {
            return;
        }
        handleInvocation(data);
    }

    public WebViewBridgeInterface(IWebViewBridge webViewBridge, IInvocationCallbackInvoker webViewAppInvocationCallbackInvoker) {
        OooOo.OooO0o0(webViewBridge, "webViewBridge");
        OooOo.OooO0o0(webViewAppInvocationCallbackInvoker, "webViewAppInvocationCallbackInvoker");
        this.webViewBridge = webViewBridge;
        this.webViewAppInvocationCallbackInvoker = webViewAppInvocationCallbackInvoker;
    }

    public /* synthetic */ WebViewBridgeInterface(IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, int i, OooOO0O oooOO0O) {
        this((i & 1) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i & 2) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker);
    }
}
