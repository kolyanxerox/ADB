package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wc */
/* loaded from: classes2.dex */
public final class C2191wc extends AbstractC2144v2 implements InterfaceC2265yc {
    @Override // com.google.android.gms.internal.ads.InterfaceC2265yc
    public final void zzb(List list) {
        Parcel parcelOooO = OooO();
        parcelOooO.writeTypedList(list);
        o000OO0O(parcelOooO, 1);
    }
}
