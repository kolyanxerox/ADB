package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.cb */
/* loaded from: classes2.dex */
public final class C1452cb extends Oooo0o.OooO {
    @Override // Oooo0o.OooO
    public final /* synthetic */ Object OooO0OO(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2003r9 ? (InterfaceC2003r9) iInterfaceQueryLocalInterface : new C1929p9(iBinder);
    }
}
