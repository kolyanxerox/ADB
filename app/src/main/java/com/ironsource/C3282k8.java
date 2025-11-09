package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.k8 */
/* loaded from: classes2.dex */
public final class C3282k8 {

    /* renamed from: com.ironsource.k8$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9248a;

        static {
            int[] iArr = new int[EnumC3515p8.values().length];
            try {
                iArr[EnumC3515p8.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3515p8.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3515p8.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9248a = iArr;
        }
    }

    /* renamed from: a */
    public final int m9655a(EnumC3515p8 cappingType) {
        kotlin.jvm.internal.OooOo.OooO0o0(cappingType, "cappingType");
        int i = a.f9248a[cappingType.ordinal()];
        if (i == 1 || i == 2) {
            return 3000;
        }
        if (i == 3) {
            return IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED;
        }
        throw new OooOOO0.OooO00o();
    }
}
