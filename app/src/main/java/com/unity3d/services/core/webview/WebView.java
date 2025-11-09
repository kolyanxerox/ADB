package com.unity3d.services.core.webview;

import OooO0oo.o00Oo0;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.ProxyConfig;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.internal.measurement.o0OOO0;
import com.ironsource.o0000O0O;
import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.p012di.IServiceComponent;
import com.unity3d.services.core.p012di.IServiceProvider;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IInvocationCallbackInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInterface;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.OooOo;
import o00O0.o000OOo;
import o00O0oO.o000000O;
import oo00o.OooO0OO;
import oo00o.OooO0o;
import oo00o.OooOO0O;

/* loaded from: classes3.dex */
public class WebView extends android.webkit.WebView implements IServiceComponent {
    private final OooO0OO sdkMetricsSender$delegate;
    private final WebViewBridgeInterface webViewBridgeInterface;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context) {
        this(context, false, null, null, null, 30, null);
        OooOo.OooO0o0(context, "context");
    }

    private final void applySafeAreaInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(this, new o00Oo0(this, 14));
    }

    public static final WindowInsetsCompat applySafeAreaInsets$lambda$3(WebView this$0, View v, WindowInsetsCompat insets) {
        Object objOooO0O0;
        OooOo.OooO0o0(this$0, "this$0");
        OooOo.OooO0o0(v, "v");
        OooOo.OooO0o0(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        OooOo.OooO0Oo(insets2, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.displayCutout());
        OooOo.OooO0Oo(insets3, "insets.getInsets(WindowI…pat.Type.displayCutout())");
        try {
            objOooO0O0 = Float.valueOf(this$0.getContext().getResources().getDisplayMetrics().density);
        } catch (Throwable th) {
            objOooO0O0 = o000OOo.OooO0O0(th);
        }
        Object objValueOf = Float.valueOf(1.0f);
        if (objOooO0O0 instanceof OooOO0O) {
            objOooO0O0 = objValueOf;
        }
        float fFloatValue = ((Number) objOooO0O0).floatValue();
        int iApplySafeAreaInsets$lambda$3$toPx = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.left, insets3.left), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx2 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.top, insets3.top), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx3 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.right, insets3.right), fFloatValue);
        int iApplySafeAreaInsets$lambda$3$toPx4 = applySafeAreaInsets$lambda$3$toPx(Math.max(insets2.bottom, insets3.bottom), fFloatValue);
        StringBuilder sbOooOo0o = OooO0oO.OooOo.OooOo0o("\n                (function() {\n                    const root = document.documentElement;\n                    root.style.setProperty('--safe-area-inset-left', '", iApplySafeAreaInsets$lambda$3$toPx, "px');\n                    root.style.setProperty('--safe-area-inset-right', '", iApplySafeAreaInsets$lambda$3$toPx3, "px');\n                    root.style.setProperty('--safe-area-inset-top', '");
        sbOooOo0o.append(iApplySafeAreaInsets$lambda$3$toPx2);
        sbOooOo0o.append("px');\n                    root.style.setProperty('--safe-area-inset-bottom', '");
        sbOooOo0o.append(iApplySafeAreaInsets$lambda$3$toPx4);
        sbOooOo0o.append("px');\n                })();\n            ");
        this$0.evaluateJavascript(o000000O.OooOoO0(sbOooOo0o.toString()), null);
        return insets;
    }

    private static final int applySafeAreaInsets$lambda$3$toPx(int i, float f) {
        return (int) (i / f);
    }

    public static final void evaluateJavascript$lambda$1(WebView this$0, String script, ValueCallback valueCallback) {
        OooOo.OooO0o0(this$0, "this$0");
        OooOo.OooO0o0(script, "$script");
        super.evaluateJavascript(script, valueCallback);
    }

    private final SDKMetricsSender getSdkMetricsSender() {
        return (SDKMetricsSender) this.sdkMetricsSender$delegate.getValue();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String script, ValueCallback<String> valueCallback) {
        OooOo.OooO0o0(script, "script");
        Utilities.runOnUiThread(new o0000O0O(this, script, valueCallback, 3));
    }

    @Override // com.unity3d.services.core.p012di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String url) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo.OooO0o0(url, "url");
        DeviceLog.debug("Loading url: ".concat(url));
        super.loadUrl(url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z) {
        this(context, z, null, null, null, 28, null);
        OooOo.OooO0o0(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z, IWebViewBridge webViewBridge) {
        this(context, z, webViewBridge, null, null, 24, null);
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(webViewBridge, "webViewBridge");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker) {
        this(context, z, webViewBridge, callbackInvoker, null, 16, null);
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(webViewBridge, "webViewBridge");
        OooOo.OooO0o0(callbackInvoker, "callbackInvoker");
    }

    public /* synthetic */ WebView(Context context, boolean z, IWebViewBridge iWebViewBridge, IInvocationCallbackInvoker iInvocationCallbackInvoker, IExperiments iExperiments, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this(context, (i & 2) != 0 ? false : z, (i & 4) != 0 ? SharedInstances.INSTANCE.getWebViewBridge() : iWebViewBridge, (i & 8) != 0 ? SharedInstances.INSTANCE.getWebViewAppInvocationCallbackInvoker() : iInvocationCallbackInvoker, (i & 16) != 0 ? new Experiments() : iExperiments);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebView(Context context, boolean z, IWebViewBridge webViewBridge, IInvocationCallbackInvoker callbackInvoker, IExperiments experiments) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super(context);
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(webViewBridge, "webViewBridge");
        OooOo.OooO0o0(callbackInvoker, "callbackInvoker");
        OooOo.OooO0o0(experiments, "experiments");
        this.sdkMetricsSender$delegate = o0OOO0.OooO0oO(OooO0o.f33184OooOo0o, new WebView$special$$inlined$inject$default$1(this, ""));
        final WebViewBridgeInterface webViewBridgeInterface = new WebViewBridgeInterface(webViewBridge, callbackInvoker);
        this.webViewBridgeInterface = webViewBridgeInterface;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(1);
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(!z);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        boolean zIsWebMessageEnabled = experiments.isWebMessageEnabled();
        if (zIsWebMessageEnabled) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerEnabledMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerDisabledMetric());
        }
        boolean zIsFeatureSupported = WebViewFeature.isFeatureSupported(WebViewFeature.WEB_MESSAGE_LISTENER);
        if (zIsFeatureSupported) {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerSupportedMetric());
        } else {
            getSdkMetricsSender().sendMetric(WebViewMetricKt.webMessageListenerUnsupportedMetric());
        }
        if (zIsWebMessageEnabled && zIsFeatureSupported) {
            Set setSingleton = Collections.singleton(ProxyConfig.MATCH_ALL_SCHEMES);
            OooOo.OooO0Oo(setSingleton, "singleton(...)");
            final int i = 0;
            WebViewCompat.addWebMessageListener(this, "handleInvocation", setSingleton, new WebViewCompat.WebMessageListener() { // from class: com.unity3d.services.core.webview.OooO00o
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public final void onPostMessage(android.webkit.WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy) throws Exception {
                    switch (i) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, webMessageCompat, uri, z2, javaScriptReplyProxy);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, webMessageCompat, uri, z2, javaScriptReplyProxy);
                            break;
                    }
                }
            });
            Set setSingleton2 = Collections.singleton(ProxyConfig.MATCH_ALL_SCHEMES);
            OooOo.OooO0Oo(setSingleton2, "singleton(...)");
            final int i2 = 1;
            WebViewCompat.addWebMessageListener(this, "handleCallback", setSingleton2, new WebViewCompat.WebMessageListener() { // from class: com.unity3d.services.core.webview.OooO00o
                @Override // androidx.webkit.WebViewCompat.WebMessageListener
                public final void onPostMessage(android.webkit.WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z2, JavaScriptReplyProxy javaScriptReplyProxy) throws Exception {
                    switch (i2) {
                        case 0:
                            webViewBridgeInterface.onHandleInvocation(webView, webMessageCompat, uri, z2, javaScriptReplyProxy);
                            break;
                        default:
                            webViewBridgeInterface.onHandleCallback(webView, webMessageCompat, uri, z2, javaScriptReplyProxy);
                            break;
                    }
                }
            });
        } else {
            addJavascriptInterface(webViewBridgeInterface, "webviewbridge");
        }
        applySafeAreaInsets();
    }
}
