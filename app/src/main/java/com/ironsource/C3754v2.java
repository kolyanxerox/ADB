package com.ironsource;

import com.ironsource.C3451ne;
import com.ironsource.mediationsdk.IronSource;

/* renamed from: com.ironsource.v2 */
/* loaded from: classes2.dex */
public final class C3754v2 {

    /* renamed from: a */
    public static final C3754v2 f12282a = new C3754v2();

    /* renamed from: com.ironsource.v2$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12283a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12283a = iArr;
        }
    }

    private C3754v2() {
    }

    /* renamed from: a */
    public static final C3451ne.a m12730a(IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(adUnit, "adUnit");
        int i = a.f12283a[adUnit.ordinal()];
        if (i == 1) {
            return C3451ne.a.REWARDED_VIDEO;
        }
        if (i == 2) {
            return C3451ne.a.INTERSTITIAL;
        }
        if (i == 3) {
            return C3451ne.a.BANNER;
        }
        if (i == 4) {
            return C3451ne.a.NATIVE_AD;
        }
        throw new OooOOO0.OooO00o();
    }
}
