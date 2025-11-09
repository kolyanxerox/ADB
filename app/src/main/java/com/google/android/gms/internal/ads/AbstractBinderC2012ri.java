package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* renamed from: com.google.android.gms.internal.ads.ri */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2012ri extends AbstractBinderC2181w2 implements InterfaceC2049si {
    public AbstractBinderC2012ri() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC2218x2.OooO00o(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            o0000Oo0(parcelFileDescriptor);
        } else if (i == 2) {
            zzbb zzbbVar = (zzbb) AbstractC2218x2.OooO00o(parcel, zzbb.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            o0000O00(zzbbVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) AbstractC2218x2.OooO00o(parcel, ParcelFileDescriptor.CREATOR);
            C2197wi c2197wi = (C2197wi) AbstractC2218x2.OooO00o(parcel, C2197wi.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            o0Oo0oo(parcelFileDescriptor2, c2197wi);
        }
        parcel2.writeNoException();
        return true;
    }
}
