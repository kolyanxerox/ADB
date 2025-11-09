package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.rewarded.RewardItem;

/* renamed from: com.google.android.gms.internal.ads.gk */
/* loaded from: classes2.dex */
public final class BinderC1608gk extends AbstractBinderC2181w2 implements InterfaceC1939pj {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final String f19373OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final int f19374OooOo0o;

    public BinderC1608gk(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2181w2
    public final boolean o000OO0O(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f19373OooOo0O);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f19374OooOo0o);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939pj
    public final int zze() {
        return this.f19374OooOo0o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1939pj
    public final String zzf() {
        return this.f19373OooOo0O;
    }

    public BinderC1608gk(String str, int i) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f19373OooOo0O = str;
        this.f19374OooOo0o = i;
    }
}
