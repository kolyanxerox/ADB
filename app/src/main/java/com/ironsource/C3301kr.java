package com.ironsource;

import com.ironsource.InterfaceC3418mg;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ironsource.kr */
/* loaded from: classes2.dex */
public final class C3301kr implements InterfaceC3418mg, InterfaceC3418mg.a {

    /* renamed from: a */
    private final Map<String, LevelPlayReward> f9271a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, LevelPlayReward> f9272b = new LinkedHashMap();

    /* renamed from: a */
    private final LevelPlayReward m9697a(String str) {
        return this.f9272b.get(str);
    }

    /* renamed from: b */
    private final LevelPlayReward m9698b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f9271a.get(str);
    }

    @Override // com.ironsource.InterfaceC3418mg
    /* renamed from: a */
    public LevelPlayReward mo9699a(String str, String adUnitId) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        LevelPlayReward levelPlayRewardM9698b = m9698b(str);
        return levelPlayRewardM9698b == null ? m9697a(adUnitId) : levelPlayRewardM9698b;
    }

    @Override // com.ironsource.InterfaceC3418mg.a
    /* renamed from: b */
    public void mo9701b(String adUnitId, String rewardName, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        kotlin.jvm.internal.OooOo.OooO0o0(rewardName, "rewardName");
        this.f9272b.put(adUnitId, new LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.InterfaceC3418mg.a
    /* renamed from: a */
    public void mo9700a(String placement, String rewardName, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(placement, "placement");
        kotlin.jvm.internal.OooOo.OooO0o0(rewardName, "rewardName");
        this.f9271a.put(placement, new LevelPlayReward(rewardName, i));
    }
}
