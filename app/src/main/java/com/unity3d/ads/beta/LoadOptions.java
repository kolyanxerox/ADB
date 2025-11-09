package com.unity3d.ads.beta;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.o00oO0o;

/* loaded from: classes2.dex */
public final class LoadOptions {
    private final String adMarkup;
    private final Map<String, String> extras;
    private final String placementId;

    public static final class Builder {
        private String adMarkup;
        private final Map<String, String> extras;
        private final String placementId;

        public Builder(String placementId) {
            OooOo.OooO0o0(placementId, "placementId");
            this.placementId = placementId;
            this.extras = new LinkedHashMap();
        }

        public final LoadOptions build() {
            return new LoadOptions(this.placementId, this.adMarkup, this.extras);
        }

        public final Builder withAdMarkup(String adMarkup) {
            OooOo.OooO0o0(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        public final Builder withExtras(Map<String, String> extras) {
            OooOo.OooO0o0(extras, "extras");
            this.extras.putAll(extras);
            return this;
        }
    }

    public LoadOptions(String placementId, String str, Map<String, String> extras) {
        OooOo.OooO0o0(placementId, "placementId");
        OooOo.OooO0o0(extras, "extras");
        this.placementId = placementId;
        this.adMarkup = str;
        this.extras = extras;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ LoadOptions(String str, String str2, Map map, int i, OooOO0O oooOO0O) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? o00oO0o.f31247OooOo0O : map);
    }
}
