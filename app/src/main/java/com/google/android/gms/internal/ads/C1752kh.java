package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.kh */
/* loaded from: classes2.dex */
public final class C1752kh extends Oooo0o.OooO {
    @Override // Oooo0o.OooO
    public final /* synthetic */ Object OooO0OO(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1974qh ? (InterfaceC1974qh) iInterfaceQueryLocalInterface : new C1901oh(iBinder);
    }
}
