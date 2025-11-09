package com.unity3d.ads.beta;

import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;

/* loaded from: classes2.dex */
public final class ShowOptions {
    private final Map<String, String> extras;

    public ShowOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public ShowOptions(Map<String, String> extras) {
        OooOo.OooO0o0(extras, "extras");
        this.extras = extras;
    }

    public /* synthetic */ ShowOptions(Map map, int i, OooOO0O oooOO0O) {
        this((i & 1) != 0 ? o00oO0o.f31247OooOo0O : map);
    }
}
