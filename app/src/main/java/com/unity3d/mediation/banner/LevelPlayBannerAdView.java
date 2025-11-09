package com.unity3d.mediation.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.ironsource.C3423ml;
import com.ironsource.C3697tf;
import com.ironsource.C3792w6;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import oo00o.OooOO0;

/* loaded from: classes3.dex */
public final class LevelPlayBannerAdView extends FrameLayout {

    /* renamed from: a */
    private final C3423ml f13152a;

    public static final class Config {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final LevelPlayAdSize f13153a;

        /* renamed from: b */
        private final Double f13154b;

        /* renamed from: c */
        private final String f13155c;

        public static final class Builder {

            /* renamed from: a */
            private LevelPlayAdSize f13156a;

            /* renamed from: b */
            private Double f13157b;

            /* renamed from: c */
            private String f13158c;

            public final Config build() {
                return new Config(this.f13156a, this.f13157b, this.f13158c);
            }

            public final Builder setAdSize(LevelPlayAdSize adSize) {
                OooOo.OooO0o0(adSize, "adSize");
                this.f13156a = adSize;
                return this;
            }

            public final Builder setBidFloor(double d) {
                this.f13157b = Double.valueOf(d);
                return this;
            }

            public final Builder setPlacementName(String placementName) {
                OooOo.OooO0o0(placementName, "placementName");
                this.f13158c = placementName;
                return this;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public final Config empty() {
                return new Config(null, null, null, 7, null);
            }

            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Config copy$default(Config config, LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                levelPlayAdSize = config.f13153a;
            }
            if ((i & 2) != 0) {
                d = config.f13154b;
            }
            if ((i & 4) != 0) {
                str = config.f13155c;
            }
            return config.copy(levelPlayAdSize, d, str);
        }

        public final LevelPlayAdSize component1() {
            return this.f13153a;
        }

        public final Double component2() {
            return this.f13154b;
        }

        public final String component3() {
            return this.f13155c;
        }

        public final Config copy(LevelPlayAdSize levelPlayAdSize, Double d, String str) {
            return new Config(levelPlayAdSize, d, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return OooOo.OooO00o(this.f13153a, config.f13153a) && OooOo.OooO00o(this.f13154b, config.f13154b) && OooOo.OooO00o(this.f13155c, config.f13155c);
        }

        public final LevelPlayAdSize getAdSize() {
            return this.f13153a;
        }

        public final Double getBidFloor() {
            return this.f13154b;
        }

        public final String getPlacementName() {
            return this.f13155c;
        }

        public int hashCode() {
            LevelPlayAdSize levelPlayAdSize = this.f13153a;
            int iHashCode = (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode()) * 31;
            Double d = this.f13154b;
            int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
            String str = this.f13155c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Config(adSize=");
            sb.append(this.f13153a);
            sb.append(", bidFloor=");
            sb.append(this.f13154b);
            sb.append(", placementName=");
            return OooO00o.OooO0oO(')', this.f13155c, sb);
        }

        public Config(LevelPlayAdSize levelPlayAdSize, Double d, String str) {
            this.f13153a = levelPlayAdSize;
            this.f13154b = d;
            this.f13155c = str;
        }

        public /* synthetic */ Config(LevelPlayAdSize levelPlayAdSize, Double d, String str, int i, OooOO0O oooOO0O) {
            this((i & 1) != 0 ? null : levelPlayAdSize, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context) {
        this(context, null, 0, 6, null);
        OooOo.OooO0o0(context, "context");
    }

    /* renamed from: a */
    private final C3423ml m13453a(String str, Config config) {
        Context context = getContext();
        OooOo.OooO0Oo(context, "context");
        C3792w6 c3792w6M13454a = m13454a(context);
        addView(c3792w6M13454a);
        return new C3423ml(C3697tf.f12051a.m12424a(), str, c3792w6M13454a, config, null, 16, null);
    }

    public final void destroy() {
        this.f13152a.m10849b();
    }

    public final String getAdId() {
        String string = this.f13152a.m10851c().toString();
        OooOo.OooO0Oo(string, "bannerViewInternal.adId.toString()");
        return string;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.f13152a.m10853d();
    }

    public final String getAdUnitId() {
        return this.f13152a.m10855e();
    }

    public final LevelPlayBannerAdViewListener getBannerListener() {
        return this.f13152a.m10857f();
    }

    public final String getPlacementName() {
        return this.f13152a.m10858g();
    }

    public final void loadAd() {
        this.f13152a.m10859i();
    }

    public final void pauseAutoRefresh() {
        this.f13152a.m10860j();
    }

    public final void resumeAutoRefresh() {
        this.f13152a.m10861k();
    }

    public final void setAdSize(LevelPlayAdSize adSize) {
        OooOo.OooO0o0(adSize, "adSize");
        this.f13152a.m10846a(adSize);
    }

    public final void setBannerListener(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        this.f13152a.m10847a(levelPlayBannerAdViewListener);
    }

    public final void setPlacementName(String str) {
        C3423ml c3423ml = this.f13152a;
        if (str == null) {
            str = "";
        }
        c3423ml.m10848a(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        OooOo.OooO0o0(context, "context");
    }

    /* renamed from: a */
    private final C3792w6 m13454a(Context context) {
        C3792w6 c3792w6 = new C3792w6(context);
        c3792w6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c3792w6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooOo.OooO0o0(context, "context");
        IronLog.API.info("context: ".concat(context.getClass().getSimpleName()));
        OooOO0 oooOO0M10862a = C3423ml.f10292n.m10862a(context, attributeSet);
        this.f13152a = m13453a((String) oooOO0M10862a.f33185OooOo0O, (Config) oooOO0M10862a.f33186OooOo0o);
    }

    public /* synthetic */ LevelPlayBannerAdView(Context context, AttributeSet attributeSet, int i, int i2, OooOO0O oooOO0O) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId) {
        this(context, adUnitId, Config.Companion.empty());
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(adUnitId, "adUnitId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBannerAdView(Context context, String adUnitId, Config config) {
        super(context);
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(adUnitId, "adUnitId");
        OooOo.OooO0o0(config, "config");
        IronLog.API.info("adUnitId: " + adUnitId + ", config: " + config + ", context: " + context.getClass().getSimpleName());
        this.f13152a = m13453a(adUnitId, config);
    }
}
