package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* renamed from: com.ironsource.t7 */
/* loaded from: classes2.dex */
public final class C3689t7 implements InterfaceC2993c3 {

    /* renamed from: a */
    private final C3725u8 f12034a;

    /* renamed from: b */
    private final C3092er f12035b;

    /* renamed from: c */
    private final IronSource.AD_UNIT f12036c;

    /* renamed from: com.ironsource.t7$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12037a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12037a = iArr;
        }
    }

    public C3689t7(C3725u8 adFormatConfigurations, C3092er c3092er, IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormatConfigurations, "adFormatConfigurations");
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        this.f12034a = adFormatConfigurations;
        this.f12035b = c3092er;
        this.f12036c = adFormat;
    }

    @Override // com.ironsource.InterfaceC2993c3
    /* renamed from: a */
    public InterfaceC3009cj mo8082a(InterfaceC2947ar providerName) {
        NetworkSettings networkSettingsM8546b;
        C2983bs c2983bsM12637f;
        kotlin.jvm.internal.OooOo.OooO0o0(providerName, "providerName");
        C3092er c3092er = this.f12035b;
        if (c3092er == null || (networkSettingsM8546b = c3092er.m8546b(providerName.value())) == null) {
            return null;
        }
        int i = a.f12037a[this.f12036c.ordinal()];
        if (i == 1) {
            C3723u6 c3723u6M12634c = this.f12034a.m12634c();
            if (c3723u6M12634c != null) {
                return new C3894z6(new C2629a3(networkSettingsM8546b, networkSettingsM8546b.getBannerSettings(), this.f12036c), c3723u6M12634c);
            }
            return null;
        }
        if (i != 2) {
            if (i == 3 && (c2983bsM12637f = this.f12034a.m12637f()) != null) {
                return new C3499or(new C2629a3(networkSettingsM8546b, networkSettingsM8546b.getRewardedVideoSettings(), this.f12036c), c2983bsM12637f);
            }
            return null;
        }
        C3736uj c3736ujM12635d = this.f12034a.m12635d();
        if (c3736ujM12635d != null) {
            return new C3839xj(new C2629a3(networkSettingsM8546b, networkSettingsM8546b.getInterstitialSettings(), this.f12036c), c3736ujM12635d);
        }
        return null;
    }
}
