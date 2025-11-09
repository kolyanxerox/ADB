package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.p008h5.OnH5AdsEventListener;

/* renamed from: com.google.android.gms.internal.ads.dc */
/* loaded from: classes2.dex */
public final class BinderC1490dc extends AbstractBinderC2181w2 implements InterfaceC1563fc {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OnH5AdsEventListener f18233OooOo0O;

    public BinderC1490dc(OnH5AdsEventListener onH5AdsEventListener) {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        this.f18233OooOo0O = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        AbstractC2218x2.OooO0O0(parcel);
        zzb(string);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1563fc
    public final void zzb(String str) {
        this.f18233OooOo0O.onH5AdsEvent(str);
    }
}
