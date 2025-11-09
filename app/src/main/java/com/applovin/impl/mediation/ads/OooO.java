package com.applovin.impl.mediation.ads;

import com.applovin.impl.C1302z2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15675OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15676OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f15677OooOo0o;

    public /* synthetic */ OooO(int i, Object obj, Object obj2) {
        this.f15676OooOo0O = i;
        this.f15677OooOo0o = obj;
        this.f15675OooOo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15676OooOo0O) {
            case 0:
                ((MaxNativeAdLoaderImpl.C1115c) this.f15677OooOo0o).m1668a((MaxAd) this.f15675OooOo);
                break;
            case 1:
                ((MaxFullscreenAdImpl) this.f15677OooOo0o).m1619a((Long) this.f15675OooOo);
                break;
            case 2:
                ((MaxFullscreenAdImpl.C1111b) this.f15677OooOo0o).m1649a((MaxAd) this.f15675OooOo);
                break;
            default:
                ((MaxFullscreenAdImpl.C1111b) this.f15677OooOo0o).m1647a((C1302z2) this.f15675OooOo);
                break;
        }
    }
}
