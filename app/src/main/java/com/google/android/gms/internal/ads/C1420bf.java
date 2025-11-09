package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.bf */
/* loaded from: classes2.dex */
public final class C1420bf extends AbstractC2144v2 implements InterfaceC1456cf {
    public C1420bf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1456cf
    public final Oooo0o.OooO0O0 zze() {
        return androidx.datastore.preferences.protobuf.OooO00o.OooO0OO(OooOOO(OooO(), 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1456cf
    public final boolean zzf() {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        ClassLoader classLoader = AbstractC2218x2.f25497OooO00o;
        boolean z = parcelOooOOO.readInt() != 0;
        parcelOooOOO.recycle();
        return z;
    }
}
