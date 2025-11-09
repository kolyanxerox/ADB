package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.a4 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1372a4 extends AbstractBinderC2181w2 implements InterfaceC1409b4 {
    public AbstractBinderC1372a4() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2256y3 c2219x3;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c2219x3 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c2219x3 = iInterfaceQueryLocalInterface instanceof InterfaceC2256y3 ? (InterfaceC2256y3) iInterfaceQueryLocalInterface : new C2219x3(strongBinder);
            }
            AbstractC2218x2.OooO0O0(parcel);
            OooOo00(c2219x3);
        } else if (i == 2) {
            parcel.readInt();
            AbstractC2218x2.OooO0O0(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            o0000oOO(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
