package com.applovin.impl.mediation.ads;

import com.applovin.impl.C1293y2;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C1293y2 f15680OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15681OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ MaxAdViewImpl f15682OooOo0o;

    public /* synthetic */ OooO0O0(MaxAdViewImpl maxAdViewImpl, C1293y2 c1293y2, int i) {
        this.f15681OooOo0O = i;
        this.f15682OooOo0o = maxAdViewImpl;
        this.f15680OooOo = c1293y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15681OooOo0O) {
            case 0:
                this.f15682OooOo0o.m1579a(this.f15680OooOo);
                break;
            default:
                this.f15682OooOo0o.m1587b(this.f15680OooOo);
                break;
        }
    }
}
