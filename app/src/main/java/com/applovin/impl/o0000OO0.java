package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdDisplayListener;

/* loaded from: classes.dex */
public final /* synthetic */ class o0000OO0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f15731OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15732OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdDisplayListener f15733OooOo0o;

    public /* synthetic */ o0000OO0(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd, int i) {
        this.f15732OooOo0O = i;
        this.f15733OooOo0o = appLovinAdDisplayListener;
        this.f15731OooOo = appLovinAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15732OooOo0O) {
            case 0:
                AbstractC1168q2.m2238d(this.f15733OooOo0o, this.f15731OooOo);
                break;
            default:
                AbstractC1168q2.m2229c(this.f15733OooOo0o, this.f15731OooOo);
                break;
        }
    }
}
