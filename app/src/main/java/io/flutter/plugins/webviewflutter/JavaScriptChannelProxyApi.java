package io.flutter.plugins.webviewflutter;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class JavaScriptChannelProxyApi extends PigeonApiJavaScriptChannel {
    public JavaScriptChannelProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel
    @NonNull
    public JavaScriptChannel pigeon_defaultConstructor(@NonNull String str) {
        return new JavaScriptChannel(str, this);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiJavaScriptChannel
    @NonNull
    public ProxyApiRegistrar getPigeonRegistrar() {
        return (ProxyApiRegistrar) super.getPigeonRegistrar();
    }
}
