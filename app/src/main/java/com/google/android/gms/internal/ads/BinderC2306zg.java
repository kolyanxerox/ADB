package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* renamed from: com.google.android.gms.internal.ads.zg */
/* loaded from: classes2.dex */
public final class BinderC2306zg extends AbstractBinderC1782la {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ C1385ah f26161OooOo0O;

    @Override // com.google.android.gms.internal.ads.InterfaceC1819ma
    public final void o000oOoO(InterfaceC1415ba interfaceC1415ba) {
        C1422bh c1422bh;
        C1385ah c1385ah = this.f26161OooOo0O;
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener = c1385ah.f17036OooO00o;
        synchronized (c1385ah) {
            c1422bh = c1385ah.f17038OooO0OO;
            if (c1422bh == null) {
                c1422bh = new C1422bh(interfaceC1415ba);
                c1385ah.f17038OooO0OO = c1422bh;
            }
        }
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(c1422bh);
    }
}
