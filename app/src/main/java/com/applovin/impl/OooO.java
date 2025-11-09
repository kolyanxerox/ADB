package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.hardware.SensorEventListener;
import android.webkit.WebView;
import com.applovin.impl.C0987b6;
import com.applovin.impl.C1043h2;
import com.applovin.impl.C1170q4;
import com.applovin.impl.C1294y3;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p005ad.AbstractC1207b;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* renamed from: OooOo */
    public final /* synthetic */ Object f15570OooOo;

    /* renamed from: OooOo0O */
    public final /* synthetic */ int f15571OooOo0O;

    /* renamed from: OooOo0o */
    public final /* synthetic */ Object f15572OooOo0o;

    public /* synthetic */ OooO(int i, Object obj, Object obj2) {
        this.f15571OooOo0O = i;
        this.f15572OooOo0o = obj;
        this.f15570OooOo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15571OooOo0O) {
            case 0:
                ((ScheduledThreadPoolExecutor) this.f15572OooOo0o).execute((C0987b6.e) this.f15570OooOo);
                break;
            case 1:
                ((C1043h2.b) this.f15572OooOo0o).m877a((AppLovinAd) this.f15570OooOo);
                break;
            case 2:
                C1294y3.b.m3743a((C1294y3.c) this.f15572OooOo0o, (C1294y3.d) this.f15570OooOo);
                break;
            case 3:
                ((AbstractC0995c4) this.f15572OooOo0o).m462b((WebView) this.f15570OooOo);
                break;
            case 4:
                ((AbstractC0995c4) this.f15572OooOo0o).m459a((String) this.f15570OooOo);
                break;
            case 5:
                ((C1007d6) this.f15572OooOo0o).m607b((MaxErrorImpl) this.f15570OooOo);
                break;
            case 6:
                ((C1009d8) this.f15572OooOo0o).m645a((WeakReference) this.f15570OooOo);
                break;
            case 7:
                ((C1021f0) this.f15572OooOo0o).m708a((SensorEventListener) this.f15570OooOo);
                break;
            case 8:
                ((C1056i5) this.f15572OooOo0o).m1003a((C1044h3) this.f15570OooOo);
                break;
            case 9:
                ((C1059i8) this.f15572OooOo0o).m1016c((String) this.f15570OooOo);
                break;
            case 10:
                ((C1059i8) this.f15572OooOo0o).m1013b((WebView) this.f15570OooOo);
                break;
            case 11:
                ((AbstractActivityC1064j3) this.f15572OooOo0o).m1040a((Context) this.f15570OooOo);
                break;
            case 12:
                AbstractC1078k7.m1184a((Context) this.f15572OooOo0o, (String) this.f15570OooOo);
                break;
            case 13:
                ((C1093m2) this.f15572OooOo0o).m1461b((AbstractC1207b) this.f15570OooOo);
                break;
            case 14:
                ((C1093m2) this.f15572OooOo0o).m1446a((Context) this.f15570OooOo);
                break;
            case 15:
                ((C1093m2) this.f15572OooOo0o).m1455a((AppLovinAd) this.f15570OooOo);
                break;
            case 16:
                AbstractC1168q2.m2211b((AppLovinAdClickListener) this.f15572OooOo0o, (AppLovinAd) this.f15570OooOo);
                break;
            case 17:
                AbstractC1168q2.m2219b((AppLovinPostbackListener) this.f15572OooOo0o, (String) this.f15570OooOo);
                break;
            case 18:
                AbstractC1168q2.m2216b((AppLovinAdVideoPlaybackListener) this.f15572OooOo0o, (AppLovinAd) this.f15570OooOo);
                break;
            case 19:
                AbstractC1168q2.m2213b((InterfaceC1073k2) this.f15572OooOo0o, (String) this.f15570OooOo);
                break;
            case 20:
                AbstractC1168q2.m2160a((AppLovinNativeAdEventListener) this.f15572OooOo0o, (AppLovinNativeAd) this.f15570OooOo);
                break;
            case 21:
                AbstractC1168q2.m2161a((AppLovinNativeAdLoadListener) this.f15572OooOo0o, (AppLovinError) this.f15570OooOo);
                break;
            case 22:
                ((C1170q4) this.f15572OooOo0o).m2260a((C1170q4.b) this.f15570OooOo);
                break;
            case 23:
                ((C1246t0) this.f15572OooOo0o).m3269a((Activity) this.f15570OooOo);
                break;
            default:
                ((C1301z1) this.f15572OooOo0o).m3839h((String) this.f15570OooOo);
                break;
        }
    }
}
