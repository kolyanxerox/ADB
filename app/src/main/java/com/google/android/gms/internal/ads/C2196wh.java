package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wh */
/* loaded from: classes2.dex */
public final class C2196wh extends AbstractC2144v2 implements InterfaceC2270yh {
    @Override // com.google.android.gms.internal.ads.InterfaceC2270yh
    public final void Oooo000(List list) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeTypedList(list);
        o000OO0O(parcelOooO, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2270yh
    public final void zze(String str) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeString(str);
        o000OO0O(parcelOooO, 2);
    }
}
