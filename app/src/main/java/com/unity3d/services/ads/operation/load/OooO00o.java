package com.unity3d.services.ads.operation.load;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28657OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LoadOperationState f28658OooOo0o;

    public /* synthetic */ OooO00o(LoadOperationState loadOperationState, int i) {
        this.f28657OooOo0O = i;
        this.f28658OooOo0o = loadOperationState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28657OooOo0O) {
            case 0:
                LoadModuleDecoratorTimeout.lambda$onOperationTimeout$0(this.f28658OooOo0o);
                break;
            default:
                this.f28658OooOo0o.lambda$onUnityAdsAdLoaded$1();
                break;
        }
    }
}
