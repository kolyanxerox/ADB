package com.ironsource;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ironsource.bd */
/* loaded from: classes2.dex */
public final class C2968bd implements InterfaceC3462np {

    /* renamed from: a */
    private InterfaceC3003cd f7595a;

    /* renamed from: b */
    private WeakReference<InterfaceC3038dd> f7596b = new WeakReference<>(null);

    /* renamed from: com.ironsource.bd$a */
    public static final class a {

        /* renamed from: a */
        public static final a f7597a = new a();

        /* renamed from: b */
        public static final String f7598b = "impressions";

        private a() {
        }
    }

    /* renamed from: a */
    public final void m7912a(InterfaceC3003cd loadListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadListener, "loadListener");
        this.f7595a = loadListener;
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialAdRewarded(String str, int i) {
        InterfaceC3038dd interfaceC3038dd = this.f7596b.get();
        if (interfaceC3038dd != null) {
            interfaceC3038dd.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialClick() {
        InterfaceC3038dd interfaceC3038dd = this.f7596b.get();
        if (interfaceC3038dd != null) {
            interfaceC3038dd.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialClose() {
        InterfaceC3038dd interfaceC3038dd = this.f7596b.get();
        if (interfaceC3038dd != null) {
            interfaceC3038dd.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterfaceC3038dd interfaceC3038dd;
        if (!kotlin.jvm.internal.OooOo.OooO00o(str, "impressions") || (interfaceC3038dd = this.f7596b.get()) == null) {
            return;
        }
        interfaceC3038dd.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialInitFailed(String str) {
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialLoadFailed(String description) {
        kotlin.jvm.internal.OooOo.OooO0o0(description, "description");
        InterfaceC3003cd interfaceC3003cd = this.f7595a;
        if (interfaceC3003cd != null) {
            interfaceC3003cd.mo8111a(description);
        }
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialLoadSuccess(C3907zj adInstance) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        InterfaceC3003cd interfaceC3003cd = this.f7595a;
        if (interfaceC3003cd != null) {
            interfaceC3003cd.mo8110a(adInstance);
        }
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialOpen() {
        InterfaceC3038dd interfaceC3038dd = this.f7596b.get();
        if (interfaceC3038dd != null) {
            interfaceC3038dd.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialShowFailed(String str) {
        InterfaceC3038dd interfaceC3038dd = this.f7596b.get();
        if (interfaceC3038dd != null) {
            interfaceC3038dd.mo8295a(str);
        }
    }

    @Override // com.ironsource.InterfaceC3462np
    public void onInterstitialShowSuccess() {
    }

    /* renamed from: a */
    public final void m7913a(InterfaceC3038dd showListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(showListener, "showListener");
        this.f7596b = new WeakReference<>(showListener);
    }
}
