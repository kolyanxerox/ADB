package io.flutter.plugins.webviewflutter;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class JavaScriptChannel {
    private final JavaScriptChannelProxyApi api;
    final String javaScriptChannelName;

    public JavaScriptChannel(@NonNull String str, @NonNull JavaScriptChannelProxyApi javaScriptChannelProxyApi) {
        this.javaScriptChannelName = str;
        this.api = javaScriptChannelProxyApi;
    }

    public static /* synthetic */ oo00o.OooOo lambda$postMessage$0(oo00o.OooOOO0 oooOOO0) {
        return null;
    }

    public /* synthetic */ void lambda$postMessage$1(String str) {
        this.api.postMessage(this, str, new OooOO0(3));
    }

    @JavascriptInterface
    public void postMessage(@NonNull String str) {
        this.api.getPigeonRegistrar().runOnMainThread(new OooOOOO(0, this, str));
    }
}
