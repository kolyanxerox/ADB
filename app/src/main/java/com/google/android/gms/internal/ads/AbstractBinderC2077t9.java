package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.t9 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2077t9 extends AbstractBinderC2181w2 implements InterfaceC2114u9 {
    public AbstractBinderC2077t9() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static InterfaceC2114u9 zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2114u9 ? (InterfaceC2114u9) iInterfaceQueryLocalInterface : new C2040s9(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Oooo0o.OooO0O0 oooO0O0O000O0o0 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
            AbstractC2218x2.OooO0O0(parcel);
            zzc(oooO0O0O000O0o0);
        } else if (i == 2) {
            zzd();
        } else {
            if (i != 3) {
                return false;
            }
            Oooo0o.OooO0O0 oooO0O0O000O0o02 = Oooo0o.OooO0OO.o000O0o0(parcel.readStrongBinder());
            AbstractC2218x2.OooO0O0(parcel);
            zzb(oooO0O0O000O0o02);
        }
        parcel2.writeNoException();
        return true;
    }
}
