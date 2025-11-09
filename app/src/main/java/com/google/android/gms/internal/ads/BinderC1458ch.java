package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* renamed from: com.google.android.gms.internal.ads.ch */
/* loaded from: classes2.dex */
public final class BinderC1458ch extends AbstractBinderC2004ra {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final NativeAd.OnNativeAdLoadedListener f17998OooOo0O;

    public BinderC1458ch(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.f17998OooOo0O = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2041sa
    public final void OoooOOO(InterfaceC1379ab interfaceC1379ab) {
        this.f17998OooOo0O.onNativeAdLoaded(new C2232xg(interfaceC1379ab));
    }
}
