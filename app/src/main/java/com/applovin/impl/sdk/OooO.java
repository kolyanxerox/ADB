package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f15813OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f15814OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C1220k f15815OooOo0o;

    public /* synthetic */ OooO(C1220k c1220k, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i) {
        this.f15814OooOo0O = i;
        this.f15815OooOo0o = c1220k;
        this.f15813OooOo = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15814OooOo0O) {
            case 0:
                this.f15815OooOo0o.m2804a(this.f15813OooOo);
                break;
            default:
                this.f15815OooOo0o.m2808b(this.f15813OooOo);
                break;
        }
    }
}
