package com.unity3d.services.banners;

import OooOo0o.o000oOoO;
import android.app.Activity;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.webplayer.WebPlayerSettingsCache;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.banners.view.BannerWebPlayerContainer;
import com.unity3d.services.banners.view.ScarBannerContainer;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;
import o000ooOO.o000O0Oo;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BannerView extends RelativeLayout {
    private BannerWebPlayerContainer bannerWebPlayerContainer;
    private final GMAScarAdapterBridge gmaScarAdapterBridge;
    private IInitializationListener initializationListener;
    private IListener listener;
    private String placementId;
    private ScarBannerContainer scarBannerContainer;
    private UnityBannerSize size;
    private String viewId;

    /* renamed from: com.unity3d.services.banners.BannerView$1 */
    public class RunnableC42731 implements Runnable {
        final /* synthetic */ BannerView val$self;

        public RunnableC42731(BannerView bannerView) {
            bannerView = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = bannerView.getParent();
            if (parent == null || !(parent instanceof ViewManager)) {
                return;
            }
            ((ViewManager) parent).removeView(bannerView);
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerView$2 */
    public class RunnableC42742 implements Runnable {
        final /* synthetic */ BannerView val$self;
        final /* synthetic */ UnityBannerSize val$unityBannerSize;

        public RunnableC42742(BannerView bannerView, UnityBannerSize unityBannerSize) {
            bannerView = bannerView;
            unityBannerSize = unityBannerSize;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject webSettings = WebPlayerSettingsCache.getInstance().getWebSettings(bannerView.viewId);
            JSONObject webPlayerSettings = WebPlayerSettingsCache.getInstance().getWebPlayerSettings(bannerView.viewId);
            JSONObject webPlayerEventSettings = WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(bannerView.viewId);
            if (bannerView.bannerWebPlayerContainer != null) {
                bannerView.bannerWebPlayerContainer.setWebPlayerSettings(webSettings, webPlayerSettings);
                bannerView.bannerWebPlayerContainer.setWebPlayerEventSettings(webPlayerEventSettings);
            } else {
                bannerView.bannerWebPlayerContainer = new BannerWebPlayerContainer(bannerView.getContext(), bannerView.viewId, webSettings, webPlayerSettings, webPlayerEventSettings, unityBannerSize);
                BannerView bannerView = bannerView;
                bannerView.addView(bannerView.bannerWebPlayerContainer);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerView$3 */
    public class C42753 implements IInitializationListener {
        final /* synthetic */ BannerView val$bannerView;

        public C42753(BannerView bannerView) {
            bannerView = bannerView;
        }

        @Override // com.unity3d.services.core.configuration.IInitializationListener
        public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
            bannerView.unregisterInitializeListener();
            if (bannerView.getListener() != null) {
                bannerView.getListener().onBannerFailedToLoad(bannerView, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
            }
        }

        @Override // com.unity3d.services.core.configuration.IInitializationListener
        public void onSdkInitialized() {
            bannerView.unregisterInitializeListener();
            bannerView.bridgeLoad();
        }
    }

    public interface IListener {
        void onBannerClick(BannerView bannerView);

        void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(BannerView bannerView);

        void onBannerLoaded(BannerView bannerView);

        void onBannerShown(BannerView bannerView);
    }

    public static abstract class Listener implements IListener {
        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(BannerView bannerView) {
        }
    }

    public BannerView(Activity activity, String str, UnityBannerSize unityBannerSize) {
        super(activity);
        this.gmaScarAdapterBridge = GMA.getInstance().getBridge();
        this.viewId = UUID.randomUUID().toString();
        this.placementId = str;
        this.size = unityBannerSize;
        setupLayoutParams();
        setBackgroundColor(0);
        ClientProperties.setActivity(activity);
        BannerViewCache.getInstance().addBannerView(this);
    }

    public void bridgeLoad() {
        BannerBridge.load(this.placementId, this.viewId, this.size, new UnityAdsLoadOptions());
    }

    public /* synthetic */ void lambda$addScarContainer$0() {
        addView(this.scarBannerContainer);
    }

    private void registerInitializeListener() {
        unregisterInitializeListener();
        this.initializationListener = new IInitializationListener() { // from class: com.unity3d.services.banners.BannerView.3
            final /* synthetic */ BannerView val$bannerView;

            public C42753(BannerView this) {
                bannerView = this;
            }

            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
                bannerView.unregisterInitializeListener();
                if (bannerView.getListener() != null) {
                    bannerView.getListener().onBannerFailedToLoad(bannerView, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
                }
            }

            @Override // com.unity3d.services.core.configuration.IInitializationListener
            public void onSdkInitialized() {
                bannerView.unregisterInitializeListener();
                bannerView.bridgeLoad();
            }
        };
        InitializationNotificationCenter.getInstance().addListener(this.initializationListener);
    }

    private void setupLayoutParams() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getWidth())), Math.round(ViewUtilities.pxFromDp(getContext(), this.size.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    public void unregisterInitializeListener() {
        if (this.initializationListener != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.initializationListener);
        }
        this.initializationListener = null;
    }

    public void addScarContainer() {
        this.scarBannerContainer = new ScarBannerContainer(getContext(), this.viewId);
        Utilities.runOnUiThread(new o000oOoO(this, 19));
    }

    public void destroy() {
        UnityAdsSDK unityAdsSDK = new UnityAdsSDK();
        unityAdsSDK.sendBannerDestroyed();
        BannerViewCache.getInstance().removeBannerView(this.viewId);
        unregisterInitializeListener();
        unityAdsSDK.finishOMIDSession(this.viewId);
        BannerBridge.destroy(this.placementId);
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.banners.BannerView.1
            final /* synthetic */ BannerView val$self;

            public RunnableC42731(BannerView this) {
                bannerView = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewParent parent = bannerView.getParent();
                if (parent == null || !(parent instanceof ViewManager)) {
                    return;
                }
                ((ViewManager) parent).removeView(bannerView);
            }
        });
        BannerWebPlayerContainer bannerWebPlayerContainer = this.bannerWebPlayerContainer;
        if (bannerWebPlayerContainer != null) {
            bannerWebPlayerContainer.destroy();
        }
        ScarBannerContainer scarBannerContainer = this.scarBannerContainer;
        if (scarBannerContainer != null) {
            scarBannerContainer.destroy();
        }
        DeviceLog.info("Banner [" + this.placementId + "] was destroyed");
        this.viewId = null;
        this.listener = null;
        this.bannerWebPlayerContainer = null;
    }

    public IListener getListener() {
        return this.listener;
    }

    public String getPlacementId() {
        return this.placementId;
    }

    public UnityBannerSize getSize() {
        return this.size;
    }

    public String getViewId() {
        return this.viewId;
    }

    public void load() {
        bridgeLoad();
    }

    public void loadScarPlayer(String str, o000O0Oo o000o0oo2, UnityBannerSize unityBannerSize) {
        this.gmaScarAdapterBridge.loadBanner(getContext(), this, str, o000o0oo2, unityBannerSize);
    }

    public void loadWebPlayer(UnityBannerSize unityBannerSize) {
        Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.banners.BannerView.2
            final /* synthetic */ BannerView val$self;
            final /* synthetic */ UnityBannerSize val$unityBannerSize;

            public RunnableC42742(BannerView this, UnityBannerSize unityBannerSize2) {
                bannerView = this;
                unityBannerSize = unityBannerSize2;
            }

            @Override // java.lang.Runnable
            public void run() {
                JSONObject webSettings = WebPlayerSettingsCache.getInstance().getWebSettings(bannerView.viewId);
                JSONObject webPlayerSettings = WebPlayerSettingsCache.getInstance().getWebPlayerSettings(bannerView.viewId);
                JSONObject webPlayerEventSettings = WebPlayerSettingsCache.getInstance().getWebPlayerEventSettings(bannerView.viewId);
                if (bannerView.bannerWebPlayerContainer != null) {
                    bannerView.bannerWebPlayerContainer.setWebPlayerSettings(webSettings, webPlayerSettings);
                    bannerView.bannerWebPlayerContainer.setWebPlayerEventSettings(webPlayerEventSettings);
                } else {
                    bannerView.bannerWebPlayerContainer = new BannerWebPlayerContainer(bannerView.getContext(), bannerView.viewId, webSettings, webPlayerSettings, webPlayerEventSettings, unityBannerSize);
                    BannerView bannerView = bannerView;
                    bannerView.addView(bannerView.bannerWebPlayerContainer);
                }
            }
        });
    }

    public void setListener(IListener iListener) {
        this.listener = iListener;
    }

    private void bridgeLoad(UnityAdsLoadOptions unityAdsLoadOptions) {
        String objectId;
        if (unityAdsLoadOptions != null && (objectId = unityAdsLoadOptions.getObjectId()) != null) {
            BannerViewCache bannerViewCache = BannerViewCache.getInstance();
            bannerViewCache.removeBannerView(this.viewId);
            this.viewId = objectId;
            bannerViewCache.addBannerView(this);
        }
        BannerBridge.load(this.placementId, this.viewId, this.size, unityAdsLoadOptions);
    }

    public void load(UnityAdsLoadOptions unityAdsLoadOptions) {
        bridgeLoad(unityAdsLoadOptions);
    }
}
