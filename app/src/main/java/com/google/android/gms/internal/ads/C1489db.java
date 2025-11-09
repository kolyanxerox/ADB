package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.db */
/* loaded from: classes2.dex */
public final class C1489db extends Oooo0o.OooO {
    @Override // Oooo0o.OooO
    public final /* synthetic */ Object OooO0OO(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2225x9 ? (InterfaceC2225x9) iInterfaceQueryLocalInterface : new C2151v9(iBinder);
    }
}
