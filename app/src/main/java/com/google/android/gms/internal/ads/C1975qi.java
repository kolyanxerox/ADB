package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* renamed from: com.google.android.gms.internal.ads.qi */
/* loaded from: classes2.dex */
public final class C1975qi extends AbstractC2144v2 implements InterfaceC2049si {
    public C1975qi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2049si
    public final void o0000O00(zzbb zzbbVar) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, zzbbVar);
        o000OO0O(parcelOooO, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2049si
    public final void o0000Oo0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, parcelFileDescriptor);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2049si
    public final void o0Oo0oo(ParcelFileDescriptor parcelFileDescriptor, C2197wi c2197wi) {
        Parcel parcelOooO = OooO();
        AbstractC2218x2.OooO0OO(parcelOooO, parcelFileDescriptor);
        AbstractC2218x2.OooO0OO(parcelOooO, c2197wi);
        o000OO0O(parcelOooO, 3);
    }
}
