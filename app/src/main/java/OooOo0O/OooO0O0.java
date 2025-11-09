package OooOo0O;

import OooOOO.OooOO0;
import OooOOo.Oooo0;
import OooOOo0.OooOo;
import OooOOo0.OooOo00;
import OooOo.OooO;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.webkit.WebResourceErrorCompat;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.impl.AbstractC1003d2;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1012e1;
import com.applovin.impl.C1060j;
import com.applovin.impl.C1071k0;
import com.applovin.impl.C1093m2;
import com.applovin.impl.C1167q1;
import com.applovin.impl.EnumC1050i;
import com.applovin.impl.adview.C0962a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.privacy.cmp.C1164a;
import com.applovin.impl.sdk.C1212c;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.ump.FormError;
import com.ironsource.C2984bt;
import com.ironsource.C3780vs;
import com.ironsource.InterfaceC3710ts;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;
import o000Oo0.OooOOO0;
import o000o0oO.Oooo000;
import o000oOoo.o000O00O;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f13595OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f13596OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f13597OooOo0o;

    /* renamed from: OooOoO */
    public final /* synthetic */ Object f13598OooOoO;

    /* renamed from: OooOoO0 */
    public final /* synthetic */ Object f13599OooOoO0;

    public /* synthetic */ OooO0O0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f13596OooOo0O = i;
        this.f13597OooOo0o = obj;
        this.f13595OooOo = obj2;
        this.f13599OooOoO0 = obj3;
        this.f13598OooOoO = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f13596OooOo0O) {
            case 0:
                OooOo oooOo = (OooOo) this.f13595OooOo;
                String str = oooOo.f13486OooO00o;
                OooOO0 oooOO0 = (OooOO0) this.f13599OooOoO0;
                OooOo00 oooOo00 = (OooOo00) this.f13598OooOoO;
                OooO0OO oooO0OO = (OooO0OO) this.f13597OooOo0o;
                oooO0OO.getClass();
                Logger logger = OooO0OO.f13600OooO0o;
                try {
                    Oooo0 oooo0OooO00o = oooO0OO.f13603OooO0OO.OooO00o(str);
                    if (oooo0OooO00o == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        oooOO0.OooO00o(new IllegalArgumentException(str2));
                    } else {
                        ((OooOo.OooOo) oooO0OO.f13605OooO0o0).OooO0o(new OooO(oooO0OO, oooOo, ((OooOOOO.OooO0OO) oooo0OooO00o).OooO00o(oooOo00)));
                        oooOO0.OooO00o(null);
                    }
                    break;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    oooOO0.OooO00o(e);
                    return;
                }
            case 1:
                ((AbstractC1003d2) this.f13597OooOo0o).m561a((String) this.f13595OooOo, (C0993c2) this.f13599OooOoO0, (JSONObject) this.f13598OooOoO);
                break;
            case 2:
                ((C1012e1) this.f13597OooOo0o).m664a((C0962a) this.f13595OooOo, (Activity) this.f13599OooOoO0, (String) this.f13598OooOoO);
                break;
            case 3:
                ((C1060j) this.f13597OooOo0o).m1023a((C1060j.b) this.f13595OooOo, (String) this.f13599OooOoO0, (String) this.f13598OooOoO);
                break;
            case 4:
                ((C1093m2) this.f13597OooOo0o).m1447a((ViewGroup) this.f13595OooOo, (Activity) this.f13599OooOoO0, (AppLovinFullscreenAdViewObserver) this.f13598OooOoO);
                break;
            case 5:
                ((MaxFullscreenAdImpl) this.f13597OooOo0o).m1611a((Activity) this.f13595OooOo, (Context) this.f13599OooOoO0, (EnumC1050i) this.f13598OooOoO);
                break;
            case 6:
                ((MaxFullscreenAdImpl) this.f13597OooOo0o).m1622a((String) this.f13595OooOo, (String) this.f13599OooOoO0, (Activity) this.f13598OooOoO);
                break;
            case 7:
                ((C1164a) this.f13597OooOo0o).m2105a((FormError) this.f13595OooOo, (C1071k0) this.f13599OooOoO0, (C1164a.a) this.f13598OooOoO);
                break;
            case 8:
                ((C1167q1) this.f13597OooOo0o).m2148a((String) this.f13595OooOo, (String) this.f13599OooOoO0, (Throwable) this.f13598OooOoO);
                break;
            case 9:
                AbstractC1168q2.m2204b((AppLovinAdViewEventListener) this.f13597OooOo0o, (AppLovinAd) this.f13595OooOo, (AppLovinAdView) this.f13599OooOoO0, (AppLovinAdViewDisplayErrorCode) this.f13598OooOoO);
                break;
            case 10:
                ((EventServiceImpl) this.f13597OooOo0o).m2458b((String) this.f13595OooOo, (Map) this.f13599OooOoO0, (Map) this.f13598OooOoO);
                break;
            case 11:
                ((C1212c) this.f13597OooOo0o).m2664a((File) this.f13595OooOo, (C1212c.c) this.f13599OooOoO0, (C1212c.a) this.f13598OooOoO);
                break;
            case 12:
                ImageViewUtils.m3259a((String) this.f13597OooOo0o, (C1220k) this.f13595OooOo, (ImageView) this.f13599OooOoO0, (Uri) this.f13598OooOoO);
                break;
            case 13:
                C2984bt.m8007a((InterfaceC3710ts) this.f13597OooOo0o, (Context) this.f13595OooOo, (C3780vs) this.f13599OooOoO0, (Context) this.f13598OooOoO);
                break;
            case 14:
                FlutterFirebaseAnalyticsPlugin.handleSetUserProperty$lambda$7((FlutterFirebaseAnalyticsPlugin) this.f13597OooOo0o, (String) this.f13595OooOo, (String) this.f13599OooOoO0, (TaskCompletionSource) this.f13598OooOoO);
                break;
            case 15:
                ((FlutterFirebaseCorePlugin) this.f13597OooOo0o).lambda$initializeApp$3((GeneratedAndroidFirebaseCore.CoreFirebaseOptions) this.f13595OooOo, (String) this.f13599OooOoO0, (TaskCompletionSource) this.f13598OooOoO);
                break;
            case 16:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f13597OooOo0o).lambda$onFormResubmission$19((WebView) this.f13595OooOo, (Message) this.f13599OooOoO0, (Message) this.f13598OooOoO);
                break;
            case 17:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f13597OooOo0o).lambda$onReceivedSslError$29((WebView) this.f13595OooOo, (SslErrorHandler) this.f13599OooOoO0, (SslError) this.f13598OooOoO);
                break;
            case 18:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f13597OooOo0o).lambda$onReceivedError$7((WebView) this.f13595OooOo, (WebResourceRequest) this.f13599OooOoO0, (WebResourceErrorCompat) this.f13598OooOoO);
                break;
            case 19:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f13597OooOo0o).lambda$onReceivedHttpError$5((WebView) this.f13595OooOo, (WebResourceRequest) this.f13599OooOoO0, (WebResourceResponse) this.f13598OooOoO);
                break;
            case 20:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f13597OooOo0o).lambda$onFormResubmission$19((WebView) this.f13595OooOo, (Message) this.f13599OooOoO0, (Message) this.f13598OooOoO);
                break;
            case 21:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f13597OooOo0o).lambda$onReceivedSslError$29((WebView) this.f13595OooOo, (SslErrorHandler) this.f13599OooOoO0, (SslError) this.f13598OooOoO);
                break;
            case 22:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f13597OooOo0o).lambda$onReceivedError$7((WebView) this.f13595OooOo, (WebResourceRequest) this.f13599OooOoO0, (WebResourceError) this.f13598OooOoO);
                break;
            case 23:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f13597OooOo0o).lambda$onReceivedHttpError$5((WebView) this.f13595OooOo, (WebResourceRequest) this.f13599OooOoO0, (WebResourceResponse) this.f13598OooOoO);
                break;
            case 24:
                o000O0Oo.OooO0o oooO0o = (o000O0Oo.OooO0o) this.f13597OooOo0o;
                String str3 = (String) ((AtomicMarkableReference) oooO0o.f30142OooOoo).getReference();
                String str4 = (String) this.f13595OooOo;
                OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f30136OooOo;
                if (str3 != null) {
                    oooOOO0.OooOO0(str4, (String) ((AtomicMarkableReference) oooO0o.f30142OooOoo).getReference());
                }
                Map map = (Map) this.f13599OooOoO0;
                if (!map.isEmpty()) {
                    oooOOO0.OooO0oo(str4, map, false);
                }
                List list = (List) this.f13598OooOoO;
                if (!list.isEmpty()) {
                    oooOOO0.OooO(str4, list);
                    break;
                }
                break;
            case 25:
                IronSourceNativeAdAdapter.loadNativeAdForBidding$lambda$0((IronSourceNativeAdAdapter) this.f13597OooOo0o, (JSONObject) this.f13595OooOo, (NativeAdSmashListener) this.f13599OooOoO0, (String) this.f13598OooOoO);
                break;
            case 26:
                LevelPlayNativeAd.m10055a((LevelPlayNativeAd) this.f13597OooOo0o, (AdapterNativeAdData) this.f13595OooOo, (AdapterNativeAdViewBinder) this.f13599OooOoO0, (AdInfo) this.f13598OooOoO);
                break;
            case 27:
                ((Oooo000) this.f13597OooOo0o).f30970OooO00o.error((String) this.f13595OooOo, (String) this.f13599OooOoO0, this.f13598OooOoO);
                break;
            default:
                ((o000O00O) this.f13597OooOo0o).f31002OooO00o.error((String) this.f13595OooOo, (String) this.f13599OooOoO0, this.f13598OooOoO);
                break;
        }
    }
}
