package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* renamed from: com.google.android.gms.internal.ads.dh */
/* loaded from: classes2.dex */
public final class BinderC1495dh extends AbstractBinderC2226xa {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final NativeAd.UnconfirmedClickListener f18251OooOo0O;

    public BinderC1495dh(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
        this.f18251OooOo0O = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2263ya
    public final void zze() {
        this.f18251OooOo0O.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2263ya
    public final void zzf(String str) {
        this.f18251OooOo0O.onUnconfirmedClickReceived(str);
    }
}
