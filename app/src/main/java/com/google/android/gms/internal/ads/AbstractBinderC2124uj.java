package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.uj */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2124uj extends AbstractBinderC2181w2 implements InterfaceC2161vj {
    public AbstractBinderC2124uj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1939pj c1903oj;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1903oj = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c1903oj = iInterfaceQueryLocalInterface instanceof InterfaceC1939pj ? (InterfaceC1939pj) iInterfaceQueryLocalInterface : new C1903oj(strongBinder);
                }
                AbstractC2218x2.OooO0O0(parcel);
                Oooo00o(c1903oj);
                break;
            case 4:
                int i2 = parcel.readInt();
                AbstractC2218x2.OooO0O0(parcel);
                OooOO0O(i2);
                break;
            case 5:
                zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
                AbstractC2218x2.OooO0O0(parcel);
                o00ooo(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
