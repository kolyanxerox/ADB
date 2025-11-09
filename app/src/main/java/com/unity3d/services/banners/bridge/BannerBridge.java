package com.unity3d.services.banners.bridge;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.operation.load.LoadBannerModule;
import com.unity3d.services.ads.operation.load.LoadBannerOperationState;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BannerBridge {

    /* renamed from: com.unity3d.services.banners.bridge.BannerBridge$1 */
    public class C42881 extends HashMap<String, String> {
        final /* synthetic */ boolean val$isHB;

        public C42881(boolean z) {
            this.val$isHB = z;
            put("is_header_bidding", String.valueOf(z));
        }
    }

    /* renamed from: com.unity3d.services.banners.bridge.BannerBridge$2 */
    public class C42892 implements IUnityAdsLoadListener {
        final /* synthetic */ String val$bannerAdId;
        final /* synthetic */ BannerView val$bannerAdView;
        final /* synthetic */ boolean val$isAlternativeFlow;
        final /* synthetic */ UnityAdsLoadOptions val$loadOptions;
        final /* synthetic */ SDKMetricsSender val$sdkMetricsSender;
        final /* synthetic */ Map val$tags;

        /* renamed from: com.unity3d.services.banners.bridge.BannerBridge$2$1 */
        public class AnonymousClass1 implements Listeners {
            public AnonymousClass1() {
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onClick(String str) {
                C42892 c42892 = C42892.this;
                BannerView.IListener iListener = iListener;
                if (iListener != null) {
                    iListener.onBannerClick(bannerView);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onLeftApplication(String str) {
                C42892 c42892 = C42892.this;
                BannerView.IListener iListener = iListener;
                if (iListener != null) {
                    iListener.onBannerLeftApplication(bannerView);
                }
            }

            @Override // com.unity3d.ads.core.data.model.Listeners
            public void onStart(String str) {
                C42892 c42892 = C42892.this;
                BannerView.IListener iListener = iListener;
                if (iListener != null) {
                    iListener.onBannerShown(bannerView);
                }
            }
        }

        public C42892(SDKMetricsSender sDKMetricsSender, Map map, boolean z, BannerView bannerView, UnityAdsLoadOptions unityAdsLoadOptions, String str) {
            sDKMetricsSender = sDKMetricsSender;
            map = map;
            z = z;
            bannerView = bannerView;
            unityAdsLoadOptions = unityAdsLoadOptions;
            str = str;
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (iListener == null) {
                sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_loaded_not_found", null, map));
            }
            if (z) {
                BannerView.IListener iListener = iListener;
                if (iListener != null) {
                    iListener.onBannerLoaded(bannerView);
                }
                UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                unityAdsShowOptions.setObjectId(unityAdsLoadOptions.getObjectId());
                new UnityAdsSDK().show(ClientProperties.getActivity(), str, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.services.banners.bridge.BannerBridge.2.1
                    public AnonymousClass1() {
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onClick(String str2) {
                        C42892 c42892 = C42892.this;
                        BannerView.IListener iListener2 = iListener;
                        if (iListener2 != null) {
                            iListener2.onBannerClick(bannerView);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onComplete(String str2, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onError(String str2, UnityAds.UnityAdsShowError unityAdsShowError, String str22) {
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onLeftApplication(String str2) {
                        C42892 c42892 = C42892.this;
                        BannerView.IListener iListener2 = iListener;
                        if (iListener2 != null) {
                            iListener2.onBannerLeftApplication(bannerView);
                        }
                    }

                    @Override // com.unity3d.ads.core.data.model.Listeners
                    public void onStart(String str2) {
                        C42892 c42892 = C42892.this;
                        BannerView.IListener iListener2 = iListener;
                        if (iListener2 != null) {
                            iListener2.onBannerShown(bannerView);
                        }
                    }
                });
            }
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            BannerView bannerView = BannerViewCache.getInstance().getBannerView(str);
            if (bannerView == null || bannerView.getListener() == null) {
                sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_load_fail_not_found", null, map));
            } else {
                bannerView.getListener().onBannerFailedToLoad(bannerView, BannerErrorInfo.fromLoadError(unityAdsLoadError, str2));
            }
        }
    }

    public enum BannerEvent {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER,
        SCAR_BANNER_LOADED,
        SCAR_BANNER_LOAD_FAILED,
        SCAR_BANNER_ATTACHED,
        SCAR_BANNER_DETACHED,
        SCAR_BANNER_OPENED,
        SCAR_BANNER_CLOSED,
        SCAR_BANNER_IMPRESSION,
        SCAR_BANNER_CLICKED
    }

    public static void destroy(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROY_BANNER, str);
        }
    }

    public static void didAttach(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_ATTACHED, str);
        }
    }

    public static void didAttachScarBanner(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_ATTACHED, str);
        }
    }

    public static void didDestroy(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DESTROYED, str);
        }
    }

    public static void didDetach(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_DETACHED, str);
        }
    }

    public static void didDetachScarBanner(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.SCAR_BANNER_DETACHED, str);
        }
    }

    public static void didLoad(String str) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOADED, str);
        }
    }

    private static boolean isHeaderBidding(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has("adMarkup");
    }

    public static void load(String str, String str2, UnityBannerSize unityBannerSize) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_LOAD_PLACEMENT, str, str2, Integer.valueOf(unityBannerSize.getWidth()), Integer.valueOf(unityBannerSize.getHeight()));
            return;
        }
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null || bannerView.getListener() == null) {
            return;
        }
        bannerView.getListener().onBannerFailedToLoad(bannerView, new BannerErrorInfo("WebViewApp was not available, this is likely because UnityAds has not been initialized", BannerErrorCode.WEBVIEW_ERROR));
    }

    public static void resize(String str, int i, int i2, int i3, int i4, float f) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_RESIZED, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }

    public static void visibilityChanged(String str, int i) {
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp != null) {
            currentApp.sendEvent(WebViewEventCategory.BANNER, BannerEvent.BANNER_VISIBILITY_CHANGED, str, Integer.valueOf(i));
        }
    }

    public static void load(String str, String str2, UnityBannerSize unityBannerSize, UnityAdsLoadOptions unityAdsLoadOptions) {
        SDKMetricsSender sDKMetricsSender = (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
        C42881 c42881 = new HashMap<String, String>(isHeaderBidding(unityAdsLoadOptions.getData())) { // from class: com.unity3d.services.banners.bridge.BannerBridge.1
            final /* synthetic */ boolean val$isHB;

            public C42881(boolean z) {
                this.val$isHB = z;
                put("is_header_bidding", String.valueOf(z));
            }
        };
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null) {
            sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_load_not_found", null, c42881));
            return;
        }
        boolean zInvoke = ((AlternativeFlowReader) Utilities.getService(AlternativeFlowReader.class)).invoke();
        boolean z = unityAdsLoadOptions.getObjectId() != null;
        if (zInvoke && !z) {
            unityAdsLoadOptions.setObjectId(str2);
        }
        C42892 c42892 = new IUnityAdsLoadListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge.2
            final /* synthetic */ String val$bannerAdId;
            final /* synthetic */ BannerView val$bannerAdView;
            final /* synthetic */ boolean val$isAlternativeFlow;
            final /* synthetic */ UnityAdsLoadOptions val$loadOptions;
            final /* synthetic */ SDKMetricsSender val$sdkMetricsSender;
            final /* synthetic */ Map val$tags;

            /* renamed from: com.unity3d.services.banners.bridge.BannerBridge$2$1 */
            public class AnonymousClass1 implements Listeners {
                public AnonymousClass1() {
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onClick(String str2) {
                    C42892 c42892 = C42892.this;
                    BannerView.IListener iListener2 = iListener;
                    if (iListener2 != null) {
                        iListener2.onBannerClick(bannerView);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onComplete(String str2, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onError(String str2, UnityAds.UnityAdsShowError unityAdsShowError, String str22) {
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onLeftApplication(String str2) {
                    C42892 c42892 = C42892.this;
                    BannerView.IListener iListener2 = iListener;
                    if (iListener2 != null) {
                        iListener2.onBannerLeftApplication(bannerView);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onStart(String str2) {
                    C42892 c42892 = C42892.this;
                    BannerView.IListener iListener2 = iListener;
                    if (iListener2 != null) {
                        iListener2.onBannerShown(bannerView);
                    }
                }
            }

            public C42892(SDKMetricsSender sDKMetricsSender2, Map c428812, boolean zInvoke2, BannerView bannerView2, UnityAdsLoadOptions unityAdsLoadOptions2, String str22) {
                sDKMetricsSender = sDKMetricsSender2;
                map = c428812;
                z = zInvoke2;
                bannerView = bannerView2;
                unityAdsLoadOptions = unityAdsLoadOptions2;
                str = str22;
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String str3) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                if (iListener == null) {
                    sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_loaded_not_found", null, map));
                }
                if (z) {
                    BannerView.IListener iListener = iListener;
                    if (iListener != null) {
                        iListener.onBannerLoaded(bannerView);
                    }
                    UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                    unityAdsShowOptions.setObjectId(unityAdsLoadOptions.getObjectId());
                    new UnityAdsSDK().show(ClientProperties.getActivity(), str3, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.services.banners.bridge.BannerBridge.2.1
                        public AnonymousClass1() {
                        }

                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onClick(String str22) {
                            C42892 c428922 = C42892.this;
                            BannerView.IListener iListener2 = iListener;
                            if (iListener2 != null) {
                                iListener2.onBannerClick(bannerView);
                            }
                        }

                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onComplete(String str22, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
                        }

                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onError(String str22, UnityAds.UnityAdsShowError unityAdsShowError, String str222) {
                        }

                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onLeftApplication(String str22) {
                            C42892 c428922 = C42892.this;
                            BannerView.IListener iListener2 = iListener;
                            if (iListener2 != null) {
                                iListener2.onBannerLeftApplication(bannerView);
                            }
                        }

                        @Override // com.unity3d.ads.core.data.model.Listeners
                        public void onStart(String str22) {
                            C42892 c428922 = C42892.this;
                            BannerView.IListener iListener2 = iListener;
                            if (iListener2 != null) {
                                iListener2.onBannerShown(bannerView);
                            }
                        }
                    });
                }
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String str3, UnityAds.UnityAdsLoadError unityAdsLoadError, String str22) {
                BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(str);
                if (bannerView2 == null || bannerView2.getListener() == null) {
                    sDKMetricsSender.sendMetricWithInitState(new Metric("native_banner_listener_load_fail_not_found", null, map));
                } else {
                    bannerView2.getListener().onBannerFailedToLoad(bannerView2, BannerErrorInfo.fromLoadError(unityAdsLoadError, str22));
                }
            }
        };
        if (zInvoke2) {
            new UnityAdsSDK().load(str, unityAdsLoadOptions2, c42892, unityBannerSize);
        } else {
            LoadBannerModule.getInstance().executeAdOperation(new WebViewBridgeInvoker(), new LoadBannerOperationState(str, str22, unityBannerSize, c42892, unityAdsLoadOptions2, new ConfigurationReader().getCurrentConfiguration()));
        }
    }
}
