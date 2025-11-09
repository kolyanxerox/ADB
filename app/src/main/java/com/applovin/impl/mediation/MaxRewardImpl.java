package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a */
    private final String f1247a;

    /* renamed from: b */
    private final int f1248b;

    private MaxRewardImpl(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f1247a = str;
        this.f1248b = i;
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f1248b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f1247a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxReward{amount=");
        sb.append(this.f1248b);
        sb.append(", label=");
        return OooO0oO.OooOo.OooOOOo(sb, this.f1247a, "}");
    }
}
