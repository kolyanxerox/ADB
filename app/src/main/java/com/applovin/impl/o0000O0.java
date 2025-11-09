package com.applovin.impl;

import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.ironsource.sdk.controller.C3657v;
import io.flutter.plugins.webviewflutter.WebViewClientProxyApi;
import java.util.Map;
import o000O00.o0o0Oo;

/* loaded from: classes.dex */
public final /* synthetic */ class o0000O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15718OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15719OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f15720OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ Object f15721OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15722OooOoO0;

    public /* synthetic */ o0000O0(WebViewClient webViewClient, WebView webView, String str, boolean z, int i) {
        this.f15719OooOo0O = i;
        this.f15721OooOoO = webViewClient;
        this.f15722OooOoO0 = webView;
        this.f15718OooOo = str;
        this.f15720OooOo0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15719OooOo0O) {
            case 0:
                String str = (String) this.f15718OooOo;
                AbstractC1168q2.m2202a(this.f15720OooOo0o, (MaxNativeAdListener) this.f15721OooOoO, str, (MaxError) this.f15722OooOoO0);
                break;
            case 1:
                String str2 = (String) this.f15718OooOo;
                AbstractC1168q2.m2197a(this.f15720OooOo0o, (MaxAdListener) this.f15721OooOoO, str2, (MaxError) this.f15722OooOoO0);
                break;
            case 2:
                MaxAd maxAd = (MaxAd) this.f15718OooOo;
                MaxAd maxAd2 = (MaxAd) this.f15722OooOoO0;
                AbstractC1168q2.m2193a(this.f15720OooOo0o, (MaxAdExpirationListener) this.f15721OooOoO, maxAd, maxAd2);
                break;
            case 3:
                MaxAd maxAd3 = (MaxAd) this.f15722OooOoO0;
                AbstractC1168q2.m2201a(this.f15720OooOo0o, (MaxNativeAdListener) this.f15721OooOoO, (MaxNativeAdView) this.f15718OooOo, maxAd3);
                break;
            case 4:
                MaxAd maxAd4 = (MaxAd) this.f15718OooOo;
                AbstractC1168q2.m2195a(this.f15720OooOo0o, (MaxAdListener) this.f15721OooOoO, maxAd4, (MaxError) this.f15722OooOoO0);
                break;
            case 5:
                AbstractC1168q2.m2196a(this.f15720OooOo0o, (MaxRewardedAdListener) this.f15721OooOoO, (MaxAd) this.f15718OooOo, (MaxReward) this.f15722OooOoO0);
                break;
            case 6:
                ((EventServiceImpl) this.f15721OooOoO).m2456a((String) this.f15718OooOo, (Map) this.f15722OooOoO0, this.f15720OooOo0o);
                break;
            case 7:
                ((C3657v.r) this.f15721OooOoO).m12244a(this.f15720OooOo0o, (String) this.f15718OooOo, (String) this.f15722OooOoO0);
                break;
            case 8:
                ((WebViewClientProxyApi.WebViewClientCompatImpl) this.f15721OooOoO).lambda$doUpdateVisitedHistory$15((WebView) this.f15722OooOoO0, (String) this.f15718OooOo, this.f15720OooOo0o);
                break;
            case 9:
                ((WebViewClientProxyApi.WebViewClientImpl) this.f15721OooOoO).lambda$doUpdateVisitedHistory$15((WebView) this.f15722OooOoO0, (String) this.f15718OooOo, this.f15720OooOo0o);
                break;
            default:
                o000O0Oo.OooO0o oooO0o = (o000O0Oo.OooO0o) this.f15721OooOoO;
                oooO0o.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((o000O0Oo.OooO0O0) oooO0o.f30136OooOo).OooO0Oo((o0o0Oo) this.f15718OooOo, ((o000Oo0.OooO0OO) this.f15722OooOoO0).f30338OooO00o, this.f15720OooOo0o);
                break;
        }
    }

    public /* synthetic */ o0000O0(C3657v.r rVar, boolean z, String str, String str2) {
        this.f15719OooOo0O = 7;
        this.f15721OooOoO = rVar;
        this.f15720OooOo0o = z;
        this.f15718OooOo = str;
        this.f15722OooOoO0 = str2;
    }

    public /* synthetic */ o0000O0(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f15719OooOo0O = i;
        this.f15721OooOoO = obj;
        this.f15718OooOo = obj2;
        this.f15722OooOoO0 = obj3;
        this.f15720OooOo0o = z;
    }

    public /* synthetic */ o0000O0(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.f15719OooOo0O = i;
        this.f15720OooOo0o = z;
        this.f15721OooOoO = obj;
        this.f15718OooOo = obj2;
        this.f15722OooOoO0 = obj3;
    }
}
