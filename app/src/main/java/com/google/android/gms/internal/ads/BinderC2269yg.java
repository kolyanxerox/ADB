package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* renamed from: com.google.android.gms.internal.ads.yg */
/* loaded from: classes2.dex */
public final class BinderC2269yg extends AbstractBinderC1672ia {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ C1385ah f25905OooOo0O;

    @Override // com.google.android.gms.internal.ads.InterfaceC1708ja
    public final void o0000OOO(InterfaceC1415ba interfaceC1415ba, String str) {
        C1422bh c1422bh;
        C1385ah c1385ah = this.f25905OooOo0O;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener = c1385ah.f17037OooO0O0;
        if (onCustomClickListener == null) {
            return;
        }
        synchronized (c1385ah) {
            c1422bh = c1385ah.f17038OooO0OO;
            if (c1422bh == null) {
                c1422bh = new C1422bh(interfaceC1415ba);
                c1385ah.f17038OooO0OO = c1422bh;
            }
        }
        onCustomClickListener.onCustomClick(c1422bh, str);
    }
}
