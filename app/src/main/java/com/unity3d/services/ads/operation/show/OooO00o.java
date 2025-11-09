package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsShowError f28659OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28660OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ ShowOperationState f28661OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f28662OooOoO0;

    public /* synthetic */ OooO00o(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str, int i) {
        this.f28660OooOo0O = i;
        this.f28661OooOo0o = showOperationState;
        this.f28659OooOo = unityAdsShowError;
        this.f28662OooOoO0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28660OooOo0O) {
            case 0:
                this.f28661OooOo0o.onUnityAdsShowFailure(this.f28659OooOo, this.f28662OooOoO0);
                break;
            default:
                this.f28661OooOo0o.lambda$onUnityAdsShowFailure$0(this.f28659OooOo, this.f28662OooOoO0);
                break;
        }
    }
}
