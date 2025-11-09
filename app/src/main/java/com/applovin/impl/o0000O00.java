package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class o0000O00 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f15723OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15724OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f15725OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ MaxAd f15726OooOoO0;

    public /* synthetic */ o0000O00(boolean z, MaxAdListener maxAdListener, MaxAd maxAd, int i) {
        this.f15724OooOo0O = i;
        this.f15725OooOo0o = z;
        this.f15723OooOo = maxAdListener;
        this.f15726OooOoO0 = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15724OooOo0O) {
            case 0:
                AbstractC1168q2.m2194a(this.f15725OooOo0o, this.f15723OooOo, this.f15726OooOoO0);
                break;
            case 1:
                AbstractC1168q2.m2251f(this.f15725OooOo0o, this.f15723OooOo, this.f15726OooOoO0);
                break;
            case 2:
                AbstractC1168q2.m2246e(this.f15725OooOo0o, this.f15723OooOo, this.f15726OooOoO0);
                break;
            default:
                AbstractC1168q2.m2233c(this.f15725OooOo0o, this.f15723OooOo, this.f15726OooOoO0);
                break;
        }
    }
}
