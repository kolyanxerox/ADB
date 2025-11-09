package com.unity3d.ads.beta;

import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;

/* loaded from: classes2.dex */
public final class TokenConfiguration {
    private final AdFormat adFormat;
    private final Map<String, String> extras;

    public TokenConfiguration(AdFormat adFormat, Map<String, String> extras) {
        OooOo.OooO0o0(adFormat, "adFormat");
        OooOo.OooO0o0(extras, "extras");
        this.adFormat = adFormat;
        this.extras = extras;
    }

    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, Map map, int i, OooOO0O oooOO0O) {
        this(adFormat, (i & 2) != 0 ? o00oO0o.f31247OooOo0O : map);
    }
}
