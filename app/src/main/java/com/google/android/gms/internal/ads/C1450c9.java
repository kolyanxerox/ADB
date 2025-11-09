package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.c9 */
/* loaded from: classes2.dex */
public final class C1450c9 extends AbstractC2144v2 implements InterfaceC1523e9 {
    public C1450c9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1523e9
    public final String zzg() {
        Parcel parcelOooOOO = OooOOO(OooO(), 2);
        String string = parcelOooOOO.readString();
        parcelOooOOO.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1523e9
    public final ArrayList zzh() {
        Parcel parcelOooOOO = OooOOO(OooO(), 3);
        ArrayList arrayList = parcelOooOOO.readArrayList(AbstractC2218x2.f25497OooO00o);
        parcelOooOOO.recycle();
        return arrayList;
    }
}
