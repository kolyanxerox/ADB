package com.applovin.impl;

import com.applovin.impl.C0954a1;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinPostbackListener;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f15573OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15574OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f15575OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f15576OooOoO0;

    public /* synthetic */ OooO00o(int i, Object obj, int i2, Object obj2) {
        this.f15574OooOo0O = i2;
        this.f15573OooOo = obj;
        this.f15576OooOoO0 = obj2;
        this.f15575OooOo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15574OooOo0O) {
            case 0:
                ((C0954a1) this.f15573OooOo).m78b((C0954a1.c) this.f15576OooOoO0, this.f15575OooOo0o);
                break;
            case 1:
                AbstractC1168q2.m2220b((AppLovinPostbackListener) this.f15573OooOo, (String) this.f15576OooOoO0, this.f15575OooOo0o);
                break;
            default:
                AbstractC1168q2.m2214b((AppLovinAdRewardListener) this.f15573OooOo, (AppLovinAd) this.f15576OooOoO0, this.f15575OooOo0o);
                break;
        }
    }
}
