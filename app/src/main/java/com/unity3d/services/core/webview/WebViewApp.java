package com.unity3d.services.core.webview;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.CallbackStatus;
import com.unity3d.services.core.webview.bridge.IWebViewBridge;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import com.unity3d.services.core.webview.bridge.WebViewBridge;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.metadata.DublinCore;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class WebViewApp implements IWebViewBridgeInvoker {
    private static final int INVOKE_JS_CHARS_LENGTH = 22;
    private static ConditionVariable _conditionVariable;
    private static WebViewApp _currentApp;
    private Configuration _configuration;
    private final HashMap<String, NativeCallback> _nativeCallbacks;
    private boolean _webAppLoaded;
    private WebView _webView;
    protected final IWebViewBridge _webViewBridge;
    private static final AtomicReference<Boolean> _initialized = new AtomicReference<>(Boolean.FALSE);
    private static final AtomicReference<String> _webAppFailureMessage = new AtomicReference<>();
    private static final AtomicReference<Integer> _webAppFailureCode = new AtomicReference<>();

    /* renamed from: com.unity3d.services.core.webview.WebViewApp$1 */
    public class C43551 extends HashMap<String, String> {
        final /* synthetic */ Enum val$eventCategory;
        final /* synthetic */ Enum val$eventId;

        public C43551(Enum r3, Enum r4) {
            this.val$eventCategory = r3;
            this.val$eventId = r4;
            put("src", "handleEvent");
            put("eventCategory", r3.name());
            put("eventId", r4.name());
        }
    }

    /* renamed from: com.unity3d.services.core.webview.WebViewApp$2 */
    public class C43562 extends HashMap<String, String> {
        final /* synthetic */ String val$className;
        final /* synthetic */ String val$methodName;

        public C43562(String str, String str2) {
            this.val$className = str;
            this.val$methodName = str2;
            put("src", "handleInvocation");
            put("className", str);
            put("methodName", str2);
        }
    }

    /* renamed from: com.unity3d.services.core.webview.WebViewApp$3 */
    public class C43573 extends HashMap<String, String> {
        final /* synthetic */ Invocation val$invocation;

        public C43573(Invocation invocation) {
            this.val$invocation = invocation;
            put("src", "handleCallback");
            put("invocation", invocation.toString());
        }
    }

    /* renamed from: com.unity3d.services.core.webview.WebViewApp$4 */
    public class RunnableC43584 implements Runnable {
        public RunnableC43584() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                Configuration configuration = configuration;
                WebViewApp webViewApp = new WebViewApp(configuration, configuration.getExperiments().isWebAssetAdCaching(), configuration.getExperiments().isWebGestureNotRequired());
                webViewApp.getWebView().loadDataWithBaseURL(new WebViewUrlBuilder("file://" + SdkProperties.getLocalWebViewFile(), configuration).getUrlWithQueryString(), configuration.getWebViewData(), "text/html", "UTF-8", null);
                WebViewApp.setCurrentApp(webViewApp);
            } catch (Exception e) {
                DeviceLog.error("Unity Ads SDK unable to create WebViewApp " + e.getMessage());
                WebViewApp._conditionVariable.open();
            }
        }
    }

    /* renamed from: com.unity3d.services.core.webview.WebViewApp$5 */
    public class RunnableC43595 implements Runnable {
        public RunnableC43595() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                Configuration configuration = configuration;
                WebViewApp webViewApp = new WebViewApp(configuration, true, configuration.getExperiments().isWebGestureNotRequired());
                webViewApp.getWebView().loadUrl(new WebViewUrlBuilder(configuration.getWebViewUrl(), configuration).getUrlWithQueryString());
                WebViewApp.setCurrentApp(webViewApp);
            } catch (Exception unused) {
                DeviceLog.error("Unity Ads SDK unable to create WebViewApp");
                WebViewApp._conditionVariable.open();
            }
        }
    }

    public static class WebAppClient extends WebViewClient {

        /* renamed from: com.unity3d.services.core.webview.WebViewApp$WebAppClient$1 */
        public class RunnableC43601 implements Runnable {
            public RunnableC43601() {
            }

            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().finish();
                }
                if (WebViewApp.getCurrentApp() != null && WebViewApp.getCurrentApp().getWebView() != null) {
                    ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
                }
                InitializeThread.reset();
            }
        }

        /* renamed from: com.unity3d.services.core.webview.WebViewApp$WebAppClient$2 */
        public class C43612 extends HashMap<String, String> {
            final /* synthetic */ RenderProcessGoneDetail val$detail;

            public C43612(RenderProcessGoneDetail renderProcessGoneDetail) {
                this.val$detail = renderProcessGoneDetail;
                if (Build.VERSION.SDK_INT >= 26) {
                    put(DublinCore.PREFIX_DC, "" + renderProcessGoneDetail.didCrash());
                    put("pae", "" + renderProcessGoneDetail.rendererPriorityAtExit());
                }
            }
        }

        private WebAppClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            super.onPageFinished(webView, str);
            DeviceLog.debug("Unity Ads SDK finished loading URL inside WebView: " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest != null && webResourceError != null) {
                DeviceLog.error("Unity Ads SDK encountered an error (code: " + webResourceError.getErrorCode() + ")  in WebView while loading a resource " + webResourceRequest.getUrl());
                return;
            }
            if (webResourceRequest == null) {
                DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource");
                return;
            }
            DeviceLog.error("Unity Ads SDK encountered an error in WebView while loading a resource " + webResourceRequest.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.1
                public RunnableC43601() {
                }

                @Override // java.lang.Runnable
                public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                    if (AdUnit.getAdUnitActivity() != null) {
                        AdUnit.getAdUnitActivity().finish();
                    }
                    if (WebViewApp.getCurrentApp() != null && WebViewApp.getCurrentApp().getWebView() != null) {
                        ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
                    }
                    InitializeThread.reset();
                }
            });
            DeviceLog.error("UnityAds SDK WebView render process gone with following reason : " + renderProcessGoneDetail.toString());
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_render_process_gone", null, new HashMap<String, String>(renderProcessGoneDetail) { // from class: com.unity3d.services.core.webview.WebViewApp.WebAppClient.2
                final /* synthetic */ RenderProcessGoneDetail val$detail;

                public C43612(RenderProcessGoneDetail renderProcessGoneDetail2) {
                    this.val$detail = renderProcessGoneDetail2;
                    if (Build.VERSION.SDK_INT >= 26) {
                        put(DublinCore.PREFIX_DC, "" + renderProcessGoneDetail2.didCrash());
                        put("pae", "" + renderProcessGoneDetail2.rendererPriorityAtExit());
                    }
                }
            });
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            DeviceLog.debug("Unity Ads SDK attempts to load URL inside WebView: " + str);
            return false;
        }

        public /* synthetic */ WebAppClient(C43551 c43551) {
            this();
        }
    }

    public /* synthetic */ WebViewApp(Configuration configuration, boolean z, boolean z2, C43551 c43551) {
        this(configuration, z, z2);
    }

    private String buildInvokeJavascript(String str, String str2, JSONArray jSONArray) {
        String string = jSONArray.toString();
        StringBuilder sb = new StringBuilder(string.length() + str2.length() + str.length() + 22);
        sb.append("javascript:window.");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return androidx.datastore.preferences.protobuf.OooO00o.OooOOO0(sb, "(", string, ");");
    }

    public static ErrorState create(Configuration configuration) throws IllegalThreadStateException {
        return create(configuration, false);
    }

    private static ErrorState createWithRemoteUrl(Configuration configuration) {
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.5
            public RunnableC43595() {
            }

            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                try {
                    Configuration configuration2 = configuration;
                    WebViewApp webViewApp = new WebViewApp(configuration2, true, configuration2.getExperiments().isWebGestureNotRequired());
                    webViewApp.getWebView().loadUrl(new WebViewUrlBuilder(configuration.getWebViewUrl(), configuration).getUrlWithQueryString());
                    WebViewApp.setCurrentApp(webViewApp);
                } catch (Exception unused) {
                    DeviceLog.error("Unity Ads SDK unable to create WebViewApp");
                    WebViewApp._conditionVariable.open();
                }
            }
        });
        ConditionVariable conditionVariable = new ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z = false;
        boolean z2 = getCurrentApp() != null;
        if (z2 && getCurrentApp().isWebAppInitialized()) {
            z = true;
        }
        if (zBlock && z2 && z) {
            return null;
        }
        return !zBlock ? ErrorState.CreateWebviewTimeout : getCurrentApp() == null ? ErrorState.CreateWebview : getCurrentApp().getErrorStateFromWebAppCode();
    }

    public static WebViewApp getCurrentApp() {
        return _currentApp;
    }

    private void invokeJavascriptMethod(String str, String str2, JSONArray jSONArray) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strBuildInvokeJavascript = buildInvokeJavascript(str, str2, jSONArray);
        DeviceLog.debug("Invoking javascript: %s", strBuildInvokeJavascript);
        getWebView().evaluateJavascript(strBuildInvokeJavascript, null);
    }

    public static void setCurrentApp(WebViewApp webViewApp) {
        _currentApp = webViewApp;
    }

    public void addCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.put(nativeCallback.getId(), nativeCallback);
        }
    }

    public NativeCallback getCallback(String str) {
        NativeCallback nativeCallback;
        synchronized (this._nativeCallbacks) {
            nativeCallback = this._nativeCallbacks.get(str);
        }
        return nativeCallback;
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public ErrorState getErrorStateFromWebAppCode() {
        int webAppFailureCode = getWebAppFailureCode();
        return webAppFailureCode == 1 ? ErrorState.CreateWebviewGameIdDisabled : webAppFailureCode == 2 ? ErrorState.CreateWebviewConfigError : webAppFailureCode == 3 ? ErrorState.CreateWebviewInvalidArgument : ErrorState.CreateWebview;
    }

    public int getWebAppFailureCode() {
        return _webAppFailureCode.get().intValue();
    }

    public String getWebAppFailureMessage() {
        return _webAppFailureMessage.get();
    }

    public WebView getWebView() {
        return this._webView;
    }

    public boolean invokeCallback(Invocation invocation) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<ArrayList<Object>> responses = invocation.getResponses();
        if (responses != null && !responses.isEmpty()) {
            int size = responses.size();
            int i = 0;
            while (i < size) {
                ArrayList<Object> arrayList = responses.get(i);
                i++;
                ArrayList<Object> arrayList2 = arrayList;
                CallbackStatus callbackStatus = (CallbackStatus) arrayList2.get(0);
                Enum r8 = (Enum) arrayList2.get(1);
                Object[] objArr = (Object[]) arrayList2.get(2);
                String str = (String) objArr[0];
                Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(str);
                arrayList3.add(callbackStatus.toString());
                JSONArray jSONArray2 = new JSONArray();
                if (r8 != null) {
                    jSONArray2.put(r8.name());
                }
                for (Object obj : objArrCopyOfRange) {
                    jSONArray2.put(obj);
                }
                arrayList3.add(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    jSONArray3.put(obj2);
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleCallback", jSONArray);
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while invoking callback to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap<String, String>(invocation) { // from class: com.unity3d.services.core.webview.WebViewApp.3
                final /* synthetic */ Invocation val$invocation;

                public C43573(Invocation invocation2) {
                    this.val$invocation = invocation2;
                    put("src", "handleCallback");
                    put("invocation", invocation2.toString());
                }
            });
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error while invoking batch response for WebView", e);
        }
        return true;
    }

    @Override // com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public boolean invokeMethod(String str, String str2, Method method, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            NativeCallback nativeCallback = new NativeCallback(method);
            addCallback(nativeCallback);
            jSONArray.put(nativeCallback.getId());
        } else {
            jSONArray.put((Object) null);
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                jSONArray.put(obj);
            }
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while handling invocation to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap<String, String>(str, str2) { // from class: com.unity3d.services.core.webview.WebViewApp.2
                final /* synthetic */ String val$className;
                final /* synthetic */ String val$methodName;

                public C43562(String str3, String str22) {
                    this.val$className = str3;
                    this.val$methodName = str22;
                    put("src", "handleInvocation");
                    put("className", str3);
                    put("methodName", str22);
                }
            });
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error invoking javascript method", e);
            return false;
        }
    }

    public boolean isWebAppInitialized() {
        return _initialized.get().booleanValue();
    }

    public boolean isWebAppLoaded() {
        return this._webAppLoaded;
    }

    public void removeCallback(NativeCallback nativeCallback) {
        synchronized (this._nativeCallbacks) {
            this._nativeCallbacks.remove(nativeCallback.getId());
        }
    }

    public void resetWebViewAppInitialization() {
        this._webAppLoaded = false;
        _webAppFailureCode.set(-1);
        _webAppFailureMessage.set("");
        _initialized.set(Boolean.FALSE);
    }

    public boolean sendEvent(Enum r6, Enum r7, Object... objArr) {
        if (!isWebAppLoaded()) {
            DeviceLog.debug("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(r6.name());
        jSONArray.put(r7.name());
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        try {
            invokeJavascriptMethod("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while sending event to WebView");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", null, new HashMap<String, String>(r6, r7) { // from class: com.unity3d.services.core.webview.WebViewApp.1
                final /* synthetic */ Enum val$eventCategory;
                final /* synthetic */ Enum val$eventId;

                public C43551(Enum r62, Enum r72) {
                    this.val$eventCategory = r62;
                    this.val$eventId = r72;
                    put("src", "handleEvent");
                    put("eventCategory", r62.name());
                    put("eventId", r72.name());
                }
            });
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error while sending event to WebView", e);
            return false;
        }
    }

    public void setConfiguration(Configuration configuration) {
        this._configuration = configuration;
    }

    public void setWebAppFailureCode(int i) {
        _webAppFailureCode.set(Integer.valueOf(i));
    }

    public void setWebAppFailureMessage(String str) {
        _webAppFailureMessage.set(str);
    }

    public void setWebAppInitialized(boolean z) {
        _initialized.set(Boolean.valueOf(z));
        _conditionVariable.open();
    }

    public void setWebAppLoaded(boolean z) {
        this._webAppLoaded = z;
    }

    public void setWebView(WebView webView) {
        this._webView = webView;
    }

    private WebViewApp(Configuration configuration, boolean z, boolean z2) {
        this(configuration, z, z2, SharedInstances.INSTANCE.getWebViewBridge());
    }

    public static ErrorState create(Configuration configuration, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.entered();
        if (z) {
            return createWithRemoteUrl(configuration);
        }
        if (Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            throw new IllegalThreadStateException("Cannot call create() from main thread!");
        }
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.core.webview.WebViewApp.4
            public RunnableC43584() {
            }

            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                try {
                    Configuration configuration2 = configuration;
                    WebViewApp webViewApp = new WebViewApp(configuration2, configuration2.getExperiments().isWebAssetAdCaching(), configuration.getExperiments().isWebGestureNotRequired());
                    webViewApp.getWebView().loadDataWithBaseURL(new WebViewUrlBuilder("file://" + SdkProperties.getLocalWebViewFile(), configuration).getUrlWithQueryString(), configuration.getWebViewData(), "text/html", "UTF-8", null);
                    WebViewApp.setCurrentApp(webViewApp);
                } catch (Exception e) {
                    DeviceLog.error("Unity Ads SDK unable to create WebViewApp " + e.getMessage());
                    WebViewApp._conditionVariable.open();
                }
            }
        });
        ConditionVariable conditionVariable = new ConditionVariable();
        _conditionVariable = conditionVariable;
        boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
        boolean z2 = false;
        boolean z3 = getCurrentApp() != null;
        if (z3 && getCurrentApp().isWebAppInitialized()) {
            z2 = true;
        }
        if (zBlock && z3 && z2) {
            return null;
        }
        return !zBlock ? ErrorState.CreateWebviewTimeout : getCurrentApp() == null ? ErrorState.CreateWebview : getCurrentApp().getErrorStateFromWebAppCode();
    }

    private WebViewApp(Configuration configuration, boolean z, boolean z2, IWebViewBridge iWebViewBridge) {
        WebView webView;
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap<>();
        setConfiguration(configuration);
        WebViewBridge.setClassTable(getConfiguration().getWebAppApiClassList());
        IExperiments experiments = configuration.getExperiments();
        this._webViewBridge = iWebViewBridge;
        if (z) {
            webView = new WebViewWithCache(ClientProperties.getApplicationContext(), z2, experiments);
        } else {
            Context applicationContext = ClientProperties.getApplicationContext();
            SharedInstances sharedInstances = SharedInstances.INSTANCE;
            webView = new WebView(applicationContext, z2, sharedInstances.getWebViewBridge(), sharedInstances.getWebViewAppInvocationCallbackInvoker(), experiments);
        }
        this._webView = webView;
        webView.setWebViewClient(new WebAppClient());
    }

    public WebViewApp() {
        this._webAppLoaded = false;
        this._nativeCallbacks = new HashMap<>();
        WebViewBridge.setClassTable(new Class[0]);
        this._webViewBridge = SharedInstances.INSTANCE.getWebViewBridge();
        _conditionVariable = new ConditionVariable();
    }
}
