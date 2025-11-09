package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.sdk.AppLovinAd;

/* loaded from: classes.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f15697OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15698OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdViewEventListener f15699OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdView f15700OooOoO0;

    public /* synthetic */ o0000(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, int i) {
        this.f15698OooOo0O = i;
        this.f15699OooOo0o = appLovinAdViewEventListener;
        this.f15697OooOo = appLovinAd;
        this.f15700OooOoO0 = appLovinAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15698OooOo0O) {
            case 0:
                AbstractC1168q2.m2242e(this.f15699OooOo0o, this.f15697OooOo, this.f15700OooOoO0);
                break;
            case 1:
                AbstractC1168q2.m2247f(this.f15699OooOo0o, this.f15697OooOo, this.f15700OooOoO0);
                break;
            default:
                AbstractC1168q2.m2235d(this.f15699OooOo0o, this.f15697OooOo, this.f15700OooOoO0);
                break;
        }
    }
}
