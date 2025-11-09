package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;

/* loaded from: classes.dex */
public final /* synthetic */ class o000OO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewAdListener f15759OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15760OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f15761OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ MaxAd f15762OooOoO0;

    public /* synthetic */ o000OO(boolean z, MaxAdViewAdListener maxAdViewAdListener, MaxAd maxAd, int i) {
        this.f15760OooOo0O = i;
        this.f15761OooOo0o = z;
        this.f15759OooOo = maxAdViewAdListener;
        this.f15762OooOoO0 = maxAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15760OooOo0O) {
            case 0:
                AbstractC1168q2.m2224b(this.f15761OooOo0o, this.f15759OooOo, this.f15762OooOoO0);
                break;
            default:
                AbstractC1168q2.m2241d(this.f15761OooOo0o, this.f15759OooOo, this.f15762OooOoO0);
                break;
        }
    }
}
