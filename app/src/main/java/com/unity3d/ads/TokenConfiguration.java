package com.unity3d.ads;

import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;

/* loaded from: classes.dex */
public final class TokenConfiguration {
    private final AdFormat adFormat;
    private final Map<String, String> extras;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenConfiguration(AdFormat adFormat) {
        this(adFormat, null, 2, 0 == true ? 1 : 0);
        OooOo.OooO0o0(adFormat, "adFormat");
    }

    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public TokenConfiguration(AdFormat adFormat, Map<String, String> extras) {
        OooOo.OooO0o0(adFormat, "adFormat");
        OooOo.OooO0o0(extras, "extras");
        this.adFormat = adFormat;
        this.extras = extras;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, Map map, int i, OooOO0O oooOO0O) {
        this(adFormat, (i & 2) != 0 ? o00oO0o.f31247OooOo0O : map);
    }
}
