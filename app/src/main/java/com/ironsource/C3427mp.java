package com.ironsource;

import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.mp */
/* loaded from: classes2.dex */
public final class C3427mp implements InterfaceC3338lp {

    /* renamed from: a */
    private InterfaceC2632a6 f10316a;

    /* renamed from: b */
    private WeakReference<InterfaceC2996c6> f10317b = new WeakReference<>(null);

    /* renamed from: a */
    public final void m10883a(InterfaceC2632a6 loadListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(loadListener, "loadListener");
        this.f10316a = loadListener;
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerClick() {
        InterfaceC2996c6 interfaceC2996c6 = this.f10317b.get();
        if (interfaceC2996c6 != null) {
            interfaceC2996c6.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerInitFailed(String str) {
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerLoadFail(String description) {
        kotlin.jvm.internal.OooOo.OooO0o0(description, "description");
        InterfaceC2632a6 interfaceC2632a6 = this.f10316a;
        if (interfaceC2632a6 != null) {
            interfaceC2632a6.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerLoadSuccess(C3907zj adInstance, C3042dh adContainer) {
        kotlin.jvm.internal.OooOo.OooO0o0(adInstance, "adInstance");
        kotlin.jvm.internal.OooOo.OooO0o0(adContainer, "adContainer");
        InterfaceC2632a6 interfaceC2632a6 = this.f10316a;
        if (interfaceC2632a6 != null) {
            interfaceC2632a6.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.InterfaceC3338lp
    public void onBannerShowSuccess() {
        InterfaceC2996c6 interfaceC2996c6 = this.f10317b.get();
        if (interfaceC2996c6 != null) {
            interfaceC2996c6.onBannerShowSuccess();
        }
    }

    /* renamed from: a */
    public final void m10884a(InterfaceC2996c6 showListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(showListener, "showListener");
        this.f10317b = new WeakReference<>(showListener);
    }
}
