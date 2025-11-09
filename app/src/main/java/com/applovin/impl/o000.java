package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class o000 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ MaxNativeAdListener f15693OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15694OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f15695OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ MaxAd f15696OooOoO0;

    public /* synthetic */ o000(boolean z, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, int i) {
        this.f15694OooOo0O = i;
        this.f15695OooOo0o = z;
        this.f15693OooOo = maxNativeAdListener;
        this.f15696OooOoO0 = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15694OooOo0O) {
            case 0:
                AbstractC1168q2.m2200a(this.f15695OooOo0o, this.f15693OooOo, this.f15696OooOoO0);
                break;
            default:
                AbstractC1168q2.m2225b(this.f15695OooOo0o, this.f15693OooOo, this.f15696OooOoO0);
                break;
        }
    }
}
