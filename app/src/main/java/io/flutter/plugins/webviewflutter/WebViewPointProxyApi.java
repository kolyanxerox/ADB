package io.flutter.plugins.webviewflutter;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class WebViewPointProxyApi extends PigeonApiWebViewPoint {
    public WebViewPointProxyApi(@NonNull ProxyApiRegistrar proxyApiRegistrar) {
        super(proxyApiRegistrar);
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewPoint
    /* renamed from: x */
    public long mo13469x(@NonNull WebViewPoint webViewPoint) {
        return webViewPoint.getX();
    }

    @Override // io.flutter.plugins.webviewflutter.PigeonApiWebViewPoint
    /* renamed from: y */
    public long mo13470y(@NonNull WebViewPoint webViewPoint) {
        return webViewPoint.getY();
    }
}
