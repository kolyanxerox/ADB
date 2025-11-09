package com.unity3d.mediation.interstitial;

import android.app.Activity;
import com.ironsource.C2992c2;
import com.ironsource.C3113fd;
import com.ironsource.C3192hm;
import com.ironsource.C3296km;
import com.ironsource.C3349m1;
import com.ironsource.C3495on;
import com.ironsource.C3697tf;
import com.ironsource.InterfaceC3621s9;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class LevelPlayInterstitialAd {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f13161a;

    /* renamed from: b */
    private final C3296km f13162b;

    public static final class Companion {
        private Companion() {
        }

        public final boolean isPlacementCapped(String placementName) {
            OooOo.OooO0o0(placementName, "placementName");
            return C3192hm.f8886n.m9207a(placementName, LevelPlay.AdFormat.INTERSTITIAL);
        }

        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }
    }

    public static final class Config implements C3192hm.b {
        public static final Companion Companion = new Companion(null);

        /* renamed from: a */
        private final Double f13163a;

        public static final class Builder {

            /* renamed from: a */
            private Double f13164a;

            public final Config build() {
                return new Config(this.f13164a);
            }

            public final Builder setBidFloor(double d) {
                this.f13164a = Double.valueOf(d);
                return this;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public final Config empty() {
                return new Config(null);
            }

            public /* synthetic */ Companion(OooOO0O oooOO0O) {
                this();
            }
        }

        public Config(Double d) {
            this.f13163a = d;
        }

        public static /* synthetic */ Config copy$default(Config config, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = config.f13163a;
            }
            return config.copy(d);
        }

        public final Double component1() {
            return this.f13163a;
        }

        public final Config copy(Double d) {
            return new Config(d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && OooOo.OooO00o(this.f13163a, ((Config) obj).f13163a);
        }

        @Override // com.ironsource.C3192hm.b
        public Double getBidFloor() {
            return this.f13163a;
        }

        public int hashCode() {
            Double d = this.f13163a;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        public String toString() {
            return "Config(bidFloor=" + this.f13163a + ')';
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(String adUnitId) {
        this(adUnitId, Config.Companion.empty());
        OooOo.OooO0o0(adUnitId, "adUnitId");
    }

    public static final boolean isPlacementCapped(String str) {
        return Companion.isPlacementCapped(str);
    }

    public static /* synthetic */ void showAd$default(LevelPlayInterstitialAd levelPlayInterstitialAd, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        levelPlayInterstitialAd.showAd(activity, str);
    }

    public final String getAdId() {
        return this.f13162b.m9688b();
    }

    public final String getAdUnitId() {
        return this.f13161a;
    }

    public final boolean isAdReady() {
        return this.f13162b.m9689c();
    }

    public final void loadAd() {
        this.f13162b.m9690d();
    }

    public final void setListener(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        this.f13162b.m9687a(levelPlayInterstitialAdListener);
    }

    public final void showAd(Activity activity) {
        OooOo.OooO0o0(activity, "activity");
        showAd$default(this, activity, null, 2, null);
    }

    public LevelPlayInterstitialAd(String adUnitId, C3192hm.c payload) {
        OooOo.OooO0o0(adUnitId, "adUnitId");
        OooOo.OooO0o0(payload, "payload");
        IronLog ironLog = IronLog.API;
        StringBuilder sbOooOoO0 = OooO0oO.OooOo.OooOoO0("adUnitId: ", adUnitId, ", config: ");
        sbOooOoO0.append(payload.m9210c());
        ironLog.info(sbOooOoO0.toString());
        this.f13161a = adUnitId;
        this.f13162b = new C3296km(adUnitId, payload.m9210c(), payload.m9209b(), payload.m9208a(), payload.m9213f(), payload.m9211d(), payload.m9212e());
    }

    public final void showAd(Activity activity, String str) {
        OooOo.OooO0o0(activity, "activity");
        this.f13162b.m9686a(activity, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInterstitialAd(String adUnitId, Config config) {
        this(adUnitId, new C3192hm.c(new C3349m1(IronSource.AD_UNIT.INTERSTITIAL, C2992c2.b.MEDIATION), new C3113fd(), C3495on.f10667s.m11213d(), new InterfaceC3621s9.a(), C3697tf.f12051a, config));
        OooOo.OooO0o0(adUnitId, "adUnitId");
        OooOo.OooO0o0(config, "config");
    }
}
