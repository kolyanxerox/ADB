package com.unity3d.ads.beta;

import java.util.Map;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import oo00o.OooOO0;

/* loaded from: classes2.dex */
public final class BannerLoadOptions {
    private final String adMarkup;
    private final OooOO0 bannerSize;
    private final Map<String, String> extras;
    private final BannerShowListener listener;
    private final String placementId;

    public static final class Builder {
        private String adMarkup;
        private final OooOO0 bannerSize;
        private Map<String, String> extras;
        private BannerShowListener listener;
        private final String placementId;

        public Builder(String placementId, OooOO0 bannerSize) {
            OooOo.OooO0o0(placementId, "placementId");
            OooOo.OooO0o0(bannerSize, "bannerSize");
            this.placementId = placementId;
            this.bannerSize = bannerSize;
        }

        public final BannerLoadOptions build() {
            return new BannerLoadOptions(this.placementId, this.bannerSize, this.adMarkup, this.extras, this.listener);
        }

        public final Builder withAdMarkup(String adMarkup) {
            OooOo.OooO0o0(adMarkup, "adMarkup");
            this.adMarkup = adMarkup;
            return this;
        }

        public final Builder withExtras(Map<String, String> extras) {
            OooOo.OooO0o0(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final Builder withListener(BannerShowListener listener) {
            OooOo.OooO0o0(listener, "listener");
            this.listener = listener;
            return this;
        }
    }

    public BannerLoadOptions(String placementId, OooOO0 bannerSize, String str, Map<String, String> map, BannerShowListener bannerShowListener) {
        OooOo.OooO0o0(placementId, "placementId");
        OooOo.OooO0o0(bannerSize, "bannerSize");
        this.placementId = placementId;
        this.bannerSize = bannerSize;
        this.adMarkup = str;
        this.extras = map;
        this.listener = bannerShowListener;
    }

    public final String getAdMarkup() {
        return this.adMarkup;
    }

    public final OooOO0 getBannerSize() {
        return this.bannerSize;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final BannerShowListener getListener() {
        return this.listener;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public /* synthetic */ BannerLoadOptions(String str, OooOO0 oooOO0, String str2, Map map, BannerShowListener bannerShowListener, int i, OooOO0O oooOO0O) {
        this(str, oooOO0, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : bannerShowListener);
    }
}
