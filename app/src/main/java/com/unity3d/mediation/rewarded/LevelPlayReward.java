package com.unity3d.mediation.rewarded;

import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class LevelPlayReward {

    /* renamed from: a */
    private final String f13165a;

    /* renamed from: b */
    private final int f13166b;

    public LevelPlayReward(String name, int i) {
        OooOo.OooO0o0(name, "name");
        this.f13165a = name;
        this.f13166b = i;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = levelPlayReward.f13165a;
        }
        if ((i2 & 2) != 0) {
            i = levelPlayReward.f13166b;
        }
        return levelPlayReward.copy(str, i);
    }

    public final String component1() {
        return this.f13165a;
    }

    public final int component2() {
        return this.f13166b;
    }

    public final LevelPlayReward copy(String name, int i) {
        OooOo.OooO0o0(name, "name");
        return new LevelPlayReward(name, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return OooOo.OooO00o(this.f13165a, levelPlayReward.f13165a) && this.f13166b == levelPlayReward.f13166b;
    }

    public final int getAmount() {
        return this.f13166b;
    }

    public final String getName() {
        return this.f13165a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13166b) + (this.f13165a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LevelPlayReward(name=");
        sb.append(this.f13165a);
        sb.append(", amount=");
        return OooO0oO.OooOo.OooOOO0(sb, this.f13166b, ')');
    }
}
