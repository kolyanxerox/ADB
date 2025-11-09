package com.applovin.impl.sdk.array;

import OooO0oO.OooOo;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;
import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.AbstractC0980b;
import com.applovin.impl.AbstractC1141o0;
import com.applovin.impl.AbstractC1249t3;
import com.applovin.impl.AbstractC1266v2;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1268v4;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ArrayService extends IAppHubDirectDownloadServiceCallback.Stub {
    public static final String DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED = "APP_DETAILS_DISMISSED";
    public static final String DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN = "APP_DETAILS_SHOWN";
    public static final String KEY_AD_TOKEN = "ad_token";
    private static final int MAX_RECONNECT_RETRY_COUNT = 3;
    private static final String SERVICE_INTENT_CLASS_NAME = "com.applovin.oem.am.android.external.AppHubService";
    private static final String SERVICE_INTENT_FILTER_ACTION = "com.applovin.am.intent.action.APPHUB_SERVICE";
    private static final String TAG = "ArrayService";
    private String appHubPackageName;
    private IAppHubService appHubService;
    private final Intent appHubServiceIntent;
    private long appHubVersionCode = -1;
    private DirectDownloadState currentDownloadState;
    private int currentRetryCount;
    private final ArrayDataCollector dataCollector;
    private Boolean isDirectDownloadEnabled;
    private final C1240o logger;
    private final int minVersionCodeWithGenericEventsSupport;
    private String randomUserToken;
    private final C1220k sdk;

    public interface DirectDownloadListener {
        void onEvent(String str, Bundle bundle);

        void onFailure();
    }

    public static class DirectDownloadState {
        private final String adToken;
        private final AtomicBoolean errorCallbackInvoked = new AtomicBoolean();
        private final DirectDownloadListener listener;
        private final Bundle parameters;

        public DirectDownloadState(String str, Bundle bundle, DirectDownloadListener directDownloadListener) {
            this.adToken = str;
            this.parameters = bundle;
            this.listener = directDownloadListener;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DirectDownloadState;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DirectDownloadState)) {
                return false;
            }
            DirectDownloadState directDownloadState = (DirectDownloadState) obj;
            if (!directDownloadState.canEqual(this)) {
                return false;
            }
            AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            AtomicBoolean errorCallbackInvoked2 = directDownloadState.getErrorCallbackInvoked();
            if (errorCallbackInvoked != null ? !errorCallbackInvoked.equals(errorCallbackInvoked2) : errorCallbackInvoked2 != null) {
                return false;
            }
            String adToken = getAdToken();
            String adToken2 = directDownloadState.getAdToken();
            if (adToken != null ? !adToken.equals(adToken2) : adToken2 != null) {
                return false;
            }
            Bundle parameters = getParameters();
            Bundle parameters2 = directDownloadState.getParameters();
            if (parameters != null ? !parameters.equals(parameters2) : parameters2 != null) {
                return false;
            }
            DirectDownloadListener listener = getListener();
            DirectDownloadListener listener2 = directDownloadState.getListener();
            return listener != null ? listener.equals(listener2) : listener2 == null;
        }

        public String getAdToken() {
            return this.adToken;
        }

        public AtomicBoolean getErrorCallbackInvoked() {
            return this.errorCallbackInvoked;
        }

        public DirectDownloadListener getListener() {
            return this.listener;
        }

        public Bundle getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            AtomicBoolean errorCallbackInvoked = getErrorCallbackInvoked();
            int iHashCode = errorCallbackInvoked == null ? 43 : errorCallbackInvoked.hashCode();
            String adToken = getAdToken();
            int iHashCode2 = ((iHashCode + 59) * 59) + (adToken == null ? 43 : adToken.hashCode());
            Bundle parameters = getParameters();
            int iHashCode3 = (iHashCode2 * 59) + (parameters == null ? 43 : parameters.hashCode());
            DirectDownloadListener listener = getListener();
            return (iHashCode3 * 59) + (listener != null ? listener.hashCode() : 43);
        }

        public String toString() {
            return "ArrayService.DirectDownloadState(errorCallbackInvoked=" + getErrorCallbackInvoked() + ", adToken=" + getAdToken() + ", parameters=" + getParameters() + ", listener=" + getListener() + ")";
        }
    }

    public ArrayService(final C1220k c1220k) {
        this.sdk = c1220k;
        this.logger = c1220k.m2847O();
        this.dataCollector = new ArrayDataCollector(c1220k);
        Intent intentCreateAppHubServiceIntent = createAppHubServiceIntent();
        this.appHubServiceIntent = intentCreateAppHubServiceIntent;
        this.minVersionCodeWithGenericEventsSupport = ((Integer) c1220k.m2866a(C1268v4.f2755c0)).intValue();
        if (intentCreateAppHubServiceIntent != null) {
            bindAppHubService();
        }
        c1220k.m2893e().m438a(new AbstractC0980b() { // from class: com.applovin.impl.sdk.array.ArrayService.1
            @Override // com.applovin.impl.AbstractC0980b, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                DirectDownloadState directDownloadState = ArrayService.this.currentDownloadState;
                if (ArrayService.this.appHubService == null || directDownloadState == null) {
                    return;
                }
                try {
                    C1240o unused = ArrayService.this.logger;
                    if (C1240o.m3200a()) {
                        ArrayService.this.logger.m3211a(ArrayService.TAG, "Dismissing Direct Download Activity");
                    }
                    ArrayService.this.appHubService.dismissDirectDownloadAppDetails(directDownloadState.adToken);
                    directDownloadState.listener.onEvent(ArrayService.DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED, ArrayService.this.createBaseExtras(directDownloadState.adToken));
                    ArrayService.this.currentDownloadState = null;
                } catch (RemoteException e) {
                    C1240o unused2 = ArrayService.this.logger;
                    if (C1240o.m3200a()) {
                        ArrayService.this.logger.m3212a(ArrayService.TAG, "Failed dismiss Direct Download Activity", e);
                    }
                    c1220k.m2832E().m2151a(ArrayService.TAG, "dismissDirectDownloadActivity", e, ArrayService.this.getHealthEventExtraParameters());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindAppHubService() {
        if (this.currentRetryCount > 3) {
            if (C1240o.m3200a()) {
                this.logger.m3218k(TAG, "Exceeded maximum retry count");
                return;
            }
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(TAG, "Attempting connection to App Hub service...");
        }
        this.currentRetryCount++;
        try {
            if (C1220k.m2824o().bindService(this.appHubServiceIntent, new ServiceConnection() { // from class: com.applovin.impl.sdk.array.ArrayService.2
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    C1240o unused = ArrayService.this.logger;
                    if (C1240o.m3200a()) {
                        ArrayService.this.logger.m3211a(ArrayService.TAG, "Connection successful: " + componentName);
                    }
                    ArrayService.this.appHubService = IAppHubService.Stub.asInterface(iBinder);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    C1240o unused = ArrayService.this.logger;
                    if (C1240o.m3200a()) {
                        ArrayService.this.logger.m3214b(ArrayService.TAG, "Service disconnected: " + componentName);
                    }
                    ArrayService.this.appHubService = null;
                    C1240o unused2 = ArrayService.this.logger;
                    if (C1240o.m3200a()) {
                        ArrayService.this.logger.m3214b(ArrayService.TAG, "Retrying...");
                    }
                    ArrayService.this.bindAppHubService();
                }
            }, AbstractC1141o0.m1948d() ? InputDeviceCompat.SOURCE_DPAD : 1) || !C1240o.m3200a()) {
                return;
            }
            this.logger.m3218k(TAG, "App Hub not available");
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.logger.m3212a(TAG, "Failed to bind to service", th);
            }
            this.sdk.m2832E().m2151a(TAG, "bindAppHubService", th, getHealthEventExtraParameters());
        }
    }

    private Intent createAppHubServiceIntent() {
        Intent intent = new Intent(SERVICE_INTENT_FILTER_ACTION);
        List<ResolveInfo> listQueryIntentServices = C1220k.m2824o().getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            if (!C1240o.m3200a()) {
                return null;
            }
            this.logger.m3218k(TAG, "App Hub not available");
            return null;
        }
        String str = listQueryIntentServices.get(0).serviceInfo.packageName;
        this.appHubPackageName = str;
        intent.setClassName(str, SERVICE_INTENT_CLASS_NAME);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle createBaseExtras(String str) {
        Bundle bundle = new Bundle();
        BundleUtils.putString(KEY_AD_TOKEN, str, bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getHealthEventExtraParameters() {
        HashMap map = new HashMap(2);
        CollectionUtils.putStringIfValid("array_version_code", String.valueOf(getAppHubVersionCode()), map);
        CollectionUtils.putStringIfValid("array_sdk_package_name", getAppHubPackageName(), map);
        return map;
    }

    private void handleEvent(String str, Bundle bundle) {
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        if (directDownloadState.adToken.equalsIgnoreCase(bundle.getString(KEY_AD_TOKEN))) {
            directDownloadState.listener.onEvent(str, bundle);
            if (DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED.equals(str)) {
                this.currentDownloadState = null;
                return;
            }
            return;
        }
        String strOooOO0O = OooOo.OooOO0O("Ignoring event (", str, ") for mismatched token.");
        if (C1240o.m3200a()) {
            this.logger.m3211a(TAG, strOooOO0O);
        }
        Map<String, String> healthEventExtraParameters = getHealthEventExtraParameters();
        healthEventExtraParameters.put("source", "ArrayService:handleEvent");
        healthEventExtraParameters.put("details", strOooOO0O);
        this.sdk.m2832E().m576d(C0993c2.f490M0, healthEventExtraParameters);
    }

    private boolean shouldUseGenericDirectDownloadEvent() {
        return this.minVersionCodeWithGenericEventsSupport >= 0 && getAppHubVersionCode() >= ((long) this.minVersionCodeWithGenericEventsSupport);
    }

    public void collectAppHubData() {
        if (isAppHubInstalled()) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(TAG, "Collecting data...");
            }
            if (this.isDirectDownloadEnabled == null && ((Boolean) this.sdk.m2866a(C1268v4.f2730Z)).booleanValue()) {
                this.isDirectDownloadEnabled = this.dataCollector.collectDirectDownloadEnabled(this.appHubService);
            }
            if (this.appHubVersionCode == -1 && ((Boolean) this.sdk.m2866a(C1268v4.f2722Y)).booleanValue()) {
                this.appHubVersionCode = this.dataCollector.collectAppHubVersionCode(this.appHubService);
            }
            if (TextUtils.isEmpty(this.randomUserToken) && ((Boolean) this.sdk.m2866a(C1268v4.f2738a0)).booleanValue()) {
                this.randomUserToken = this.dataCollector.collectRandomUserToken(this.appHubService);
            }
        }
    }

    public String getAppHubPackageName() {
        return this.appHubPackageName;
    }

    public long getAppHubVersionCode() {
        return this.appHubVersionCode;
    }

    public Boolean getIsDirectDownloadEnabled() {
        return this.isDirectDownloadEnabled;
    }

    public String getJavaScript(String str, Bundle bundle) {
        return "javascript:al_onDirectDownloadEvent('" + str + "'," + BundleUtils.toJSONObject(bundle) + ");";
    }

    public String getRandomUserToken() {
        return this.randomUserToken;
    }

    public boolean isAppHubInstalled() {
        return this.appHubService != null;
    }

    public void maybeSendAdEvent(AbstractC1266v2 abstractC1266v2, String str) {
        IAppHubService iAppHubService;
        if (((Boolean) this.sdk.m2866a(C1268v4.f2746b0)).booleanValue() && (iAppHubService = this.appHubService) != null && AbstractC1249t3.m3327b(abstractC1266v2)) {
            if (C1240o.m3200a()) {
                this.logger.m3211a(TAG, "Sending ad event: " + str + " for ad: " + abstractC1266v2);
            }
            Bundle bundle = new Bundle();
            BundleUtils.putString("sdk_version", AppLovinSdk.VERSION, bundle);
            BundleUtils.putString("ad_format", abstractC1266v2.getFormat().getLabel(), bundle);
            Bundle bundleM3505B = abstractC1266v2.m3505B();
            if (bundleM3505B != null) {
                bundle.putAll(bundleM3505B);
            }
            try {
                iAppHubService.onAdSdkEvent(str, bundle);
            } catch (Throwable th) {
                if (C1240o.m3200a()) {
                    this.logger.m3212a(TAG, "Failed to send ad event: " + str, th);
                }
                Map map = CollectionUtils.map("name", str);
                map.putAll(getHealthEventExtraParameters());
                this.sdk.m2832E().m2151a(TAG, "failedToSendAdEvent", th, map);
            }
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsDismissed(String str) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(TAG, "App details dismissed");
        }
        if (shouldUseGenericDirectDownloadEvent()) {
            return;
        }
        handleEvent(DIRECT_DOWNLOAD_EVENT_APP_DETAILS_DISMISSED, createBaseExtras(str));
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onAppDetailsShown(String str) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(TAG, "App details shown");
        }
        if (shouldUseGenericDirectDownloadEvent()) {
            return;
        }
        handleEvent(DIRECT_DOWNLOAD_EVENT_APP_DETAILS_SHOWN, createBaseExtras(str));
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onDownloadStarted(String str) {
        if (C1240o.m3200a()) {
            this.logger.m3211a(TAG, "Download started");
        }
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onError(String str, String str2) {
        if (C1240o.m3200a()) {
            this.logger.m3214b(TAG, "Encountered error: " + str2);
        }
        Map<String, String> healthEventExtraParameters = getHealthEventExtraParameters();
        CollectionUtils.putStringIfValid("error_message", str2, healthEventExtraParameters);
        this.sdk.m2832E().m576d(C0993c2.f546v0, healthEventExtraParameters);
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState == null) {
            return;
        }
        if (directDownloadState.adToken.equalsIgnoreCase(str)) {
            if (directDownloadState.errorCallbackInvoked.compareAndSet(false, true)) {
                directDownloadState.listener.onFailure();
                this.currentDownloadState = null;
                return;
            }
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(TAG, "Ignoring error callback for mismatched token.");
        }
        healthEventExtraParameters.put("details", "Ignoring error callback for mismatched token.");
        this.sdk.m2832E().m572a(C0993c2.f490M0, "ArrayService:onError", healthEventExtraParameters);
    }

    @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
    public void onEvent(String str, Bundle bundle) {
        if (C1240o.m3200a()) {
            OooO00o.OooOoO0("Received event: ", str, this.logger, TAG);
        }
        if (shouldUseGenericDirectDownloadEvent()) {
            handleEvent(str, bundle);
        }
    }

    public void startDirectInstallOrDownloadProcess(ArrayDirectDownloadAd arrayDirectDownloadAd, Bundle bundle, DirectDownloadListener directDownloadListener) {
        if (this.appHubService == null) {
            if (C1240o.m3200a()) {
                this.logger.m3214b(TAG, "Cannot begin Direct Install / Download process - service disconnected");
            }
            directDownloadListener.onFailure();
            return;
        }
        if (!arrayDirectDownloadAd.isDirectDownloadEnabled()) {
            if (C1240o.m3200a()) {
                this.logger.m3214b(TAG, "Cannot begin Direct Install / Download process - missing token");
            }
            directDownloadListener.onFailure();
            return;
        }
        try {
            Bundle directDownloadParameters = arrayDirectDownloadAd.getDirectDownloadParameters();
            if (bundle != null) {
                directDownloadParameters.putAll(bundle);
            }
            this.currentDownloadState = new DirectDownloadState(arrayDirectDownloadAd.getDirectDownloadToken(), directDownloadParameters, directDownloadListener);
            if (C1240o.m3200a()) {
                this.logger.m3211a(TAG, "Starting Direct Download Activity");
            }
            if (this.appHubVersionCode >= 21) {
                this.appHubService.showDirectDownloadAppDetailsWithExtra(this.currentDownloadState.adToken, this.currentDownloadState.parameters, this);
            } else {
                this.appHubService.showDirectDownloadAppDetails(this.currentDownloadState.adToken, this);
            }
            if (C1240o.m3200a()) {
                this.logger.m3211a(TAG, "Activity started");
            }
        } catch (Throwable th) {
            if (C1240o.m3200a()) {
                this.logger.m3212a(TAG, "Failed to execute Direct Install / Download process", th);
            }
            this.sdk.m2832E().m2151a(TAG, "directInstallDownload", th, getHealthEventExtraParameters());
            this.currentDownloadState = null;
            directDownloadListener.onFailure();
        }
    }
}
