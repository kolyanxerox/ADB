package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* renamed from: com.google.android.gms.internal.ads.yj */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2272yj extends AbstractBinderC2181w2 implements InterfaceC2309zj {
    public AbstractBinderC2272yj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            int i2 = parcel.readInt();
            AbstractC2218x2.OooO0O0(parcel);
            zze(i2);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) AbstractC2218x2.OooO00o(parcel, zze.CREATOR);
            AbstractC2218x2.OooO0O0(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
