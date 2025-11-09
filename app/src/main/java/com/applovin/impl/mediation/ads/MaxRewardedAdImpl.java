package com.applovin.impl.mediation.ads;

import android.content.Context;
import com.applovin.impl.AbstractC1168q2;
import com.applovin.impl.C0993c2;
import com.applovin.impl.C1302z2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.C1220k;
import com.applovin.impl.sdk.C1240o;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* loaded from: classes.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    /* renamed from: com.applovin.impl.mediation.ads.MaxRewardedAdImpl$b */
    public class C1117b extends MaxFullscreenAdImpl.C1111b implements MaxRewardedAdListener {
        private C1117b() {
            super();
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1111b, com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MaxRewardedAdImpl.this.m1671a((C1302z2) maxAd, maxError);
            super.onAdDisplayFailed(maxAd, maxError);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1111b, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxRewardedAdImpl.this.m1671a((C1302z2) maxAd, (MaxError) null);
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C1240o c1240o = MaxRewardedAdImpl.this.logger;
            if (C1240o.m3200a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                C1240o c1240o2 = maxRewardedAdImpl.logger;
                String str = maxRewardedAdImpl.tag;
                StringBuilder sb = new StringBuilder("MaxRewardedAdListener.onUserRewarded(ad=");
                sb.append(maxAd);
                sb.append(", reward=");
                sb.append(maxReward);
                sb.append("), listener=");
                androidx.datastore.preferences.protobuf.OooO00o.OooOoo0(sb, MaxRewardedAdImpl.this.adListener, c1240o2, str);
            }
            AbstractC1168q2.m2167a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.InterfaceC1110a interfaceC1110a, String str2, C1220k c1220k, Context context) {
        super(str, maxAdFormat, interfaceC1110a, str2, c1220k, context);
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl
    public MaxFullscreenAdImpl.C1111b createAdListenerWrapper() {
        return new C1117b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m1671a(C1302z2 c1302z2, MaxError maxError) {
        if (c1302z2.m3857n0().get() || !c1302z2.m3859p0().compareAndSet(false, true)) {
            return;
        }
        if (C1240o.m3200a()) {
            this.logger.m3211a(this.tag, "User not rewarded for ad: " + c1302z2 + " with error: " + maxError);
        }
        this.sdk.m2848P().m3596a(C0993c2.f520i0, c1302z2, maxError);
    }
}
