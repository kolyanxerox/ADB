package com.ironsource.mediationsdk.model;

import com.ironsource.C3463nq;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes2.dex */
public final class Placement extends BasePlacement {

    /* renamed from: e */
    private String f9952e;

    /* renamed from: f */
    private int f9953f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(int i, String placementName, boolean z, String rewardName, int i2, C3463nq c3463nq) {
        super(i, placementName, z, c3463nq);
        OooOo.OooO0o0(placementName, "placementName");
        OooOo.OooO0o0(rewardName, "rewardName");
        this.f9953f = i2;
        this.f9952e = rewardName;
    }

    public final int getRewardAmount() {
        return this.f9953f;
    }

    public final String getRewardName() {
        return this.f9952e;
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    public String toString() {
        return super.toString() + ", reward name: " + this.f9952e + " , amount: " + this.f9953f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Placement(BasePlacement placement) {
        super(placement.getPlacementId(), placement.getPlacementName(), placement.isDefault(), placement.getPlacementAvailabilitySettings());
        OooOo.OooO0o0(placement, "placement");
        this.f9952e = "";
    }
}
