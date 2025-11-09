package com.ironsource;

import com.ironsource.mediationsdk.IronSource;

/* renamed from: com.ironsource.m3 */
/* loaded from: classes2.dex */
public final class C3351m3 implements InterfaceC3440n3 {

    /* renamed from: a */
    private final IronSource.AD_UNIT f9462a;

    /* renamed from: com.ironsource.m3$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9463a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9463a = iArr;
        }
    }

    public C3351m3(IronSource.AD_UNIT adFormat) {
        kotlin.jvm.internal.OooOo.OooO0o0(adFormat, "adFormat");
        this.f9462a = adFormat;
    }

    @Override // com.ironsource.InterfaceC3440n3
    /* renamed from: a */
    public InterfaceC3475o3 mo9980a(InterfaceC3242j3 eventBaseData) {
        kotlin.jvm.internal.OooOo.OooO0o0(eventBaseData, "eventBaseData");
        int i = a.f9463a[this.f9462a.ordinal()];
        if (i == 1) {
            return new C3701tj(eventBaseData);
        }
        if (i == 2) {
            return new C2948as(eventBaseData);
        }
        if (i == 3) {
            return new C3583r6(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.f9462a);
    }
}
