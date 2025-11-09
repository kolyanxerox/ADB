package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsInitializationListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28654OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f28655OooOo0o;

    public /* synthetic */ OooO00o(IUnityAdsInitializationListener iUnityAdsInitializationListener, int i) {
        this.f28654OooOo0O = i;
        this.f28655OooOo0o = iUnityAdsInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28654OooOo0O) {
            case 0:
                UnityAdsImplementation.lambda$initialize$0(this.f28655OooOo0o);
                break;
            default:
                this.f28655OooOo0o.onInitializationComplete();
                break;
        }
    }
}
