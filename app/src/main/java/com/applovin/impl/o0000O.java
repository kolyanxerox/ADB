package com.applovin.impl;

import com.applovin.sdk.AppLovinBidTokenCollectionListener;

/* loaded from: classes.dex */
public final /* synthetic */ class o0000O implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f15715OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15716OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AppLovinBidTokenCollectionListener f15717OooOo0o;

    public /* synthetic */ o0000O(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str, int i) {
        this.f15716OooOo0O = i;
        this.f15717OooOo0o = appLovinBidTokenCollectionListener;
        this.f15715OooOo = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15716OooOo0O) {
            case 0:
                AbstractC1168q2.m2231c(this.f15717OooOo0o, this.f15715OooOo);
                break;
            default:
                AbstractC1168q2.m2240d(this.f15717OooOo0o, this.f15715OooOo);
                break;
        }
    }
}
