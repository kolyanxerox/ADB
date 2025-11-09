package com.applovin.impl.sdk.nativeAd;

import OooOOo0.o0ooOOo;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.arch.core.util.Function;
import com.applovin.impl.AbstractC0989b8;
import com.applovin.impl.AbstractC1045h4;
import com.applovin.impl.AbstractC1048h7;
import com.applovin.impl.AbstractC1078k7;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.C1009d8;
import com.applovin.impl.C1010e;
import com.applovin.impl.C1025f4;
import com.applovin.impl.C1026f5;
import com.applovin.impl.C1088l7;
import com.applovin.impl.C1268v4;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.impl.sdk.array.ArrayService;
import com.applovin.impl.sdk.network.C1239e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import io.flutter.plugins.firebase.analytics.Constants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd, View.OnClickListener, AppLovinTouchToClickListener.OnClickListener {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private static final String DEFAULT_APPLOVIN_PRIVACY_URL = "https://www.applovin.com/privacy/";
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private static final String TAG = "AppLovinNativeAd";
    private static final int VIEWABLE_MRC100_PERCENTAGE = 100;
    private static final int VIEWABLE_MRC50_PERCENTAGE = 50;
    private static final int VIEWABLE_MRC_REQUIRED_SECONDS = 1;
    private static final int VIEWABLE_VIDEO_MRC_REQUIRED_SECONDS = 2;
    private final C1025f4 adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final List<C1239e> clickTrackingRequests;
    private final List<String> clickTrackingUrls;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<C1239e> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final List<String> jsTrackers;
    private float mainImageAspectRatio;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final ViewOnAttachStateChangeListenerC1225b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final Double starRating;
    private final String tag;
    private final String title;
    private final C1088l7 vastAd;
    private View videoView;
    private final C1226c viewableMRC100Callback;
    private C1009d8 viewableMRC100Tracker;
    private final C1226c viewableMRC50Callback;
    private C1009d8 viewableMRC50Tracker;
    private C1226c viewableVideoMRC50Callback;
    private C1009d8 viewableVideoMRC50Tracker;

    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List<C1239e> clickTrackingRequests;
        private List<String> clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List<C1239e> impressionRequests;
        private List<String> jsTrackers;
        private float mainImageAspectRatio;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private Uri privacyIconUri;
        private final C1220k sdk;
        private Double starRating;
        private String title;
        private C1088l7 vastAd;
        private List<C1239e> viewableMRC100Requests;
        private List<C1239e> viewableMRC50Requests;
        private List<C1239e> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, C1220k c1220k) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = c1220k;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this, null);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingRequests(List<C1239e> list) {
            this.clickTrackingRequests = list;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<C1239e> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTrackers(List<String> list) {
            this.jsTrackers = list;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setStarRating(Double d) {
            this.starRating = d;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(C1088l7 c1088l7) {
            this.vastAd = c1088l7;
            return this;
        }

        public Builder setViewableMRC100Requests(List<C1239e> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<C1239e> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<C1239e> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$a */
    public class C1224a implements ArrayService.DirectDownloadListener {

        /* renamed from: a */
        final /* synthetic */ Uri f2219a;

        /* renamed from: b */
        final /* synthetic */ Uri f2220b;

        /* renamed from: c */
        final /* synthetic */ Context f2221c;

        public C1224a(Uri uri, Uri uri2, Context context) {
            this.f2219a = uri;
            this.f2220b = uri2;
            this.f2221c = context;
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onEvent(String str, Bundle bundle) {
        }

        @Override // com.applovin.impl.sdk.array.ArrayService.DirectDownloadListener
        public void onFailure() {
            AppLovinNativeAdImpl.this.launchUri(this.f2219a, this.f2220b, this.f2221c);
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$b */
    public static class ViewOnAttachStateChangeListenerC1225b implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final AppLovinNativeAdImpl f2223a;

        public ViewOnAttachStateChangeListenerC1225b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f2223a = appLovinNativeAdImpl;
        }

        /* renamed from: a */
        public boolean m3057a(Object obj) {
            return obj instanceof ViewOnAttachStateChangeListenerC1225b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ViewOnAttachStateChangeListenerC1225b)) {
                return false;
            }
            ViewOnAttachStateChangeListenerC1225b viewOnAttachStateChangeListenerC1225b = (ViewOnAttachStateChangeListenerC1225b) obj;
            if (!viewOnAttachStateChangeListenerC1225b.m3057a(this)) {
                return false;
            }
            AppLovinNativeAdImpl appLovinNativeAdImplM3056a = m3056a();
            AppLovinNativeAdImpl appLovinNativeAdImplM3056a2 = viewOnAttachStateChangeListenerC1225b.m3056a();
            return appLovinNativeAdImplM3056a != null ? appLovinNativeAdImplM3056a.equals(appLovinNativeAdImplM3056a2) : appLovinNativeAdImplM3056a2 == null;
        }

        public int hashCode() {
            AppLovinNativeAdImpl appLovinNativeAdImplM3056a = m3056a();
            return (appLovinNativeAdImplM3056a == null ? 43 : appLovinNativeAdImplM3056a.hashCode()) + 59;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2223a.maybeHandleOnAttachedToWindow(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + m3056a() + ")";
        }

        /* renamed from: a */
        public AppLovinNativeAdImpl m3056a() {
            return this.f2223a;
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$c */
    public class C1226c implements C1009d8.a {

        /* renamed from: a */
        private final List f2224a;

        public C1226c(List list) {
            this.f2224a = list;
        }

        /* renamed from: a */
        public boolean m3059a(Object obj) {
            return obj instanceof C1226c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C1226c)) {
                return false;
            }
            C1226c c1226c = (C1226c) obj;
            if (!c1226c.m3059a(this)) {
                return false;
            }
            List listM3058a = m3058a();
            List listM3058a2 = c1226c.m3058a();
            return listM3058a != null ? listM3058a.equals(listM3058a2) : listM3058a2 == null;
        }

        public int hashCode() {
            List listM3058a = m3058a();
            return (listM3058a == null ? 43 : listM3058a.hashCode()) + 59;
        }

        @Override // com.applovin.impl.C1009d8.a
        public void onLogVisibilityImpression() {
            Iterator it = this.f2224a.iterator();
            while (it.hasNext()) {
                ((AppLovinAdBase) AppLovinNativeAdImpl.this).sdk.m2898g0().dispatchPostbackRequest((C1239e) it.next(), null);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.VisibilityCallback(requests=" + m3058a() + ")";
        }

        /* renamed from: a */
        public List m3058a() {
            return this.f2224a;
        }
    }

    public /* synthetic */ AppLovinNativeAdImpl(Builder builder, C1224a c1224a) {
        this(builder);
    }

    private List<C1010e> getDirectClickTrackingPostbacks() {
        List<C1010e> listM1176a;
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO00o(this, 0));
        }
        synchronized (this.adObjectLock) {
            listM1176a = AbstractC1078k7.m1176a(getJsonObjectFromAdObject("click_tracking_urls", new JSONObject()), getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return listM1176a;
    }

    private List<String> getPrivacySandboxClickAttributionUrls() {
        return getStringListFromAdObject("privacy_sandbox_click_attribution_urls", Collections.EMPTY_LIST);
    }

    private List<String> getPrivacySandboxImpressionAttributionUrls() {
        return getStringListFromAdObject("privacy_sandbox_impression_attribution_urls", Collections.EMPTY_LIST);
    }

    private boolean isDspAd() {
        return AD_RESPONSE_TYPE_ORTB.equalsIgnoreCase(getType());
    }

    public /* synthetic */ List lambda$getDirectClickTrackingPostbacks$1(C1026f5 c1026f5) {
        return AbstractC1078k7.m1176a(c1026f5.m731a("click_tracking_urls", new JSONObject()), getClCode(), c1026f5.m727a("click_tracking_url", (String) null), this.sdk);
    }

    public static /* synthetic */ Bundle lambda$getDirectDownloadParameters$4(C1026f5 c1026f5) {
        return JsonUtils.toBundle(c1026f5.m731a("ah_parameters", (JSONObject) null));
    }

    public /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$2(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            try {
                URL url = new URL(JsonUtils.getString(jSONObject, "url", null));
                String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                String string2 = JsonUtils.getString(jSONObject, Constants.PARAMETERS, null);
                if (StringUtils.isValidString(string) && StringUtils.isValidString(string2)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            } catch (Throwable th) {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    this.sdk.m2847O().m3212a(this.tag, "Failed to parse OMID verification script resource", th);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List lambda$getOpenMeasurementVerificationScriptResources$3(Function function, C1026f5 c1026f5) {
        return (List) function.apply(c1026f5.m729a("omid_verification_script_resources", (JSONArray) null));
    }

    public /* synthetic */ void lambda$unregisterViewsForInteraction$0() {
        for (View view : this.registeredViews) {
            view.setOnTouchListener(null);
            view.setOnClickListener(null);
        }
        this.sdk.m2847O();
        if (C1240o.m3200a()) {
            this.sdk.m2847O().m3211a(this.tag, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        C1009d8 c1009d8 = this.viewableMRC50Tracker;
        if (c1009d8 != null) {
            c1009d8.m653b();
        }
        C1009d8 c1009d82 = this.viewableMRC100Tracker;
        if (c1009d82 != null) {
            c1009d82.m653b();
        }
        C1009d8 c1009d83 = this.viewableVideoMRC50Tracker;
        if (c1009d83 != null) {
            c1009d83.m653b();
        }
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }

    public void launchUri(Uri uri, Uri uri2, Context context) {
        if (AbstractC1048h7.m948a(uri, context, this.sdk)) {
            this.sdk.m2847O();
            if (C1240o.m3200a()) {
                this.sdk.m2847O().m3211a(this.tag, "Opening URL: " + uri);
                return;
            }
            return;
        }
        if (AbstractC1048h7.m948a(uri2, context, this.sdk)) {
            this.sdk.m2847O();
            if (C1240o.m3200a()) {
                this.sdk.m2847O().m3211a(this.tag, "Opening backup URL: " + uri2);
            }
        }
    }

    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            C1009d8 c1009d8 = new C1009d8(this.nativeAdView, this.sdk, this.viewableMRC50Callback);
            this.viewableMRC50Tracker = c1009d8;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c1009d8.m651a(0, 50.0f, 50.0f, timeUnit.toMillis(1L), this.nativeAdView);
            C1009d8 c1009d82 = new C1009d8(this.nativeAdView, this.sdk, this.viewableMRC100Callback);
            this.viewableMRC100Tracker = c1009d82;
            c1009d82.m651a(0, 100.0f, 100.0f, timeUnit.toMillis(1L), this.nativeAdView);
            C1088l7 c1088l7 = this.vastAd;
            if (c1088l7 != null && c1088l7.hasVideoUrl()) {
                C1009d8 c1009d83 = new C1009d8(this.nativeAdView, this.sdk, this.viewableVideoMRC50Callback);
                this.viewableVideoMRC50Tracker = c1009d83;
                c1009d83.m651a(0, 50.0f, 50.0f, timeUnit.toMillis(2L), this.videoView);
            }
            List<String> list = this.jsTrackers;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    this.sdk.m2932y0().m1020b(it.next());
                }
            }
            Iterator<C1239e> it2 = this.impressionRequests.iterator();
            while (it2.hasNext()) {
                this.sdk.m2898g0().dispatchPostbackRequest(it2.next(), null);
            }
            this.adEventTracker.m467a(view);
            this.adEventTracker.m475g();
            if (this.sdk.m2900h0() != null) {
                this.sdk.m2900h0().m3248b(getPrivacySandboxImpressionAttributionUrls());
            }
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.m474f();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getBody() {
        return this.body;
    }

    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        C1026f5 c1026f5 = this.synchronizedAdObject;
        return c1026f5 != null ? (Bundle) c1026f5.m726a(new o0ooOOo(11)) : JsonUtils.toBundle(getJsonObjectFromAdObject("ah_parameters", null));
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return getStringFromAdObject("ah_dd_token", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Uri getIconUri() {
        return this.iconUri;
    }

    public float getMainImageAspectRatio() {
        return this.mainImageAspectRatio;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    public String getMediationServeId() {
        return getStringFromFullResponse("event_id", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        List<VerificationScriptResource> listLambda$getOpenMeasurementVerificationScriptResources$2;
        if (this.sdk.m2894e0().m788e()) {
            return Collections.singletonList(VerificationScriptResource.createVerificationScriptResourceWithParameters(AbstractC1045h4.m926c(), AbstractC1045h4.m925b(), AbstractC1045h4.m923a()));
        }
        OooO00o oooO00o = new OooO00o(this, 1);
        C1026f5 c1026f5 = this.synchronizedAdObject;
        if (c1026f5 != null) {
            return (List) c1026f5.m726a(new OooO00o(oooO00o, 2));
        }
        synchronized (this.adObjectLock) {
            listLambda$getOpenMeasurementVerificationScriptResources$2 = lambda$getOpenMeasurementVerificationScriptResources$2(getJsonArrayFromAdObject("omid_verification_script_resources", null));
        }
        return listLambda$getOpenMeasurementVerificationScriptResources$2;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Double getStarRating() {
        return this.starRating;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public C1088l7 getVastAd() {
        return this.vastAd;
    }

    public void handleNativeAdClick(Uri uri, Uri uri2, MotionEvent motionEvent, Context context) {
        if (this.sdk.m2900h0() != null) {
            this.sdk.m2900h0().m3249b(getPrivacySandboxClickAttributionUrls(), motionEvent);
        }
        handleNativeAdClick(uri, uri2, context);
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return StringUtils.isValidString(getDirectDownloadToken());
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.m2894e0().m788e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context context;
        this.sdk.m2847O();
        if (C1240o.m3200a()) {
            this.sdk.m2847O().m3211a(this.tag, "Handle view clicked");
        }
        this.sdk.m2905k().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (!((Boolean) this.sdk.m2866a(C1268v4.f2923x)).booleanValue() || (context = AbstractC0989b8.m432b(this.nativeAdView, this.sdk)) == null) {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, context);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        } else {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        }
        this.sdk.m2847O();
        if (C1240o.m3200a()) {
            this.sdk.m2847O().m3211a(this.tag, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            this.sdk.m2847O();
            if (C1240o.m3200a()) {
                this.sdk.m2847O().m3211a(this.tag, "Skipping click registration - no click URLs provided");
                return;
            }
            return;
        }
        for (View view : list) {
            if (view.hasOnClickListeners()) {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    this.sdk.m2847O().m3218k(this.tag, "View has an onClickListener already - " + view);
                }
            }
            if (!view.isClickable()) {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    this.sdk.m2847O().m3218k(this.tag, "View is not clickable - " + view);
                }
            }
            if (!view.isEnabled()) {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    this.sdk.m2847O().m3214b(this.tag, "View is not enabled - " + view);
                }
            }
            if (view instanceof Button) {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    this.sdk.m2847O().m3211a(this.tag, "Registering click for button: " + view);
                }
            } else {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    this.sdk.m2847O().m3211a(this.tag, "Registering click for view: " + view);
                }
            }
            if (((Boolean) this.sdk.m2866a(C1268v4.f2557D2)).booleanValue()) {
                view.setOnTouchListener(new AppLovinTouchToClickListener(this.sdk, C1268v4.f2812j0, viewGroup.getContext(), this));
            } else {
                view.setOnClickListener(this);
            }
            this.registeredViews.add(view);
        }
        this.sdk.m2847O();
        if (C1240o.m3200a()) {
            this.sdk.m2847O().m3211a(this.tag, "Registered views: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageAspectRatio(float f) {
        this.mainImageAspectRatio = f;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        C1088l7 c1088l7 = this.vastAd;
        if (c1088l7 == null || !c1088l7.hasVideoUrl()) {
            this.mediaView = new AppLovinMediaView(this, this.sdk, C1220k.m2824o());
        } else {
            try {
                this.mediaView = new AppLovinVastMediaView(this, this.sdk, C1220k.m2824o());
            } catch (Throwable th) {
                this.sdk.m2847O();
                if (C1240o.m3200a()) {
                    this.sdk.m2847O().m3216d(this.tag, "Failed to create MediaPlayer VAST media view. Falling back to static image for media view.", th);
                }
                this.sdk.m2832E().m2148a(TAG, "createMediaPlayerVASTMediaView", th);
                this.mediaView = new AppLovinMediaView(this, this.sdk, C1220k.m2824o());
            }
        }
        if (this.privacyDestinationUri != null) {
            this.optionsView = new AppLovinOptionsView(this, this.sdk, C1220k.m2824o());
            return;
        }
        this.sdk.m2847O();
        if (C1240o.m3200a()) {
            this.sdk.m2847O().m3211a(this.tag, "Privacy icon will not render because no native ad privacy URL is provided.");
        }
    }

    public void setVideoView(View view) {
        this.videoView = view;
    }

    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        AppLovinSdkUtils.runOnUiThread(new OooO0O0(this, 2));
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.onAttachStateChangeHandler = new ViewOnAttachStateChangeListenerC1225b(this);
        this.adEventTracker = new C1025f4(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.mainImageAspectRatio = builder.mainImageAspectRatio;
        this.privacyIconUri = builder.privacyIconUri;
        C1088l7 c1088l7 = builder.vastAd;
        this.vastAd = c1088l7;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTrackers = builder.jsTrackers;
        this.clickTrackingRequests = builder.clickTrackingRequests;
        this.impressionRequests = builder.impressionRequests;
        Double d = builder.starRating;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : d;
        if (builder.privacyDestinationUri != null) {
            this.privacyDestinationUri = builder.privacyDestinationUri;
        } else if (!isDspAd() || getSdk().m2922t0().m493c()) {
            this.privacyDestinationUri = Uri.parse(DEFAULT_APPLOVIN_PRIVACY_URL);
        }
        this.viewableMRC50Callback = new C1226c(builder.viewableMRC50Requests);
        this.viewableMRC100Callback = new C1226c(builder.viewableMRC100Requests);
        if (c1088l7 != null && c1088l7.hasVideoUrl()) {
            this.viewableVideoMRC50Callback = new C1226c(builder.viewableVideo50Requests);
        }
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.InterfaceC0985b4
    public C1025f4 getAdEventTracker() {
        return this.adEventTracker;
    }

    private void handleNativeAdClick(Uri uri, Uri uri2, Context context) {
        if (this.clickTrackingRequests.size() > 0) {
            Iterator<C1239e> it = this.clickTrackingRequests.iterator();
            while (it.hasNext()) {
                this.sdk.m2898g0().dispatchPostbackRequest(it.next(), null);
            }
        } else {
            Iterator<String> it2 = this.clickTrackingUrls.iterator();
            while (it2.hasNext()) {
                this.sdk.m2898g0().dispatchPostbackAsync(it2.next(), null);
            }
        }
        AbstractC1168q2.m2205b(this.eventListener, this);
        if (isDirectDownloadEnabled()) {
            this.sdk.m2913p().startDirectInstallOrDownloadProcess(this, null, new C1224a(uri, uri2, context));
        } else {
            launchUri(uri, uri2, context);
        }
    }

    @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
    public void onClick(View view, MotionEvent motionEvent) {
        Context context;
        this.sdk.m2847O();
        if (C1240o.m3200a()) {
            this.sdk.m2847O().m3211a(this.tag, "Handle view clicked");
        }
        this.sdk.m2905k().maybeSubmitPersistentPostbacks(getDirectClickTrackingPostbacks());
        if (!((Boolean) this.sdk.m2866a(C1268v4.f2923x)).booleanValue() || (context = AbstractC0989b8.m432b(this.nativeAdView, this.sdk)) == null) {
            context = view.getContext();
        }
        handleNativeAdClick(this.clickDestinationUri, this.clickDestinationBackupUri, motionEvent, context);
    }
}
