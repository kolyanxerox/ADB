package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15851OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15852OooOo0o;

    public /* synthetic */ OooO0O0(Object obj, int i) {
        this.f15851OooOo0O = i;
        this.f15852OooOo0o = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15851OooOo0O) {
            case 0:
                ((AppLovinVastMediaView.C1231e) this.f15852OooOo0o).m3060a();
                break;
            case 1:
                ((AppLovinVastMediaView.ViewOnClickListenerC1232f) this.f15852OooOo0o).m3061a();
                break;
            default:
                ((AppLovinNativeAdImpl) this.f15852OooOo0o).lambda$unregisterViewsForInteraction$0();
                break;
        }
    }
}
