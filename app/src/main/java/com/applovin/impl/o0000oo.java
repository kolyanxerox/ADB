package com.applovin.impl;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class o0000oo implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AppLovinAd f15737OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15738OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AppLovinAdRewardListener f15739OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Map f15740OooOoO0;

    public /* synthetic */ o0000oo(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map, int i) {
        this.f15738OooOo0O = i;
        this.f15739OooOo0o = appLovinAdRewardListener;
        this.f15737OooOo = appLovinAd;
        this.f15740OooOoO0 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15738OooOo0O) {
            case 0:
                AbstractC1168q2.m2250f(this.f15739OooOo0o, this.f15737OooOo, this.f15740OooOoO0);
                break;
            case 1:
                AbstractC1168q2.m2245e(this.f15739OooOo0o, this.f15737OooOo, this.f15740OooOoO0);
                break;
            default:
                AbstractC1168q2.m2239d(this.f15739OooOo0o, this.f15737OooOo, this.f15740OooOoO0);
                break;
        }
    }
}
