package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ironsource.o1 */
/* loaded from: classes2.dex */
public final class C3473o1 {

    /* renamed from: a */
    private final HashMap<String, C3544q2> f10589a = new HashMap<>();

    /* renamed from: com.ironsource.o1$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    /* renamed from: a */
    public final C3544q2 m11068a(String adUnitId, List<? extends NetworkSettings> providers, int i) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnitId, "adUnitId");
        kotlin.jvm.internal.OooOo.OooO0o0(providers, "providers");
        C3544q2 c3544q2 = this.f10589a.get(adUnitId);
        if (c3544q2 != null) {
            return c3544q2;
        }
        C3544q2 c3544q22 = new C3544q2(providers, i);
        this.f10589a.put(adUnitId, c3544q22);
        return c3544q22;
    }
}
