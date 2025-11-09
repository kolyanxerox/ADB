package io.flutter.plugins.inapppurchase;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.inapppurchase.Messages;

/* loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements BasicMessageChannel.Reply {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f28771OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Messages.VoidResult f28772OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ String f28773OooO0OO;

    public /* synthetic */ OooO0OO(Messages.VoidResult voidResult, String str, int i) {
        this.f28771OooO00o = i;
        this.f28772OooO0O0 = voidResult;
        this.f28773OooO0OO = str;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        switch (this.f28771OooO00o) {
            case 0:
                Messages.InAppPurchaseCallbackApi.lambda$onBillingServiceDisconnected$0(this.f28772OooO0O0, this.f28773OooO0OO, obj);
                break;
            case 1:
                Messages.InAppPurchaseCallbackApi.lambda$onPurchasesUpdated$1(this.f28772OooO0O0, this.f28773OooO0OO, obj);
                break;
            default:
                Messages.InAppPurchaseCallbackApi.lambda$userSelectedalternativeBilling$2(this.f28772OooO0O0, this.f28773OooO0OO, obj);
                break;
        }
    }
}
